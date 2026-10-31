package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j60 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public xs f;
    public String h;
    public int n;
    public final /* synthetic */ k60 r;

    public j60(k60 k60Var, Context context) {
        this.r = k60Var;
        this.c = context;
        C(true);
    }

    public static void E(j60 j60Var, String str) {
        k60 k60Var = j60Var.r;
        if (k60Var.N) {
            if (TextUtils.isEmpty(str)) {
                k60Var.d.setBackground(null);
            } else {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, k60Var.d, k60Var.getResourceProvider());
            }
        }
        if (j60Var.n != 0) {
            k60Var.getConnectionsManager().cancelRequest(j60Var.n, true);
            j60Var.n = 0;
        }
        xs xsVar = j60Var.f;
        if (xsVar != null) {
            org.telegram.messenger.i0.r(xsVar);
            j60Var.f = null;
        }
        j60Var.h = null;
        int b10 = j60Var.b();
        if (b10 > 0) {
            j60Var.d.clear();
            j60Var.e.clear();
            j60Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            k60Var.b.setVisibility(8);
            k60Var.b.e(false, true);
            return;
        }
        if (k60Var.b.getVisibility() != 0) {
            k60Var.b.setVisibility(0);
            k60Var.b.e(true, false);
        } else {
            k60Var.b.e(true, true);
        }
        xs xsVar2 = new xs(28, j60Var, str);
        j60Var.f = xsVar2;
        org.telegram.messenger.i0.h3(xsVar2, 300L);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return d(c1Var.b()) == 0;
    }

    @Override // s4.g0
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // s4.g0
    public final long c(int i10) {
        if (d(i10) != 0) {
            return -1L;
        }
        ArrayList arrayList = i10 > this.d.size() ? this.e : this.d;
        if (i10 > this.d.size()) {
            i10 = (i10 - this.d.size()) - 1;
        }
        return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.id;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (d(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) c1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        k8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        k60 k60Var = this.r;
        org.telegram.ui.ActionBar.p6 resourceProvider = k60Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            k8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder t10 = a1.g.t(str3);
            t10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(t10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            k8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = k60Var.r;
        k8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : k60Var.f0(k60Var.w) != null ? k60Var.f0(k60Var.w).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k8 k8Var;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.t6.B6;
            k60 k60Var = this.r;
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(this.c, i11, 21, 0, 0, false, false, k60Var.getResourceProvider());
            p4Var.setText(org.telegram.messenger.cd.L0(k60Var.N ? 2131752119 : 2131752118, null));
            k8Var = p4Var;
        } else {
            org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(this.c, 3);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, k8Var2, null);
            k8Var = k8Var2;
        }
        k8Var.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.ck0(k8Var);
    }
}
