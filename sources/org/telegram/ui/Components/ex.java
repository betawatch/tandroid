package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ex extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ sz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(sz szVar, Context context) {
        super(context);
        this.b = szVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sz szVar = this.b;
        dx dxVar = szVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * szVar.t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = szVar.A(org.telegram.ui.ActionBar.y6.He);
        Paint paint = this.a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), dxVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (dxVar.s != null) {
            canvas.save();
            float f7 = dxVar.c0 - dxVar.d0;
            float f10 = dxVar.v;
            if (f10 > 0.0f) {
                f7 = ((dxVar.s.getX() - dxVar.getScrollX()) * dxVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            dxVar.s.draw(canvas);
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
