package kh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.w10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class tb extends w10 {
    public final /* synthetic */ vb a;

    public tb(vb vbVar) {
        this.a = vbVar;
    }

    @Override // org.telegram.ui.Components.w10
    public final boolean a() {
        za zaVar;
        wb wbVar = this.a.A0;
        if (wbVar.b0 != 0 || (zaVar = wbVar.x0) == null || wbVar.O1 || !zaVar.isInited() || wbVar.L1 || wbVar.K0.t0) {
            return false;
        }
        k7 k7Var = wbVar.z0;
        return (k7Var == null || !(k7Var.x.h || k7Var.H)) && !wbVar.J() && wbVar.l2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        wb wbVar = this.a.A0;
        za zaVar = wbVar.x0;
        if (zaVar == null || wbVar.O1 || wbVar.L1 || !zaVar.isInited() || wbVar.b0 != 0 || wbVar.K1 == -1) {
            return false;
        }
        wbVar.x0.switchCamera();
        wbVar.K0.d(180.0f);
        wb.a0(wbVar.x0.isFrontface());
        if (wbVar.q0()) {
            wbVar.s.c(null);
            return true;
        }
        wbVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        za zaVar = this.a.A0.x0;
        if (zaVar == null) {
            return false;
        }
        zaVar.J = null;
        zaVar.G = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        vb vbVar = this.a;
        vbVar.y0 = 0.0f;
        vbVar.z0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        k7 k7Var;
        za zaVar;
        i81 i81Var;
        jb jbVar;
        vb vbVar = this.a;
        wb wbVar = vbVar.A0;
        ValueAnimator valueAnimator = wbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((k7Var = wbVar.z0) != null && (k7Var.x.h || k7Var.H)) || wbVar.K0.t0 || (((zaVar = wbVar.x0) != null && zaVar.s) || vbVar.w0 || (((i81Var = wbVar.R0) != null && (i81Var.B || i81Var.C)) || wbVar.I())))) {
            return false;
        }
        boolean z10 = true;
        vbVar.u0 = true;
        if (wbVar.S) {
            if (Math.abs(wbVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && wbVar.G <= 0.4f) {
                    wb.c(wbVar);
                } else {
                    wbVar.q(true);
                }
            } else if (wbVar.I0 != null && !wbVar.H0 && wbVar.K1 != -1) {
                if (Math.abs(f11) <= 200.0f || (wbVar.I0.d.canScrollVertically(-1) && wbVar.G0)) {
                    wbVar.f(!wbVar.M1 && wbVar.I0.getTranslationY() < ((float) wbVar.I0.getPadding()));
                } else {
                    wbVar.f(!wbVar.M1 && f11 < 0.0f);
                }
            }
            wbVar.H0 = false;
            wbVar.S = false;
            wbVar.T = false;
            if (z10 && (jbVar = wbVar.w0) != null) {
                jbVar.d();
            }
            return z10;
        }
        z10 = false;
        wbVar.H0 = false;
        wbVar.S = false;
        wbVar.T = false;
        if (z10) {
            jbVar.d();
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
        k7 k7Var;
        za zaVar;
        i81 i81Var;
        va vaVar;
        float f12;
        vb vbVar = this.a;
        wb wbVar = vbVar.A0;
        ValueAnimator valueAnimator = wbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || wbVar.k2 != null || wbVar.j2 != null || (((k7Var = wbVar.z0) != null && (k7Var.x.h || k7Var.H)) || wbVar.K0.t0 || (((zaVar = wbVar.x0) != null && zaVar.s) || vbVar.w0 || (((i81Var = wbVar.R0) != null && (i81Var.B || i81Var.C)) || wbVar.I() || wbVar.M1 || wbVar.L1 || wbVar.b0 != 0)))) {
            return false;
        }
        if (!wbVar.T) {
            float f13 = vbVar.y0 + f11;
            vbVar.y0 = f13;
            if (!wbVar.S && Math.abs(f13) >= AndroidUtilities.touchSlop) {
                jb jbVar = wbVar.w0;
                if (jbVar != null) {
                    jbVar.d();
                }
                wbVar.S = true;
            }
        }
        if (wbVar.S) {
            int measuredHeight = (wbVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            va vaVar2 = wbVar.I0;
            if (vaVar2 != null) {
                float f14 = measuredHeight;
                if (vaVar2.getTranslationY() < f14) {
                    vbVar.x0 = wbVar.I0.getTranslationY() - f14;
                    vaVar = wbVar.I0;
                    if (vaVar != null && vaVar.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = vbVar.x0 - f11;
                    vbVar.x0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    vbVar.x0 = max;
                    if (wbVar.b0 == 1) {
                        vbVar.x0 = Math.max(0.0f, max);
                    }
                    f12 = vbVar.x0;
                    if (f12 < 0.0f) {
                        wbVar.r.setTranslationY(f12);
                        va vaVar3 = wbVar.I0;
                        if (vaVar3 != null) {
                            vaVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        wbVar.r.setTranslationY(0.0f);
                        if (wbVar.I0 == null) {
                            wbVar.t(false);
                        }
                        wbVar.I0.setTranslationY(measuredHeight + vbVar.x0);
                    }
                }
            }
            vbVar.x0 = wbVar.r.a;
            vaVar = wbVar.I0;
            if (vaVar != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = vbVar.x0 - f11;
            vbVar.x0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            vbVar.x0 = max2;
            if (wbVar.b0 == 1) {
            }
            f12 = vbVar.x0;
            if (f12 < 0.0f) {
            }
        }
        if (!wbVar.S) {
            float f16 = vbVar.z0 + f10;
            vbVar.z0 = f16;
            if (!wbVar.T && Math.abs(f16) >= AndroidUtilities.touchSlop) {
                jb jbVar2 = wbVar.w0;
                if (jbVar2 != null) {
                    jbVar2.d();
                }
                wbVar.T = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        za zaVar = this.a.A0.x0;
        if (zaVar == null) {
            return false;
        }
        c1 c1Var = zaVar.J;
        if (c1Var == null) {
            return true;
        }
        c1Var.run();
        zaVar.J = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        wb wbVar = this.a.A0;
        wbVar.S = false;
        wbVar.T = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!wbVar.J() || motionEvent.getY() >= wbVar.I0.g()) {
            return false;
        }
        wbVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
