package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fz0 extends FrameLayout {
    public final hz0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public fz0(hz0 hz0Var, View view, boolean z10) {
        super(hz0Var.getContext());
        this.a = hz0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, i7.f6.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.c;
        hz0 hz0Var = this.a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = hz0Var.c;
            boolean z11 = this.c;
            float f9 = z11 ? dp : 0.0f;
            fArr[1] = f9;
            fArr[0] = f9;
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
            hz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = hz0Var.h;
            rectF.set(f12, f12, getWidth() - hz0Var.h, (hz0Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            hz0Var.b.addRoundRect(rectF, hz0Var.c, Path.Direction.CW);
            if (this.b) {
                canvas2.drawPath(hz0Var.b, hz0Var.d);
            }
            canvas2.drawPath(hz0Var.b, hz0Var.e);
        } else {
            if (this.b) {
                float f13 = hz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f13, f13, getWidth() + hz0Var.h, getHeight() + hz0Var.h, hz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f14 = hz0Var.h;
            canvas2.drawRect(f14, f14, getWidth() - hz0Var.h, getHeight() + hz0Var.h, hz0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.b = z10;
    }
}
