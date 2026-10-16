package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class n01 extends TextView {
    public final o01 a;
    public boolean b;
    public boolean c;

    public n01(o01 o01Var, CharSequence charSequence) {
        super(o01Var.getContext());
        this.a = o01Var;
        org.telegram.ui.ActionBar.c6 c6Var = o01Var.a;
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
        o01 o01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = o01Var.c;
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
            o01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = o01Var.h;
            rectF.set(f10, f10, getWidth() + o01Var.h, (o01Var.h * (this.c ? -1 : 1)) + getHeight());
            o01Var.b.addRoundRect(rectF, o01Var.c, Path.Direction.CW);
            canvas2.drawPath(o01Var.b, o01Var.d);
            canvas2.drawPath(o01Var.b, o01Var.e);
        } else {
            float f11 = o01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + o01Var.h, getHeight() + o01Var.h, o01Var.d);
            float f12 = o01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + o01Var.h, getHeight() + o01Var.h, o01Var.e);
        }
        super.onDraw(canvas2);
    }
}
