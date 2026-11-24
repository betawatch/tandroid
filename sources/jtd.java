// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jtd extends qtd {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ qtd e;

    public jtd(qtd qtdVar, int i, int i2) {
        this.e = qtdVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k3f.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // dtd
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // dtd
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // dtd
    public final Object[] l() {
        return this.e.l();
    }

    @Override // qtd, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final qtd subList(int i, int i2) {
        k3f.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
