package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ cg.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jl0(hm0 hm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, il0 il0Var) {
        this.e = hm0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
        this.f = il0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                hm0.a0((hm0) this.e, this.b, this.c, this.d, (il0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                zh.k3 k3Var = (zh.k3) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.u1) this.f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    bi.h6 h6Var = new bi.h6(this.b, tL_payments_paymentFormStarGift);
                    Context context = k3Var.getContext();
                    org.telegram.ui.ActionBar.f6 f6Var = k3Var.I0;
                    int i7 = k3Var.a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String m10 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.d;
                    new bi.k6(context, f6Var, tL_starGiftUnique, h6Var, i7, j3, m10, true, new bi.mc(k3Var, tL_starGiftUnique, j3, 2)).b();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jl0(zh.k3 k3Var, org.telegram.ui.ActionBar.u1 u1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = k3Var;
        this.f = u1Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
    }
}
