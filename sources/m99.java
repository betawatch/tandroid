// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class m99 extends bp5 {
    public final transient to5 d;
    public final transient n99 e;

    public m99(to5 to5Var, n99 n99Var) {
        this.d = to5Var;
        this.e = n99Var;
    }

    @Override // jo5, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // bp5, jo5
    public final po5 h() {
        return this.e;
    }

    @Override // jo5
    public final int i(int i, Object[] objArr) {
        return this.e.i(i, objArr);
    }

    @Override // jo5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final v9c iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
