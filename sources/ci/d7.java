package ci;

import android.graphics.PointF;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class d7 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public d7(String str, PointF[] pointFArr) {
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
