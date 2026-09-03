package nh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class s8 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ i9 a;

    public s8(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        i9 i9Var = this.a;
        i9Var.d1 = false;
        return !i9.i(i9Var, i9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i9 i9Var = this.a;
        if (i9Var.W != 0.0f && i9Var.r1 == null && f11 < -1000.0f && !i9Var.X) {
            i9Var.X = true;
            try {
                i9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            i9.j(i9Var);
        }
        if (i9Var.b0 != 0.0f) {
            if (f11 < -1000.0f) {
                i9Var.n(true);
            } else if (f11 > 1000.0f) {
                i9Var.n(false);
            } else {
                i9Var.n(i9Var.w.f > 0.5f);
            }
        }
        i9Var.d1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        ic icVar;
        i9 i9Var = this.a;
        if (!i9Var.g0) {
            return false;
        }
        if (i9Var.i0) {
            i9Var.W += f11;
            float dp = AndroidUtilities.dp(200.0f);
            if (i9Var.W > dp && !i9Var.X) {
                i9Var.X = true;
                i9.j(i9Var);
                try {
                    i9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            i9Var.a0 = Utilities.clamp(i9Var.W / dp, 1.0f, 0.0f);
            if (i9Var.k0.getCurrentPeerView() != null) {
                i9Var.k0.getCurrentPeerView().invalidate();
            }
            if (i9Var.W < 0.0f) {
                i9Var.W = 0.0f;
                i9Var.i0 = false;
            }
            return true;
        }
        if (i9Var.Z) {
            float f13 = i9Var.b0;
            if (f13 <= i9Var.w.c || f11 <= 0.0f) {
                i9Var.b0 = f13 + f11;
            } else {
                i9Var.b0 = (0.05f * f11) + f13;
            }
            w8 w8Var = i9Var.s;
            ic icVar2 = ic.w;
            if (icVar2 != null && icVar2.h == w8Var) {
                icVar2.b();
            }
            if (i9Var.k0.getCurrentPeerView() != null) {
                i9Var.k0.getCurrentPeerView().invalidate();
            }
            i9Var.v.invalidate();
            if (i9Var.b0 < 0.0f) {
                i9Var.b0 = 0.0f;
                i9Var.Z = false;
            }
            return true;
        }
        if (i9Var.S > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && i9Var.T > 0.0f) || (f14 < 0.0f && i9Var.T < 0.0f)) {
                f12 = 0.3f;
                i9Var.T -= f11 * f12;
                w8 w8Var2 = i9Var.s;
                icVar = ic.w;
                if (icVar != null && icVar.h == w8Var2) {
                    icVar.b();
                }
                i9.k(i9Var);
                return true;
            }
        }
        f12 = 0.6f;
        i9Var.T -= f11 * f12;
        w8 w8Var22 = i9Var.s;
        icVar = ic.w;
        if (icVar != null) {
            icVar.b();
        }
        i9.k(i9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        d4 currentPeerView;
        i9 i9Var = this.a;
        if (i9Var.b0 == 0.0f && i9Var.c0) {
            if (i9Var.x || i9Var.I0 || i9Var.j1 || i9Var.f1 || i9Var.g1) {
                y8 y8Var = i9Var.k0;
                if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                d4 t6 = i9Var.t();
                if (t6 == null || !t6.L1.f) {
                    boolean z4 = motionEvent.getX() > ((float) i9Var.v.getMeasuredWidth()) * 0.33f;
                    d4 currentPeerView2 = i9Var.k0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z4)) {
                        if (i9Var.k0.E(z4)) {
                            y8 y8Var2 = i9Var.k0;
                            y8Var2.I0 = true;
                            y8Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            m2.b bVar = y8Var2.J0;
                            AndroidUtilities.cancelRunOnUIThread(bVar);
                            AndroidUtilities.runOnUIThread(bVar, 150L);
                            return false;
                        }
                        if (z4) {
                            i9Var.q(true);
                            return false;
                        }
                        h9 h9Var = i9Var.w0;
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
