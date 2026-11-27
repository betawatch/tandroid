// default package

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class m3 extends AbstractCollection implements List {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable h;

    public m3(ccd ccdVar, Object obj, List list, m3 m3Var) {
        this.h = ccdVar;
        this.f = ccdVar;
        this.b = obj;
        this.c = list;
        this.e = m3Var;
        this.d = m3Var == null ? null : m3Var.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                i();
                boolean isEmpty = this.c.isEmpty();
                boolean add = this.c.add(obj);
                if (add) {
                    ((fj7) serializable).f++;
                    if (isEmpty) {
                        h();
                    }
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (add2) {
                    ((ccd) serializable).d++;
                    if (isEmpty2) {
                        k();
                        return true;
                    }
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                boolean add3 = this.c.add(obj);
                if (!add3 || !isEmpty3) {
                    return add3;
                }
                k();
                return true;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.a;
        Serializable serializable = this.h;
        boolean z = false;
        switch (b) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = ((List) this.c).addAll(i, collection);
                    if (z) {
                        ((fj7) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            h();
                        }
                    }
                }
                return z;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = ((List) this.c).addAll(i, collection);
                if (addAll) {
                    ((ccd) serializable).d += this.c.size() - size2;
                    if (size2 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = ((List) this.c).addAll(i, collection);
                if (addAll2) {
                    this.c.size();
                    if (size3 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((fj7) serializable).f -= size;
                    j();
                    break;
                }
                break;
            case 1:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((ccd) serializable).d -= size2;
                    l();
                    break;
                }
                break;
            default:
                if (size() != 0) {
                    this.c.clear();
                    l();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return this.c.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj != this) {
                    i();
                    break;
                }
                break;
            case 1:
                if (obj != this) {
                    zzb();
                    break;
                }
                break;
            default:
                if (obj != this) {
                    zzb();
                    break;
                }
                break;
        }
        return this.c.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).get(i);
    }

    public final void h() {
        m3 m3Var = (m3) this.e;
        if (m3Var != null) {
            m3Var.h();
        } else {
            ((fj7) this.f).e.put(this.b, this.c);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return this.c.hashCode();
    }

    public final void i() {
        Collection collection;
        m3 m3Var = (m3) this.e;
        if (m3Var != null) {
            m3Var.i();
            if (m3Var.c != this.d) {
                bg.b();
                return;
            }
            return;
        }
        if (!this.c.isEmpty() || (collection = (Collection) ((fj7) this.f).e.get(this.b)) == null) {
            return;
        }
        this.c = collection;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                i();
                return new d3(this);
            case 1:
                zzb();
                return new d3(this, (byte) 0);
            default:
                zzb();
                return new d3(this, (char) 0);
        }
    }

    public final void j() {
        m3 m3Var = (m3) this.e;
        if (m3Var != null) {
            m3Var.j();
        } else if (this.c.isEmpty()) {
            ((fj7) this.f).e.remove(this.b);
        }
    }

    public final void k() {
        byte b = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 1:
                m3 m3Var = (m3) abstractCollection;
                if (m3Var == null) {
                    ((ccd) serializable).c.put(obj, this.c);
                    break;
                } else {
                    m3Var.k();
                    break;
                }
            default:
                m3 m3Var2 = (m3) abstractCollection;
                if (m3Var2 == null) {
                    ((lmf) serializable).c.put(obj, this.c);
                    break;
                } else {
                    m3Var2.k();
                    break;
                }
        }
    }

    public final void l() {
        byte b = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 1:
                m3 m3Var = (m3) abstractCollection;
                if (m3Var == null) {
                    if (this.c.isEmpty()) {
                        ((ccd) serializable).c.remove(obj);
                        break;
                    }
                } else {
                    m3Var.l();
                    break;
                }
                break;
            default:
                m3 m3Var2 = (m3) abstractCollection;
                if (m3Var2 == null) {
                    if (this.c.isEmpty()) {
                        ((lmf) serializable).c.remove(obj);
                        break;
                    }
                } else {
                    m3Var2.l();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                i();
                return new l3(this);
            case 1:
                zzb();
                return new dbd(this);
            default:
                zzb();
                return new wjf(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.a;
        Serializable serializable = this.h;
        switch (b) {
            case 0:
                i();
                Object remove = ((List) this.c).remove(i);
                fj7 fj7Var = (fj7) serializable;
                fj7Var.f--;
                j();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.c).remove(i);
                ccd ccdVar = (ccd) serializable;
                ccdVar.d--;
                l();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.c).remove(i);
                l();
                return remove3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        byte b = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (b) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((fj7) serializable).f += this.c.size() - size;
                        j();
                        break;
                    }
                }
                break;
            case 1:
                if (!collection.isEmpty()) {
                    int size2 = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((ccd) serializable).d += this.c.size() - size2;
                        l();
                        break;
                    }
                }
                break;
            default:
                if (!collection.isEmpty()) {
                    size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        this.c.size();
                        l();
                        break;
                    }
                }
                break;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.c.retainAll(collection);
                if (retainAll) {
                    ((fj7) serializable).f += this.c.size() - size;
                    j();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size2 = size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    ((ccd) serializable).d += this.c.size() - size2;
                    l();
                }
                return retainAll2;
            default:
                collection.getClass();
                size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    this.c.size();
                    l();
                }
                return retainAll3;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        byte b = this.a;
        Serializable serializable = this.h;
        Object obj = this.b;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 0:
                i();
                fj7 fj7Var = (fj7) serializable;
                List subList = ((List) this.c).subList(i, i2);
                m3 m3Var = (m3) abstractCollection;
                if (m3Var != null) {
                    this = m3Var;
                }
                return subList instanceof RandomAccess ? new i3(fj7Var, obj, subList, this) : new m3(fj7Var, obj, subList, this);
            case 1:
                zzb();
                ccd ccdVar = (ccd) serializable;
                List subList2 = ((List) this.c).subList(i, i2);
                m3 m3Var2 = (m3) abstractCollection;
                if (m3Var2 != null) {
                    this = m3Var2;
                }
                return subList2 instanceof RandomAccess ? new dad(ccdVar, obj, subList2, this) : new m3(ccdVar, obj, subList2, this);
            default:
                zzb();
                List subList3 = ((List) this.c).subList(i, i2);
                m3 m3Var3 = (m3) abstractCollection;
                if (m3Var3 != null) {
                    this = m3Var3;
                }
                lmf lmfVar = (lmf) serializable;
                return subList3 instanceof RandomAccess ? new qff(lmfVar, obj, subList3, this) : new m3(lmfVar, obj, subList3, this);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return this.c.toString();
    }

    public final void zzb() {
        Collection collection;
        Collection collection2;
        byte b = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        Collection collection3 = this.d;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 1:
                m3 m3Var = (m3) abstractCollection;
                if (m3Var == null) {
                    if (this.c.isEmpty() && (collection = (Collection) ((ccd) serializable).c.get(obj)) != null) {
                        this.c = collection;
                        break;
                    }
                } else {
                    m3Var.zzb();
                    if (m3Var.c != collection3) {
                        bg.b();
                        break;
                    }
                }
                break;
            default:
                m3 m3Var2 = (m3) abstractCollection;
                if (m3Var2 == null) {
                    if (this.c.isEmpty() && (collection2 = (Collection) ((lmf) serializable).c.get(obj)) != null) {
                        this.c = collection2;
                        break;
                    }
                } else {
                    m3Var2.zzb();
                    if (m3Var2.c != collection3) {
                        bg.b();
                        break;
                    }
                }
                break;
        }
    }

    public m3(lmf lmfVar, Object obj, List list, m3 m3Var) {
        this.h = lmfVar;
        this.f = lmfVar;
        this.b = obj;
        this.c = list;
        this.e = m3Var;
        this.d = m3Var == null ? null : m3Var.c;
    }

    public m3(fj7 fj7Var, Object obj, List list, m3 m3Var) {
        this.h = fj7Var;
        this.f = fj7Var;
        this.b = obj;
        this.c = list;
        this.e = m3Var;
        this.d = m3Var == null ? null : m3Var.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                i();
                return new l3(this, i);
            case 1:
                zzb();
                return new dbd(this, i);
            default:
                zzb();
                return new wjf(this, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                i();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    fj7 fj7Var = (fj7) serializable;
                    fj7Var.f--;
                    j();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    ccd ccdVar = (ccd) serializable;
                    ccdVar.d--;
                    l();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    l();
                }
                return remove3;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.a;
        Serializable serializable = this.h;
        switch (b) {
            case 0:
                i();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((fj7) serializable).f++;
                if (isEmpty) {
                    h();
                    break;
                }
                break;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((ccd) serializable).d++;
                if (isEmpty2) {
                    k();
                    break;
                }
                break;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                if (isEmpty3) {
                    k();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        byte b = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (b) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.addAll(collection);
                    if (z) {
                        ((fj7) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            h();
                        }
                    }
                }
                return z;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = this.c.addAll(collection);
                if (addAll) {
                    ((ccd) serializable).d += this.c.size() - size2;
                    if (size2 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = this.c.addAll(collection);
                if (addAll2) {
                    this.c.size();
                    if (size3 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll2;
        }
    }
}
