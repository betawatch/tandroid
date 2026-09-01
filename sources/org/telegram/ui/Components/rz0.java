package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rz0 extends FrameLayout {
    public final tz0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public rz0(tz0 tz0Var, View view, boolean z4) {
        super(tz0Var.getContext());
        this.a = tz0Var;
        setWillNotDraw(false);
        if (!z4) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, k7.c6.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4 = this.c;
        tz0 tz0Var = this.a;
        if (z4 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = tz0Var.c;
            boolean z10 = this.c;
            float f10 = z10 ? dp : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = z10 ? dp : 0.0f;
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z11 = this.d;
            float f12 = z11 ? dp : 0.0f;
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z11) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            tz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = tz0Var.h;
            rectF.set(f13, f13, getWidth() - tz0Var.h, (tz0Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            tz0Var.b.addRoundRect(rectF, tz0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(tz0Var.b, tz0Var.d);
            }
            canvas2.drawPath(tz0Var.b, tz0Var.e);
        } else {
            if (this.b) {
                float f14 = tz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f14, f14, getWidth() + tz0Var.h, getHeight() + tz0Var.h, tz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f15 = tz0Var.h;
            canvas2.drawRect(f15, f15, getWidth() - tz0Var.h, getHeight() + tz0Var.h, tz0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z4) {
        this.b = z4;
    }
}
