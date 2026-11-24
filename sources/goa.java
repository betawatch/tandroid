// default package

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class goa implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ goa(vqa vqaVar, hd hdVar, TLObject tLObject, long j, long j2, long j3, TLRPC.TL_error tL_error) {
        this.b = vqaVar;
        this.n = hdVar;
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
                vqa vqaVar = this.b;
                hd hdVar = (hd) this.n;
                TLObject tLObject = this.c;
                long j = this.d;
                long j2 = this.e;
                long j3 = this.h;
                TLRPC.TL_error tL_error = this.f;
                vqaVar.getClass();
                hdVar.b(400L);
                d S = LaunchActivity.S();
                if (S != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error == null) {
                            vqaVar.j().t(k96.M0(2131743640, null), null).k(false);
                            break;
                        } else {
                            vqaVar.j().t(u21.W(tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        vqaVar.dismiss();
                        gta.v(vqaVar.a, false).M(j);
                        if (j < 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", -j);
                            bundle.putBoolean("start_from_monetization", true);
                            uxa uxaVar = new uxa(bundle);
                            ct0.g(vqaVar.a).h(j, true);
                            ct0.g(vqaVar.a).l(j);
                            uxaVar.whenFullyVisible(new sma(uxaVar, j3, (byte) 2));
                            S.presentFragment(uxaVar);
                            break;
                        } else {
                            TLRPC.UserFull W1 = na7.q1(vqaVar.a).W1(j2);
                            if (W1 != null) {
                                int max = Math.max(0, W1.stargifts_count - 1);
                                W1.stargifts_count = max;
                                if (max <= 0) {
                                    W1.flags2 &= -257;
                                }
                            }
                            gta.v(vqaVar.a, false).L();
                            gta.v(vqaVar.a, false).P(true);
                            if (!(S instanceof jva)) {
                                jva jvaVar = new jva();
                                jvaVar.whenFullyVisible(new sma(jvaVar, j3, (byte) 1));
                                S.presentFragment(jvaVar);
                                break;
                            } else {
                                u21.b0(S).I(R.raw.stars_topup, k96.M0(2131750205, null), k96.H(',', "Gift2Converted", (int) j3)).k(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                vqa vqaVar2 = this.b;
                TLObject tLObject2 = this.c;
                long j4 = this.d;
                long j5 = this.e;
                p8c p8cVar = (p8c) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j6 = this.h;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!na7.q1(vqaVar2.a).a5()) {
                            vqaVar2.f2.setLoading(false);
                            gta.c0(vqaVar2.getContext(), vqaVar2.J0);
                            break;
                        } else {
                            gta v = gta.v(vqaVar2.a, false);
                            n30 n30Var = new n30(vqaVar2, j6, j4, p8cVar, (byte) 15);
                            v.e = false;
                            v.n(n30Var, false, true);
                            v.e = true;
                            break;
                        }
                    } else {
                        p8cVar.a(tL_error2);
                        vqaVar2.j().g0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    na7.q1(vqaVar2.a).b4(tL_payments_paymentResult.updates.users, false);
                    na7.q1(vqaVar2.a).V3(tL_payments_paymentResult.updates.chats, false);
                    gta.v(vqaVar2.a, false).P(false);
                    gta.v(vqaVar2.a, false).M(j4);
                    gta.v(vqaVar2.a, false).M(j5);
                    gta.v(vqaVar2.a, false).L();
                    p8cVar.a(null);
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        if (j4 < 0 || j5 < 0) {
                            m21 I = u21.b0(S2).I(R.raw.forward, k96.M0(2131749881, null), gl.S2(k96.a0(null, null, 2131749882, vqaVar2.s1(), cf3.s(j4))));
                            I.t = true;
                            I.j();
                        } else {
                            mu1 W9 = mu1.W9(j4);
                            W9.whenFullyVisible(new koa(vqaVar2, W9, j4, (byte) 1));
                            S2.presentFragment(W9);
                        }
                    }
                    Utilities.d.c(new ooa(vqaVar2, tL_payments_paymentResult, b));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ goa(vqa vqaVar, TLObject tLObject, long j, long j2, p8c p8cVar, TLRPC.TL_error tL_error, long j3) {
        this.b = vqaVar;
        this.c = tLObject;
        this.d = j;
        this.e = j2;
        this.n = p8cVar;
        this.f = tL_error;
        this.h = j3;
    }
}
