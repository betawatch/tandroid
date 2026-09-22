package ci;

import android.graphics.PointF;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
