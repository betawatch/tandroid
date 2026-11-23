package bi;

import android.content.Context;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.jm0;
import org.telegram.ui.ll0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8 implements w10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g8(l8 l8Var, org.telegram.ui.ActionBar.t1 t1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.c = l8Var;
        this.d = t1Var;
        this.e = bVar;
        this.f = tL_starGiftUnique;
        this.b = j3;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                l8 l8Var = (l8) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                cg.b bVar = (cg.b) this.e;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                t1Var.dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    di.f5 f5Var = new di.f5(bVar, tL_payments_paymentFormStarGift);
                    Context context = l8Var.getContext();
                    org.telegram.ui.ActionBar.i6 i6Var = l8Var.J0;
                    int i7 = l8Var.a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String l10 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.b;
                    new di.h5(context, i6Var, tL_starGiftUnique, f5Var, i7, j3, l10, true, new h8(l8Var, tL_starGiftUnique, j3, 0)).b();
                    break;
                }
                break;
            case 1:
                di.f6 f6Var = (di.f6) this.c;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) this.d;
                Long l11 = (Long) this.e;
                f2 f2Var = (f2) this.f;
                f6Var.getClass();
                f6Var.v1(this.b, stargiftdepositpayload, l11.longValue(), (vf.b) obj, f2Var);
                break;
            default:
                jm0.a0((jm0) this.c, (cg.b) this.e, (TL_stars.TL_starGiftUnique) this.f, this.b, (ll0) this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ g8(di.f6 f6Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, Long l10, f2 f2Var) {
        this.c = f6Var;
        this.b = j3;
        this.d = stargiftdepositpayload;
        this.e = l10;
        this.f = f2Var;
    }

    public /* synthetic */ g8(jm0 jm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, ll0 ll0Var) {
        this.c = jm0Var;
        this.e = bVar;
        this.f = tL_starGiftUnique;
        this.b = j3;
        this.d = ll0Var;
    }
}
