package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ww extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ mz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(mz mzVar, Context context) {
        super(context);
        this.b = mzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mz mzVar = this.b;
        vw vwVar = mzVar.y0;
        float dp = AndroidUtilities.dp(50.0f) * mzVar.q1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = mzVar.A(org.telegram.ui.ActionBar.k6.He);
        Paint paint = this.a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), vwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (vwVar.s != null) {
            canvas.save();
            float f10 = vwVar.W - vwVar.a0;
            float f11 = vwVar.v;
            if (f11 > 0.0f) {
                f10 = ((vwVar.s.getX() - vwVar.getScrollX()) * vwVar.v) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            vwVar.s.draw(canvas);
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
