package ei;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ac;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a9 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ r9 a;

    public a9(r9 r9Var) {
        this.a = r9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        r9 r9Var = this.a;
        r9Var.h1 = false;
        return !r9.u(r9Var, r9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        r9 r9Var = this.a;
        if (r9Var.a0 != 0.0f && r9Var.v1 == null && f11 < -1000.0f && !r9Var.b0) {
            r9Var.b0 = true;
            try {
                r9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            r9.v(r9Var);
        }
        if (r9Var.f0 != 0.0f) {
            if (f11 < -1000.0f) {
                r9Var.A(true);
            } else if (f11 > 1000.0f) {
                r9Var.A(false);
            } else {
                r9Var.A(r9Var.x.f > 0.5f);
            }
        }
        r9Var.h1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        ac acVar;
        r9 r9Var = this.a;
        if (!r9Var.k0) {
            return false;
        }
        if (r9Var.m0) {
            r9Var.a0 += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (r9Var.a0 > L && !r9Var.b0) {
                r9Var.b0 = true;
                r9.v(r9Var);
                try {
                    r9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            r9Var.e0 = Utilities.i(r9Var.a0 / L, 1.0f, 0.0f);
            if (r9Var.o0.getCurrentPeerView() != null) {
                r9Var.o0.getCurrentPeerView().invalidate();
            }
            if (r9Var.a0 < 0.0f) {
                r9Var.a0 = 0.0f;
                r9Var.m0 = false;
            }
            return true;
        }
        if (r9Var.d0) {
            float f13 = r9Var.f0;
            if (f13 <= r9Var.x.c || f11 <= 0.0f) {
                r9Var.f0 = f13 + f11;
            } else {
                r9Var.f0 = (0.05f * f11) + f13;
            }
            e9 e9Var = r9Var.s;
            ac acVar2 = ac.w;
            if (acVar2 != null && acVar2.h == e9Var) {
                acVar2.b();
            }
            if (r9Var.o0.getCurrentPeerView() != null) {
                r9Var.o0.getCurrentPeerView().invalidate();
            }
            r9Var.w.invalidate();
            if (r9Var.f0 < 0.0f) {
                r9Var.f0 = 0.0f;
                r9Var.d0 = false;
            }
            return true;
        }
        if (r9Var.W > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && r9Var.X > 0.0f) || (f14 < 0.0f && r9Var.X < 0.0f)) {
                f12 = 0.3f;
                r9Var.X -= f11 * f12;
                e9 e9Var2 = r9Var.s;
                acVar = ac.w;
                if (acVar != null && acVar.h == e9Var2) {
                    acVar.b();
                }
                r9.w(r9Var);
                return true;
            }
        }
        f12 = 0.6f;
        r9Var.X -= f11 * f12;
        e9 e9Var22 = r9Var.s;
        acVar = ac.w;
        if (acVar != null) {
            acVar.b();
        }
        r9.w(r9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j4 currentPeerView;
        r9 r9Var = this.a;
        if (r9Var.f0 == 0.0f && r9Var.g0) {
            if (r9Var.y || r9Var.M0 || r9Var.n1 || r9Var.j1 || r9Var.k1) {
                g9 g9Var = r9Var.o0;
                if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
                    currentPeerView.q0();
                }
            } else {
                j4 H = r9Var.H();
                if (H == null || !H.y1.f) {
                    boolean z10 = motionEvent.getX() > ((float) r9Var.w.getMeasuredWidth()) * 0.33f;
                    j4 currentPeerView2 = r9Var.o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (r9Var.o0.E(z10)) {
                            g9 g9Var2 = r9Var.o0;
                            g9Var2.M0 = true;
                            g9Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            a3.o oVar = g9Var2.N0;
                            org.telegram.messenger.g0.r(oVar);
                            org.telegram.messenger.g0.i3(oVar, 150L);
                            return false;
                        }
                        if (z10) {
                            r9Var.D(true);
                            return false;
                        }
                        q9 q9Var = r9Var.A0;
                        if (q9Var != null) {
                            q9Var.loopBack();
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
