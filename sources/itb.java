// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class itb extends wb2 {
    public final Path Ld;
    public final Paint Md;
    public final /* synthetic */ int Nd;
    public final /* synthetic */ int Od;
    public final /* synthetic */ int Pd;
    public final /* synthetic */ ktb Qd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itb(ktb ktbVar, Context context, int i, vnb vnbVar, int i2, int i3, int i4) {
        super(context, i, false, null, vnbVar);
        this.Qd = ktbVar;
        this.Nd = i2;
        this.Od = i3;
        this.Pd = i4;
        this.Ld = new Path();
        this.Md = new Paint(1);
    }

    @Override // wb2
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        super.j1(canvas);
    }

    @Override // wb2, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int e2 = e2(this.Nd);
        float X1 = X1(e2);
        float W1 = W1(e2);
        RectF rectF = hl.P;
        rectF.set(getPollButtonsLeft(), X1, getPollButtonsRight(), W1);
        Path path = this.Ld;
        path.rewind();
        path.addRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
        Paint paint = this.Md;
        paint.setColor(0);
        paint.setShadowLayer(hl.L(2.0f), 0.0f, hl.L(0.66f), aob.p1(this.Qd.y * 0.2f, -16777216));
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
