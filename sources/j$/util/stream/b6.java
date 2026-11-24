package j$.util.stream;

import java.util.Comparator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
