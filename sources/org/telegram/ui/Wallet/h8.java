package org.telegram.ui.Wallet;

import org.telegram.ui.oa0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;

    public /* synthetic */ h8(s8 s8Var, int i7) {
        this.a = i7;
        this.b = s8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f8 j3;
        switch (this.a) {
            case 0:
                s8 s8Var = this.b;
                if (s8Var.r0 && s8Var.h0 != null) {
                    s8Var.r0 = false;
                    s8Var.q0 = true;
                    s8Var.removeCallbacks(s8Var.C1);
                    ((oa0) s8Var.d.b).X();
                    s8Var.getParent().requestDisallowInterceptTouchEvent(true);
                    s8Var.performHapticFeedback(4);
                    f8 j10 = s8Var.j(s8Var.h0);
                    if (j10 != null) {
                        j10.o();
                        j10.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    s8Var.f0();
                    break;
                }
                break;
            case 1:
                s8 s8Var2 = this.b;
                s8Var2.t0 = false;
                s8Var2.h0 = null;
                s8Var2.f0();
                break;
            case 2:
                this.b.Q();
                break;
            default:
                s8 s8Var3 = this.b;
                r8 r8Var = s8Var3.h0;
                if (r8Var != null && !s8Var3.n0) {
                    if (!s8Var3.v0) {
                        if (s8Var3.q0 && (j3 = s8Var3.j(r8Var)) != null) {
                            s8Var3.S(j3);
                            break;
                        }
                    } else {
                        s8Var3.o0 = true;
                        s8Var3.i0 = r8Var;
                        s8Var3.C0 = Float.NaN;
                        s8Var3.F0 = Float.NaN;
                        s8Var3.D0 = 0.0f;
                        s8Var3.M0 = false;
                        s8Var3.E0 = r8Var.i.b;
                        r8Var.q.a(0.0f);
                        r8 r8Var2 = s8Var3.h0;
                        q8 q8Var = r8Var2.l;
                        q8Var.d = 260.0f;
                        q8Var.e = 0.58f;
                        q8Var.b = 1.0f;
                        long j11 = s8Var3.O0 + 1;
                        s8Var3.O0 = j11;
                        r8Var2.I = j11;
                        fi.s2 s2Var = r8Var2.c;
                        s2Var.v0 = true;
                        s2Var.Q0(false);
                        s8Var3.performHapticFeedback(0);
                        s8Var3.f0();
                        break;
                    }
                }
                break;
        }
    }
}
