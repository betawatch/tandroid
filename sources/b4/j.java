package b4;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class j extends j2.j implements d {
    public d a;
    public long b;

    @Override // j2.j, j2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // b4.d
    public final int d(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(j10 - this.b);
    }

    @Override // b4.d
    public final long h(int i3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.h(i3) + this.b;
    }

    @Override // b4.d
    public final List p(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.p(j10 - this.b);
    }

    @Override // b4.d
    public final int t() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.t();
    }
}
