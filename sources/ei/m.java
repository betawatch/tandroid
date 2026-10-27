package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m extends c10 {
    public final Paint U;
    public final /* synthetic */ r V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, Context context) {
        super(context, null);
        this.V = rVar;
        this.U = new Paint();
    }

    @Override // org.telegram.ui.Components.c10
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override // org.telegram.ui.Components.c10
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.c10, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = y6.w0(y6.d6, this.V.W.c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
