package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wy0 extends FrameLayout {
    public final yy0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public wy0(yy0 yy0Var, View view, boolean z10) {
        super(yy0Var.getContext());
        this.a = yy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, h7.z5.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        yy0 yy0Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = yy0Var.c;
            boolean z11 = this.c;
            float f10 = z11 ? dp : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = z11 ? dp : 0.0f;
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.d;
            float f12 = z12 ? dp : 0.0f;
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            yy0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = yy0Var.h;
            rectF.set(f13, f13, getWidth() - yy0Var.h, (yy0Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            yy0Var.b.addRoundRect(rectF, yy0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(yy0Var.b, yy0Var.d);
            }
            canvas2.drawPath(yy0Var.b, yy0Var.e);
        } else {
            if (this.b) {
                float f14 = yy0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f14, f14, getWidth() + yy0Var.h, getHeight() + yy0Var.h, yy0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f15 = yy0Var.h;
            canvas2.drawRect(f15, f15, getWidth() - yy0Var.h, getHeight() + yy0Var.h, yy0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
