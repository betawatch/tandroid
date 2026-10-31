package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i81 extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public AnimatorSet D;
    public int E;
    public int F;
    public final j51 G;
    public final /* synthetic */ m81 H;
    public final ImageReceiver a;
    public boolean b;
    public final TextPaint c;
    public StaticLayout d;
    public StaticLayout e;
    public final Paint f;
    public final Paint h;
    public final Paint n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i81(m81 m81Var, Context context) {
        super(context);
        this.H = m81Var;
        this.y = true;
        this.G = new j51(this, 7);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.n = paint3;
        paint3.setColor(-1);
        this.a = new ImageReceiver(this);
    }

    public final void a() {
        j51 j51Var = this.G;
        org.telegram.messenger.i0.r(j51Var);
        if (this.y && this.H.a.d0()) {
            org.telegram.messenger.i0.h3(j51Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.s == i10 || i10 < 0 || this.H.H) {
            return;
        }
        this.s = i10;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.i0.g0(this.s, false, false), this.c, org.telegram.messenger.i0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.r = (int) Math.ceil(this.d.getLineWidth(0));
        }
        invalidate();
    }

    public final void c(int i10) {
        if (this.b || i10 < 0 || this.H.H) {
            return;
        }
        this.w = i10;
        this.e = new StaticLayout(org.telegram.messenger.i0.g0(this.w, false, false), this.c, org.telegram.messenger.i0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.y;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.D = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<i81, Float>) property, 1.0f));
                this.D.setDuration(150L);
                this.D.addListener(new h81(this, 0));
                this.D.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.D = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<i81, Float>) property, 0.0f));
            this.D.setDuration(150L);
            this.D.addListener(new h81(this, 1));
            this.D.start();
        } else {
            setAlpha(0.0f);
        }
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int L;
        int L2;
        Canvas canvas2;
        int i10;
        m81 m81Var = this.H;
        if (m81Var.P) {
            if (m81Var.M && m81Var.N != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - m81Var.L;
                m81Var.L = currentTimeMillis;
                float f7 = m81Var.N - (j10 / 150.0f);
                m81Var.N = f7;
                if (f7 < 0.0f) {
                    m81Var.N = 0.0f;
                }
                invalidate();
            }
            float f10 = m81Var.N;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f10);
            imageReceiver.h(canvas, null);
        }
        if (m81Var.a.d == null || m81Var.H) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!m81Var.U) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - org.telegram.messenger.i0.L(58.0f)) - this.r, measuredHeight - org.telegram.messenger.i0.L((m81Var.T ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.L(18.0f), measuredHeight - org.telegram.messenger.i0.L((m81Var.T ? 6 : 10) + 29));
                this.e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.s != 0) {
            int i11 = 0;
            if (m81Var.U) {
                L = measuredHeight - org.telegram.messenger.i0.L(3.0f);
                L2 = org.telegram.messenger.i0.L(7.0f);
            } else if (m81Var.T) {
                L = measuredHeight - org.telegram.messenger.i0.L(29.0f);
                i11 = org.telegram.messenger.i0.L(36.0f) + this.r;
                measuredWidth = (measuredWidth - org.telegram.messenger.i0.L(76.0f)) - this.r;
                L2 = org.telegram.messenger.i0.L(28.0f);
            } else {
                L = measuredHeight - org.telegram.messenger.i0.L(13.0f);
                L2 = org.telegram.messenger.i0.L(12.0f);
            }
            int i12 = measuredHeight - L2;
            boolean z10 = m81Var.T;
            Paint paint = this.h;
            if (z10) {
                canvas.drawRect(i11, L, measuredWidth, org.telegram.messenger.i0.L(3.0f) + L, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i13 = this.b ? this.F : ((int) ((this.w / this.s) * (measuredWidth - i11))) + i11;
            int i14 = this.x;
            if (i14 != 0 && (i10 = this.s) != 0) {
                float f11 = i11;
                float f12 = L;
                float c10 = a1.g.c(i14, i10, measuredWidth - i11, f11);
                float L3 = org.telegram.messenger.i0.L(3.0f) + L;
                if (m81Var.T) {
                    paint = this.n;
                }
                canvas2.drawRect(f11, f12, c10, L3, paint);
            }
            float f13 = i13;
            float L4 = org.telegram.messenger.i0.L(3.0f) + L;
            Paint paint2 = this.f;
            canvas2.drawRect(i11, L, f13, L4, paint2);
            if (m81Var.U) {
                return;
            }
            canvas2.drawCircle(f13, i12, org.telegram.messenger.i0.L(this.b ? 7.0f : 5.0f), paint2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.y) {
            onTouchEvent(motionEvent);
            return this.b;
        }
        d(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        m81 m81Var = this.H;
        u61 u61Var = m81Var.a;
        if (m81Var.T) {
            i10 = org.telegram.messenger.i0.L(36.0f) + this.r;
            measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f)) - this.r;
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(12.0f);
            i10 = 0;
        }
        int i12 = this.s;
        if (i12 != 0) {
            i11 = (int) ((this.w / i12) * (measuredWidth - i10));
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        int action = motionEvent.getAction();
        j51 j51Var = this.G;
        if (action == 0) {
            if (!this.y || m81Var.U || m81Var.H) {
                d(true, true);
            } else if (this.s != 0) {
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (x10 >= i13 - org.telegram.messenger.i0.L(10.0f) && x10 <= org.telegram.messenger.i0.L(10.0f) + i13 && y3 >= measuredHeight - org.telegram.messenger.i0.L(10.0f) && y3 <= org.telegram.messenger.i0.L(10.0f) + measuredHeight) {
                    this.b = true;
                    this.E = x10;
                    this.F = i13;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            org.telegram.messenger.i0.r(j51Var);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (m81Var.x && u61Var.d0()) {
                org.telegram.messenger.i0.h3(j51Var, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (m81Var.x) {
                    int i14 = (int) (((this.F - i10) / (measuredWidth - i10)) * this.s);
                    this.w = i14;
                    u61Var.q0(i14 * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.b) {
            int x11 = (int) motionEvent.getX();
            int i15 = this.F - (this.E - x11);
            this.F = i15;
            this.E = x11;
            if (i15 < i10) {
                this.F = i10;
            } else if (i15 > measuredWidth) {
                this.F = measuredWidth;
            }
            c((int) (((this.F - i10) / (measuredWidth - i10)) * this.s * 1000));
            invalidate();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        a();
    }
}
