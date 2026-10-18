package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;
import org.telegram.ui.fg;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class i8 extends FrameLayout {
    public final ImageView a;
    public final l3 b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int h;
    public float n;
    public float r;
    public boolean s;
    public ValueAnimator v;
    public o1.k w;

    public i8(Context context) {
        super(context);
        this.e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.mini_gram_72);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, w7.z5.c(-1.0f, -1));
        l3 l3Var = new l3(this, context, new n(this, 10));
        this.b = l3Var;
        addView(l3Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(float f7) {
        if (this.w == null) {
            o1.k kVar = new o1.k(new o1.j(this.e));
            this.w = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.u = lVar;
            this.w.e(0.001f);
            this.w.b(new a3(this, 1));
        }
        this.w.g(f7);
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
        this.v = ofFloat;
        ofFloat.setDuration(350L);
        this.v.setInterpolator(bs.h);
        this.v.addUpdateListener(new fg(this, IEEEremainder, 6));
        this.v.start();
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
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o1.k kVar = this.w;
        if (kVar != null) {
            kVar.c();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l3 l3Var = this.b;
        if (l3Var.n && l3Var.getVisibility() == 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (!this.s && this.e <= 1.001f) {
                    this.c = c();
                    this.d = 0.0f;
                }
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.v = null;
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
                        float radians = ((float) Math.toRadians(0.800000011920929d)) / AndroidUtilities.density;
                        this.c = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getX(findPointerIndex), this.n, radians, this.c);
                        this.d = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getY(findPointerIndex), this.r, radians, this.d);
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
