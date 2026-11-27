// default package

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
