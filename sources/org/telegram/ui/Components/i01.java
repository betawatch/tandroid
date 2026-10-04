package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class i01 extends FrameLayout {
    public final k01 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public i01(k01 k01Var, View view, boolean z10) {
        super(k01Var.getContext());
        this.a = k01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.z5.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        k01 k01Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = k01Var.c;
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
            k01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = k01Var.h;
            rectF.set(f12, f12, getWidth() - k01Var.h, (k01Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            k01Var.b.addRoundRect(rectF, k01Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(k01Var.b, k01Var.d);
            }
            canvas2.drawPath(k01Var.b, k01Var.e);
        } else {
            if (this.b) {
                float f13 = k01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + k01Var.h, getHeight() + k01Var.h, k01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = k01Var.h;
            canvas2.drawRect(f14, f14, getWidth() - k01Var.h, getHeight() + k01Var.h, k01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
