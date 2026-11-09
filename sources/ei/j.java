package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.mz;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j extends mz {
    public final Paint U;
    public final /* synthetic */ n V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Context context) {
        super(context, null);
        this.V = nVar;
        this.U = new Paint();
    }

    @Override // org.telegram.ui.Components.mz
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override // org.telegram.ui.Components.mz
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.mz, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = l6.w0(l6.d6, this.V.W.c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
