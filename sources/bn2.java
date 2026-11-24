// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bn2 extends cd8 {
    public final /* synthetic */ ln2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn2(ln2 ln2Var, Context context, Bitmap bitmap) {
        super(context);
        this.E = ln2Var;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = 0.5f;
        this.f = 0.5f;
        this.h = new Path();
        this.n = new Rect();
        this.r = new RectF();
        this.a = bitmap;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gm.L(4.0f));
        paint.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(gm.L(1.0f));
        paint2.setColor(-1711276033);
        paint3.setStyle(style);
        paint3.setStrokeWidth(gm.L(12.0f));
    }
}
