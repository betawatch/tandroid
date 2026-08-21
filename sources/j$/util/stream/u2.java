package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class u2 extends c2 {
    public final Comparator b;
    public boolean c;

    public u2(g2 g2Var, Comparator comparator) {
        super(g2Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public final boolean C() {
        this.c = true;
        return false;
    }
}
