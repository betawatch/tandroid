package ai;

import android.content.Context;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cm0;
import org.telegram.ui.el0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements u10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dg.b b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c6(h6 h6Var, org.telegram.ui.ActionBar.s1 s1Var, dg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = h6Var;
        this.f = s1Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                h6 h6Var = (h6) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.s1) this.f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    ci.l5 l5Var = new ci.l5(this.b, tL_payments_paymentFormStarGift);
                    Context context = h6Var.getContext();
                    org.telegram.ui.ActionBar.e6 e6Var = h6Var.J0;
                    int i3 = h6Var.a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String l10 = k2.p1.l(tL_starGiftUnique.num, ',', sb2);
                    long j10 = this.d;
                    new ci.n5(context, e6Var, tL_starGiftUnique, l5Var, i3, j10, l10, true, new d6(h6Var, tL_starGiftUnique, j10, 0)).b();
                    break;
                }
                break;
            default:
                cm0.a0((cm0) this.e, this.b, this.c, this.d, (el0) this.f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ c6(cm0 cm0Var, dg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, el0 el0Var) {
        this.e = cm0Var;
        this.b = bVar;
        this.c = tL_starGiftUnique;
        this.d = j10;
        this.f = el0Var;
    }
}
