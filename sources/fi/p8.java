package fi;

import a8.sa;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class p8 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ f9 a;

    public p8(f9 f9Var) {
        this.a = f9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        f9 f9Var = this.a;
        f9Var.g1 = false;
        return !f9.c(f9Var, f9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        f9 f9Var = this.a;
        if (f9Var.a0 != 0.0f && f9Var.u1 == null && f11 < -1000.0f && !f9Var.b0) {
            f9Var.b0 = true;
            try {
                f9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            f9.g(f9Var);
        }
        if (f9Var.f0 != 0.0f) {
            if (f11 < -1000.0f) {
                f9Var.o(true);
            } else if (f11 > 1000.0f) {
                f9Var.o(false);
            } else {
                f9Var.o(f9Var.x.f > 0.5f);
            }
        }
        f9Var.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        fc fcVar;
        f9 f9Var = this.a;
        if (!f9Var.k0) {
            return false;
        }
        if (f9Var.m0) {
            f9Var.a0 += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (f9Var.a0 > L && !f9Var.b0) {
                f9Var.b0 = true;
                f9.g(f9Var);
                try {
                    f9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            f9Var.e0 = Utilities.i(f9Var.a0 / L, 1.0f, 0.0f);
            if (f9Var.o0.getCurrentPeerView() != null) {
                f9Var.o0.getCurrentPeerView().invalidate();
            }
            if (f9Var.a0 < 0.0f) {
                f9Var.a0 = 0.0f;
                f9Var.m0 = false;
            }
            return true;
        }
        if (f9Var.d0) {
            float f13 = f9Var.f0;
            if (f13 <= f9Var.x.c || f11 <= 0.0f) {
                f9Var.f0 = f13 + f11;
            } else {
                f9Var.f0 = (0.05f * f11) + f13;
            }
            t8 t8Var = f9Var.s;
            fc fcVar2 = fc.w;
            if (fcVar2 != null && fcVar2.h == t8Var) {
                fcVar2.b();
            }
            if (f9Var.o0.getCurrentPeerView() != null) {
                f9Var.o0.getCurrentPeerView().invalidate();
            }
            f9Var.w.invalidate();
            if (f9Var.f0 < 0.0f) {
                f9Var.f0 = 0.0f;
                f9Var.d0 = false;
            }
            return true;
        }
        if (f9Var.W > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && f9Var.X > 0.0f) || (f14 < 0.0f && f9Var.X < 0.0f)) {
                f12 = 0.3f;
                f9Var.X -= f11 * f12;
                t8 t8Var2 = f9Var.s;
                fcVar = fc.w;
                if (fcVar != null && fcVar.h == t8Var2) {
                    fcVar.b();
                }
                f9.i(f9Var);
                return true;
            }
        }
        f12 = 0.6f;
        f9Var.X -= f11 * f12;
        t8 t8Var22 = f9Var.s;
        fcVar = fc.w;
        if (fcVar != null) {
            fcVar.b();
        }
        f9.i(f9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        z3 currentPeerView;
        f9 f9Var = this.a;
        if (f9Var.f0 == 0.0f && f9Var.g0) {
            if (f9Var.y || f9Var.L0 || f9Var.m1 || f9Var.i1 || f9Var.j1) {
                v8 v8Var = f9Var.o0;
                if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null) {
                    currentPeerView.q0();
                }
            } else {
                z3 z10 = f9Var.z();
                if (z10 == null || !z10.y1.f) {
                    boolean z11 = motionEvent.getX() > ((float) f9Var.w.getMeasuredWidth()) * 0.33f;
                    z3 currentPeerView2 = f9Var.o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z11)) {
                        if (f9Var.o0.E(z11)) {
                            v8 v8Var2 = f9Var.o0;
                            v8Var2.M0 = true;
                            v8Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            sa saVar = v8Var2.N0;
                            org.telegram.messenger.g0.r(saVar);
                            org.telegram.messenger.g0.h3(saVar, 150L);
                            return false;
                        }
                        if (z11) {
                            f9Var.u(true);
                            return false;
                        }
                        e9 e9Var = f9Var.A0;
                        if (e9Var != null) {
                            e9Var.loopBack();
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
