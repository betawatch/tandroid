package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class zw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ lz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(lz lzVar, Context context) {
        super(context);
        this.b = lzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lz lzVar = this.b;
        yw ywVar = lzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * lzVar.t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = lzVar.z(org.telegram.ui.ActionBar.h6.He);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ywVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (ywVar.s != null) {
            canvas.save();
            float f7 = ywVar.c0 - ywVar.d0;
            float f10 = ywVar.v;
            if (f10 > 0.0f) {
                f7 = ((ywVar.s.getX() - ywVar.getScrollX()) * ywVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            ywVar.s.draw(canvas);
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
