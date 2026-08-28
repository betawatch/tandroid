package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vy0 extends TextView {
    public final wy0 a;
    public boolean b;
    public boolean c;

    public vy0(wy0 wy0Var, CharSequence charSequence) {
        super(wy0Var.getContext());
        this.a = wy0Var;
        org.telegram.ui.ActionBar.b6 b6Var = wy0Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        wy0 wy0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = wy0Var.c;
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
            wy0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = wy0Var.h;
            rectF.set(f11, f11, getWidth() + wy0Var.h, (wy0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            wy0Var.b.addRoundRect(rectF, wy0Var.c, Path.Direction.CW);
            canvas2.drawPath(wy0Var.b, wy0Var.d);
            canvas2.drawPath(wy0Var.b, wy0Var.e);
        } else {
            float f12 = wy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.d);
            float f13 = wy0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + wy0Var.h, getHeight() + wy0Var.h, wy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
