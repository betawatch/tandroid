package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements c20 {
    public final /* synthetic */ k7 a;
    public final /* synthetic */ zh.h0 b;
    public final /* synthetic */ cg.b c;
    public final /* synthetic */ TL_stars.TL_starGiftUnique d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_textWithEntities f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ i2(k7 k7Var, zh.h0 h0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z9) {
        this.a = k7Var;
        this.b = h0Var;
        this.c = bVar;
        this.d = tL_starGiftUnique;
        this.e = j3;
        this.f = tL_textWithEntities;
        this.g = z9;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final k7 k7Var = this.a;
        k7Var.c2.setLoading(false);
        final zh.h0 h0Var = this.b;
        if (h0Var != null && h0Var.C1) {
            h0Var.C1 = false;
            h0Var.y1.f(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        h6 h6Var = new h6(this.c, tL_payments_paymentFormStarGift);
        Context context = k7Var.getContext();
        org.telegram.ui.ActionBar.g6 g6Var = k7Var.I0;
        int i7 = k7Var.a;
        String y12 = k7Var.y1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j3 = this.e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f;
        final boolean z9 = this.g;
        new k6(context, g6Var, tL_starGiftUnique, h6Var, i7, j3, y12, false, new v10() { // from class: bi.y2
            @Override // org.telegram.messenger.v10
            public final void a(Object obj2, Object obj3) {
                h6 h6Var2 = (h6) obj2;
                vf.b bVar = (vf.b) obj3;
                bVar.d();
                k7 k7Var2 = k7.this;
                ea x10 = ea.x(k7Var2.a, h6Var2.a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = h6Var2.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j10 = j3;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j10, tL_textWithEntities, z9, new w3(k7Var2, bVar, tL_starGiftUnique2, j10, h0Var, 0));
            }
        }).b();
    }
}
