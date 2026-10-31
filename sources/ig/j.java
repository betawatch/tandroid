package ig;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import jg.f2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends f2 {
    public final /* synthetic */ u D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, Context context, Bitmap bitmap) {
        super(context);
        this.D = uVar;
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
        paint.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        paint.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint2.setColor(-1711276033);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(12.0f));
    }
}
