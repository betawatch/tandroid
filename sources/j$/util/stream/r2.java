package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
