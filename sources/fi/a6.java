package fi;

import android.graphics.PointF;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a6 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public a6(String str, PointF[] pointFArr) {
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
