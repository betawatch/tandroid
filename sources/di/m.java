package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m extends b10 {
    public final Paint U;
    public final /* synthetic */ r V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, Context context) {
        super(context, null);
        this.V = rVar;
        this.U = new Paint();
    }

    @Override // org.telegram.ui.Components.b10
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override // org.telegram.ui.Components.b10
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.b10, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = k6.w0(k6.d6, this.V.W.c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
