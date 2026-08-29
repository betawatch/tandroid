package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fc1 extends org.telegram.ui.Components.t9 {
    public Drawable C;
    public final boolean D;
    public float E;
    public float F;
    public final /* synthetic */ qc1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc1(qc1 qc1Var, Activity activity) {
        super(activity);
        this.G = qc1Var;
        this.D = true;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.C;
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDraw(Canvas canvas) {
        this.E = 0.0f;
        this.F = 0.0f;
        boolean z10 = this.D;
        qc1 qc1Var = this.G;
        if (z10) {
            Drawable drawable = this.C;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.yb0)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.C.draw(canvas);
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f9 = 2.0f / AndroidUtilities.density;
                    canvas.scale(f9, f9);
                    this.C.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f9), (int) Math.ceil(getMeasuredHeight() / f9));
                    this.C.draw(canvas);
                    canvas.restore();
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.C.getIntrinsicWidth(), measuredHeight / this.C.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.C.getIntrinsicWidth() * max * qc1Var.u1);
                    int ceil2 = (int) Math.ceil(this.C.getIntrinsicHeight() * max * qc1Var.u1);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    this.F = i10;
                    this.C.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                    this.C.draw(canvas);
                }
            }
        }
        if (qc1Var.W1) {
            if (!qc1Var.c.isFinished() && qc1Var.c.computeScrollOffset()) {
                if (qc1Var.c.getStartX() < qc1Var.S1 && qc1Var.c.getStartX() > 0) {
                    qc1Var.T1 = qc1Var.c.getCurrX();
                }
                qc1Var.V0();
                invalidate();
            }
            canvas.save();
            float f10 = -qc1Var.T1;
            this.E = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (qc1Var.I1) {
            float f11 = qc1Var.j1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.a.k(-16777216, (int) (f11 * 255.0f * qc1Var.k1)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        qc1 qc1Var = this.G;
        org.telegram.ui.Components.c81 c81Var = qc1Var.r1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        c81Var.getClass();
        float a2 = org.telegram.ui.Components.c81.a(measuredWidth, measuredHeight);
        qc1Var.u1 = a2;
        if (qc1Var.A1) {
            setScaleX(a2);
            setScaleY(qc1Var.u1);
        }
        if (qc1Var.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (qc1Var.X1 != measuredWidth2) {
            qc1Var.W1 = false;
            if (qc1Var.y1 != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / qc1Var.y1.getHeight()) * r1.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    qc1Var.W1 = true;
                    qc1Var.V1 = (int) ((qc1Var.y1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    qc1Var.T1 = measuredWidth3;
                    qc1Var.U1 = measuredWidth3;
                    qc1Var.S1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    qc1Var.V0();
                }
            }
            if (!qc1Var.W1) {
                s(-1, -1);
                this.v = false;
            }
        }
        qc1Var.X1 = measuredWidth2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.C = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.C == drawable || super.verifyDrawable(drawable);
    }
}
