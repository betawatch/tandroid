package ai;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class ub implements GestureDetector.OnGestureListener {
    public final /* synthetic */ kc a;

    public ub(kc kcVar) {
        this.a = kcVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        kc kcVar = this.a;
        kcVar.g1 = false;
        return !kc.i(kcVar, kcVar.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        kc kcVar = this.a;
        if (kcVar.Z != 0.0f && kcVar.u1 == null && f10 < -1000.0f && !kcVar.a0) {
            kcVar.a0 = true;
            try {
                kcVar.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            kc.j(kcVar);
        }
        if (kcVar.e0 != 0.0f) {
            if (f10 < -1000.0f) {
                kcVar.n(true);
            } else if (f10 > 1000.0f) {
                kcVar.n(false);
            } else {
                kcVar.n(kcVar.w.f > 0.5f);
            }
        }
        kcVar.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        org.telegram.ui.Components.tc tcVar;
        kc kcVar = this.a;
        if (!kcVar.j0) {
            return false;
        }
        if (kcVar.l0) {
            kcVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (kcVar.Z > dp && !kcVar.a0) {
                kcVar.a0 = true;
                kc.j(kcVar);
                try {
                    kcVar.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            kcVar.d0 = Utilities.clamp(kcVar.Z / dp, 1.0f, 0.0f);
            if (kcVar.n0.getCurrentPeerView() != null) {
                kcVar.n0.getCurrentPeerView().invalidate();
            }
            if (kcVar.Z < 0.0f) {
                kcVar.Z = 0.0f;
                kcVar.l0 = false;
            }
            return true;
        }
        if (kcVar.c0) {
            float f12 = kcVar.e0;
            if (f12 <= kcVar.w.c || f10 <= 0.0f) {
                kcVar.e0 = f12 + f10;
            } else {
                kcVar.e0 = (0.05f * f10) + f12;
            }
            yb ybVar = kcVar.s;
            org.telegram.ui.Components.tc tcVar2 = org.telegram.ui.Components.tc.w;
            if (tcVar2 != null && tcVar2.h == ybVar) {
                tcVar2.b();
            }
            if (kcVar.n0.getCurrentPeerView() != null) {
                kcVar.n0.getCurrentPeerView().invalidate();
            }
            kcVar.v.invalidate();
            if (kcVar.e0 < 0.0f) {
                kcVar.e0 = 0.0f;
                kcVar.c0 = false;
            }
            return true;
        }
        if (kcVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && kcVar.W > 0.0f) || (f13 < 0.0f && kcVar.W < 0.0f)) {
                f11 = 0.3f;
                kcVar.W -= f10 * f11;
                yb ybVar2 = kcVar.s;
                tcVar = org.telegram.ui.Components.tc.w;
                if (tcVar != null && tcVar.h == ybVar2) {
                    tcVar.b();
                }
                kc.k(kcVar);
                return true;
            }
        }
        f11 = 0.6f;
        kcVar.W -= f10 * f11;
        yb ybVar22 = kcVar.s;
        tcVar = org.telegram.ui.Components.tc.w;
        if (tcVar != null) {
            tcVar.b();
        }
        kc.k(kcVar);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f6 currentPeerView;
        kc kcVar = this.a;
        if (kcVar.e0 == 0.0f && kcVar.f0) {
            if (kcVar.x || kcVar.L0 || kcVar.m1 || kcVar.i1 || kcVar.j1) {
                ac acVar = kcVar.n0;
                if (acVar != null && (currentPeerView = acVar.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                f6 t10 = kcVar.t();
                if (t10 == null || !t10.O1.f) {
                    boolean z10 = motionEvent.getX() > ((float) kcVar.v.getMeasuredWidth()) * 0.33f;
                    f6 currentPeerView2 = kcVar.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (kcVar.n0.E(z10)) {
                            ac acVar2 = kcVar.n0;
                            acVar2.L0 = true;
                            acVar2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            r4 r4Var = acVar2.M0;
                            AndroidUtilities.cancelRunOnUIThread(r4Var);
                            AndroidUtilities.runOnUIThread(r4Var, 150L);
                            return false;
                        }
                        if (z10) {
                            kcVar.q(true);
                            return false;
                        }
                        jc jcVar = kcVar.z0;
                        if (jcVar != null) {
                            jcVar.loopBack();
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
