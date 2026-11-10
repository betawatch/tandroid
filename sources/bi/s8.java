package bi;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u80;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ea b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ v10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject w;
    public final /* synthetic */ TLObject x;

    public /* synthetic */ s8(ea eaVar, TLObject tLObject, TLRPC.TL_error tL_error, v10 v10Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = eaVar;
        this.c = tLObject;
        this.d = tL_error;
        this.e = v10Var;
        this.f = context;
        this.h = h6Var;
        this.n = j3;
        this.r = str;
        this.s = j10;
        this.w = tLObject2;
        this.x = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u80 u80Var;
        u80 u80Var2;
        switch (this.a) {
            case 0:
                ea eaVar = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                v10 v10Var = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.h6 h6Var = this.h;
                long j3 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.w;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.x;
                long j10 = this.s;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                org.telegram.ui.Components.gc X = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.gc.X() : org.telegram.ui.Components.gc.a0(Q);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!qp.s1(eaVar.a).j7) {
                            boolean[] zArr = {false};
                            tc tcVar = new tc(context, h6Var, j3, 6, str, new m3(eaVar, zArr, tL_payments_paymentFormStarGift, starGift, j10, v10Var), 0L);
                            tcVar.setOnDismissListener(new t8(v10Var, zArr, 2));
                            tcVar.show();
                            break;
                        } else {
                            v10Var.a(Boolean.FALSE, null);
                            ea.c0(context, h6Var);
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        v10Var.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        v10Var.a(Boolean.FALSE, null);
                        X.Q(R.raw.error, 36, org.telegram.messenger.id.a0(null, null, 2131743878, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).j();
                        break;
                    }
                } else {
                    Utilities.d.c(new p8(eaVar, (TLRPC.TL_payments_paymentResult) tLObject, 4));
                    eaVar.D = false;
                    eaVar.E = true;
                    eaVar.G = 0L;
                    eaVar.U();
                    eaVar.P(j10);
                    eaVar.S(true);
                    v10Var.a(Boolean.TRUE, null);
                    org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(eaVar.a).b();
                    if (b10 != null && b10.a(j10)) {
                        qp.s1(eaVar.a).e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                    }
                    qp.s1(eaVar.a).e7.edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null && (u80Var = launchActivity.v0) != null) {
                        u80Var.c(true);
                        break;
                    }
                }
                break;
            default:
                ea eaVar2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                v10 v10Var2 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.h6 h6Var2 = this.h;
                long j11 = this.n;
                String str2 = this.r;
                long j12 = this.s;
                TLObject tLObject3 = this.w;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.x;
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                org.telegram.ui.Components.gc X2 = (Q2 == null || Q2.visibleDialog != null) ? org.telegram.ui.Components.gc.X() : org.telegram.ui.Components.gc.a0(Q2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!qp.s1(eaVar2.a).j7) {
                            boolean[] zArr2 = {false};
                            tc tcVar2 = new tc(context2, h6Var2, j11, 6, str2, new m3(eaVar2, zArr2, j12, tLObject3, tL_textWithEntities, v10Var2), 0L);
                            tcVar2.setOnDismissListener(new t8(v10Var2, zArr2, 1));
                            tcVar2.show();
                            break;
                        } else {
                            v10Var2.a(Boolean.FALSE, null);
                            ea.c0(context2, h6Var2);
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        v10Var2.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        v10Var2.a(Boolean.FALSE, null);
                        X2.Q(R.raw.error, 36, org.telegram.messenger.id.a0(null, null, 2131743878, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                        break;
                    }
                } else {
                    Utilities.d.c(new p8(eaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, 3));
                    eaVar2.S(true);
                    v10Var2.a(Boolean.TRUE, null);
                    org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(eaVar2.a).b();
                    if (b11 != null && b11.a(j12)) {
                        qp.s1(eaVar2.a).e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                    }
                    qp.s1(eaVar2.a).e7.edit().putBoolean("show_gift_for_" + j12, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.G1;
                    if (launchActivity2 != null && (u80Var2 = launchActivity2.v0) != null) {
                        u80Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ s8(ea eaVar, TLObject tLObject, TLRPC.TL_error tL_error, v10 v10Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.b = eaVar;
        this.c = tLObject;
        this.d = tL_error;
        this.e = v10Var;
        this.f = context;
        this.h = h6Var;
        this.n = j3;
        this.r = str;
        this.w = tL_payments_paymentFormStarGift;
        this.x = starGift;
        this.s = j10;
    }
}
