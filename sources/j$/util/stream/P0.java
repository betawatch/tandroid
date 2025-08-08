package j$.util.stream;

import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
abstract class P0 extends H0 implements E0 {
    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] s(IntFunction intFunction) {
        return t0.m(this, intFunction);
    }

    @Override // j$.util.stream.E0
    public final void g(Object obj) {
        ((E0) this.a).g(obj);
        ((E0) this.b).g(obj);
    }

    @Override // j$.util.stream.E0
    public final void d(Object obj, int i) {
        F0 f0 = this.a;
        ((E0) f0).d(obj, i);
        ((E0) this.b).d(obj, i + ((int) ((E0) f0).count()));
    }

    @Override // j$.util.stream.E0
    public final Object e() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c = c((int) count);
        d(c, 0);
        return c;
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
