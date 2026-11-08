package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ k60 c;
    public final /* synthetic */ org.telegram.messenger.ij d;

    public /* synthetic */ z6(b8 b8Var, org.telegram.messenger.ij ijVar, k60 k60Var, int i7) {
        this.a = i7;
        this.b = b8Var;
        this.d = ijVar;
        this.c = k60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i7 = this.a;
        k60 k60Var = this.c;
        org.telegram.messenger.ij ijVar = this.d;
        b8 b8Var = this.b;
        switch (i7) {
            case 0:
                b8Var.getClass();
                k60Var.u();
                b8Var.M0(ijVar);
                break;
            case 1:
                b8Var.getClass();
                k60Var.u();
                b8Var.V0(ijVar);
                break;
            case 2:
                b8Var.R0(ijVar, false, new z6(b8Var, ijVar, k60Var, 5), false);
                break;
            case 3:
                b8Var.getClass();
                k60Var.u();
                b8Var.M0(ijVar);
                break;
            case 4:
                b8Var.getClass();
                k60Var.u();
                b8Var.V0(ijVar);
                break;
            case 5:
                org.telegram.messenger.kp kpVar = b8Var.m2;
                TLRPC.Document a10 = kpVar.a();
                kpVar.c.remove(ijVar);
                if (kpVar.a() != a10) {
                    kpVar.e();
                }
                b8Var.n2.remove(ijVar);
                b8Var.q1.f();
                k60Var.u();
                b8Var.U0(false);
                org.telegram.messenger.k5.o(null, 2131753911, new hc((FrameLayout) b8Var.b, b8Var.I0), R.raw.ic_delete, 36);
                break;
            case 6:
                b8Var.R0(ijVar, true, new a7(b8Var, k60Var, 4), false);
                break;
            case 7:
                long e10 = org.telegram.messenger.p10.i(b8Var.a).e();
                int i10 = org.telegram.messenger.p10.s0;
                int i11 = b8Var.a;
                if (i10 != i11) {
                    b8Var.w2.O0(i11);
                }
                if (ijVar.f1() < 0) {
                    if (ijVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) ijVar.F0();
                        k10 = null;
                    }
                    k60Var.u();
                    org.telegram.messenger.k5.o(null, 2131753909, new hc((FrameLayout) b8Var.b, b8Var.I0), R.raw.saved_messages, 36);
                    break;
                } else {
                    k10 = org.telegram.messenger.k5.k(ijVar);
                    tL_document = null;
                }
                if (k10 != null) {
                    org.telegram.messenger.gz.C(b8Var.a).q0(k10, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.gz C = org.telegram.messenger.gz.C(b8Var.a);
                    org.telegram.messenger.ez e11 = org.telegram.messenger.ez.e(tL_document, null, ijVar.k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, b8Var.m2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    hc.a0(Q).Q(R.raw.forward, 36, e10 == org.telegram.messenger.p10.i(b8Var.a).e() ? org.telegram.messenger.id.M0(2131750499, null) : e10 > 0 ? org.telegram.messenger.id.a0(null, null, 2131750498, org.telegram.messenger.m5.t(e10)) : org.telegram.messenger.id.a0(null, null, 2131750503, org.telegram.messenger.m5.t(e10))).j();
                }
                k60Var.u();
                org.telegram.messenger.k5.o(null, 2131753909, new hc((FrameLayout) b8Var.b, b8Var.I0), R.raw.saved_messages, 36);
            default:
                b8Var.Q0(ijVar);
                k60Var.u();
                break;
        }
    }

    public /* synthetic */ z6(b8 b8Var, k60 k60Var, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = b8Var;
        this.c = k60Var;
        this.d = ijVar;
    }
}
