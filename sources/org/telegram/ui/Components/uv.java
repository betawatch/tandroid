package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uv extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ gy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(gy gyVar, Context context) {
        super(context);
        this.b = gyVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        gy gyVar = this.b;
        tv tvVar = gyVar.B0;
        float L = org.telegram.messenger.g0.L(50.0f) * gyVar.t1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z9 = gyVar.z(org.telegram.ui.ActionBar.m6.wf);
        Paint paint = this.a;
        paint.setColor(z9);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), tvVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (tvVar.s != null) {
            canvas.save();
            float f10 = tvVar.c0 - tvVar.d0;
            float f11 = tvVar.w;
            if (f11 > 0.0f) {
                f10 = ((tvVar.s.getX() - tvVar.getScrollX()) * tvVar.w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            tvVar.s.draw(canvas);
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
