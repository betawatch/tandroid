package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cc1 extends org.telegram.ui.Components.n9 {
    public Drawable C;
    public final boolean D;
    public float E;
    public float F;
    public final /* synthetic */ nc1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc1(nc1 nc1Var, Activity activity) {
        super(activity);
        this.G = nc1Var;
        this.D = true;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.C;
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
    public final void onDraw(Canvas canvas) {
        this.E = 0.0f;
        this.F = 0.0f;
        boolean z10 = this.D;
        nc1 nc1Var = this.G;
        if (z10) {
            Drawable drawable = this.C;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.nb0)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.C.draw(canvas);
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f10 = 2.0f / AndroidUtilities.density;
                    canvas.scale(f10, f10);
                    this.C.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                    this.C.draw(canvas);
                    canvas.restore();
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.C.getIntrinsicWidth(), measuredHeight / this.C.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.C.getIntrinsicWidth() * max * nc1Var.u1);
                    int ceil2 = (int) Math.ceil(this.C.getIntrinsicHeight() * max * nc1Var.u1);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    this.F = i10;
                    this.C.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                    this.C.draw(canvas);
                }
            }
        }
        if (nc1Var.W1) {
            if (!nc1Var.c.isFinished() && nc1Var.c.computeScrollOffset()) {
                if (nc1Var.c.getStartX() < nc1Var.S1 && nc1Var.c.getStartX() > 0) {
                    nc1Var.T1 = nc1Var.c.getCurrX();
                }
                nc1Var.V0();
                invalidate();
            }
            canvas.save();
            float f11 = -nc1Var.T1;
            this.E = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (nc1Var.I1) {
            float f12 = nc1Var.j1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.b.k(-16777216, (int) (f12 * 255.0f * nc1Var.k1)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        nc1 nc1Var = this.G;
        org.telegram.ui.Components.s71 s71Var = nc1Var.r1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        s71Var.getClass();
        float a2 = org.telegram.ui.Components.s71.a(measuredWidth, measuredHeight);
        nc1Var.u1 = a2;
        if (nc1Var.A1) {
            setScaleX(a2);
            setScaleY(nc1Var.u1);
        }
        if (nc1Var.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (nc1Var.X1 != measuredWidth2) {
            nc1Var.W1 = false;
            if (nc1Var.y1 != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / nc1Var.y1.getHeight()) * r1.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    nc1Var.W1 = true;
                    nc1Var.V1 = (int) ((nc1Var.y1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    nc1Var.T1 = measuredWidth3;
                    nc1Var.U1 = measuredWidth3;
                    nc1Var.S1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    nc1Var.V0();
                }
            }
            if (!nc1Var.W1) {
                s(-1, -1);
                this.v = false;
            }
        }
        nc1Var.X1 = measuredWidth2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.C = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.C == drawable || super.verifyDrawable(drawable);
    }
}
