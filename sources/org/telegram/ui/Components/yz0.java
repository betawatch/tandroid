package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class yz0 extends FrameLayout {
    public final a01 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public yz0(a01 a01Var, View view, boolean z10) {
        super(a01Var.getContext());
        this.a = a01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.y5.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        a01 a01Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = a01Var.c;
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
            a01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = a01Var.h;
            rectF.set(f12, f12, getWidth() - a01Var.h, (a01Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            a01Var.b.addRoundRect(rectF, a01Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(a01Var.b, a01Var.d);
            }
            canvas2.drawPath(a01Var.b, a01Var.e);
        } else {
            if (this.b) {
                float f13 = a01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + a01Var.h, getHeight() + a01Var.h, a01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = a01Var.h;
            canvas2.drawRect(f14, f14, getWidth() - a01Var.h, getHeight() + a01Var.h, a01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
