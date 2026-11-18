package hi;

import android.graphics.PointF;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class y5 {
    public final String a;
    public final PointF[] b;
    public final float c;
    public final float d;

    public y5(String str, PointF[] pointFArr) {
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
