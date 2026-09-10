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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j3 extends View {
    public final p1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
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
    public i3 x;
    public ValueAnimator y;

    public j3(Context context, p1 p1Var) {
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
        this.G = 1.0f;
        this.E = p1Var;
        p1Var.a(this);
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
        ofFloat.addUpdateListener(new g3(this, 0));
        this.F.setDuration(150L);
        this.F.start();
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
                ofInt.addUpdateListener(new g3(this, 1));
                this.y.setDuration(200L);
                this.y.start();
                if (i10 == 2) {
                    this.c.N(0, false, false);
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
                    ofInt2.addUpdateListener(new g3(this, 2));
                    this.y.addListener(new h3(this, 0));
                    this.y.setDuration(200L);
                    this.y.start();
                    this.b.N(0, false, false);
                    this.b.start();
                } else {
                    this.s = i11;
                    ofInt2.addUpdateListener(new g3(this, 3));
                    this.y.setDuration(200L);
                    this.y.addListener(new h3(this, 1));
                    this.y.start();
                }
            }
        } else if (z10) {
            this.s = i11;
            this.r = 0;
            this.w = 100;
            if (i10 == 3 || i10 == 1) {
                hj0 hj0Var = this.b;
                hj0Var.N(hj0Var.e[0] - 1, false, false);
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
        float f7 = this.G;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) ((View) getParent()).getParent()).getY() + getY();
        p1 p1Var = this.E;
        int i11 = p1Var.g;
        Paint paint = p1Var.j;
        com.google.firebase.messaging.n nVar = p1Var.a;
        float f10 = p1Var.g;
        float f11 = 1.12f * f10;
        float f12 = (f11 - p1Var.f) / 2.0f;
        float f13 = (f11 - f10) / 2.0f;
        float f14 = -x10;
        float f15 = f14 - f12;
        float f16 = -y3;
        nVar.B(f15, f16 - f13, (i11 * 1.12f) / ((Bitmap) nVar.c).getHeight(), p1Var.h);
        p1Var.c.z(f14, f16, p1Var.f - x10, p1Var.g - y3);
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
                this.c.q(canvas, paint3, false, 0L, 0);
                this.c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f17 = i12;
            if (!p1Var.i) {
                paint = (Paint) nVar.a;
            }
            canvas.drawCircle(width, height, f17, paint);
            if (p1Var.e) {
                canvas.drawCircle(width, height, f17, (Paint) p1Var.c.a);
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
            if (!p1Var.i) {
                paint = (Paint) nVar.a;
            }
            canvas.drawCircle(width, height, f18, paint);
            if (p1Var.e) {
                canvas.drawCircle(width, height, this.r, (Paint) p1Var.c.a);
            }
            this.a.draw(canvas);
        }
        if (z11 || (this.s > 0 && this.r == i10)) {
            path.reset();
            path.addCircle(width, height, this.s, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.s, paint2);
            this.b.setAlpha(255);
            this.b.q(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i3 i3Var;
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
            if (abs <= AndroidUtilities.dp(48.0f) && abs2 <= AndroidUtilities.dp(48.0f)) {
                int i10 = this.r;
                int i11 = this.n;
                boolean z11 = i10 == i11 && this.s == 0;
                if (this.s == i11 && i10 == 0) {
                    z10 = true;
                }
                if ((z11 || z10) && (i3Var = this.x) != null) {
                    i3Var.b(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(i3 i3Var) {
        this.x = i3Var;
    }
}
