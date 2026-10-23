package ei;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fa1;
import org.telegram.ui.Components.u20;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class sb extends u20 {
    public final /* synthetic */ ub a;

    public sb(ub ubVar) {
        this.a = ubVar;
    }

    @Override // org.telegram.ui.Components.u20
    public final boolean a() {
        ya yaVar;
        vb vbVar = this.a.E0;
        if (vbVar.f0 != 0 || (yaVar = vbVar.B0) == null || vbVar.S1 || !yaVar.isInited() || vbVar.P1 || vbVar.O0.x0) {
            return false;
        }
        j7 j7Var = vbVar.D0;
        return (j7Var == null || !(j7Var.x.i || j7Var.L)) && !vbVar.I() && vbVar.p2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        vb vbVar = this.a.E0;
        ya yaVar = vbVar.B0;
        if (yaVar == null || vbVar.S1 || vbVar.P1 || !yaVar.isInited() || vbVar.f0 != 0 || vbVar.O1 == -1) {
            return false;
        }
        vbVar.B0.switchCamera();
        vbVar.O0.d(180.0f);
        vb.Z(vbVar.B0.isFrontface());
        if (vbVar.p0()) {
            vbVar.s.c(null);
            return true;
        }
        vbVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        ya yaVar = this.a.E0.B0;
        if (yaVar == null) {
            return false;
        }
        yaVar.N = null;
        yaVar.K = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ub ubVar = this.a;
        ubVar.C0 = 0.0f;
        ubVar.D0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        j7 j7Var;
        ya yaVar;
        fa1 fa1Var;
        ib ibVar;
        ub ubVar = this.a;
        vb vbVar = ubVar.E0;
        ValueAnimator valueAnimator = vbVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((j7Var = vbVar.D0) != null && (j7Var.x.i || j7Var.L)) || vbVar.O0.x0 || (((yaVar = vbVar.B0) != null && yaVar.s) || ubVar.A0 || (((fa1Var = vbVar.V0) != null && (fa1Var.F || fa1Var.G)) || vbVar.H())))) {
            return false;
        }
        boolean z10 = true;
        ubVar.y0 = true;
        if (vbVar.W) {
            if (Math.abs(vbVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 <= 0.0f || Math.abs(f10) <= 2000.0f || Math.abs(f10) <= Math.abs(f7)) && vbVar.K <= 0.4f) {
                    vb.b(vbVar);
                } else {
                    vbVar.p(true);
                }
            } else if (vbVar.M0 != null && !vbVar.L0 && vbVar.O1 != -1) {
                if (Math.abs(f10) <= 200.0f || (vbVar.M0.d.canScrollVertically(-1) && vbVar.K0)) {
                    vbVar.e(!vbVar.Q1 && vbVar.M0.getTranslationY() < ((float) vbVar.M0.getPadding()));
                } else {
                    vbVar.e(!vbVar.Q1 && f10 < 0.0f);
                }
            }
            vbVar.L0 = false;
            vbVar.W = false;
            vbVar.X = false;
            if (z10 && (ibVar = vbVar.A0) != null) {
                ibVar.d();
            }
            return z10;
        }
        z10 = false;
        vbVar.L0 = false;
        vbVar.W = false;
        vbVar.X = false;
        if (z10) {
            ibVar.d();
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
        j7 j7Var;
        ya yaVar;
        fa1 fa1Var;
        ua uaVar;
        float f11;
        ub ubVar = this.a;
        vb vbVar = ubVar.E0;
        ValueAnimator valueAnimator = vbVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || vbVar.o2 != null || vbVar.n2 != null || (((j7Var = vbVar.D0) != null && (j7Var.x.i || j7Var.L)) || vbVar.O0.x0 || (((yaVar = vbVar.B0) != null && yaVar.s) || ubVar.A0 || (((fa1Var = vbVar.V0) != null && (fa1Var.F || fa1Var.G)) || vbVar.H() || vbVar.Q1 || vbVar.P1 || vbVar.f0 != 0)))) {
            return false;
        }
        if (!vbVar.X) {
            float f12 = ubVar.C0 + f10;
            ubVar.C0 = f12;
            if (!vbVar.W && Math.abs(f12) >= AndroidUtilities.touchSlop) {
                ib ibVar = vbVar.A0;
                if (ibVar != null) {
                    ibVar.d();
                }
                vbVar.W = true;
            }
        }
        if (vbVar.W) {
            int measuredHeight = (vbVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ua uaVar2 = vbVar.M0;
            if (uaVar2 != null) {
                float f13 = measuredHeight;
                if (uaVar2.getTranslationY() < f13) {
                    ubVar.B0 = vbVar.M0.getTranslationY() - f13;
                    uaVar = vbVar.M0;
                    if (uaVar != null && uaVar.d.canScrollVertically(-1)) {
                        f10 = Math.max(0.0f, f10);
                    }
                    float f14 = ubVar.B0 - f10;
                    ubVar.B0 = f14;
                    float max = Math.max(-measuredHeight, f14);
                    ubVar.B0 = max;
                    if (vbVar.f0 == 1) {
                        ubVar.B0 = Math.max(0.0f, max);
                    }
                    f11 = ubVar.B0;
                    if (f11 < 0.0f) {
                        vbVar.r.setTranslationY(f11);
                        ua uaVar3 = vbVar.M0;
                        if (uaVar3 != null) {
                            uaVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        vbVar.r.setTranslationY(0.0f);
                        if (vbVar.M0 == null) {
                            vbVar.s(false);
                        }
                        vbVar.M0.setTranslationY(measuredHeight + ubVar.B0);
                    }
                }
            }
            ubVar.B0 = vbVar.r.a;
            uaVar = vbVar.M0;
            if (uaVar != null) {
                f10 = Math.max(0.0f, f10);
            }
            float f142 = ubVar.B0 - f10;
            ubVar.B0 = f142;
            float max2 = Math.max(-measuredHeight, f142);
            ubVar.B0 = max2;
            if (vbVar.f0 == 1) {
            }
            f11 = ubVar.B0;
            if (f11 < 0.0f) {
            }
        }
        if (!vbVar.W) {
            float f15 = ubVar.D0 + f7;
            ubVar.D0 = f15;
            if (!vbVar.X && Math.abs(f15) >= AndroidUtilities.touchSlop) {
                ib ibVar2 = vbVar.A0;
                if (ibVar2 != null) {
                    ibVar2.d();
                }
                vbVar.X = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ya yaVar = this.a.E0.B0;
        if (yaVar == null) {
            return false;
        }
        b1 b1Var = yaVar.N;
        if (b1Var == null) {
            return true;
        }
        b1Var.run();
        yaVar.N = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        vb vbVar = this.a.E0;
        vbVar.W = false;
        vbVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!vbVar.I() || motionEvent.getY() >= vbVar.M0.g()) {
            return false;
        }
        vbVar.e(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
