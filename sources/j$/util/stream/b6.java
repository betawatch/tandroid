package j$.util.stream;

import java.util.Comparator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public abstract class b6 extends j5 {
    public final Comparator b;
    public boolean c;

    public b6(n5 n5Var, Comparator comparator) {
        super(n5Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final boolean q() {
        this.c = true;
        return false;
    }
}
