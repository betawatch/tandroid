package org.telegram.ui.Components.voip;

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
import org.telegram.messenger.zs;
import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q2 extends View {
    public ValueAnimator D;
    public final x0 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public bi0 a;
    public bi0 b;
    public bi0 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path h;
    public final int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public p2 y;

    public q2(Context context, x0 x0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.h = new Path();
        int L = org.telegram.messenger.i0.L(26.0f);
        this.n = L;
        this.r = L;
        this.s = 0;
        this.w = false;
        this.x = 0;
        this.G = 1.0f;
        this.E = x0Var;
        x0Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z10) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z10 ? 0.8f : 1.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new n2(this, 0));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void a(int i10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.D.removeAllUpdateListeners();
            this.D.cancel();
            z11 = false;
        }
        int i11 = this.n;
        if (z11) {
            if (this.c != null) {
                ValueAnimator valueAnimator2 = this.D;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.D.cancel();
                }
                ValueAnimator ofInt = z10 ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                this.D = ofInt;
                ofInt.addUpdateListener(new n2(this, 1));
                this.D.setDuration(200L);
                this.D.start();
                if (i10 == 2) {
                    this.c.N(0, false, false);
                    this.c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.D;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.D.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.D = ofInt2;
                if (z10) {
                    this.r = i11;
                    ofInt2.addUpdateListener(new n2(this, 2));
                    this.D.addListener(new o2(this, 0));
                    this.D.setDuration(200L);
                    this.D.start();
                    this.b.N(0, false, false);
                    this.b.start();
                } else {
                    this.s = i11;
                    ofInt2.addUpdateListener(new n2(this, 3));
                    this.D.setDuration(200L);
                    this.D.addListener(new o2(this, 1));
                    this.D.start();
                }
            }
        } else if (z10) {
            this.s = i11;
            this.r = 0;
            this.x = 100;
            if (i10 == 3 || i10 == 1) {
                bi0 bi0Var = this.b;
                bi0Var.N(bi0Var.e[0] - 1, false, false);
            }
        } else {
            this.s = 0;
            this.r = i11;
            this.x = 20;
        }
        this.w = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Path path;
        canvas.save();
        float f7 = this.G;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) ((View) getParent()).getParent()).getY() + getY();
        x0 x0Var = this.E;
        int i11 = x0Var.g;
        Paint paint = x0Var.j;
        j2.f fVar = x0Var.a;
        float f10 = x0Var.g;
        float f11 = 1.12f * f10;
        float f12 = (f11 - x0Var.f) / 2.0f;
        float f13 = (f11 - f10) / 2.0f;
        float f14 = -x10;
        float f15 = f14 - f12;
        float f16 = -y3;
        fVar.z(f15, f16 - f13, (i11 * 1.12f) / ((Bitmap) fVar.c).getHeight(), x0Var.h);
        x0Var.c.x(f14, f16, x0Var.f - x10, x0Var.g - y3);
        bi0 bi0Var = this.c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i12 = this.n;
        if (bi0Var != null) {
            if (this.x > 20) {
                Paint paint4 = this.f;
                paint4.setAlpha((int) ((r1 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.x * zs.e4) / 100.0f));
                canvas.drawCircle(width, height, i12, paint2);
                this.c.q(canvas, paint3, false, 0L, 0);
                this.c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f17 = i12;
            if (!x0Var.i) {
                paint = (Paint) fVar.a;
            }
            canvas.drawCircle(width, height, f17, paint);
            if (x0Var.e) {
                canvas.drawCircle(width, height, f17, (Paint) x0Var.c.a);
            }
            this.c.draw(canvas);
            return;
        }
        if (this.b == null || this.a == null) {
            return;
        }
        int i13 = this.r;
        boolean z10 = i13 == i12 && this.s == 0;
        int i14 = this.s;
        boolean z11 = i14 == i12 && i13 == 0;
        Path path2 = this.h;
        if (i14 != i12 || i13 <= 0 || i13 == i12) {
            i10 = i12;
            path = path2;
        } else {
            canvas.drawCircle(width, height, i14, paint2);
            canvas.drawCircle(width, height, this.r, paint3);
            this.b.setAlpha(zs.e4);
            i10 = i12;
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
            float f18 = this.r;
            if (!x0Var.i) {
                paint = (Paint) fVar.a;
            }
            canvas.drawCircle(width, height, f18, paint);
            if (x0Var.e) {
                canvas.drawCircle(width, height, this.r, (Paint) x0Var.c.a);
            }
            this.a.draw(canvas);
        }
        if (z11 || (this.s > 0 && this.r == i10)) {
            path.reset();
            path.addCircle(width, height, this.s, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.s, paint2);
            this.b.setAlpha(zs.e4);
            this.b.q(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p2 p2Var;
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressedBtn(true);
            this.H = motionEvent.getX();
            this.I = motionEvent.getY();
            return true;
        }
        boolean z10 = false;
        if (action == 1) {
            setPressedBtn(false);
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float f7 = this.H;
            float f10 = this.I;
            float abs = Math.abs(f7 - x10);
            float abs2 = Math.abs(f10 - y3);
            if (abs <= org.telegram.messenger.i0.L(48.0f) && abs2 <= org.telegram.messenger.i0.L(48.0f)) {
                int i10 = this.r;
                int i11 = this.n;
                boolean z11 = i10 == i11 && this.s == 0;
                if (this.s == i11 && i10 == 0) {
                    z10 = true;
                }
                if ((z11 || z10) && (p2Var = this.y) != null) {
                    p2Var.j(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(p2 p2Var) {
        this.y = p2Var;
    }
}
