package le;

import android.graphics.RectF;
import w7.q;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class h implements Comparable {
    public final Object a;
    public int b;
    public final n c;
    public final n d;
    public final o e;
    public final n f;
    public boolean h = false;

    public h(int i10, Object obj, boolean z10) {
        this.a = obj;
        this.b = i10;
        this.d = new n(z10 ? 1.0f : 0.0f);
        this.c = new n(i10);
        this.e = new o();
        this.f = new n(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f.c(z10);
        Object obj = this.a;
        if (obj instanceof o) {
            ((o) obj).c(z10);
        }
    }

    public final RectF b() {
        o oVar = this.e;
        RectF rectF = oVar.e;
        rectF.set(oVar.a.a, oVar.b.a, oVar.c.a, oVar.d.a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.a, 0.0f, 1.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((h) obj).b);
    }
}
