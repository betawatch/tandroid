package di;

import android.content.Context;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements x10 {
    public final /* synthetic */ f6 a;
    public final /* synthetic */ bi.k1 b;
    public final /* synthetic */ cg.b c;
    public final /* synthetic */ TL_stars.TL_starGiftUnique d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_textWithEntities f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ r1(f6 f6Var, bi.k1 k1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.a = f6Var;
        this.b = k1Var;
        this.c = bVar;
        this.d = tL_starGiftUnique;
        this.e = j3;
        this.f = tL_textWithEntities;
        this.g = z10;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final f6 f6Var = this.a;
        f6Var.g2.setLoading(false);
        final bi.k1 k1Var = this.b;
        if (k1Var != null && k1Var.G1) {
            k1Var.G1 = false;
            k1Var.C1.g(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        f5 f5Var = new f5(this.c, tL_payments_paymentFormStarGift);
        Context context = f6Var.getContext();
        org.telegram.ui.ActionBar.h6 h6Var = f6Var.J0;
        int i7 = f6Var.a;
        String E1 = f6Var.E1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j3 = this.e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f;
        final boolean z10 = this.g;
        h5 h5Var = new h5(context, h6Var, tL_starGiftUnique, f5Var, i7, j3, E1, false, new q10() { // from class: di.m2
            @Override // org.telegram.messenger.q10
            public final void a(Object obj2, Object obj3) {
                f5 f5Var2 = (f5) obj2;
                vf.b bVar = (vf.b) obj3;
                bVar.d();
                f6 f6Var2 = f6.this;
                y8 x10 = y8.x(f6Var2.a, f5Var2.a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = f5Var2.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j10 = j3;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j10, tL_textWithEntities, z10, new e3(f6Var2, bVar, tL_starGiftUnique2, j10, k1Var, 0));
            }
        });
        h5Var.o = tL_textWithEntities;
        h5Var.p = z10;
        h5Var.b();
    }
}
