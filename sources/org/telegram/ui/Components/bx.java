package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class bx extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ nz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(nz nzVar, Context context) {
        super(context);
        this.b = nzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        nz nzVar = this.b;
        ax axVar = nzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * nzVar.t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = nzVar.z(org.telegram.ui.ActionBar.i6.He);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), axVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (axVar.s != null) {
            canvas.save();
            float f7 = axVar.c0 - axVar.d0;
            float f10 = axVar.v;
            if (f10 > 0.0f) {
                f7 = ((axVar.s.getX() - axVar.getScrollX()) * axVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            axVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.b.X();
    }
}
