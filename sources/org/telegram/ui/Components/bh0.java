package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class bh0 extends u20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dh0 d;

    public bh0(dh0 dh0Var, int i10) {
        this.d = dh0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.u20
    public final boolean a() {
        dh0 dh0Var = this.d;
        PhotoViewer photoViewer = dh0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && dh0Var.r == null) || dh0Var.c0 || dh0Var.Y || dh0Var.w || dh0Var.s.isInProgress() || !dh0Var.f0) {
            return false;
        }
        return dh0Var.l() != -9223372036854775807L && dh0Var.m() >= 15000;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        dh0 dh0Var = this.d;
        PhotoViewer photoViewer = dh0Var.V;
        b81 b81Var = dh0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || dh0Var.r != null) && !dh0Var.c0 && !dh0Var.Y && !dh0Var.w && !dh0Var.s.isInProgress() && dh0Var.f0)) {
            dh0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) dh0Var.t()) * dh0Var.J) * 0.5f;
            long l4 = dh0Var.l();
            long m10 = dh0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                long j10 = z11 ? l4 + 10000 : l4 - 10000;
                if (l4 != j10) {
                    if (j10 > m10) {
                        z10 = true;
                        j10 = m10;
                    } else if (j10 < 0) {
                        z10 = j10 >= -9000;
                        j10 = 0;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        b81Var.e(true);
                        b81Var.d(!z11);
                        long j11 = b81Var.o + 10000;
                        b81Var.o = j11;
                        b81Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        pg0 pg0Var = dh0Var.r;
                        if (pg0Var != null) {
                            pg0Var.i(j10);
                        } else {
                            j81 j81Var = dh0Var.V.F2;
                            if (j81Var != null) {
                                j81Var.K(j10);
                            }
                        }
                        b81Var.g(0L);
                        dh0Var.Z = j10 / m10;
                        ci.h3 h3Var = dh0Var.b0;
                        if (h3Var != null) {
                            h3Var.invalidate();
                        }
                        ch0 ch0Var = dh0Var.h;
                        if (ch0Var != null) {
                            ch0Var.invalidate();
                        }
                        if (!dh0Var.E) {
                            dh0Var.E = true;
                            dh0Var.y(true);
                            if (!dh0Var.i0) {
                                dh0Var.i0 = true;
                                AndroidUtilities.runOnUIThread(dh0Var.j0, 2500L);
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        dh0 dh0Var = this.d;
        if (dh0Var.E) {
            for (int i10 = 1; i10 < dh0Var.e.getChildCount(); i10++) {
                View childAt = dh0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    dh0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = dh0Var.K;
        this.b = dh0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        dh0 dh0Var = this.d;
        if (!dh0Var.w || dh0Var.x) {
            return false;
        }
        o1.k kVar = dh0Var.M;
        kVar.a = f7;
        float f11 = dh0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((dh0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        dh0Var.M.h();
        o1.k kVar2 = dh0Var.N;
        kVar2.a = f7;
        kVar2.b = dh0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.r.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - dh0Var.I) - AndroidUtilities.dp(16.0f));
        dh0Var.N.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        dh0 dh0Var = this.d;
        if (!dh0Var.w && dh0Var.F == null && !dh0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                dh0Var.w = true;
                dh0Var.M.c();
                dh0Var.N.c();
                dh0Var.f0 = false;
                dh0Var.i();
                AndroidUtilities.cancelRunOnUIThread(dh0Var.h0);
            }
        }
        if (dh0Var.w) {
            float f12 = dh0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            dh0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = dh0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = dh0Var.d0;
                if (z10) {
                    if (z10) {
                        dh0Var.M.a(new ei.ea(this, rawX, 2));
                        o1.k kVar = dh0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.h();
                    }
                    dh0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = dh0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = dh0Var.c;
                    dh0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) dh0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                dh0Var.c.y = (int) dh0Var.L;
                ((SharedPreferences) dh0Var.n().b).edit().putFloat("y", dh0Var.L).apply();
                AndroidUtilities.updateViewLayout(dh0Var.b, dh0Var.d, dh0Var.c);
                return true;
            }
            if (!dh0Var.d0) {
                o1.k kVar3 = dh0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - dh0Var.H;
                dh0Var.M.h();
            }
            dh0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        dh0 dh0Var = this.d;
        ValueAnimator valueAnimator = dh0Var.F;
        yg0 yg0Var = dh0Var.j0;
        if (valueAnimator == null) {
            if (dh0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(yg0Var);
                dh0Var.i0 = false;
            }
            boolean z10 = !dh0Var.E;
            dh0Var.E = z10;
            dh0Var.y(z10);
            if (dh0Var.E && !dh0Var.i0) {
                AndroidUtilities.runOnUIThread(yg0Var, 2500L);
                dh0Var.i0 = true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (a()) {
            return super.onSingleTapUp(motionEvent);
        }
        onSingleTapConfirmed(motionEvent);
        return true;
    }
}
