// default package

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gkf extends bif implements RandomAccess, ikf {
    public final List b;

    static {
        new gkf();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkf(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // bif, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof ikf) {
            collection = ((ikf) collection).zzh();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // ikf
    public final Object b(int i) {
        return this.b.get(i);
    }

    @Override // bif, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        String str;
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof nif)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, ujf.a);
            egd egdVar = ylf.a;
            int length = bArr.length;
            egdVar.getClass();
            if (egd.b(length, bArr)) {
                list.set(i, str2);
            }
            return str2;
        }
        nif nifVar = (nif) obj;
        Charset charset = ujf.a;
        if (nifVar.j() == 0) {
            str = "";
        } else {
            str = new String(nifVar.b, 0, nifVar.j(), charset);
        }
        int j = nifVar.j();
        byte[] bArr2 = nifVar.b;
        ylf.a.getClass();
        if (egd.b(j, bArr2)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // bif, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof nif)) {
            return new String((byte[]) remove, ujf.a);
        }
        nif nifVar = (nif) remove;
        Charset charset = ujf.a;
        if (nifVar.j() == 0) {
            return "";
        }
        return new String(nifVar.b, 0, nifVar.j(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof nif)) {
            return new String((byte[]) obj2, ujf.a);
        }
        nif nifVar = (nif) obj2;
        Charset charset = ujf.a;
        if (nifVar.j() == 0) {
            return "";
        }
        return new String(nifVar.b, 0, nifVar.j(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // ikf
    public final ikf zzd() {
        return this.a ? new ulf(this) : this;
    }

    @Override // tjf
    public final tjf zzg(int i) {
        List list = this.b;
        if (i < list.size()) {
            iy8.d();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new gkf(arrayList);
    }

    @Override // ikf
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public gkf(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public gkf() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // bif, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
