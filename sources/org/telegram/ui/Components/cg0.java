package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class cg0 extends l20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ eg0 d;

    public cg0(eg0 eg0Var, int i10) {
        this.d = eg0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.l20
    public final boolean a() {
        eg0 eg0Var = this.d;
        PhotoViewer photoViewer = eg0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && eg0Var.r == null) || eg0Var.c0 || eg0Var.Y || eg0Var.w || eg0Var.s.isInProgress() || !eg0Var.f0) {
            return false;
        }
        return eg0Var.l() != -9223372036854775807L && eg0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        eg0 eg0Var = this.d;
        PhotoViewer photoViewer = eg0Var.V;
        w61 w61Var = eg0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || eg0Var.r != null) && !eg0Var.c0 && !eg0Var.Y && !eg0Var.w && !eg0Var.s.isInProgress() && eg0Var.f0)) {
            eg0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) eg0Var.t()) * eg0Var.J) * 0.5f;
            long l4 = eg0Var.l();
            long m10 = eg0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                long j3 = z11 ? l4 + 10000 : l4 - 10000;
                if (l4 != j3) {
                    if (j3 > m10) {
                        j3 = m10;
                    } else if (j3 < 0) {
                        z10 = j3 >= -9000;
                        j3 = 0;
                        if (z10) {
                            w61Var.e(true);
                            w61Var.d(!z11);
                            long j10 = w61Var.o + 10000;
                            w61Var.o = j10;
                            w61Var.p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                            qf0 qf0Var = eg0Var.r;
                            if (qf0Var != null) {
                                qf0Var.i(j3);
                            } else {
                                g71 g71Var = eg0Var.V.F2;
                                if (g71Var != null) {
                                    g71Var.K(j3);
                                }
                            }
                            w61Var.g(0L);
                            eg0Var.Z = j3 / m10;
                            bi.a4 a4Var = eg0Var.b0;
                            if (a4Var != null) {
                                a4Var.invalidate();
                            }
                            dg0 dg0Var = eg0Var.h;
                            if (dg0Var != null) {
                                dg0Var.invalidate();
                            }
                            if (!eg0Var.E) {
                                eg0Var.E = true;
                                eg0Var.y(true);
                                if (!eg0Var.i0) {
                                    eg0Var.i0 = true;
                                    AndroidUtilities.runOnUIThread(eg0Var.j0, 2500L);
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
        eg0 eg0Var = this.d;
        if (eg0Var.E) {
            for (int i10 = 1; i10 < eg0Var.e.getChildCount(); i10++) {
                View childAt = eg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    eg0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = eg0Var.K;
        this.b = eg0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        eg0 eg0Var = this.d;
        if (!eg0Var.w || eg0Var.x) {
            return false;
        }
        o1.k kVar = eg0Var.M;
        kVar.a = f7;
        float f11 = eg0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((eg0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        eg0Var.M.f();
        o1.k kVar2 = eg0Var.N;
        kVar2.a = f7;
        kVar2.b = eg0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.p.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - eg0Var.I) - AndroidUtilities.dp(16.0f));
        eg0Var.N.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        eg0 eg0Var = this.d;
        if (!eg0Var.w && eg0Var.F == null && !eg0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                eg0Var.w = true;
                eg0Var.M.c();
                eg0Var.N.c();
                eg0Var.f0 = false;
                eg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(eg0Var.h0);
            }
        }
        if (eg0Var.w) {
            float f12 = eg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            eg0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = eg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = eg0Var.d0;
                if (z10) {
                    if (z10) {
                        eg0Var.M.a(new di.va(this, rawX, 2));
                        o1.k kVar = eg0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.f();
                    }
                    eg0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = eg0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = eg0Var.c;
                    eg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) eg0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                eg0Var.c.y = (int) eg0Var.L;
                ((SharedPreferences) eg0Var.n().b).edit().putFloat("y", eg0Var.L).apply();
                AndroidUtilities.updateViewLayout(eg0Var.b, eg0Var.d, eg0Var.c);
                return true;
            }
            if (!eg0Var.d0) {
                o1.k kVar3 = eg0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - eg0Var.H;
                eg0Var.M.f();
            }
            eg0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        eg0 eg0Var = this.d;
        ValueAnimator valueAnimator = eg0Var.F;
        zf0 zf0Var = eg0Var.j0;
        if (valueAnimator == null) {
            if (eg0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(zf0Var);
                eg0Var.i0 = false;
            }
            boolean z10 = !eg0Var.E;
            eg0Var.E = z10;
            eg0Var.y(z10);
            if (eg0Var.E && !eg0Var.i0) {
                AndroidUtilities.runOnUIThread(zf0Var, 2500L);
                eg0Var.i0 = true;
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
