package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class xz0 extends FrameLayout {
    public final zz0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public xz0(zz0 zz0Var, View view, boolean z10) {
        super(zz0Var.getContext());
        this.a = zz0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.y5.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        zz0 zz0Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = zz0Var.c;
            boolean z11 = this.c;
            float f7 = z11 ? dp : 0.0f;
            fArr[1] = f7;
            fArr[0] = f7;
            float f10 = z11 ? dp : 0.0f;
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.d;
            float f11 = z12 ? dp : 0.0f;
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            zz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = zz0Var.h;
            rectF.set(f12, f12, getWidth() - zz0Var.h, (zz0Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            zz0Var.b.addRoundRect(rectF, zz0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(zz0Var.b, zz0Var.d);
            }
            canvas2.drawPath(zz0Var.b, zz0Var.e);
        } else {
            if (this.b) {
                float f13 = zz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + zz0Var.h, getHeight() + zz0Var.h, zz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = zz0Var.h;
            canvas2.drawRect(f14, f14, getWidth() - zz0Var.h, getHeight() + zz0Var.h, zz0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
