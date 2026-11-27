// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class f1b {
    public final sk4 a;
    public o46 b;
    public final int c;
    public final /* synthetic */ g1b d;

    public f1b(g1b g1bVar, int i) {
        this.d = g1bVar;
        this.c = i;
        sk4 sk4Var = new sk4(g1bVar.getContext());
        sk4Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        sk4Var.e = textPaint;
        sk4Var.f = new Paint(1);
        Paint paint = new Paint(1);
        sk4Var.h = paint;
        Paint paint2 = new Paint(1);
        sk4Var.n = paint2;
        sk4Var.x = hl.L(35.0f);
        sk4Var.y = hl.L(22.0f);
        sk4Var.E = hl.L(8.0f);
        sk4Var.F = hl.L(3.5f);
        sk4Var.G = new RectF();
        sk4Var.H = 0.0f;
        textPaint.setTextSize(hl.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(hl.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(hl.L(2.0f));
        this.a = sk4Var;
        sk4Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        g1bVar.h.addView(sk4Var);
        g1bVar.n.add(this);
    }
}
