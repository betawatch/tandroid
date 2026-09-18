package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pz0 extends TextView {
    public final qz0 a;
    public boolean b;
    public boolean c;

    public pz0(qz0 qz0Var, CharSequence charSequence) {
        super(qz0Var.getContext());
        this.a = qz0Var;
        org.telegram.ui.ActionBar.f6 f6Var = qz0Var.a;
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
        qz0 qz0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = qz0Var.c;
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
            qz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = qz0Var.h;
            rectF.set(f10, f10, getWidth() + qz0Var.h, (qz0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            qz0Var.b.addRoundRect(rectF, qz0Var.c, Path.Direction.CW);
            canvas2.drawPath(qz0Var.b, qz0Var.d);
            canvas2.drawPath(qz0Var.b, qz0Var.e);
        } else {
            float f11 = qz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f11, f11, getWidth() + qz0Var.h, getHeight() + qz0Var.h, qz0Var.d);
            float f12 = qz0Var.h;
            canvas2.drawRect(f12, f12, getWidth() + qz0Var.h, getHeight() + qz0Var.h, qz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
