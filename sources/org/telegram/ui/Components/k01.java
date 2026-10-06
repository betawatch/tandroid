package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class k01 extends TextView {
    public final l01 a;
    public boolean b;
    public boolean c;

    public k01(l01 l01Var, CharSequence charSequence) {
        super(l01Var.getContext());
        this.a = l01Var;
        org.telegram.ui.ActionBar.d6 d6Var = l01Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        l01 l01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = l01Var.c;
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
            l01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = l01Var.h;
            rectF.set(f10, f10, getWidth() + l01Var.h, (l01Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            l01Var.b.addRoundRect(rectF, l01Var.c, Path.Direction.CW);
            canvas2.drawPath(l01Var.b, l01Var.d);
            canvas2.drawPath(l01Var.b, l01Var.e);
        } else {
            float f11 = l01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + l01Var.h, getHeight() + l01Var.h, l01Var.d);
            float f12 = l01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + l01Var.h, getHeight() + l01Var.h, l01Var.e);
        }
        super.onDraw(canvas2);
    }
}
