package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ yy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(yy yyVar, Context context) {
        super(context);
        this.b = yyVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        yy yyVar = this.b;
        iw iwVar = yyVar.x0;
        float dp = AndroidUtilities.dp(50.0f) * yyVar.p1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int B = yyVar.B(org.telegram.ui.ActionBar.g6.He);
        Paint paint = this.a;
        paint.setColor(B);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), iwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (iwVar.s != null) {
            canvas.save();
            float f10 = iwVar.V - iwVar.W;
            float f11 = iwVar.v;
            if (f11 > 0.0f) {
                f10 = ((iwVar.s.getX() - iwVar.getScrollX()) * iwVar.v) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            iwVar.s.draw(canvas);
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
