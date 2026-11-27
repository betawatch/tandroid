package j$.util.stream;

import java.util.Comparator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
