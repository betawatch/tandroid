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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x10 {
    public static final int x;
    public static final int y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f;
    public final w10 g;
    public v10 h;
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

    public x10(Context context, PhotoViewer photoViewer) {
        this(context, (w10) photoViewer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0436, code lost:
    
        if (java.lang.Math.sqrt(java.lang.Math.pow(((org.telegram.messenger.AndroidUtilities.displaySize.y + org.telegram.messenger.AndroidUtilities.statusBarHeight) / 2.0f) - r4.getY(), 2.0d) + java.lang.Math.pow((org.telegram.messenger.AndroidUtilities.displaySize.x / 2.0f) - r4.getX(), 2.0d)) < org.telegram.messenger.AndroidUtilities.dp(40.0f)) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x04a5, code lost:
    
        if (r2 > r4) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0495, code lost:
    
        if (r1 > r4) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        w10 w10Var;
        androidx.mediarouter.app.c cVar;
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ht0 ht0Var;
        MessageObject messageObject;
        org.telegram.ui.ht0 ht0Var2;
        v10 v10Var;
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
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f10 += motionEvent.getX(i12);
                f11 += motionEvent.getY(i12);
            }
        }
        float f12 = z16 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        w10 w10Var2 = this.g;
        androidx.mediarouter.app.c cVar2 = this.f;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z17 = false;
                this.i = false;
                w10Var2.b1();
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (!this.q) {
                    if (this.k) {
                        cVar2.removeMessages(3);
                        this.k = false;
                    } else if (this.l) {
                        boolean onSingleTapUp = w10Var2.onSingleTapUp(motionEvent);
                        if (this.j && (v10Var = this.h) != null) {
                            ((PhotoViewer) v10Var).Z1(motionEvent);
                        }
                        z17 = onSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.w;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.e);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.d || Math.abs(xVelocity) > this.d) {
                            z17 = w10Var2.onFling(this.n, motionEvent, xVelocity, yVelocity);
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
                    this.r = f13;
                    this.t = f13;
                    this.s = f14;
                    this.u = f14;
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
                if (i11 != 6) {
                    return false;
                }
                this.r = f13;
                this.t = f13;
                this.s = f14;
                this.u = f14;
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
                return false;
            }
            if (this.k) {
                return false;
            }
            int i14 = Build.VERSION.SDK_INT;
            int i15 = 29;
            int classification = i14 >= 29 ? motionEvent.getClassification() : 0;
            boolean hasMessages = cVar2.hasMessages(2);
            float f15 = this.r - f13;
            float f16 = this.s - f14;
            if (this.q) {
                z14 = hasMessages;
                onScroll = false;
            } else {
                if (this.l) {
                    int i16 = (int) (f13 - this.t);
                    int i17 = (int) (f14 - this.u);
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
                        onScroll = w10Var2.onScroll(this.n, motionEvent, f15, f16);
                        this.r = f13;
                        this.s = f14;
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
                    if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                        onScroll = w10Var2.onScroll(this.n, motionEvent, f15, f16);
                        this.r = f13;
                        this.s = f14;
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
        this.j = false;
        v10 v10Var2 = this.h;
        if (v10Var2 != null) {
            PhotoViewer photoViewer = (PhotoViewer) v10Var2;
            if (photoViewer.J0.getVisibility() != 0) {
                boolean[] zArr = photoViewer.s1;
                if (!zArr[0] && !zArr[1]) {
                    float x8 = motionEvent.getX();
                    if ((x8 < Math.min(135, photoViewer.a0.getMeasuredWidth() / 8) || x8 > photoViewer.a0.getMeasuredWidth() - r4) && (messageObject = photoViewer.P4) != null && ((!messageObject.isVideo() && ((ht0Var2 = photoViewer.b0) == null || !ht0Var2.x)) || SystemClock.elapsedRealtime() - photoViewer.q1 < 500 || !photoViewer.q0(motionEvent))) {
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
                w10Var = w10Var2;
            } else {
                long eventTime = motionEvent.getEventTime() - motionEvent3.getEventTime();
                if (eventTime <= i21 && eventTime >= 40) {
                    int x10 = ((int) motionEvent6.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent6.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x10 * x10) < this.c) {
                        this.q = true;
                        v10 v10Var3 = this.h;
                        MotionEvent motionEvent7 = this.n;
                        PhotoViewer photoViewer2 = (PhotoViewer) v10Var3;
                        if ((photoViewer2.B2 != null || ((ht0Var = photoViewer2.b0) != null && ht0Var.x)) && photoViewer2.h3) {
                            long o12 = photoViewer2.o1();
                            j10 = 0;
                            long A1 = photoViewer2.A1();
                            float x11 = motionEvent7.getX();
                            int k12 = photoViewer2.k1(photoViewer2.q4) / 3;
                            float f17 = k12 * 2;
                            if (photoViewer2.q0(motionEvent7)) {
                                long j12 = x11 >= f17 ? o12 + 10000 : x11 < ((float) k12) ? o12 - 10000 : o12;
                                if (o12 != j12) {
                                    if (j12 > A1) {
                                        j11 = A1;
                                    } else {
                                        if (j12 < 0) {
                                            z11 = j12 >= -9000;
                                            j11 = 0;
                                            if (z11) {
                                                w10Var = w10Var2;
                                            } else {
                                                photoViewer2.v1.e(true);
                                                photoViewer2.v1.d(x11 < ((float) k12));
                                                c61 c61Var = photoViewer2.v1;
                                                w10Var = w10Var2;
                                                long j13 = c61Var.o + 10000;
                                                c61Var.o = j13;
                                                c61Var.p = LocaleController.formatPluralString("Seconds", (int) (j13 / 1000), new Object[0]);
                                                photoViewer2.t2(j11);
                                                photoViewer2.a0.invalidate();
                                                photoViewer2.m3.h(j11 / A1, true);
                                                photoViewer2.n3.invalidate();
                                            }
                                            cVar = cVar2;
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
                                                cVar.removeMessages(2);
                                                cVar.sendMessageDelayed(cVar.obtainMessage(2, 0, 0), ViewConfiguration.getLongPressTimeout());
                                            }
                                            cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                                            return w10Var.onDown(motionEvent) | z10;
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
                                    cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                                    return w10Var.onDown(motionEvent) | z10;
                                }
                            }
                            w10Var = w10Var2;
                        } else {
                            w10Var = w10Var2;
                            j10 = 0;
                        }
                        if (photoViewer2.E6 && ((photoViewer2.W5 != 1.0f || (photoViewer2.U5 == 0.0f && photoViewer2.T5 == 0.0f)) && photoViewer2.j6 == j10 && photoViewer2.j4 == 0)) {
                            org.telegram.ui.yt0 yt0Var = photoViewer2.S0[0];
                            if (yt0Var == null || !yt0Var.p || yt0Var.h == -1) {
                                cVar = cVar2;
                            } else {
                                cVar = cVar2;
                            }
                            if (photoViewer2.W5 == 1.0f) {
                                float c10 = org.telegram.messenger.rl.c(3.0f, photoViewer2.W5, (motionEvent7.getX() - (photoViewer2.k1(photoViewer2.q4) / 2)) - photoViewer2.T5, motionEvent7.getX() - (photoViewer2.k1(photoViewer2.q4) / 2));
                                float c11 = org.telegram.messenger.rl.c(3.0f, photoViewer2.W5, (motionEvent7.getY() - (photoViewer2.i1() / 2)) - photoViewer2.U5, motionEvent7.getY() - (photoViewer2.i1() / 2));
                                photoViewer2.w3(3.0f);
                                float f18 = photoViewer2.A6;
                                if (c10 >= f18) {
                                    f18 = photoViewer2.B6;
                                }
                                c10 = f18;
                                float f19 = photoViewer2.C6;
                                if (c11 >= f19) {
                                    f19 = photoViewer2.D6;
                                }
                                c11 = f19;
                                z13 = true;
                                photoViewer2.j0(3.0f, c10, c11, true);
                            } else {
                                z13 = true;
                                photoViewer2.j0(1.0f, 0.0f, 0.0f, true);
                            }
                            photoViewer2.K6 = z13;
                            photoViewer2.D1();
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
                            cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                            return w10Var.onDown(motionEvent) | z10;
                        }
                        cVar = cVar2;
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
                        cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
                        return w10Var.onDown(motionEvent) | z10;
                    }
                }
                w10Var = w10Var2;
            }
            cVar = cVar2;
            cVar.sendEmptyMessageDelayed(3, i21);
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
            cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
            return w10Var.onDown(motionEvent) | z10;
        }
        w10Var = w10Var2;
        cVar = cVar2;
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
        cVar.sendEmptyMessageAtTime(1, this.n.getDownTime() + x);
        return w10Var.onDown(motionEvent) | z10;
    }

    public final void b() {
        this.v = false;
    }

    public x10(Context context, w10 w10Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f = new androidx.mediarouter.app.c(this, 6);
        this.g = w10Var;
        if (w10Var instanceof v10) {
            this.h = (v10) w10Var;
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
