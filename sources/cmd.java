// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class cmd extends dad implements omd, RandomAccess {
    public final ArrayList b;

    static {
        new cmd(10).a = false;
    }

    public cmd(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // dad, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof omd) {
            collection = ((omd) collection).c();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // omd
    public final List c() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // dad, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // mkd
    public final mkd f(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            sc8.e();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new cmd(arrayList2);
    }

    @Override // omd
    public final omd g() {
        return this.a ? new ezd(this) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (l0e.a.b(r0, 0, r0.length) != false) goto L17;
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
        if (obj instanceof cdd) {
            cdd cddVar = (cdd) obj;
            str = cddVar.size() == 0 ? "" : new String(cddVar.b, cddVar.h(), cddVar.size(), ejd.a);
            int h = cddVar.h();
            if (!l0e.a.b(cddVar.b, h, cddVar.size() + h)) {
                return str;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, ejd.a);
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
        if (!(remove instanceof cdd)) {
            return new String((byte[]) remove, ejd.a);
        }
        cdd cddVar = (cdd) remove;
        return cddVar.size() == 0 ? "" : new String(cddVar.b, cddVar.h(), cddVar.size(), ejd.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof cdd)) {
            return new String((byte[]) obj2, ejd.a);
        }
        cdd cddVar = (cdd) obj2;
        return cddVar.size() == 0 ? "" : new String(cddVar.b, cddVar.h(), cddVar.size(), ejd.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public cmd(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // dad, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
