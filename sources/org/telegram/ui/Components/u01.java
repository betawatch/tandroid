package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u01 extends FrameLayout {
    public final x01 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public u01(x01 x01Var, View view, boolean z10) {
        super(x01Var.getContext());
        this.d = false;
        this.e = true;
        this.a = x01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, kb1.g(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        x01 x01Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = x01Var.c;
            boolean z11 = this.b;
            float f7 = (z11 && this.d) ? dp : 0.0f;
            fArr[1] = f7;
            fArr[0] = f7;
            float f10 = (z11 && this.e) ? dp : 0.0f;
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.c;
            float f11 = (z12 && this.e) ? dp : 0.0f;
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12 || !this.d) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            x01Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = x01Var.h;
            rectF.set(f12, f12, getWidth() - x01Var.h, (x01Var.h * (this.c ? -1.0f : 1.0f)) + getHeight());
            if (!this.e) {
                rectF.right += x01Var.f;
            }
            x01Var.b.addRoundRect(rectF, x01Var.c, Path.Direction.CW);
            canvas2.drawPath(x01Var.b, x01Var.e);
        } else {
            float f13 = x01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() - x01Var.h, getHeight() + x01Var.h, x01Var.e);
        }
        super.onDraw(canvas2);
    }
}
