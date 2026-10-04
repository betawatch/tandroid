package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class j01 extends TextView {
    public final k01 a;
    public boolean b;
    public boolean c;

    public j01(k01 k01Var, CharSequence charSequence) {
        super(k01Var.getContext());
        this.a = k01Var;
        org.telegram.ui.ActionBar.d6 d6Var = k01Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        k01 k01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = k01Var.c;
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
            k01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = k01Var.h;
            rectF.set(f10, f10, getWidth() + k01Var.h, (k01Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            k01Var.b.addRoundRect(rectF, k01Var.c, Path.Direction.CW);
            canvas2.drawPath(k01Var.b, k01Var.d);
            canvas2.drawPath(k01Var.b, k01Var.e);
        } else {
            float f11 = k01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + k01Var.h, getHeight() + k01Var.h, k01Var.d);
            float f12 = k01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + k01Var.h, getHeight() + k01Var.h, k01Var.e);
        }
        super.onDraw(canvas2);
    }
}
