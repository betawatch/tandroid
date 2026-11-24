// default package

import android.graphics.PointF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bv8 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public bv8(String str, PointF[] pointFArr) {
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
