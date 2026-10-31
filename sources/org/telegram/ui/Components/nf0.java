package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nf0 extends tk0 {
    public final rf.w e3;
    public long f3;
    public final /* synthetic */ tf0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf0(tf0 tf0Var, Context context) {
        super(context, null);
        this.g3 = tf0Var;
        this.e3 = new rf.w(8);
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.g3.v1 + org.telegram.messenger.i0.m));
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        tf0 tf0Var = this.g3;
        if (tf0Var.C1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f3 = elapsedRealtime;
            tf0Var.A1 += (abs * tf0Var.B1) / 1800.0f;
            while (true) {
                f7 = tf0Var.A1;
                float f10 = tf0Var.B1 * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    tf0Var.A1 = f7 - f10;
                }
            }
            tf0Var.z1.setTranslate(f7, 0.0f);
            tf0Var.y1.setLocalMatrix(tf0Var.z1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        rf.w wVar = this.e3;
        wVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        wVar.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i5, this.n2));
        wVar.draw(canvas);
    }
}
