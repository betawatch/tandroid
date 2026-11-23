package c4;

import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class j extends k2.j implements d {
    public d a;
    public long b;

    @Override // k2.j, k2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // c4.d
    public final int d(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(j3 - this.b);
    }

    @Override // c4.d
    public final long i(int i7) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.i(i7) + this.b;
    }

    @Override // c4.d
    public final List k(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.k(j3 - this.b);
    }

    @Override // c4.d
    public final int m() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.m();
    }
}
