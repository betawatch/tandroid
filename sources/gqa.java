// default package

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gqa implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ gqa(wsa wsaVar, he heVar, TLObject tLObject, long j, long j2, long j3, TLRPC.TL_error tL_error) {
        this.b = wsaVar;
        this.n = heVar;
        this.c = tLObject;
        this.d = j;
        this.e = j2;
        this.h = j3;
        this.f = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                wsa wsaVar = this.b;
                he heVar = (he) this.n;
                TLObject tLObject = this.c;
                long j = this.d;
                long j2 = this.e;
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f;
                wsaVar.getClass();
                heVar.b(400L);
                d S = LaunchActivity.S();
                if (S != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error == null) {
                            wsaVar.j().t(jb6.M0(2131743566, null), null).k(false);
                            break;
                        } else {
                            wsaVar.j().t(c41.W(tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        wsaVar.dismiss();
                        jva.v(wsaVar.a, false).M(j);
                        if (j < 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", -j);
                            bundle.putBoolean("start_from_monetization", true);
                            xza xzaVar = new xza(bundle);
                            ku0.g(wsaVar.a).h(j, true);
                            ku0.g(wsaVar.a).l(j);
                            xzaVar.whenFullyVisible(new toa(xzaVar, j3, (byte) 2));
                            S.presentFragment(xzaVar);
                            break;
                        } else {
                            TLRPC.UserFull X1 = oc7.r1(wsaVar.a).X1(j2);
                            if (X1 != null) {
                                int max = Math.max(0, X1.stargifts_count - 1);
                                X1.stargifts_count = max;
                                if (max <= 0) {
                                    X1.flags2 &= -257;
                                }
                            }
                            jva.v(wsaVar.a, false).L();
                            jva.v(wsaVar.a, false).P(true);
                            if (!(S instanceof nxa)) {
                                nxa nxaVar = new nxa();
                                nxaVar.whenFullyVisible(new toa(nxaVar, j3, (byte) 1));
                                S.presentFragment(nxaVar);
                                break;
                            } else {
                                c41.b0(S).I(R.raw.stars_topup, jb6.M0(2131750154, null), jb6.H(',', "Gift2Converted", (int) j3)).k(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                wsa wsaVar2 = this.b;
                TLObject tLObject2 = this.c;
                long j4 = this.d;
                long j5 = this.e;
                qac qacVar = (qac) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j6 = this.h;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!oc7.r1(wsaVar2.a).c5()) {
                            wsaVar2.f2.setLoading(false);
                            jva.c0(wsaVar2.getContext(), wsaVar2.J0);
                            break;
                        } else {
                            jva v = jva.v(wsaVar2.a, false);
                            n40 n40Var = new n40(wsaVar2, j6, j4, qacVar, (byte) 15);
                            v.e = false;
                            v.n(n40Var, false, true);
                            v.e = true;
                            break;
                        }
                    } else {
                        qacVar.a(tL_error2);
                        wsaVar2.j().g0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    oc7.r1(wsaVar2.a).d4(tL_payments_paymentResult.updates.users, false);
                    oc7.r1(wsaVar2.a).X3(tL_payments_paymentResult.updates.chats, false);
                    jva.v(wsaVar2.a, false).P(false);
                    jva.v(wsaVar2.a, false).M(j4);
                    jva.v(wsaVar2.a, false).M(j5);
                    jva.v(wsaVar2.a, false).L();
                    qacVar.a(null);
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        if (j4 < 0 || j5 < 0) {
                            u31 I = c41.b0(S2).I(R.raw.forward, jb6.M0(2131749830, null), gm.S2(jb6.a0(null, null, 2131749831, wsaVar2.s1(), pg3.s(j4))));
                            I.u = true;
                            I.j();
                        } else {
                            yv1 ga = yv1.ga(j4);
                            ga.whenFullyVisible(new kqa(wsaVar2, ga, j4, (byte) 1));
                            S2.presentFragment(ga);
                        }
                    }
                    Utilities.d.c(new oqa(wsaVar2, tL_payments_paymentResult, b));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gqa(wsa wsaVar, TLObject tLObject, long j, long j2, qac qacVar, TLRPC.TL_error tL_error, long j3) {
        this.b = wsaVar;
        this.c = tLObject;
        this.d = j;
        this.e = j2;
        this.n = qacVar;
        this.f = tL_error;
        this.h = j3;
    }
}
