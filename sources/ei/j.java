package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.lz;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class j extends lz {
    public final Paint U;
    public final /* synthetic */ n V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Context context) {
        super(context, null);
        this.V = nVar;
        this.U = new Paint();
    }

    @Override // org.telegram.ui.Components.lz
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override // org.telegram.ui.Components.lz
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.lz, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = k6.w0(k6.d6, this.V.W.c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
