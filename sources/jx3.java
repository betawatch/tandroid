// default package

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class jx3 {
    public byte a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final u51 g;
    public final ln h;

    public jx3(nx3 nx3Var) {
        this.g = new u51(nx3Var);
        this.h = new ln(350L, nx3Var, d53.h);
    }

    public abstract void a(Canvas canvas, float f, float f2);

    public void b(boolean z) {
    }
}
