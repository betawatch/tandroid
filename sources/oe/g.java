package oe;

import a8.ee;
import android.graphics.RectF;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final Object a;
    public int b;
    public final m c;
    public final m d;
    public final n e;
    public final m f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        this.a = obj;
        this.b = i10;
        this.d = new m(z10 ? 1.0f : 0.0f);
        this.c = new m(i10);
        this.e = new n();
        this.f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f.c(z10);
        Object obj = this.a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.a.a, nVar.b.a, nVar.c.a, nVar.d.a);
        return rectF;
    }

    public final float c() {
        return ee.a(this.d.a, 0.0f, 1.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((g) obj).b);
    }
}
