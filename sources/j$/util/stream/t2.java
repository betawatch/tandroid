package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class t2 extends b2 {
    public final Comparator b;
    public boolean c;

    public t2(f2 f2Var, Comparator comparator) {
        super(f2Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.b2, j$.util.stream.f2
    public final boolean C() {
        this.c = true;
        return false;
    }
}
