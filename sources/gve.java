// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gve extends fje implements vve, RandomAccess {
    public final ArrayList b;

    static {
        new gve(10).a = false;
    }

    public gve(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // fje, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof vve) {
            collection = ((vve) collection).zzd();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // fje, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // vve
    public final Object d(int i) {
        return this.b.get(i);
    }

    @Override // vve
    public final void e(jne jneVar) {
        h();
        this.b.add(jneVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof jne)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, xse.a);
            if (h5f.a.c(0, bArr.length, bArr)) {
                arrayList.set(i, str);
            }
            return str;
        }
        jne jneVar = (jne) obj;
        String str2 = jneVar.i() == 0 ? "" : new String(jneVar.b, jneVar.m(), jneVar.i(), xse.a);
        int m = jneVar.m();
        if (h5f.a.c(m, jneVar.i() + m, jneVar.b)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // fje, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof jne)) {
            return new String((byte[]) remove, xse.a);
        }
        jne jneVar = (jne) remove;
        return jneVar.i() == 0 ? "" : new String(jneVar.b, jneVar.m(), jneVar.i(), xse.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof jne)) {
            return new String((byte[]) obj2, xse.a);
        }
        jne jneVar = (jne) obj2;
        return jneVar.i() == 0 ? "" : new String(jneVar.b, jneVar.m(), jneVar.i(), xse.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // bue
    public final bue zza(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            iy8.d();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new gve(arrayList2);
    }

    @Override // vve
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // vve
    public final vve zze() {
        return this.a ? new l4f(this) : this;
    }

    public gve(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // fje, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
