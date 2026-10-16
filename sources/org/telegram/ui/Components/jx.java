package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jx extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ wz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(wz wzVar, Context context) {
        super(context);
        this.b = wzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wz wzVar = this.b;
        ix ixVar = wzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * wzVar.t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int B = wzVar.B(org.telegram.ui.ActionBar.g6.He);
        Paint paint = this.a;
        paint.setColor(B);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ixVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (ixVar.s != null) {
            canvas.save();
            float f7 = ixVar.c0 - ixVar.d0;
            float f10 = ixVar.v;
            if (f10 > 0.0f) {
                f7 = ((ixVar.s.getX() - ixVar.getScrollX()) * ixVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            ixVar.s.draw(canvas);
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
