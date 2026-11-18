package org.telegram.ui.Components.voip;

import a8.b8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d3 extends View {
    public ValueAnimator E;
    public final l1 F;
    public ValueAnimator G;
    public float H;
    public float I;
    public float J;
    public mh0 a;
    public mh0 b;
    public mh0 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path h;
    public final int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public c3 y;

    public d3(Context context, l1 l1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.h = new Path();
        int L = org.telegram.messenger.g0.L(26.0f);
        this.n = L;
        this.r = L;
        this.s = 0;
        this.w = false;
        this.x = 0;
        this.H = 1.0f;
        this.F = l1Var;
        l1Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z10) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, z10 ? 0.8f : 1.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 0));
        this.G.setDuration(150L);
        this.G.start();
    }

    public final void a(int i7, boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.E.removeAllUpdateListeners();
            this.E.cancel();
            z11 = false;
        }
        int i10 = this.n;
        if (z11) {
            if (this.c != null) {
                ValueAnimator valueAnimator2 = this.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.E.cancel();
                }
                ValueAnimator ofInt = z10 ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                this.E = ofInt;
                ofInt.addUpdateListener(new a3(this, 1));
                this.E.setDuration(200L);
                this.E.start();
                if (i7 == 2) {
                    this.c.N(0, false, false);
                    this.c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.E;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.E.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i10);
                this.E = ofInt2;
                if (z10) {
                    this.r = i10;
                    ofInt2.addUpdateListener(new a3(this, 2));
                    this.E.addListener(new b3(this, 0));
                    this.E.setDuration(200L);
                    this.E.start();
                    this.b.N(0, false, false);
                    this.b.start();
                } else {
                    this.s = i10;
                    ofInt2.addUpdateListener(new a3(this, 3));
                    this.E.setDuration(200L);
                    this.E.addListener(new b3(this, 1));
                    this.E.start();
                }
            }
        } else if (z10) {
            this.s = i10;
            this.r = 0;
            this.x = 100;
            if (i7 == 3 || i7 == 1) {
                mh0 mh0Var = this.b;
                mh0Var.N(mh0Var.e[0] - 1, false, false);
            }
        } else {
            this.s = 0;
            this.r = i10;
            this.x = 20;
        }
        this.w = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        Path path;
        canvas.save();
        float f10 = this.H;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) ((View) getParent()).getParent()).getY() + getY();
        l1 l1Var = this.F;
        int i10 = l1Var.g;
        Paint paint = l1Var.j;
        b8 b8Var = l1Var.a;
        float f11 = l1Var.g;
        float f12 = 1.12f * f11;
        float f13 = (f12 - l1Var.f) / 2.0f;
        float f14 = (f12 - f11) / 2.0f;
        float f15 = -x10;
        float f16 = f15 - f13;
        float f17 = -y10;
        b8Var.m(f16, f17 - f14, (i10 * 1.12f) / ((Bitmap) b8Var.c).getHeight(), l1Var.h);
        l1Var.c.k(f15, f17, l1Var.f - x10, l1Var.g - y10);
        mh0 mh0Var = this.c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i11 = this.n;
        if (mh0Var != null) {
            if (this.x > 20) {
                Paint paint4 = this.f;
                paint4.setAlpha((int) ((r1 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.x * ks.e4) / 100.0f));
                canvas.drawCircle(width, height, i11, paint2);
                this.c.q(canvas, paint3, false, 0L, 0);
                this.c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f18 = i11;
            if (!l1Var.i) {
                paint = (Paint) b8Var.a;
            }
            canvas.drawCircle(width, height, f18, paint);
            if (l1Var.e) {
                canvas.drawCircle(width, height, f18, (Paint) l1Var.c.a);
            }
            this.c.draw(canvas);
            return;
        }
        if (this.b == null || this.a == null) {
            return;
        }
        int i12 = this.r;
        boolean z10 = i12 == i11 && this.s == 0;
        int i13 = this.s;
        boolean z11 = i13 == i11 && i12 == 0;
        Path path2 = this.h;
        if (i13 != i11 || i12 <= 0 || i12 == i11) {
            i7 = i11;
            path = path2;
        } else {
            canvas.drawCircle(width, height, i13, paint2);
            canvas.drawCircle(width, height, this.r, paint3);
            this.b.setAlpha(ks.e4);
            i7 = i11;
            this.b.q(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
            path2.reset();
            path = path2;
            path.addCircle(width, height, this.r, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.r, paint3);
        }
        if (z10 || this.r > 0) {
            float f19 = this.r;
            if (!l1Var.i) {
                paint = (Paint) b8Var.a;
            }
            canvas.drawCircle(width, height, f19, paint);
            if (l1Var.e) {
                canvas.drawCircle(width, height, this.r, (Paint) l1Var.c.a);
            }
            this.a.draw(canvas);
        }
        if (z11 || (this.s > 0 && this.r == i7)) {
            path.reset();
            path.addCircle(width, height, this.s, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.s, paint2);
            this.b.setAlpha(ks.e4);
            this.b.q(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c3 c3Var;
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressedBtn(true);
            this.I = motionEvent.getX();
            this.J = motionEvent.getY();
            return true;
        }
        boolean z10 = false;
        if (action == 1) {
            setPressedBtn(false);
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f10 = this.I;
            float f11 = this.J;
            float abs = Math.abs(f10 - x10);
            float abs2 = Math.abs(f11 - y10);
            if (abs <= org.telegram.messenger.g0.L(48.0f) && abs2 <= org.telegram.messenger.g0.L(48.0f)) {
                int i7 = this.r;
                int i10 = this.n;
                boolean z11 = i7 == i10 && this.s == 0;
                if (this.s == i10 && i7 == 0) {
                    z10 = true;
                }
                if ((z11 || z10) && (c3Var = this.y) != null) {
                    c3Var.g(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(c3 c3Var) {
        this.y = c3Var;
    }
}
