package j$.util.stream;

import java.util.Comparator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
