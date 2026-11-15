package di;

import android.content.Context;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements z10 {
    public final /* synthetic */ c6 a;
    public final /* synthetic */ bi.f1 b;
    public final /* synthetic */ cg.b c;
    public final /* synthetic */ TL_stars.TL_starGiftUnique d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_textWithEntities f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ t1(c6 c6Var, bi.f1 f1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.a = c6Var;
        this.b = f1Var;
        this.c = bVar;
        this.d = tL_starGiftUnique;
        this.e = j3;
        this.f = tL_textWithEntities;
        this.g = z10;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final c6 c6Var = this.a;
        c6Var.g2.setLoading(false);
        final bi.f1 f1Var = this.b;
        if (f1Var != null && f1Var.G1) {
            f1Var.G1 = false;
            f1Var.C1.g(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        c5 c5Var = new c5(this.c, tL_payments_paymentFormStarGift);
        Context context = c6Var.getContext();
        org.telegram.ui.ActionBar.e6 e6Var = c6Var.J0;
        int i7 = c6Var.a;
        String z12 = c6Var.z1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j3 = this.e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f;
        final boolean z10 = this.g;
        new e5(context, e6Var, tL_starGiftUnique, c5Var, i7, j3, z12, false, new s10() { // from class: di.h2
            @Override // org.telegram.messenger.s10
            public final void a(Object obj2, Object obj3) {
                c5 c5Var2 = (c5) obj2;
                vf.b bVar = (vf.b) obj3;
                bVar.d();
                c6 c6Var2 = c6.this;
                v8 x10 = v8.x(c6Var2.a, c5Var2.a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = c5Var2.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j10 = j3;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j10, tL_textWithEntities, z10, new b3(c6Var2, bVar, tL_starGiftUnique2, j10, f1Var, 0));
            }
        }).b();
    }
}
