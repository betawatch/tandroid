// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bf4 extends in {
    public final Paint s;
    public final /* synthetic */ cf4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf4(cf4 cf4Var, Context context) {
        super(context, false, true, true);
        this.w = cf4Var;
        this.s = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        cf4 cf4Var = this.w;
        int a = cf4Var.x.a(cf4Var.w, false);
        setTextColor(a);
        int p1 = aob.p1(aob.I.o() ? 0.2f : 0.1f, a);
        Paint paint = this.s;
        paint.setColor(p1);
        RectF rectF = hl.P;
        rectF.set((getWidth() - getDrawable().c()) - hl.N(9.32f), (getHeight() - hl.N(14.66f)) / 2.0f, getWidth(), (hl.N(14.66f) + getHeight()) / 2.0f);
        canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
        super.dispatchDraw(canvas);
    }
}
