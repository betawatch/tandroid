package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout {
    public final /* synthetic */ int a;
    public RectF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.i2);
                break;
            default:
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.i2);
                break;
        }
    }
}
