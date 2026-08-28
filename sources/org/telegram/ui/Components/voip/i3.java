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
import org.telegram.ui.Components.mi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i3 extends View {
    public final n1 A;
    public ValueAnimator B;
    public float C;
    public float D;
    public float E;
    public mi0 a;
    public mi0 b;
    public mi0 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path h;
    public final int n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public h3 x;
    public ValueAnimator y;

    public i3(Context context, n1 n1Var) {
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
        this.A = n1Var;
        n1Var.a(this);
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
        ofFloat.addUpdateListener(new f3(this, 0));
        this.B.setDuration(150L);
        this.B.start();
    }

    public final void a(int i9, boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.y.removeAllUpdateListeners();
            this.y.cancel();
            z11 = false;
        }
        int i10 = this.n;
        if (z11) {
            if (this.c != null) {
                ValueAnimator valueAnimator2 = this.y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.y.cancel();
                }
                ValueAnimator ofInt = z10 ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                this.y = ofInt;
                ofInt.addUpdateListener(new f3(this, 1));
                this.y.setDuration(200L);
                this.y.start();
                if (i9 == 2) {
                    this.c.L(0, false, false);
                    this.c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i10);
                this.y = ofInt2;
                if (z10) {
                    this.r = i10;
                    ofInt2.addUpdateListener(new f3(this, 2));
                    this.y.addListener(new g3(this, 0));
                    this.y.setDuration(200L);
                    this.y.start();
                    this.b.L(0, false, false);
                    this.b.start();
                } else {
                    this.s = i10;
                    ofInt2.addUpdateListener(new f3(this, 3));
                    this.y.setDuration(200L);
                    this.y.addListener(new g3(this, 1));
                    this.y.start();
                }
            }
        } else if (z10) {
            this.s = i10;
            this.r = 0;
            this.w = 100;
            if (i9 == 3 || i9 == 1) {
                mi0 mi0Var = this.b;
                mi0Var.L(mi0Var.e[0] - 1, false, false);
            }
        } else {
            this.s = 0;
            this.r = i10;
            this.w = 20;
        }
        this.v = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        Path path;
        canvas.save();
        float f10 = this.C;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) ((View) getParent()).getParent()).getY() + getY();
        n1 n1Var = this.A;
        int i10 = n1Var.g;
        Paint paint = n1Var.j;
        com.google.firebase.messaging.m mVar = n1Var.a;
        float f11 = n1Var.g;
        float f12 = 1.12f * f11;
        float f13 = (f12 - n1Var.f) / 2.0f;
        float f14 = (f12 - f11) / 2.0f;
        float f15 = -x10;
        float f16 = f15 - f13;
        float f17 = -y10;
        mVar.y(f16, f17 - f14, (i10 * 1.12f) / ((Bitmap) mVar.c).getHeight(), n1Var.h);
        n1Var.c.w(f15, f17, n1Var.f - x10, n1Var.g - y10);
        mi0 mi0Var = this.c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i11 = this.n;
        if (mi0Var != null) {
            if (this.w > 20) {
                Paint paint4 = this.f;
                paint4.setAlpha((int) ((r1 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.w * 255) / 100.0f));
                canvas.drawCircle(width, height, i11, paint2);
                this.c.o(canvas, paint3, false, 0L, 0);
                this.c.o(canvas, paint4, false, 0L, 0);
                return;
            }
            float f18 = i11;
            if (!n1Var.i) {
                paint = (Paint) mVar.a;
            }
            canvas.drawCircle(width, height, f18, paint);
            if (n1Var.e) {
                canvas.drawCircle(width, height, f18, (Paint) n1Var.c.a);
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
            i9 = i11;
            path = path2;
        } else {
            canvas.drawCircle(width, height, i13, paint2);
            canvas.drawCircle(width, height, this.r, paint3);
            this.b.setAlpha(255);
            i9 = i11;
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
            float f19 = this.r;
            if (!n1Var.i) {
                paint = (Paint) mVar.a;
            }
            canvas.drawCircle(width, height, f19, paint);
            if (n1Var.e) {
                canvas.drawCircle(width, height, this.r, (Paint) n1Var.c.a);
            }
            this.a.draw(canvas);
        }
        if (z11 || (this.s > 0 && this.r == i9)) {
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
        h3 h3Var;
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
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f10 = this.D;
            float f11 = this.E;
            float abs = Math.abs(f10 - x10);
            float abs2 = Math.abs(f11 - y10);
            if (abs <= AndroidUtilities.dp(48.0f) && abs2 <= AndroidUtilities.dp(48.0f)) {
                int i9 = this.r;
                int i10 = this.n;
                boolean z11 = i9 == i10 && this.s == 0;
                if (this.s == i10 && i9 == 0) {
                    z10 = true;
                }
                if ((z11 || z10) && (h3Var = this.x) != null) {
                    h3Var.d(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(h3 h3Var) {
        this.x = h3Var;
    }
}
