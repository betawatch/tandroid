package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class zz0 extends TextView {
    public final a01 a;
    public boolean b;
    public boolean c;

    public zz0(a01 a01Var, CharSequence charSequence) {
        super(a01Var.getContext());
        this.a = a01Var;
        org.telegram.ui.ActionBar.f6 f6Var = a01Var.a;
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
        a01 a01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = a01Var.c;
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
            a01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = a01Var.h;
            rectF.set(f10, f10, getWidth() + a01Var.h, (a01Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            a01Var.b.addRoundRect(rectF, a01Var.c, Path.Direction.CW);
            canvas2.drawPath(a01Var.b, a01Var.d);
            canvas2.drawPath(a01Var.b, a01Var.e);
        } else {
            float f11 = a01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + a01Var.h, getHeight() + a01Var.h, a01Var.d);
            float f12 = a01Var.h;
            canvas2.drawRect(f12, f12, getWidth() + a01Var.h, getHeight() + a01Var.h, a01Var.e);
        }
        super.onDraw(canvas2);
    }
}
