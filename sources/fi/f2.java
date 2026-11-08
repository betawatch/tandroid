package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import bi.nd;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class f2 {
    public int a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final ic g;
    public final org.telegram.ui.Components.w5 h;

    public f2(nd ndVar) {
        this.g = new ic(ndVar);
        this.h = new org.telegram.ui.Components.w5(ndVar, 350L, xq.h);
    }

    public abstract void a(Canvas canvas, float f10, float f11);

    public void b(boolean z9) {
    }
}
