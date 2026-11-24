// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class od4 extends ReplacementSpan {
    public final wjb a;
    public final Paint b;
    public final int c;
    public final tgb d;

    public od4(String str, int i, wjb wjbVar) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = wjbVar;
        this.c = i;
        this.d = new tgb(str, 9.33f, gl.o());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int v0 = bkb.v0(this.c, this.a);
        int p1 = bkb.p1(0.15f, v0);
        Paint paint2 = this.b;
        paint2.setColor(p1);
        float f2 = (i5 + i3) / 2.0f;
        float L = gl.L(14.66f);
        RectF rectF = gl.P;
        float f3 = L / 2.0f;
        rectF.set(f, f2 - f3, this.d.j() + f + gl.L(9.33f), f3 + f2);
        canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint2);
        this.d.c(f + gl.L(4.66f), f2, 1.0f, v0, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.j() + gl.L(9.33f));
    }
}
