// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class fod extends fcd implements rod, RandomAccess {
    public final ArrayList b;

    static {
        new fod(10).a = false;
    }

    public fod(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // fcd, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof rod) {
            collection = ((rod) collection).c();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // rod
    public final List c() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // fcd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // omd
    public final omd f(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            i98.g();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new fod(arrayList2);
    }

    @Override // rod
    public final rod g() {
        return this.a ? new h1e(this) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (o2e.a.b(r0, 0, r0.length) != false) goto L17;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof efd) {
            efd efdVar = (efd) obj;
            str = efdVar.size() == 0 ? "" : new String(efdVar.b, efdVar.h(), efdVar.size(), gld.a);
            int h = efdVar.h();
            if (!o2e.a.b(efdVar.b, h, efdVar.size() + h)) {
                return str;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, gld.a);
        }
        arrayList.set(i, str);
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof efd)) {
            return new String((byte[]) remove, gld.a);
        }
        efd efdVar = (efd) remove;
        return efdVar.size() == 0 ? "" : new String(efdVar.b, efdVar.h(), efdVar.size(), gld.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof efd)) {
            return new String((byte[]) obj2, gld.a);
        }
        efd efdVar = (efd) obj2;
        return efdVar.size() == 0 ? "" : new String(efdVar.b, efdVar.h(), efdVar.size(), gld.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public fod(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // fcd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
