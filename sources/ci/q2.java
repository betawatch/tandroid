package ci;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r41;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ q2(l6 l6Var, TLObject tLObject, long j10, long j11, u10 u10Var, TLRPC.TL_error tL_error, long j12) {
        this.b = l6Var;
        this.c = tLObject;
        this.d = j10;
        this.e = j11;
        this.n = u10Var;
        this.f = tL_error;
        this.h = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 1;
        switch (this.a) {
            case 0:
                l6 l6Var = this.b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.n;
                TLObject tLObject = this.c;
                long j10 = this.d;
                long j11 = this.e;
                long j12 = this.h;
                TLRPC.TL_error tL_error = this.f;
                s1Var.c(400L);
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error == null) {
                            l6Var.k().t(bd.M0(2131743889, null), null).k(false);
                            break;
                        } else {
                            l6Var.k().t(bd.a0(null, null, 2131743888, tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        l6Var.dismiss();
                        e9.y(l6Var.a, false).P(j10);
                        if (j10 < 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", -j10);
                            bundle.putBoolean("start_from_monetization", true);
                            r41 r41Var = new r41(bundle);
                            i0.g(l6Var.a).h(j10, true);
                            i0.g(l6Var.a).l(j10);
                            r41Var.whenFullyVisible(new e3(r41Var, j12, 1));
                            T.presentFragment(r41Var);
                            break;
                        } else {
                            TLRPC.UserFull b22 = hp.s1(l6Var.a).b2(j11);
                            if (b22 != null) {
                                int max = Math.max(0, b22.stargifts_count - 1);
                                b22.stargifts_count = max;
                                if (max <= 0) {
                                    b22.flags2 &= -257;
                                }
                            }
                            e9.y(l6Var.a, false).O();
                            e9.y(l6Var.a, false).S(true);
                            if (!(T instanceof wb)) {
                                wb wbVar = new wb();
                                wbVar.whenFullyVisible(new e3(wbVar, j12, 0));
                                T.presentFragment(wbVar);
                                break;
                            } else {
                                org.telegram.ui.Components.fc.a0(T).I(R.raw.stars_topup, bd.M0(2131750229, null), bd.H(',', "Gift2Converted", (int) j12)).k(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                l6 l6Var2 = this.b;
                TLObject tLObject2 = this.c;
                long j13 = this.d;
                long j14 = this.e;
                u10 u10Var = (u10) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j15 = this.h;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!hp.s1(l6Var2.a).j7) {
                            e9 y9 = e9.y(l6Var2.a, false);
                            c3.f0 f0Var = new c3.f0(l6Var2, j15, j13, u10Var, 1);
                            y9.e = false;
                            y9.q(f0Var, false, true);
                            y9.e = true;
                            break;
                        } else {
                            l6Var2.d2.setLoading(false);
                            e9.c0(l6Var2.getContext(), l6Var2.J0);
                            break;
                        }
                    } else {
                        u10Var.a(tL_error2);
                        l6Var2.k().f0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    hp.s1(l6Var2.a).Y3(tL_payments_paymentResult.updates.users, false);
                    hp.s1(l6Var2.a).S3(tL_payments_paymentResult.updates.chats, false);
                    e9.y(l6Var2.a, false).S(false);
                    e9.y(l6Var2.a, false).P(j13);
                    e9.y(l6Var2.a, false).P(j14);
                    e9.y(l6Var2.a, false).O();
                    u10Var.a(null);
                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j13 < 0 || j14 < 0) {
                            org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(T2).I(R.raw.forward, bd.M0(2131749905, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749906, l6Var2.z1(), org.telegram.messenger.m5.t(j13))));
                            I.t = true;
                            I.j();
                        } else {
                            wm ra2 = wm.ra(j13);
                            ra2.whenFullyVisible(new f3(l6Var2, ra2, j13, 1));
                            T2.presentFragment(ra2);
                        }
                    }
                    Utilities.d.c(new n3(l6Var2, tL_payments_paymentResult, i3));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q2(l6 l6Var, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.b = l6Var;
        this.n = s1Var;
        this.c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f = tL_error;
    }
}
