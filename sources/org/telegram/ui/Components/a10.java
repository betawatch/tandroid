package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a10 {
    public static final int x;
    public static final int y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final android.support.v4.media.session.q f;
    public final z00 g;
    public y00 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public MotionEvent n;
    public MotionEvent o;
    public MotionEvent p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public VelocityTracker w;

    static {
        ViewConfiguration.getLongPressTimeout();
        x = ViewConfiguration.getTapTimeout();
        y = ViewConfiguration.getDoubleTapTimeout();
    }

    public a10(Context context, PhotoViewer photoViewer) {
        this(context, (z00) photoViewer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0431, code lost:
    
        if (java.lang.Math.sqrt(java.lang.Math.pow(((r1.y + org.telegram.messenger.g0.m) / 2.0f) - r4.getY(), 2.0d) + java.lang.Math.pow((r1.x / 2.0f) - r4.getX(), 2.0d)) < org.telegram.messenger.g0.L(40.0f)) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04a1, code lost:
    
        if (r4 > r5) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0491, code lost:
    
        if (r1 > r5) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        android.support.v4.media.session.q qVar;
        boolean z9;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        long j3;
        z00 z00Var;
        long j10;
        boolean z10;
        z00 z00Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.eq0 eq0Var;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.eq0 eq0Var2;
        y00 y00Var;
        boolean z13;
        boolean onScroll;
        int i7;
        boolean z14;
        int action = motionEvent.getAction();
        MotionEvent motionEvent4 = this.o;
        if (motionEvent4 != null) {
            motionEvent4.recycle();
        }
        this.o = MotionEvent.obtain(motionEvent);
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        int i10 = action & org.telegram.messenger.qs.e4;
        boolean z15 = i10 == 6;
        int actionIndex = z15 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (actionIndex != i11) {
                f10 += motionEvent.getX(i11);
                f11 += motionEvent.getY(i11);
            }
        }
        float f12 = z15 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        z00 z00Var3 = this.g;
        android.support.v4.media.session.q qVar2 = this.f;
        if (i10 != 0) {
            if (i10 == 1) {
                boolean z16 = false;
                this.i = false;
                z00Var3.d1();
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (!this.q) {
                    if (this.k) {
                        qVar2.removeMessages(3);
                        this.k = false;
                    } else if (this.l) {
                        boolean onSingleTapUp = z00Var3.onSingleTapUp(motionEvent);
                        if (this.j && (y00Var = this.h) != null) {
                            ((PhotoViewer) y00Var).Y1(motionEvent);
                        }
                        z16 = onSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.w;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.e);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.d || Math.abs(xVelocity) > this.d) {
                            z16 = z00Var3.onFling(this.n, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    z16 = false;
                }
                MotionEvent motionEvent5 = this.p;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.p = obtain;
                VelocityTracker velocityTracker2 = this.w;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.w = null;
                }
                this.q = false;
                this.j = false;
                qVar2.removeMessages(1);
                qVar2.removeMessages(2);
                return z16;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    qVar2.removeMessages(1);
                    qVar2.removeMessages(2);
                    qVar2.removeMessages(3);
                    this.w.recycle();
                    this.w = null;
                    this.q = false;
                    this.i = false;
                    this.l = false;
                    this.m = false;
                    this.j = false;
                    this.k = false;
                    return false;
                }
                if (i10 == 5) {
                    this.r = f13;
                    this.t = f13;
                    this.s = f14;
                    this.u = f14;
                    qVar2.removeMessages(1);
                    qVar2.removeMessages(2);
                    qVar2.removeMessages(3);
                    this.q = false;
                    this.l = false;
                    this.m = false;
                    this.j = false;
                    this.k = false;
                    return false;
                }
                if (i10 == 6) {
                    this.r = f13;
                    this.t = f13;
                    this.s = f14;
                    this.u = f14;
                    this.w.computeCurrentVelocity(1000, this.e);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.w.getXVelocity(pointerId2);
                    float yVelocity2 = this.w.getYVelocity(pointerId2);
                    for (int i12 = 0; i12 < pointerCount; i12++) {
                        if (i12 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i12);
                            if ((this.w.getYVelocity(pointerId3) * yVelocity2) + (this.w.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                                this.w.clear();
                                return false;
                            }
                        }
                    }
                }
            } else if (!this.k) {
                int i13 = Build.VERSION.SDK_INT;
                int i14 = 29;
                int classification = i13 >= 29 ? motionEvent.getClassification() : 0;
                boolean hasMessages = qVar2.hasMessages(2);
                float f15 = this.r - f13;
                float f16 = this.s - f14;
                if (this.q) {
                    onScroll = false;
                    z13 = hasMessages;
                } else {
                    if (this.l) {
                        int i15 = (int) (f13 - this.t);
                        int i16 = (int) (f14 - this.u);
                        int i17 = (i16 * i16) + (i15 * i15);
                        boolean z17 = i13 >= 29 && classification == 1;
                        int i18 = this.a;
                        if (hasMessages && z17) {
                            if (i17 > i18) {
                                qVar2.removeMessages(2);
                                i7 = i17;
                                z13 = hasMessages;
                                qVar2.sendMessageDelayed(qVar2.obtainMessage(2, 0, 0), (long) (ViewConfiguration.getLongPressTimeout() * 2.0f));
                            } else {
                                i7 = i17;
                                z13 = hasMessages;
                            }
                            i18 = (int) (i18 * 4.0f);
                        } else {
                            i7 = i17;
                            z13 = hasMessages;
                        }
                        int i19 = i7;
                        if (i19 > i18) {
                            onScroll = z00Var3.onScroll(this.n, motionEvent, f15, f16);
                            this.r = f13;
                            this.s = f14;
                            z14 = false;
                            this.l = false;
                            qVar2.removeMessages(3);
                            qVar2.removeMessages(1);
                            qVar2.removeMessages(2);
                        } else {
                            z14 = false;
                            onScroll = false;
                        }
                        if (i19 > this.b) {
                            this.m = z14;
                        }
                    } else {
                        z13 = hasMessages;
                        if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                            onScroll = z00Var3.onScroll(this.n, motionEvent, f15, f16);
                            this.r = f13;
                            this.s = f14;
                        } else {
                            onScroll = false;
                        }
                    }
                    i14 = 29;
                }
                if (i13 >= i14 && classification == 2 && z13) {
                    qVar2.removeMessages(2);
                    qVar2.sendMessage(qVar2.obtainMessage(2, 0, 0));
                }
                return onScroll;
            }
            return false;
        }
        this.j = false;
        y00 y00Var2 = this.h;
        if (y00Var2 != null) {
            PhotoViewer photoViewer = (PhotoViewer) y00Var2;
            if (photoViewer.N0.getVisibility() != 0) {
                boolean[] zArr = photoViewer.w1;
                if (!zArr[0] && !zArr[1]) {
                    float x10 = motionEvent.getX();
                    if ((x10 < Math.min(org.telegram.messenger.qs.R1, photoViewer.e0.getMeasuredWidth() / 8) || x10 > photoViewer.e0.getMeasuredWidth() - r4) && (ijVar = photoViewer.S4) != null && ((!org.telegram.messenger.ij.L4(ijVar.k) && ((eq0Var2 = photoViewer.f0) == null || !eq0Var2.y)) || SystemClock.elapsedRealtime() - photoViewer.u1 < 500 || !photoViewer.j0(motionEvent))) {
                        this.j = true;
                    }
                }
            }
            boolean hasMessages2 = qVar2.hasMessages(3);
            if (hasMessages2) {
                qVar2.removeMessages(3);
            }
            MotionEvent motionEvent6 = this.n;
            int i20 = y;
            if (motionEvent6 != null && (motionEvent3 = this.p) != null && hasMessages2 && this.m) {
                long eventTime = motionEvent.getEventTime() - motionEvent3.getEventTime();
                if (eventTime <= i20 && eventTime >= 40) {
                    int x11 = ((int) motionEvent6.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent6.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x11 * x11) < this.c) {
                        this.q = true;
                        y00 y00Var3 = this.h;
                        MotionEvent motionEvent7 = this.n;
                        PhotoViewer photoViewer2 = (PhotoViewer) y00Var3;
                        if ((photoViewer2.F2 != null || ((eq0Var = photoViewer2.f0) != null && eq0Var.y)) && photoViewer2.k3) {
                            long k12 = photoViewer2.k1();
                            j3 = 0;
                            long x12 = photoViewer2.x1();
                            float x13 = motionEvent7.getX();
                            int g12 = photoViewer2.g1(photoViewer2.t4) / 3;
                            float f17 = g12 * 2;
                            if (photoViewer2.j0(motionEvent7)) {
                                long j11 = x13 >= f17 ? k12 + 10000 : x13 < ((float) g12) ? k12 - 10000 : k12;
                                if (k12 != j11) {
                                    if (j11 > x12) {
                                        j10 = x12;
                                    } else {
                                        if (j11 < 0) {
                                            z10 = j11 >= -9000;
                                            j10 = 0;
                                            if (z10) {
                                                z00Var2 = z00Var3;
                                            } else {
                                                photoViewer2.z1.e(true);
                                                photoViewer2.z1.d(x13 < ((float) g12));
                                                k51 k51Var = photoViewer2.z1;
                                                z00Var2 = z00Var3;
                                                long j12 = k51Var.o + 10000;
                                                k51Var.o = j12;
                                                k51Var.p = org.telegram.messenger.id.G((int) (j12 / 1000), "Seconds", new Object[0]);
                                                photoViewer2.q2(j10);
                                                photoViewer2.e0.invalidate();
                                                photoViewer2.p3.h(true, j10 / x12);
                                                photoViewer2.q3.invalidate();
                                            }
                                            qVar = qVar2;
                                            z00Var3 = z00Var2;
                                            z11 = true;
                                            this.h.getClass();
                                            z9 = z11;
                                            this.r = f13;
                                            this.t = f13;
                                            this.s = f14;
                                            this.u = f14;
                                            motionEvent2 = this.n;
                                            if (motionEvent2 != null) {
                                                motionEvent2.recycle();
                                            }
                                            this.n = MotionEvent.obtain(motionEvent);
                                            this.l = true;
                                            this.m = true;
                                            this.i = true;
                                            this.k = false;
                                            if (this.v) {
                                                qVar.removeMessages(2);
                                                qVar.sendMessageDelayed(qVar.obtainMessage(2, 0, 0), ViewConfiguration.getLongPressTimeout());
                                            }
                                            qVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                                            return z00Var3.onDown(motionEvent) | z9;
                                        }
                                        j10 = j11;
                                    }
                                    z10 = true;
                                    if (z10) {
                                    }
                                    qVar = qVar2;
                                    z00Var3 = z00Var2;
                                    z11 = true;
                                    this.h.getClass();
                                    z9 = z11;
                                    this.r = f13;
                                    this.t = f13;
                                    this.s = f14;
                                    this.u = f14;
                                    motionEvent2 = this.n;
                                    if (motionEvent2 != null) {
                                    }
                                    this.n = MotionEvent.obtain(motionEvent);
                                    this.l = true;
                                    this.m = true;
                                    this.i = true;
                                    this.k = false;
                                    if (this.v) {
                                    }
                                    qVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                                    return z00Var3.onDown(motionEvent) | z9;
                                }
                            }
                            z00Var = z00Var3;
                        } else {
                            z00Var = z00Var3;
                            j3 = 0;
                        }
                        if (photoViewer2.H6 && ((photoViewer2.Z5 != 1.0f || (photoViewer2.X5 == 0.0f && photoViewer2.W5 == 0.0f)) && photoViewer2.m6 == j3 && photoViewer2.m4 == 0)) {
                            org.telegram.ui.xo0 xo0Var = photoViewer2.W0[0];
                            if (xo0Var == null || !xo0Var.p || xo0Var.h == -1) {
                                qVar = qVar2;
                                z00Var3 = z00Var;
                            } else {
                                Point point = org.telegram.messenger.g0.q;
                                qVar = qVar2;
                                z00Var3 = z00Var;
                            }
                            if (photoViewer2.Z5 == 1.0f) {
                                float v = org.telegram.messenger.camera.q.v(3.0f, photoViewer2.Z5, (motionEvent7.getX() - (photoViewer2.g1(photoViewer2.t4) / 2)) - photoViewer2.W5, motionEvent7.getX() - (photoViewer2.g1(photoViewer2.t4) / 2));
                                float v10 = org.telegram.messenger.camera.q.v(3.0f, photoViewer2.Z5, (motionEvent7.getY() - (photoViewer2.e1() / 2)) - photoViewer2.X5, motionEvent7.getY() - (photoViewer2.e1() / 2));
                                photoViewer2.t3(3.0f);
                                float f18 = photoViewer2.D6;
                                if (v >= f18) {
                                    f18 = photoViewer2.E6;
                                }
                                v = f18;
                                float f19 = photoViewer2.F6;
                                if (v10 >= f19) {
                                    f19 = photoViewer2.G6;
                                }
                                v10 = f19;
                                z12 = true;
                                photoViewer2.c0(3.0f, v, v10, true);
                            } else {
                                z12 = true;
                                photoViewer2.c0(1.0f, 0.0f, 0.0f, true);
                            }
                            photoViewer2.N6 = z12;
                            photoViewer2.B1();
                            z11 = true;
                            this.h.getClass();
                            z9 = z11;
                            this.r = f13;
                            this.t = f13;
                            this.s = f14;
                            this.u = f14;
                            motionEvent2 = this.n;
                            if (motionEvent2 != null) {
                            }
                            this.n = MotionEvent.obtain(motionEvent);
                            this.l = true;
                            this.m = true;
                            this.i = true;
                            this.k = false;
                            if (this.v) {
                            }
                            qVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                            return z00Var3.onDown(motionEvent) | z9;
                        }
                        qVar = qVar2;
                        z00Var3 = z00Var;
                        z11 = false;
                        this.h.getClass();
                        z9 = z11;
                        this.r = f13;
                        this.t = f13;
                        this.s = f14;
                        this.u = f14;
                        motionEvent2 = this.n;
                        if (motionEvent2 != null) {
                        }
                        this.n = MotionEvent.obtain(motionEvent);
                        this.l = true;
                        this.m = true;
                        this.i = true;
                        this.k = false;
                        if (this.v) {
                        }
                        qVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                        return z00Var3.onDown(motionEvent) | z9;
                    }
                }
                z00Var3 = z00Var3;
            }
            qVar = qVar2;
            qVar.sendEmptyMessageDelayed(3, i20);
            z9 = false;
            this.r = f13;
            this.t = f13;
            this.s = f14;
            this.u = f14;
            motionEvent2 = this.n;
            if (motionEvent2 != null) {
            }
            this.n = MotionEvent.obtain(motionEvent);
            this.l = true;
            this.m = true;
            this.i = true;
            this.k = false;
            if (this.v) {
            }
            qVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
            return z00Var3.onDown(motionEvent) | z9;
        }
        qVar = qVar2;
        z9 = false;
        this.r = f13;
        this.t = f13;
        this.s = f14;
        this.u = f14;
        motionEvent2 = this.n;
        if (motionEvent2 != null) {
        }
        this.n = MotionEvent.obtain(motionEvent);
        this.l = true;
        this.m = true;
        this.i = true;
        this.k = false;
        if (this.v) {
        }
        qVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
        return z00Var3.onDown(motionEvent) | z9;
    }

    public final void b() {
        this.v = false;
    }

    public a10(Context context, z00 z00Var) {
        int scaledTouchSlop;
        int i7;
        int i10;
        this.f = new android.support.v4.media.session.q(this, 5);
        this.g = z00Var;
        if (z00Var instanceof y00) {
            this.h = (y00) z00Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.a = i7 * i7;
        this.b = scaledTouchSlop * scaledTouchSlop;
        this.c = i10 * i10;
    }
}
