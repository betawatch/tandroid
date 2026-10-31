package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p10 {
    public static final int x;
    public static final int y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final android.support.v4.media.session.q f;
    public final o10 g;
    public n10 h;
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

    public p10(Context context, PhotoViewer photoViewer) {
        this(context, (o10) photoViewer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0431, code lost:
    
        if (java.lang.Math.sqrt(java.lang.Math.pow(((r1.y + org.telegram.messenger.i0.m) / 2.0f) - r4.getY(), 2.0d) + java.lang.Math.pow((r1.x / 2.0f) - r4.getX(), 2.0d)) < org.telegram.messenger.i0.L(40.0f)) goto L234;
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
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        long j10;
        o10 o10Var;
        long j11;
        boolean z11;
        o10 o10Var2;
        boolean z12;
        boolean z13;
        org.telegram.ui.mr0 mr0Var;
        org.telegram.messenger.jj jjVar;
        org.telegram.ui.mr0 mr0Var2;
        n10 n10Var;
        boolean z14;
        boolean onScroll;
        int i10;
        boolean z15;
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
        int i11 = action & org.telegram.messenger.zs.e4;
        boolean z16 = i11 == 6;
        int actionIndex = z16 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f7 += motionEvent.getX(i12);
                f10 += motionEvent.getY(i12);
            }
        }
        float f11 = z16 ? pointerCount - 1 : pointerCount;
        float f12 = f7 / f11;
        float f13 = f10 / f11;
        o10 o10Var3 = this.g;
        android.support.v4.media.session.q qVar2 = this.f;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z17 = false;
                this.i = false;
                o10Var3.e1();
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (!this.q) {
                    if (this.k) {
                        qVar2.removeMessages(3);
                        this.k = false;
                    } else if (this.l) {
                        boolean onSingleTapUp = o10Var3.onSingleTapUp(motionEvent);
                        if (this.j && (n10Var = this.h) != null) {
                            ((PhotoViewer) n10Var).d2(motionEvent);
                        }
                        z17 = onSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.w;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.e);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.d || Math.abs(xVelocity) > this.d) {
                            z17 = o10Var3.onFling(this.n, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    z17 = false;
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
                return z17;
            }
            if (i11 != 2) {
                if (i11 == 3) {
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
                if (i11 == 5) {
                    this.r = f12;
                    this.t = f12;
                    this.s = f13;
                    this.u = f13;
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
                if (i11 == 6) {
                    this.r = f12;
                    this.t = f12;
                    this.s = f13;
                    this.u = f13;
                    this.w.computeCurrentVelocity(1000, this.e);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.w.getXVelocity(pointerId2);
                    float yVelocity2 = this.w.getYVelocity(pointerId2);
                    for (int i13 = 0; i13 < pointerCount; i13++) {
                        if (i13 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i13);
                            if ((this.w.getYVelocity(pointerId3) * yVelocity2) + (this.w.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                                this.w.clear();
                                return false;
                            }
                        }
                    }
                }
            } else if (!this.k) {
                int i14 = Build.VERSION.SDK_INT;
                int i15 = 29;
                int classification = i14 >= 29 ? motionEvent.getClassification() : 0;
                boolean hasMessages = qVar2.hasMessages(2);
                float f14 = this.r - f12;
                float f15 = this.s - f13;
                if (this.q) {
                    onScroll = false;
                    z14 = hasMessages;
                } else {
                    if (this.l) {
                        int i16 = (int) (f12 - this.t);
                        int i17 = (int) (f13 - this.u);
                        int i18 = (i17 * i17) + (i16 * i16);
                        boolean z18 = i14 >= 29 && classification == 1;
                        int i19 = this.a;
                        if (hasMessages && z18) {
                            if (i18 > i19) {
                                qVar2.removeMessages(2);
                                i10 = i18;
                                z14 = hasMessages;
                                qVar2.sendMessageDelayed(qVar2.obtainMessage(2, 0, 0), (long) (ViewConfiguration.getLongPressTimeout() * 2.0f));
                            } else {
                                i10 = i18;
                                z14 = hasMessages;
                            }
                            i19 = (int) (i19 * 4.0f);
                        } else {
                            i10 = i18;
                            z14 = hasMessages;
                        }
                        int i20 = i10;
                        if (i20 > i19) {
                            onScroll = o10Var3.onScroll(this.n, motionEvent, f14, f15);
                            this.r = f12;
                            this.s = f13;
                            z15 = false;
                            this.l = false;
                            qVar2.removeMessages(3);
                            qVar2.removeMessages(1);
                            qVar2.removeMessages(2);
                        } else {
                            z15 = false;
                            onScroll = false;
                        }
                        if (i20 > this.b) {
                            this.m = z15;
                        }
                    } else {
                        z14 = hasMessages;
                        if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                            onScroll = o10Var3.onScroll(this.n, motionEvent, f14, f15);
                            this.r = f12;
                            this.s = f13;
                        } else {
                            onScroll = false;
                        }
                    }
                    i15 = 29;
                }
                if (i14 >= i15 && classification == 2 && z14) {
                    qVar2.removeMessages(2);
                    qVar2.sendMessage(qVar2.obtainMessage(2, 0, 0));
                }
                return onScroll;
            }
            return false;
        }
        this.j = false;
        n10 n10Var2 = this.h;
        if (n10Var2 != null) {
            PhotoViewer photoViewer = (PhotoViewer) n10Var2;
            if (photoViewer.N0.getVisibility() != 0) {
                boolean[] zArr = photoViewer.w1;
                if (!zArr[0] && !zArr[1]) {
                    float x10 = motionEvent.getX();
                    if ((x10 < Math.min(org.telegram.messenger.zs.R1, photoViewer.e0.getMeasuredWidth() / 8) || x10 > photoViewer.e0.getMeasuredWidth() - r4) && (jjVar = photoViewer.T4) != null && ((!org.telegram.messenger.jj.L4(jjVar.k) && ((mr0Var2 = photoViewer.f0) == null || !mr0Var2.y)) || SystemClock.elapsedRealtime() - photoViewer.u1 < 500 || !photoViewer.r0(motionEvent))) {
                        this.j = true;
                    }
                }
            }
            boolean hasMessages2 = qVar2.hasMessages(3);
            if (hasMessages2) {
                qVar2.removeMessages(3);
            }
            MotionEvent motionEvent6 = this.n;
            int i21 = y;
            if (motionEvent6 != null && (motionEvent3 = this.p) != null && hasMessages2 && this.m) {
                long eventTime = motionEvent.getEventTime() - motionEvent3.getEventTime();
                if (eventTime <= i21 && eventTime >= 40) {
                    int x11 = ((int) motionEvent6.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent6.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x11 * x11) < this.c) {
                        this.q = true;
                        n10 n10Var3 = this.h;
                        MotionEvent motionEvent7 = this.n;
                        PhotoViewer photoViewer2 = (PhotoViewer) n10Var3;
                        if ((photoViewer2.F2 != null || ((mr0Var = photoViewer2.f0) != null && mr0Var.y)) && photoViewer2.l3) {
                            long q12 = photoViewer2.q1();
                            j10 = 0;
                            long C1 = photoViewer2.C1();
                            float x12 = motionEvent7.getX();
                            int m12 = photoViewer2.m1(photoViewer2.u4) / 3;
                            float f16 = m12 * 2;
                            if (photoViewer2.r0(motionEvent7)) {
                                long j12 = x12 >= f16 ? q12 + 10000 : x12 < ((float) m12) ? q12 - 10000 : q12;
                                if (q12 != j12) {
                                    if (j12 > C1) {
                                        j11 = C1;
                                    } else {
                                        if (j12 < 0) {
                                            z11 = j12 >= -9000;
                                            j11 = 0;
                                            if (z11) {
                                                o10Var2 = o10Var3;
                                            } else {
                                                photoViewer2.z1.e(true);
                                                photoViewer2.z1.d(x12 < ((float) m12));
                                                m61 m61Var = photoViewer2.z1;
                                                o10Var2 = o10Var3;
                                                long j13 = m61Var.o + 10000;
                                                m61Var.o = j13;
                                                m61Var.p = org.telegram.messenger.cd.G((int) (j13 / 1000), "Seconds", new Object[0]);
                                                photoViewer2.w2(j11);
                                                photoViewer2.e0.invalidate();
                                                photoViewer2.q3.h(true, j11 / C1);
                                                photoViewer2.r3.invalidate();
                                            }
                                            qVar = qVar2;
                                            o10Var3 = o10Var2;
                                            z12 = true;
                                            this.h.getClass();
                                            z10 = z12;
                                            this.r = f12;
                                            this.t = f12;
                                            this.s = f13;
                                            this.u = f13;
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
                                            return o10Var3.onDown(motionEvent) | z10;
                                        }
                                        j11 = j12;
                                    }
                                    z11 = true;
                                    if (z11) {
                                    }
                                    qVar = qVar2;
                                    o10Var3 = o10Var2;
                                    z12 = true;
                                    this.h.getClass();
                                    z10 = z12;
                                    this.r = f12;
                                    this.t = f12;
                                    this.s = f13;
                                    this.u = f13;
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
                                    return o10Var3.onDown(motionEvent) | z10;
                                }
                            }
                            o10Var = o10Var3;
                        } else {
                            o10Var = o10Var3;
                            j10 = 0;
                        }
                        if (photoViewer2.I6 && ((photoViewer2.a6 != 1.0f || (photoViewer2.Y5 == 0.0f && photoViewer2.X5 == 0.0f)) && photoViewer2.n6 == j10 && photoViewer2.n4 == 0)) {
                            org.telegram.ui.fq0 fq0Var = photoViewer2.W0[0];
                            if (fq0Var == null || !fq0Var.p || fq0Var.h == -1) {
                                qVar = qVar2;
                                o10Var3 = o10Var;
                            } else {
                                Point point = org.telegram.messenger.i0.q;
                                qVar = qVar2;
                                o10Var3 = o10Var;
                            }
                            if (photoViewer2.a6 == 1.0f) {
                                float v = org.telegram.messenger.z20.v(3.0f, photoViewer2.a6, (motionEvent7.getX() - (photoViewer2.m1(photoViewer2.u4) / 2)) - photoViewer2.X5, motionEvent7.getX() - (photoViewer2.m1(photoViewer2.u4) / 2));
                                float v10 = org.telegram.messenger.z20.v(3.0f, photoViewer2.a6, (motionEvent7.getY() - (photoViewer2.k1() / 2)) - photoViewer2.Y5, motionEvent7.getY() - (photoViewer2.k1() / 2));
                                photoViewer2.z3(3.0f);
                                float f17 = photoViewer2.E6;
                                if (v >= f17) {
                                    f17 = photoViewer2.F6;
                                }
                                v = f17;
                                float f18 = photoViewer2.G6;
                                if (v10 >= f18) {
                                    f18 = photoViewer2.H6;
                                }
                                v10 = f18;
                                z13 = true;
                                photoViewer2.k0(3.0f, v, v10, true);
                            } else {
                                z13 = true;
                                photoViewer2.k0(1.0f, 0.0f, 0.0f, true);
                            }
                            photoViewer2.O6 = z13;
                            photoViewer2.G1();
                            z12 = true;
                            this.h.getClass();
                            z10 = z12;
                            this.r = f12;
                            this.t = f12;
                            this.s = f13;
                            this.u = f13;
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
                            return o10Var3.onDown(motionEvent) | z10;
                        }
                        qVar = qVar2;
                        o10Var3 = o10Var;
                        z12 = false;
                        this.h.getClass();
                        z10 = z12;
                        this.r = f12;
                        this.t = f12;
                        this.s = f13;
                        this.u = f13;
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
                        return o10Var3.onDown(motionEvent) | z10;
                    }
                }
                o10Var3 = o10Var3;
            }
            qVar = qVar2;
            qVar.sendEmptyMessageDelayed(3, i21);
            z10 = false;
            this.r = f12;
            this.t = f12;
            this.s = f13;
            this.u = f13;
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
            return o10Var3.onDown(motionEvent) | z10;
        }
        qVar = qVar2;
        z10 = false;
        this.r = f12;
        this.t = f12;
        this.s = f13;
        this.u = f13;
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
        return o10Var3.onDown(motionEvent) | z10;
    }

    public final void b() {
        this.v = false;
    }

    public p10(Context context, o10 o10Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f = new android.support.v4.media.session.q(this, 10);
        this.g = o10Var;
        if (o10Var instanceof n10) {
            this.h = (n10) o10Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.a = i10 * i10;
        this.b = scaledTouchSlop * scaledTouchSlop;
        this.c = i11 * i11;
    }
}
