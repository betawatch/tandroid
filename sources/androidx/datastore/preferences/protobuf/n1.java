package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n1 extends AbstractList implements f0, RandomAccess {
    public final e0 a;

    public n1(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void g(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        return (String) this.a.get(i9);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final List h() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m1 m1Var = new m1();
        m1Var.a = this.a.iterator();
        return m1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final Object l(int i9) {
        return this.a.b.get(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        l1 l1Var = new l1();
        l1Var.a = this.a.listIterator(i9);
        return l1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final f0 j() {
        return this;
    }
}
