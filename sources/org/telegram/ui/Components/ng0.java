package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ng0 extends l20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ pg0 d;

    public ng0(pg0 pg0Var, int i10) {
        this.d = pg0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.l20
    public final boolean a() {
        pg0 pg0Var = this.d;
        PhotoViewer photoViewer = pg0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && pg0Var.r == null) || pg0Var.c0 || pg0Var.Y || pg0Var.w || pg0Var.s.isInProgress() || !pg0Var.f0) {
            return false;
        }
        return pg0Var.l() != -9223372036854775807L && pg0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        pg0 pg0Var = this.d;
        PhotoViewer photoViewer = pg0Var.V;
        l71 l71Var = pg0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || pg0Var.r != null) && !pg0Var.c0 && !pg0Var.Y && !pg0Var.w && !pg0Var.s.isInProgress() && pg0Var.f0)) {
            pg0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) pg0Var.t()) * pg0Var.J) * 0.5f;
            long l4 = pg0Var.l();
            long m10 = pg0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                long j3 = z11 ? l4 + 10000 : l4 - 10000;
                if (l4 != j3) {
                    if (j3 > m10) {
                        j3 = m10;
                    } else if (j3 < 0) {
                        z10 = j3 >= -9000;
                        j3 = 0;
                        if (z10) {
                            l71Var.e(true);
                            l71Var.d(!z11);
                            long j10 = l71Var.o + 10000;
                            l71Var.o = j10;
                            l71Var.p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                            zf0 zf0Var = pg0Var.r;
                            if (zf0Var != null) {
                                zf0Var.i(j3);
                            } else {
                                u71 u71Var = pg0Var.V.F2;
                                if (u71Var != null) {
                                    u71Var.K(j3);
                                }
                            }
                            l71Var.g(0L);
                            pg0Var.Z = j3 / m10;
                            ai.n4 n4Var = pg0Var.b0;
                            if (n4Var != null) {
                                n4Var.invalidate();
                            }
                            og0 og0Var = pg0Var.h;
                            if (og0Var != null) {
                                og0Var.invalidate();
                            }
                            if (!pg0Var.E) {
                                pg0Var.E = true;
                                pg0Var.y(true);
                                if (!pg0Var.i0) {
                                    pg0Var.i0 = true;
                                    AndroidUtilities.runOnUIThread(pg0Var.j0, 2500L);
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
        pg0 pg0Var = this.d;
        if (pg0Var.E) {
            for (int i10 = 1; i10 < pg0Var.e.getChildCount(); i10++) {
                View childAt = pg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    pg0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = pg0Var.K;
        this.b = pg0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        pg0 pg0Var = this.d;
        if (!pg0Var.w || pg0Var.x) {
            return false;
        }
        o1.k kVar = pg0Var.M;
        kVar.a = f7;
        float f11 = pg0Var.K;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((pg0Var.H / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        pg0Var.M.f();
        o1.k kVar2 = pg0Var.N;
        kVar2.a = f7;
        kVar2.b = pg0Var.L;
        kVar2.c = true;
        kVar2.u.i = w7.q.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pg0Var.I) - AndroidUtilities.dp(16.0f));
        pg0Var.N.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        pg0 pg0Var = this.d;
        if (!pg0Var.w && pg0Var.F == null && !pg0Var.x) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                pg0Var.w = true;
                pg0Var.M.c();
                pg0Var.N.c();
                pg0Var.f0 = false;
                pg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(pg0Var.h0);
            }
        }
        if (pg0Var.w) {
            float f12 = pg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            pg0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = pg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = pg0Var.d0;
                if (z10) {
                    if (z10) {
                        pg0Var.M.a(new ci.va(this, rawX, 2));
                        o1.k kVar = pg0Var.M;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.f();
                    }
                    pg0Var.d0 = false;
                    return true;
                }
                o1.k kVar2 = pg0Var.M;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = pg0Var.c;
                    pg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) pg0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                pg0Var.c.y = (int) pg0Var.L;
                ((SharedPreferences) pg0Var.n().b).edit().putFloat("y", pg0Var.L).apply();
                AndroidUtilities.updateViewLayout(pg0Var.b, pg0Var.d, pg0Var.c);
                return true;
            }
            if (!pg0Var.d0) {
                o1.k kVar3 = pg0Var.M;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - pg0Var.H;
                pg0Var.M.f();
            }
            pg0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        pg0 pg0Var = this.d;
        ValueAnimator valueAnimator = pg0Var.F;
        kg0 kg0Var = pg0Var.j0;
        if (valueAnimator == null) {
            if (pg0Var.i0) {
                AndroidUtilities.cancelRunOnUIThread(kg0Var);
                pg0Var.i0 = false;
            }
            boolean z10 = !pg0Var.E;
            pg0Var.E = z10;
            pg0Var.y(z10);
            if (pg0Var.E && !pg0Var.i0) {
                AndroidUtilities.runOnUIThread(kg0Var, 2500L);
                pg0Var.i0 = true;
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
