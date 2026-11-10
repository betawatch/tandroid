package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ cg.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ml0(km0 km0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, ll0 ll0Var) {
        this.e = km0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
        this.f = ll0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                km0.a0((km0) this.e, this.b, this.c, this.d, (ll0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
            default:
                zh.l3 l3Var = (zh.l3) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.u1) this.f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    bi.h6 h6Var = new bi.h6(this.b, tL_payments_paymentFormStarGift);
                    Context context = l3Var.getContext();
                    org.telegram.ui.ActionBar.h6 h6Var2 = l3Var.I0;
                    int i7 = l3Var.a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String m10 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.d;
                    new bi.k6(context, h6Var2, tL_starGiftUnique, h6Var, i7, j3, m10, true, new bi.mc(l3Var, tL_starGiftUnique, j3, 2)).b();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ml0(zh.l3 l3Var, org.telegram.ui.ActionBar.u1 u1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = l3Var;
        this.f = u1Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
    }
}
