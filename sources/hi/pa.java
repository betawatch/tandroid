package hi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pa extends f10 {
    public final /* synthetic */ ra a;

    public pa(ra raVar) {
        this.a = raVar;
    }

    @Override // org.telegram.ui.Components.f10
    public final boolean a() {
        v9 v9Var;
        sa saVar = this.a.o0;
        if (saVar.g0 != 0 || (v9Var = saVar.C0) == null || saVar.T1 || !v9Var.isInited() || saVar.Q1 || saVar.P0.y0) {
            return false;
        }
        p6 p6Var = saVar.E0;
        return (p6Var == null || !(p6Var.y.i || p6Var.M)) && !saVar.I() && saVar.q2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        sa saVar = this.a.o0;
        v9 v9Var = saVar.C0;
        if (v9Var == null || saVar.T1 || saVar.Q1 || !v9Var.isInited() || saVar.g0 != 0 || saVar.P1 == -1) {
            return false;
        }
        saVar.C0.switchCamera();
        saVar.P0.d(180.0f);
        sa.Z(saVar.C0.isFrontface());
        if (saVar.p0()) {
            saVar.s.c(null);
            return true;
        }
        saVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        v9 v9Var = this.a.o0.C0;
        if (v9Var == null) {
            return false;
        }
        v9Var.O = null;
        v9Var.L = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ra raVar = this.a;
        raVar.m0 = 0.0f;
        raVar.n0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        p6 p6Var;
        v9 v9Var;
        s71 s71Var;
        fa faVar;
        ra raVar = this.a;
        sa saVar = raVar.o0;
        ValueAnimator valueAnimator = saVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((p6Var = saVar.E0) != null && (p6Var.y.i || p6Var.M)) || saVar.P0.y0 || (((v9Var = saVar.C0) != null && v9Var.s) || raVar.k0 || (((s71Var = saVar.W0) != null && (s71Var.G || s71Var.H)) || saVar.H())))) {
            return false;
        }
        boolean z10 = true;
        raVar.i0 = true;
        if (saVar.X) {
            if (Math.abs(saVar.r.a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && saVar.L <= 0.4f) {
                    sa.b(saVar);
                } else {
                    saVar.p(true);
                }
            } else if (saVar.N0 != null && !saVar.M0 && saVar.P1 != -1) {
                if (Math.abs(f11) <= 200.0f || (saVar.N0.d.canScrollVertically(-1) && saVar.L0)) {
                    saVar.e(!saVar.R1 && saVar.N0.getTranslationY() < ((float) saVar.N0.getPadding()));
                } else {
                    saVar.e(!saVar.R1 && f11 < 0.0f);
                }
            }
            saVar.M0 = false;
            saVar.X = false;
            saVar.Y = false;
            if (z10 && (faVar = saVar.B0) != null) {
                faVar.b();
            }
            return z10;
        }
        z10 = false;
        saVar.M0 = false;
        saVar.X = false;
        saVar.Y = false;
        if (z10) {
            faVar.b();
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
        p6 p6Var;
        v9 v9Var;
        s71 s71Var;
        g3 g3Var;
        float f12;
        ra raVar = this.a;
        sa saVar = raVar.o0;
        ValueAnimator valueAnimator = saVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || saVar.p2 != null || saVar.o2 != null || (((p6Var = saVar.E0) != null && (p6Var.y.i || p6Var.M)) || saVar.P0.y0 || (((v9Var = saVar.C0) != null && v9Var.s) || raVar.k0 || (((s71Var = saVar.W0) != null && (s71Var.G || s71Var.H)) || saVar.H() || saVar.R1 || saVar.Q1 || saVar.g0 != 0)))) {
            return false;
        }
        if (!saVar.Y) {
            float f13 = raVar.m0 + f11;
            raVar.m0 = f13;
            if (!saVar.X && Math.abs(f13) >= org.telegram.messenger.g0.e) {
                fa faVar = saVar.B0;
                if (faVar != null) {
                    faVar.b();
                }
                saVar.X = true;
            }
        }
        if (saVar.X) {
            int measuredHeight = (saVar.n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
            g3 g3Var2 = saVar.N0;
            if (g3Var2 != null) {
                float f14 = measuredHeight;
                if (g3Var2.getTranslationY() < f14) {
                    raVar.l0 = saVar.N0.getTranslationY() - f14;
                    g3Var = saVar.N0;
                    if (g3Var != null && g3Var.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = raVar.l0 - f11;
                    raVar.l0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    raVar.l0 = max;
                    if (saVar.g0 == 1) {
                        raVar.l0 = Math.max(0.0f, max);
                    }
                    f12 = raVar.l0;
                    if (f12 < 0.0f) {
                        saVar.r.setTranslationY(f12);
                        g3 g3Var3 = saVar.N0;
                        if (g3Var3 != null) {
                            g3Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        saVar.r.setTranslationY(0.0f);
                        if (saVar.N0 == null) {
                            saVar.s(false);
                        }
                        saVar.N0.setTranslationY(measuredHeight + raVar.l0);
                    }
                }
            }
            raVar.l0 = saVar.r.a;
            g3Var = saVar.N0;
            if (g3Var != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = raVar.l0 - f11;
            raVar.l0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            raVar.l0 = max2;
            if (saVar.g0 == 1) {
            }
            f12 = raVar.l0;
            if (f12 < 0.0f) {
            }
        }
        if (!saVar.X) {
            float f16 = raVar.n0 + f10;
            raVar.n0 = f16;
            if (!saVar.Y && Math.abs(f16) >= org.telegram.messenger.g0.e) {
                fa faVar2 = saVar.B0;
                if (faVar2 != null) {
                    faVar2.b();
                }
                saVar.Y = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        v9 v9Var = this.a.o0.C0;
        if (v9Var == null) {
            return false;
        }
        b1 b1Var = v9Var.O;
        if (b1Var == null) {
            return true;
        }
        b1Var.run();
        v9Var.O = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sa saVar = this.a.o0;
        saVar.X = false;
        saVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!saVar.I() || motionEvent.getY() >= saVar.N0.g()) {
            return false;
        }
        saVar.e(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
