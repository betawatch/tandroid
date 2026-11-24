// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m57 extends lka {
    public final Paint N0;
    public final /* synthetic */ ylb O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m57(Context context, ylb ylbVar) {
        super(context);
        this.O0 = ylbVar;
        this.N0 = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v0 = cmb.v0(cmb.J5, this.O0);
        Paint paint = this.N0;
        paint.setColor(v0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - gm.L(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + gm.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
