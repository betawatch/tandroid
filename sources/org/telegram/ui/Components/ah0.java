package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ah0 extends w20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ch0 d;

    public ah0(ch0 ch0Var, int i10) {
        this.d = ch0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.w20
    public final boolean a() {
        ch0 ch0Var = this.d;
        PhotoViewer photoViewer = ch0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && ch0Var.r == null) || ch0Var.c0 || ch0Var.Y || ch0Var.w || ch0Var.s.isInProgress() || !ch0Var.f0) {
            return false;
        }
        return ch0Var.l() != -9223372036854775807L && ch0Var.m() >= 15000;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        ch0 ch0Var = this.d;
        PhotoViewer photoViewer = ch0Var.V;
        j81 j81Var = ch0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || ch0Var.r != null) && !ch0Var.c0 && !ch0Var.Y && !ch0Var.w && !ch0Var.s.isInProgress() && ch0Var.f0)) {
            ch0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) ch0Var.t()) * ch0Var.J) * 0.5f;
            long l4 = ch0Var.l();
            long m10 = ch0Var.m();
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
                        j81Var.e(true);
                        j81Var.d(!z11);
                        long j11 = j81Var.o + 10000;
                        j81Var.o = j11;
                        j81Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        mg0 mg0Var = ch0Var.r;
                        if (mg0Var != null) {
                            mg0Var.i(j10);
                        } else {
                            s81 s81Var = ch0Var.V.F2;
                            if (s81Var != null) {
                                s81Var.K(j10);
                            }
                        }
                        j81Var.g(0L);
                        ch0Var.Z = j10 / m10;
                        di.h3 h3Var = ch0Var.b0;
                        if (h3Var != null) {
                            h3Var.invalidate();
                        }
                        bh0 bh0Var = ch0Var.h;
                        if (bh0Var != null) {
                            bh0Var.invalidate();
                        }
                        if (!ch0Var.E) {
                            ch0Var.E = true;
                            ch0Var.y(true);
                            if (!ch0Var.i0) {
                                ch0Var.i0 = true;
                                AndroidUtilities.runOnUIThread(ch0Var.j0, 2500L);
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
        ch0 ch0Var = this.d;
        if (ch0Var.E) {
            for (int i10 = 1; i10 < ch0Var.e.getChildCount(); i10++) {
                View childAt = ch0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    ch0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = ch0Var.K;
        this.b = ch0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ch0 ch0Var = this.d;
        if (!ch0Var.w || ch0Var.x) {
            return false;
        }
        o1.j jVar = ch0Var.M;
        jVar.a = f7;
        float f11 = ch0Var.K;
        jVar.b = f11;
        jVar.c = true;
        jVar.u.i = (f7 / 7.0f) + ((ch0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        ch0Var.M.h();
        o1.j jVar2 = ch0Var.N;
        jVar2.a = f7;
        jVar2.b = ch0Var.L;
        jVar2.c = true;
        jVar2.u.i = a8.ee.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ch0Var.I) - AndroidUtilities.dp(16.0f));
        ch0Var.N.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ch0 ch0Var = this.d;
        if (!ch0Var.w && ch0Var.F == null && !ch0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                ch0Var.w = true;
                ch0Var.M.c();
                ch0Var.N.c();
                ch0Var.f0 = false;
                ch0Var.i();
                AndroidUtilities.cancelRunOnUIThread(ch0Var.h0);
            }
        }
        if (ch0Var.w) {
            float f12 = ch0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            ch0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = ch0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = ch0Var.d0;
                if (z10) {
                    if (z10) {
                        ch0Var.M.a(new fi.aa(this, rawX, 2));
                        o1.j jVar = ch0Var.M;
                        jVar.b = f12;
                        jVar.c = true;
                        jVar.u.i = rawX;
                        jVar.h();
                    }
                    ch0Var.d0 = false;
                    return true;
                }
                o1.j jVar2 = ch0Var.M;
                if (jVar2.f) {
                    jVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = ch0Var.c;
                    ch0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) ch0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                ch0Var.c.y = (int) ch0Var.L;
                ((SharedPreferences) ch0Var.n().b).edit().putFloat("y", ch0Var.L).apply();
                AndroidUtilities.updateViewLayout(ch0Var.b, ch0Var.d, ch0Var.c);
                return true;
            }
            if (!ch0Var.d0) {
                o1.j jVar3 = ch0Var.M;
                jVar3.b = f12;
                jVar3.c = true;
                jVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - ch0Var.H;
                ch0Var.M.h();
            }
            ch0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ch0 ch0Var = this.d;
        ValueAnimator valueAnimator = ch0Var.F;
        xg0 xg0Var = ch0Var.j0;
        if (valueAnimator == null) {
            if (ch0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(xg0Var);
                ch0Var.i0 = false;
            }
            boolean z10 = !ch0Var.E;
            ch0Var.E = z10;
            ch0Var.y(z10);
            if (ch0Var.E && !ch0Var.i0) {
                AndroidUtilities.runOnUIThread(xg0Var, 2500L);
                ch0Var.i0 = true;
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
