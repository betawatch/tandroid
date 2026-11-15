package c4;

import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
