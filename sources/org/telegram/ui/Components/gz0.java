package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gz0 extends TextView {
    public final hz0 a;
    public boolean b;
    public boolean c;

    public gz0(hz0 hz0Var, CharSequence charSequence) {
        super(hz0Var.getContext());
        this.a = hz0Var;
        org.telegram.ui.ActionBar.c6 c6Var = hz0Var.a;
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
        hz0 hz0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = hz0Var.c;
            float f9 = this.b ? dp : 0.0f;
            fArr[1] = f9;
            fArr[0] = f9;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            hz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = hz0Var.h;
            rectF.set(f10, f10, getWidth() + hz0Var.h, (hz0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            hz0Var.b.addRoundRect(rectF, hz0Var.c, Path.Direction.CW);
            canvas2.drawPath(hz0Var.b, hz0Var.d);
            canvas2.drawPath(hz0Var.b, hz0Var.e);
        } else {
            float f11 = hz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + hz0Var.h, getHeight() + hz0Var.h, hz0Var.d);
            float f12 = hz0Var.h;
            canvas2.drawRect(f12, f12, getWidth() + hz0Var.h, getHeight() + hz0Var.h, hz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
