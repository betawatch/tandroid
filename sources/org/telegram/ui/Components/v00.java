package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v00 {
    public static final int x;
    public static final int y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final android.support.v4.media.session.q f;
    public final u00 g;
    public t00 h;
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

    public v00(Context context, PhotoViewer photoViewer) {
        this(context, (u00) photoViewer);
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
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        long j10;
        u00 u00Var;
        long j11;
        boolean z11;
        u00 u00Var2;
        boolean z12;
        boolean z13;
        org.telegram.ui.tp0 tp0Var;
        org.telegram.messenger.zi ziVar;
        org.telegram.ui.tp0 tp0Var2;
        t00 t00Var;
        boolean z14;
        boolean onScroll;
        int i3;
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
        int i10 = action & org.telegram.messenger.hs.e4;
        boolean z16 = i10 == 6;
        int actionIndex = z16 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (actionIndex != i11) {
                f10 += motionEvent.getX(i11);
                f11 += motionEvent.getY(i11);
            }
        }
        float f12 = z16 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        u00 u00Var3 = this.g;
        android.support.v4.media.session.q qVar2 = this.f;
        if (i10 != 0) {
            if (i10 == 1) {
                boolean z17 = false;
                this.i = false;
                u00Var3.a1();
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (!this.q) {
                    if (this.k) {
                        qVar2.removeMessages(3);
                        this.k = false;
                    } else if (this.l) {
                        boolean onSingleTapUp = u00Var3.onSingleTapUp(motionEvent);
                        if (this.j && (t00Var = this.h) != null) {
                            ((PhotoViewer) t00Var).d2(motionEvent);
                        }
                        z17 = onSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.w;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.e);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.d || Math.abs(xVelocity) > this.d) {
                            z17 = u00Var3.onFling(this.n, motionEvent, xVelocity, yVelocity);
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
                    z14 = hasMessages;
                } else {
                    if (this.l) {
                        int i15 = (int) (f13 - this.t);
                        int i16 = (int) (f14 - this.u);
                        int i17 = (i16 * i16) + (i15 * i15);
                        boolean z18 = i13 >= 29 && classification == 1;
                        int i18 = this.a;
                        if (hasMessages && z18) {
                            if (i17 > i18) {
                                qVar2.removeMessages(2);
                                i3 = i17;
                                z14 = hasMessages;
                                qVar2.sendMessageDelayed(qVar2.obtainMessage(2, 0, 0), (long) (ViewConfiguration.getLongPressTimeout() * 2.0f));
                            } else {
                                i3 = i17;
                                z14 = hasMessages;
                            }
                            i18 = (int) (i18 * 4.0f);
                        } else {
                            i3 = i17;
                            z14 = hasMessages;
                        }
                        int i19 = i3;
                        if (i19 > i18) {
                            onScroll = u00Var3.onScroll(this.n, motionEvent, f15, f16);
                            this.r = f13;
                            this.s = f14;
                            z15 = false;
                            this.l = false;
                            qVar2.removeMessages(3);
                            qVar2.removeMessages(1);
                            qVar2.removeMessages(2);
                        } else {
                            z15 = false;
                            onScroll = false;
                        }
                        if (i19 > this.b) {
                            this.m = z15;
                        }
                    } else {
                        z14 = hasMessages;
                        if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                            onScroll = u00Var3.onScroll(this.n, motionEvent, f15, f16);
                            this.r = f13;
                            this.s = f14;
                        } else {
                            onScroll = false;
                        }
                    }
                    i14 = 29;
                }
                if (i13 >= i14 && classification == 2 && z14) {
                    qVar2.removeMessages(2);
                    qVar2.sendMessage(qVar2.obtainMessage(2, 0, 0));
                }
                return onScroll;
            }
            return false;
        }
        this.j = false;
        t00 t00Var2 = this.h;
        if (t00Var2 != null) {
            PhotoViewer photoViewer = (PhotoViewer) t00Var2;
            if (photoViewer.O0.getVisibility() != 0) {
                boolean[] zArr = photoViewer.x1;
                if (!zArr[0] && !zArr[1]) {
                    float x10 = motionEvent.getX();
                    if ((x10 < Math.min(org.telegram.messenger.hs.R1, photoViewer.f0.getMeasuredWidth() / 8) || x10 > photoViewer.f0.getMeasuredWidth() - r4) && (ziVar = photoViewer.U4) != null && ((!org.telegram.messenger.zi.M4(ziVar.k) && ((tp0Var2 = photoViewer.g0) == null || !tp0Var2.y)) || SystemClock.elapsedRealtime() - photoViewer.v1 < 500 || !photoViewer.r0(motionEvent))) {
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
                    int y9 = ((int) motionEvent6.getY()) - ((int) motionEvent.getY());
                    if ((y9 * y9) + (x11 * x11) < this.c) {
                        this.q = true;
                        t00 t00Var3 = this.h;
                        MotionEvent motionEvent7 = this.n;
                        PhotoViewer photoViewer2 = (PhotoViewer) t00Var3;
                        if ((photoViewer2.G2 != null || ((tp0Var = photoViewer2.g0) != null && tp0Var.y)) && photoViewer2.m3) {
                            long q12 = photoViewer2.q1();
                            j10 = 0;
                            long C1 = photoViewer2.C1();
                            float x12 = motionEvent7.getX();
                            int m1 = photoViewer2.m1(photoViewer2.v4) / 3;
                            float f17 = m1 * 2;
                            if (photoViewer2.r0(motionEvent7)) {
                                long j12 = x12 >= f17 ? q12 + 10000 : x12 < ((float) m1) ? q12 - 10000 : q12;
                                if (q12 != j12) {
                                    if (j12 > C1) {
                                        j11 = C1;
                                    } else {
                                        if (j12 < 0) {
                                            z11 = j12 >= -9000;
                                            j11 = 0;
                                            if (z11) {
                                                u00Var2 = u00Var3;
                                            } else {
                                                photoViewer2.A1.e(true);
                                                photoViewer2.A1.d(x12 < ((float) m1));
                                                d51 d51Var = photoViewer2.A1;
                                                u00Var2 = u00Var3;
                                                long j13 = d51Var.o + 10000;
                                                d51Var.o = j13;
                                                d51Var.p = org.telegram.messenger.bd.G((int) (j13 / 1000), "Seconds", new Object[0]);
                                                photoViewer2.w2(j11);
                                                photoViewer2.f0.invalidate();
                                                photoViewer2.r3.h(true, j11 / C1);
                                                photoViewer2.s3.invalidate();
                                            }
                                            qVar = qVar2;
                                            u00Var3 = u00Var2;
                                            z12 = true;
                                            this.h.getClass();
                                            z10 = z12;
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
                                            return u00Var3.onDown(motionEvent) | z10;
                                        }
                                        j11 = j12;
                                    }
                                    z11 = true;
                                    if (z11) {
                                    }
                                    qVar = qVar2;
                                    u00Var3 = u00Var2;
                                    z12 = true;
                                    this.h.getClass();
                                    z10 = z12;
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
                                    return u00Var3.onDown(motionEvent) | z10;
                                }
                            }
                            u00Var = u00Var3;
                        } else {
                            u00Var = u00Var3;
                            j10 = 0;
                        }
                        if (photoViewer2.J6 && ((photoViewer2.b6 != 1.0f || (photoViewer2.Z5 == 0.0f && photoViewer2.Y5 == 0.0f)) && photoViewer2.o6 == j10 && photoViewer2.o4 == 0)) {
                            org.telegram.ui.mo0 mo0Var = photoViewer2.X0[0];
                            if (mo0Var == null || !mo0Var.p || mo0Var.h == -1) {
                                qVar = qVar2;
                                u00Var3 = u00Var;
                            } else {
                                Point point = org.telegram.messenger.g0.q;
                                qVar = qVar2;
                                u00Var3 = u00Var;
                            }
                            if (photoViewer2.b6 == 1.0f) {
                                float v = org.telegram.messenger.camera.q.v(3.0f, photoViewer2.b6, (motionEvent7.getX() - (photoViewer2.m1(photoViewer2.v4) / 2)) - photoViewer2.Y5, motionEvent7.getX() - (photoViewer2.m1(photoViewer2.v4) / 2));
                                float v10 = org.telegram.messenger.camera.q.v(3.0f, photoViewer2.b6, (motionEvent7.getY() - (photoViewer2.k1() / 2)) - photoViewer2.Z5, motionEvent7.getY() - (photoViewer2.k1() / 2));
                                photoViewer2.z3(3.0f);
                                float f18 = photoViewer2.F6;
                                if (v >= f18) {
                                    f18 = photoViewer2.G6;
                                }
                                v = f18;
                                float f19 = photoViewer2.H6;
                                if (v10 >= f19) {
                                    f19 = photoViewer2.I6;
                                }
                                v10 = f19;
                                z13 = true;
                                photoViewer2.k0(3.0f, v, v10, true);
                            } else {
                                z13 = true;
                                photoViewer2.k0(1.0f, 0.0f, 0.0f, true);
                            }
                            photoViewer2.P6 = z13;
                            photoViewer2.G1();
                            z12 = true;
                            this.h.getClass();
                            z10 = z12;
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
                            return u00Var3.onDown(motionEvent) | z10;
                        }
                        qVar = qVar2;
                        u00Var3 = u00Var;
                        z12 = false;
                        this.h.getClass();
                        z10 = z12;
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
                        return u00Var3.onDown(motionEvent) | z10;
                    }
                }
                u00Var3 = u00Var3;
            }
            qVar = qVar2;
            qVar.sendEmptyMessageDelayed(3, i20);
            z10 = false;
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
            return u00Var3.onDown(motionEvent) | z10;
        }
        qVar = qVar2;
        z10 = false;
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
        return u00Var3.onDown(motionEvent) | z10;
    }

    public final void b() {
        this.v = false;
    }

    public v00(Context context, u00 u00Var) {
        int scaledTouchSlop;
        int i3;
        int i10;
        this.f = new android.support.v4.media.session.q(this, 6);
        this.g = u00Var;
        if (u00Var instanceof t00) {
            this.h = (t00) u00Var;
        }
        this.v = true;
        if (context == null) {
            i3 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i3;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = viewConfiguration.getScaledMaximumFlingVelocity();
            i3 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.a = i3 * i3;
        this.b = scaledTouchSlop * scaledTouchSlop;
        this.c = i10 * i10;
    }
}
