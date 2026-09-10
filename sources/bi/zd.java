package bi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.u20;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class zd extends u20 {
    public final /* synthetic */ be a;

    public zd(be beVar) {
        this.a = beVar;
    }

    @Override // org.telegram.ui.Components.u20
    public final boolean a() {
        bd bdVar;
        ce ceVar = this.a.E0;
        if (ceVar.f0 != 0 || (bdVar = ceVar.B0) == null || ceVar.S1 || !bdVar.isInited() || ceVar.P1 || ceVar.O0.x0) {
            return false;
        }
        x8 x8Var = ceVar.D0;
        return (x8Var == null || !(x8Var.x.h || x8Var.L)) && !ceVar.J() && ceVar.p2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ce ceVar = this.a.E0;
        bd bdVar = ceVar.B0;
        if (bdVar == null || ceVar.S1 || ceVar.P1 || !bdVar.isInited() || ceVar.f0 != 0 || ceVar.O1 == -1) {
            return false;
        }
        ceVar.B0.switchCamera();
        ceVar.O0.d(180.0f);
        ce.a0(ceVar.B0.isFrontface());
        if (ceVar.q0()) {
            ceVar.s.c(null);
            return true;
        }
        ceVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        bd bdVar = this.a.E0.B0;
        if (bdVar == null) {
            return false;
        }
        bdVar.N = null;
        bdVar.K = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        be beVar = this.a;
        beVar.C0 = 0.0f;
        beVar.D0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        x8 x8Var;
        bd bdVar;
        q91 q91Var;
        md mdVar;
        be beVar = this.a;
        ce ceVar = beVar.E0;
        ValueAnimator valueAnimator = ceVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((x8Var = ceVar.D0) != null && (x8Var.x.h || x8Var.L)) || ceVar.O0.x0 || (((bdVar = ceVar.B0) != null && bdVar.s) || beVar.A0 || (((q91Var = ceVar.V0) != null && (q91Var.F || q91Var.G)) || ceVar.I())))) {
            return false;
        }
        boolean z10 = true;
        beVar.y0 = true;
        if (ceVar.W) {
            if (Math.abs(ceVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 <= 0.0f || Math.abs(f10) <= 2000.0f || Math.abs(f10) <= Math.abs(f7)) && ceVar.K <= 0.4f) {
                    ce.c(ceVar);
                } else {
                    ceVar.q(true);
                }
            } else if (ceVar.M0 != null && !ceVar.L0 && ceVar.O1 != -1) {
                if (Math.abs(f10) <= 200.0f || (ceVar.M0.d.canScrollVertically(-1) && ceVar.K0)) {
                    ceVar.f(!ceVar.Q1 && ceVar.M0.getTranslationY() < ((float) ceVar.M0.getPadding()));
                } else {
                    ceVar.f(!ceVar.Q1 && f10 < 0.0f);
                }
            }
            ceVar.L0 = false;
            ceVar.W = false;
            ceVar.X = false;
            if (z10 && (mdVar = ceVar.A0) != null) {
                mdVar.d();
            }
            return z10;
        }
        z10 = false;
        ceVar.L0 = false;
        ceVar.W = false;
        ceVar.X = false;
        if (z10) {
            mdVar.d();
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
        x8 x8Var;
        bd bdVar;
        q91 q91Var;
        xc xcVar;
        float f11;
        be beVar = this.a;
        ce ceVar = beVar.E0;
        ValueAnimator valueAnimator = ceVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || ceVar.o2 != null || ceVar.n2 != null || (((x8Var = ceVar.D0) != null && (x8Var.x.h || x8Var.L)) || ceVar.O0.x0 || (((bdVar = ceVar.B0) != null && bdVar.s) || beVar.A0 || (((q91Var = ceVar.V0) != null && (q91Var.F || q91Var.G)) || ceVar.I() || ceVar.Q1 || ceVar.P1 || ceVar.f0 != 0)))) {
            return false;
        }
        if (!ceVar.X) {
            float f12 = beVar.C0 + f10;
            beVar.C0 = f12;
            if (!ceVar.W && Math.abs(f12) >= AndroidUtilities.touchSlop) {
                md mdVar = ceVar.A0;
                if (mdVar != null) {
                    mdVar.d();
                }
                ceVar.W = true;
            }
        }
        if (ceVar.W) {
            int measuredHeight = (ceVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            xc xcVar2 = ceVar.M0;
            if (xcVar2 != null) {
                float f13 = measuredHeight;
                if (xcVar2.getTranslationY() < f13) {
                    beVar.B0 = ceVar.M0.getTranslationY() - f13;
                    xcVar = ceVar.M0;
                    if (xcVar != null && xcVar.d.canScrollVertically(-1)) {
                        f10 = Math.max(0.0f, f10);
                    }
                    float f14 = beVar.B0 - f10;
                    beVar.B0 = f14;
                    float max = Math.max(-measuredHeight, f14);
                    beVar.B0 = max;
                    if (ceVar.f0 == 1) {
                        beVar.B0 = Math.max(0.0f, max);
                    }
                    f11 = beVar.B0;
                    if (f11 < 0.0f) {
                        ceVar.r.setTranslationY(f11);
                        xc xcVar3 = ceVar.M0;
                        if (xcVar3 != null) {
                            xcVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        ceVar.r.setTranslationY(0.0f);
                        if (ceVar.M0 == null) {
                            ceVar.t(false);
                        }
                        ceVar.M0.setTranslationY(measuredHeight + beVar.B0);
                    }
                }
            }
            beVar.B0 = ceVar.r.a;
            xcVar = ceVar.M0;
            if (xcVar != null) {
                f10 = Math.max(0.0f, f10);
            }
            float f142 = beVar.B0 - f10;
            beVar.B0 = f142;
            float max2 = Math.max(-measuredHeight, f142);
            beVar.B0 = max2;
            if (ceVar.f0 == 1) {
            }
            f11 = beVar.B0;
            if (f11 < 0.0f) {
            }
        }
        if (!ceVar.W) {
            float f15 = beVar.D0 + f7;
            beVar.D0 = f15;
            if (!ceVar.X && Math.abs(f15) >= AndroidUtilities.touchSlop) {
                md mdVar2 = ceVar.A0;
                if (mdVar2 != null) {
                    mdVar2.d();
                }
                ceVar.X = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        bd bdVar = this.a.E0.B0;
        if (bdVar == null) {
            return false;
        }
        h1 h1Var = bdVar.N;
        if (h1Var == null) {
            return true;
        }
        h1Var.run();
        bdVar.N = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ce ceVar = this.a.E0;
        ceVar.W = false;
        ceVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!ceVar.J() || motionEvent.getY() >= ceVar.M0.g()) {
            return false;
        }
        ceVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
