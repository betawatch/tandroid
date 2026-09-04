package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class mz0 extends FrameLayout {
    public final oz0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public mz0(oz0 oz0Var, View view, boolean z10) {
        super(oz0Var.getContext());
        this.a = oz0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.x5.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        oz0 oz0Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = oz0Var.c;
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
            oz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = oz0Var.h;
            rectF.set(f12, f12, getWidth() - oz0Var.h, (oz0Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            oz0Var.b.addRoundRect(rectF, oz0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(oz0Var.b, oz0Var.d);
            }
            canvas2.drawPath(oz0Var.b, oz0Var.e);
        } else {
            if (this.b) {
                float f13 = oz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + oz0Var.h, getHeight() + oz0Var.h, oz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = oz0Var.h;
            canvas2.drawRect(f14, f14, getWidth() - oz0Var.h, getHeight() + oz0Var.h, oz0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
