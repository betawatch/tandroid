// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m37 extends jia {
    public final Paint N0;
    public final /* synthetic */ wjb O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m37(Context context, wjb wjbVar) {
        super(context);
        this.O0 = wjbVar;
        this.N0 = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v0 = bkb.v0(bkb.J5, this.O0);
        Paint paint = this.N0;
        paint.setColor(v0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - gl.L(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + gl.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
