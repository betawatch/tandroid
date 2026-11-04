package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b71 extends org.telegram.ui.Components.k9 {
    public Drawable H;
    public final boolean I;
    public float J;
    public float K;
    public final /* synthetic */ l71 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b71(l71 l71Var, Activity activity) {
        super(activity);
        this.L = l71Var;
        this.I = true;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.H;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        this.J = 0.0f;
        this.K = 0.0f;
        boolean z10 = this.I;
        l71 l71Var = this.L;
        if (z10) {
            Drawable drawable = this.H;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.la0)) {
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
                    int ceil = (int) Math.ceil(this.H.getIntrinsicWidth() * max * l71Var.A1);
                    int ceil2 = (int) Math.ceil(this.H.getIntrinsicHeight() * max * l71Var.A1);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i3 = (measuredHeight - ceil2) / 2;
                    this.K = i3;
                    this.H.setBounds(measuredWidth, i3, ceil + measuredWidth, ceil2 + i3);
                    this.H.draw(canvas);
                }
            }
        }
        if (l71Var.c2) {
            if (!l71Var.c.isFinished() && l71Var.c.computeScrollOffset()) {
                if (l71Var.c.getStartX() < l71Var.Y1 && l71Var.c.getStartX() > 0) {
                    l71Var.Z1 = l71Var.c.getCurrX();
                }
                l71Var.a1();
                invalidate();
            }
            canvas.save();
            float f11 = -l71Var.Z1;
            this.J = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (l71Var.O1) {
            float f12 = l71Var.p1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f12 * 255.0f * l71Var.q1)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        l71 l71Var = this.L;
        org.telegram.ui.Components.q61 q61Var = l71Var.x1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        q61Var.getClass();
        float a10 = org.telegram.ui.Components.q61.a(measuredWidth, measuredHeight);
        l71Var.A1 = a10;
        if (l71Var.G1) {
            setScaleX(a10);
            setScaleY(l71Var.A1);
        }
        if (l71Var.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (l71Var.d2 != measuredWidth2) {
            l71Var.c2 = false;
            if (l71Var.E1 != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / l71Var.E1.getHeight()) * r1.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    l71Var.c2 = true;
                    l71Var.b2 = (int) ((l71Var.E1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    l71Var.Z1 = measuredWidth3;
                    l71Var.a2 = measuredWidth3;
                    l71Var.Y1 = measuredWidth3 * 2.0f;
                    u(measuredHeight2, getMeasuredHeight());
                    this.w = true;
                    l71Var.a1();
                }
            }
            if (!l71Var.c2) {
                u(-1, -1);
                this.w = false;
            }
        }
        l71Var.d2 = measuredWidth2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.H = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.H == drawable || super.verifyDrawable(drawable);
    }
}
