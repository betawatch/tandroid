package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ kz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(kz kzVar, Context context) {
        super(context);
        this.b = kzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kz kzVar = this.b;
        ww wwVar = kzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * kzVar.t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = kzVar.z(org.telegram.ui.ActionBar.i6.He);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), wwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (wwVar.s != null) {
            canvas.save();
            float f7 = wwVar.c0 - wwVar.d0;
            float f10 = wwVar.v;
            if (f10 > 0.0f) {
                f7 = ((wwVar.s.getX() - wwVar.getScrollX()) * wwVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            wwVar.s.draw(canvas);
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
