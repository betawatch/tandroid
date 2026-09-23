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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class p70 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public hw f;
    public String h;
    public int n;
    public final /* synthetic */ q70 r;

    public p70(q70 q70Var, Context context) {
        this.r = q70Var;
        this.c = context;
        C(true);
    }

    public static void E(p70 p70Var, String str) {
        q70 q70Var = p70Var.r;
        if (q70Var.N) {
            if (TextUtils.isEmpty(str)) {
                q70Var.d.setBackground(null);
            } else {
                q70Var.d.setBackgroundColor(q70Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            }
        }
        if (p70Var.n != 0) {
            q70Var.getConnectionsManager().cancelRequest(p70Var.n, true);
            p70Var.n = 0;
        }
        hw hwVar = p70Var.f;
        if (hwVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hwVar);
            p70Var.f = null;
        }
        p70Var.h = null;
        int h = p70Var.h();
        if (h > 0) {
            p70Var.d.clear();
            p70Var.e.clear();
            p70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            q70Var.b.setVisibility(8);
            q70Var.b.e(false, true);
            return;
        }
        if (q70Var.b.getVisibility() != 0) {
            q70Var.b.setVisibility(0);
            q70Var.b.e(true, false);
        } else {
            q70Var.b.e(true, true);
        }
        hw hwVar2 = new hw(22, p70Var, str);
        p70Var.f = hwVar2;
        AndroidUtilities.runOnUIThread(hwVar2, 300L);
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return j(c1Var.b()) == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) c1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        n8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        q70 q70Var = this.r;
        org.telegram.ui.ActionBar.d6 resourceProvider = q70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            n8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder v = a4.a.v(str3);
            v.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(v.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            n8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = q70Var.r;
        n8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : q70Var.b0(q70Var.v) != null ? q70Var.b0(q70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.h6.B6;
            q70 q70Var = this.r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, i11, 21, 0, 0, false, false, q70Var.getResourceProvider());
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(q70Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            qqVar.w = true;
            m4Var.setBackground(qqVar);
            m4Var.setText(LocaleController.getString(q70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            n8Var = m4Var;
        } else {
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context, 3);
            n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            n8Var = n8Var2;
        }
        n8Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.wk0(n8Var);
    }
}
