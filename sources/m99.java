// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
