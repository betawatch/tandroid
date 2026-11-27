// default package

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class op5 {
    public long a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public final RectF f = new RectF();
    public int g;
    public final Paint h;
    public final int i;

    public op5(int i) {
        this.i = i;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
