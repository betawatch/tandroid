package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.t00;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m extends t00 {
    public final Paint U;
    public final /* synthetic */ t V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, Context context) {
        super(context, null);
        this.V = tVar;
        this.U = new Paint();
    }

    @Override // org.telegram.ui.Components.t00
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.t00, android.view.View
    public final void onDraw(Canvas canvas) {
        int v02 = j6.v0(j6.d6, this.V.W.c);
        Paint paint = this.U;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
