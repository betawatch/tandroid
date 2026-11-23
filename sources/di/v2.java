package di;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b51;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ v2(f6 f6Var, TLObject tLObject, long j3, long j10, w10 w10Var, TLRPC.TL_error tL_error, long j11) {
        this.b = f6Var;
        this.c = tLObject;
        this.d = j3;
        this.e = j10;
        this.n = w10Var;
        this.f = tL_error;
        this.h = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 1;
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.n;
                TLObject tLObject = this.c;
                long j3 = this.d;
                long j10 = this.e;
                long j11 = this.h;
                TLRPC.TL_error tL_error = this.f;
                t1Var.c(400L);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error == null) {
                            f6Var.k().t(gd.N0(2131743632, null), null).k(false);
                            break;
                        } else {
                            f6Var.k().t(org.telegram.ui.Components.kc.W(tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        f6Var.dismiss();
                        y8.y(f6Var.a, false).O(j3);
                        if (j3 < 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", -j3);
                            bundle.putBoolean("start_from_monetization", true);
                            b51 b51Var = new b51(bundle);
                            e0.g(f6Var.a).h(j3, true);
                            e0.g(f6Var.a).l(j3);
                            b51Var.whenFullyVisible(new bi.e4(b51Var, j11, 2));
                            T.presentFragment(b51Var);
                            break;
                        } else {
                            TLRPC.UserFull d2 = mp.u1(f6Var.a).d2(j10);
                            if (d2 != null) {
                                int max = Math.max(0, d2.stargifts_count - 1);
                                d2.stargifts_count = max;
                                if (max <= 0) {
                                    d2.flags2 &= -257;
                                }
                            }
                            y8.y(f6Var.a, false).N();
                            y8.y(f6Var.a, false).R(true);
                            if (!(T instanceof pb)) {
                                pb pbVar = new pb();
                                pbVar.whenFullyVisible(new bi.e4(pbVar, j11, 1));
                                T.presentFragment(pbVar);
                                break;
                            } else {
                                org.telegram.ui.Components.kc.b0(T).I(R.raw.stars_topup, gd.N0(2131750204, null), gd.H(',', "Gift2Converted", (int) j11)).k(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                f6 f6Var2 = this.b;
                TLObject tLObject2 = this.c;
                long j12 = this.d;
                long j13 = this.e;
                w10 w10Var = (w10) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j14 = this.h;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!mp.u1(f6Var2.a).m7) {
                            y8 y10 = y8.y(f6Var2.a, false);
                            d3.e0 e0Var = new d3.e0(f6Var2, j14, j12, w10Var, 1);
                            y10.e = false;
                            y10.q(e0Var, false, true);
                            y10.e = true;
                            break;
                        } else {
                            f6Var2.g2.setLoading(false);
                            y8.c0(f6Var2.getContext(), f6Var2.J0);
                            break;
                        }
                    } else {
                        w10Var.a(tL_error2);
                        f6Var2.k().g0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    mp.u1(f6Var2.a).f4(tL_payments_paymentResult.updates.users, false);
                    mp.u1(f6Var2.a).Z3(tL_payments_paymentResult.updates.chats, false);
                    y8.y(f6Var2.a, false).R(false);
                    y8.y(f6Var2.a, false).O(j12);
                    y8.y(f6Var2.a, false).O(j13);
                    y8.y(f6Var2.a, false).N();
                    w10Var.a(null);
                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j12 < 0 || j13 < 0) {
                            org.telegram.ui.Components.fc I = org.telegram.ui.Components.kc.b0(T2).I(R.raw.forward, gd.N0(2131749880, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749881, f6Var2.E1(), org.telegram.messenger.n5.t(j12))));
                            I.t = true;
                            I.j();
                        } else {
                            bn ua2 = bn.ua(j12);
                            ua2.whenFullyVisible(new b3(f6Var2, ua2, j12, 1));
                            T2.presentFragment(ua2);
                        }
                    }
                    Utilities.d.c(new i3(f6Var2, tL_payments_paymentResult, i7));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v2(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.b = f6Var;
        this.n = t1Var;
        this.c = tLObject;
        this.d = j3;
        this.e = j10;
        this.h = j11;
        this.f = tL_error;
    }
}
