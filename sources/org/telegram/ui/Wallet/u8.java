package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.gr;
import org.telegram.ui.eg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u8 extends FrameLayout {
    public final ImageView a;
    public final c4 b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int h;
    public float n;
    public float r;
    public boolean s;
    public ValueAnimator w;
    public o1.j x;

    public u8(Context context) {
        super(context);
        this.e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.mini_gram_72);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, w7.b6.c(-1.0f, -1));
        c4 c4Var = new c4(this, context, new l(this, 11));
        this.b = c4Var;
        addView(c4Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(float f7) {
        if (this.x == null) {
            o1.j jVar = new o1.j(new o1.i(this.e));
            this.x = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.m = kVar;
            this.x.f(0.001f);
            this.x.b(new q3(this, 1));
        }
        this.x.c(f7);
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
        this.w.setInterpolator(gr.h);
        this.w.addUpdateListener(new eg(this, IEEEremainder, 6));
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
        o1.j jVar = this.x;
        if (jVar != null) {
            jVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c4 c4Var = this.b;
        if (c4Var.n && c4Var.getVisibility() == 0) {
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
                    int i10 = this.h;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex < 0) {
                            b();
                            return true;
                        }
                        float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.i0.p;
                        this.c = c3.i0.z(motionEvent.getX(findPointerIndex), this.n, radians, this.c);
                        this.d = c3.i0.z(motionEvent.getY(findPointerIndex), this.r, radians, this.d);
                        this.n = motionEvent.getX(findPointerIndex);
                        this.r = motionEvent.getY(findPointerIndex);
                        return true;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        if (this.h != -1) {
                        }
                    } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.h) {
                        int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                        this.h = motionEvent.getPointerId(i11);
                        this.n = motionEvent.getX(i11);
                        this.r = motionEvent.getY(i11);
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
