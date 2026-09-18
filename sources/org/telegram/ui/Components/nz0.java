package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class nz0 extends FrameLayout {
    public final qz0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public nz0(qz0 qz0Var, View view, boolean z10) {
        super(qz0Var.getContext());
        this.d = false;
        this.e = true;
        this.a = qz0Var;
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
        qz0 qz0Var = this.a;
        if (z10 || this.c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = qz0Var.c;
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
            qz0Var.b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = qz0Var.h;
            rectF.set(f12, f12, getWidth() - qz0Var.h, (qz0Var.h * AndroidUtilities.dp(this.c ? -1.0f : 1.0f)) + getHeight());
            if (!this.e) {
                rectF.right += qz0Var.f;
            }
            qz0Var.b.addRoundRect(rectF, qz0Var.c, Path.Direction.CW);
            canvas2.drawPath(qz0Var.b, qz0Var.e);
        } else {
            float f13 = qz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() - qz0Var.h, getHeight() + qz0Var.h, qz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
