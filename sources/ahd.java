// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ahd extends fhd {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ fhd e;

    public ahd(fhd fhdVar, int i, int i2) {
        this.e = fhdVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u1f.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // ogd
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // ogd
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // ogd
    public final boolean l() {
        return true;
    }

    @Override // ogd
    public final Object[] m() {
        return this.e.m();
    }

    @Override // fhd, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final fhd subList(int i, int i2) {
        u1f.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
