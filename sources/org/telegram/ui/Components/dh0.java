package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dh0 extends y20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fh0 d;

    public dh0(fh0 fh0Var, int i10) {
        this.d = fh0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.y20
    public final boolean a() {
        fh0 fh0Var = this.d;
        PhotoViewer photoViewer = fh0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && fh0Var.r == null) || fh0Var.c0 || fh0Var.Y || fh0Var.w || fh0Var.s.isInProgress() || !fh0Var.f0) {
            return false;
        }
        return fh0Var.l() != -9223372036854775807L && fh0Var.m() >= 15000;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        fh0 fh0Var = this.d;
        PhotoViewer photoViewer = fh0Var.V;
        a81 a81Var = fh0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || fh0Var.r != null) && !fh0Var.c0 && !fh0Var.Y && !fh0Var.w && !fh0Var.s.isInProgress() && fh0Var.f0)) {
            fh0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) fh0Var.t()) * fh0Var.J) * 0.5f;
            long l4 = fh0Var.l();
            long m10 = fh0Var.m();
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
                        a81Var.e(true);
                        a81Var.d(!z11);
                        long j11 = a81Var.o + 10000;
                        a81Var.o = j11;
                        a81Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        rg0 rg0Var = fh0Var.r;
                        if (rg0Var != null) {
                            rg0Var.i(j10);
                        } else {
                            i81 i81Var = fh0Var.V.F2;
                            if (i81Var != null) {
                                i81Var.K(j10);
                            }
                        }
                        a81Var.g(0L);
                        fh0Var.Z = j10 / m10;
                        bi.d4 d4Var = fh0Var.b0;
                        if (d4Var != null) {
                            d4Var.invalidate();
                        }
                        eh0 eh0Var = fh0Var.h;
                        if (eh0Var != null) {
                            eh0Var.invalidate();
                        }
                        if (!fh0Var.E) {
                            fh0Var.E = true;
                            fh0Var.y(true);
                            if (!fh0Var.i0) {
                                fh0Var.i0 = true;
                                AndroidUtilities.runOnUIThread(fh0Var.j0, 2500L);
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
        fh0 fh0Var = this.d;
        if (fh0Var.E) {
            for (int i10 = 1; i10 < fh0Var.e.getChildCount(); i10++) {
                View childAt = fh0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    fh0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = fh0Var.K;
        this.b = fh0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        fh0 fh0Var = this.d;
        if (!fh0Var.w || fh0Var.x) {
            return false;
        }
        o1.k kVar = fh0Var.M;
        kVar.a = f7;
        float f11 = fh0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((fh0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        fh0Var.M.h();
        o1.k kVar2 = fh0Var.N;
        kVar2.a = f7;
        kVar2.b = fh0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.r.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fh0Var.I) - AndroidUtilities.dp(16.0f));
        fh0Var.N.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        fh0 fh0Var = this.d;
        if (!fh0Var.w && fh0Var.F == null && !fh0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                fh0Var.w = true;
                fh0Var.M.c();
                fh0Var.N.c();
                fh0Var.f0 = false;
                fh0Var.i();
                AndroidUtilities.cancelRunOnUIThread(fh0Var.h0);
            }
        }
        if (fh0Var.w) {
            float f12 = fh0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            fh0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = fh0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = fh0Var.d0;
                if (z10) {
                    if (z10) {
                        fh0Var.M.a(new di.ra(this, rawX, 2));
                        o1.k kVar = fh0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.h();
                    }
                    fh0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = fh0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = fh0Var.c;
                    fh0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) fh0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                fh0Var.c.y = (int) fh0Var.L;
                ((SharedPreferences) fh0Var.n().b).edit().putFloat("y", fh0Var.L).apply();
                AndroidUtilities.updateViewLayout(fh0Var.b, fh0Var.d, fh0Var.c);
                return true;
            }
            if (!fh0Var.d0) {
                o1.k kVar3 = fh0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - fh0Var.H;
                fh0Var.M.h();
            }
            fh0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        fh0 fh0Var = this.d;
        ValueAnimator valueAnimator = fh0Var.F;
        ah0 ah0Var = fh0Var.j0;
        if (valueAnimator == null) {
            if (fh0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(ah0Var);
                fh0Var.i0 = false;
            }
            boolean z10 = !fh0Var.E;
            fh0Var.E = z10;
            fh0Var.y(z10);
            if (fh0Var.E && !fh0Var.i0) {
                AndroidUtilities.runOnUIThread(ah0Var, 2500L);
                fh0Var.i0 = true;
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
