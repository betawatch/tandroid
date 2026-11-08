package c4;

import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
    public final long k(int i7) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.k(i7) + this.b;
    }

    @Override // c4.d
    public final List s(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.s(j3 - this.b);
    }

    @Override // c4.d
    public final int y() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.y();
    }
}
