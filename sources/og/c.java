package og;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class c {
    public final ScaleGestureDetector a;
    public o b;
    public float c;
    public float d;
    public final float f;
    public VelocityTracker g;
    public boolean h;
    public long k;
    public boolean l;
    public final float e = g0.L(1.0f);
    public int i = -1;
    public int j = 0;

    public c(Context context) {
        this.f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.a = new ScaleGestureDetector(context, new b(this, 0));
    }

    public final void a(MotionEvent motionEvent) {
        float x10;
        float y10;
        float x11;
        float y11;
        float x12;
        float y12;
        n nVar;
        this.a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & qs.e4;
        if (action == 0) {
            this.i = motionEvent.getPointerId(0);
            this.k = SystemClock.elapsedRealtime();
        } else if (action == 1 || action == 3) {
            if (!this.h && SystemClock.elapsedRealtime() - this.k < 800 && (nVar = this.b.M) != null) {
                nVar.c0();
            }
            this.i = -1;
        } else if (action == 6) {
            int action2 = (65280 & motionEvent.getAction()) >> 8;
            if (motionEvent.getPointerId(action2) == this.i) {
                int i7 = action2 == 0 ? 1 : 0;
                this.i = motionEvent.getPointerId(i7);
                this.c = motionEvent.getX(i7);
                this.d = motionEvent.getY(i7);
            }
        }
        int i10 = this.i;
        if (i10 == -1) {
            i10 = 0;
        }
        this.j = motionEvent.findPointerIndex(i10);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 == 1) {
                if (this.h) {
                    if (this.g != null) {
                        try {
                            x12 = motionEvent.getX(this.j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.c = x12;
                        try {
                            y12 = motionEvent.getY(this.j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.g.addMovement(motionEvent);
                        this.g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.g.getXVelocity()), Math.abs(this.g.getYVelocity())) >= this.f) {
                            this.b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker = this.g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.g = null;
                }
                this.l = false;
                return;
            }
            if (action3 != 2) {
                if (action3 != 3) {
                    return;
                }
                VelocityTracker velocityTracker2 = this.g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.g = null;
                }
                this.l = false;
                this.h = false;
                return;
            }
        }
        if (!this.l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.c = x11;
            try {
                y11 = motionEvent.getY(this.j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.c;
        float f11 = y10 - this.d;
        if (!this.h) {
            this.h = ((float) Math.sqrt((double) ((f11 * f11) + (f10 * f10)))) >= this.e;
        }
        if (this.h) {
            o oVar = this.b;
            if (!oVar.F) {
                m.f(oVar.L, f10, f11);
                oVar.r(false);
            }
            this.c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
