package ci;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.q91;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class ic extends m20 {
    public final /* synthetic */ kc a;

    public ic(kc kcVar) {
        this.a = kcVar;
    }

    @Override // org.telegram.ui.Components.m20
    public final boolean a() {
        ob obVar;
        lc lcVar = this.a.E0;
        if (lcVar.f0 != 0 || (obVar = lcVar.B0) == null || lcVar.S1 || !obVar.isInited() || lcVar.P1 || lcVar.O0.x0) {
            return false;
        }
        t7 t7Var = lcVar.D0;
        return (t7Var == null || !(t7Var.x.h || t7Var.L)) && !lcVar.J() && lcVar.p2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        lc lcVar = this.a.E0;
        ob obVar = lcVar.B0;
        if (obVar == null || lcVar.S1 || lcVar.P1 || !obVar.isInited() || lcVar.f0 != 0 || lcVar.O1 == -1) {
            return false;
        }
        lcVar.B0.switchCamera();
        lcVar.O0.d(180.0f);
        lc.a0(lcVar.B0.isFrontface());
        if (lcVar.q0()) {
            lcVar.s.c(null);
            return true;
        }
        lcVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        ob obVar = this.a.E0.B0;
        if (obVar == null) {
            return false;
        }
        obVar.N = null;
        obVar.K = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        kc kcVar = this.a;
        kcVar.C0 = 0.0f;
        kcVar.D0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        t7 t7Var;
        ob obVar;
        q91 q91Var;
        yb ybVar;
        kc kcVar = this.a;
        lc lcVar = kcVar.E0;
        ValueAnimator valueAnimator = lcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((t7Var = lcVar.D0) != null && (t7Var.x.h || t7Var.L)) || lcVar.O0.x0 || (((obVar = lcVar.B0) != null && obVar.s) || kcVar.A0 || (((q91Var = lcVar.V0) != null && (q91Var.F || q91Var.G)) || lcVar.I())))) {
            return false;
        }
        boolean z10 = true;
        kcVar.y0 = true;
        if (lcVar.W) {
            if (Math.abs(lcVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 <= 0.0f || Math.abs(f10) <= 2000.0f || Math.abs(f10) <= Math.abs(f7)) && lcVar.K <= 0.4f) {
                    lc.c(lcVar);
                } else {
                    lcVar.q(true);
                }
            } else if (lcVar.M0 != null && !lcVar.L0 && lcVar.O1 != -1) {
                if (Math.abs(f10) <= 200.0f || (lcVar.M0.d.canScrollVertically(-1) && lcVar.K0)) {
                    lcVar.f(!lcVar.Q1 && lcVar.M0.getTranslationY() < ((float) lcVar.M0.getPadding()));
                } else {
                    lcVar.f(!lcVar.Q1 && f10 < 0.0f);
                }
            }
            lcVar.L0 = false;
            lcVar.W = false;
            lcVar.X = false;
            if (z10 && (ybVar = lcVar.A0) != null) {
                ybVar.d();
            }
            return z10;
        }
        z10 = false;
        lcVar.L0 = false;
        lcVar.W = false;
        lcVar.X = false;
        if (z10) {
            ybVar.d();
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
        ob obVar;
        q91 q91Var;
        kb kbVar;
        float f11;
        kc kcVar = this.a;
        lc lcVar = kcVar.E0;
        ValueAnimator valueAnimator = lcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || lcVar.o2 != null || lcVar.n2 != null || (((t7Var = lcVar.D0) != null && (t7Var.x.h || t7Var.L)) || lcVar.O0.x0 || (((obVar = lcVar.B0) != null && obVar.s) || kcVar.A0 || (((q91Var = lcVar.V0) != null && (q91Var.F || q91Var.G)) || lcVar.I() || lcVar.Q1 || lcVar.P1 || lcVar.f0 != 0)))) {
            return false;
        }
        if (!lcVar.X) {
            float f12 = kcVar.C0 + f10;
            kcVar.C0 = f12;
            if (!lcVar.W && Math.abs(f12) >= AndroidUtilities.touchSlop) {
                yb ybVar = lcVar.A0;
                if (ybVar != null) {
                    ybVar.d();
                }
                lcVar.W = true;
            }
        }
        if (lcVar.W) {
            int measuredHeight = (lcVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            kb kbVar2 = lcVar.M0;
            if (kbVar2 != null) {
                float f13 = measuredHeight;
                if (kbVar2.getTranslationY() < f13) {
                    kcVar.B0 = lcVar.M0.getTranslationY() - f13;
                    kbVar = lcVar.M0;
                    if (kbVar != null && kbVar.d.canScrollVertically(-1)) {
                        f10 = Math.max(0.0f, f10);
                    }
                    float f14 = kcVar.B0 - f10;
                    kcVar.B0 = f14;
                    float max = Math.max(-measuredHeight, f14);
                    kcVar.B0 = max;
                    if (lcVar.f0 == 1) {
                        kcVar.B0 = Math.max(0.0f, max);
                    }
                    f11 = kcVar.B0;
                    if (f11 < 0.0f) {
                        lcVar.r.setTranslationY(f11);
                        kb kbVar3 = lcVar.M0;
                        if (kbVar3 != null) {
                            kbVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        lcVar.r.setTranslationY(0.0f);
                        if (lcVar.M0 == null) {
                            lcVar.t(false);
                        }
                        lcVar.M0.setTranslationY(measuredHeight + kcVar.B0);
                    }
                }
            }
            kcVar.B0 = lcVar.r.a;
            kbVar = lcVar.M0;
            if (kbVar != null) {
                f10 = Math.max(0.0f, f10);
            }
            float f142 = kcVar.B0 - f10;
            kcVar.B0 = f142;
            float max2 = Math.max(-measuredHeight, f142);
            kcVar.B0 = max2;
            if (lcVar.f0 == 1) {
            }
            f11 = kcVar.B0;
            if (f11 < 0.0f) {
            }
        }
        if (!lcVar.W) {
            float f15 = kcVar.D0 + f7;
            kcVar.D0 = f15;
            if (!lcVar.X && Math.abs(f15) >= AndroidUtilities.touchSlop) {
                yb ybVar2 = lcVar.A0;
                if (ybVar2 != null) {
                    ybVar2.d();
                }
                lcVar.X = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ob obVar = this.a.E0.B0;
        if (obVar == null) {
            return false;
        }
        c1 c1Var = obVar.N;
        if (c1Var == null) {
            return true;
        }
        c1Var.run();
        obVar.N = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        lc lcVar = this.a.E0;
        lcVar.W = false;
        lcVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!lcVar.J() || motionEvent.getY() >= lcVar.M0.g()) {
            return false;
        }
        lcVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
