package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e0 extends b implements f0, RandomAccess {
    public final ArrayList b;

    static {
        new e0(10).a = false;
    }

    public e0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        i();
        this.b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final z e(int i10) {
        ArrayList arrayList = this.b;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new e0(arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void g(g gVar) {
        i();
        this.b.add(gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof g)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, a0.a);
            if (v1.a.i(0, bArr.length, bArr) == 0) {
                arrayList.set(i10, str);
            }
            return str;
        }
        g gVar = (g) obj;
        String str2 = gVar.size() == 0 ? "" : new String(gVar.b, gVar.n(), gVar.size(), a0.a);
        int n10 = gVar.n();
        if (v1.a.i(n10, gVar.size() + n10, gVar.b) == 0) {
            arrayList.set(i10, str2);
        }
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final List h() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final f0 j() {
        return this.a ? new n1(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final Object l(int i10) {
        return this.b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        i();
        Object remove = this.b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof g)) {
            return new String((byte[]) remove, a0.a);
        }
        g gVar = (g) remove;
        return gVar.size() == 0 ? "" : new String(gVar.b, gVar.n(), gVar.size(), a0.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        i();
        Object obj2 = this.b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof g)) {
            return new String((byte[]) obj2, a0.a);
        }
        g gVar = (g) obj2;
        return gVar.size() == 0 ? "" : new String(gVar.b, gVar.n(), gVar.size(), a0.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public e0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        i();
        if (collection instanceof f0) {
            collection = ((f0) collection).h();
        }
        boolean addAll = this.b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
