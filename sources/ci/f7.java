package ci;

import android.graphics.PointF;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
