package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ax extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ mz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(mz mzVar, Context context) {
        super(context);
        this.b = mzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mz mzVar = this.b;
        zw zwVar = mzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * mzVar.t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = mzVar.z(org.telegram.ui.ActionBar.h6.He);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), zwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (zwVar.s != null) {
            canvas.save();
            float f7 = zwVar.c0 - zwVar.d0;
            float f10 = zwVar.v;
            if (f10 > 0.0f) {
                f7 = ((zwVar.s.getX() - zwVar.getScrollX()) * zwVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            zwVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.b.Y();
    }
}
