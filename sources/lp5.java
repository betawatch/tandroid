// default package

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lp5 {
    public long a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public final RectF f = new RectF();
    public int g;
    public final Paint h;
    public final int i;

    public lp5(int i) {
        this.i = i;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
