package hi;

import android.graphics.PointF;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class x5 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public x5(String str, PointF[] pointFArr) {
        this.a = str;
        this.b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
