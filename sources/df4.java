// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class df4 extends io {
    public final Paint s;
    public final /* synthetic */ ef4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df4(ef4 ef4Var, Context context) {
        super(context, false, true, true);
        this.w = ef4Var;
        this.s = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ef4 ef4Var = this.w;
        int a = ef4Var.x.a(ef4Var.w, false);
        setTextColor(a);
        int p1 = cmb.p1(cmb.I.o() ? 0.2f : 0.1f, a);
        Paint paint = this.s;
        paint.setColor(p1);
        RectF rectF = gm.P;
        rectF.set((getWidth() - getDrawable().c()) - gm.N(9.32f), (getHeight() - gm.N(14.66f)) / 2.0f, getWidth(), (gm.N(14.66f) + getHeight()) / 2.0f);
        canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
        super.dispatchDraw(canvas);
    }
}
