package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xy0 extends TextView {
    public final yy0 a;
    public boolean b;
    public boolean c;

    public xy0(yy0 yy0Var, CharSequence charSequence) {
        super(yy0Var.getContext());
        this.a = yy0Var;
        org.telegram.ui.ActionBar.c6 c6Var = yy0Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        yy0 yy0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = yy0Var.c;
            float f10 = this.b ? dp : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            yy0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = yy0Var.h;
            rectF.set(f11, f11, getWidth() + yy0Var.h, (yy0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            yy0Var.b.addRoundRect(rectF, yy0Var.c, Path.Direction.CW);
            canvas2.drawPath(yy0Var.b, yy0Var.d);
            canvas2.drawPath(yy0Var.b, yy0Var.e);
        } else {
            float f12 = yy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + yy0Var.h, getHeight() + yy0Var.h, yy0Var.d);
            float f13 = yy0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + yy0Var.h, getHeight() + yy0Var.h, yy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
