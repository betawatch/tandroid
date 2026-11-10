package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n71 extends org.telegram.ui.Components.k9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final /* synthetic */ x71 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n71(x71 x71Var, Activity activity) {
        super(activity);
        this.K = x71Var;
        this.H = true;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.G;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        this.I = 0.0f;
        this.J = 0.0f;
        boolean z9 = this.H;
        x71 x71Var = this.K;
        if (z9) {
            Drawable drawable = this.G;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.qa0)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.G.draw(canvas);
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f10 = 2.0f / org.telegram.messenger.g0.p;
                    canvas.scale(f10, f10);
                    this.G.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                    this.G.draw(canvas);
                    canvas.restore();
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.G.getIntrinsicWidth(), measuredHeight / this.G.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * x71Var.z1);
                    int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * x71Var.z1);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i7 = (measuredHeight - ceil2) / 2;
                    this.J = i7;
                    this.G.setBounds(measuredWidth, i7, ceil + measuredWidth, ceil2 + i7);
                    this.G.draw(canvas);
                }
            }
        }
        if (x71Var.b2) {
            if (!x71Var.c.isFinished() && x71Var.c.computeScrollOffset()) {
                if (x71Var.c.getStartX() < x71Var.X1 && x71Var.c.getStartX() > 0) {
                    x71Var.Y1 = x71Var.c.getCurrX();
                }
                x71Var.a1();
                invalidate();
            }
            canvas.save();
            float f11 = -x71Var.Y1;
            this.I = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (x71Var.N1) {
            float f12 = x71Var.o1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f12 * 255.0f * x71Var.p1)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        x71 x71Var = this.K;
        org.telegram.ui.Components.y61 y61Var = x71Var.w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        y61Var.getClass();
        float a10 = org.telegram.ui.Components.y61.a(measuredWidth, measuredHeight);
        x71Var.z1 = a10;
        if (x71Var.F1) {
            setScaleX(a10);
            setScaleY(x71Var.z1);
        }
        if (x71Var.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (x71Var.c2 != measuredWidth2) {
            x71Var.b2 = false;
            if (x71Var.D1 != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / x71Var.D1.getHeight()) * r1.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    x71Var.b2 = true;
                    x71Var.a2 = (int) ((x71Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    x71Var.Y1 = measuredWidth3;
                    x71Var.Z1 = measuredWidth3;
                    x71Var.X1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.w = true;
                    x71Var.a1();
                }
            }
            if (!x71Var.b2) {
                u(-1, -1);
                this.w = false;
            }
        }
        x71Var.c2 = measuredWidth2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.G == drawable || super.verifyDrawable(drawable);
    }
}
