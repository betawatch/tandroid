package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k71 extends org.telegram.ui.Components.l9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final /* synthetic */ u71 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(u71 u71Var, Activity activity) {
        super(activity);
        this.K = u71Var;
        this.H = true;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.G;
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        this.I = 0.0f;
        this.J = 0.0f;
        boolean z9 = this.H;
        u71 u71Var = this.K;
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
                    int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * u71Var.z1);
                    int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * u71Var.z1);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i7 = (measuredHeight - ceil2) / 2;
                    this.J = i7;
                    this.G.setBounds(measuredWidth, i7, ceil + measuredWidth, ceil2 + i7);
                    this.G.draw(canvas);
                }
            }
        }
        if (u71Var.b2) {
            if (!u71Var.c.isFinished() && u71Var.c.computeScrollOffset()) {
                if (u71Var.c.getStartX() < u71Var.X1 && u71Var.c.getStartX() > 0) {
                    u71Var.Y1 = u71Var.c.getCurrX();
                }
                u71Var.a1();
                invalidate();
            }
            canvas.save();
            float f11 = -u71Var.Y1;
            this.I = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (u71Var.N1) {
            float f12 = u71Var.o1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f12 * 255.0f * u71Var.p1)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        u71 u71Var = this.K;
        org.telegram.ui.Components.y61 y61Var = u71Var.w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        y61Var.getClass();
        float a10 = org.telegram.ui.Components.y61.a(measuredWidth, measuredHeight);
        u71Var.z1 = a10;
        if (u71Var.F1) {
            setScaleX(a10);
            setScaleY(u71Var.z1);
        }
        if (u71Var.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (u71Var.c2 != measuredWidth2) {
            u71Var.b2 = false;
            if (u71Var.D1 != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / u71Var.D1.getHeight()) * r1.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    u71Var.b2 = true;
                    u71Var.a2 = (int) ((u71Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    u71Var.Y1 = measuredWidth3;
                    u71Var.Z1 = measuredWidth3;
                    u71Var.X1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.w = true;
                    u71Var.a1();
                }
            }
            if (!u71Var.b2) {
                u(-1, -1);
                this.w = false;
            }
        }
        u71Var.c2 = measuredWidth2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.G == drawable || super.verifyDrawable(drawable);
    }
}
