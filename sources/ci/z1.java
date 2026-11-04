package ci;

import android.content.Context;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements u10 {
    public final /* synthetic */ l6 a;
    public final /* synthetic */ ai.i1 b;
    public final /* synthetic */ dg.b c;
    public final /* synthetic */ TL_stars.TL_starGiftUnique d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_textWithEntities f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ z1(l6 l6Var, ai.i1 i1Var, dg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.a = l6Var;
        this.b = i1Var;
        this.c = bVar;
        this.d = tL_starGiftUnique;
        this.e = j10;
        this.f = tL_textWithEntities;
        this.g = z10;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final l6 l6Var = this.a;
        l6Var.d2.setLoading(false);
        final ai.i1 i1Var = this.b;
        if (i1Var != null && i1Var.D1) {
            i1Var.D1 = false;
            i1Var.z1.f(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        l5 l5Var = new l5(this.c, tL_payments_paymentFormStarGift);
        Context context = l6Var.getContext();
        org.telegram.ui.ActionBar.e6 e6Var = l6Var.J0;
        int i3 = l6Var.a;
        String z12 = l6Var.z1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j10 = this.e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f;
        final boolean z10 = this.g;
        new n5(context, e6Var, tL_starGiftUnique, l5Var, i3, j10, z12, false, new n10() { // from class: ci.n2
            @Override // org.telegram.messenger.n10
            public final void a(Object obj2, Object obj3) {
                l5 l5Var2 = (l5) obj2;
                sf.b bVar = (sf.b) obj3;
                bVar.d();
                l6 l6Var2 = l6.this;
                e9 x10 = e9.x(l6Var2.a, l5Var2.a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = l5Var2.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j11 = j10;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j11, tL_textWithEntities, z10, new i3(l6Var2, bVar, tL_starGiftUnique2, j11, i1Var, 0));
            }
        }).b();
    }
}
