package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a01 extends TextView {
    public final b01 a;
    public boolean b;
    public boolean c;

    public a01(b01 b01Var, CharSequence charSequence) {
        super(b01Var.getContext());
        this.a = b01Var;
        org.telegram.ui.ActionBar.f6 f6Var = b01Var.a;
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
        b01 b01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = b01Var.c;
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
            b01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = b01Var.h;
            rectF.set(f10, f10, getWidth() + b01Var.h, (b01Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            b01Var.b.addRoundRect(rectF, b01Var.c, Path.Direction.CW);
            canvas2.drawPath(b01Var.b, b01Var.d);
            canvas2.drawPath(b01Var.b, b01Var.e);
        } else {
            float f11 = b01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + b01Var.h, getHeight() + b01Var.h, b01Var.d);
            float f12 = b01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + b01Var.h, getHeight() + b01Var.h, b01Var.e);
        }
        super.onDraw(canvas2);
    }
}
