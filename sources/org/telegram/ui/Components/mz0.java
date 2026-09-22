package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mz0 extends FrameLayout {
    public final pz0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public mz0(pz0 pz0Var, View view, boolean z10) {
        super(pz0Var.getContext());
        this.d = false;
        this.e = true;
        this.a = pz0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.x5.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        pz0 pz0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = pz0Var.c;
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
            pz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = pz0Var.h;
            rectF.set(f12, f12, getWidth() - pz0Var.h, (pz0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            if (!this.e) {
                rectF.right += pz0Var.f;
            }
            pz0Var.b.addRoundRect(rectF, pz0Var.c, Path.Direction.CW);
            canvas2.drawPath(pz0Var.b, pz0Var.e);
        } else {
            float f13 = pz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() - pz0Var.h, getHeight() + pz0Var.h, pz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
