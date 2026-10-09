package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class q01 extends TextView {
    public final r01 a;
    public boolean b;
    public boolean c;

    public q01(r01 r01Var, CharSequence charSequence) {
        super(r01Var.getContext());
        this.a = r01Var;
        org.telegram.ui.ActionBar.e6 e6Var = r01Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        r01 r01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = r01Var.c;
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
            r01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = r01Var.h;
            rectF.set(f10, f10, getWidth() + r01Var.h, (r01Var.h * (this.c ? -1 : 1)) + getHeight());
            r01Var.b.addRoundRect(rectF, r01Var.c, Path.Direction.CW);
            canvas2.drawPath(r01Var.b, r01Var.d);
            canvas2.drawPath(r01Var.b, r01Var.e);
        } else {
            float f11 = r01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + r01Var.h, getHeight() + r01Var.h, r01Var.d);
            float f12 = r01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + r01Var.h, getHeight() + r01Var.h, r01Var.e);
        }
        super.onDraw(canvas2);
    }
}
