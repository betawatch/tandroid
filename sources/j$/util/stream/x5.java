package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class x5 extends f5 {
    public final Comparator b;
    public boolean c;

    public x5(j5 j5Var, Comparator comparator) {
        super(j5Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final boolean q() {
        this.c = true;
        return false;
    }
}
