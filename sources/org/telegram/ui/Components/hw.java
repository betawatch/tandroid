package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ vy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(vy vyVar, Context context) {
        super(context);
        this.b = vyVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vy vyVar = this.b;
        gw gwVar = vyVar.B0;
        float L = org.telegram.messenger.i0.L(50.0f) * vyVar.t1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = vyVar.A(org.telegram.ui.ActionBar.t6.wf);
        Paint paint = this.a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gwVar.getExpandedOffset() + org.telegram.messenger.i0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (gwVar.s != null) {
            canvas.save();
            float f7 = gwVar.c0 - gwVar.d0;
            float f10 = gwVar.w;
            if (f10 > 0.0f) {
                f7 = ((gwVar.s.getX() - gwVar.getScrollX()) * gwVar.w) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            gwVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.b.Z();
    }
}
