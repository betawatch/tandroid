package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p01 extends FrameLayout {
    public final r01 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public p01(r01 r01Var, View view, boolean z10) {
        super(r01Var.getContext());
        this.a = r01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.x5.d(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        r01 r01Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = r01Var.c;
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
            r01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = r01Var.h;
            rectF.set(f12, f12, getWidth() - r01Var.h, (r01Var.h * (this.d ? -1.0f : 1.0f)) + getHeight());
            r01Var.b.addRoundRect(rectF, r01Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(r01Var.b, r01Var.d);
            }
            canvas2.drawPath(r01Var.b, r01Var.e);
        } else {
            if (this.b) {
                float f13 = r01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + r01Var.h, getHeight() + r01Var.h, r01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = r01Var.h;
            canvas2.drawRect(f14, f14, getWidth() - r01Var.h, getHeight() + r01Var.h, r01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
