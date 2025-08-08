package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class r2 extends Z1 {
    protected final Comparator b;
    protected boolean c;

    r2(d2 d2Var, Comparator comparator) {
        super(d2Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.d2
    public final boolean q() {
        this.c = true;
        return false;
    }
}
