package lh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class s8 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ i9 a;

    public s8(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        i9 i9Var = this.a;
        i9Var.c1 = false;
        return !i9.i(i9Var, i9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        i9 i9Var = this.a;
        if (i9Var.V != 0.0f && i9Var.q1 == null && f10 < -1000.0f && !i9Var.W) {
            i9Var.W = true;
            try {
                i9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            i9.j(i9Var);
        }
        if (i9Var.a0 != 0.0f) {
            if (f10 < -1000.0f) {
                i9Var.n(true);
            } else if (f10 > 1000.0f) {
                i9Var.n(false);
            } else {
                i9Var.n(i9Var.w.f > 0.5f);
            }
        }
        i9Var.c1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float f11;
        mc mcVar;
        i9 i9Var = this.a;
        if (!i9Var.f0) {
            return false;
        }
        if (i9Var.h0) {
            i9Var.V += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (i9Var.V > dp && !i9Var.W) {
                i9Var.W = true;
                i9.j(i9Var);
                try {
                    i9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            i9Var.Z = Utilities.clamp(i9Var.V / dp, 1.0f, 0.0f);
            if (i9Var.j0.getCurrentPeerView() != null) {
                i9Var.j0.getCurrentPeerView().invalidate();
            }
            if (i9Var.V < 0.0f) {
                i9Var.V = 0.0f;
                i9Var.h0 = false;
            }
            return true;
        }
        if (i9Var.Y) {
            float f12 = i9Var.a0;
            if (f12 <= i9Var.w.c || f10 <= 0.0f) {
                i9Var.a0 = f12 + f10;
            } else {
                i9Var.a0 = (0.05f * f10) + f12;
            }
            w8 w8Var = i9Var.s;
            mc mcVar2 = mc.w;
            if (mcVar2 != null && mcVar2.h == w8Var) {
                mcVar2.b();
            }
            if (i9Var.j0.getCurrentPeerView() != null) {
                i9Var.j0.getCurrentPeerView().invalidate();
            }
            i9Var.v.invalidate();
            if (i9Var.a0 < 0.0f) {
                i9Var.a0 = 0.0f;
                i9Var.Y = false;
            }
            return true;
        }
        if (i9Var.R > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && i9Var.S > 0.0f) || (f13 < 0.0f && i9Var.S < 0.0f)) {
                f11 = 0.3f;
                i9Var.S -= f10 * f11;
                w8 w8Var2 = i9Var.s;
                mcVar = mc.w;
                if (mcVar != null && mcVar.h == w8Var2) {
                    mcVar.b();
                }
                i9.k(i9Var);
                return true;
            }
        }
        f11 = 0.6f;
        i9Var.S -= f10 * f11;
        w8 w8Var22 = i9Var.s;
        mcVar = mc.w;
        if (mcVar != null) {
            mcVar.b();
        }
        i9.k(i9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        d4 currentPeerView;
        i9 i9Var = this.a;
        if (i9Var.a0 == 0.0f && i9Var.b0) {
            if (i9Var.x || i9Var.H0 || i9Var.i1 || i9Var.e1 || i9Var.f1) {
                y8 y8Var = i9Var.j0;
                if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                d4 t10 = i9Var.t();
                if (t10 == null || !t10.K1.f) {
                    boolean z10 = motionEvent.getX() > ((float) i9Var.v.getMeasuredWidth()) * 0.33f;
                    d4 currentPeerView2 = i9Var.j0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (i9Var.j0.E(z10)) {
                            y8 y8Var2 = i9Var.j0;
                            y8Var2.H0 = true;
                            y8Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            m7 m7Var = y8Var2.I0;
                            AndroidUtilities.cancelRunOnUIThread(m7Var);
                            AndroidUtilities.runOnUIThread(m7Var, 150L);
                            return false;
                        }
                        if (z10) {
                            i9Var.q(true);
                            return false;
                        }
                        h9 h9Var = i9Var.v0;
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
