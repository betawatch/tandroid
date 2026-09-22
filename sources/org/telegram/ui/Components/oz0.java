package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class oz0 extends TextView {
    public final pz0 a;
    public boolean b;
    public boolean c;

    public oz0(pz0 pz0Var, CharSequence charSequence) {
        super(pz0Var.getContext());
        this.a = pz0Var;
        org.telegram.ui.ActionBar.e6 e6Var = pz0Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        pz0 pz0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = pz0Var.c;
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
            pz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = pz0Var.h;
            rectF.set(f10, f10, getWidth() + pz0Var.h, (pz0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            pz0Var.b.addRoundRect(rectF, pz0Var.c, Path.Direction.CW);
            canvas2.drawPath(pz0Var.b, pz0Var.d);
            canvas2.drawPath(pz0Var.b, pz0Var.e);
        } else {
            float f11 = pz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + pz0Var.h, getHeight() + pz0Var.h, pz0Var.d);
            float f12 = pz0Var.h;
            canvas2.drawRect(f12, f12, getWidth() + pz0Var.h, getHeight() + pz0Var.h, pz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
