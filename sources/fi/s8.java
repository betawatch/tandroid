package fi;

import a8.sa;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s8 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ i9 a;

    public s8(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        i9 i9Var = this.a;
        i9Var.g1 = false;
        return !i9.c(i9Var, i9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i9 i9Var = this.a;
        if (i9Var.a0 != 0.0f && i9Var.u1 == null && f11 < -1000.0f && !i9Var.b0) {
            i9Var.b0 = true;
            try {
                i9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            i9.g(i9Var);
        }
        if (i9Var.f0 != 0.0f) {
            if (f11 < -1000.0f) {
                i9Var.o(true);
            } else if (f11 > 1000.0f) {
                i9Var.o(false);
            } else {
                i9Var.o(i9Var.x.f > 0.5f);
            }
        }
        i9Var.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        xb xbVar;
        i9 i9Var = this.a;
        if (!i9Var.k0) {
            return false;
        }
        if (i9Var.m0) {
            i9Var.a0 += f11;
            float L = org.telegram.messenger.g0.L(200.0f);
            if (i9Var.a0 > L && !i9Var.b0) {
                i9Var.b0 = true;
                i9.g(i9Var);
                try {
                    i9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            i9Var.e0 = Utilities.i(i9Var.a0 / L, 1.0f, 0.0f);
            if (i9Var.o0.getCurrentPeerView() != null) {
                i9Var.o0.getCurrentPeerView().invalidate();
            }
            if (i9Var.a0 < 0.0f) {
                i9Var.a0 = 0.0f;
                i9Var.m0 = false;
            }
            return true;
        }
        if (i9Var.d0) {
            float f13 = i9Var.f0;
            if (f13 <= i9Var.x.c || f11 <= 0.0f) {
                i9Var.f0 = f13 + f11;
            } else {
                i9Var.f0 = (0.05f * f11) + f13;
            }
            w8 w8Var = i9Var.s;
            xb xbVar2 = xb.w;
            if (xbVar2 != null && xbVar2.h == w8Var) {
                xbVar2.b();
            }
            if (i9Var.o0.getCurrentPeerView() != null) {
                i9Var.o0.getCurrentPeerView().invalidate();
            }
            i9Var.w.invalidate();
            if (i9Var.f0 < 0.0f) {
                i9Var.f0 = 0.0f;
                i9Var.d0 = false;
            }
            return true;
        }
        if (i9Var.W > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && i9Var.X > 0.0f) || (f14 < 0.0f && i9Var.X < 0.0f)) {
                f12 = 0.3f;
                i9Var.X -= f11 * f12;
                w8 w8Var2 = i9Var.s;
                xbVar = xb.w;
                if (xbVar != null && xbVar.h == w8Var2) {
                    xbVar.b();
                }
                i9.i(i9Var);
                return true;
            }
        }
        f12 = 0.6f;
        i9Var.X -= f11 * f12;
        w8 w8Var22 = i9Var.s;
        xbVar = xb.w;
        if (xbVar != null) {
            xbVar.b();
        }
        i9.i(i9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        b4 currentPeerView;
        i9 i9Var = this.a;
        if (i9Var.f0 == 0.0f && i9Var.g0) {
            if (i9Var.y || i9Var.L0 || i9Var.m1 || i9Var.i1 || i9Var.j1) {
                y8 y8Var = i9Var.o0;
                if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                    currentPeerView.q0();
                }
            } else {
                b4 z10 = i9Var.z();
                if (z10 == null || !z10.y1.f) {
                    boolean z11 = motionEvent.getX() > ((float) i9Var.w.getMeasuredWidth()) * 0.33f;
                    b4 currentPeerView2 = i9Var.o0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z11)) {
                        if (i9Var.o0.E(z11)) {
                            y8 y8Var2 = i9Var.o0;
                            y8Var2.M0 = true;
                            y8Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            sa saVar = y8Var2.N0;
                            org.telegram.messenger.g0.r(saVar);
                            org.telegram.messenger.g0.i3(saVar, 150L);
                            return false;
                        }
                        if (z11) {
                            i9Var.u(true);
                            return false;
                        }
                        h9 h9Var = i9Var.A0;
                        if (h9Var != null) {
                            h9Var.loopBack();
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
