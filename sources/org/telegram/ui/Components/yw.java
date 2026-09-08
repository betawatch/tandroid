package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class yw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ kz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(kz kzVar, Context context) {
        super(context);
        this.b = kzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kz kzVar = this.b;
        xw xwVar = kzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * kzVar.t1.p();
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
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), xwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (xwVar.s != null) {
            canvas.save();
            float f7 = xwVar.c0 - xwVar.d0;
            float f10 = xwVar.v;
            if (f10 > 0.0f) {
                f7 = ((xwVar.s.getX() - xwVar.getScrollX()) * xwVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            xwVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.b.a0();
    }
}
