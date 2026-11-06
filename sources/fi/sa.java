package fi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.l71;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sa extends b10 {
    public final /* synthetic */ ua a;

    public sa(ua uaVar) {
        this.a = uaVar;
    }

    @Override // org.telegram.ui.Components.b10
    public final boolean a() {
        y9 y9Var;
        va vaVar = this.a.n0;
        if (vaVar.f0 != 0 || (y9Var = vaVar.B0) == null || vaVar.S1 || !y9Var.isInited() || vaVar.P1 || vaVar.O0.x0) {
            return false;
        }
        q6 q6Var = vaVar.D0;
        return (q6Var == null || !(q6Var.y.i || q6Var.L)) && !vaVar.I() && vaVar.p2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        va vaVar = this.a.n0;
        y9 y9Var = vaVar.B0;
        if (y9Var == null || vaVar.S1 || vaVar.P1 || !y9Var.isInited() || vaVar.f0 != 0 || vaVar.O1 == -1) {
            return false;
        }
        vaVar.B0.switchCamera();
        vaVar.O0.d(180.0f);
        va.Z(vaVar.B0.isFrontface());
        if (vaVar.p0()) {
            vaVar.s.c(null);
            return true;
        }
        vaVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        y9 y9Var = this.a.n0.B0;
        if (y9Var == null) {
            return false;
        }
        y9Var.N = null;
        y9Var.K = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ua uaVar = this.a;
        uaVar.l0 = 0.0f;
        uaVar.m0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        q6 q6Var;
        y9 y9Var;
        l71 l71Var;
        ia iaVar;
        ua uaVar = this.a;
        va vaVar = uaVar.n0;
        ValueAnimator valueAnimator = vaVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((q6Var = vaVar.D0) != null && (q6Var.y.i || q6Var.L)) || vaVar.O0.x0 || (((y9Var = vaVar.B0) != null && y9Var.s) || uaVar.j0 || (((l71Var = vaVar.V0) != null && (l71Var.F || l71Var.G)) || vaVar.H())))) {
            return false;
        }
        boolean z9 = true;
        uaVar.h0 = true;
        if (vaVar.W) {
            if (Math.abs(vaVar.r.a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && vaVar.K <= 0.4f) {
                    va.b(vaVar);
                } else {
                    vaVar.p(true);
                }
            } else if (vaVar.M0 != null && !vaVar.L0 && vaVar.O1 != -1) {
                if (Math.abs(f11) <= 200.0f || (vaVar.M0.d.canScrollVertically(-1) && vaVar.K0)) {
                    vaVar.e(!vaVar.Q1 && vaVar.M0.getTranslationY() < ((float) vaVar.M0.getPadding()));
                } else {
                    vaVar.e(!vaVar.Q1 && f11 < 0.0f);
                }
            }
            vaVar.L0 = false;
            vaVar.W = false;
            vaVar.X = false;
            if (z9 && (iaVar = vaVar.A0) != null) {
                iaVar.b();
            }
            return z9;
        }
        z9 = false;
        vaVar.L0 = false;
        vaVar.W = false;
        vaVar.X = false;
        if (z9) {
            iaVar.b();
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        q6 q6Var;
        y9 y9Var;
        l71 l71Var;
        i3 i3Var;
        float f12;
        ua uaVar = this.a;
        va vaVar = uaVar.n0;
        ValueAnimator valueAnimator = vaVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || vaVar.o2 != null || vaVar.n2 != null || (((q6Var = vaVar.D0) != null && (q6Var.y.i || q6Var.L)) || vaVar.O0.x0 || (((y9Var = vaVar.B0) != null && y9Var.s) || uaVar.j0 || (((l71Var = vaVar.V0) != null && (l71Var.F || l71Var.G)) || vaVar.H() || vaVar.Q1 || vaVar.P1 || vaVar.f0 != 0)))) {
            return false;
        }
        if (!vaVar.X) {
            float f13 = uaVar.l0 + f11;
            uaVar.l0 = f13;
            if (!vaVar.W && Math.abs(f13) >= org.telegram.messenger.g0.e) {
                ia iaVar = vaVar.A0;
                if (iaVar != null) {
                    iaVar.b();
                }
                vaVar.W = true;
            }
        }
        if (vaVar.W) {
            int measuredHeight = (vaVar.n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
            i3 i3Var2 = vaVar.M0;
            if (i3Var2 != null) {
                float f14 = measuredHeight;
                if (i3Var2.getTranslationY() < f14) {
                    uaVar.k0 = vaVar.M0.getTranslationY() - f14;
                    i3Var = vaVar.M0;
                    if (i3Var != null && i3Var.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = uaVar.k0 - f11;
                    uaVar.k0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    uaVar.k0 = max;
                    if (vaVar.f0 == 1) {
                        uaVar.k0 = Math.max(0.0f, max);
                    }
                    f12 = uaVar.k0;
                    if (f12 < 0.0f) {
                        vaVar.r.setTranslationY(f12);
                        i3 i3Var3 = vaVar.M0;
                        if (i3Var3 != null) {
                            i3Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        vaVar.r.setTranslationY(0.0f);
                        if (vaVar.M0 == null) {
                            vaVar.s(false);
                        }
                        vaVar.M0.setTranslationY(measuredHeight + uaVar.k0);
                    }
                }
            }
            uaVar.k0 = vaVar.r.a;
            i3Var = vaVar.M0;
            if (i3Var != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = uaVar.k0 - f11;
            uaVar.k0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            uaVar.k0 = max2;
            if (vaVar.f0 == 1) {
            }
            f12 = uaVar.k0;
            if (f12 < 0.0f) {
            }
        }
        if (!vaVar.W) {
            float f16 = uaVar.m0 + f10;
            uaVar.m0 = f16;
            if (!vaVar.X && Math.abs(f16) >= org.telegram.messenger.g0.e) {
                ia iaVar2 = vaVar.A0;
                if (iaVar2 != null) {
                    iaVar2.b();
                }
                vaVar.X = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        y9 y9Var = this.a.n0.B0;
        if (y9Var == null) {
            return false;
        }
        a1 a1Var = y9Var.N;
        if (a1Var == null) {
            return true;
        }
        a1Var.run();
        y9Var.N = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        va vaVar = this.a.n0;
        vaVar.W = false;
        vaVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!vaVar.I() || motionEvent.getY() >= vaVar.M0.g()) {
            return false;
        }
        vaVar.e(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
