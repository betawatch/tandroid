package hi;

import android.graphics.Canvas;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class d implements a, tg.a {
    public final a a;
    public final a b;
    public final je.b c = new je.b();
    public float d;

    public d(a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // tg.a
    public final vg.f a() {
        vg.f fVar = new vg.f(this);
        this.c.add(fVar);
        return fVar;
    }

    public final void b(float f7) {
        if (this.d != f7) {
            this.d = f7;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                vg.f fVar = (vg.f) it.next();
                fVar.updateColors();
                fVar.invalidateSelf();
            }
        }
    }

    @Override // hi.a
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        Canvas canvas2;
        float f13;
        float f14;
        float f15;
        float f16;
        if (this.d < 1.0f) {
            canvas2 = canvas;
            f13 = f7;
            f14 = f10;
            f15 = f11;
            f16 = f12;
            this.a.e(canvas2, f13, f14, f15, f16);
        } else {
            canvas2 = canvas;
            f13 = f7;
            f14 = f10;
            f15 = f11;
            f16 = f12;
        }
        float f17 = this.d;
        if (f17 > 0.0f) {
            if (f17 < 1.0f) {
                canvas2.saveLayerAlpha(f13, f14, f15, f16, (int) (f17 * 255.0f));
            }
            float f18 = f16;
            float f19 = f15;
            float f20 = f14;
            float f21 = f13;
            Canvas canvas3 = canvas2;
            this.b.e(canvas3, f21, f20, f19, f18);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }
}
