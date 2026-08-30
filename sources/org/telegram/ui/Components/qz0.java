package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qz0 extends FrameLayout {
    public final sz0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public qz0(sz0 sz0Var, View view, boolean z4) {
        super(sz0Var.getContext());
        this.a = sz0Var;
        setWillNotDraw(false);
        if (!z4) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, k7.b6.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4 = this.c;
        sz0 sz0Var = this.a;
        if (z4 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = sz0Var.c;
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
            sz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = sz0Var.h;
            rectF.set(f13, f13, getWidth() - sz0Var.h, (sz0Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            sz0Var.b.addRoundRect(rectF, sz0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(sz0Var.b, sz0Var.d);
            }
            canvas2.drawPath(sz0Var.b, sz0Var.e);
        } else {
            if (this.b) {
                float f14 = sz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f14, f14, getWidth() + sz0Var.h, getHeight() + sz0Var.h, sz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f15 = sz0Var.h;
            canvas2.drawRect(f15, f15, getWidth() - sz0Var.h, getHeight() + sz0Var.h, sz0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z4) {
        this.b = z4;
    }
}
