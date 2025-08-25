package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
abstract class T0 extends K0 implements H0 {
    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return w0.m(this, intFunction);
    }

    @Override // j$.util.stream.H0
    public final void e(Object obj) {
        ((H0) this.a).e(obj);
        ((H0) this.b).e(obj);
    }

    @Override // j$.util.stream.H0
    public final void r(int i, Object obj) {
        I0 i0 = this.a;
        ((H0) i0).r(i, obj);
        ((H0) this.b).r(i + ((int) ((H0) i0).count()), obj);
    }

    @Override // j$.util.stream.H0
    public final Object d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c = c((int) count);
        r(0, c);
        return c;
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
