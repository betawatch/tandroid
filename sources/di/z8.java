package di;

import a8.ra;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class z8 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ p9 a;

    public z8(p9 p9Var) {
        this.a = p9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        p9 p9Var = this.a;
        p9Var.f1 = false;
        return !p9.c(p9Var, p9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        p9 p9Var = this.a;
        if (p9Var.Z != 0.0f && p9Var.t1 == null && f11 < -1000.0f && !p9Var.a0) {
            p9Var.a0 = true;
            try {
                p9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            p9.g(p9Var);
        }
        if (p9Var.e0 != 0.0f) {
            if (f11 < -1000.0f) {
                p9Var.o(true);
            } else if (f11 > 1000.0f) {
                p9Var.o(false);
            } else {
                p9Var.o(p9Var.x.f > 0.5f);
            }
        }
        p9Var.f1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        cc ccVar;
        p9 p9Var = this.a;
        if (!p9Var.j0) {
            return false;
        }
        if (p9Var.l0) {
            p9Var.Z += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (p9Var.Z > L && !p9Var.a0) {
                p9Var.a0 = true;
                p9.g(p9Var);
                try {
                    p9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            p9Var.d0 = Utilities.i(p9Var.Z / L, 1.0f, 0.0f);
            if (p9Var.n0.getCurrentPeerView() != null) {
                p9Var.n0.getCurrentPeerView().invalidate();
            }
            if (p9Var.Z < 0.0f) {
                p9Var.Z = 0.0f;
                p9Var.l0 = false;
            }
            return true;
        }
        if (p9Var.c0) {
            float f13 = p9Var.e0;
            if (f13 <= p9Var.x.c || f11 <= 0.0f) {
                p9Var.e0 = f13 + f11;
            } else {
                p9Var.e0 = (0.05f * f11) + f13;
            }
            d9 d9Var = p9Var.s;
            cc ccVar2 = cc.w;
            if (ccVar2 != null && ccVar2.h == d9Var) {
                ccVar2.b();
            }
            if (p9Var.n0.getCurrentPeerView() != null) {
                p9Var.n0.getCurrentPeerView().invalidate();
            }
            p9Var.w.invalidate();
            if (p9Var.e0 < 0.0f) {
                p9Var.e0 = 0.0f;
                p9Var.c0 = false;
            }
            return true;
        }
        if (p9Var.V > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && p9Var.W > 0.0f) || (f14 < 0.0f && p9Var.W < 0.0f)) {
                f12 = 0.3f;
                p9Var.W -= f11 * f12;
                d9 d9Var2 = p9Var.s;
                ccVar = cc.w;
                if (ccVar != null && ccVar.h == d9Var2) {
                    ccVar.b();
                }
                p9.i(p9Var);
                return true;
            }
        }
        f12 = 0.6f;
        p9Var.W -= f11 * f12;
        d9 d9Var22 = p9Var.s;
        ccVar = cc.w;
        if (ccVar != null) {
            ccVar.b();
        }
        p9.i(p9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i4 currentPeerView;
        p9 p9Var = this.a;
        if (p9Var.e0 == 0.0f && p9Var.f0) {
            if (p9Var.y || p9Var.K0 || p9Var.l1 || p9Var.h1 || p9Var.i1) {
                f9 f9Var = p9Var.n0;
                if (f9Var != null && (currentPeerView = f9Var.getCurrentPeerView()) != null) {
                    currentPeerView.q0();
                }
            } else {
                i4 z9 = p9Var.z();
                if (z9 == null || !z9.x1.f) {
                    boolean z10 = motionEvent.getX() > ((float) p9Var.w.getMeasuredWidth()) * 0.33f;
                    i4 currentPeerView2 = p9Var.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (p9Var.n0.E(z10)) {
                            f9 f9Var2 = p9Var.n0;
                            f9Var2.L0 = true;
                            f9Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            ra raVar = f9Var2.M0;
                            org.telegram.messenger.g0.r(raVar);
                            org.telegram.messenger.g0.i3(raVar, 150L);
                            return false;
                        }
                        if (z10) {
                            p9Var.u(true);
                            return false;
                        }
                        o9 o9Var = p9Var.z0;
                        if (o9Var != null) {
                            o9Var.loopBack();
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
