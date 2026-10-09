package me;

import android.graphics.RectF;
import w7.o;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        return o.a(this.d.a, 0.0f, 1.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((g) obj).b);
    }
}
