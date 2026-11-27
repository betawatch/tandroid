// default package

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
