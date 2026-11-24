// default package

import android.graphics.PointF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class cx8 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public cx8(String str, PointF[] pointFArr) {
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
