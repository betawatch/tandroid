package di;

import a8.ra;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a9 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ q9 a;

    public a9(q9 q9Var) {
        this.a = q9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        q9 q9Var = this.a;
        q9Var.f1 = false;
        return !q9.c(q9Var, q9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        q9 q9Var = this.a;
        if (q9Var.Z != 0.0f && q9Var.t1 == null && f11 < -1000.0f && !q9Var.a0) {
            q9Var.a0 = true;
            try {
                q9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            q9.g(q9Var);
        }
        if (q9Var.e0 != 0.0f) {
            if (f11 < -1000.0f) {
                q9Var.o(true);
            } else if (f11 > 1000.0f) {
                q9Var.o(false);
            } else {
                q9Var.o(q9Var.x.f > 0.5f);
            }
        }
        q9Var.f1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        bc bcVar;
        q9 q9Var = this.a;
        if (!q9Var.j0) {
            return false;
        }
        if (q9Var.l0) {
            q9Var.Z += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (q9Var.Z > L && !q9Var.a0) {
                q9Var.a0 = true;
                q9.g(q9Var);
                try {
                    q9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            q9Var.d0 = Utilities.i(q9Var.Z / L, 1.0f, 0.0f);
            if (q9Var.n0.getCurrentPeerView() != null) {
                q9Var.n0.getCurrentPeerView().invalidate();
            }
            if (q9Var.Z < 0.0f) {
                q9Var.Z = 0.0f;
                q9Var.l0 = false;
            }
            return true;
        }
        if (q9Var.c0) {
            float f13 = q9Var.e0;
            if (f13 <= q9Var.x.c || f11 <= 0.0f) {
                q9Var.e0 = f13 + f11;
            } else {
                q9Var.e0 = (0.05f * f11) + f13;
            }
            e9 e9Var = q9Var.s;
            bc bcVar2 = bc.w;
            if (bcVar2 != null && bcVar2.h == e9Var) {
                bcVar2.b();
            }
            if (q9Var.n0.getCurrentPeerView() != null) {
                q9Var.n0.getCurrentPeerView().invalidate();
            }
            q9Var.w.invalidate();
            if (q9Var.e0 < 0.0f) {
                q9Var.e0 = 0.0f;
                q9Var.c0 = false;
            }
            return true;
        }
        if (q9Var.V > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && q9Var.W > 0.0f) || (f14 < 0.0f && q9Var.W < 0.0f)) {
                f12 = 0.3f;
                q9Var.W -= f11 * f12;
                e9 e9Var2 = q9Var.s;
                bcVar = bc.w;
                if (bcVar != null && bcVar.h == e9Var2) {
                    bcVar.b();
                }
                q9.i(q9Var);
                return true;
            }
        }
        f12 = 0.6f;
        q9Var.W -= f11 * f12;
        e9 e9Var22 = q9Var.s;
        bcVar = bc.w;
        if (bcVar != null) {
            bcVar.b();
        }
        q9.i(q9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j4 currentPeerView;
        q9 q9Var = this.a;
        if (q9Var.e0 == 0.0f && q9Var.f0) {
            if (q9Var.y || q9Var.K0 || q9Var.l1 || q9Var.h1 || q9Var.i1) {
                g9 g9Var = q9Var.n0;
                if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
                    currentPeerView.q0();
                }
            } else {
                j4 z9 = q9Var.z();
                if (z9 == null || !z9.x1.f) {
                    boolean z10 = motionEvent.getX() > ((float) q9Var.w.getMeasuredWidth()) * 0.33f;
                    j4 currentPeerView2 = q9Var.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (q9Var.n0.E(z10)) {
                            g9 g9Var2 = q9Var.n0;
                            g9Var2.L0 = true;
                            g9Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            ra raVar = g9Var2.M0;
                            org.telegram.messenger.g0.r(raVar);
                            org.telegram.messenger.g0.i3(raVar, 150L);
                            return false;
                        }
                        if (z10) {
                            q9Var.u(true);
                            return false;
                        }
                        p9 p9Var = q9Var.z0;
                        if (p9Var != null) {
                            p9Var.loopBack();
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
