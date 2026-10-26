package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v01 extends TextView {
    public final w01 a;
    public boolean b;
    public boolean c;

    public v01(w01 w01Var, CharSequence charSequence) {
        super(w01Var.getContext());
        this.a = w01Var;
        org.telegram.ui.ActionBar.u6 u6Var = w01Var.a;
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
        w01 w01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = w01Var.c;
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
            w01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = w01Var.h;
            rectF.set(f10, f10, getWidth() + w01Var.h, (w01Var.h * (this.c ? -1 : 1)) + getHeight());
            w01Var.b.addRoundRect(rectF, w01Var.c, Path.Direction.CW);
            canvas2.drawPath(w01Var.b, w01Var.d);
            canvas2.drawPath(w01Var.b, w01Var.e);
        } else {
            float f11 = w01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + w01Var.h, getHeight() + w01Var.h, w01Var.d);
            float f12 = w01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + w01Var.h, getHeight() + w01Var.h, w01Var.e);
        }
        super.onDraw(canvas2);
    }
}
