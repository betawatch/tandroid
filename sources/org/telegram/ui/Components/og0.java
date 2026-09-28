package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class og0 extends o20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qg0 d;

    public og0(qg0 qg0Var, int i10) {
        this.d = qg0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.o20
    public final boolean a() {
        qg0 qg0Var = this.d;
        PhotoViewer photoViewer = qg0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && qg0Var.r == null) || qg0Var.c0 || qg0Var.Y || qg0Var.w || qg0Var.s.isInProgress() || !qg0Var.f0) {
            return false;
        }
        return qg0Var.l() != -9223372036854775807L && qg0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        qg0 qg0Var = this.d;
        PhotoViewer photoViewer = qg0Var.V;
        m71 m71Var = qg0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || qg0Var.r != null) && !qg0Var.c0 && !qg0Var.Y && !qg0Var.w && !qg0Var.s.isInProgress() && qg0Var.f0)) {
            qg0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) qg0Var.t()) * qg0Var.J) * 0.5f;
            long l4 = qg0Var.l();
            long m10 = qg0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                long j3 = z11 ? l4 + 10000 : l4 - 10000;
                if (l4 != j3) {
                    if (j3 > m10) {
                        j3 = m10;
                    } else if (j3 < 0) {
                        z10 = j3 >= -9000;
                        j3 = 0;
                        if (z10) {
                            m71Var.e(true);
                            m71Var.d(!z11);
                            long j10 = m71Var.o + 10000;
                            m71Var.o = j10;
                            m71Var.p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                            cg0 cg0Var = qg0Var.r;
                            if (cg0Var != null) {
                                cg0Var.i(j3);
                            } else {
                                u71 u71Var = qg0Var.V.F2;
                                if (u71Var != null) {
                                    u71Var.K(j3);
                                }
                            }
                            m71Var.g(0L);
                            qg0Var.Z = j3 / m10;
                            ai.n4 n4Var = qg0Var.b0;
                            if (n4Var != null) {
                                n4Var.invalidate();
                            }
                            pg0 pg0Var = qg0Var.h;
                            if (pg0Var != null) {
                                pg0Var.invalidate();
                            }
                            if (!qg0Var.E) {
                                qg0Var.E = true;
                                qg0Var.y(true);
                                if (!qg0Var.i0) {
                                    qg0Var.i0 = true;
                                    AndroidUtilities.runOnUIThread(qg0Var.j0, 2500L);
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
        qg0 qg0Var = this.d;
        if (qg0Var.E) {
            for (int i10 = 1; i10 < qg0Var.e.getChildCount(); i10++) {
                View childAt = qg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    qg0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = qg0Var.K;
        this.b = qg0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        qg0 qg0Var = this.d;
        if (!qg0Var.w || qg0Var.x) {
            return false;
        }
        o1.k kVar = qg0Var.M;
        kVar.a = f7;
        float f11 = qg0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((qg0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        qg0Var.M.f();
        o1.k kVar2 = qg0Var.N;
        kVar2.a = f7;
        kVar2.b = qg0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.q.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - qg0Var.I) - AndroidUtilities.dp(16.0f));
        qg0Var.N.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        qg0 qg0Var = this.d;
        if (!qg0Var.w && qg0Var.F == null && !qg0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                qg0Var.w = true;
                qg0Var.M.c();
                qg0Var.N.c();
                qg0Var.f0 = false;
                qg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(qg0Var.h0);
            }
        }
        if (qg0Var.w) {
            float f12 = qg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            qg0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = qg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = qg0Var.d0;
                if (z10) {
                    if (z10) {
                        qg0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = qg0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.f();
                    }
                    qg0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = qg0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = qg0Var.c;
                    qg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) qg0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                qg0Var.c.y = (int) qg0Var.L;
                ((SharedPreferences) qg0Var.n().b).edit().putFloat("y", qg0Var.L).apply();
                AndroidUtilities.updateViewLayout(qg0Var.b, qg0Var.d, qg0Var.c);
                return true;
            }
            if (!qg0Var.d0) {
                o1.k kVar3 = qg0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - qg0Var.H;
                qg0Var.M.f();
            }
            qg0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        qg0 qg0Var = this.d;
        ValueAnimator valueAnimator = qg0Var.F;
        lg0 lg0Var = qg0Var.j0;
        if (valueAnimator == null) {
            if (qg0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(lg0Var);
                qg0Var.i0 = false;
            }
            boolean z10 = !qg0Var.E;
            qg0Var.E = z10;
            qg0Var.y(z10);
            if (qg0Var.E && !qg0Var.i0) {
                AndroidUtilities.runOnUIThread(lg0Var, 2500L);
                qg0Var.i0 = true;
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
