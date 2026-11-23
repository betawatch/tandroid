package hi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.n10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class kb extends n10 {
    public final /* synthetic */ mb a;

    public kb(mb mbVar) {
        this.a = mbVar;
    }

    @Override // org.telegram.ui.Components.n10
    public final boolean a() {
        qa qaVar;
        nb nbVar = this.a.o0;
        if (nbVar.g0 != 0 || (qaVar = nbVar.C0) == null || nbVar.T1 || !qaVar.isInited() || nbVar.Q1 || nbVar.P0.y0) {
            return false;
        }
        x6 x6Var = nbVar.E0;
        return (x6Var == null || !(x6Var.y.i || x6Var.M)) && !nbVar.I() && nbVar.q2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        nb nbVar = this.a.o0;
        qa qaVar = nbVar.C0;
        if (qaVar == null || nbVar.T1 || nbVar.Q1 || !qaVar.isInited() || nbVar.g0 != 0 || nbVar.P1 == -1) {
            return false;
        }
        nbVar.C0.switchCamera();
        nbVar.P0.d(180.0f);
        nb.Z(nbVar.C0.isFrontface());
        if (nbVar.p0()) {
            nbVar.s.c(null);
            return true;
        }
        nbVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        qa qaVar = this.a.o0.C0;
        if (qaVar == null) {
            return false;
        }
        qaVar.O = null;
        qaVar.L = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        mb mbVar = this.a;
        mbVar.m0 = 0.0f;
        mbVar.n0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x6 x6Var;
        qa qaVar;
        g81 g81Var;
        ab abVar;
        mb mbVar = this.a;
        nb nbVar = mbVar.o0;
        ValueAnimator valueAnimator = nbVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((x6Var = nbVar.E0) != null && (x6Var.y.i || x6Var.M)) || nbVar.P0.y0 || (((qaVar = nbVar.C0) != null && qaVar.s) || mbVar.k0 || (((g81Var = nbVar.W0) != null && (g81Var.G || g81Var.H)) || nbVar.H())))) {
            return false;
        }
        boolean z10 = true;
        mbVar.i0 = true;
        if (nbVar.X) {
            if (Math.abs(nbVar.r.a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && nbVar.L <= 0.4f) {
                    nb.b(nbVar);
                } else {
                    nbVar.p(true);
                }
            } else if (nbVar.N0 != null && !nbVar.M0 && nbVar.P1 != -1) {
                if (Math.abs(f11) <= 200.0f || (nbVar.N0.d.canScrollVertically(-1) && nbVar.L0)) {
                    nbVar.e(!nbVar.R1 && nbVar.N0.getTranslationY() < ((float) nbVar.N0.getPadding()));
                } else {
                    nbVar.e(!nbVar.R1 && f11 < 0.0f);
                }
            }
            nbVar.M0 = false;
            nbVar.X = false;
            nbVar.Y = false;
            if (z10 && (abVar = nbVar.B0) != null) {
                abVar.b();
            }
            return z10;
        }
        z10 = false;
        nbVar.M0 = false;
        nbVar.X = false;
        nbVar.Y = false;
        if (z10) {
            abVar.b();
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x6 x6Var;
        qa qaVar;
        g81 g81Var;
        p3 p3Var;
        float f12;
        mb mbVar = this.a;
        nb nbVar = mbVar.o0;
        ValueAnimator valueAnimator = nbVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || nbVar.p2 != null || nbVar.o2 != null || (((x6Var = nbVar.E0) != null && (x6Var.y.i || x6Var.M)) || nbVar.P0.y0 || (((qaVar = nbVar.C0) != null && qaVar.s) || mbVar.k0 || (((g81Var = nbVar.W0) != null && (g81Var.G || g81Var.H)) || nbVar.H() || nbVar.R1 || nbVar.Q1 || nbVar.g0 != 0)))) {
            return false;
        }
        if (!nbVar.Y) {
            float f13 = mbVar.m0 + f11;
            mbVar.m0 = f13;
            if (!nbVar.X && Math.abs(f13) >= org.telegram.messenger.g0.e) {
                ab abVar = nbVar.B0;
                if (abVar != null) {
                    abVar.b();
                }
                nbVar.X = true;
            }
        }
        if (nbVar.X) {
            int measuredHeight = (nbVar.n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
            p3 p3Var2 = nbVar.N0;
            if (p3Var2 != null) {
                float f14 = measuredHeight;
                if (p3Var2.getTranslationY() < f14) {
                    mbVar.l0 = nbVar.N0.getTranslationY() - f14;
                    p3Var = nbVar.N0;
                    if (p3Var != null && p3Var.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = mbVar.l0 - f11;
                    mbVar.l0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    mbVar.l0 = max;
                    if (nbVar.g0 == 1) {
                        mbVar.l0 = Math.max(0.0f, max);
                    }
                    f12 = mbVar.l0;
                    if (f12 < 0.0f) {
                        nbVar.r.setTranslationY(f12);
                        p3 p3Var3 = nbVar.N0;
                        if (p3Var3 != null) {
                            p3Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        nbVar.r.setTranslationY(0.0f);
                        if (nbVar.N0 == null) {
                            nbVar.s(false);
                        }
                        nbVar.N0.setTranslationY(measuredHeight + mbVar.l0);
                    }
                }
            }
            mbVar.l0 = nbVar.r.a;
            p3Var = nbVar.N0;
            if (p3Var != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = mbVar.l0 - f11;
            mbVar.l0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            mbVar.l0 = max2;
            if (nbVar.g0 == 1) {
            }
            f12 = mbVar.l0;
            if (f12 < 0.0f) {
            }
        }
        if (!nbVar.X) {
            float f16 = mbVar.n0 + f10;
            mbVar.n0 = f16;
            if (!nbVar.Y && Math.abs(f16) >= org.telegram.messenger.g0.e) {
                ab abVar2 = nbVar.B0;
                if (abVar2 != null) {
                    abVar2.b();
                }
                nbVar.Y = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        qa qaVar = this.a.o0.C0;
        if (qaVar == null) {
            return false;
        }
        k1 k1Var = qaVar.O;
        if (k1Var == null) {
            return true;
        }
        k1Var.run();
        qaVar.O = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        nb nbVar = this.a.o0;
        nbVar.X = false;
        nbVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!nbVar.I() || motionEvent.getY() >= nbVar.N0.g()) {
            return false;
        }
        nbVar.e(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
