package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class L0 extends D0 implements A0 {
    @Override // j$.util.stream.B0
    public final /* synthetic */ Object[] h(IntFunction intFunction) {
        return q1.m(this, intFunction);
    }

    @Override // j$.util.stream.A0
    public final void e(Object obj) {
        ((A0) this.a).e(obj);
        ((A0) this.b).e(obj);
    }

    @Override // j$.util.stream.A0
    public final void j(int i, Object obj) {
        B0 b0 = this.a;
        ((A0) b0).j(i, obj);
        ((A0) this.b).j(i + ((int) ((A0) b0).count()), obj);
    }

    @Override // j$.util.stream.A0
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
