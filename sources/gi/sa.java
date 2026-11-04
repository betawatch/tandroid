package gi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.x00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sa extends x00 {
    public final /* synthetic */ ua a;

    public sa(ua uaVar) {
        this.a = uaVar;
    }

    @Override // org.telegram.ui.Components.x00
    public final boolean a() {
        y9 y9Var;
        va vaVar = this.a.o0;
        if (vaVar.g0 != 0 || (y9Var = vaVar.C0) == null || vaVar.T1 || !y9Var.isInited() || vaVar.Q1 || vaVar.P0.y0) {
            return false;
        }
        r6 r6Var = vaVar.E0;
        return (r6Var == null || !(r6Var.y.i || r6Var.M)) && !vaVar.I() && vaVar.q2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        va vaVar = this.a.o0;
        y9 y9Var = vaVar.C0;
        if (y9Var == null || vaVar.T1 || vaVar.Q1 || !y9Var.isInited() || vaVar.g0 != 0 || vaVar.P1 == -1) {
            return false;
        }
        vaVar.C0.switchCamera();
        vaVar.P0.d(180.0f);
        va.Z(vaVar.C0.isFrontface());
        if (vaVar.p0()) {
            vaVar.s.c(null);
            return true;
        }
        vaVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        y9 y9Var = this.a.o0.C0;
        if (y9Var == null) {
            return false;
        }
        y9Var.O = null;
        y9Var.L = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ua uaVar = this.a;
        uaVar.m0 = 0.0f;
        uaVar.n0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        r6 r6Var;
        y9 y9Var;
        j71 j71Var;
        ia iaVar;
        ua uaVar = this.a;
        va vaVar = uaVar.o0;
        ValueAnimator valueAnimator = vaVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((r6Var = vaVar.E0) != null && (r6Var.y.i || r6Var.M)) || vaVar.P0.y0 || (((y9Var = vaVar.C0) != null && y9Var.s) || uaVar.k0 || (((j71Var = vaVar.W0) != null && (j71Var.G || j71Var.H)) || vaVar.H())))) {
            return false;
        }
        boolean z10 = true;
        uaVar.i0 = true;
        if (vaVar.X) {
            if (Math.abs(vaVar.r.a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && vaVar.L <= 0.4f) {
                    va.b(vaVar);
                } else {
                    vaVar.p(true);
                }
            } else if (vaVar.N0 != null && !vaVar.M0 && vaVar.P1 != -1) {
                if (Math.abs(f11) <= 200.0f || (vaVar.N0.d.canScrollVertically(-1) && vaVar.L0)) {
                    vaVar.e(!vaVar.R1 && vaVar.N0.getTranslationY() < ((float) vaVar.N0.getPadding()));
                } else {
                    vaVar.e(!vaVar.R1 && f11 < 0.0f);
                }
            }
            vaVar.M0 = false;
            vaVar.X = false;
            vaVar.Y = false;
            if (z10 && (iaVar = vaVar.B0) != null) {
                iaVar.b();
            }
            return z10;
        }
        z10 = false;
        vaVar.M0 = false;
        vaVar.X = false;
        vaVar.Y = false;
        if (z10) {
            iaVar.b();
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
        r6 r6Var;
        y9 y9Var;
        j71 j71Var;
        g3 g3Var;
        float f12;
        ua uaVar = this.a;
        va vaVar = uaVar.o0;
        ValueAnimator valueAnimator = vaVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || vaVar.p2 != null || vaVar.o2 != null || (((r6Var = vaVar.E0) != null && (r6Var.y.i || r6Var.M)) || vaVar.P0.y0 || (((y9Var = vaVar.C0) != null && y9Var.s) || uaVar.k0 || (((j71Var = vaVar.W0) != null && (j71Var.G || j71Var.H)) || vaVar.H() || vaVar.R1 || vaVar.Q1 || vaVar.g0 != 0)))) {
            return false;
        }
        if (!vaVar.Y) {
            float f13 = uaVar.m0 + f11;
            uaVar.m0 = f13;
            if (!vaVar.X && Math.abs(f13) >= org.telegram.messenger.g0.e) {
                ia iaVar = vaVar.B0;
                if (iaVar != null) {
                    iaVar.b();
                }
                vaVar.X = true;
            }
        }
        if (vaVar.X) {
            int measuredHeight = (vaVar.n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
            g3 g3Var2 = vaVar.N0;
            if (g3Var2 != null) {
                float f14 = measuredHeight;
                if (g3Var2.getTranslationY() < f14) {
                    uaVar.l0 = vaVar.N0.getTranslationY() - f14;
                    g3Var = vaVar.N0;
                    if (g3Var != null && g3Var.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = uaVar.l0 - f11;
                    uaVar.l0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    uaVar.l0 = max;
                    if (vaVar.g0 == 1) {
                        uaVar.l0 = Math.max(0.0f, max);
                    }
                    f12 = uaVar.l0;
                    if (f12 < 0.0f) {
                        vaVar.r.setTranslationY(f12);
                        g3 g3Var3 = vaVar.N0;
                        if (g3Var3 != null) {
                            g3Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        vaVar.r.setTranslationY(0.0f);
                        if (vaVar.N0 == null) {
                            vaVar.s(false);
                        }
                        vaVar.N0.setTranslationY(measuredHeight + uaVar.l0);
                    }
                }
            }
            uaVar.l0 = vaVar.r.a;
            g3Var = vaVar.N0;
            if (g3Var != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = uaVar.l0 - f11;
            uaVar.l0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            uaVar.l0 = max2;
            if (vaVar.g0 == 1) {
            }
            f12 = uaVar.l0;
            if (f12 < 0.0f) {
            }
        }
        if (!vaVar.X) {
            float f16 = uaVar.n0 + f10;
            uaVar.n0 = f16;
            if (!vaVar.Y && Math.abs(f16) >= org.telegram.messenger.g0.e) {
                ia iaVar2 = vaVar.B0;
                if (iaVar2 != null) {
                    iaVar2.b();
                }
                vaVar.Y = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        y9 y9Var = this.a.o0.C0;
        if (y9Var == null) {
            return false;
        }
        a1 a1Var = y9Var.O;
        if (a1Var == null) {
            return true;
        }
        a1Var.run();
        y9Var.O = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        va vaVar = this.a.o0;
        vaVar.X = false;
        vaVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!vaVar.I() || motionEvent.getY() >= vaVar.N0.g()) {
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
