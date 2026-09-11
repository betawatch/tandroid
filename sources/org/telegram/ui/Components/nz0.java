package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class nz0 extends TextView {
    public final oz0 a;
    public boolean b;
    public boolean c;

    public nz0(oz0 oz0Var, CharSequence charSequence) {
        super(oz0Var.getContext());
        this.a = oz0Var;
        org.telegram.ui.ActionBar.f6 f6Var = oz0Var.a;
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
        oz0 oz0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = oz0Var.c;
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
            oz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = oz0Var.h;
            rectF.set(f10, f10, getWidth() + oz0Var.h, (oz0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            oz0Var.b.addRoundRect(rectF, oz0Var.c, Path.Direction.CW);
            canvas2.drawPath(oz0Var.b, oz0Var.d);
            canvas2.drawPath(oz0Var.b, oz0Var.e);
        } else {
            float f11 = oz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + oz0Var.h, getHeight() + oz0Var.h, oz0Var.d);
            float f12 = oz0Var.h;
            canvas2.drawRect(f12, f12, getWidth() + oz0Var.h, getHeight() + oz0Var.h, oz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
