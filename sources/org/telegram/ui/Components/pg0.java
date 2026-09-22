package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pg0 extends l20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ rg0 d;

    public pg0(rg0 rg0Var, int i10) {
        this.d = rg0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.l20
    public final boolean a() {
        rg0 rg0Var = this.d;
        PhotoViewer photoViewer = rg0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && rg0Var.r == null) || rg0Var.c0 || rg0Var.Y || rg0Var.w || rg0Var.s.isInProgress() || !rg0Var.f0) {
            return false;
        }
        return rg0Var.l() != -9223372036854775807L && rg0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        rg0 rg0Var = this.d;
        PhotoViewer photoViewer = rg0Var.V;
        n71 n71Var = rg0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || rg0Var.r != null) && !rg0Var.c0 && !rg0Var.Y && !rg0Var.w && !rg0Var.s.isInProgress() && rg0Var.f0)) {
            rg0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) rg0Var.t()) * rg0Var.J) * 0.5f;
            long l4 = rg0Var.l();
            long m10 = rg0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                long j3 = z11 ? l4 + 10000 : l4 - 10000;
                if (l4 != j3) {
                    if (j3 > m10) {
                        j3 = m10;
                    } else if (j3 < 0) {
                        z10 = j3 >= -9000;
                        j3 = 0;
                        if (z10) {
                            n71Var.e(true);
                            n71Var.d(!z11);
                            long j10 = n71Var.o + 10000;
                            n71Var.o = j10;
                            n71Var.p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                            bg0 bg0Var = rg0Var.r;
                            if (bg0Var != null) {
                                bg0Var.i(j3);
                            } else {
                                v71 v71Var = rg0Var.V.F2;
                                if (v71Var != null) {
                                    v71Var.K(j3);
                                }
                            }
                            n71Var.g(0L);
                            rg0Var.Z = j3 / m10;
                            ai.n4 n4Var = rg0Var.b0;
                            if (n4Var != null) {
                                n4Var.invalidate();
                            }
                            qg0 qg0Var = rg0Var.h;
                            if (qg0Var != null) {
                                qg0Var.invalidate();
                            }
                            if (!rg0Var.E) {
                                rg0Var.E = true;
                                rg0Var.y(true);
                                if (!rg0Var.i0) {
                                    rg0Var.i0 = true;
                                    AndroidUtilities.runOnUIThread(rg0Var.j0, 2500L);
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
        rg0 rg0Var = this.d;
        if (rg0Var.E) {
            for (int i10 = 1; i10 < rg0Var.e.getChildCount(); i10++) {
                View childAt = rg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    rg0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = rg0Var.K;
        this.b = rg0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        rg0 rg0Var = this.d;
        if (!rg0Var.w || rg0Var.x) {
            return false;
        }
        o1.k kVar = rg0Var.M;
        kVar.a = f7;
        float f11 = rg0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((rg0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        rg0Var.M.f();
        o1.k kVar2 = rg0Var.N;
        kVar2.a = f7;
        kVar2.b = rg0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.q.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rg0Var.I) - AndroidUtilities.dp(16.0f));
        rg0Var.N.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        rg0 rg0Var = this.d;
        if (!rg0Var.w && rg0Var.F == null && !rg0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                rg0Var.w = true;
                rg0Var.M.c();
                rg0Var.N.c();
                rg0Var.f0 = false;
                rg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(rg0Var.h0);
            }
        }
        if (rg0Var.w) {
            float f12 = rg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            rg0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = rg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = rg0Var.d0;
                if (z10) {
                    if (z10) {
                        rg0Var.M.a(new ci.va(this, rawX, 2));
                        o1.k kVar = rg0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.f();
                    }
                    rg0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = rg0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = rg0Var.c;
                    rg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) rg0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                rg0Var.c.y = (int) rg0Var.L;
                ((SharedPreferences) rg0Var.n().b).edit().putFloat("y", rg0Var.L).apply();
                AndroidUtilities.updateViewLayout(rg0Var.b, rg0Var.d, rg0Var.c);
                return true;
            }
            if (!rg0Var.d0) {
                o1.k kVar3 = rg0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - rg0Var.H;
                rg0Var.M.f();
            }
            rg0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        rg0 rg0Var = this.d;
        ValueAnimator valueAnimator = rg0Var.F;
        mg0 mg0Var = rg0Var.j0;
        if (valueAnimator == null) {
            if (rg0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(mg0Var);
                rg0Var.i0 = false;
            }
            boolean z10 = !rg0Var.E;
            rg0Var.E = z10;
            rg0Var.y(z10);
            if (rg0Var.E && !rg0Var.i0) {
                AndroidUtilities.runOnUIThread(mg0Var, 2500L);
                rg0Var.i0 = true;
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
