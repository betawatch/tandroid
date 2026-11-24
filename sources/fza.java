// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fza {
    public final sk4 a;
    public l46 b;
    public final int c;
    public final /* synthetic */ gza d;

    public fza(gza gzaVar, int i) {
        this.d = gzaVar;
        this.c = i;
        sk4 sk4Var = new sk4(gzaVar.getContext());
        sk4Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        sk4Var.e = textPaint;
        sk4Var.f = new Paint(1);
        Paint paint = new Paint(1);
        sk4Var.h = paint;
        Paint paint2 = new Paint(1);
        sk4Var.n = paint2;
        sk4Var.x = gm.L(35.0f);
        sk4Var.y = gm.L(22.0f);
        sk4Var.E = gm.L(8.0f);
        sk4Var.F = gm.L(3.5f);
        sk4Var.G = new RectF();
        sk4Var.H = 0.0f;
        textPaint.setTextSize(gm.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(gm.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(gm.L(2.0f));
        this.a = sk4Var;
        sk4Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        gzaVar.h.addView(sk4Var);
        gzaVar.n.add(this);
    }
}
