// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class itc extends FrameLayout {
    public final ImageView a;
    public final yoc b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int h;
    public float n;
    public float r;
    public boolean s;
    public ValueAnimator w;
    public vpa x;

    public itc(Context context) {
        super(context);
        this.e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.mini_gram_72);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, tre.c(-1.0f, -1));
        yoc yocVar = new yoc(this, context, new olc(this, (byte) 12));
        this.b = yocVar;
        addView(yocVar, tre.c(-1.0f, -1));
    }

    public final void a(float f) {
        if (this.x == null) {
            vpa vpaVar = new vpa(new xk4(this.e));
            this.x = vpaVar;
            wpa wpaVar = new wpa(f);
            wpaVar.a(0.55f);
            wpaVar.b(280.0f);
            vpaVar.m = wpaVar;
            this.x.f(0.001f);
            this.x.b(new i10(this, (byte) 20));
        }
        this.x.c(f);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f = (float) Math.IEEEremainder((this.f + this.c) - c(), 6.283185307179586d);
        float IEEEremainder = (float) Math.IEEEremainder(this.d, 6.283185307179586d);
        this.s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = ofFloat;
        ofFloat.setDuration(350L);
        this.w.setInterpolator(k43.h);
        this.w.addUpdateListener(new qm1(this, IEEEremainder, (byte) 9));
        this.w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.setPaused(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.b.setPaused(true);
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        vpa vpaVar = this.x;
        if (vpaVar != null) {
            vpaVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yoc yocVar = this.b;
        if (yocVar.n && yocVar.getVisibility() == 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (!this.s && this.e <= 1.001f) {
                    this.c = c();
                    this.d = 0.0f;
                }
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.w = null;
                }
                this.s = false;
                this.h = motionEvent.getPointerId(0);
                this.n = motionEvent.getX();
                this.r = motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                a(3.0f);
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.h;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex < 0) {
                            b();
                            return true;
                        }
                        float f = 0.013962634f / hl.p;
                        this.c = qd4.A(motionEvent.getX(findPointerIndex), this.n, f, this.c);
                        this.d = qd4.A(motionEvent.getY(findPointerIndex), this.r, f, this.d);
                        this.n = motionEvent.getX(findPointerIndex);
                        this.r = motionEvent.getY(findPointerIndex);
                        return true;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        if (this.h != -1) {
                        }
                    } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.h) {
                        int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                        this.h = motionEvent.getPointerId(i2);
                        this.n = motionEvent.getX(i2);
                        this.r = motionEvent.getY(i2);
                        return true;
                    }
                    return true;
                }
            }
            if (this.h != -1) {
                b();
            }
            return true;
        }
        return false;
    }
}
