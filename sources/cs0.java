// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cs0 extends tk4 {
    public final Paint V;
    public final /* synthetic */ gs0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(gs0 gs0Var, Context context) {
        super(context, null);
        this.W = gs0Var;
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
        int v0 = cmb.v0(cmb.c6, this.W.a0.c);
        Paint paint = this.V;
        paint.setColor(v0);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
