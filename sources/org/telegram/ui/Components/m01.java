package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m01 extends TextView {
    public final n01 a;
    public boolean b;
    public boolean c;

    public m01(n01 n01Var, CharSequence charSequence) {
        super(n01Var.getContext());
        this.a = n01Var;
        org.telegram.ui.ActionBar.c6 c6Var = n01Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        n01 n01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = n01Var.c;
            float f7 = this.b ? dp : 0.0f;
            fArr[1] = f7;
            fArr[0] = f7;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            n01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = n01Var.h;
            rectF.set(f10, f10, getWidth() + n01Var.h, (n01Var.h * (this.c ? -1 : 1)) + getHeight());
            n01Var.b.addRoundRect(rectF, n01Var.c, Path.Direction.CW);
            canvas2.drawPath(n01Var.b, n01Var.d);
            canvas2.drawPath(n01Var.b, n01Var.e);
        } else {
            float f11 = n01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + n01Var.h, getHeight() + n01Var.h, n01Var.d);
            float f12 = n01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + n01Var.h, getHeight() + n01Var.h, n01Var.e);
        }
        super.onDraw(canvas2);
    }
}
