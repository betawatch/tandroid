// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ng5 extends qh0 {
    public final List d;
    public final long e;

    public ng5(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // em6
    public final long e() {
        a();
        return this.e + ((ah5) this.d.get((int) this.c)).e;
    }

    @Override // em6
    public final long g() {
        a();
        ah5 ah5Var = (ah5) this.d.get((int) this.c);
        return this.e + ah5Var.e + ah5Var.c;
    }
}
