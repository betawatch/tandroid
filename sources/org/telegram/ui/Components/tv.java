package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tv extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ ey b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(ey eyVar, Context context) {
        super(context);
        this.b = eyVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ey eyVar = this.b;
        sv svVar = eyVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * eyVar.u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = eyVar.z(org.telegram.ui.ActionBar.k6.wf);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), svVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (svVar.s != null) {
            canvas.save();
            float f10 = svVar.d0 - svVar.e0;
            float f11 = svVar.w;
            if (f11 > 0.0f) {
                f10 = ((svVar.s.getX() - svVar.getScrollX()) * svVar.w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            svVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.b.Z();
    }
}
