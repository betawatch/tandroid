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
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l3 extends View {
    public final o1 A;
    public ValueAnimator B;
    public float C;
    public float D;
    public float E;
    public xi0 a;
    public xi0 b;
    public xi0 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path h;
    public final int n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public k3 x;
    public ValueAnimator y;

    public l3(Context context, o1 o1Var) {
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
        this.C = 1.0f;
        this.A = o1Var;
        o1Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z10) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, z10 ? 0.8f : 1.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new i3(this, 0));
        this.B.setDuration(150L);
        this.B.start();
    }

    public final void a(int i10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.y.removeAllUpdateListeners();
            this.y.cancel();
            z11 = false;
        }
        int i11 = this.n;
        if (z11) {
            if (this.c != null) {
                ValueAnimator valueAnimator2 = this.y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.y.cancel();
                }
                ValueAnimator ofInt = z10 ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                this.y = ofInt;
                ofInt.addUpdateListener(new i3(this, 1));
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
                if (z10) {
                    this.r = i11;
                    ofInt2.addUpdateListener(new i3(this, 2));
                    this.y.addListener(new j3(this, 0));
                    this.y.setDuration(200L);
                    this.y.start();
                    this.b.L(0, false, false);
                    this.b.start();
                } else {
                    this.s = i11;
                    ofInt2.addUpdateListener(new i3(this, 3));
                    this.y.setDuration(200L);
                    this.y.addListener(new j3(this, 1));
                    this.y.start();
                }
            }
        } else if (z10) {
            this.s = i11;
            this.r = 0;
            this.w = 100;
            if (i10 == 3 || i10 == 1) {
                xi0 xi0Var = this.b;
                xi0Var.L(xi0Var.e[0] - 1, false, false);
            }
        } else {
            this.s = 0;
            this.r = i11;
            this.w = 20;
        }
        this.v = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Path path;
        canvas.save();
        float f9 = this.C;
        canvas.scale(f9, f9, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x4 = ((View) getParent()).getX() + getX();
        float y8 = ((View) ((View) getParent()).getParent()).getY() + getY();
        o1 o1Var = this.A;
        int i11 = o1Var.g;
        Paint paint = o1Var.j;
        bg.c2 c2Var = o1Var.a;
        float f10 = o1Var.g;
        float f11 = 1.12f * f10;
        float f12 = (f11 - o1Var.f) / 2.0f;
        float f13 = (f11 - f10) / 2.0f;
        float f14 = -x4;
        float f15 = f14 - f12;
        float f16 = -y8;
        c2Var.y(f15, f16 - f13, (i11 * 1.12f) / ((Bitmap) c2Var.b).getHeight(), o1Var.h);
        o1Var.c.w(f14, f16, o1Var.f - x4, o1Var.g - y8);
        xi0 xi0Var = this.c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i12 = this.n;
        if (xi0Var != null) {
            if (this.w > 20) {
                Paint paint4 = this.f;
                paint4.setAlpha((int) ((r1 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.w * 255) / 100.0f));
                canvas.drawCircle(width, height, i12, paint2);
                this.c.o(canvas, paint3, false, 0L, 0);
                this.c.o(canvas, paint4, false, 0L, 0);
                return;
            }
            float f17 = i12;
            if (!o1Var.i) {
                paint = (Paint) c2Var.d;
            }
            canvas.drawCircle(width, height, f17, paint);
            if (o1Var.e) {
                canvas.drawCircle(width, height, f17, (Paint) o1Var.c.d);
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
        if (z10 || this.r > 0) {
            float f18 = this.r;
            if (!o1Var.i) {
                paint = (Paint) c2Var.d;
            }
            canvas.drawCircle(width, height, f18, paint);
            if (o1Var.e) {
                canvas.drawCircle(width, height, this.r, (Paint) o1Var.c.d);
            }
            this.a.draw(canvas);
        }
        if (z11 || (this.s > 0 && this.r == i10)) {
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
        k3 k3Var;
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressedBtn(true);
            this.D = motionEvent.getX();
            this.E = motionEvent.getY();
            return true;
        }
        boolean z10 = false;
        if (action == 1) {
            setPressedBtn(false);
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            float f9 = this.D;
            float f10 = this.E;
            float abs = Math.abs(f9 - x4);
            float abs2 = Math.abs(f10 - y8);
            if (abs <= AndroidUtilities.dp(48.0f) && abs2 <= AndroidUtilities.dp(48.0f)) {
                int i10 = this.r;
                int i11 = this.n;
                boolean z11 = i10 == i11 && this.s == 0;
                if (this.s == i11 && i10 == 0) {
                    z10 = true;
                }
                if ((z11 || z10) && (k3Var = this.x) != null) {
                    k3Var.d(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(k3 k3Var) {
        this.x = k3Var;
    }
}
