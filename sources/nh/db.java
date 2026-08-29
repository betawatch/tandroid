package nh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class db extends h20 {
    public final /* synthetic */ fb a;

    public db(fb fbVar) {
        this.a = fbVar;
    }

    @Override // org.telegram.ui.Components.h20
    public final boolean a() {
        ka kaVar;
        gb gbVar = this.a.A0;
        if (gbVar.b0 != 0 || (kaVar = gbVar.x0) == null || gbVar.O1 || !kaVar.isInited() || gbVar.L1 || gbVar.K0.t0) {
            return false;
        }
        y6 y6Var = gbVar.z0;
        return (y6Var == null || !(y6Var.x.h || y6Var.H)) && !gbVar.J() && gbVar.l2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        gb gbVar = this.a.A0;
        ka kaVar = gbVar.x0;
        if (kaVar == null || gbVar.O1 || gbVar.L1 || !kaVar.isInited() || gbVar.b0 != 0 || gbVar.K1 == -1) {
            return false;
        }
        gbVar.x0.switchCamera();
        gbVar.K0.d(180.0f);
        gb.a0(gbVar.x0.isFrontface());
        if (gbVar.q0()) {
            gbVar.s.c(null);
            return true;
        }
        gbVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        ka kaVar = this.a.A0.x0;
        if (kaVar == null) {
            return false;
        }
        kaVar.J = null;
        kaVar.G = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        fb fbVar = this.a;
        fbVar.y0 = 0.0f;
        fbVar.z0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        y6 y6Var;
        ka kaVar;
        u81 u81Var;
        ua uaVar;
        fb fbVar = this.a;
        gb gbVar = fbVar.A0;
        ValueAnimator valueAnimator = gbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((y6Var = gbVar.z0) != null && (y6Var.x.h || y6Var.H)) || gbVar.K0.t0 || (((kaVar = gbVar.x0) != null && kaVar.s) || fbVar.w0 || (((u81Var = gbVar.R0) != null && (u81Var.B || u81Var.C)) || gbVar.I())))) {
            return false;
        }
        boolean z10 = true;
        fbVar.u0 = true;
        if (gbVar.S) {
            if (Math.abs(gbVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 <= 0.0f || Math.abs(f10) <= 2000.0f || Math.abs(f10) <= Math.abs(f9)) && gbVar.G <= 0.4f) {
                    gb.c(gbVar);
                } else {
                    gbVar.q(true);
                }
            } else if (gbVar.I0 != null && !gbVar.H0 && gbVar.K1 != -1) {
                if (Math.abs(f10) <= 200.0f || (gbVar.I0.d.canScrollVertically(-1) && gbVar.G0)) {
                    gbVar.f(!gbVar.M1 && gbVar.I0.getTranslationY() < ((float) gbVar.I0.getPadding()));
                } else {
                    gbVar.f(!gbVar.M1 && f10 < 0.0f);
                }
            }
            gbVar.H0 = false;
            gbVar.S = false;
            gbVar.T = false;
            if (z10 && (uaVar = gbVar.w0) != null) {
                uaVar.d();
            }
            return z10;
        }
        z10 = false;
        gbVar.H0 = false;
        gbVar.S = false;
        gbVar.T = false;
        if (z10) {
            uaVar.d();
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        y6 y6Var;
        ka kaVar;
        u81 u81Var;
        ga gaVar;
        float f11;
        fb fbVar = this.a;
        gb gbVar = fbVar.A0;
        ValueAnimator valueAnimator = gbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || gbVar.k2 != null || gbVar.j2 != null || (((y6Var = gbVar.z0) != null && (y6Var.x.h || y6Var.H)) || gbVar.K0.t0 || (((kaVar = gbVar.x0) != null && kaVar.s) || fbVar.w0 || (((u81Var = gbVar.R0) != null && (u81Var.B || u81Var.C)) || gbVar.I() || gbVar.M1 || gbVar.L1 || gbVar.b0 != 0)))) {
            return false;
        }
        if (!gbVar.T) {
            float f12 = fbVar.y0 + f10;
            fbVar.y0 = f12;
            if (!gbVar.S && Math.abs(f12) >= AndroidUtilities.touchSlop) {
                ua uaVar = gbVar.w0;
                if (uaVar != null) {
                    uaVar.d();
                }
                gbVar.S = true;
            }
        }
        if (gbVar.S) {
            int measuredHeight = (gbVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ga gaVar2 = gbVar.I0;
            if (gaVar2 != null) {
                float f13 = measuredHeight;
                if (gaVar2.getTranslationY() < f13) {
                    fbVar.x0 = gbVar.I0.getTranslationY() - f13;
                    gaVar = gbVar.I0;
                    if (gaVar != null && gaVar.d.canScrollVertically(-1)) {
                        f10 = Math.max(0.0f, f10);
                    }
                    float f14 = fbVar.x0 - f10;
                    fbVar.x0 = f14;
                    float max = Math.max(-measuredHeight, f14);
                    fbVar.x0 = max;
                    if (gbVar.b0 == 1) {
                        fbVar.x0 = Math.max(0.0f, max);
                    }
                    f11 = fbVar.x0;
                    if (f11 < 0.0f) {
                        gbVar.r.setTranslationY(f11);
                        ga gaVar3 = gbVar.I0;
                        if (gaVar3 != null) {
                            gaVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        gbVar.r.setTranslationY(0.0f);
                        if (gbVar.I0 == null) {
                            gbVar.t(false);
                        }
                        gbVar.I0.setTranslationY(measuredHeight + fbVar.x0);
                    }
                }
            }
            fbVar.x0 = gbVar.r.a;
            gaVar = gbVar.I0;
            if (gaVar != null) {
                f10 = Math.max(0.0f, f10);
            }
            float f142 = fbVar.x0 - f10;
            fbVar.x0 = f142;
            float max2 = Math.max(-measuredHeight, f142);
            fbVar.x0 = max2;
            if (gbVar.b0 == 1) {
            }
            f11 = fbVar.x0;
            if (f11 < 0.0f) {
            }
        }
        if (!gbVar.S) {
            float f15 = fbVar.z0 + f9;
            fbVar.z0 = f15;
            if (!gbVar.T && Math.abs(f15) >= AndroidUtilities.touchSlop) {
                ua uaVar2 = gbVar.w0;
                if (uaVar2 != null) {
                    uaVar2.d();
                }
                gbVar.T = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ka kaVar = this.a.A0.x0;
        if (kaVar == null) {
            return false;
        }
        b1 b1Var = kaVar.J;
        if (b1Var == null) {
            return true;
        }
        b1Var.run();
        kaVar.J = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        gb gbVar = this.a.A0;
        gbVar.S = false;
        gbVar.T = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!gbVar.J() || motionEvent.getY() >= gbVar.I0.g()) {
            return false;
        }
        gbVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
