package ci;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class j9 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ z9 a;

    public j9(z9 z9Var) {
        this.a = z9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        z9 z9Var = this.a;
        z9Var.g1 = false;
        return !z9.i(z9Var, z9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        z9 z9Var = this.a;
        if (z9Var.Z != 0.0f && z9Var.u1 == null && f10 < -1000.0f && !z9Var.a0) {
            z9Var.a0 = true;
            try {
                z9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z9.j(z9Var);
        }
        if (z9Var.e0 != 0.0f) {
            if (f10 < -1000.0f) {
                z9Var.n(true);
            } else if (f10 > 1000.0f) {
                z9Var.n(false);
            } else {
                z9Var.n(z9Var.w.f > 0.5f);
            }
        }
        z9Var.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        qc qcVar;
        z9 z9Var = this.a;
        if (!z9Var.j0) {
            return false;
        }
        if (z9Var.l0) {
            z9Var.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (z9Var.Z > dp && !z9Var.a0) {
                z9Var.a0 = true;
                z9.j(z9Var);
                try {
                    z9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            z9Var.d0 = Utilities.clamp(z9Var.Z / dp, 1.0f, 0.0f);
            if (z9Var.n0.getCurrentPeerView() != null) {
                z9Var.n0.getCurrentPeerView().invalidate();
            }
            if (z9Var.Z < 0.0f) {
                z9Var.Z = 0.0f;
                z9Var.l0 = false;
            }
            return true;
        }
        if (z9Var.c0) {
            float f12 = z9Var.e0;
            if (f12 <= z9Var.w.c || f10 <= 0.0f) {
                z9Var.e0 = f12 + f10;
            } else {
                z9Var.e0 = (0.05f * f10) + f12;
            }
            n9 n9Var = z9Var.s;
            qc qcVar2 = qc.w;
            if (qcVar2 != null && qcVar2.h == n9Var) {
                qcVar2.b();
            }
            if (z9Var.n0.getCurrentPeerView() != null) {
                z9Var.n0.getCurrentPeerView().invalidate();
            }
            z9Var.v.invalidate();
            if (z9Var.e0 < 0.0f) {
                z9Var.e0 = 0.0f;
                z9Var.c0 = false;
            }
            return true;
        }
        if (z9Var.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && z9Var.W > 0.0f) || (f13 < 0.0f && z9Var.W < 0.0f)) {
                f11 = 0.3f;
                z9Var.W -= f10 * f11;
                n9 n9Var2 = z9Var.s;
                qcVar = qc.w;
                if (qcVar != null && qcVar.h == n9Var2) {
                    qcVar.b();
                }
                z9.k(z9Var);
                return true;
            }
        }
        f11 = 0.6f;
        z9Var.W -= f10 * f11;
        n9 n9Var22 = z9Var.s;
        qcVar = qc.w;
        if (qcVar != null) {
            qcVar.b();
        }
        z9.k(z9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p4 currentPeerView;
        z9 z9Var = this.a;
        if (z9Var.e0 == 0.0f && z9Var.f0) {
            if (z9Var.x || z9Var.L0 || z9Var.m1 || z9Var.i1 || z9Var.j1) {
                p9 p9Var = z9Var.n0;
                if (p9Var != null && (currentPeerView = p9Var.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                p4 t10 = z9Var.t();
                if (t10 == null || !t10.O1.f) {
                    boolean z10 = motionEvent.getX() > ((float) z9Var.v.getMeasuredWidth()) * 0.33f;
                    p4 currentPeerView2 = z9Var.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (z9Var.n0.E(z10)) {
                            p9 p9Var2 = z9Var.n0;
                            p9Var2.L0 = true;
                            p9Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = p9Var2.M0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                        if (z10) {
                            z9Var.q(true);
                            return false;
                        }
                        y9 y9Var = z9Var.z0;
                        if (y9Var != null) {
                            y9Var.loopBack();
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
