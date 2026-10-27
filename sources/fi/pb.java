package fi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc1;
import org.telegram.ui.Components.w20;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class pb extends w20 {
    public final /* synthetic */ rb a;

    public pb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // org.telegram.ui.Components.w20
    public final boolean a() {
        va vaVar;
        sb sbVar = this.a.t0;
        if (sbVar.f0 != 0 || (vaVar = sbVar.B0) == null || sbVar.S1 || !vaVar.isInited() || sbVar.P1 || sbVar.O0.x0) {
            return false;
        }
        g7 g7Var = sbVar.D0;
        return (g7Var == null || !(g7Var.x.i || g7Var.L)) && !sbVar.I() && sbVar.p2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        sb sbVar = this.a.t0;
        va vaVar = sbVar.B0;
        if (vaVar == null || sbVar.S1 || sbVar.P1 || !vaVar.isInited() || sbVar.f0 != 0 || sbVar.O1 == -1) {
            return false;
        }
        sbVar.B0.switchCamera();
        sbVar.O0.d(180.0f);
        sb.Z(sbVar.B0.isFrontface());
        if (sbVar.p0()) {
            sbVar.s.c(null);
            return true;
        }
        sbVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        va vaVar = this.a.t0.B0;
        if (vaVar == null) {
            return false;
        }
        vaVar.N = null;
        vaVar.K = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        rb rbVar = this.a;
        rbVar.r0 = 0.0f;
        rbVar.s0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        g7 g7Var;
        va vaVar;
        kc1 kc1Var;
        fb fbVar;
        rb rbVar = this.a;
        sb sbVar = rbVar.t0;
        ValueAnimator valueAnimator = sbVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((g7Var = sbVar.D0) != null && (g7Var.x.i || g7Var.L)) || sbVar.O0.x0 || (((vaVar = sbVar.B0) != null && vaVar.s) || rbVar.p0 || (((kc1Var = sbVar.V0) != null && (kc1Var.F || kc1Var.G)) || sbVar.H())))) {
            return false;
        }
        boolean z10 = true;
        rbVar.n0 = true;
        if (sbVar.W) {
            if (Math.abs(sbVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 <= 0.0f || Math.abs(f10) <= 2000.0f || Math.abs(f10) <= Math.abs(f7)) && sbVar.K <= 0.4f) {
                    sb.b(sbVar);
                } else {
                    sbVar.p(true);
                }
            } else if (sbVar.M0 != null && !sbVar.L0 && sbVar.O1 != -1) {
                if (Math.abs(f10) <= 200.0f || (sbVar.M0.d.canScrollVertically(-1) && sbVar.K0)) {
                    sbVar.e(!sbVar.Q1 && sbVar.M0.getTranslationY() < ((float) sbVar.M0.getPadding()));
                } else {
                    sbVar.e(!sbVar.Q1 && f10 < 0.0f);
                }
            }
            sbVar.L0 = false;
            sbVar.W = false;
            sbVar.X = false;
            if (z10 && (fbVar = sbVar.A0) != null) {
                fbVar.d();
            }
            return z10;
        }
        z10 = false;
        sbVar.L0 = false;
        sbVar.W = false;
        sbVar.X = false;
        if (z10) {
            fbVar.d();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        g7 g7Var;
        va vaVar;
        kc1 kc1Var;
        qa qaVar;
        float f11;
        rb rbVar = this.a;
        sb sbVar = rbVar.t0;
        ValueAnimator valueAnimator = sbVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || sbVar.o2 != null || sbVar.n2 != null || (((g7Var = sbVar.D0) != null && (g7Var.x.i || g7Var.L)) || sbVar.O0.x0 || (((vaVar = sbVar.B0) != null && vaVar.s) || rbVar.p0 || (((kc1Var = sbVar.V0) != null && (kc1Var.F || kc1Var.G)) || sbVar.H() || sbVar.Q1 || sbVar.P1 || sbVar.f0 != 0)))) {
            return false;
        }
        if (!sbVar.X) {
            float f12 = rbVar.r0 + f10;
            rbVar.r0 = f12;
            if (!sbVar.W && Math.abs(f12) >= AndroidUtilities.touchSlop) {
                fb fbVar = sbVar.A0;
                if (fbVar != null) {
                    fbVar.d();
                }
                sbVar.W = true;
            }
        }
        if (sbVar.W) {
            int measuredHeight = (sbVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            qa qaVar2 = sbVar.M0;
            if (qaVar2 != null) {
                float f13 = measuredHeight;
                if (qaVar2.getTranslationY() < f13) {
                    rbVar.q0 = sbVar.M0.getTranslationY() - f13;
                    qaVar = sbVar.M0;
                    if (qaVar != null && qaVar.d.canScrollVertically(-1)) {
                        f10 = Math.max(0.0f, f10);
                    }
                    float f14 = rbVar.q0 - f10;
                    rbVar.q0 = f14;
                    float max = Math.max(-measuredHeight, f14);
                    rbVar.q0 = max;
                    if (sbVar.f0 == 1) {
                        rbVar.q0 = Math.max(0.0f, max);
                    }
                    f11 = rbVar.q0;
                    if (f11 < 0.0f) {
                        sbVar.r.setTranslationY(f11);
                        qa qaVar3 = sbVar.M0;
                        if (qaVar3 != null) {
                            qaVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        sbVar.r.setTranslationY(0.0f);
                        if (sbVar.M0 == null) {
                            sbVar.s(false);
                        }
                        sbVar.M0.setTranslationY(measuredHeight + rbVar.q0);
                    }
                }
            }
            rbVar.q0 = sbVar.r.a;
            qaVar = sbVar.M0;
            if (qaVar != null) {
                f10 = Math.max(0.0f, f10);
            }
            float f142 = rbVar.q0 - f10;
            rbVar.q0 = f142;
            float max2 = Math.max(-measuredHeight, f142);
            rbVar.q0 = max2;
            if (sbVar.f0 == 1) {
            }
            f11 = rbVar.q0;
            if (f11 < 0.0f) {
            }
        }
        if (!sbVar.W) {
            float f15 = rbVar.s0 + f7;
            rbVar.s0 = f15;
            if (!sbVar.X && Math.abs(f15) >= AndroidUtilities.touchSlop) {
                fb fbVar2 = sbVar.A0;
                if (fbVar2 != null) {
                    fbVar2.d();
                }
                sbVar.X = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        va vaVar = this.a.t0.B0;
        if (vaVar == null) {
            return false;
        }
        b1 b1Var = vaVar.N;
        if (b1Var == null) {
            return true;
        }
        b1Var.run();
        vaVar.N = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sb sbVar = this.a.t0;
        sbVar.W = false;
        sbVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!sbVar.I() || motionEvent.getY() >= sbVar.M0.g()) {
            return false;
        }
        sbVar.e(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
