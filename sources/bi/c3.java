package bi;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ c3(k7 k7Var, TLObject tLObject, long j3, long j10, c20 c20Var, TLRPC.TL_error tL_error, long j11) {
        this.b = k7Var;
        this.c = tLObject;
        this.d = j3;
        this.e = j10;
        this.n = c20Var;
        this.f = tL_error;
        this.h = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 1;
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.n;
                TLObject tLObject = this.c;
                long j3 = this.d;
                long j10 = this.e;
                long j11 = this.h;
                TLRPC.TL_error tL_error = this.f;
                u1Var.c(400L);
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error == null) {
                            k7Var.k().t(org.telegram.messenger.id.M0(2131743879, null), null).k(false);
                            break;
                        } else {
                            k7Var.k().t(org.telegram.messenger.id.a0(null, null, 2131743878, tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        k7Var.dismiss();
                        ea.y(k7Var.a, false).P(j3);
                        if (j3 < 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", -j3);
                            bundle.putBoolean("start_from_monetization", true);
                            e51 e51Var = new e51(bundle);
                            n0.g(k7Var.a).h(j3, true);
                            n0.g(k7Var.a).l(j3);
                            e51Var.whenFullyVisible(new r3(e51Var, j11, 1));
                            T.presentFragment(e51Var);
                            break;
                        } else {
                            TLRPC.UserFull b22 = qp.s1(k7Var.a).b2(j10);
                            if (b22 != null) {
                                int max = Math.max(0, b22.stargifts_count - 1);
                                b22.stargifts_count = max;
                                if (max <= 0) {
                                    b22.flags2 &= -257;
                                }
                            }
                            ea.y(k7Var.a, false).O();
                            ea.y(k7Var.a, false).S(true);
                            if (!(T instanceof dd)) {
                                dd ddVar = new dd();
                                ddVar.whenFullyVisible(new r3(ddVar, j11, 0));
                                T.presentFragment(ddVar);
                                break;
                            } else {
                                org.telegram.ui.Components.gc.a0(T).I(R.raw.stars_topup, org.telegram.messenger.id.M0(2131750221, null), org.telegram.messenger.id.H(',', "Gift2Converted", (int) j11)).k(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                k7 k7Var2 = this.b;
                TLObject tLObject2 = this.c;
                long j12 = this.d;
                long j13 = this.e;
                c20 c20Var = (c20) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j14 = this.h;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!qp.s1(k7Var2.a).j7) {
                            ea y10 = ea.y(k7Var2.a, false);
                            h4 h4Var = new h4(k7Var2, j14, j12, c20Var, 0);
                            y10.e = false;
                            y10.q(h4Var, false, true);
                            y10.e = true;
                            break;
                        } else {
                            k7Var2.f2.setLoading(false);
                            ea.c0(k7Var2.getContext(), k7Var2.I0);
                            break;
                        }
                    } else {
                        c20Var.a(tL_error2);
                        k7Var2.k().f0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    qp.s1(k7Var2.a).Y3(tL_payments_paymentResult.updates.users, false);
                    qp.s1(k7Var2.a).S3(tL_payments_paymentResult.updates.chats, false);
                    ea.y(k7Var2.a, false).S(false);
                    ea.y(k7Var2.a, false).P(j12);
                    ea.y(k7Var2.a, false).P(j13);
                    ea.y(k7Var2.a, false).O();
                    c20Var.a(null);
                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j12 < 0 || j13 < 0) {
                            org.telegram.ui.Components.bc I = org.telegram.ui.Components.gc.a0(T2).I(R.raw.forward, org.telegram.messenger.id.M0(2131749897, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749898, k7Var2.y1(), org.telegram.messenger.m5.t(j12))));
                            I.t = true;
                            I.j();
                        } else {
                            cn ta2 = cn.ta(j12);
                            ta2.whenFullyVisible(new s3(k7Var2, ta2, j12, 1));
                            T2.presentFragment(ta2);
                        }
                    }
                    Utilities.d.c(new c4(k7Var2, tL_payments_paymentResult, i7));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c3(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.b = k7Var;
        this.n = u1Var;
        this.c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f = tL_error;
    }
}
