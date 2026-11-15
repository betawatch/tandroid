package di;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ k2(c6 c6Var, TLObject tLObject, long j3, long j10, z10 z10Var, TLRPC.TL_error tL_error, long j11) {
        this.b = c6Var;
        this.c = tLObject;
        this.d = j3;
        this.e = j10;
        this.n = z10Var;
        this.f = tL_error;
        this.h = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 1;
        switch (this.a) {
            case 0:
                c6 c6Var = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.n;
                TLObject tLObject = this.c;
                long j3 = this.d;
                long j10 = this.e;
                long j11 = this.h;
                TLRPC.TL_error tL_error = this.f;
                t1Var.c(400L);
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error == null) {
                            c6Var.k().t(hd.M0(2131743879, null), null).k(false);
                            break;
                        } else {
                            c6Var.k().t(hd.a0(null, null, 2131743878, tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        c6Var.dismiss();
                        v8.y(c6Var.a, false).P(j3);
                        if (j3 < 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", -j3);
                            bundle.putBoolean("start_from_monetization", true);
                            z41 z41Var = new z41(bundle);
                            e0.g(c6Var.a).h(j3, true);
                            e0.g(c6Var.a).l(j3);
                            z41Var.whenFullyVisible(new x2(z41Var, j11, 1));
                            T.presentFragment(z41Var);
                            break;
                        } else {
                            TLRPC.UserFull b22 = np.s1(c6Var.a).b2(j10);
                            if (b22 != null) {
                                int max = Math.max(0, b22.stargifts_count - 1);
                                b22.stargifts_count = max;
                                if (max <= 0) {
                                    b22.flags2 &= -257;
                                }
                            }
                            v8.y(c6Var.a, false).O();
                            v8.y(c6Var.a, false).S(true);
                            if (!(T instanceof mb)) {
                                mb mbVar = new mb();
                                mbVar.whenFullyVisible(new x2(mbVar, j11, 0));
                                T.presentFragment(mbVar);
                                break;
                            } else {
                                org.telegram.ui.Components.cc.a0(T).I(R.raw.stars_topup, hd.M0(2131750221, null), hd.H(',', "Gift2Converted", (int) j11)).k(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                c6 c6Var2 = this.b;
                TLObject tLObject2 = this.c;
                long j12 = this.d;
                long j13 = this.e;
                z10 z10Var = (z10) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j14 = this.h;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!np.s1(c6Var2.a).k7) {
                            v8 y10 = v8.y(c6Var2.a, false);
                            d3.e0 e0Var = new d3.e0(c6Var2, j14, j12, z10Var, 1);
                            y10.e = false;
                            y10.q(e0Var, false, true);
                            y10.e = true;
                            break;
                        } else {
                            c6Var2.g2.setLoading(false);
                            v8.c0(c6Var2.getContext(), c6Var2.J0);
                            break;
                        }
                    } else {
                        z10Var.a(tL_error2);
                        c6Var2.k().f0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    np.s1(c6Var2.a).Y3(tL_payments_paymentResult.updates.users, false);
                    np.s1(c6Var2.a).S3(tL_payments_paymentResult.updates.chats, false);
                    v8.y(c6Var2.a, false).S(false);
                    v8.y(c6Var2.a, false).P(j12);
                    v8.y(c6Var2.a, false).P(j13);
                    v8.y(c6Var2.a, false).O();
                    z10Var.a(null);
                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j12 < 0 || j13 < 0) {
                            org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(T2).I(R.raw.forward, hd.M0(2131749897, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749898, c6Var2.z1(), org.telegram.messenger.m5.t(j12))));
                            I.t = true;
                            I.j();
                        } else {
                            an ua2 = an.ua(j12);
                            ua2.whenFullyVisible(new y2(c6Var2, ua2, j12, 1));
                            T2.presentFragment(ua2);
                        }
                    }
                    Utilities.d.c(new e3(c6Var2, tL_payments_paymentResult, i7));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k2(c6 c6Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.b = c6Var;
        this.n = t1Var;
        this.c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f = tL_error;
    }
}
