package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zf0 extends h20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ bg0 d;

    public zf0(bg0 bg0Var, int i10) {
        this.d = bg0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.h20
    public final boolean a() {
        bg0 bg0Var = this.d;
        PhotoViewer photoViewer = bg0Var.R;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.B2 == null && bg0Var.r == null) || bg0Var.Y || bg0Var.U || bg0Var.w || bg0Var.s.isInProgress() || !bg0Var.b0) {
            return false;
        }
        return bg0Var.l() != -9223372036854775807L && bg0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        bg0 bg0Var = this.d;
        PhotoViewer photoViewer = bg0Var.R;
        n61 n61Var = bg0Var.M;
        if (photoViewer != null && ((photoViewer.B2 != null || bg0Var.r != null) && !bg0Var.Y && !bg0Var.U && !bg0Var.w && !bg0Var.s.isInProgress() && bg0Var.b0)) {
            bg0Var.R.getClass();
            boolean z11 = motionEvent.getX() >= (((float) bg0Var.t()) * bg0Var.F) * 0.5f;
            long l10 = bg0Var.l();
            long m10 = bg0Var.m();
            if (l10 != -9223372036854775807L && m10 >= 15000) {
                long j10 = z11 ? l10 + 10000 : l10 - 10000;
                if (l10 != j10) {
                    if (j10 > m10) {
                        j10 = m10;
                    } else if (j10 < 0) {
                        z10 = j10 >= -9000;
                        j10 = 0;
                        if (z10) {
                            n61Var.e(true);
                            n61Var.d(!z11);
                            long j11 = n61Var.o + 10000;
                            n61Var.o = j11;
                            n61Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                            mf0 mf0Var = bg0Var.r;
                            if (mf0Var != null) {
                                mf0Var.i(j10);
                            } else {
                                x61 x61Var = bg0Var.R.B2;
                                if (x61Var != null) {
                                    x61Var.L(j10);
                                }
                            }
                            n61Var.g(0L);
                            bg0Var.V = j10 / m10;
                            lh.z2 z2Var = bg0Var.X;
                            if (z2Var != null) {
                                z2Var.invalidate();
                            }
                            ag0 ag0Var = bg0Var.h;
                            if (ag0Var != null) {
                                ag0Var.invalidate();
                            }
                            if (!bg0Var.A) {
                                bg0Var.A = true;
                                bg0Var.y(true);
                                if (!bg0Var.e0) {
                                    bg0Var.e0 = true;
                                    AndroidUtilities.runOnUIThread(bg0Var.f0, 2500L);
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
        bg0 bg0Var = this.d;
        if (bg0Var.A) {
            for (int i10 = 1; i10 < bg0Var.e.getChildCount(); i10++) {
                View childAt = bg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    bg0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = bg0Var.G;
        this.b = bg0Var.H;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        bg0 bg0Var = this.d;
        if (!bg0Var.w || bg0Var.x) {
            return false;
        }
        o1.k kVar = bg0Var.I;
        kVar.a = f9;
        float f11 = bg0Var.G;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f9 / 7.0f) + ((bg0Var.D / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        bg0Var.I.f();
        o1.k kVar2 = bg0Var.J;
        kVar2.a = f9;
        kVar2.b = bg0Var.H;
        kVar2.c = true;
        kVar2.u.i = i7.w.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - bg0Var.E) - AndroidUtilities.dp(16.0f));
        bg0Var.J.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        bg0 bg0Var = this.d;
        if (!bg0Var.w && bg0Var.B == null && !bg0Var.x) {
            float abs = Math.abs(f9);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                bg0Var.w = true;
                bg0Var.I.c();
                bg0Var.J.c();
                bg0Var.b0 = false;
                bg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(bg0Var.d0);
            }
        }
        if (bg0Var.w) {
            float f12 = bg0Var.G;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            bg0Var.H = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = bg0Var.D;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = bg0Var.Z;
                if (z10) {
                    if (z10) {
                        bg0Var.I.a(new nh.r9(this, rawX, 1));
                        o1.k kVar = bg0Var.I;
                        kVar.b = f12;
                        kVar.c = true;
                        kVar.u.i = rawX;
                        kVar.f();
                    }
                    bg0Var.Z = false;
                    return true;
                }
                o1.k kVar2 = bg0Var.I;
                if (kVar2.f) {
                    kVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = bg0Var.c;
                    bg0Var.G = rawX;
                    layoutParams.x = (int) rawX;
                    bg0Var.n().a.edit().putFloat("x", rawX).apply();
                }
                bg0Var.c.y = (int) bg0Var.H;
                bg0Var.n().a.edit().putFloat("y", bg0Var.H).apply();
                AndroidUtilities.updateViewLayout(bg0Var.b, bg0Var.d, bg0Var.c);
                return true;
            }
            if (!bg0Var.Z) {
                o1.k kVar3 = bg0Var.I;
                kVar3.b = f12;
                kVar3.c = true;
                kVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - bg0Var.D;
                bg0Var.I.f();
            }
            bg0Var.Z = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        bg0 bg0Var = this.d;
        ValueAnimator valueAnimator = bg0Var.B;
        vf0 vf0Var = bg0Var.f0;
        if (valueAnimator == null) {
            if (bg0Var.e0) {
                AndroidUtilities.cancelRunOnUIThread(vf0Var);
                bg0Var.e0 = false;
            }
            boolean z10 = !bg0Var.A;
            bg0Var.A = z10;
            bg0Var.y(z10);
            if (bg0Var.A && !bg0Var.e0) {
                AndroidUtilities.runOnUIThread(vf0Var, 2500L);
                bg0Var.e0 = true;
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
