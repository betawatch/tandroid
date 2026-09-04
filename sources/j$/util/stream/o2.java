package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class o2 extends g2 implements d2 {
    @Override // j$.util.stream.e2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return t3.L(this, intFunction);
    }

    @Override // j$.util.stream.d2
    public final void d(Object obj) {
        ((d2) this.a).d(obj);
        ((d2) this.b).d(obj);
    }

    @Override // j$.util.stream.d2
    public final void c(int i10, Object obj) {
        e2 e2Var = this.a;
        ((d2) e2Var).c(i10, obj);
        ((d2) this.b).c(i10 + ((int) ((d2) e2Var).count()), obj);
    }

    @Override // j$.util.stream.d2
    public final Object b() {
        long j3 = this.c;
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object newArray = newArray((int) j3);
        c(0, newArray);
        return newArray;
    }

    public final String toString() {
        long j3 = this.c;
        return j3 < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j3));
    }
}
