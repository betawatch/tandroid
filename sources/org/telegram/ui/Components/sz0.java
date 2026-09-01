package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sz0 extends TextView {
    public final tz0 a;
    public boolean b;
    public boolean c;

    public sz0(tz0 tz0Var, CharSequence charSequence) {
        super(tz0Var.getContext());
        this.a = tz0Var;
        org.telegram.ui.ActionBar.g6 g6Var = tz0Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4 = this.b;
        tz0 tz0Var = this.a;
        if (z4 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = tz0Var.c;
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
            tz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = tz0Var.h;
            rectF.set(f11, f11, getWidth() + tz0Var.h, (tz0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            tz0Var.b.addRoundRect(rectF, tz0Var.c, Path.Direction.CW);
            canvas2.drawPath(tz0Var.b, tz0Var.d);
            canvas2.drawPath(tz0Var.b, tz0Var.e);
        } else {
            float f12 = tz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + tz0Var.h, getHeight() + tz0Var.h, tz0Var.d);
            float f13 = tz0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + tz0Var.h, getHeight() + tz0Var.h, tz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
