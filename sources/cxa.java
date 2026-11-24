// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cxa {
    public final oi4 a;
    public k26 b;
    public final int c;
    public final /* synthetic */ dxa d;

    public cxa(dxa dxaVar, int i) {
        this.d = dxaVar;
        this.c = i;
        oi4 oi4Var = new oi4(dxaVar.getContext());
        oi4Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        oi4Var.e = textPaint;
        oi4Var.f = new Paint(1);
        Paint paint = new Paint(1);
        oi4Var.h = paint;
        Paint paint2 = new Paint(1);
        oi4Var.n = paint2;
        oi4Var.x = gl.L(35.0f);
        oi4Var.y = gl.L(22.0f);
        oi4Var.E = gl.L(8.0f);
        oi4Var.F = gl.L(3.5f);
        oi4Var.G = new RectF();
        oi4Var.H = 0.0f;
        textPaint.setTextSize(gl.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(gl.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(gl.L(2.0f));
        this.a = oi4Var;
        oi4Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        dxaVar.h.addView(oi4Var);
        dxaVar.n.add(this);
    }
}
