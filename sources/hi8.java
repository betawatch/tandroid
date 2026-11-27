// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hi8 extends wb2 {
    public final Path Ld;
    public final Paint Md;
    public final /* synthetic */ byte[] Nd;
    public final /* synthetic */ int Od;
    public final /* synthetic */ int Pd;
    public final /* synthetic */ ji8 Qd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi8(ji8 ji8Var, Context context, int i, vnb vnbVar, byte[] bArr, int i2, int i3) {
        super(context, i, false, null, vnbVar);
        this.Qd = ji8Var;
        this.Nd = bArr;
        this.Od = i2;
        this.Pd = i3;
        this.Ld = new Path();
        this.Md = new Paint(1);
    }

    @Override // wb2
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        this.U4 = (-hl.L(7.0f)) * this.Qd.E;
        super.j1(canvas);
    }

    @Override // wb2, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int Y1 = Y1(this.Nd);
        float X1 = X1(Y1);
        float W1 = W1(Y1);
        RectF rectF = hl.P;
        rectF.set(getPollButtonsLeft(), X1, getPollButtonsRight(), W1);
        float f = rectF.top;
        float L = hl.L(3.0f);
        ji8 ji8Var = this.Qd;
        rectF.top = hl.R1(L, ji8Var.W ? -hl.L(3.0f) : 0.0f, ji8Var.E) + f;
        float f2 = rectF.bottom;
        boolean z = ji8Var.W;
        float L2 = hl.L(3.0f);
        if (!z) {
            L2 = hl.R1(L2, 0.0f, ji8Var.E);
        }
        rectF.bottom = f2 + L2;
        Path path = this.Ld;
        path.rewind();
        path.addRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
        Paint paint = this.Md;
        paint.setColor(0);
        paint.setShadowLayer(hl.L(2.0f), 0.0f, hl.L(0.66f), aob.p1(ji8Var.E * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override // wb2, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.Od, this.Pd);
    }

    @Override // wb2, android.view.View
    public final void setPressed(boolean z) {
    }
}
