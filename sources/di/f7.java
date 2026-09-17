package di;

import android.graphics.PointF;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class f7 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public f7(String str, PointF[] pointFArr) {
        this.a = str;
        this.b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
