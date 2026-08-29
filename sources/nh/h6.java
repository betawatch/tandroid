package nh;

import android.graphics.PointF;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h6 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public h6(String str, PointF[] pointFArr) {
        this.a = str;
        this.b = pointFArr;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f9 += pointF.x;
            f10 += pointF.y;
        }
        this.c = f9 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
