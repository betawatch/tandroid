package ci;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class k9 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ aa a;

    public k9(aa aaVar) {
        this.a = aaVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        aa aaVar = this.a;
        aaVar.g1 = false;
        return !aa.i(aaVar, aaVar.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        aa aaVar = this.a;
        if (aaVar.Z != 0.0f && aaVar.u1 == null && f10 < -1000.0f && !aaVar.a0) {
            aaVar.a0 = true;
            try {
                aaVar.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            aa.j(aaVar);
        }
        if (aaVar.e0 != 0.0f) {
            if (f10 < -1000.0f) {
                aaVar.n(true);
            } else if (f10 > 1000.0f) {
                aaVar.n(false);
            } else {
                aaVar.n(aaVar.w.f > 0.5f);
            }
        }
        aaVar.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        qc qcVar;
        aa aaVar = this.a;
        if (!aaVar.j0) {
            return false;
        }
        if (aaVar.l0) {
            aaVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (aaVar.Z > dp && !aaVar.a0) {
                aaVar.a0 = true;
                aa.j(aaVar);
                try {
                    aaVar.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            aaVar.d0 = Utilities.clamp(aaVar.Z / dp, 1.0f, 0.0f);
            if (aaVar.n0.getCurrentPeerView() != null) {
                aaVar.n0.getCurrentPeerView().invalidate();
            }
            if (aaVar.Z < 0.0f) {
                aaVar.Z = 0.0f;
                aaVar.l0 = false;
            }
            return true;
        }
        if (aaVar.c0) {
            float f12 = aaVar.e0;
            if (f12 <= aaVar.w.c || f10 <= 0.0f) {
                aaVar.e0 = f12 + f10;
            } else {
                aaVar.e0 = (0.05f * f10) + f12;
            }
            o9 o9Var = aaVar.s;
            qc qcVar2 = qc.w;
            if (qcVar2 != null && qcVar2.h == o9Var) {
                qcVar2.b();
            }
            if (aaVar.n0.getCurrentPeerView() != null) {
                aaVar.n0.getCurrentPeerView().invalidate();
            }
            aaVar.v.invalidate();
            if (aaVar.e0 < 0.0f) {
                aaVar.e0 = 0.0f;
                aaVar.c0 = false;
            }
            return true;
        }
        if (aaVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && aaVar.W > 0.0f) || (f13 < 0.0f && aaVar.W < 0.0f)) {
                f11 = 0.3f;
                aaVar.W -= f10 * f11;
                o9 o9Var2 = aaVar.s;
                qcVar = qc.w;
                if (qcVar != null && qcVar.h == o9Var2) {
                    qcVar.b();
                }
                aa.k(aaVar);
                return true;
            }
        }
        f11 = 0.6f;
        aaVar.W -= f10 * f11;
        o9 o9Var22 = aaVar.s;
        qcVar = qc.w;
        if (qcVar != null) {
            qcVar.b();
        }
        aa.k(aaVar);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        q4 currentPeerView;
        aa aaVar = this.a;
        if (aaVar.e0 == 0.0f && aaVar.f0) {
            if (aaVar.x || aaVar.L0 || aaVar.m1 || aaVar.i1 || aaVar.j1) {
                q9 q9Var = aaVar.n0;
                if (q9Var != null && (currentPeerView = q9Var.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                q4 t10 = aaVar.t();
                if (t10 == null || !t10.O1.f) {
                    boolean z10 = motionEvent.getX() > ((float) aaVar.v.getMeasuredWidth()) * 0.33f;
                    q4 currentPeerView2 = aaVar.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (aaVar.n0.E(z10)) {
                            q9 q9Var2 = aaVar.n0;
                            q9Var2.L0 = true;
                            q9Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = q9Var2.M0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                        if (z10) {
                            aaVar.q(true);
                            return false;
                        }
                        z9 z9Var = aaVar.z0;
                        if (z9Var != null) {
                            z9Var.loopBack();
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
