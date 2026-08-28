package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ty0 extends FrameLayout {
    public final wy0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public ty0(wy0 wy0Var, View view, boolean z10) {
        super(wy0Var.getContext());
        this.d = false;
        this.e = true;
        this.a = wy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, g7.e6.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.b;
        wy0 wy0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = wy0Var.c;
            boolean z11 = this.b;
            float f10 = (z11 && this.d) ? dp : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = (z11 && this.e) ? dp : 0.0f;
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.c;
            float f12 = (z12 && this.e) ? dp : 0.0f;
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12 || !this.d) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            wy0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = wy0Var.h;
            rectF.set(f13, f13, getWidth() - wy0Var.h, (wy0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            if (!this.e) {
                rectF.right += wy0Var.f;
            }
            wy0Var.b.addRoundRect(rectF, wy0Var.c, Path.Direction.CW);
            canvas2.drawPath(wy0Var.b, wy0Var.e);
        } else {
            float f14 = wy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f14, f14, getWidth() - wy0Var.h, getHeight() + wy0Var.h, wy0Var.e);
        }
        super.onDraw(canvas2);
    }
}
