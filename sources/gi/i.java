package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pz;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i extends pz {
    public final Paint V;
    public final /* synthetic */ m W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Context context) {
        super(context, null);
        this.W = mVar;
        this.V = new Paint();
    }

    @Override // org.telegram.ui.Components.pz
    public final int getColumnsCount() {
        return this.W.d;
    }

    @Override // org.telegram.ui.Components.pz
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.pz, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = j6.w0(j6.d6, this.W.a0.c);
        Paint paint = this.V;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
