package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fe0 extends x00 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ie0 d;

    public fe0(ie0 ie0Var, int i3) {
        this.d = ie0Var;
        this.c = i3;
    }

    @Override // org.telegram.ui.Components.x00
    public final boolean a() {
        ie0 ie0Var = this.d;
        PhotoViewer photoViewer = ie0Var.W;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.G2 == null && ie0Var.r == null) || ie0Var.d0 || ie0Var.Z || ie0Var.x || ie0Var.s.isInProgress() || !ie0Var.g0) {
            return false;
        }
        return ie0Var.e() != -9223372036854775807L && ie0Var.f() >= 15000;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        ie0 ie0Var = this.d;
        PhotoViewer photoViewer = ie0Var.W;
        d51 d51Var = ie0Var.R;
        if (photoViewer != null && ((photoViewer.G2 != null || ie0Var.r != null) && !ie0Var.d0 && !ie0Var.Z && !ie0Var.x && !ie0Var.s.isInProgress() && ie0Var.g0)) {
            ie0Var.W.getClass();
            boolean z11 = motionEvent.getX() >= (((float) ie0Var.t()) * ie0Var.K) * 0.5f;
            long e10 = ie0Var.e();
            long f10 = ie0Var.f();
            if (e10 != -9223372036854775807L && f10 >= 15000) {
                long j10 = z11 ? e10 + 10000 : e10 - 10000;
                if (e10 != j10) {
                    if (j10 > f10) {
                        z10 = true;
                        j10 = f10;
                    } else if (j10 < 0) {
                        z10 = j10 >= -9000;
                        j10 = 0;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        d51Var.e(true);
                        d51Var.d(!z11);
                        long j11 = d51Var.o + 10000;
                        d51Var.o = j11;
                        d51Var.p = org.telegram.messenger.bd.G((int) (j11 / 1000), "Seconds", new Object[0]);
                        ud0 ud0Var = ie0Var.r;
                        if (ud0Var != null) {
                            ud0Var.i(j10);
                        } else {
                            m51 m51Var = ie0Var.W.G2;
                            if (m51Var != null) {
                                m51Var.p0(j10);
                            }
                        }
                        d51Var.g(0L);
                        ie0Var.a0 = j10 / f10;
                        ei.e3 e3Var = ie0Var.c0;
                        if (e3Var != null) {
                            e3Var.invalidate();
                        }
                        ge0 ge0Var = ie0Var.h;
                        if (ge0Var != null) {
                            ge0Var.invalidate();
                        }
                        if (!ie0Var.F) {
                            ie0Var.F = true;
                            ie0Var.y(true);
                            if (!ie0Var.j0) {
                                ie0Var.j0 = true;
                                org.telegram.messenger.g0.i3(ie0Var.k0, 2500L);
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
        ie0 ie0Var = this.d;
        if (ie0Var.F) {
            for (int i3 = 1; i3 < ie0Var.e.getChildCount(); i3++) {
                View childAt = ie0Var.e.getChildAt(i3);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    ie0Var.E = childAt;
                    return true;
                }
            }
        }
        this.a = ie0Var.L;
        this.b = ie0Var.M;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ie0 ie0Var = this.d;
        if (!ie0Var.x || ie0Var.y) {
            return false;
        }
        q1.g gVar = ie0Var.N;
        gVar.a = f10;
        float f12 = ie0Var.L;
        gVar.b = f12;
        gVar.c = true;
        gVar.m.i = (f10 / 7.0f) + ((ie0Var.I / 2.0f) + f12) >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r5 - r2) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
        ie0Var.N.h();
        q1.g gVar2 = ie0Var.O;
        gVar2.a = f10;
        gVar2.b = ie0Var.M;
        gVar2.c = true;
        gVar2.m.i = b8.be.a((f11 / 10.0f) + r10, org.telegram.messenger.g0.L(16.0f), (r3.y - ie0Var.J) - org.telegram.messenger.g0.L(16.0f));
        ie0Var.O.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ie0 ie0Var = this.d;
        if (!ie0Var.x && ie0Var.G == null && !ie0Var.y) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                ie0Var.x = true;
                ie0Var.N.d();
                ie0Var.O.d();
                ie0Var.g0 = false;
                ie0Var.a();
                org.telegram.messenger.g0.r(ie0Var.i0);
            }
        }
        if (ie0Var.x) {
            float f13 = ie0Var.L;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            ie0Var.M = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i3 = ie0Var.I;
            if (rawX > (-i3) * 0.25f && rawX < org.telegram.messenger.g0.q.x - (i3 * 0.75f)) {
                boolean z10 = ie0Var.e0;
                if (z10) {
                    if (z10) {
                        ie0Var.N.a(new gi.g9(this, rawX, 2));
                        q1.g gVar = ie0Var.N;
                        gVar.b = f13;
                        gVar.c = true;
                        gVar.m.i = rawX;
                        gVar.h();
                    }
                    ie0Var.e0 = false;
                    return true;
                }
                q1.g gVar2 = ie0Var.N;
                if (gVar2.f) {
                    gVar2.m.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = ie0Var.c;
                    ie0Var.L = rawX;
                    layoutParams.x = (int) rawX;
                    ie0Var.h().a.edit().putFloat("x", rawX).apply();
                }
                ie0Var.c.y = (int) ie0Var.M;
                ie0Var.h().a.edit().putFloat("y", ie0Var.M).apply();
                org.telegram.messenger.g0.T3(ie0Var.b, ie0Var.d, ie0Var.c);
                return true;
            }
            if (!ie0Var.e0) {
                q1.g gVar3 = ie0Var.N;
                gVar3.b = f13;
                gVar3.c = true;
                gVar3.m.i = (i3 / 2.0f) + rawX >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? r9 - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f) - ie0Var.I;
                ie0Var.N.h();
            }
            ie0Var.e0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ie0 ie0Var = this.d;
        ValueAnimator valueAnimator = ie0Var.G;
        be0 be0Var = ie0Var.k0;
        if (valueAnimator == null) {
            if (ie0Var.j0) {
                org.telegram.messenger.g0.r(be0Var);
                ie0Var.j0 = false;
            }
            boolean z10 = !ie0Var.F;
            ie0Var.F = z10;
            ie0Var.y(z10);
            if (ie0Var.F && !ie0Var.j0) {
                org.telegram.messenger.g0.i3(be0Var, 2500L);
                ie0Var.j0 = true;
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
