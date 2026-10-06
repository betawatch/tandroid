package ci;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.p20;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class hc extends p20 {
    public final /* synthetic */ jc a;

    public hc(jc jcVar) {
        this.a = jcVar;
    }

    @Override // org.telegram.ui.Components.p20
    public final boolean a() {
        nb nbVar;
        kc kcVar = this.a.E0;
        if (kcVar.f0 != 0 || (nbVar = kcVar.B0) == null || kcVar.S1 || !nbVar.isInited() || kcVar.P1 || kcVar.O0.x0) {
            return false;
        }
        t7 t7Var = kcVar.D0;
        return (t7Var == null || !(t7Var.x.h || t7Var.L)) && !kcVar.J() && kcVar.p2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        kc kcVar = this.a.E0;
        nb nbVar = kcVar.B0;
        if (nbVar == null || kcVar.S1 || kcVar.P1 || !nbVar.isInited() || kcVar.f0 != 0 || kcVar.O1 == -1) {
            return false;
        }
        kcVar.B0.switchCamera();
        kcVar.O0.d(180.0f);
        kc.a0(kcVar.B0.isFrontface());
        if (kcVar.q0()) {
            kcVar.s.c(null);
            return true;
        }
        kcVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        nb nbVar = this.a.E0.B0;
        if (nbVar == null) {
            return false;
        }
        nbVar.N = null;
        nbVar.K = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        jc jcVar = this.a;
        jcVar.C0 = 0.0f;
        jcVar.D0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        t7 t7Var;
        nb nbVar;
        ca1 ca1Var;
        xb xbVar;
        jc jcVar = this.a;
        kc kcVar = jcVar.E0;
        ValueAnimator valueAnimator = kcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((t7Var = kcVar.D0) != null && (t7Var.x.h || t7Var.L)) || kcVar.O0.x0 || (((nbVar = kcVar.B0) != null && nbVar.s) || jcVar.A0 || (((ca1Var = kcVar.V0) != null && (ca1Var.F || ca1Var.G)) || kcVar.I())))) {
            return false;
        }
        boolean z10 = true;
        jcVar.y0 = true;
        if (kcVar.W) {
            if (Math.abs(kcVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 <= 0.0f || Math.abs(f10) <= 2000.0f || Math.abs(f10) <= Math.abs(f7)) && kcVar.K <= 0.4f) {
                    kc.c(kcVar);
                } else {
                    kcVar.q(true);
                }
            } else if (kcVar.M0 != null && !kcVar.L0 && kcVar.O1 != -1) {
                if (Math.abs(f10) <= 200.0f || (kcVar.M0.d.canScrollVertically(-1) && kcVar.K0)) {
                    kcVar.f(!kcVar.Q1 && kcVar.M0.getTranslationY() < ((float) kcVar.M0.getPadding()));
                } else {
                    kcVar.f(!kcVar.Q1 && f10 < 0.0f);
                }
            }
            kcVar.L0 = false;
            kcVar.W = false;
            kcVar.X = false;
            if (z10 && (xbVar = kcVar.A0) != null) {
                xbVar.d();
            }
            return z10;
        }
        z10 = false;
        kcVar.L0 = false;
        kcVar.W = false;
        kcVar.X = false;
        if (z10) {
            xbVar.d();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        t7 t7Var;
        nb nbVar;
        ca1 ca1Var;
        jb jbVar;
        float f11;
        jc jcVar = this.a;
        kc kcVar = jcVar.E0;
        ValueAnimator valueAnimator = kcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || kcVar.o2 != null || kcVar.n2 != null || (((t7Var = kcVar.D0) != null && (t7Var.x.h || t7Var.L)) || kcVar.O0.x0 || (((nbVar = kcVar.B0) != null && nbVar.s) || jcVar.A0 || (((ca1Var = kcVar.V0) != null && (ca1Var.F || ca1Var.G)) || kcVar.I() || kcVar.Q1 || kcVar.P1 || kcVar.f0 != 0)))) {
            return false;
        }
        if (!kcVar.X) {
            float f12 = jcVar.C0 + f10;
            jcVar.C0 = f12;
            if (!kcVar.W && Math.abs(f12) >= AndroidUtilities.touchSlop) {
                xb xbVar = kcVar.A0;
                if (xbVar != null) {
                    xbVar.d();
                }
                kcVar.W = true;
            }
        }
        if (kcVar.W) {
            int measuredHeight = (kcVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            jb jbVar2 = kcVar.M0;
            if (jbVar2 != null) {
                float f13 = measuredHeight;
                if (jbVar2.getTranslationY() < f13) {
                    jcVar.B0 = kcVar.M0.getTranslationY() - f13;
                    jbVar = kcVar.M0;
                    if (jbVar != null && jbVar.d.canScrollVertically(-1)) {
                        f10 = Math.max(0.0f, f10);
                    }
                    float f14 = jcVar.B0 - f10;
                    jcVar.B0 = f14;
                    float max = Math.max(-measuredHeight, f14);
                    jcVar.B0 = max;
                    if (kcVar.f0 == 1) {
                        jcVar.B0 = Math.max(0.0f, max);
                    }
                    f11 = jcVar.B0;
                    if (f11 < 0.0f) {
                        kcVar.r.setTranslationY(f11);
                        jb jbVar3 = kcVar.M0;
                        if (jbVar3 != null) {
                            jbVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        kcVar.r.setTranslationY(0.0f);
                        if (kcVar.M0 == null) {
                            kcVar.t(false);
                        }
                        kcVar.M0.setTranslationY(measuredHeight + jcVar.B0);
                    }
                }
            }
            jcVar.B0 = kcVar.r.a;
            jbVar = kcVar.M0;
            if (jbVar != null) {
                f10 = Math.max(0.0f, f10);
            }
            float f142 = jcVar.B0 - f10;
            jcVar.B0 = f142;
            float max2 = Math.max(-measuredHeight, f142);
            jcVar.B0 = max2;
            if (kcVar.f0 == 1) {
            }
            f11 = jcVar.B0;
            if (f11 < 0.0f) {
            }
        }
        if (!kcVar.W) {
            float f15 = jcVar.D0 + f7;
            jcVar.D0 = f15;
            if (!kcVar.X && Math.abs(f15) >= AndroidUtilities.touchSlop) {
                xb xbVar2 = kcVar.A0;
                if (xbVar2 != null) {
                    xbVar2.d();
                }
                kcVar.X = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        nb nbVar = this.a.E0.B0;
        if (nbVar == null) {
            return false;
        }
        c1 c1Var = nbVar.N;
        if (c1Var == null) {
            return true;
        }
        c1Var.run();
        nbVar.N = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        kc kcVar = this.a.E0;
        kcVar.W = false;
        kcVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!kcVar.J() || motionEvent.getY() >= kcVar.M0.g()) {
            return false;
        }
        kcVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
