package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ kz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(kz kzVar, Context context) {
        super(context);
        this.b = kzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kz kzVar = this.b;
        tw twVar = kzVar.y0;
        float dp = AndroidUtilities.dp(50.0f) * kzVar.q1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = kzVar.A(org.telegram.ui.ActionBar.j6.He);
        Paint paint = this.a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), twVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (twVar.s != null) {
            canvas.save();
            float f10 = twVar.W - twVar.a0;
            float f11 = twVar.v;
            if (f11 > 0.0f) {
                f10 = ((twVar.s.getX() - twVar.getScrollX()) * twVar.v) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            twVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.b.a0();
    }
}
