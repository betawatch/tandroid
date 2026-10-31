package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c91 extends org.telegram.ui.Components.g9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final /* synthetic */ m91 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c91(m91 m91Var, Activity activity) {
        super(activity);
        this.K = m91Var;
        this.H = true;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.G;
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDraw(Canvas canvas) {
        this.I = 0.0f;
        this.J = 0.0f;
        boolean z10 = this.H;
        m91 m91Var = this.K;
        if (z10) {
            Drawable drawable = this.G;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.jb0)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.G.draw(canvas);
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f7 = 2.0f / org.telegram.messenger.i0.p;
                    canvas.scale(f7, f7);
                    this.G.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                    this.G.draw(canvas);
                    canvas.restore();
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.G.getIntrinsicWidth(), measuredHeight / this.G.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * m91Var.z1);
                    int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * m91Var.z1);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    this.J = i10;
                    this.G.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                    this.G.draw(canvas);
                }
            }
        }
        if (m91Var.b2) {
            if (!m91Var.c.isFinished() && m91Var.c.computeScrollOffset()) {
                if (m91Var.c.getStartX() < m91Var.X1 && m91Var.c.getStartX() > 0) {
                    m91Var.Y1 = m91Var.c.getCurrX();
                }
                m91Var.Z0();
                invalidate();
            }
            canvas.save();
            float f10 = -m91Var.Y1;
            this.I = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (m91Var.N1) {
            float f11 = m91Var.o1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.b.o(-16777216, (int) (f11 * 255.0f * m91Var.p1)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m91 m91Var = this.K;
        org.telegram.ui.Components.z71 z71Var = m91Var.w1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        z71Var.getClass();
        float a2 = org.telegram.ui.Components.z71.a(measuredWidth, measuredHeight);
        m91Var.z1 = a2;
        if (m91Var.F1) {
            setScaleX(a2);
            setScaleY(m91Var.z1);
        }
        if (m91Var.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (m91Var.c2 != measuredWidth2) {
            m91Var.b2 = false;
            if (m91Var.D1 != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / m91Var.D1.getHeight()) * r1.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    m91Var.b2 = true;
                    m91Var.a2 = (int) ((m91Var.D1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    m91Var.Y1 = measuredWidth3;
                    m91Var.Z1 = measuredWidth3;
                    m91Var.X1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.w = true;
                    m91Var.Z0();
                }
            }
            if (!m91Var.b2) {
                u(-1, -1);
                this.w = false;
            }
        }
        m91Var.c2 = measuredWidth2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.G == drawable || super.verifyDrawable(drawable);
    }
}
