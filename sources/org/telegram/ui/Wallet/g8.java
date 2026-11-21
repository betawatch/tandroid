package org.telegram.ui.Wallet;

import org.telegram.ui.pa0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ g8(r8 r8Var, int i7) {
        this.a = i7;
        this.b = r8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e8 j3;
        switch (this.a) {
            case 0:
                r8 r8Var = this.b;
                if (r8Var.r0 && r8Var.h0 != null) {
                    r8Var.r0 = false;
                    r8Var.q0 = true;
                    r8Var.removeCallbacks(r8Var.C1);
                    ((pa0) r8Var.d.b).X();
                    r8Var.getParent().requestDisallowInterceptTouchEvent(true);
                    r8Var.performHapticFeedback(4);
                    e8 j10 = r8Var.j(r8Var.h0);
                    if (j10 != null) {
                        j10.o();
                        j10.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    r8Var.f0();
                    break;
                }
                break;
            case 1:
                r8 r8Var2 = this.b;
                r8Var2.t0 = false;
                r8Var2.h0 = null;
                r8Var2.f0();
                break;
            case 2:
                this.b.Q();
                break;
            default:
                r8 r8Var3 = this.b;
                q8 q8Var = r8Var3.h0;
                if (q8Var != null && !r8Var3.n0) {
                    if (!r8Var3.v0) {
                        if (r8Var3.q0 && (j3 = r8Var3.j(q8Var)) != null) {
                            r8Var3.S(j3);
                            break;
                        }
                    } else {
                        r8Var3.o0 = true;
                        r8Var3.i0 = q8Var;
                        r8Var3.C0 = Float.NaN;
                        r8Var3.F0 = Float.NaN;
                        r8Var3.D0 = 0.0f;
                        r8Var3.M0 = false;
                        r8Var3.E0 = q8Var.i.b;
                        q8Var.q.a(0.0f);
                        q8 q8Var2 = r8Var3.h0;
                        p8 p8Var = q8Var2.l;
                        p8Var.d = 260.0f;
                        p8Var.e = 0.58f;
                        p8Var.b = 1.0f;
                        long j11 = r8Var3.O0 + 1;
                        r8Var3.O0 = j11;
                        q8Var2.I = j11;
                        fi.s2 s2Var = q8Var2.c;
                        s2Var.v0 = true;
                        s2Var.P0(false);
                        r8Var3.performHapticFeedback(0);
                        r8Var3.f0();
                        break;
                    }
                }
                break;
        }
    }
}
