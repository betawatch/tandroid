package ci;

import android.graphics.PointF;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
