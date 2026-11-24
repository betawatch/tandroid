// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cr0 extends pi4 {
    public final Paint V;
    public final /* synthetic */ gr0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(gr0 gr0Var, Context context) {
        super(context, null);
        this.W = gr0Var;
        this.V = new Paint();
    }

    @Override // pi4
    public final int getColumnsCount() {
        return this.W.d;
    }

    @Override // pi4
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // pi4, android.view.View
    public final void onDraw(Canvas canvas) {
        int v0 = bkb.v0(bkb.c6, this.W.a0.c);
        Paint paint = this.V;
        paint.setColor(v0);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
