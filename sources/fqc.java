// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
