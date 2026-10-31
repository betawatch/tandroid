package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hf0 extends r10 {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ jf0 d;

    public hf0(jf0 jf0Var, int i10) {
        this.d = jf0Var;
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.r10
    public final boolean a() {
        jf0 jf0Var = this.d;
        PhotoViewer photoViewer = jf0Var.V;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.F2 == null && jf0Var.r == null) || jf0Var.c0 || jf0Var.Y || jf0Var.x || jf0Var.s.isInProgress() || !jf0Var.f0) {
            return false;
        }
        return jf0Var.e() != -9223372036854775807L && jf0Var.f() >= 15000;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        jf0 jf0Var = this.d;
        PhotoViewer photoViewer = jf0Var.V;
        m61 m61Var = jf0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || jf0Var.r != null) && !jf0Var.c0 && !jf0Var.Y && !jf0Var.x && !jf0Var.s.isInProgress() && jf0Var.f0)) {
            jf0Var.V.getClass();
            boolean z11 = motionEvent.getX() >= (((float) jf0Var.t()) * jf0Var.J) * 0.5f;
            long e = jf0Var.e();
            long f7 = jf0Var.f();
            if (e != -9223372036854775807L && f7 >= 15000) {
                long j10 = z11 ? e + 10000 : e - 10000;
                if (e != j10) {
                    if (j10 > f7) {
                        z10 = true;
                        j10 = f7;
                    } else if (j10 < 0) {
                        z10 = j10 >= -9000;
                        j10 = 0;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        m61Var.e(true);
                        m61Var.d(!z11);
                        long j11 = m61Var.o + 10000;
                        m61Var.o = j11;
                        m61Var.p = org.telegram.messenger.cd.G((int) (j11 / 1000), "Seconds", new Object[0]);
                        ve0 ve0Var = jf0Var.r;
                        if (ve0Var != null) {
                            ve0Var.i(j10);
                        } else {
                            u61 u61Var = jf0Var.V.F2;
                            if (u61Var != null) {
                                u61Var.p0(j10);
                            }
                        }
                        m61Var.g(0L);
                        jf0Var.Z = j10 / f7;
                        ih.c cVar = jf0Var.b0;
                        if (cVar != null) {
                            cVar.invalidate();
                        }
                        if0 if0Var = jf0Var.h;
                        if (if0Var != null) {
                            if0Var.invalidate();
                        }
                        if (!jf0Var.E) {
                            jf0Var.E = true;
                            jf0Var.y(true);
                            if (!jf0Var.i0) {
                                jf0Var.i0 = true;
                                org.telegram.messenger.i0.h3(jf0Var.j0, 2500L);
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
        jf0 jf0Var = this.d;
        if (jf0Var.E) {
            for (int i10 = 1; i10 < jf0Var.e.getChildCount(); i10++) {
                View childAt = jf0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    jf0Var.D = childAt;
                    return true;
                }
            }
        }
        this.a = jf0Var.K;
        this.b = jf0Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        jf0 jf0Var = this.d;
        if (!jf0Var.x || jf0Var.y) {
            return false;
        }
        o1.j jVar = jf0Var.M;
        jVar.a = f7;
        float f11 = jf0Var.K;
        jVar.b = f11;
        jVar.c = true;
        jVar.m.i = (f7 / 7.0f) + ((jf0Var.H / 2.0f) + f11) >= ((float) org.telegram.messenger.i0.q.x) / 2.0f ? (r5 - r2) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
        jf0Var.M.h();
        o1.j jVar2 = jf0Var.N;
        jVar2.a = f7;
        jVar2.b = jf0Var.L;
        jVar2.c = true;
        jVar2.m.i = w7.u.a((f10 / 10.0f) + r10, org.telegram.messenger.i0.L(16.0f), (r3.y - jf0Var.I) - org.telegram.messenger.i0.L(16.0f));
        jf0Var.N.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        jf0 jf0Var = this.d;
        if (!jf0Var.x && jf0Var.F == null && !jf0Var.y) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                jf0Var.x = true;
                jf0Var.M.d();
                jf0Var.N.d();
                jf0Var.f0 = false;
                jf0Var.a();
                org.telegram.messenger.i0.r(jf0Var.h0);
            }
        }
        if (jf0Var.x) {
            float f12 = jf0Var.K;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            jf0Var.L = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            int i10 = jf0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < org.telegram.messenger.i0.q.x - (i10 * 0.75f)) {
                boolean z10 = jf0Var.d0;
                if (z10) {
                    if (z10) {
                        jf0Var.M.a(new gf0(this, rawX, 0));
                        o1.j jVar = jf0Var.M;
                        jVar.b = f12;
                        jVar.c = true;
                        jVar.m.i = rawX;
                        jVar.h();
                    }
                    jf0Var.d0 = false;
                    return true;
                }
                o1.j jVar2 = jf0Var.M;
                if (jVar2.f) {
                    jVar2.m.i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = jf0Var.c;
                    jf0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) jf0Var.h().a).edit().putFloat("x", rawX).apply();
                }
                jf0Var.c.y = (int) jf0Var.L;
                ((SharedPreferences) jf0Var.h().a).edit().putFloat("y", jf0Var.L).apply();
                org.telegram.messenger.i0.S3(jf0Var.b, jf0Var.d, jf0Var.c);
                return true;
            }
            if (!jf0Var.d0) {
                o1.j jVar3 = jf0Var.M;
                jVar3.b = f12;
                jVar3.c = true;
                jVar3.m.i = (i10 / 2.0f) + rawX >= ((float) org.telegram.messenger.i0.q.x) / 2.0f ? r9 - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f) - jf0Var.H;
                jf0Var.M.h();
            }
            jf0Var.d0 = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        jf0 jf0Var = this.d;
        ValueAnimator valueAnimator = jf0Var.F;
        cf0 cf0Var = jf0Var.j0;
        if (valueAnimator == null) {
            if (jf0Var.i0) {
                org.telegram.messenger.i0.r(cf0Var);
                jf0Var.i0 = false;
            }
            boolean z10 = !jf0Var.E;
            jf0Var.E = z10;
            jf0Var.y(z10);
            if (jf0Var.E && !jf0Var.i0) {
                org.telegram.messenger.i0.h3(cf0Var, 2500L);
                jf0Var.i0 = true;
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
