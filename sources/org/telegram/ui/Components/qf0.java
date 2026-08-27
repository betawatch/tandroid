package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qf0 extends z10 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ sf0 d;

    public qf0(sf0 sf0Var, int i10) {
        this.d = sf0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.z10
    public final boolean a() {
        sf0 sf0Var = this.d;
        PhotoViewer photoViewer = sf0Var.R;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.B2 == null && sf0Var.r == null) || sf0Var.Y || sf0Var.U || sf0Var.w || sf0Var.s.isInProgress() || !sf0Var.b0) {
            return false;
        }
        return sf0Var.l() != -9223372036854775807L && sf0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        sf0 sf0Var = this.d;
        PhotoViewer photoViewer = sf0Var.R;
        c61 c61Var = sf0Var.M;
        if (photoViewer != null && ((photoViewer.B2 != null || sf0Var.r != null) && !sf0Var.Y && !sf0Var.U && !sf0Var.w && !sf0Var.s.isInProgress() && sf0Var.b0)) {
            sf0Var.R.getClass();
            boolean z11 = motionEvent.getX() >= (((float) sf0Var.t()) * sf0Var.F) * 0.5f;
            long l10 = sf0Var.l();
            long m10 = sf0Var.m();
            if (l10 != -9223372036854775807L && m10 >= 15000) {
                long j10 = z11 ? l10 + 10000 : l10 - 10000;
                if (l10 != j10) {
                    if (j10 > m10) {
                        j10 = m10;
                    } else if (j10 < 0) {
                        z10 = j10 >= -9000;
                        j10 = 0;
                        if (z10) {
                            c61Var.e(true);
                            c61Var.d(!z11);
                            long j11 = c61Var.o + 10000;
                            c61Var.o = j11;
                            c61Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                            df0 df0Var = sf0Var.r;
                            if (df0Var != null) {
                                df0Var.i(j10);
                            } else {
                                m61 m61Var = sf0Var.R.B2;
                                if (m61Var != null) {
                                    m61Var.L(j10);
                                }
                            }
                            c61Var.g(0L);
                            sf0Var.V = j10 / m10;
                            jh.a3 a3Var = sf0Var.X;
                            if (a3Var != null) {
                                a3Var.invalidate();
                            }
                            rf0 rf0Var = sf0Var.h;
                            if (rf0Var != null) {
                                rf0Var.invalidate();
                            }
                            if (!sf0Var.A) {
                                sf0Var.A = true;
                                sf0Var.y(true);
                                if (!sf0Var.e0) {
                                    sf0Var.e0 = true;
                                    AndroidUtilities.runOnUIThread(sf0Var.f0, 2500L);
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
        sf0 sf0Var = this.d;
        if (sf0Var.A) {
            for (int i10 = 1; i10 < sf0Var.e.getChildCount(); i10++) {
                View childAt = sf0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    sf0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = sf0Var.G;
        this.b = sf0Var.H;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        sf0 sf0Var = this.d;
        if (!sf0Var.w || sf0Var.x) {
            return false;
        }
        o1.j jVar = sf0Var.I;
        jVar.a = f10;
        float f12 = sf0Var.G;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((sf0Var.D / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        sf0Var.I.f();
        o1.j jVar2 = sf0Var.J;
        jVar2.a = f10;
        jVar2.b = sf0Var.H;
        jVar2.c = true;
        jVar2.u.i = h7.n.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - sf0Var.E) - AndroidUtilities.dp(16.0f));
        sf0Var.J.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        sf0 sf0Var = this.d;
        if (!sf0Var.w && sf0Var.B == null && !sf0Var.x) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                sf0Var.w = true;
                sf0Var.I.c();
                sf0Var.J.c();
                sf0Var.b0 = false;
                sf0Var.i();
                AndroidUtilities.cancelRunOnUIThread(sf0Var.d0);
            }
        }
        if (sf0Var.w) {
            float f13 = sf0Var.G;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            sf0Var.H = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = sf0Var.D;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = sf0Var.Z;
                if (z10) {
                    if (z10) {
                        sf0Var.I.a(new lh.da(this, rawX, 2));
                        o1.j jVar = sf0Var.I;
                        jVar.b = f13;
                        jVar.c = true;
                        jVar.u.i = rawX;
                        jVar.f();
                    }
                    sf0Var.Z = false;
                    return true;
                }
                o1.j jVar2 = sf0Var.I;
                if (jVar2.f) {
                    jVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = sf0Var.c;
                    sf0Var.G = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) sf0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                sf0Var.c.y = (int) sf0Var.H;
                ((SharedPreferences) sf0Var.n().b).edit().putFloat("y", sf0Var.H).apply();
                AndroidUtilities.updateViewLayout(sf0Var.b, sf0Var.d, sf0Var.c);
                return true;
            }
            if (!sf0Var.Z) {
                o1.j jVar3 = sf0Var.I;
                jVar3.b = f13;
                jVar3.c = true;
                jVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - sf0Var.D;
                sf0Var.I.f();
            }
            sf0Var.Z = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        sf0 sf0Var = this.d;
        ValueAnimator valueAnimator = sf0Var.B;
        mf0 mf0Var = sf0Var.f0;
        if (valueAnimator == null) {
            if (sf0Var.e0) {
                AndroidUtilities.cancelRunOnUIThread(mf0Var);
                sf0Var.e0 = false;
            }
            boolean z10 = !sf0Var.A;
            sf0Var.A = z10;
            sf0Var.y(z10);
            if (sf0Var.A && !sf0Var.e0) {
                AndroidUtilities.runOnUIThread(mf0Var, 2500L);
                sf0Var.e0 = true;
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
