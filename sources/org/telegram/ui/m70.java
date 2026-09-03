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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m70 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public z10 f;
    public String h;
    public int n;
    public final /* synthetic */ n70 r;

    public m70(n70 n70Var, Context context) {
        this.r = n70Var;
        this.c = context;
        C(true);
    }

    public static void E(m70 m70Var, String str) {
        n70 n70Var = m70Var.r;
        if (n70Var.K) {
            if (TextUtils.isEmpty(str)) {
                n70Var.d.setBackground(null);
            } else {
                n70Var.d.setBackgroundColor(n70Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
        }
        if (m70Var.n != 0) {
            n70Var.getConnectionsManager().cancelRequest(m70Var.n, true);
            m70Var.n = 0;
        }
        z10 z10Var = m70Var.f;
        if (z10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z10Var);
            m70Var.f = null;
        }
        m70Var.h = null;
        int h = m70Var.h();
        if (h > 0) {
            m70Var.d.clear();
            m70Var.e.clear();
            m70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            n70Var.b.setVisibility(8);
            n70Var.b.e(false, true);
            return;
        }
        if (n70Var.b.getVisibility() != 0) {
            n70Var.b.setVisibility(0);
            n70Var.b.e(true, false);
        } else {
            n70Var.b.e(true, true);
        }
        z10 z10Var2 = new z10(8, m70Var, str);
        m70Var.f = z10Var2;
        AndroidUtilities.runOnUIThread(z10Var2, 300L);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return j(m1Var.b()) == 0;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z4 = i10 > this.d.size();
        ArrayList arrayList = z4 ? this.e : this.d;
        if (z4) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) m1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        k8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z4);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        n70 n70Var = this.r;
        org.telegram.ui.ActionBar.g6 resourceProvider = n70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.k6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            k8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder l10 = e2.c.l(str3);
            l10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(l10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.k6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            k8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = n70Var.r;
        k8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : n70Var.b0(n70Var.v) != null ? n70Var.b0(n70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k8 k8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.k6.B6;
            n70 n70Var = this.r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, i11, 21, 0, 0, false, false, n70Var.getResourceProvider());
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(n70Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7)), org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
            pqVar.w = true;
            m4Var.setBackground(pqVar);
            m4Var.setText(LocaleController.getString(n70Var.K ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            k8Var = m4Var;
        } else {
            org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(context, 3);
            k8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            k8Var = k8Var2;
        }
        k8Var.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.el0(k8Var);
    }
}
