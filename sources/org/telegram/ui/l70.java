package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l70 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public g00 f;
    public String h;
    public int n;
    public final /* synthetic */ m70 r;

    public l70(m70 m70Var, Context context) {
        this.r = m70Var;
        this.c = context;
        C(true);
    }

    public static void E(l70 l70Var, String str) {
        m70 m70Var = l70Var.r;
        if (m70Var.K) {
            if (TextUtils.isEmpty(str)) {
                m70Var.d.setBackground(null);
            } else {
                m70Var.d.setBackgroundColor(m70Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
        }
        if (l70Var.n != 0) {
            m70Var.getConnectionsManager().cancelRequest(l70Var.n, true);
            l70Var.n = 0;
        }
        g00 g00Var = l70Var.f;
        if (g00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g00Var);
            l70Var.f = null;
        }
        l70Var.h = null;
        int h = l70Var.h();
        if (h > 0) {
            l70Var.d.clear();
            l70Var.e.clear();
            l70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            m70Var.b.setVisibility(8);
            m70Var.b.e(false, true);
            return;
        }
        if (m70Var.b.getVisibility() != 0) {
            m70Var.b.setVisibility(0);
            m70Var.b.e(true, false);
        } else {
            m70Var.b.e(true, true);
        }
        g00 g00Var2 = new g00(10, l70Var, str);
        l70Var.f = g00Var2;
        AndroidUtilities.runOnUIThread(g00Var2, 300L);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return j(l1Var.b()) == 0;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // f2.o0
    public final long i(int i10) {
        if (j(i10) != 0) {
            return -1L;
        }
        ArrayList arrayList = i10 > this.d.size() ? this.e : this.d;
        if (i10 > this.d.size()) {
            i10 = (i10 - this.d.size()) - 1;
        }
        return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.id;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z4 = i10 > this.d.size();
        ArrayList arrayList = z4 ? this.e : this.d;
        if (z4) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) l1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        k8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z4);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        m70 m70Var = this.r;
        org.telegram.ui.ActionBar.f6 resourceProvider = m70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            k8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder l10 = e2.c.l(str3);
            l10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(l10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            k8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = m70Var.r;
        k8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : m70Var.b0(m70Var.v) != null ? m70Var.b0(m70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k8 k8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.j6.B6;
            m70 m70Var = this.r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, i11, 21, 0, 0, false, false, m70Var.getResourceProvider());
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(m70Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            nqVar.w = true;
            m4Var.setBackground(nqVar);
            m4Var.setText(LocaleController.getString(m70Var.K ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            k8Var = m4Var;
        } else {
            org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(context, 3);
            k8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            k8Var = k8Var2;
        }
        k8Var.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.el0(k8Var);
    }
}
