package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rz0 extends TextView {
    public final sz0 a;
    public boolean b;
    public boolean c;

    public rz0(sz0 sz0Var, CharSequence charSequence) {
        super(sz0Var.getContext());
        this.a = sz0Var;
        org.telegram.ui.ActionBar.g6 g6Var = sz0Var.a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4 = this.b;
        sz0 sz0Var = this.a;
        if (z4 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = sz0Var.c;
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
            sz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f11 = sz0Var.h;
            rectF.set(f11, f11, getWidth() + sz0Var.h, (sz0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            sz0Var.b.addRoundRect(rectF, sz0Var.c, Path.Direction.CW);
            canvas2.drawPath(sz0Var.b, sz0Var.d);
            canvas2.drawPath(sz0Var.b, sz0Var.e);
        } else {
            float f12 = sz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + sz0Var.h, getHeight() + sz0Var.h, sz0Var.d);
            float f13 = sz0Var.h;
            canvas2.drawRect(f13, f13, getWidth() + sz0Var.h, getHeight() + sz0Var.h, sz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
