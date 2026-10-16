package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.f10;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class m extends f10 {
    public final Paint U;
    public final /* synthetic */ t V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, Context context) {
        super(context, null);
        this.V = tVar;
        this.U = new Paint();
    }

    @Override // org.telegram.ui.Components.f10
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override // org.telegram.ui.Components.f10
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.f10, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = g6.w0(g6.d6, this.V.W.c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
