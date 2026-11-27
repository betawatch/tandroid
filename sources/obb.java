// default package

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class obb extends tu4 {
    public final /* synthetic */ qbb a;

    public obb(qbb qbbVar) {
        this.a = qbbVar;
    }

    @Override // tu4
    public final boolean a() {
        wab wabVar;
        rbb rbbVar = this.a.o0;
        if (rbbVar.g0 != 0 || (wabVar = rbbVar.C0) == null || rbbVar.T1 || !wabVar.isInited() || rbbVar.Q1 || rbbVar.P0.y0) {
            return false;
        }
        du9 du9Var = rbbVar.E0;
        return (du9Var == null || !(du9Var.y.i || du9Var.M)) && !rbbVar.H() && rbbVar.q2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        rbb rbbVar = this.a.o0;
        wab wabVar = rbbVar.C0;
        if (wabVar == null || rbbVar.T1 || rbbVar.Q1 || !wabVar.isInited() || rbbVar.g0 != 0 || rbbVar.P1 == -1) {
            return false;
        }
        rbbVar.C0.switchCamera();
        rbbVar.P0.d(180.0f);
        uc7.e1().edit().putBoolean("stories_camera", rbbVar.C0.isFrontface()).apply();
        if (rbbVar.p0()) {
            rbbVar.s.c(null);
            return true;
        }
        rbbVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        wab wabVar = this.a.o0.C0;
        if (wabVar == null) {
            return false;
        }
        wabVar.O = null;
        wabVar.L = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        qbb qbbVar = this.a;
        qbbVar.m0 = 0.0f;
        qbbVar.n0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        du9 du9Var;
        wab wabVar;
        r3d r3dVar;
        fbb fbbVar;
        qbb qbbVar = this.a;
        rbb rbbVar = qbbVar.o0;
        ValueAnimator valueAnimator = rbbVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((du9Var = rbbVar.E0) != null && (du9Var.y.i || du9Var.M)) || rbbVar.P0.y0 || (((wabVar = rbbVar.C0) != null && wabVar.s) || qbbVar.k0 || (((r3dVar = rbbVar.W0) != null && (r3dVar.G || r3dVar.H)) || rbbVar.G())))) {
            return false;
        }
        boolean z = true;
        qbbVar.i0 = true;
        if (rbbVar.X) {
            if (Math.abs(rbbVar.r.a) >= hl.L(1.0f)) {
                if ((f2 <= 0.0f || Math.abs(f2) <= 2000.0f || Math.abs(f2) <= Math.abs(f)) && rbbVar.L <= 0.4f) {
                    rbbVar.b();
                } else {
                    rbbVar.o(true);
                }
            } else if (rbbVar.N0 != null && !rbbVar.M0 && rbbVar.P1 != -1) {
                if (Math.abs(f2) <= 200.0f || (rbbVar.N0.d.canScrollVertically(-1) && rbbVar.L0)) {
                    rbbVar.c(!rbbVar.R1 && rbbVar.N0.getTranslationY() < ((float) rbbVar.N0.getPadding()));
                } else {
                    rbbVar.c(!rbbVar.R1 && f2 < 0.0f);
                }
            }
            rbbVar.M0 = false;
            rbbVar.X = false;
            rbbVar.Y = false;
            if (z && (fbbVar = rbbVar.B0) != null) {
                fbbVar.a();
            }
            return z;
        }
        z = false;
        rbbVar.M0 = false;
        rbbVar.X = false;
        rbbVar.Y = false;
        if (z) {
            fbbVar.a();
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        du9 du9Var;
        wab wabVar;
        r3d r3dVar;
        zt4 zt4Var;
        float max;
        qbb qbbVar = this.a;
        rbb rbbVar = qbbVar.o0;
        ValueAnimator valueAnimator = rbbVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || rbbVar.p2 != null || rbbVar.o2 != null || (((du9Var = rbbVar.E0) != null && (du9Var.y.i || du9Var.M)) || rbbVar.P0.y0 || (((wabVar = rbbVar.C0) != null && wabVar.s) || qbbVar.k0 || (((r3dVar = rbbVar.W0) != null && (r3dVar.G || r3dVar.H)) || rbbVar.G() || rbbVar.R1 || rbbVar.Q1 || rbbVar.g0 != 0)))) {
            return false;
        }
        if (!rbbVar.Y) {
            float f3 = qbbVar.m0 + f2;
            qbbVar.m0 = f3;
            if (!rbbVar.X && Math.abs(f3) >= hl.e) {
                fbb fbbVar = rbbVar.B0;
                if (fbbVar != null) {
                    fbbVar.a();
                }
                rbbVar.X = true;
            }
        }
        if (rbbVar.X) {
            int measuredHeight = (rbbVar.n.getMeasuredHeight() - ((int) (hl.q.y * 0.35f))) - (a.getCurrentActionBarHeight() + hl.m);
            zt4 zt4Var2 = rbbVar.N0;
            if (zt4Var2 != null) {
                float f4 = measuredHeight;
                if (zt4Var2.getTranslationY() < f4) {
                    qbbVar.l0 = rbbVar.N0.getTranslationY() - f4;
                    zt4Var = rbbVar.N0;
                    if (zt4Var != null && zt4Var.d.canScrollVertically(-1)) {
                        f2 = Math.max(0.0f, f2);
                    }
                    float f5 = qbbVar.l0 - f2;
                    qbbVar.l0 = f5;
                    max = Math.max(-measuredHeight, f5);
                    qbbVar.l0 = max;
                    if (rbbVar.g0 == 1) {
                        max = Math.max(0.0f, max);
                        qbbVar.l0 = max;
                    }
                    if (max < 0.0f) {
                        rbbVar.r.setTranslationY(max);
                        zt4 zt4Var3 = rbbVar.N0;
                        if (zt4Var3 != null) {
                            zt4Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        rbbVar.r.setTranslationY(0.0f);
                        if (rbbVar.N0 == null) {
                            rbbVar.r(false);
                        }
                        rbbVar.N0.setTranslationY(measuredHeight + qbbVar.l0);
                    }
                }
            }
            qbbVar.l0 = rbbVar.r.a;
            zt4Var = rbbVar.N0;
            if (zt4Var != null) {
                f2 = Math.max(0.0f, f2);
            }
            float f52 = qbbVar.l0 - f2;
            qbbVar.l0 = f52;
            max = Math.max(-measuredHeight, f52);
            qbbVar.l0 = max;
            if (rbbVar.g0 == 1) {
            }
            if (max < 0.0f) {
            }
        }
        if (!rbbVar.X) {
            float f6 = qbbVar.n0 + f;
            qbbVar.n0 = f6;
            if (!rbbVar.Y && Math.abs(f6) >= hl.e) {
                fbb fbbVar2 = rbbVar.B0;
                if (fbbVar2 != null) {
                    fbbVar2.a();
                }
                rbbVar.Y = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        wab wabVar = this.a.o0.C0;
        if (wabVar == null) {
            return false;
        }
        zr3 zr3Var = wabVar.O;
        if (zr3Var == null) {
            return true;
        }
        zr3Var.run();
        wabVar.O = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        rbb rbbVar = this.a.o0;
        rbbVar.X = false;
        rbbVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!rbbVar.H() || motionEvent.getY() >= rbbVar.N0.g()) {
            return false;
        }
        rbbVar.c(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
