package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class j01 extends FrameLayout {
    public final l01 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public j01(l01 l01Var, View view, boolean z10) {
        super(l01Var.getContext());
        this.a = l01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.z5.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        l01 l01Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = l01Var.c;
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
            l01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = l01Var.h;
            rectF.set(f12, f12, getWidth() - l01Var.h, (l01Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            l01Var.b.addRoundRect(rectF, l01Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(l01Var.b, l01Var.d);
            }
            canvas2.drawPath(l01Var.b, l01Var.e);
        } else {
            if (this.b) {
                float f13 = l01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + l01Var.h, getHeight() + l01Var.h, l01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = l01Var.h;
            canvas2.drawRect(f14, f14, getWidth() - l01Var.h, getHeight() + l01Var.h, l01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
