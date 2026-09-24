package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class yz0 extends TextView {
    public final zz0 a;
    public boolean b;
    public boolean c;

    public yz0(zz0 zz0Var, CharSequence charSequence) {
        super(zz0Var.getContext());
        this.a = zz0Var;
        org.telegram.ui.ActionBar.d6 d6Var = zz0Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        zz0 zz0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = zz0Var.c;
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
            zz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = zz0Var.h;
            rectF.set(f10, f10, getWidth() + zz0Var.h, (zz0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            zz0Var.b.addRoundRect(rectF, zz0Var.c, Path.Direction.CW);
            canvas2.drawPath(zz0Var.b, zz0Var.d);
            canvas2.drawPath(zz0Var.b, zz0Var.e);
        } else {
            float f11 = zz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + zz0Var.h, getHeight() + zz0Var.h, zz0Var.d);
            float f12 = zz0Var.h;
            canvas2.drawRect(f12, f12, getWidth() + zz0Var.h, getHeight() + zz0Var.h, zz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
