package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nx extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ a00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(a00 a00Var, Context context) {
        super(context);
        this.b = a00Var;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a00 a00Var = this.b;
        mx mxVar = a00Var.B0;
        float dp = AndroidUtilities.dp(50.0f) * a00Var.t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int B = a00Var.B(org.telegram.ui.ActionBar.i6.He);
        Paint paint = this.a;
        paint.setColor(B);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), mxVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (mxVar.s != null) {
            canvas.save();
            float f7 = mxVar.c0 - mxVar.d0;
            float f10 = mxVar.v;
            if (f10 > 0.0f) {
                f7 = ((mxVar.s.getX() - mxVar.getScrollX()) * mxVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            mxVar.s.draw(canvas);
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
