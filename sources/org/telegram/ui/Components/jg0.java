package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jg0 extends m20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ lg0 d;

    public jg0(lg0 lg0Var, int i10) {
        this.d = lg0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.m20
    public final boolean a() {
        lg0 lg0Var = this.d;
        PhotoViewer photoViewer = lg0Var.S;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.C2 == null && lg0Var.r == null) || lg0Var.Z || lg0Var.V || lg0Var.w || lg0Var.s.isInProgress() || !lg0Var.c0) {
            return false;
        }
        return lg0Var.l() != -9223372036854775807L && lg0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z4;
        lg0 lg0Var = this.d;
        PhotoViewer photoViewer = lg0Var.S;
        y61 y61Var = lg0Var.N;
        if (photoViewer != null && ((photoViewer.C2 != null || lg0Var.r != null) && !lg0Var.Z && !lg0Var.V && !lg0Var.w && !lg0Var.s.isInProgress() && lg0Var.c0)) {
            lg0Var.S.getClass();
            boolean z10 = motionEvent.getX() >= (((float) lg0Var.t()) * lg0Var.G) * 0.5f;
            long l10 = lg0Var.l();
            long m9 = lg0Var.m();
            if (l10 != -9223372036854775807L && m9 >= 15000) {
                long j10 = z10 ? l10 + 10000 : l10 - 10000;
                if (l10 != j10) {
                    if (j10 > m9) {
                        j10 = m9;
                    } else if (j10 < 0) {
                        z4 = j10 >= -9000;
                        j10 = 0;
                        if (z4) {
                            y61Var.e(true);
                            y61Var.d(!z10);
                            long j11 = y61Var.o + 10000;
                            y61Var.o = j11;
                            y61Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                            vf0 vf0Var = lg0Var.r;
                            if (vf0Var != null) {
                                vf0Var.i(j10);
                            } else {
                                i71 i71Var = lg0Var.S.C2;
                                if (i71Var != null) {
                                    i71Var.K(j10);
                                }
                            }
                            y61Var.g(0L);
                            lg0Var.W = j10 / m9;
                            nh.a3 a3Var = lg0Var.Y;
                            if (a3Var != null) {
                                a3Var.invalidate();
                            }
                            kg0 kg0Var = lg0Var.h;
                            if (kg0Var != null) {
                                kg0Var.invalidate();
                            }
                            if (!lg0Var.B) {
                                lg0Var.B = true;
                                lg0Var.y(true);
                                if (!lg0Var.f0) {
                                    lg0Var.f0 = true;
                                    AndroidUtilities.runOnUIThread(lg0Var.g0, 2500L);
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
        lg0 lg0Var = this.d;
        if (lg0Var.B) {
            for (int i10 = 1; i10 < lg0Var.e.getChildCount(); i10++) {
                View childAt = lg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    lg0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = lg0Var.H;
        this.b = lg0Var.I;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        lg0 lg0Var = this.d;
        if (!lg0Var.w || lg0Var.x) {
            return false;
        }
        o1.j jVar = lg0Var.J;
        jVar.a = f10;
        float f12 = lg0Var.H;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((lg0Var.E / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        lg0Var.J.f();
        o1.j jVar2 = lg0Var.K;
        jVar2.a = f10;
        jVar2.b = lg0Var.I;
        jVar2.c = true;
        jVar2.u.i = k7.n.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - lg0Var.F) - AndroidUtilities.dp(16.0f));
        lg0Var.K.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        lg0 lg0Var = this.d;
        if (!lg0Var.w && lg0Var.C == null && !lg0Var.x) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                lg0Var.w = true;
                lg0Var.J.c();
                lg0Var.K.c();
                lg0Var.c0 = false;
                lg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(lg0Var.e0);
            }
        }
        if (lg0Var.w) {
            float f13 = lg0Var.H;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            lg0Var.I = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = lg0Var.E;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z4 = lg0Var.a0;
                if (z4) {
                    if (z4) {
                        lg0Var.J.a(new ig0(this, rawX, 0));
                        o1.j jVar = lg0Var.J;
                        jVar.b = f13;
                        jVar.c = true;
                        jVar.u.i = rawX;
                        jVar.f();
                    }
                    lg0Var.a0 = false;
                    return true;
                }
                o1.j jVar2 = lg0Var.J;
                if (jVar2.f) {
                    jVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = lg0Var.c;
                    lg0Var.H = rawX;
                    layoutParams.x = (int) rawX;
                    lg0Var.n().a.edit().putFloat("x", rawX).apply();
                }
                lg0Var.c.y = (int) lg0Var.I;
                lg0Var.n().a.edit().putFloat("y", lg0Var.I).apply();
                AndroidUtilities.updateViewLayout(lg0Var.b, lg0Var.d, lg0Var.c);
                return true;
            }
            if (!lg0Var.a0) {
                o1.j jVar3 = lg0Var.J;
                jVar3.b = f13;
                jVar3.c = true;
                jVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - lg0Var.E;
                lg0Var.J.f();
            }
            lg0Var.a0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        lg0 lg0Var = this.d;
        ValueAnimator valueAnimator = lg0Var.C;
        eg0 eg0Var = lg0Var.g0;
        if (valueAnimator == null) {
            if (lg0Var.f0) {
                AndroidUtilities.cancelRunOnUIThread(eg0Var);
                lg0Var.f0 = false;
            }
            boolean z4 = !lg0Var.B;
            lg0Var.B = z4;
            lg0Var.y(z4);
            if (lg0Var.B && !lg0Var.f0) {
                AndroidUtilities.runOnUIThread(eg0Var, 2500L);
                lg0Var.f0 = true;
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
