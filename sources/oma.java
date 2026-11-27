// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class oma extends bp5 {
    public final transient Object d;

    public oma(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // jo5, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // bp5, jo5
    public final po5 h() {
        return po5.u(this.d);
    }

    @Override // bp5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // jo5
    public final int i(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // jo5
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final v9c iterator() {
        return new qu5(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
