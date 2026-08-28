package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nf0 extends w10 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ pf0 d;

    public nf0(pf0 pf0Var, int i9) {
        this.d = pf0Var;
        this.c = i9;
    }

    @Override // org.telegram.ui.Components.w10
    public final boolean a() {
        pf0 pf0Var = this.d;
        PhotoViewer photoViewer = pf0Var.R;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.B2 == null && pf0Var.r == null) || pf0Var.Y || pf0Var.U || pf0Var.w || pf0Var.s.isInProgress() || !pf0Var.b0) {
            return false;
        }
        return pf0Var.l() != -9223372036854775807L && pf0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        pf0 pf0Var = this.d;
        PhotoViewer photoViewer = pf0Var.R;
        a61 a61Var = pf0Var.M;
        if (photoViewer != null && ((photoViewer.B2 != null || pf0Var.r != null) && !pf0Var.Y && !pf0Var.U && !pf0Var.w && !pf0Var.s.isInProgress() && pf0Var.b0)) {
            pf0Var.R.getClass();
            boolean z11 = motionEvent.getX() >= (((float) pf0Var.t()) * pf0Var.F) * 0.5f;
            long l10 = pf0Var.l();
            long m10 = pf0Var.m();
            if (l10 != -9223372036854775807L && m10 >= 15000) {
                long j10 = z11 ? l10 + 10000 : l10 - 10000;
                if (l10 != j10) {
                    if (j10 > m10) {
                        j10 = m10;
                    } else if (j10 < 0) {
                        z10 = j10 >= -9000;
                        j10 = 0;
                        if (z10) {
                            a61Var.e(true);
                            a61Var.d(!z11);
                            long j11 = a61Var.o + 10000;
                            a61Var.o = j11;
                            a61Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                            ze0 ze0Var = pf0Var.r;
                            if (ze0Var != null) {
                                ze0Var.i(j10);
                            } else {
                                k61 k61Var = pf0Var.R.B2;
                                if (k61Var != null) {
                                    k61Var.L(j10);
                                }
                            }
                            a61Var.g(0L);
                            pf0Var.V = j10 / m10;
                            ih.b3 b3Var = pf0Var.X;
                            if (b3Var != null) {
                                b3Var.invalidate();
                            }
                            of0 of0Var = pf0Var.h;
                            if (of0Var != null) {
                                of0Var.invalidate();
                            }
                            if (!pf0Var.A) {
                                pf0Var.A = true;
                                pf0Var.y(true);
                                if (!pf0Var.e0) {
                                    pf0Var.e0 = true;
                                    AndroidUtilities.runOnUIThread(pf0Var.f0, 2500L);
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
        pf0 pf0Var = this.d;
        if (pf0Var.A) {
            for (int i9 = 1; i9 < pf0Var.e.getChildCount(); i9++) {
                View childAt = pf0Var.e.getChildAt(i9);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    pf0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = pf0Var.G;
        this.b = pf0Var.H;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        pf0 pf0Var = this.d;
        if (!pf0Var.w || pf0Var.x) {
            return false;
        }
        o1.j jVar = pf0Var.I;
        jVar.a = f10;
        float f12 = pf0Var.G;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((pf0Var.D / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        pf0Var.I.f();
        o1.j jVar2 = pf0Var.J;
        jVar2.a = f10;
        jVar2.b = pf0Var.H;
        jVar2.c = true;
        jVar2.u.i = g7.n.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pf0Var.E) - AndroidUtilities.dp(16.0f));
        pf0Var.J.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        pf0 pf0Var = this.d;
        if (!pf0Var.w && pf0Var.B == null && !pf0Var.x) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                pf0Var.w = true;
                pf0Var.I.c();
                pf0Var.J.c();
                pf0Var.b0 = false;
                pf0Var.i();
                AndroidUtilities.cancelRunOnUIThread(pf0Var.d0);
            }
        }
        if (pf0Var.w) {
            float f13 = pf0Var.G;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            pf0Var.H = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i9 = pf0Var.D;
            if (rawX > (-i9) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i9 * 0.75f)) {
                boolean z10 = pf0Var.Z;
                if (z10) {
                    if (z10) {
                        pf0Var.I.a(new kh.ga(this, rawX, 2));
                        o1.j jVar = pf0Var.I;
                        jVar.b = f13;
                        jVar.c = true;
                        jVar.u.i = rawX;
                        jVar.f();
                    }
                    pf0Var.Z = false;
                    return true;
                }
                o1.j jVar2 = pf0Var.I;
                if (jVar2.f) {
                    jVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = pf0Var.c;
                    pf0Var.G = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) pf0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                pf0Var.c.y = (int) pf0Var.H;
                ((SharedPreferences) pf0Var.n().b).edit().putFloat("y", pf0Var.H).apply();
                AndroidUtilities.updateViewLayout(pf0Var.b, pf0Var.d, pf0Var.c);
                return true;
            }
            if (!pf0Var.Z) {
                o1.j jVar3 = pf0Var.I;
                jVar3.b = f13;
                jVar3.c = true;
                jVar3.u.i = (i9 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - pf0Var.D;
                pf0Var.I.f();
            }
            pf0Var.Z = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        pf0 pf0Var = this.d;
        ValueAnimator valueAnimator = pf0Var.B;
        jf0 jf0Var = pf0Var.f0;
        if (valueAnimator == null) {
            if (pf0Var.e0) {
                AndroidUtilities.cancelRunOnUIThread(jf0Var);
                pf0Var.e0 = false;
            }
            boolean z10 = !pf0Var.A;
            pf0Var.A = z10;
            pf0Var.y(z10);
            if (pf0Var.A && !pf0Var.e0) {
                AndroidUtilities.runOnUIThread(jf0Var, 2500L);
                pf0Var.e0 = true;
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
