// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dd4 extends hn {
    public final Paint s;
    public final /* synthetic */ ed4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd4(ed4 ed4Var, Context context) {
        super(context, false, true, true);
        this.w = ed4Var;
        this.s = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ed4 ed4Var = this.w;
        int a = ed4Var.x.a(ed4Var.w, false);
        setTextColor(a);
        int p1 = bkb.p1(bkb.I.o() ? 0.2f : 0.1f, a);
        Paint paint = this.s;
        paint.setColor(p1);
        RectF rectF = gl.P;
        rectF.set((getWidth() - getDrawable().c()) - gl.N(9.32f), (getHeight() - gl.N(14.66f)) / 2.0f, getWidth(), (gl.N(14.66f) + getHeight()) / 2.0f);
        canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
        super.dispatchDraw(canvas);
    }
}
