package j$.util;

import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public class p extends n implements java.util.List, List {
    private static final long serialVersionUID = -283967356065247728L;
    public final java.util.List b;

    public p(java.util.List list) {
        super(list);
        this.b = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.b.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final Object get(int i9) {
        return this.b.get(i9);
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i9, java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new o(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        return new o(this, i9);
    }

    @Override // java.util.List
    public java.util.List subList(int i9, int i10) {
        return new p(this.b.subList(i9, i10));
    }

    private Object readResolve() {
        java.util.List list = this.b;
        return list instanceof RandomAccess ? new u(list) : this;
    }
}
