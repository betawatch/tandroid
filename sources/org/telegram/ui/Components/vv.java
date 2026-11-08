package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class vv extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ hy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(hy hyVar, Context context) {
        super(context);
        this.b = hyVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        hy hyVar = this.b;
        uv uvVar = hyVar.B0;
        float L = org.telegram.messenger.g0.L(50.0f) * hyVar.t1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z9 = hyVar.z(org.telegram.ui.ActionBar.k6.wf);
        Paint paint = this.a;
        paint.setColor(z9);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), uvVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (uvVar.s != null) {
            canvas.save();
            float f10 = uvVar.c0 - uvVar.d0;
            float f11 = uvVar.w;
            if (f11 > 0.0f) {
                f10 = ((uvVar.s.getX() - uvVar.getScrollX()) * uvVar.w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            uvVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.b.Z();
    }
}
