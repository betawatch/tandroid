package ci;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.r91;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class lc extends l20 {
    public final /* synthetic */ nc a;

    public lc(nc ncVar) {
        this.a = ncVar;
    }

    @Override // org.telegram.ui.Components.l20
    public final boolean a() {
        rb rbVar;
        oc ocVar = this.a.E0;
        if (ocVar.f0 != 0 || (rbVar = ocVar.B0) == null || ocVar.S1 || !rbVar.isInited() || ocVar.P1 || ocVar.O0.x0) {
            return false;
        }
        w7 w7Var = ocVar.D0;
        return (w7Var == null || !(w7Var.x.h || w7Var.L)) && !ocVar.J() && ocVar.p2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        oc ocVar = this.a.E0;
        rb rbVar = ocVar.B0;
        if (rbVar == null || ocVar.S1 || ocVar.P1 || !rbVar.isInited() || ocVar.f0 != 0 || ocVar.O1 == -1) {
            return false;
        }
        ocVar.B0.switchCamera();
        ocVar.O0.d(180.0f);
        oc.a0(ocVar.B0.isFrontface());
        if (ocVar.q0()) {
            ocVar.s.c(null);
            return true;
        }
        ocVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        rb rbVar = this.a.E0.B0;
        if (rbVar == null) {
            return false;
        }
        rbVar.N = null;
        rbVar.K = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        nc ncVar = this.a;
        ncVar.C0 = 0.0f;
        ncVar.D0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w7 w7Var;
        rb rbVar;
        r91 r91Var;
        bc bcVar;
        nc ncVar = this.a;
        oc ocVar = ncVar.E0;
        ValueAnimator valueAnimator = ocVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((w7Var = ocVar.D0) != null && (w7Var.x.h || w7Var.L)) || ocVar.O0.x0 || (((rbVar = ocVar.B0) != null && rbVar.s) || ncVar.A0 || (((r91Var = ocVar.V0) != null && (r91Var.F || r91Var.G)) || ocVar.I())))) {
            return false;
        }
        boolean z10 = true;
        ncVar.y0 = true;
        if (ocVar.W) {
            if (Math.abs(ocVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 <= 0.0f || Math.abs(f10) <= 2000.0f || Math.abs(f10) <= Math.abs(f7)) && ocVar.K <= 0.4f) {
                    oc.c(ocVar);
                } else {
                    ocVar.q(true);
                }
            } else if (ocVar.M0 != null && !ocVar.L0 && ocVar.O1 != -1) {
                if (Math.abs(f10) <= 200.0f || (ocVar.M0.d.canScrollVertically(-1) && ocVar.K0)) {
                    ocVar.f(!ocVar.Q1 && ocVar.M0.getTranslationY() < ((float) ocVar.M0.getPadding()));
                } else {
                    ocVar.f(!ocVar.Q1 && f10 < 0.0f);
                }
            }
            ocVar.L0 = false;
            ocVar.W = false;
            ocVar.X = false;
            if (z10 && (bcVar = ocVar.A0) != null) {
                bcVar.d();
            }
            return z10;
        }
        z10 = false;
        ocVar.L0 = false;
        ocVar.W = false;
        ocVar.X = false;
        if (z10) {
            bcVar.d();
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
        w7 w7Var;
        rb rbVar;
        r91 r91Var;
        nb nbVar;
        float f11;
        nc ncVar = this.a;
        oc ocVar = ncVar.E0;
        ValueAnimator valueAnimator = ocVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || ocVar.o2 != null || ocVar.n2 != null || (((w7Var = ocVar.D0) != null && (w7Var.x.h || w7Var.L)) || ocVar.O0.x0 || (((rbVar = ocVar.B0) != null && rbVar.s) || ncVar.A0 || (((r91Var = ocVar.V0) != null && (r91Var.F || r91Var.G)) || ocVar.I() || ocVar.Q1 || ocVar.P1 || ocVar.f0 != 0)))) {
            return false;
        }
        if (!ocVar.X) {
            float f12 = ncVar.C0 + f10;
            ncVar.C0 = f12;
            if (!ocVar.W && Math.abs(f12) >= AndroidUtilities.touchSlop) {
                bc bcVar = ocVar.A0;
                if (bcVar != null) {
                    bcVar.d();
                }
                ocVar.W = true;
            }
        }
        if (ocVar.W) {
            int measuredHeight = (ocVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            nb nbVar2 = ocVar.M0;
            if (nbVar2 != null) {
                float f13 = measuredHeight;
                if (nbVar2.getTranslationY() < f13) {
                    ncVar.B0 = ocVar.M0.getTranslationY() - f13;
                    nbVar = ocVar.M0;
                    if (nbVar != null && nbVar.d.canScrollVertically(-1)) {
                        f10 = Math.max(0.0f, f10);
                    }
                    float f14 = ncVar.B0 - f10;
                    ncVar.B0 = f14;
                    float max = Math.max(-measuredHeight, f14);
                    ncVar.B0 = max;
                    if (ocVar.f0 == 1) {
                        ncVar.B0 = Math.max(0.0f, max);
                    }
                    f11 = ncVar.B0;
                    if (f11 < 0.0f) {
                        ocVar.r.setTranslationY(f11);
                        nb nbVar3 = ocVar.M0;
                        if (nbVar3 != null) {
                            nbVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        ocVar.r.setTranslationY(0.0f);
                        if (ocVar.M0 == null) {
                            ocVar.t(false);
                        }
                        ocVar.M0.setTranslationY(measuredHeight + ncVar.B0);
                    }
                }
            }
            ncVar.B0 = ocVar.r.a;
            nbVar = ocVar.M0;
            if (nbVar != null) {
                f10 = Math.max(0.0f, f10);
            }
            float f142 = ncVar.B0 - f10;
            ncVar.B0 = f142;
            float max2 = Math.max(-measuredHeight, f142);
            ncVar.B0 = max2;
            if (ocVar.f0 == 1) {
            }
            f11 = ncVar.B0;
            if (f11 < 0.0f) {
            }
        }
        if (!ocVar.W) {
            float f15 = ncVar.D0 + f7;
            ncVar.D0 = f15;
            if (!ocVar.X && Math.abs(f15) >= AndroidUtilities.touchSlop) {
                bc bcVar2 = ocVar.A0;
                if (bcVar2 != null) {
                    bcVar2.d();
                }
                ocVar.X = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        rb rbVar = this.a.E0.B0;
        if (rbVar == null) {
            return false;
        }
        c1 c1Var = rbVar.N;
        if (c1Var == null) {
            return true;
        }
        c1Var.run();
        rbVar.N = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        oc ocVar = this.a.E0;
        ocVar.W = false;
        ocVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!ocVar.J() || motionEvent.getY() >= ocVar.M0.g()) {
            return false;
        }
        ocVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
