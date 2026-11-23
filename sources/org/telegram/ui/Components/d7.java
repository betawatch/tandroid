package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;
    public final /* synthetic */ x60 c;
    public final /* synthetic */ org.telegram.messenger.fj d;

    public /* synthetic */ d7(e8 e8Var, org.telegram.messenger.fj fjVar, x60 x60Var, int i7) {
        this.a = i7;
        this.b = e8Var;
        this.d = fjVar;
        this.c = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList i7;
        TLRPC.TL_document tL_document;
        int i10 = this.a;
        x60 x60Var = this.c;
        org.telegram.messenger.fj fjVar = this.d;
        e8 e8Var = this.b;
        switch (i10) {
            case 0:
                e8Var.getClass();
                x60Var.v();
                e8Var.N0(fjVar);
                break;
            case 1:
                e8Var.getClass();
                x60Var.v();
                e8Var.W0(fjVar);
                break;
            case 2:
                e8Var.S0(fjVar, false, new d7(e8Var, fjVar, x60Var, 5), false);
                break;
            case 3:
                e8Var.getClass();
                x60Var.v();
                e8Var.N0(fjVar);
                break;
            case 4:
                e8Var.getClass();
                x60Var.v();
                e8Var.W0(fjVar);
                break;
            case 5:
                org.telegram.messenger.gp gpVar = e8Var.q2;
                TLRPC.Document a10 = gpVar.a();
                gpVar.c.remove(fjVar);
                if (gpVar.a() != a10) {
                    gpVar.e();
                }
                e8Var.r2.remove(fjVar);
                e8Var.u1.f();
                x60Var.v();
                e8Var.V0(false);
                org.telegram.messenger.f3.n(null, 2131753908, new kc((FrameLayout) e8Var.b, e8Var.J0), R.raw.ic_delete, 36);
                break;
            case 6:
                e8Var.S0(fjVar, true, new e7(e8Var, x60Var, 4), false);
                break;
            case 7:
                long e10 = org.telegram.messenger.i10.i(e8Var.a).e();
                int i11 = org.telegram.messenger.i10.t0;
                int i12 = e8Var.a;
                if (i11 != i12) {
                    e8Var.A2.O0(i12);
                }
                if (fjVar.e1() < 0) {
                    if (fjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) fjVar.F0();
                        i7 = null;
                    }
                    x60Var.v();
                    org.telegram.messenger.f3.n(null, 2131753906, new kc((FrameLayout) e8Var.b, e8Var.J0), R.raw.saved_messages, 36);
                    break;
                } else {
                    i7 = org.telegram.messenger.f3.i(fjVar);
                    tL_document = null;
                }
                if (i7 != null) {
                    org.telegram.messenger.zy.C(e8Var.a).q0(i7, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.zy C = org.telegram.messenger.zy.C(e8Var.a);
                    org.telegram.messenger.xy e11 = org.telegram.messenger.xy.e(tL_document, null, fjVar.k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, e8Var.q2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    kc.b0(Q).Q(R.raw.forward, 36, e10 == org.telegram.messenger.i10.i(e8Var.a).e() ? org.telegram.messenger.gd.N0(2131750481, null) : e10 > 0 ? org.telegram.messenger.gd.a0(null, null, 2131750480, org.telegram.messenger.n5.t(e10)) : org.telegram.messenger.gd.a0(null, null, 2131750485, org.telegram.messenger.n5.t(e10))).j();
                }
                x60Var.v();
                org.telegram.messenger.f3.n(null, 2131753906, new kc((FrameLayout) e8Var.b, e8Var.J0), R.raw.saved_messages, 36);
            default:
                e8Var.R0(fjVar);
                x60Var.v();
                break;
        }
    }

    public /* synthetic */ d7(e8 e8Var, x60 x60Var, org.telegram.messenger.fj fjVar, int i7) {
        this.a = i7;
        this.b = e8Var;
        this.c = x60Var;
        this.d = fjVar;
    }
}
