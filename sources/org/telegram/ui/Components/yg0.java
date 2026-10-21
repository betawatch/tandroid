package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class yg0 extends u20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ah0 d;

    public yg0(ah0 ah0Var, int i10) {
        this.d = ah0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.u20
    public final boolean a() {
        ah0 ah0Var = this.d;
        PhotoViewer photoViewer = ah0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && ah0Var.r == null) || ah0Var.c0 || ah0Var.Y || ah0Var.w || ah0Var.s.isInProgress() || !ah0Var.f0) {
            return false;
        }
        return ah0Var.l() != -9223372036854775807L && ah0Var.m() >= 15000;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        ah0 ah0Var = this.d;
        PhotoViewer photoViewer = ah0Var.V;
        t71 t71Var = ah0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || ah0Var.r != null) && !ah0Var.c0 && !ah0Var.Y && !ah0Var.w && !ah0Var.s.isInProgress() && ah0Var.f0)) {
            ah0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) ah0Var.t()) * ah0Var.J) * 0.5f;
            long l4 = ah0Var.l();
            long m10 = ah0Var.m();
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
                        t71Var.e(true);
                        t71Var.d(!z11);
                        long j11 = t71Var.o + 10000;
                        t71Var.o = j11;
                        t71Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        lg0 lg0Var = ah0Var.r;
                        if (lg0Var != null) {
                            lg0Var.i(j10);
                        } else {
                            c81 c81Var = ah0Var.V.F2;
                            if (c81Var != null) {
                                c81Var.K(j10);
                            }
                        }
                        t71Var.g(0L);
                        ah0Var.Z = j10 / m10;
                        ci.i3 i3Var = ah0Var.b0;
                        if (i3Var != null) {
                            i3Var.invalidate();
                        }
                        zg0 zg0Var = ah0Var.h;
                        if (zg0Var != null) {
                            zg0Var.invalidate();
                        }
                        if (!ah0Var.E) {
                            ah0Var.E = true;
                            ah0Var.y(true);
                            if (!ah0Var.i0) {
                                ah0Var.i0 = true;
                                AndroidUtilities.runOnUIThread(ah0Var.j0, 2500L);
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
        ah0 ah0Var = this.d;
        if (ah0Var.E) {
            for (int i10 = 1; i10 < ah0Var.e.getChildCount(); i10++) {
                View childAt = ah0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    ah0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = ah0Var.K;
        this.b = ah0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ah0 ah0Var = this.d;
        if (!ah0Var.w || ah0Var.x) {
            return false;
        }
        o1.k kVar = ah0Var.M;
        kVar.a = f7;
        float f11 = ah0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((ah0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        ah0Var.M.h();
        o1.k kVar2 = ah0Var.N;
        kVar2.a = f7;
        kVar2.b = ah0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.r.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ah0Var.I) - AndroidUtilities.dp(16.0f));
        ah0Var.N.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ah0 ah0Var = this.d;
        if (!ah0Var.w && ah0Var.F == null && !ah0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                ah0Var.w = true;
                ah0Var.M.c();
                ah0Var.N.c();
                ah0Var.f0 = false;
                ah0Var.i();
                AndroidUtilities.cancelRunOnUIThread(ah0Var.h0);
            }
        }
        if (ah0Var.w) {
            float f12 = ah0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            ah0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = ah0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = ah0Var.d0;
                if (z10) {
                    if (z10) {
                        ah0Var.M.a(new ei.ea(this, rawX, 2));
                        o1.k kVar = ah0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.h();
                    }
                    ah0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = ah0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = ah0Var.c;
                    ah0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) ah0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                ah0Var.c.y = (int) ah0Var.L;
                ((SharedPreferences) ah0Var.n().b).edit().putFloat("y", ah0Var.L).apply();
                AndroidUtilities.updateViewLayout(ah0Var.b, ah0Var.d, ah0Var.c);
                return true;
            }
            if (!ah0Var.d0) {
                o1.k kVar3 = ah0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - ah0Var.H;
                ah0Var.M.h();
            }
            ah0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ah0 ah0Var = this.d;
        ValueAnimator valueAnimator = ah0Var.F;
        vg0 vg0Var = ah0Var.j0;
        if (valueAnimator == null) {
            if (ah0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(vg0Var);
                ah0Var.i0 = false;
            }
            boolean z10 = !ah0Var.E;
            ah0Var.E = z10;
            ah0Var.y(z10);
            if (ah0Var.E && !ah0Var.i0) {
                AndroidUtilities.runOnUIThread(vg0Var, 2500L);
                ah0Var.i0 = true;
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
