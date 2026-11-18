package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i extends wz {
    public final Paint V;
    public final /* synthetic */ m W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Context context) {
        super(context, null);
        this.W = mVar;
        this.V = new Paint();
    }

    @Override // org.telegram.ui.Components.wz
    public final int getColumnsCount() {
        return this.W.d;
    }

    @Override // org.telegram.ui.Components.wz
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.wz, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = n6.w0(n6.d6, this.W.a0.c);
        Paint paint = this.V;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
