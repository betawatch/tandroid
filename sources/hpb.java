// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hpb extends gb2 {
    public final Path Ld;
    public final Paint Md;
    public final /* synthetic */ int Nd;
    public final /* synthetic */ int Od;
    public final /* synthetic */ int Pd;
    public final /* synthetic */ jpb Qd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpb(jpb jpbVar, Context context, int i, wjb wjbVar, int i2, int i3, int i4) {
        super(context, i, false, null, wjbVar);
        this.Qd = jpbVar;
        this.Nd = i2;
        this.Od = i3;
        this.Pd = i4;
        this.Ld = new Path();
        this.Md = new Paint(1);
    }

    @Override // gb2
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        super.j1(canvas);
    }

    @Override // gb2, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int e2 = e2(this.Nd);
        float X1 = X1(e2);
        float W1 = W1(e2);
        RectF rectF = gl.P;
        rectF.set(getPollButtonsLeft(), X1, getPollButtonsRight(), W1);
        Path path = this.Ld;
        path.rewind();
        path.addRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
        Paint paint = this.Md;
        paint.setColor(0);
        paint.setShadowLayer(gl.L(2.0f), 0.0f, gl.L(0.66f), bkb.p1(this.Qd.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override // gb2, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.Od, this.Pd);
    }

    @Override // gb2, android.view.View
    public final void setPressed(boolean z) {
    }
}
