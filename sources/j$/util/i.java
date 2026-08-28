package j$.util;

import j$.util.List;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public class i extends h implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;
    public final java.util.List c;

    public i(java.util.List list) {
        super(list);
        this.c = list;
    }

    public i(java.util.List list, Object obj) {
        super(list, obj);
        this.c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            equals = this.c.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int hashCode;
        synchronized (this.b) {
            hashCode = this.c.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        Object obj;
        synchronized (this.b) {
            obj = this.c.get(i9);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.c.set(i9, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        synchronized (this.b) {
            this.c.add(i9, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        Object remove;
        synchronized (this.b) {
            remove = this.c.remove(i9);
        }
        return remove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.b) {
            indexOf = this.c.indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.b) {
            lastIndexOf = this.c.lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i9, java.util.Collection collection) {
        boolean addAll;
        synchronized (this.b) {
            addAll = this.c.addAll(i9, collection);
        }
        return addAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        return this.c.listIterator(i9);
    }

    @Override // java.util.List
    public java.util.List subList(int i9, int i10) {
        i iVar;
        synchronized (this.b) {
            iVar = new i(this.c.subList(i9, i10), this.b);
        }
        return iVar;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.b) {
            java.util.List list = this.c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.-CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        synchronized (this.b) {
            List.-EL.sort(this.c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.c;
        return list instanceof RandomAccess ? new k(list) : this;
    }
}
