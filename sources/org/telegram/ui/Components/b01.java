package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class b01 extends TextView {
    public final c01 a;
    public boolean b;
    public boolean c;

    public b01(c01 c01Var, CharSequence charSequence) {
        super(c01Var.getContext());
        this.a = c01Var;
        org.telegram.ui.ActionBar.f6 f6Var = c01Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        c01 c01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = c01Var.c;
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
            c01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = c01Var.h;
            rectF.set(f10, f10, getWidth() + c01Var.h, (c01Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            c01Var.b.addRoundRect(rectF, c01Var.c, Path.Direction.CW);
            canvas2.drawPath(c01Var.b, c01Var.d);
            canvas2.drawPath(c01Var.b, c01Var.e);
        } else {
            float f11 = c01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + c01Var.h, getHeight() + c01Var.h, c01Var.d);
            float f12 = c01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + c01Var.h, getHeight() + c01Var.h, c01Var.e);
        }
        super.onDraw(canvas2);
    }
}
