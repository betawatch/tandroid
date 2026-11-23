package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;
    public final /* synthetic */ a70 c;
    public final /* synthetic */ org.telegram.messenger.gj d;

    public /* synthetic */ e7(f8 f8Var, org.telegram.messenger.gj gjVar, a70 a70Var, int i7) {
        this.a = i7;
        this.b = f8Var;
        this.d = gjVar;
        this.c = a70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList i7;
        TLRPC.TL_document tL_document;
        int i10 = this.a;
        a70 a70Var = this.c;
        org.telegram.messenger.gj gjVar = this.d;
        f8 f8Var = this.b;
        switch (i10) {
            case 0:
                f8Var.getClass();
                a70Var.v();
                f8Var.N0(gjVar);
                break;
            case 1:
                f8Var.getClass();
                a70Var.v();
                f8Var.W0(gjVar);
                break;
            case 2:
                f8Var.S0(gjVar, false, new e7(f8Var, gjVar, a70Var, 5), false);
                break;
            case 3:
                f8Var.getClass();
                a70Var.v();
                f8Var.N0(gjVar);
                break;
            case 4:
                f8Var.getClass();
                a70Var.v();
                f8Var.W0(gjVar);
                break;
            case 5:
                org.telegram.messenger.hp hpVar = f8Var.q2;
                TLRPC.Document a10 = hpVar.a();
                hpVar.c.remove(gjVar);
                if (hpVar.a() != a10) {
                    hpVar.e();
                }
                f8Var.r2.remove(gjVar);
                f8Var.u1.f();
                a70Var.v();
                f8Var.V0(false);
                org.telegram.messenger.f3.n(null, 2131753908, new lc((FrameLayout) f8Var.b, f8Var.J0), R.raw.ic_delete, 36);
                break;
            case 6:
                f8Var.S0(gjVar, true, new f7(f8Var, a70Var, 4), false);
                break;
            case 7:
                long e10 = org.telegram.messenger.k10.i(f8Var.a).e();
                int i11 = org.telegram.messenger.k10.t0;
                int i12 = f8Var.a;
                if (i11 != i12) {
                    f8Var.A2.O0(i12);
                }
                if (gjVar.e1() < 0) {
                    if (gjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) gjVar.F0();
                        i7 = null;
                    }
                    a70Var.v();
                    org.telegram.messenger.f3.n(null, 2131753906, new lc((FrameLayout) f8Var.b, f8Var.J0), R.raw.saved_messages, 36);
                    break;
                } else {
                    i7 = org.telegram.messenger.f3.i(gjVar);
                    tL_document = null;
                }
                if (i7 != null) {
                    org.telegram.messenger.az.C(f8Var.a).q0(i7, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.az C = org.telegram.messenger.az.C(f8Var.a);
                    org.telegram.messenger.yy e11 = org.telegram.messenger.yy.e(tL_document, null, gjVar.k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, f8Var.q2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    lc.b0(Q).Q(R.raw.forward, 36, e10 == org.telegram.messenger.k10.i(f8Var.a).e() ? org.telegram.messenger.hd.N0(2131750481, null) : e10 > 0 ? org.telegram.messenger.hd.a0(null, null, 2131750480, org.telegram.messenger.n5.t(e10)) : org.telegram.messenger.hd.a0(null, null, 2131750485, org.telegram.messenger.n5.t(e10))).j();
                }
                a70Var.v();
                org.telegram.messenger.f3.n(null, 2131753906, new lc((FrameLayout) f8Var.b, f8Var.J0), R.raw.saved_messages, 36);
            default:
                f8Var.R0(gjVar);
                a70Var.v();
                break;
        }
    }

    public /* synthetic */ e7(f8 f8Var, a70 a70Var, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = f8Var;
        this.c = a70Var;
        this.d = gjVar;
    }
}
