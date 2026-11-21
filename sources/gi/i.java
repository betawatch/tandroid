package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class i extends yz {
    public final Paint V;
    public final /* synthetic */ m W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Context context) {
        super(context, null);
        this.W = mVar;
        this.V = new Paint();
    }

    @Override // org.telegram.ui.Components.yz
    public final int getColumnsCount() {
        return this.W.d;
    }

    @Override // org.telegram.ui.Components.yz
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.yz, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = m6.w0(m6.d6, this.W.a0.c);
        Paint paint = this.V;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
