package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kg0 extends n20 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ mg0 d;

    public kg0(mg0 mg0Var, int i10) {
        this.d = mg0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.n20
    public final boolean a() {
        mg0 mg0Var = this.d;
        PhotoViewer photoViewer = mg0Var.S;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.C2 == null && mg0Var.r == null) || mg0Var.Z || mg0Var.V || mg0Var.w || mg0Var.s.isInProgress() || !mg0Var.c0) {
            return false;
        }
        return mg0Var.l() != -9223372036854775807L && mg0Var.m() >= 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z4;
        mg0 mg0Var = this.d;
        PhotoViewer photoViewer = mg0Var.S;
        y61 y61Var = mg0Var.N;
        if (photoViewer != null && ((photoViewer.C2 != null || mg0Var.r != null) && !mg0Var.Z && !mg0Var.V && !mg0Var.w && !mg0Var.s.isInProgress() && mg0Var.c0)) {
            mg0Var.S.getClass();
            boolean z10 = motionEvent.getX() >= (((float) mg0Var.t()) * mg0Var.G) * 0.5f;
            long l10 = mg0Var.l();
            long m9 = mg0Var.m();
            if (l10 != -9223372036854775807L && m9 >= 15000) {
                long j10 = z10 ? l10 + 10000 : l10 - 10000;
                if (l10 != j10) {
                    if (j10 > m9) {
                        j10 = m9;
                    } else if (j10 < 0) {
                        z4 = j10 >= -9000;
                        j10 = 0;
                        if (z4) {
                            y61Var.e(true);
                            y61Var.d(!z10);
                            long j11 = y61Var.o + 10000;
                            y61Var.o = j11;
                            y61Var.p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                            wf0 wf0Var = mg0Var.r;
                            if (wf0Var != null) {
                                wf0Var.i(j10);
                            } else {
                                i71 i71Var = mg0Var.S.C2;
                                if (i71Var != null) {
                                    i71Var.K(j10);
                                }
                            }
                            y61Var.g(0L);
                            mg0Var.W = j10 / m9;
                            nh.a3 a3Var = mg0Var.Y;
                            if (a3Var != null) {
                                a3Var.invalidate();
                            }
                            lg0 lg0Var = mg0Var.h;
                            if (lg0Var != null) {
                                lg0Var.invalidate();
                            }
                            if (!mg0Var.B) {
                                mg0Var.B = true;
                                mg0Var.y(true);
                                if (!mg0Var.f0) {
                                    mg0Var.f0 = true;
                                    AndroidUtilities.runOnUIThread(mg0Var.g0, 2500L);
                                }
                            }
                        }
                        return true;
                    }
                    z4 = true;
                    if (z4) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        mg0 mg0Var = this.d;
        if (mg0Var.B) {
            for (int i10 = 1; i10 < mg0Var.e.getChildCount(); i10++) {
                View childAt = mg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    mg0Var.y = childAt;
                    return true;
                }
            }
        }
        this.a = mg0Var.H;
        this.b = mg0Var.I;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        mg0 mg0Var = this.d;
        if (!mg0Var.w || mg0Var.x) {
            return false;
        }
        o1.j jVar = mg0Var.J;
        jVar.a = f10;
        float f12 = mg0Var.H;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((mg0Var.E / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        mg0Var.J.f();
        o1.j jVar2 = mg0Var.K;
        jVar2.a = f10;
        jVar2.b = mg0Var.I;
        jVar2.c = true;
        jVar2.u.i = k7.n.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - mg0Var.F) - AndroidUtilities.dp(16.0f));
        mg0Var.K.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        mg0 mg0Var = this.d;
        if (!mg0Var.w && mg0Var.C == null && !mg0Var.x) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                mg0Var.w = true;
                mg0Var.J.c();
                mg0Var.K.c();
                mg0Var.c0 = false;
                mg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(mg0Var.e0);
            }
        }
        if (mg0Var.w) {
            float f13 = mg0Var.H;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            mg0Var.I = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = mg0Var.E;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z4 = mg0Var.a0;
                if (z4) {
                    if (z4) {
                        mg0Var.J.a(new jg0(this, rawX, 0));
                        o1.j jVar = mg0Var.J;
                        jVar.b = f13;
                        jVar.c = true;
                        jVar.u.i = rawX;
                        jVar.f();
                    }
                    mg0Var.a0 = false;
                    return true;
                }
                o1.j jVar2 = mg0Var.J;
                if (jVar2.f) {
                    jVar2.u.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = mg0Var.c;
                    mg0Var.H = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) mg0Var.n().b).edit().putFloat("x", rawX).apply();
                }
                mg0Var.c.y = (int) mg0Var.I;
                ((SharedPreferences) mg0Var.n().b).edit().putFloat("y", mg0Var.I).apply();
                AndroidUtilities.updateViewLayout(mg0Var.b, mg0Var.d, mg0Var.c);
                return true;
            }
            if (!mg0Var.a0) {
                o1.j jVar3 = mg0Var.J;
                jVar3.b = f13;
                jVar3.c = true;
                jVar3.u.i = (i10 / 2.0f) + rawX >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? r9 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - mg0Var.E;
                mg0Var.J.f();
            }
            mg0Var.a0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        mg0 mg0Var = this.d;
        ValueAnimator valueAnimator = mg0Var.C;
        fg0 fg0Var = mg0Var.g0;
        if (valueAnimator == null) {
            if (mg0Var.f0) {
                AndroidUtilities.cancelRunOnUIThread(fg0Var);
                mg0Var.f0 = false;
            }
            boolean z4 = !mg0Var.B;
            mg0Var.B = z4;
            mg0Var.y(z4);
            if (mg0Var.B && !mg0Var.f0) {
                AndroidUtilities.runOnUIThread(fg0Var, 2500L);
                mg0Var.f0 = true;
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
