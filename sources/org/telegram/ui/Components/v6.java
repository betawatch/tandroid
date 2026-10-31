package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;
    public final /* synthetic */ z60 c;
    public final /* synthetic */ org.telegram.messenger.jj d;

    public /* synthetic */ v6(w7 w7Var, org.telegram.messenger.jj jjVar, z60 z60Var, int i10) {
        this.a = i10;
        this.b = w7Var;
        this.d = jjVar;
        this.c = z60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList j10;
        TLRPC.TL_document tL_document;
        int i10 = this.a;
        z60 z60Var = this.c;
        org.telegram.messenger.jj jjVar = this.d;
        w7 w7Var = this.b;
        switch (i10) {
            case 0:
                w7Var.getClass();
                z60Var.u();
                w7Var.M0(jjVar);
                break;
            case 1:
                w7Var.getClass();
                z60Var.u();
                w7Var.V0(jjVar);
                break;
            case 2:
                w7Var.R0(jjVar, false, new v6(w7Var, jjVar, z60Var, 5), false);
                break;
            case 3:
                w7Var.getClass();
                z60Var.u();
                w7Var.M0(jjVar);
                break;
            case 4:
                w7Var.getClass();
                z60Var.u();
                w7Var.V0(jjVar);
                break;
            case 5:
                org.telegram.messenger.pp ppVar = w7Var.m2;
                TLRPC.Document a2 = ppVar.a();
                ppVar.c.remove(jjVar);
                if (ppVar.a() != a2) {
                    ppVar.e();
                }
                w7Var.n2.remove(jjVar);
                w7Var.q1.f();
                z60Var.u();
                w7Var.U0(false);
                org.telegram.messenger.m5.n(null, 2131753911, new cc((FrameLayout) w7Var.b, w7Var.I0), R.raw.ic_delete, 36);
                break;
            case 6:
                w7Var.R0(jjVar, true, new w6(w7Var, z60Var, 4), false);
                break;
            case 7:
                long e = org.telegram.messenger.d20.i(w7Var.a).e();
                int i11 = org.telegram.messenger.d20.s0;
                int i12 = w7Var.a;
                if (i11 != i12) {
                    w7Var.w2.O0(i12);
                }
                if (jjVar.f1() < 0) {
                    if (jjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) jjVar.F0();
                        j10 = null;
                    }
                    z60Var.u();
                    org.telegram.messenger.m5.n(null, 2131753909, new cc((FrameLayout) w7Var.b, w7Var.I0), R.raw.saved_messages, 36);
                    break;
                } else {
                    j10 = org.telegram.messenger.m5.j(jjVar);
                    tL_document = null;
                }
                if (j10 != null) {
                    org.telegram.messenger.qz.C(w7Var.a).q0(j10, e, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.qz C = org.telegram.messenger.qz.C(w7Var.a);
                    org.telegram.messenger.oz e7 = org.telegram.messenger.oz.e(tL_document, null, jjVar.k.attachPath, e, null, null, null, null, null, true, 0, 0, 0, w7Var.m2, false);
                    e = e;
                    C.r0(e7);
                }
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    cc.a0(Q).Q(R.raw.forward, 36, e == org.telegram.messenger.d20.i(w7Var.a).e() ? org.telegram.messenger.cd.L0(2131750507, null) : e > 0 ? org.telegram.messenger.cd.a0(null, null, 2131750506, org.telegram.messenger.o5.t(e)) : org.telegram.messenger.cd.a0(null, null, 2131750511, org.telegram.messenger.o5.t(e))).j();
                }
                z60Var.u();
                org.telegram.messenger.m5.n(null, 2131753909, new cc((FrameLayout) w7Var.b, w7Var.I0), R.raw.saved_messages, 36);
            default:
                w7Var.Q0(jjVar);
                z60Var.u();
                break;
        }
    }

    public /* synthetic */ v6(w7 w7Var, z60 z60Var, org.telegram.messenger.jj jjVar, int i10) {
        this.a = i10;
        this.b = w7Var;
        this.c = z60Var;
        this.d = jjVar;
    }
}
