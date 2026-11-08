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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a3 extends View {
    public ValueAnimator D;
    public final i1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public zg0 a;
    public zg0 b;
    public zg0 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path h;
    public final int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public z2 y;

    public a3(Context context, i1 i1Var) {
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
        this.G = 1.0f;
        this.E = i1Var;
        i1Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z9) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z9 ? 0.8f : 1.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new x2(this, 0));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void a(int i7, boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.D.removeAllUpdateListeners();
            this.D.cancel();
            z10 = false;
        }
        int i10 = this.n;
        if (z10) {
            if (this.c != null) {
                ValueAnimator valueAnimator2 = this.D;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.D.cancel();
                }
                ValueAnimator ofInt = z9 ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                this.D = ofInt;
                ofInt.addUpdateListener(new x2(this, 1));
                this.D.setDuration(200L);
                this.D.start();
                if (i7 == 2) {
                    this.c.N(0, false, false);
                    this.c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.D;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.D.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i10);
                this.D = ofInt2;
                if (z9) {
                    this.r = i10;
                    ofInt2.addUpdateListener(new x2(this, 2));
                    this.D.addListener(new y2(this, 0));
                    this.D.setDuration(200L);
                    this.D.start();
                    this.b.N(0, false, false);
                    this.b.start();
                } else {
                    this.s = i10;
                    ofInt2.addUpdateListener(new x2(this, 3));
                    this.D.setDuration(200L);
                    this.D.addListener(new y2(this, 1));
                    this.D.start();
                }
            }
        } else if (z9) {
            this.s = i10;
            this.r = 0;
            this.x = 100;
            if (i7 == 3 || i7 == 1) {
                zg0 zg0Var = this.b;
                zg0Var.N(zg0Var.e[0] - 1, false, false);
            }
        } else {
            this.s = 0;
            this.r = i10;
            this.x = 20;
        }
        this.w = z9;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        Path path;
        canvas.save();
        float f10 = this.G;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) ((View) getParent()).getParent()).getY() + getY();
        i1 i1Var = this.E;
        int i10 = i1Var.g;
        Paint paint = i1Var.j;
        b8 b8Var = i1Var.a;
        float f11 = i1Var.g;
        float f12 = 1.12f * f11;
        float f13 = (f12 - i1Var.f) / 2.0f;
        float f14 = (f12 - f11) / 2.0f;
        float f15 = -x10;
        float f16 = f15 - f13;
        float f17 = -y10;
        b8Var.m(f16, f17 - f14, (i10 * 1.12f) / ((Bitmap) b8Var.c).getHeight(), i1Var.h);
        i1Var.c.k(f15, f17, i1Var.f - x10, i1Var.g - y10);
        zg0 zg0Var = this.c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i11 = this.n;
        if (zg0Var != null) {
            if (this.x > 20) {
                Paint paint4 = this.f;
                paint4.setAlpha((int) ((r1 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.x * qs.e4) / 100.0f));
                canvas.drawCircle(width, height, i11, paint2);
                this.c.q(canvas, paint3, false, 0L, 0);
                this.c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f18 = i11;
            if (!i1Var.i) {
                paint = (Paint) b8Var.a;
            }
            canvas.drawCircle(width, height, f18, paint);
            if (i1Var.e) {
                canvas.drawCircle(width, height, f18, (Paint) i1Var.c.a);
            }
            this.c.draw(canvas);
            return;
        }
        if (this.b == null || this.a == null) {
            return;
        }
        int i12 = this.r;
        boolean z9 = i12 == i11 && this.s == 0;
        int i13 = this.s;
        boolean z10 = i13 == i11 && i12 == 0;
        Path path2 = this.h;
        if (i13 != i11 || i12 <= 0 || i12 == i11) {
            i7 = i11;
            path = path2;
        } else {
            canvas.drawCircle(width, height, i13, paint2);
            canvas.drawCircle(width, height, this.r, paint3);
            this.b.setAlpha(qs.e4);
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
        if (z9 || this.r > 0) {
            float f19 = this.r;
            if (!i1Var.i) {
                paint = (Paint) b8Var.a;
            }
            canvas.drawCircle(width, height, f19, paint);
            if (i1Var.e) {
                canvas.drawCircle(width, height, this.r, (Paint) i1Var.c.a);
            }
            this.a.draw(canvas);
        }
        if (z10 || (this.s > 0 && this.r == i7)) {
            path.reset();
            path.addCircle(width, height, this.s, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.s, paint2);
            this.b.setAlpha(qs.e4);
            this.b.q(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var;
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressedBtn(true);
            this.H = motionEvent.getX();
            this.I = motionEvent.getY();
            return true;
        }
        boolean z9 = false;
        if (action == 1) {
            setPressedBtn(false);
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f10 = this.H;
            float f11 = this.I;
            float abs = Math.abs(f10 - x10);
            float abs2 = Math.abs(f11 - y10);
            if (abs <= org.telegram.messenger.g0.L(48.0f) && abs2 <= org.telegram.messenger.g0.L(48.0f)) {
                int i7 = this.r;
                int i10 = this.n;
                boolean z10 = i7 == i10 && this.s == 0;
                if (this.s == i10 && i7 == 0) {
                    z9 = true;
                }
                if ((z10 || z9) && (z2Var = this.y) != null) {
                    z2Var.d(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(z2 z2Var) {
        this.y = z2Var;
    }
}
