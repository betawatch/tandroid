package c4;

import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
    public final List q(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.q(j3 - this.b);
    }

    @Override // c4.d
    public final int u() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.u();
    }
}
