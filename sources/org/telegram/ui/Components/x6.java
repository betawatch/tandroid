package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;
    public final /* synthetic */ m60 c;
    public final /* synthetic */ org.telegram.messenger.gj d;

    public /* synthetic */ x6(y7 y7Var, org.telegram.messenger.gj gjVar, m60 m60Var, int i7) {
        this.a = i7;
        this.b = y7Var;
        this.d = gjVar;
        this.c = m60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList j3;
        TLRPC.TL_document tL_document;
        int i7 = this.a;
        m60 m60Var = this.c;
        org.telegram.messenger.gj gjVar = this.d;
        y7 y7Var = this.b;
        switch (i7) {
            case 0:
                y7Var.getClass();
                m60Var.u();
                y7Var.M0(gjVar);
                break;
            case 1:
                y7Var.getClass();
                m60Var.u();
                y7Var.V0(gjVar);
                break;
            case 2:
                y7Var.R0(gjVar, false, new x6(y7Var, gjVar, m60Var, 5), false);
                break;
            case 3:
                y7Var.getClass();
                m60Var.u();
                y7Var.M0(gjVar);
                break;
            case 4:
                y7Var.getClass();
                m60Var.u();
                y7Var.V0(gjVar);
                break;
            case 5:
                org.telegram.messenger.hp hpVar = y7Var.q2;
                TLRPC.Document a10 = hpVar.a();
                hpVar.c.remove(gjVar);
                if (hpVar.a() != a10) {
                    hpVar.e();
                }
                y7Var.r2.remove(gjVar);
                y7Var.u1.f();
                m60Var.u();
                y7Var.U0(false);
                org.telegram.messenger.k5.n(null, 2131753911, new cc((FrameLayout) y7Var.b, y7Var.J0), R.raw.ic_delete, 36);
                break;
            case 6:
                y7Var.R0(gjVar, true, new y6(y7Var, m60Var, 4), false);
                break;
            case 7:
                long e10 = org.telegram.messenger.m10.i(y7Var.a).e();
                int i10 = org.telegram.messenger.m10.t0;
                int i11 = y7Var.a;
                if (i10 != i11) {
                    y7Var.A2.O0(i11);
                }
                if (gjVar.e1() < 0) {
                    if (gjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) gjVar.F0();
                        j3 = null;
                    }
                    m60Var.u();
                    org.telegram.messenger.k5.n(null, 2131753909, new cc((FrameLayout) y7Var.b, y7Var.J0), R.raw.saved_messages, 36);
                    break;
                } else {
                    j3 = org.telegram.messenger.k5.j(gjVar);
                    tL_document = null;
                }
                if (j3 != null) {
                    org.telegram.messenger.ez.C(y7Var.a).q0(j3, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.ez C = org.telegram.messenger.ez.C(y7Var.a);
                    org.telegram.messenger.cz e11 = org.telegram.messenger.cz.e(tL_document, null, gjVar.k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, y7Var.q2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    cc.a0(Q).Q(R.raw.forward, 36, e10 == org.telegram.messenger.m10.i(y7Var.a).e() ? org.telegram.messenger.hd.M0(2131750498, null) : e10 > 0 ? org.telegram.messenger.hd.a0(null, null, 2131750497, org.telegram.messenger.m5.t(e10)) : org.telegram.messenger.hd.a0(null, null, 2131750502, org.telegram.messenger.m5.t(e10))).j();
                }
                m60Var.u();
                org.telegram.messenger.k5.n(null, 2131753909, new cc((FrameLayout) y7Var.b, y7Var.J0), R.raw.saved_messages, 36);
            default:
                y7Var.Q0(gjVar);
                m60Var.u();
                break;
        }
    }

    public /* synthetic */ x6(y7 y7Var, m60 m60Var, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = y7Var;
        this.c = m60Var;
        this.d = gjVar;
    }
}
