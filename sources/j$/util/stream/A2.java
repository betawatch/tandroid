package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class A2 extends i2 {
    protected final Comparator b;
    protected boolean c;

    A2(m2 m2Var, Comparator comparator) {
        super(m2Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final boolean n() {
        this.c = true;
        return false;
    }
}
