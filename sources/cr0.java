// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cr0 extends tk4 {
    public final Paint V;
    public final /* synthetic */ gr0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(gr0 gr0Var, Context context) {
        super(context, null);
        this.W = gr0Var;
        this.V = new Paint();
    }

    @Override // tk4
    public final int getColumnsCount() {
        return this.W.d;
    }

    @Override // tk4
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // tk4, android.view.View
    public final void onDraw(Canvas canvas) {
        int v0 = aob.v0(aob.d6, this.W.a0.c);
        Paint paint = this.V;
        paint.setColor(v0);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
