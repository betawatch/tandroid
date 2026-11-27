// default package

import android.graphics.PointF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class my8 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public my8(String str, PointF[] pointFArr) {
        this.a = str;
        this.b = pointFArr;
        float f = 0.0f;
        float f2 = 0.0f;
        for (PointF pointF : pointFArr) {
            f += pointF.x;
            f2 += pointF.y;
        }
        this.c = f / pointFArr.length;
        this.d = f2 / pointFArr.length;
    }
}
