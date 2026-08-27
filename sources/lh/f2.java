package lh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class f2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final org.telegram.ui.Components.nc g;
    public final org.telegram.ui.Components.y5 h;

    public f2(j2 j2Var) {
        this.g = new org.telegram.ui.Components.nc(j2Var);
        this.h = new org.telegram.ui.Components.y5(j2Var, 350L, er.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z10) {
    }
}
