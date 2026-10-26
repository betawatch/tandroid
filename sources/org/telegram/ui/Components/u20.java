package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u20 {
    public static final int x;
    public static final int y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f;
    public final t20 g;
    public s20 h;
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

    public u20(Context context, PhotoViewer photoViewer) {
        this(context, (t20) photoViewer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x042f, code lost:
    
        if (java.lang.Math.sqrt(java.lang.Math.pow(((org.telegram.messenger.AndroidUtilities.displaySize.y + org.telegram.messenger.AndroidUtilities.statusBarHeight) / 2.0f) - r4.getY(), 2.0d) + java.lang.Math.pow((org.telegram.messenger.AndroidUtilities.displaySize.x / 2.0f) - r4.getX(), 2.0d)) < org.telegram.messenger.AndroidUtilities.dp(40.0f)) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x049e, code lost:
    
        if (r2 > r4) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x048e, code lost:
    
        if (r1 > r4) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        t20 t20Var;
        androidx.mediarouter.app.c cVar;
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.vt0 vt0Var;
        MessageObject messageObject;
        org.telegram.ui.vt0 vt0Var2;
        s20 s20Var;
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
        int i11 = action & 255;
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
        t20 t20Var2 = this.g;
        androidx.mediarouter.app.c cVar2 = this.f;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z17 = false;
                this.i = false;
                t20Var2.a1();
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (!this.q) {
                    if (this.k) {
                        cVar2.removeMessages(3);
                        this.k = false;
                    } else if (this.l) {
                        boolean onSingleTapUp = t20Var2.onSingleTapUp(motionEvent);
                        if (this.j && (s20Var = this.h) != null) {
                            ((PhotoViewer) s20Var).c2(motionEvent);
                        }
                        z17 = onSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.w;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.e);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.d || Math.abs(xVelocity) > this.d) {
                            z17 = t20Var2.onFling(this.n, motionEvent, xVelocity, yVelocity);
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
                cVar2.removeMessages(1);
                cVar2.removeMessages(2);
                return z17;
            }
            if (i11 != 2) {
                if (i11 == 3) {
                    cVar2.removeMessages(1);
                    cVar2.removeMessages(2);
                    cVar2.removeMessages(3);
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
                    cVar2.removeMessages(1);
                    cVar2.removeMessages(2);
                    cVar2.removeMessages(3);
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
                    this.w.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.e);
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
                boolean hasMessages = cVar2.hasMessages(2);
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
                                cVar2.removeMessages(2);
                                i10 = i18;
                                z14 = hasMessages;
                                cVar2.sendMessageDelayed(cVar2.obtainMessage(2, 0, 0), (long) (ViewConfiguration.getLongPressTimeout() * 2.0f));
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
                            onScroll = t20Var2.onScroll(this.n, motionEvent, f14, f15);
                            this.r = f12;
                            this.s = f13;
                            z15 = false;
                            this.l = false;
                            cVar2.removeMessages(3);
                            cVar2.removeMessages(1);
                            cVar2.removeMessages(2);
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
                            onScroll = t20Var2.onScroll(this.n, motionEvent, f14, f15);
                            this.r = f12;
                            this.s = f13;
                        } else {
                            onScroll = false;
                        }
                    }
                    i15 = 29;
                }
                if (i14 >= i15 && classification == 2 && z14) {
                    cVar2.removeMessages(2);
                    cVar2.sendMessage(cVar2.obtainMessage(2, 0, 0));
                }
                return onScroll;
            }
            return false;
        }
        this.j = false;
        s20 s20Var2 = this.h;
        if (s20Var2 != null) {
            PhotoViewer photoViewer = (PhotoViewer) s20Var2;
            if (photoViewer.N0.getVisibility() != 0) {
                boolean[] zArr = photoViewer.w1;
                if (!zArr[0] && !zArr[1]) {
                    float x9 = motionEvent.getX();
                    if ((x9 < Math.min(135, photoViewer.e0.getMeasuredWidth() / 8) || x9 > photoViewer.e0.getMeasuredWidth() - r4) && (messageObject = photoViewer.T4) != null && ((!messageObject.isVideo() && ((vt0Var2 = photoViewer.f0) == null || !vt0Var2.x)) || SystemClock.elapsedRealtime() - photoViewer.u1 < 500 || !photoViewer.r0(motionEvent))) {
                        this.j = true;
                    }
                }
            }
            boolean hasMessages2 = cVar2.hasMessages(3);
            if (hasMessages2) {
                cVar2.removeMessages(3);
            }
            MotionEvent motionEvent6 = this.n;
            int i21 = y;
            if (motionEvent6 == null || (motionEvent3 = this.p) == null || !hasMessages2 || !this.m) {
                t20Var = t20Var2;
            } else {
                long eventTime = motionEvent.getEventTime() - motionEvent3.getEventTime();
                if (eventTime <= i21 && eventTime >= 40) {
                    int x10 = ((int) motionEvent6.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent6.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x10 * x10) < this.c) {
                        this.q = true;
                        s20 s20Var3 = this.h;
                        MotionEvent motionEvent7 = this.n;
                        PhotoViewer photoViewer2 = (PhotoViewer) s20Var3;
                        if ((photoViewer2.F2 != null || ((vt0Var = photoViewer2.f0) != null && vt0Var.x)) && photoViewer2.l3) {
                            long p12 = photoViewer2.p1();
                            j10 = 0;
                            long B1 = photoViewer2.B1();
                            float x11 = motionEvent7.getX();
                            int l1 = photoViewer2.l1(photoViewer2.u4) / 3;
                            float f16 = l1 * 2;
                            if (photoViewer2.r0(motionEvent7)) {
                                long j12 = x11 >= f16 ? p12 + 10000 : x11 < ((float) l1) ? p12 - 10000 : p12;
                                if (p12 != j12) {
                                    if (j12 > B1) {
                                        j11 = B1;
                                    } else {
                                        if (j12 < 0) {
                                            z11 = j12 >= -9000;
                                            j11 = 0;
                                            if (z11) {
                                                t20Var = t20Var2;
                                            } else {
                                                photoViewer2.z1.e(true);
                                                photoViewer2.z1.d(x11 < ((float) l1));
                                                j81 j81Var = photoViewer2.z1;
                                                t20Var = t20Var2;
                                                long j13 = j81Var.o + 10000;
                                                j81Var.o = j13;
                                                j81Var.p = LocaleController.formatPluralString("Seconds", (int) (j13 / 1000), new Object[0]);
                                                photoViewer2.v2(j11);
                                                photoViewer2.e0.invalidate();
                                                photoViewer2.q3.h(j11 / B1, true);
                                                photoViewer2.r3.invalidate();
                                            }
                                            cVar = cVar2;
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
                                                cVar.removeMessages(2);
                                                cVar.sendMessageDelayed(cVar.obtainMessage(2, 0, 0), ViewConfiguration.getLongPressTimeout());
                                            }
                                            cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                                            return t20Var.onDown(motionEvent) | z10;
                                        }
                                        j11 = j12;
                                    }
                                    z11 = true;
                                    if (z11) {
                                    }
                                    cVar = cVar2;
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
                                    cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                                    return t20Var.onDown(motionEvent) | z10;
                                }
                            }
                            t20Var = t20Var2;
                        } else {
                            t20Var = t20Var2;
                            j10 = 0;
                        }
                        if (photoViewer2.I6 && ((photoViewer2.a6 != 1.0f || (photoViewer2.Y5 == 0.0f && photoViewer2.X5 == 0.0f)) && photoViewer2.n6 == j10 && photoViewer2.n4 == 0)) {
                            org.telegram.ui.mu0 mu0Var = photoViewer2.W0[0];
                            if (mu0Var == null || !mu0Var.p || mu0Var.h == -1) {
                                cVar = cVar2;
                            } else {
                                cVar = cVar2;
                            }
                            if (photoViewer2.a6 == 1.0f) {
                                float w10 = org.telegram.messenger.vh.w(3.0f, photoViewer2.a6, (motionEvent7.getX() - (photoViewer2.l1(photoViewer2.u4) / 2)) - photoViewer2.X5, motionEvent7.getX() - (photoViewer2.l1(photoViewer2.u4) / 2));
                                float w11 = org.telegram.messenger.vh.w(3.0f, photoViewer2.a6, (motionEvent7.getY() - (photoViewer2.j1() / 2)) - photoViewer2.Y5, motionEvent7.getY() - (photoViewer2.j1() / 2));
                                photoViewer2.y3(3.0f);
                                float f17 = photoViewer2.E6;
                                if (w10 >= f17) {
                                    f17 = photoViewer2.F6;
                                }
                                w10 = f17;
                                float f18 = photoViewer2.G6;
                                if (w11 >= f18) {
                                    f18 = photoViewer2.H6;
                                }
                                w11 = f18;
                                z13 = true;
                                photoViewer2.k0(3.0f, w10, w11, true);
                            } else {
                                z13 = true;
                                photoViewer2.k0(1.0f, 0.0f, 0.0f, true);
                            }
                            photoViewer2.O6 = z13;
                            photoViewer2.F1();
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
                            cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                            return t20Var.onDown(motionEvent) | z10;
                        }
                        cVar = cVar2;
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
                        cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                        return t20Var.onDown(motionEvent) | z10;
                    }
                }
                t20Var = t20Var2;
            }
            cVar = cVar2;
            cVar.sendEmptyMessageDelayed(3, i21);
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
            cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
            return t20Var.onDown(motionEvent) | z10;
        }
        t20Var = t20Var2;
        cVar = cVar2;
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
        cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
        return t20Var.onDown(motionEvent) | z10;
    }

    public final void b() {
        this.v = false;
    }

    public u20(Context context, t20 t20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f = new androidx.mediarouter.app.c(this, 8);
        this.g = t20Var;
        if (t20Var instanceof s20) {
            this.h = (s20) t20Var;
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
