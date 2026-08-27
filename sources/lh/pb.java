package lh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.z10;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class pb extends z10 {
    public final /* synthetic */ rb a;

    public pb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // org.telegram.ui.Components.z10
    public final boolean a() {
        wa waVar;
        sb sbVar = this.a.A0;
        if (sbVar.b0 != 0 || (waVar = sbVar.x0) == null || sbVar.O1 || !waVar.isInited() || sbVar.L1 || sbVar.K0.t0) {
            return false;
        }
        i7 i7Var = sbVar.z0;
        return (i7Var == null || !(i7Var.x.h || i7Var.H)) && !sbVar.J() && sbVar.l2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        sb sbVar = this.a.A0;
        wa waVar = sbVar.x0;
        if (waVar == null || sbVar.O1 || sbVar.L1 || !waVar.isInited() || sbVar.b0 != 0 || sbVar.K1 == -1) {
            return false;
        }
        sbVar.x0.switchCamera();
        sbVar.K0.d(180.0f);
        sb.a0(sbVar.x0.isFrontface());
        if (sbVar.q0()) {
            sbVar.s.c(null);
            return true;
        }
        sbVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        wa waVar = this.a.A0.x0;
        if (waVar == null) {
            return false;
        }
        waVar.J = null;
        waVar.G = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        rb rbVar = this.a;
        rbVar.y0 = 0.0f;
        rbVar.z0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i7 i7Var;
        wa waVar;
        k81 k81Var;
        gb gbVar;
        rb rbVar = this.a;
        sb sbVar = rbVar.A0;
        ValueAnimator valueAnimator = sbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((i7Var = sbVar.z0) != null && (i7Var.x.h || i7Var.H)) || sbVar.K0.t0 || (((waVar = sbVar.x0) != null && waVar.s) || rbVar.w0 || (((k81Var = sbVar.R0) != null && (k81Var.B || k81Var.C)) || sbVar.I())))) {
            return false;
        }
        boolean z10 = true;
        rbVar.u0 = true;
        if (sbVar.S) {
            if (Math.abs(sbVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && sbVar.G <= 0.4f) {
                    sb.c(sbVar);
                } else {
                    sbVar.q(true);
                }
            } else if (sbVar.I0 != null && !sbVar.H0 && sbVar.K1 != -1) {
                if (Math.abs(f11) <= 200.0f || (sbVar.I0.d.canScrollVertically(-1) && sbVar.G0)) {
                    sbVar.f(!sbVar.M1 && sbVar.I0.getTranslationY() < ((float) sbVar.I0.getPadding()));
                } else {
                    sbVar.f(!sbVar.M1 && f11 < 0.0f);
                }
            }
            sbVar.H0 = false;
            sbVar.S = false;
            sbVar.T = false;
            if (z10 && (gbVar = sbVar.w0) != null) {
                gbVar.d();
            }
            return z10;
        }
        z10 = false;
        sbVar.H0 = false;
        sbVar.S = false;
        sbVar.T = false;
        if (z10) {
            gbVar.d();
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i7 i7Var;
        wa waVar;
        k81 k81Var;
        sa saVar;
        float f12;
        rb rbVar = this.a;
        sb sbVar = rbVar.A0;
        ValueAnimator valueAnimator = sbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || sbVar.k2 != null || sbVar.j2 != null || (((i7Var = sbVar.z0) != null && (i7Var.x.h || i7Var.H)) || sbVar.K0.t0 || (((waVar = sbVar.x0) != null && waVar.s) || rbVar.w0 || (((k81Var = sbVar.R0) != null && (k81Var.B || k81Var.C)) || sbVar.I() || sbVar.M1 || sbVar.L1 || sbVar.b0 != 0)))) {
            return false;
        }
        if (!sbVar.T) {
            float f13 = rbVar.y0 + f11;
            rbVar.y0 = f13;
            if (!sbVar.S && Math.abs(f13) >= AndroidUtilities.touchSlop) {
                gb gbVar = sbVar.w0;
                if (gbVar != null) {
                    gbVar.d();
                }
                sbVar.S = true;
            }
        }
        if (sbVar.S) {
            int measuredHeight = (sbVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            sa saVar2 = sbVar.I0;
            if (saVar2 != null) {
                float f14 = measuredHeight;
                if (saVar2.getTranslationY() < f14) {
                    rbVar.x0 = sbVar.I0.getTranslationY() - f14;
                    saVar = sbVar.I0;
                    if (saVar != null && saVar.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = rbVar.x0 - f11;
                    rbVar.x0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    rbVar.x0 = max;
                    if (sbVar.b0 == 1) {
                        rbVar.x0 = Math.max(0.0f, max);
                    }
                    f12 = rbVar.x0;
                    if (f12 < 0.0f) {
                        sbVar.r.setTranslationY(f12);
                        sa saVar3 = sbVar.I0;
                        if (saVar3 != null) {
                            saVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        sbVar.r.setTranslationY(0.0f);
                        if (sbVar.I0 == null) {
                            sbVar.t(false);
                        }
                        sbVar.I0.setTranslationY(measuredHeight + rbVar.x0);
                    }
                }
            }
            rbVar.x0 = sbVar.r.a;
            saVar = sbVar.I0;
            if (saVar != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = rbVar.x0 - f11;
            rbVar.x0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            rbVar.x0 = max2;
            if (sbVar.b0 == 1) {
            }
            f12 = rbVar.x0;
            if (f12 < 0.0f) {
            }
        }
        if (!sbVar.S) {
            float f16 = rbVar.z0 + f10;
            rbVar.z0 = f16;
            if (!sbVar.T && Math.abs(f16) >= AndroidUtilities.touchSlop) {
                gb gbVar2 = sbVar.w0;
                if (gbVar2 != null) {
                    gbVar2.d();
                }
                sbVar.T = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        wa waVar = this.a.A0.x0;
        if (waVar == null) {
            return false;
        }
        b1 b1Var = waVar.J;
        if (b1Var == null) {
            return true;
        }
        b1Var.run();
        waVar.J = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sb sbVar = this.a.A0;
        sbVar.S = false;
        sbVar.T = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!sbVar.J() || motionEvent.getY() >= sbVar.I0.g()) {
            return false;
        }
        sbVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
