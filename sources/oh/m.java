package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.t00;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class m extends t00 {
    public final Paint R;
    public final /* synthetic */ r S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, Context context) {
        super(context, null);
        this.S = rVar;
        this.R = new Paint();
    }

    @Override // org.telegram.ui.Components.t00
    public final int getColumnsCount() {
        return this.S.d;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.t00, android.view.View
    public final void onDraw(Canvas canvas) {
        int v02 = j6.v0(j6.d6, this.S.T.c);
        Paint paint = this.R;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
