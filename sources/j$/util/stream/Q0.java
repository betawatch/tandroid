package j$.util.stream;

import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
abstract class Q0 extends I0 implements F0 {
    Q0(F0 f0, F0 f02) {
        super(f0, f02);
    }

    @Override // j$.util.stream.F0
    public final void d(Object obj, int i) {
        G0 g0 = this.a;
        ((F0) g0).d(obj, i);
        ((F0) this.b).d(obj, i + ((int) ((F0) g0).count()));
    }

    @Override // j$.util.stream.F0
    public final Object e() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c = c((int) count);
        d(c, 0);
        return c;
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        ((F0) this.a).g(obj);
        ((F0) this.b).g(obj);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] s(IntFunction intFunction) {
        return u0.m(this, intFunction);
    }

    public final String toString() {
        long count = count();
        String name = getClass().getName();
        return count < 32 ? String.format("%s[%s.%s]", name, this.a, this.b) : String.format("%s[size=%d]", name, Long.valueOf(count()));
    }
}
