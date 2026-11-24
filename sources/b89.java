// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b89 extends yo5 {
    public final transient qo5 d;
    public final transient c89 e;

    public b89(qo5 qo5Var, c89 c89Var) {
        this.d = qo5Var;
        this.e = c89Var;
    }

    @Override // go5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // yo5, go5
    public final mo5 h() {
        return this.e;
    }

    @Override // go5
    public final int i(int i, Object[] objArr) {
        return this.e.i(i, objArr);
    }

    @Override // go5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final v7c iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
