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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k3 extends View {
    public final o1 B;
    public ValueAnimator C;
    public float D;
    public float E;
    public float F;
    public hj0 a;
    public hj0 b;
    public hj0 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path h;
    public final int n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public j3 x;
    public ValueAnimator y;

    public k3(Context context, o1 o1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.n = dp;
        this.r = dp;
        this.s = 0;
        this.v = false;
        this.w = 0;
        this.D = 1.0f;
        this.B = o1Var;
        o1Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z4) {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, z4 ? 0.8f : 1.0f);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new h3(this, 0));
        this.C.setDuration(150L);
        this.C.start();
    }

    public final void a(int i10, boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.y.removeAllUpdateListeners();
            this.y.cancel();
            z10 = false;
        }
        int i11 = this.n;
        if (z10) {
            if (this.c != null) {
                ValueAnimator valueAnimator2 = this.y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.y.cancel();
                }
                ValueAnimator ofInt = z4 ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                this.y = ofInt;
                ofInt.addUpdateListener(new h3(this, 1));
                this.y.setDuration(200L);
                this.y.start();
                if (i10 == 2) {
                    this.c.L(0, false, false);
                    this.c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.y = ofInt2;
                if (z4) {
                    this.r = i11;
                    ofInt2.addUpdateListener(new h3(this, 2));
                    this.y.addListener(new i3(this, 0));
                    this.y.setDuration(200L);
                    this.y.start();
                    this.b.L(0, false, false);
                    this.b.start();
                } else {
                    this.s = i11;
                    ofInt2.addUpdateListener(new h3(this, 3));
                    this.y.setDuration(200L);
                    this.y.addListener(new i3(this, 1));
                    this.y.start();
                }
            }
        } else if (z4) {
            this.s = i11;
            this.r = 0;
            this.w = 100;
            if (i10 == 3 || i10 == 1) {
                hj0 hj0Var = this.b;
                hj0Var.L(hj0Var.e[0] - 1, false, false);
            }
        } else {
            this.s = 0;
            this.r = i11;
            this.w = 20;
        }
        this.v = z4;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Path path;
        canvas.save();
        float f10 = this.D;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) ((View) getParent()).getParent()).getY() + getY();
        o1 o1Var = this.B;
        int i11 = o1Var.g;
        Paint paint = o1Var.j;
        a9.a aVar = o1Var.a;
        float f11 = o1Var.g;
        float f12 = 1.12f * f11;
        float f13 = (f12 - o1Var.f) / 2.0f;
        float f14 = (f12 - f11) / 2.0f;
        float f15 = -x10;
        float f16 = f15 - f13;
        float f17 = -y10;
        aVar.z(f16, f17 - f14, (i11 * 1.12f) / ((Bitmap) aVar.c).getHeight(), o1Var.h);
        o1Var.c.x(f15, f17, o1Var.f - x10, o1Var.g - y10);
        hj0 hj0Var = this.c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i12 = this.n;
        if (hj0Var != null) {
            if (this.w > 20) {
                Paint paint4 = this.f;
                paint4.setAlpha((int) ((r1 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.w * 255) / 100.0f));
                canvas.drawCircle(width, height, i12, paint2);
                this.c.o(canvas, paint3, false, 0L, 0);
                this.c.o(canvas, paint4, false, 0L, 0);
                return;
            }
            float f18 = i12;
            if (!o1Var.i) {
                paint = (Paint) aVar.a;
            }
            canvas.drawCircle(width, height, f18, paint);
            if (o1Var.e) {
                canvas.drawCircle(width, height, f18, (Paint) o1Var.c.a);
            }
            this.c.draw(canvas);
            return;
        }
        if (this.b == null || this.a == null) {
            return;
        }
        int i13 = this.r;
        boolean z4 = i13 == i12 && this.s == 0;
        int i14 = this.s;
        boolean z10 = i14 == i12 && i13 == 0;
        Path path2 = this.h;
        if (i14 != i12 || i13 <= 0 || i13 == i12) {
            i10 = i12;
            path = path2;
        } else {
            canvas.drawCircle(width, height, i14, paint2);
            canvas.drawCircle(width, height, this.r, paint3);
            this.b.setAlpha(255);
            i10 = i12;
            this.b.o(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
            path2.reset();
            path = path2;
            path.addCircle(width, height, this.r, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.r, paint3);
        }
        if (z4 || this.r > 0) {
            float f19 = this.r;
            if (!o1Var.i) {
                paint = (Paint) aVar.a;
            }
            canvas.drawCircle(width, height, f19, paint);
            if (o1Var.e) {
                canvas.drawCircle(width, height, this.r, (Paint) o1Var.c.a);
            }
            this.a.draw(canvas);
        }
        if (z10 || (this.s > 0 && this.r == i10)) {
            path.reset();
            path.addCircle(width, height, this.s, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.s, paint2);
            this.b.setAlpha(255);
            this.b.o(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j3 j3Var;
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressedBtn(true);
            this.E = motionEvent.getX();
            this.F = motionEvent.getY();
            return true;
        }
        boolean z4 = false;
        if (action == 1) {
            setPressedBtn(false);
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f10 = this.E;
            float f11 = this.F;
            float abs = Math.abs(f10 - x10);
            float abs2 = Math.abs(f11 - y10);
            if (abs <= AndroidUtilities.dp(48.0f) && abs2 <= AndroidUtilities.dp(48.0f)) {
                int i10 = this.r;
                int i11 = this.n;
                boolean z10 = i10 == i11 && this.s == 0;
                if (this.s == i11 && i10 == 0) {
                    z4 = true;
                }
                if ((z10 || z4) && (j3Var = this.x) != null) {
                    j3Var.d(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(j3 j3Var) {
        this.x = j3Var;
    }
}
