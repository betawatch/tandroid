package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;
    public final /* synthetic */ f60 c;
    public final /* synthetic */ org.telegram.messenger.zi d;

    public /* synthetic */ x6(z7 z7Var, org.telegram.messenger.zi ziVar, f60 f60Var, int i3) {
        this.a = i3;
        this.b = z7Var;
        this.d = ziVar;
        this.c = f60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i3 = this.a;
        f60 f60Var = this.c;
        org.telegram.messenger.zi ziVar = this.d;
        z7 z7Var = this.b;
        switch (i3) {
            case 0:
                z7Var.getClass();
                f60Var.u();
                z7Var.M0(ziVar);
                break;
            case 1:
                z7Var.getClass();
                f60Var.u();
                z7Var.V0(ziVar);
                break;
            case 2:
                z7Var.R0(ziVar, false, new x6(z7Var, ziVar, f60Var, 5), false);
                break;
            case 3:
                z7Var.getClass();
                f60Var.u();
                z7Var.M0(ziVar);
                break;
            case 4:
                z7Var.getClass();
                f60Var.u();
                z7Var.V0(ziVar);
                break;
            case 5:
                org.telegram.messenger.bp bpVar = z7Var.n2;
                TLRPC.Document a10 = bpVar.a();
                bpVar.c.remove(ziVar);
                if (bpVar.a() != a10) {
                    bpVar.e();
                }
                z7Var.o2.remove(ziVar);
                z7Var.r1.f();
                f60Var.u();
                z7Var.U0(false);
                org.telegram.messenger.k5.o(null, 2131753911, new fc((FrameLayout) z7Var.b, z7Var.J0), R.raw.ic_delete, 36);
                break;
            case 6:
                z7Var.R0(ziVar, true, new y6(z7Var, f60Var, 4), false);
                break;
            case 7:
                long e10 = org.telegram.messenger.h10.i(z7Var.a).e();
                int i10 = org.telegram.messenger.h10.t0;
                int i11 = z7Var.a;
                if (i10 != i11) {
                    z7Var.x2.O0(i11);
                }
                if (ziVar.f1() < 0) {
                    if (ziVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) ziVar.F0();
                        k10 = null;
                    }
                    f60Var.u();
                    org.telegram.messenger.k5.o(null, 2131753909, new fc((FrameLayout) z7Var.b, z7Var.J0), R.raw.saved_messages, 36);
                    break;
                } else {
                    k10 = org.telegram.messenger.k5.k(ziVar);
                    tL_document = null;
                }
                if (k10 != null) {
                    org.telegram.messenger.yy.C(z7Var.a).q0(k10, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.yy C = org.telegram.messenger.yy.C(z7Var.a);
                    org.telegram.messenger.wy e11 = org.telegram.messenger.wy.e(tL_document, null, ziVar.k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, z7Var.n2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    fc.a0(Q).Q(R.raw.forward, 36, e10 == org.telegram.messenger.h10.i(z7Var.a).e() ? org.telegram.messenger.bd.M0(2131750506, null) : e10 > 0 ? org.telegram.messenger.bd.a0(null, null, 2131750505, org.telegram.messenger.m5.t(e10)) : org.telegram.messenger.bd.a0(null, null, 2131750510, org.telegram.messenger.m5.t(e10))).j();
                }
                f60Var.u();
                org.telegram.messenger.k5.o(null, 2131753909, new fc((FrameLayout) z7Var.b, z7Var.J0), R.raw.saved_messages, 36);
            default:
                z7Var.Q0(ziVar);
                f60Var.u();
                break;
        }
    }

    public /* synthetic */ x6(z7 z7Var, f60 f60Var, org.telegram.messenger.zi ziVar, int i3) {
        this.a = i3;
        this.b = z7Var;
        this.c = f60Var;
        this.d = ziVar;
    }
}
