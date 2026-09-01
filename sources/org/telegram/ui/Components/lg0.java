package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class lg0 extends n20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ng0 d;

    public lg0(ng0 ng0Var, int i10) {
        this.d = ng0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.n20
    public final boolean a() {
        ng0 ng0Var = this.d;
        PhotoViewer photoViewer = ng0Var.S;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.C2 == null && ng0Var.r == null) || ng0Var.Z || ng0Var.V || ng0Var.w || ng0Var.s.isInProgress() || !ng0Var.c0) {
            return false;
        }
        return ng0Var.l() != -9223372036854775807L && ng0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z4;
        ng0 ng0Var = this.d;
        PhotoViewer photoViewer = ng0Var.S;
        a71 a71Var = ng0Var.N;
        if (photoViewer != null && ((photoViewer.C2 != null || ng0Var.r != null) && !ng0Var.Z && !ng0Var.V && !ng0Var.w && !ng0Var.s.isInProgress() && ng0Var.c0)) {
            ng0Var.S.getClass();
            boolean z10 = motionEvent.getX() >= (((float) ng0Var.t()) * ng0Var.G) * 0.5f;
            long l10 = ng0Var.l();
            long m9 = ng0Var.m();
            if (l10 != -9223372036854775807L && m9 >= 15000) {
                long j10 = z10 ? l10 + 10000 : l10 - 10000;
                if (l10 != j10) {
                    if (j10 > m9) {
                        j10 = m9;
                    } else if (j10 < 0) {
                        z4 = j10 >= -9000;
                        j10 = 0;
                        if (z4) {
                            a71Var.e(true);
                            a71Var.d(!z10);
                            long j11 = a71Var.o + 10000;
                            a71Var.o = j11;
                            a71Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                            xf0 xf0Var = ng0Var.r;
                            if (xf0Var != null) {
                                xf0Var.i(j10);
                            } else {
                                k71 k71Var = ng0Var.S.C2;
                                if (k71Var != null) {
                                    k71Var.K(j10);
                                }
                            }
                            a71Var.g(0L);
                            ng0Var.W = j10 / m9;
                            oh.b3 b3Var = ng0Var.Y;
                            if (b3Var != null) {
                                b3Var.invalidate();
                            }
                            mg0 mg0Var = ng0Var.h;
                            if (mg0Var != null) {
                                mg0Var.invalidate();
                            }
                            if (!ng0Var.B) {
                                ng0Var.B = true;
                                ng0Var.y(true);
                                if (!ng0Var.f0) {
                                    ng0Var.f0 = true;
                                    AndroidUtilities.runOnUIThread(ng0Var.g0, 2500L);
                                }
                            }
                        }
                        return true;
                    }
                    z4 = true;
                    if (z4) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ng0 ng0Var = this.d;
        if (ng0Var.B) {
            for (int i10 = 1; i10 < ng0Var.e.getChildCount(); i10++) {
                View childAt = ng0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    ng0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = ng0Var.H;
        this.b = ng0Var.I;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ng0 ng0Var = this.d;
        if (!ng0Var.w || ng0Var.x) {
            return false;
        }
        o1.j jVar = ng0Var.J;
        jVar.a = f10;
        float f12 = ng0Var.H;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((ng0Var.E / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        ng0Var.J.f();
        o1.j jVar2 = ng0Var.K;
        jVar2.a = f10;
        jVar2.b = ng0Var.I;
        jVar2.c = true;
        jVar2.u.i = k7.o.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ng0Var.F) - AndroidUtilities.dp(16.0f));
        ng0Var.K.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ng0 ng0Var = this.d;
        if (!ng0Var.w && ng0Var.C == null && !ng0Var.x) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                ng0Var.w = true;
                ng0Var.J.c();
                ng0Var.K.c();
                ng0Var.c0 = false;
                ng0Var.i();
                AndroidUtilities.cancelRunOnUIThread(ng0Var.e0);
            }
        }
        if (ng0Var.w) {
            float f13 = ng0Var.H;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            ng0Var.I = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = ng0Var.E;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z4 = ng0Var.a0;
                if (z4) {
                    if (z4) {
                        ng0Var.J.a(new kg0(this, rawX, 0));
                        o1.j jVar = ng0Var.J;
                        jVar.b = f13;
                        jVar.c = true;
                        jVar.u.i = rawX;
                        jVar.f();
                    }
                    ng0Var.a0 = false;
                    return true;
                }
                o1.j jVar2 = ng0Var.J;
                if (jVar2.f) {
                    jVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = ng0Var.c;
                    ng0Var.H = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) ng0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                ng0Var.c.y = (int) ng0Var.I;
                ((SharedPreferences) ng0Var.n().b).edit().putFloat("y", ng0Var.I).apply();
                AndroidUtilities.updateViewLayout(ng0Var.b, ng0Var.d, ng0Var.c);
                return true;
            }
            if (!ng0Var.a0) {
                o1.j jVar3 = ng0Var.J;
                jVar3.b = f13;
                jVar3.c = true;
                jVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - ng0Var.E;
                ng0Var.J.f();
            }
            ng0Var.a0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ng0 ng0Var = this.d;
        ValueAnimator valueAnimator = ng0Var.C;
        gg0 gg0Var = ng0Var.g0;
        if (valueAnimator == null) {
            if (ng0Var.f0) {
                AndroidUtilities.cancelRunOnUIThread(gg0Var);
                ng0Var.f0 = false;
            }
            boolean z4 = !ng0Var.B;
            ng0Var.B = z4;
            ng0Var.y(z4);
            if (ng0Var.B && !ng0Var.f0) {
                AndroidUtilities.runOnUIThread(gg0Var, 2500L);
                ng0Var.f0 = true;
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
