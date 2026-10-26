package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u01 extends FrameLayout {
    public final w01 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public u01(w01 w01Var, View view, boolean z10) {
        super(w01Var.getContext());
        this.a = w01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, gb1.g(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        w01 w01Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = w01Var.c;
            boolean z11 = this.c;
            float f7 = z11 ? dp : 0.0f;
            fArr[1] = f7;
            fArr[0] = f7;
            float f10 = z11 ? dp : 0.0f;
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.d;
            float f11 = z12 ? dp : 0.0f;
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            w01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = w01Var.h;
            rectF.set(f12, f12, getWidth() - w01Var.h, (w01Var.h * (this.d ? -1.0f : 1.0f)) + getHeight());
            w01Var.b.addRoundRect(rectF, w01Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(w01Var.b, w01Var.d);
            }
            canvas2.drawPath(w01Var.b, w01Var.e);
        } else {
            if (this.b) {
                float f13 = w01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + w01Var.h, getHeight() + w01Var.h, w01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = w01Var.h;
            canvas2.drawRect(f14, f14, getWidth() - w01Var.h, getHeight() + w01Var.h, w01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
