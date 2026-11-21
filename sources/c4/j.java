package c4;

import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
    public final long h(int i7) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.h(i7) + this.b;
    }

    @Override // c4.d
    public final List m(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.m(j3 - this.b);
    }

    @Override // c4.d
    public final int p() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.p();
    }
}
