package hi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.m10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class qa extends m10 {
    public final /* synthetic */ sa a;

    public qa(sa saVar) {
        this.a = saVar;
    }

    @Override // org.telegram.ui.Components.m10
    public final boolean a() {
        w9 w9Var;
        ta taVar = this.a.o0;
        if (taVar.g0 != 0 || (w9Var = taVar.C0) == null || taVar.T1 || !w9Var.isInited() || taVar.Q1 || taVar.P0.y0) {
            return false;
        }
        o6 o6Var = taVar.E0;
        return (o6Var == null || !(o6Var.y.i || o6Var.M)) && !taVar.I() && taVar.q2 == null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ta taVar = this.a.o0;
        w9 w9Var = taVar.C0;
        if (w9Var == null || taVar.T1 || taVar.Q1 || !w9Var.isInited() || taVar.g0 != 0 || taVar.P1 == -1) {
            return false;
        }
        taVar.C0.switchCamera();
        taVar.P0.d(180.0f);
        ta.Z(taVar.C0.isFrontface());
        if (taVar.p0()) {
            taVar.s.c(null);
            return true;
        }
        taVar.s.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        w9 w9Var = this.a.o0.C0;
        if (w9Var == null) {
            return false;
        }
        w9Var.O = null;
        w9Var.L = -1L;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        sa saVar = this.a;
        saVar.m0 = 0.0f;
        saVar.n0 = 0.0f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        o6 o6Var;
        w9 w9Var;
        c81 c81Var;
        ga gaVar;
        sa saVar = this.a;
        ta taVar = saVar.o0;
        ValueAnimator valueAnimator = taVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((o6Var = taVar.E0) != null && (o6Var.y.i || o6Var.M)) || taVar.P0.y0 || (((w9Var = taVar.C0) != null && w9Var.s) || saVar.k0 || (((c81Var = taVar.W0) != null && (c81Var.G || c81Var.H)) || taVar.H())))) {
            return false;
        }
        boolean z10 = true;
        saVar.i0 = true;
        if (taVar.X) {
            if (Math.abs(taVar.r.a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && taVar.L <= 0.4f) {
                    ta.b(taVar);
                } else {
                    taVar.p(true);
                }
            } else if (taVar.N0 != null && !taVar.M0 && taVar.P1 != -1) {
                if (Math.abs(f11) <= 200.0f || (taVar.N0.d.canScrollVertically(-1) && taVar.L0)) {
                    taVar.e(!taVar.R1 && taVar.N0.getTranslationY() < ((float) taVar.N0.getPadding()));
                } else {
                    taVar.e(!taVar.R1 && f11 < 0.0f);
                }
            }
            taVar.M0 = false;
            taVar.X = false;
            taVar.Y = false;
            if (z10 && (gaVar = taVar.B0) != null) {
                gaVar.b();
            }
            return z10;
        }
        z10 = false;
        taVar.M0 = false;
        taVar.X = false;
        taVar.Y = false;
        if (z10) {
            gaVar.b();
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
        o6 o6Var;
        w9 w9Var;
        c81 c81Var;
        h3 h3Var;
        float f12;
        sa saVar = this.a;
        ta taVar = saVar.o0;
        ValueAnimator valueAnimator = taVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || taVar.p2 != null || taVar.o2 != null || (((o6Var = taVar.E0) != null && (o6Var.y.i || o6Var.M)) || taVar.P0.y0 || (((w9Var = taVar.C0) != null && w9Var.s) || saVar.k0 || (((c81Var = taVar.W0) != null && (c81Var.G || c81Var.H)) || taVar.H() || taVar.R1 || taVar.Q1 || taVar.g0 != 0)))) {
            return false;
        }
        if (!taVar.Y) {
            float f13 = saVar.m0 + f11;
            saVar.m0 = f13;
            if (!taVar.X && Math.abs(f13) >= org.telegram.messenger.g0.e) {
                ga gaVar = taVar.B0;
                if (gaVar != null) {
                    gaVar.b();
                }
                taVar.X = true;
            }
        }
        if (taVar.X) {
            int measuredHeight = (taVar.n.getMeasuredHeight() - ((int) (org.telegram.messenger.g0.q.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
            h3 h3Var2 = taVar.N0;
            if (h3Var2 != null) {
                float f14 = measuredHeight;
                if (h3Var2.getTranslationY() < f14) {
                    saVar.l0 = taVar.N0.getTranslationY() - f14;
                    h3Var = taVar.N0;
                    if (h3Var != null && h3Var.d.canScrollVertically(-1)) {
                        f11 = Math.max(0.0f, f11);
                    }
                    float f15 = saVar.l0 - f11;
                    saVar.l0 = f15;
                    float max = Math.max(-measuredHeight, f15);
                    saVar.l0 = max;
                    if (taVar.g0 == 1) {
                        saVar.l0 = Math.max(0.0f, max);
                    }
                    f12 = saVar.l0;
                    if (f12 < 0.0f) {
                        taVar.r.setTranslationY(f12);
                        h3 h3Var3 = taVar.N0;
                        if (h3Var3 != null) {
                            h3Var3.setTranslationY(measuredHeight);
                        }
                    } else {
                        taVar.r.setTranslationY(0.0f);
                        if (taVar.N0 == null) {
                            taVar.s(false);
                        }
                        taVar.N0.setTranslationY(measuredHeight + saVar.l0);
                    }
                }
            }
            saVar.l0 = taVar.r.a;
            h3Var = taVar.N0;
            if (h3Var != null) {
                f11 = Math.max(0.0f, f11);
            }
            float f152 = saVar.l0 - f11;
            saVar.l0 = f152;
            float max2 = Math.max(-measuredHeight, f152);
            saVar.l0 = max2;
            if (taVar.g0 == 1) {
            }
            f12 = saVar.l0;
            if (f12 < 0.0f) {
            }
        }
        if (!taVar.X) {
            float f16 = saVar.n0 + f10;
            saVar.n0 = f16;
            if (!taVar.Y && Math.abs(f16) >= org.telegram.messenger.g0.e) {
                ga gaVar2 = taVar.B0;
                if (gaVar2 != null) {
                    gaVar2.b();
                }
                taVar.Y = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        w9 w9Var = this.a.o0.C0;
        if (w9Var == null) {
            return false;
        }
        c1 c1Var = w9Var.O;
        if (c1Var == null) {
            return true;
        }
        c1Var.run();
        w9Var.O = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ta taVar = this.a.o0;
        taVar.X = false;
        taVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!taVar.I() || motionEvent.getY() >= taVar.N0.g()) {
            return false;
        }
        taVar.e(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
