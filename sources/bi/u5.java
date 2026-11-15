package bi;

import android.content.Context;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.im0;
import org.telegram.ui.kl0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements z10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ cg.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u5(z5 z5Var, org.telegram.ui.ActionBar.t1 t1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = z5Var;
        this.f = t1Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                z5 z5Var = (z5) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.t1) this.f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    di.c5 c5Var = new di.c5(this.b, tL_payments_paymentFormStarGift);
                    Context context = z5Var.getContext();
                    org.telegram.ui.ActionBar.e6 e6Var = z5Var.J0;
                    int i7 = z5Var.a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String l10 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.d;
                    new di.e5(context, e6Var, tL_starGiftUnique, c5Var, i7, j3, l10, true, new v5(z5Var, tL_starGiftUnique, j3, 0)).b();
                    break;
                }
                break;
            default:
                im0.a0((im0) this.e, this.b, this.c, this.d, (kl0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ u5(im0 im0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, kl0 kl0Var) {
        this.e = im0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j3;
        this.f = kl0Var;
    }
}
