package di;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i9 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ y9 a;

    public i9(y9 y9Var) {
        this.a = y9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        y9 y9Var = this.a;
        y9Var.g1 = false;
        return !y9.i(y9Var, y9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        y9 y9Var = this.a;
        if (y9Var.Z != 0.0f && y9Var.u1 == null && f10 < -1000.0f && !y9Var.a0) {
            y9Var.a0 = true;
            try {
                y9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            y9.j(y9Var);
        }
        if (y9Var.e0 != 0.0f) {
            if (f10 < -1000.0f) {
                y9Var.n(true);
            } else if (f10 > 1000.0f) {
                y9Var.n(false);
            } else {
                y9Var.n(y9Var.w.f > 0.5f);
            }
        }
        y9Var.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        qc qcVar;
        y9 y9Var = this.a;
        if (!y9Var.j0) {
            return false;
        }
        if (y9Var.l0) {
            y9Var.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (y9Var.Z > dp && !y9Var.a0) {
                y9Var.a0 = true;
                y9.j(y9Var);
                try {
                    y9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            y9Var.d0 = Utilities.clamp(y9Var.Z / dp, 1.0f, 0.0f);
            if (y9Var.n0.getCurrentPeerView() != null) {
                y9Var.n0.getCurrentPeerView().invalidate();
            }
            if (y9Var.Z < 0.0f) {
                y9Var.Z = 0.0f;
                y9Var.l0 = false;
            }
            return true;
        }
        if (y9Var.c0) {
            float f12 = y9Var.e0;
            if (f12 <= y9Var.w.c || f10 <= 0.0f) {
                y9Var.e0 = f12 + f10;
            } else {
                y9Var.e0 = (0.05f * f10) + f12;
            }
            m9 m9Var = y9Var.s;
            qc qcVar2 = qc.x;
            if (qcVar2 != null && qcVar2.h == m9Var) {
                qcVar2.b();
            }
            if (y9Var.n0.getCurrentPeerView() != null) {
                y9Var.n0.getCurrentPeerView().invalidate();
            }
            y9Var.v.invalidate();
            if (y9Var.e0 < 0.0f) {
                y9Var.e0 = 0.0f;
                y9Var.c0 = false;
            }
            return true;
        }
        if (y9Var.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && y9Var.W > 0.0f) || (f13 < 0.0f && y9Var.W < 0.0f)) {
                f11 = 0.3f;
                y9Var.W -= f10 * f11;
                m9 m9Var2 = y9Var.s;
                qcVar = qc.x;
                if (qcVar != null && qcVar.h == m9Var2) {
                    qcVar.b();
                }
                y9.k(y9Var);
                return true;
            }
        }
        f11 = 0.6f;
        y9Var.W -= f10 * f11;
        m9 m9Var22 = y9Var.s;
        qcVar = qc.x;
        if (qcVar != null) {
            qcVar.b();
        }
        y9.k(y9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        q4 currentPeerView;
        y9 y9Var = this.a;
        if (y9Var.e0 == 0.0f && y9Var.f0) {
            if (y9Var.x || y9Var.L0 || y9Var.m1 || y9Var.i1 || y9Var.j1) {
                o9 o9Var = y9Var.n0;
                if (o9Var != null && (currentPeerView = o9Var.getCurrentPeerView()) != null) {
                    currentPeerView.q0();
                }
            } else {
                q4 t10 = y9Var.t();
                if (t10 == null || !t10.D1.f) {
                    boolean z10 = motionEvent.getX() > ((float) y9Var.v.getMeasuredWidth()) * 0.33f;
                    q4 currentPeerView2 = y9Var.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.b1(z10)) {
                        if (y9Var.n0.E(z10)) {
                            o9 o9Var2 = y9Var.n0;
                            o9Var2.L0 = true;
                            o9Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            a5.d dVar = o9Var2.M0;
                            AndroidUtilities.cancelRunOnUIThread(dVar);
                            AndroidUtilities.runOnUIThread(dVar, 150L);
                            return false;
                        }
                        if (z10) {
                            y9Var.q(true);
                            return false;
                        }
                        x9 x9Var = y9Var.z0;
                        if (x9Var != null) {
                            x9Var.loopBack();
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
