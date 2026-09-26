package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class n extends u00 {
    public final Paint U;
    public final /* synthetic */ u V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, Context context) {
        super(context, null);
        this.V = uVar;
        this.U = new Paint();
    }

    @Override // org.telegram.ui.Components.u00
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.u00, android.view.View
    public final void onDraw(Canvas canvas) {
        int v02 = h6.v0(h6.d6, this.V.W.c);
        Paint paint = this.U;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
