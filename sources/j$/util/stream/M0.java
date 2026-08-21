package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class M0 extends E0 implements B0 {
    @Override // j$.util.stream.C0
    public final /* synthetic */ Object[] h(IntFunction intFunction) {
        return r1.m(this, intFunction);
    }

    @Override // j$.util.stream.B0
    public final void e(Object obj) {
        ((B0) this.a).e(obj);
        ((B0) this.b).e(obj);
    }

    @Override // j$.util.stream.B0
    public final void j(int i, Object obj) {
        C0 c0 = this.a;
        ((B0) c0).j(i, obj);
        ((B0) this.b).j(i + ((int) ((B0) c0).count()), obj);
    }

    @Override // j$.util.stream.B0
    public final Object d() {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c = c((int) j);
        j(0, c);
        return c;
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
