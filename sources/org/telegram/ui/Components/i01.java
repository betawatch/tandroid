package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class i01 extends TextView {
    public final j01 a;
    public boolean b;
    public boolean c;

    public i01(j01 j01Var, CharSequence charSequence) {
        super(j01Var.getContext());
        this.a = j01Var;
        org.telegram.ui.ActionBar.d6 d6Var = j01Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        j01 j01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = j01Var.c;
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
            j01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = j01Var.h;
            rectF.set(f10, f10, getWidth() + j01Var.h, (j01Var.h * (this.c ? -1 : 1)) + getHeight());
            j01Var.b.addRoundRect(rectF, j01Var.c, Path.Direction.CW);
            canvas2.drawPath(j01Var.b, j01Var.d);
            canvas2.drawPath(j01Var.b, j01Var.e);
        } else {
            float f11 = j01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + j01Var.h, getHeight() + j01Var.h, j01Var.d);
            float f12 = j01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + j01Var.h, getHeight() + j01Var.h, j01Var.e);
        }
        super.onDraw(canvas2);
    }
}
