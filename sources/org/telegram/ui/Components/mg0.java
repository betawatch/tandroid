package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mg0 extends u20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ og0 d;

    public mg0(og0 og0Var, int i10) {
        this.d = og0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.u20
    public final boolean a() {
        og0 og0Var = this.d;
        PhotoViewer photoViewer = og0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && og0Var.r == null) || og0Var.c0 || og0Var.Y || og0Var.w || og0Var.s.isInProgress() || !og0Var.f0) {
            return false;
        }
        return og0Var.l() != -9223372036854775807L && og0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        og0 og0Var = this.d;
        PhotoViewer photoViewer = og0Var.V;
        j71 j71Var = og0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || og0Var.r != null) && !og0Var.c0 && !og0Var.Y && !og0Var.w && !og0Var.s.isInProgress() && og0Var.f0)) {
            og0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) og0Var.t()) * og0Var.J) * 0.5f;
            long l4 = og0Var.l();
            long m10 = og0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                long j3 = z11 ? l4 + 10000 : l4 - 10000;
                if (l4 != j3) {
                    if (j3 > m10) {
                        j3 = m10;
                    } else if (j3 < 0) {
                        z10 = j3 >= -9000;
                        j3 = 0;
                        if (z10) {
                            j71Var.e(true);
                            j71Var.d(!z11);
                            long j10 = j71Var.o + 10000;
                            j71Var.o = j10;
                            j71Var.p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                            zf0 zf0Var = og0Var.r;
                            if (zf0Var != null) {
                                zf0Var.i(j3);
                            } else {
                                t71 t71Var = og0Var.V.F2;
                                if (t71Var != null) {
                                    t71Var.K(j3);
                                }
                            }
                            j71Var.g(0L);
                            og0Var.Z = j3 / m10;
                            org.telegram.ui.u7 u7Var = og0Var.b0;
                            if (u7Var != null) {
                                u7Var.invalidate();
                            }
                            ng0 ng0Var = og0Var.h;
                            if (ng0Var != null) {
                                ng0Var.invalidate();
                            }
                            if (!og0Var.E) {
                                og0Var.E = true;
                                og0Var.y(true);
                                if (!og0Var.i0) {
                                    og0Var.i0 = true;
                                    AndroidUtilities.runOnUIThread(og0Var.j0, 2500L);
                                }
                            }
                        }
                        return true;
                    }
                    z10 = true;
                    if (z10) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        og0 og0Var = this.d;
        if (og0Var.E) {
            for (int i10 = 1; i10 < og0Var.e.getChildCount(); i10++) {
                View childAt = og0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    og0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = og0Var.K;
        this.b = og0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        og0 og0Var = this.d;
        if (!og0Var.w || og0Var.x) {
            return false;
        }
        o1.k kVar = og0Var.M;
        kVar.a = f7;
        float f11 = og0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((og0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        og0Var.M.f();
        o1.k kVar2 = og0Var.N;
        kVar2.a = f7;
        kVar2.b = og0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.q.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
        og0Var.N.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        og0 og0Var = this.d;
        if (!og0Var.w && og0Var.F == null && !og0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                og0Var.w = true;
                og0Var.M.c();
                og0Var.N.c();
                og0Var.f0 = false;
                og0Var.i();
                AndroidUtilities.cancelRunOnUIThread(og0Var.h0);
            }
        }
        if (og0Var.w) {
            float f12 = og0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            og0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = og0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = og0Var.d0;
                if (z10) {
                    if (z10) {
                        og0Var.M.a(new bi.ec(this, rawX, 2));
                        o1.k kVar = og0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.f();
                    }
                    og0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = og0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = og0Var.c;
                    og0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    og0Var.n().a.edit().putFloat("x", rawX).apply();
                }
                og0Var.c.y = (int) og0Var.L;
                og0Var.n().a.edit().putFloat("y", og0Var.L).apply();
                AndroidUtilities.updateViewLayout(og0Var.b, og0Var.d, og0Var.c);
                return true;
            }
            if (!og0Var.d0) {
                o1.k kVar3 = og0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - og0Var.H;
                og0Var.M.f();
            }
            og0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        og0 og0Var = this.d;
        ValueAnimator valueAnimator = og0Var.F;
        ig0 ig0Var = og0Var.j0;
        if (valueAnimator == null) {
            if (og0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(ig0Var);
                og0Var.i0 = false;
            }
            boolean z10 = !og0Var.E;
            og0Var.E = z10;
            og0Var.y(z10);
            if (og0Var.E && !og0Var.i0) {
                AndroidUtilities.runOnUIThread(ig0Var, 2500L);
                og0Var.i0 = true;
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
