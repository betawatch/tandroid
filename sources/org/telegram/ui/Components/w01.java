package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w01 extends TextView {
    public final x01 a;
    public boolean b;
    public boolean c;

    public w01(x01 x01Var, CharSequence charSequence) {
        super(x01Var.getContext());
        this.a = x01Var;
        org.telegram.ui.ActionBar.u6 u6Var = x01Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        org.telegram.ui.ActionBar.f7.V(this, org.telegram.ui.ActionBar.y6.G6, u6Var);
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        x01 x01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = x01Var.c;
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
            x01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = x01Var.h;
            rectF.set(f10, f10, getWidth() + x01Var.h, (x01Var.h * (this.c ? -1 : 1)) + getHeight());
            x01Var.b.addRoundRect(rectF, x01Var.c, Path.Direction.CW);
            canvas2.drawPath(x01Var.b, x01Var.d);
            canvas2.drawPath(x01Var.b, x01Var.e);
        } else {
            float f11 = x01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + x01Var.h, getHeight() + x01Var.h, x01Var.d);
            float f12 = x01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + x01Var.h, getHeight() + x01Var.h, x01Var.e);
        }
        super.onDraw(canvas2);
    }
}
