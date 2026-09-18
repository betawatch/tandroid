package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dg0 extends l20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fg0 d;

    public dg0(fg0 fg0Var, int i10) {
        this.d = fg0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.l20
    public final boolean a() {
        fg0 fg0Var = this.d;
        PhotoViewer photoViewer = fg0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && fg0Var.r == null) || fg0Var.c0 || fg0Var.Y || fg0Var.w || fg0Var.s.isInProgress() || !fg0Var.f0) {
            return false;
        }
        return fg0Var.l() != -9223372036854775807L && fg0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        fg0 fg0Var = this.d;
        PhotoViewer photoViewer = fg0Var.V;
        x61 x61Var = fg0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || fg0Var.r != null) && !fg0Var.c0 && !fg0Var.Y && !fg0Var.w && !fg0Var.s.isInProgress() && fg0Var.f0)) {
            fg0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) fg0Var.t()) * fg0Var.J) * 0.5f;
            long l4 = fg0Var.l();
            long m10 = fg0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                long j3 = z11 ? l4 + 10000 : l4 - 10000;
                if (l4 != j3) {
                    if (j3 > m10) {
                        j3 = m10;
                    } else if (j3 < 0) {
                        z10 = j3 >= -9000;
                        j3 = 0;
                        if (z10) {
                            x61Var.e(true);
                            x61Var.d(!z11);
                            long j10 = x61Var.o + 10000;
                            x61Var.o = j10;
                            x61Var.p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                            qf0 qf0Var = fg0Var.r;
                            if (qf0Var != null) {
                                qf0Var.i(j3);
                            } else {
                                h71 h71Var = fg0Var.V.F2;
                                if (h71Var != null) {
                                    h71Var.K(j3);
                                }
                            }
                            x61Var.g(0L);
                            fg0Var.Z = j3 / m10;
                            ai.n4 n4Var = fg0Var.b0;
                            if (n4Var != null) {
                                n4Var.invalidate();
                            }
                            eg0 eg0Var = fg0Var.h;
                            if (eg0Var != null) {
                                eg0Var.invalidate();
                            }
                            if (!fg0Var.E) {
                                fg0Var.E = true;
                                fg0Var.y(true);
                                if (!fg0Var.i0) {
                                    fg0Var.i0 = true;
                                    AndroidUtilities.runOnUIThread(fg0Var.j0, 2500L);
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
        fg0 fg0Var = this.d;
        if (fg0Var.E) {
            for (int i10 = 1; i10 < fg0Var.e.getChildCount(); i10++) {
                View childAt = fg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    fg0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = fg0Var.K;
        this.b = fg0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        fg0 fg0Var = this.d;
        if (!fg0Var.w || fg0Var.x) {
            return false;
        }
        o1.k kVar = fg0Var.M;
        kVar.a = f7;
        float f11 = fg0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((fg0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        fg0Var.M.f();
        o1.k kVar2 = fg0Var.N;
        kVar2.a = f7;
        kVar2.b = fg0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.p.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fg0Var.I) - AndroidUtilities.dp(16.0f));
        fg0Var.N.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        fg0 fg0Var = this.d;
        if (!fg0Var.w && fg0Var.F == null && !fg0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                fg0Var.w = true;
                fg0Var.M.c();
                fg0Var.N.c();
                fg0Var.f0 = false;
                fg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(fg0Var.h0);
            }
        }
        if (fg0Var.w) {
            float f12 = fg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            fg0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = fg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = fg0Var.d0;
                if (z10) {
                    if (z10) {
                        fg0Var.M.a(new ci.va(this, rawX, 2));
                        o1.k kVar = fg0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.f();
                    }
                    fg0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = fg0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = fg0Var.c;
                    fg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    fg0Var.n().a.edit().putFloat("x", rawX).apply();
                }
                fg0Var.c.y = (int) fg0Var.L;
                fg0Var.n().a.edit().putFloat("y", fg0Var.L).apply();
                AndroidUtilities.updateViewLayout(fg0Var.b, fg0Var.d, fg0Var.c);
                return true;
            }
            if (!fg0Var.d0) {
                o1.k kVar3 = fg0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - fg0Var.H;
                fg0Var.M.f();
            }
            fg0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        fg0 fg0Var = this.d;
        ValueAnimator valueAnimator = fg0Var.F;
        ag0 ag0Var = fg0Var.j0;
        if (valueAnimator == null) {
            if (fg0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(ag0Var);
                fg0Var.i0 = false;
            }
            boolean z10 = !fg0Var.E;
            fg0Var.E = z10;
            fg0Var.y(z10);
            if (fg0Var.E && !fg0Var.i0) {
                AndroidUtilities.runOnUIThread(ag0Var, 2500L);
                fg0Var.i0 = true;
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
