package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.xq;
import org.telegram.ui.of;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o8 extends FrameLayout {
    public final ImageView a;
    public final a4 b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int h;
    public float n;
    public float r;
    public boolean s;
    public ValueAnimator w;
    public q1.g x;

    public o8(Context context) {
        super(context);
        this.e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.mini_gram_72);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, mf.c(-1.0f, -1));
        a4 a4Var = new a4(this, context, new l(this, 11));
        this.b = a4Var;
        addView(a4Var, mf.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.x == null) {
            q1.g gVar = new q1.g(new q1.f(this.e));
            this.x = gVar;
            q1.h hVar = new q1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.m = hVar;
            this.x.f(0.001f);
            this.x.b(new o3(this, 1));
        }
        this.x.c(f10);
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
        this.w.setInterpolator(xq.h);
        this.w.addUpdateListener(new of(this, IEEEremainder, 6));
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
        q1.g gVar = this.x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a4 a4Var = this.b;
        if (a4Var.n && a4Var.getVisibility() == 0) {
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
                    int i3 = this.h;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex < 0) {
                            b();
                            return true;
                        }
                        float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.p;
                        this.c = com.google.android.recaptcha.internal.a.y(motionEvent.getX(findPointerIndex), this.n, radians, this.c);
                        this.d = com.google.android.recaptcha.internal.a.y(motionEvent.getY(findPointerIndex), this.r, radians, this.d);
                        this.n = motionEvent.getX(findPointerIndex);
                        this.r = motionEvent.getY(findPointerIndex);
                        return true;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        if (this.h != -1) {
                        }
                    } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.h) {
                        int i10 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                        this.h = motionEvent.getPointerId(i10);
                        this.n = motionEvent.getX(i10);
                        this.r = motionEvent.getY(i10);
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
