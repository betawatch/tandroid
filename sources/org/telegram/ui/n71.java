package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class n71 extends org.telegram.ui.Components.q9 {
    public Drawable H;
    public final boolean I;
    public float J;
    public float K;
    public final /* synthetic */ x71 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n71(x71 x71Var, Activity activity) {
        super(activity);
        this.L = x71Var;
        this.I = true;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.H;
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        this.J = 0.0f;
        this.K = 0.0f;
        boolean z10 = this.I;
        x71 x71Var = this.L;
        if (z10) {
            Drawable drawable = this.H;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.cb0)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.H.draw(canvas);
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f10 = 2.0f / org.telegram.messenger.g0.p;
                    canvas.scale(f10, f10);
                    this.H.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                    this.H.draw(canvas);
                    canvas.restore();
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.H.getIntrinsicWidth(), measuredHeight / this.H.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.H.getIntrinsicWidth() * max * x71Var.A1);
                    int ceil2 = (int) Math.ceil(this.H.getIntrinsicHeight() * max * x71Var.A1);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i7 = (measuredHeight - ceil2) / 2;
                    this.K = i7;
                    this.H.setBounds(measuredWidth, i7, ceil + measuredWidth, ceil2 + i7);
                    this.H.draw(canvas);
                }
            }
        }
        if (x71Var.c2) {
            if (!x71Var.c.isFinished() && x71Var.c.computeScrollOffset()) {
                if (x71Var.c.getStartX() < x71Var.Y1 && x71Var.c.getStartX() > 0) {
                    x71Var.Z1 = x71Var.c.getCurrX();
                }
                x71Var.a1();
                invalidate();
            }
            canvas.save();
            float f11 = -x71Var.Z1;
            this.J = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (x71Var.O1) {
            float f12 = x71Var.p1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f12 * 255.0f * x71Var.q1)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        x71 x71Var = this.L;
        org.telegram.ui.Components.m71 m71Var = x71Var.x1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        m71Var.getClass();
        float a10 = org.telegram.ui.Components.m71.a(measuredWidth, measuredHeight);
        x71Var.A1 = a10;
        if (x71Var.G1) {
            setScaleX(a10);
            setScaleY(x71Var.A1);
        }
        if (x71Var.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (x71Var.d2 != measuredWidth2) {
            x71Var.c2 = false;
            if (x71Var.E1 != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / x71Var.E1.getHeight()) * r1.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    x71Var.c2 = true;
                    x71Var.b2 = (int) ((x71Var.E1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    x71Var.Z1 = measuredWidth3;
                    x71Var.a2 = measuredWidth3;
                    x71Var.Y1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.w = true;
                    x71Var.a1();
                }
            }
            if (!x71Var.c2) {
                u(-1, -1);
                this.w = false;
            }
        }
        x71Var.d2 = measuredWidth2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.H = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.H == drawable || super.verifyDrawable(drawable);
    }
}
