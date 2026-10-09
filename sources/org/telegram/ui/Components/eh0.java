package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class eh0 extends c30 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ gh0 d;

    public eh0(gh0 gh0Var, int i10) {
        this.d = gh0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.c30
    public final boolean a() {
        gh0 gh0Var = this.d;
        PhotoViewer photoViewer = gh0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && gh0Var.r == null) || gh0Var.c0 || gh0Var.Y || gh0Var.w || gh0Var.s.isInProgress() || !gh0Var.f0) {
            return false;
        }
        return gh0Var.l() != -9223372036854775807L && gh0Var.m() >= 15000;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        gh0 gh0Var = this.d;
        PhotoViewer photoViewer = gh0Var.V;
        b81 b81Var = gh0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || gh0Var.r != null) && !gh0Var.c0 && !gh0Var.Y && !gh0Var.w && !gh0Var.s.isInProgress() && gh0Var.f0)) {
            gh0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) gh0Var.t()) * gh0Var.J) * 0.5f;
            long l4 = gh0Var.l();
            long m10 = gh0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                long j3 = z11 ? l4 + 10000 : l4 - 10000;
                if (l4 != j3) {
                    if (j3 > m10) {
                        z10 = true;
                        j3 = m10;
                    } else if (j3 < 0) {
                        z10 = j3 >= -9000;
                        j3 = 0;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        b81Var.e(true);
                        b81Var.d(!z11);
                        long j10 = b81Var.o + 10000;
                        b81Var.o = j10;
                        b81Var.p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                        sg0 sg0Var = gh0Var.r;
                        if (sg0Var != null) {
                            sg0Var.i(j3);
                        } else {
                            k81 k81Var = gh0Var.V.F2;
                            if (k81Var != null) {
                                k81Var.K(j3);
                            }
                        }
                        b81Var.g(0L);
                        gh0Var.Z = j3 / m10;
                        ai.o4 o4Var = gh0Var.b0;
                        if (o4Var != null) {
                            o4Var.invalidate();
                        }
                        fh0 fh0Var = gh0Var.h;
                        if (fh0Var != null) {
                            fh0Var.invalidate();
                        }
                        if (!gh0Var.E) {
                            gh0Var.E = true;
                            gh0Var.y(true);
                            if (!gh0Var.i0) {
                                gh0Var.i0 = true;
                                AndroidUtilities.runOnUIThread(gh0Var.j0, 2500L);
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
        gh0 gh0Var = this.d;
        if (gh0Var.E) {
            for (int i10 = 1; i10 < gh0Var.e.getChildCount(); i10++) {
                View childAt = gh0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    gh0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = gh0Var.K;
        this.b = gh0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        gh0 gh0Var = this.d;
        if (!gh0Var.w || gh0Var.x) {
            return false;
        }
        o1.k kVar = gh0Var.M;
        kVar.a = f7;
        float f11 = gh0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((gh0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        gh0Var.M.h();
        o1.k kVar2 = gh0Var.N;
        kVar2.a = f7;
        kVar2.b = gh0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.o.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - gh0Var.I) - AndroidUtilities.dp(16.0f));
        gh0Var.N.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        gh0 gh0Var = this.d;
        if (!gh0Var.w && gh0Var.F == null && !gh0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                gh0Var.w = true;
                gh0Var.M.c();
                gh0Var.N.c();
                gh0Var.f0 = false;
                gh0Var.i();
                AndroidUtilities.cancelRunOnUIThread(gh0Var.h0);
            }
        }
        if (gh0Var.w) {
            float f12 = gh0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            gh0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = gh0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = gh0Var.d0;
                if (z10) {
                    if (z10) {
                        gh0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = gh0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.h();
                    }
                    gh0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = gh0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = gh0Var.c;
                    gh0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    gh0Var.n().a.edit().putFloat("x", rawX).apply();
                }
                gh0Var.c.y = (int) gh0Var.L;
                gh0Var.n().a.edit().putFloat("y", gh0Var.L).apply();
                AndroidUtilities.updateViewLayout(gh0Var.b, gh0Var.d, gh0Var.c);
                return true;
            }
            if (!gh0Var.d0) {
                o1.k kVar3 = gh0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - gh0Var.H;
                gh0Var.M.h();
            }
            gh0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        gh0 gh0Var = this.d;
        ValueAnimator valueAnimator = gh0Var.F;
        bh0 bh0Var = gh0Var.j0;
        if (valueAnimator == null) {
            if (gh0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(bh0Var);
                gh0Var.i0 = false;
            }
            boolean z10 = !gh0Var.E;
            gh0Var.E = z10;
            gh0Var.y(z10);
            if (gh0Var.E && !gh0Var.i0) {
                AndroidUtilities.runOnUIThread(bh0Var, 2500L);
                gh0Var.i0 = true;
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
