// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
