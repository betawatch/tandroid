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
import org.telegram.messenger.hs;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p2 extends View {
    public ValueAnimator E;
    public final x0 F;
    public ValueAnimator G;
    public float H;
    public float I;
    public float J;
    public ch0 a;
    public ch0 b;
    public ch0 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path h;
    public final int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public o2 y;

    public p2(Context context, x0 x0Var) {
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
        this.F = x0Var;
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
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, z10 ? 0.8f : 1.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new m2(this, 0));
        this.G.setDuration(150L);
        this.G.start();
    }

    public final void a(int i3, boolean z10, boolean z11) {
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
                ofInt.addUpdateListener(new m2(this, 1));
                this.E.setDuration(200L);
                this.E.start();
                if (i3 == 2) {
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
                    ofInt2.addUpdateListener(new m2(this, 2));
                    this.E.addListener(new n2(this, 0));
                    this.E.setDuration(200L);
                    this.E.start();
                    this.b.N(0, false, false);
                    this.b.start();
                } else {
                    this.s = i10;
                    ofInt2.addUpdateListener(new m2(this, 3));
                    this.E.setDuration(200L);
                    this.E.addListener(new n2(this, 1));
                    this.E.start();
                }
            }
        } else if (z10) {
            this.s = i10;
            this.r = 0;
            this.x = 100;
            if (i3 == 3 || i3 == 1) {
                ch0 ch0Var = this.b;
                ch0Var.N(ch0Var.e[0] - 1, false, false);
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
        int i3;
        Path path;
        canvas.save();
        float f10 = this.H;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y9 = ((View) ((View) getParent()).getParent()).getY() + getY();
        x0 x0Var = this.F;
        int i10 = x0Var.g;
        Paint paint = x0Var.j;
        l2.e eVar = x0Var.a;
        float f11 = x0Var.g;
        float f12 = 1.12f * f11;
        float f13 = (f12 - x0Var.f) / 2.0f;
        float f14 = (f12 - f11) / 2.0f;
        float f15 = -x10;
        float f16 = f15 - f13;
        float f17 = -y9;
        eVar.o(f16, f17 - f14, (i10 * 1.12f) / ((Bitmap) eVar.c).getHeight(), x0Var.h);
        x0Var.c.m(f15, f17, x0Var.f - x10, x0Var.g - y9);
        ch0 ch0Var = this.c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i11 = this.n;
        if (ch0Var != null) {
            if (this.x > 20) {
                Paint paint4 = this.f;
                paint4.setAlpha((int) ((r1 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.x * hs.e4) / 100.0f));
                canvas.drawCircle(width, height, i11, paint2);
                this.c.q(canvas, paint3, false, 0L, 0);
                this.c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f18 = i11;
            if (!x0Var.i) {
                paint = (Paint) eVar.a;
            }
            canvas.drawCircle(width, height, f18, paint);
            if (x0Var.e) {
                canvas.drawCircle(width, height, f18, (Paint) x0Var.c.a);
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
            i3 = i11;
            path = path2;
        } else {
            canvas.drawCircle(width, height, i13, paint2);
            canvas.drawCircle(width, height, this.r, paint3);
            this.b.setAlpha(hs.e4);
            i3 = i11;
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
            if (!x0Var.i) {
                paint = (Paint) eVar.a;
            }
            canvas.drawCircle(width, height, f19, paint);
            if (x0Var.e) {
                canvas.drawCircle(width, height, this.r, (Paint) x0Var.c.a);
            }
            this.a.draw(canvas);
        }
        if (z11 || (this.s > 0 && this.r == i3)) {
            path.reset();
            path.addCircle(width, height, this.s, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.s, paint2);
            this.b.setAlpha(hs.e4);
            this.b.q(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o2 o2Var;
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
            float y9 = motionEvent.getY();
            float f10 = this.I;
            float f11 = this.J;
            float abs = Math.abs(f10 - x10);
            float abs2 = Math.abs(f11 - y9);
            if (abs <= org.telegram.messenger.g0.L(48.0f) && abs2 <= org.telegram.messenger.g0.L(48.0f)) {
                int i3 = this.r;
                int i10 = this.n;
                boolean z11 = i3 == i10 && this.s == 0;
                if (this.s == i10 && i3 == 0) {
                    z10 = true;
                }
                if ((z11 || z10) && (o2Var = this.y) != null) {
                    o2Var.i(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(o2 o2Var) {
        this.y = o2Var;
    }
}
