package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xg0 extends u20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zg0 d;

    public xg0(zg0 zg0Var, int i10) {
        this.d = zg0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.u20
    public final boolean a() {
        zg0 zg0Var = this.d;
        PhotoViewer photoViewer = zg0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && zg0Var.r == null) || zg0Var.c0 || zg0Var.Y || zg0Var.w || zg0Var.s.isInProgress() || !zg0Var.f0) {
            return false;
        }
        return zg0Var.l() != -9223372036854775807L && zg0Var.m() >= 15000;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        zg0 zg0Var = this.d;
        PhotoViewer photoViewer = zg0Var.V;
        r71 r71Var = zg0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || zg0Var.r != null) && !zg0Var.c0 && !zg0Var.Y && !zg0Var.w && !zg0Var.s.isInProgress() && zg0Var.f0)) {
            zg0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) zg0Var.t()) * zg0Var.J) * 0.5f;
            long l4 = zg0Var.l();
            long m10 = zg0Var.m();
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
                        r71Var.e(true);
                        r71Var.d(!z11);
                        long j11 = r71Var.o + 10000;
                        r71Var.o = j11;
                        r71Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        kg0 kg0Var = zg0Var.r;
                        if (kg0Var != null) {
                            kg0Var.i(j10);
                        } else {
                            a81 a81Var = zg0Var.V.F2;
                            if (a81Var != null) {
                                a81Var.K(j10);
                            }
                        }
                        r71Var.g(0L);
                        zg0Var.Z = j10 / m10;
                        ci.i3 i3Var = zg0Var.b0;
                        if (i3Var != null) {
                            i3Var.invalidate();
                        }
                        yg0 yg0Var = zg0Var.h;
                        if (yg0Var != null) {
                            yg0Var.invalidate();
                        }
                        if (!zg0Var.E) {
                            zg0Var.E = true;
                            zg0Var.y(true);
                            if (!zg0Var.i0) {
                                zg0Var.i0 = true;
                                AndroidUtilities.runOnUIThread(zg0Var.j0, 2500L);
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
        zg0 zg0Var = this.d;
        if (zg0Var.E) {
            for (int i10 = 1; i10 < zg0Var.e.getChildCount(); i10++) {
                View childAt = zg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    zg0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = zg0Var.K;
        this.b = zg0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        zg0 zg0Var = this.d;
        if (!zg0Var.w || zg0Var.x) {
            return false;
        }
        o1.k kVar = zg0Var.M;
        kVar.a = f7;
        float f11 = zg0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((zg0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        zg0Var.M.h();
        o1.k kVar2 = zg0Var.N;
        kVar2.a = f7;
        kVar2.b = zg0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.r.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - zg0Var.I) - AndroidUtilities.dp(16.0f));
        zg0Var.N.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        zg0 zg0Var = this.d;
        if (!zg0Var.w && zg0Var.F == null && !zg0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                zg0Var.w = true;
                zg0Var.M.c();
                zg0Var.N.c();
                zg0Var.f0 = false;
                zg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(zg0Var.h0);
            }
        }
        if (zg0Var.w) {
            float f12 = zg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            zg0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = zg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = zg0Var.d0;
                if (z10) {
                    if (z10) {
                        zg0Var.M.a(new ei.ea(this, rawX, 2));
                        o1.k kVar = zg0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.h();
                    }
                    zg0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = zg0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = zg0Var.c;
                    zg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) zg0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                zg0Var.c.y = (int) zg0Var.L;
                ((SharedPreferences) zg0Var.n().b).edit().putFloat("y", zg0Var.L).apply();
                AndroidUtilities.updateViewLayout(zg0Var.b, zg0Var.d, zg0Var.c);
                return true;
            }
            if (!zg0Var.d0) {
                o1.k kVar3 = zg0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - zg0Var.H;
                zg0Var.M.h();
            }
            zg0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        zg0 zg0Var = this.d;
        ValueAnimator valueAnimator = zg0Var.F;
        ug0 ug0Var = zg0Var.j0;
        if (valueAnimator == null) {
            if (zg0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(ug0Var);
                zg0Var.i0 = false;
            }
            boolean z10 = !zg0Var.E;
            zg0Var.E = z10;
            zg0Var.y(z10);
            if (zg0Var.E && !zg0Var.i0) {
                AndroidUtilities.runOnUIThread(ug0Var, 2500L);
                zg0Var.i0 = true;
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
