package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class m1 extends AbstractList implements e0, RandomAccess {
    public final d0 a;

    public m1(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void g(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.a.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final List h() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        l1 l1Var = new l1();
        l1Var.a = this.a.iterator();
        return l1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final Object l(int i10) {
        return this.a.b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        k1 k1Var = new k1();
        k1Var.a = this.a.listIterator(i10);
        return k1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final e0 j() {
        return this;
    }
}
