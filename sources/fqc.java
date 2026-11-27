// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fqc extends xj3 {
    public final ShapeDrawable H;
    public final /* synthetic */ uqc I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqc(uqc uqcVar, Context context) {
        super(context);
        this.I = uqcVar;
        this.H = aob.b0(hl.L(22.0f), uqcVar.getThemedColor(aob.d6));
    }

    @Override // xj3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(aob.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
