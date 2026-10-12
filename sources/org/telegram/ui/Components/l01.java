package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class l01 extends FrameLayout {
    public final n01 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public l01(n01 n01Var, View view, boolean z10) {
        super(n01Var.getContext());
        this.a = n01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.a6.d(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        n01 n01Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = n01Var.c;
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
            n01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = n01Var.h;
            rectF.set(f12, f12, getWidth() - n01Var.h, (n01Var.h * (this.d ? -1.0f : 1.0f)) + getHeight());
            n01Var.b.addRoundRect(rectF, n01Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(n01Var.b, n01Var.d);
            }
            canvas2.drawPath(n01Var.b, n01Var.e);
        } else {
            if (this.b) {
                float f13 = n01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + n01Var.h, getHeight() + n01Var.h, n01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = n01Var.h;
            canvas2.drawRect(f14, f14, getWidth() - n01Var.h, getHeight() + n01Var.h, n01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
