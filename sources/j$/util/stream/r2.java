package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public abstract class r2 extends j2 implements g2 {
    @Override // j$.util.stream.g2
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        Object newArray = newArray((int) j);
        c(0, newArray);
        return newArray;
    }

    @Override // j$.util.stream.g2
    public final void c(int i, Object obj) {
        h2 h2Var = this.a;
        ((g2) h2Var).c(i, obj);
        ((g2) this.b).c(i + ((int) ((g2) h2Var).count()), obj);
    }

    @Override // j$.util.stream.g2
    public final void d(Object obj) {
        ((g2) this.a).d(obj);
        ((g2) this.b).d(obj);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return w3.m(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
