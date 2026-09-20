package ai;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class tb implements GestureDetector.OnGestureListener {
    public final /* synthetic */ jc a;

    public tb(jc jcVar) {
        this.a = jcVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        jc jcVar = this.a;
        jcVar.g1 = false;
        return !jc.i(jcVar, jcVar.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        jc jcVar = this.a;
        if (jcVar.Z != 0.0f && jcVar.u1 == null && f10 < -1000.0f && !jcVar.a0) {
            jcVar.a0 = true;
            try {
                jcVar.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            jc.j(jcVar);
        }
        if (jcVar.e0 != 0.0f) {
            if (f10 < -1000.0f) {
                jcVar.n(true);
            } else if (f10 > 1000.0f) {
                jcVar.n(false);
            } else {
                jcVar.n(jcVar.w.f > 0.5f);
            }
        }
        jcVar.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        org.telegram.ui.Components.pc pcVar;
        jc jcVar = this.a;
        if (!jcVar.j0) {
            return false;
        }
        if (jcVar.l0) {
            jcVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (jcVar.Z > dp && !jcVar.a0) {
                jcVar.a0 = true;
                jc.j(jcVar);
                try {
                    jcVar.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            jcVar.d0 = Utilities.clamp(jcVar.Z / dp, 1.0f, 0.0f);
            if (jcVar.n0.getCurrentPeerView() != null) {
                jcVar.n0.getCurrentPeerView().invalidate();
            }
            if (jcVar.Z < 0.0f) {
                jcVar.Z = 0.0f;
                jcVar.l0 = false;
            }
            return true;
        }
        if (jcVar.c0) {
            float f12 = jcVar.e0;
            if (f12 <= jcVar.w.c || f10 <= 0.0f) {
                jcVar.e0 = f12 + f10;
            } else {
                jcVar.e0 = (0.05f * f10) + f12;
            }
            xb xbVar = jcVar.s;
            org.telegram.ui.Components.pc pcVar2 = org.telegram.ui.Components.pc.w;
            if (pcVar2 != null && pcVar2.h == xbVar) {
                pcVar2.b();
            }
            if (jcVar.n0.getCurrentPeerView() != null) {
                jcVar.n0.getCurrentPeerView().invalidate();
            }
            jcVar.v.invalidate();
            if (jcVar.e0 < 0.0f) {
                jcVar.e0 = 0.0f;
                jcVar.c0 = false;
            }
            return true;
        }
        if (jcVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && jcVar.W > 0.0f) || (f13 < 0.0f && jcVar.W < 0.0f)) {
                f11 = 0.3f;
                jcVar.W -= f10 * f11;
                xb xbVar2 = jcVar.s;
                pcVar = org.telegram.ui.Components.pc.w;
                if (pcVar != null && pcVar.h == xbVar2) {
                    pcVar.b();
                }
                jc.k(jcVar);
                return true;
            }
        }
        f11 = 0.6f;
        jcVar.W -= f10 * f11;
        xb xbVar22 = jcVar.s;
        pcVar = org.telegram.ui.Components.pc.w;
        if (pcVar != null) {
            pcVar.b();
        }
        jc.k(jcVar);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f6 currentPeerView;
        jc jcVar = this.a;
        if (jcVar.e0 == 0.0f && jcVar.f0) {
            if (jcVar.x || jcVar.L0 || jcVar.m1 || jcVar.i1 || jcVar.j1) {
                zb zbVar = jcVar.n0;
                if (zbVar != null && (currentPeerView = zbVar.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                f6 t10 = jcVar.t();
                if (t10 == null || !t10.O1.f) {
                    boolean z10 = motionEvent.getX() > ((float) jcVar.v.getMeasuredWidth()) * 0.33f;
                    f6 currentPeerView2 = jcVar.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (jcVar.n0.E(z10)) {
                            zb zbVar2 = jcVar.n0;
                            zbVar2.L0 = true;
                            zbVar2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            q4 q4Var = zbVar2.M0;
                            AndroidUtilities.cancelRunOnUIThread(q4Var);
                            AndroidUtilities.runOnUIThread(q4Var, 150L);
                            return false;
                        }
                        if (z10) {
                            jcVar.q(true);
                            return false;
                        }
                        ic icVar = jcVar.z0;
                        if (icVar != null) {
                            icVar.loopBack();
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
