package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lm0;
import org.telegram.ui.nl0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements x10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e8(j8 j8Var, org.telegram.ui.ActionBar.t1 t1Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.c = j8Var;
        this.d = t1Var;
        this.e = bVar;
        this.f = tL_starGiftUnique;
        this.b = j3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                j8 j8Var = (j8) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                cg.b bVar = (cg.b) this.e;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                t1Var.dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    di.f5 f5Var = new di.f5(bVar, tL_payments_paymentFormStarGift);
                    Context context = j8Var.getContext();
                    org.telegram.ui.ActionBar.h6 h6Var = j8Var.J0;
                    int i7 = j8Var.a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String l10 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
                    long j3 = this.b;
                    new di.h5(context, h6Var, tL_starGiftUnique, f5Var, i7, j3, l10, true, new f8(j8Var, tL_starGiftUnique, j3, 0)).b();
                    break;
                }
                break;
            case 1:
                di.f6 f6Var = (di.f6) this.c;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) this.d;
                Long l11 = (Long) this.e;
                e2 e2Var = (e2) this.f;
                f6Var.getClass();
                f6Var.v1(this.b, stargiftdepositpayload, l11.longValue(), (vf.b) obj, e2Var);
                break;
            default:
                lm0.a0((lm0) this.c, (cg.b) this.e, (TL_stars.TL_starGiftUnique) this.f, this.b, (nl0) this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                break;
        }
    }

    public /* synthetic */ e8(di.f6 f6Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, Long l10, e2 e2Var) {
        this.c = f6Var;
        this.b = j3;
        this.d = stargiftdepositpayload;
        this.e = l10;
        this.f = e2Var;
    }

    public /* synthetic */ e8(lm0 lm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, nl0 nl0Var) {
        this.c = lm0Var;
        this.e = bVar;
        this.f = tL_starGiftUnique;
        this.b = j3;
        this.d = nl0Var;
    }
}
