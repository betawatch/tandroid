package di;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.l20;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class mc extends l20 {
    public final /* synthetic */ oc a;

    public mc(oc ocVar) {
        this.a = ocVar;
    }

    @Override // org.telegram.ui.Components.l20
    public final boolean a() {
        sb sbVar;
        pc pcVar = this.a.E0;
        if (pcVar.f0 != 0 || (sbVar = pcVar.B0) == null || pcVar.S1 || !sbVar.isInited() || pcVar.P1 || pcVar.O0.x0) {
            return false;
        }
        w7 w7Var = pcVar.D0;
        return (w7Var == null || !(w7Var.x.h || w7Var.L)) && !pcVar.J() && pcVar.p2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        pc pcVar = this.a.E0;
        sb sbVar = pcVar.B0;
        if (sbVar == null || pcVar.S1 || pcVar.P1 || !sbVar.isInited() || pcVar.f0 != 0 || pcVar.O1 == -1) {
            return false;
        }
        pcVar.B0.switchCamera();
        pcVar.O0.d(180.0f);
        pc.a0(pcVar.B0.isFrontface());
        if (pcVar.q0()) {
            pcVar.s.c(null);
            return true;
        }
        pcVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        sb sbVar = this.a.E0.B0;
        if (sbVar == null) {
            return false;
        }
        sbVar.N = null;
        sbVar.K = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        oc ocVar = this.a;
        ocVar.C0 = 0.0f;
        ocVar.D0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w7 w7Var;
        sb sbVar;
        d91 d91Var;
        cc ccVar;
        oc ocVar = this.a;
        pc pcVar = ocVar.E0;
        ValueAnimator valueAnimator = pcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((w7Var = pcVar.D0) != null && (w7Var.x.h || w7Var.L)) || pcVar.O0.x0 || (((sbVar = pcVar.B0) != null && sbVar.s) || ocVar.A0 || (((d91Var = pcVar.V0) != null && (d91Var.F || d91Var.G)) || pcVar.I())))) {
            return false;
        }
        boolean z10 = true;
        ocVar.y0 = true;
        if (pcVar.W) {
            if (Math.abs(pcVar.r.a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 <= 0.0f || Math.abs(f10) <= 2000.0f || Math.abs(f10) <= Math.abs(f7)) && pcVar.K <= 0.4f) {
                    pc.c(pcVar);
                } else {
                    pcVar.q(true);
                }
            } else if (pcVar.M0 != null && !pcVar.L0 && pcVar.O1 != -1) {
                if (Math.abs(f10) <= 200.0f || (pcVar.M0.d.canScrollVertically(-1) && pcVar.K0)) {
                    pcVar.f(!pcVar.Q1 && pcVar.M0.getTranslationY() < ((float) pcVar.M0.getPadding()));
                } else {
                    pcVar.f(!pcVar.Q1 && f10 < 0.0f);
                }
            }
            pcVar.L0 = false;
            pcVar.W = false;
            pcVar.X = false;
            if (z10 && (ccVar = pcVar.A0) != null) {
                ccVar.d();
            }
            return z10;
        }
        z10 = false;
        pcVar.L0 = false;
        pcVar.W = false;
        pcVar.X = false;
        if (z10) {
            ccVar.d();
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
        sb sbVar;
        d91 d91Var;
        ob obVar;
        float f11;
        oc ocVar = this.a;
        pc pcVar = ocVar.E0;
        ValueAnimator valueAnimator = pcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || pcVar.o2 != null || pcVar.n2 != null || (((w7Var = pcVar.D0) != null && (w7Var.x.h || w7Var.L)) || pcVar.O0.x0 || (((sbVar = pcVar.B0) != null && sbVar.s) || ocVar.A0 || (((d91Var = pcVar.V0) != null && (d91Var.F || d91Var.G)) || pcVar.I() || pcVar.Q1 || pcVar.P1 || pcVar.f0 != 0)))) {
            return false;
        }
        if (!pcVar.X) {
            float f12 = ocVar.C0 + f10;
            ocVar.C0 = f12;
            if (!pcVar.W && Math.abs(f12) >= AndroidUtilities.touchSlop) {
                cc ccVar = pcVar.A0;
                if (ccVar != null) {
                    ccVar.d();
                }
                pcVar.W = true;
            }
        }
        if (pcVar.W) {
            int measuredHeight = (pcVar.n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ob obVar2 = pcVar.M0;
            if (obVar2 != null) {
                float f13 = measuredHeight;
                if (obVar2.getTranslationY() < f13) {
                    ocVar.B0 = pcVar.M0.getTranslationY() - f13;
                    obVar = pcVar.M0;
                    if (obVar != null && obVar.d.canScrollVertically(-1)) {
                        f10 = Math.max(0.0f, f10);
                    }
                    float f14 = ocVar.B0 - f10;
                    ocVar.B0 = f14;
                    float max = Math.max(-measuredHeight, f14);
                    ocVar.B0 = max;
                    if (pcVar.f0 == 1) {
                        ocVar.B0 = Math.max(0.0f, max);
                    }
                    f11 = ocVar.B0;
                    if (f11 < 0.0f) {
                        pcVar.r.setTranslationY(f11);
                        ob obVar3 = pcVar.M0;
                        if (obVar3 != null) {
                            obVar3.setTranslationY(measuredHeight);
                        }
                    } else {
                        pcVar.r.setTranslationY(0.0f);
                        if (pcVar.M0 == null) {
                            pcVar.t(false);
                        }
                        pcVar.M0.setTranslationY(measuredHeight + ocVar.B0);
                    }
                }
            }
            ocVar.B0 = pcVar.r.a;
            obVar = pcVar.M0;
            if (obVar != null) {
                f10 = Math.max(0.0f, f10);
            }
            float f142 = ocVar.B0 - f10;
            ocVar.B0 = f142;
            float max2 = Math.max(-measuredHeight, f142);
            ocVar.B0 = max2;
            if (pcVar.f0 == 1) {
            }
            f11 = ocVar.B0;
            if (f11 < 0.0f) {
            }
        }
        if (!pcVar.W) {
            float f15 = ocVar.D0 + f7;
            ocVar.D0 = f15;
            if (!pcVar.X && Math.abs(f15) >= AndroidUtilities.touchSlop) {
                cc ccVar2 = pcVar.A0;
                if (ccVar2 != null) {
                    ccVar2.d();
                }
                pcVar.X = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        sb sbVar = this.a.E0.B0;
        if (sbVar == null) {
            return false;
        }
        c1 c1Var = sbVar.N;
        if (c1Var == null) {
            return true;
        }
        c1Var.run();
        sbVar.N = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        pc pcVar = this.a.E0;
        pcVar.W = false;
        pcVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!pcVar.J() || motionEvent.getY() >= pcVar.M0.g()) {
            return false;
        }
        pcVar.f(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
