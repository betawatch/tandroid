package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
final class zzcv extends zzck {
    static final zzcv zzc;
    final transient zzcc zzd;

    static {
        int i = zzcc.$r8$clinit;
        zzc = new zzcv(zzct.zza, zzcq.zza);
    }

    zzcv(zzcc zzccVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzccVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        zzcc zzccVar = this.zzd;
        int zzv = zzv(obj, true);
        if (zzv == zzccVar.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzck) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzcp) {
            collection = ((zzcp) collection).zza();
        }
        if (!zzdb.zza(((zzck) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzdd listIterator = this.zzd.listIterator(0);
        Iterator it = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = listIterator.next();
        while (true) {
            try {
                int compare = ((zzck) this).zza.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zzdb.zza(((zzck) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            zzdd listIterator = this.zzd.listIterator(0);
            while (listIterator.hasNext()) {
                E next = listIterator.next();
                Object next2 = it.next();
                if (next2 == null || ((zzck) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int zzu = zzu(obj, true) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        zzcc zzccVar = this.zzd;
        int zzv = zzv(obj, false);
        if (zzv == zzccVar.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int zzu = zzu(obj, false) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zza(Object[] objArr, int i) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    public final zzdc zzd() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final Object[] zze() {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzck
    final zzck zzf() {
        Comparator reverseOrder = Collections.reverseOrder(((zzck) this).zza);
        return isEmpty() ? zzck.zzs(reverseOrder) : new zzcv(this.zzd.zzf(), reverseOrder);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzck
    final zzck zzo(Object obj, boolean z) {
        return zzw(0, zzu(obj, z));
    }

    @Override // com.google.android.gms.internal.fido.zzck
    final zzck zzq(Object obj, boolean z, Object obj2, boolean z2) {
        return zzr(obj, z).zzo(obj2, z2);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    final zzck zzr(Object obj, boolean z) {
        return zzw(zzv(obj, z), this.zzd.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final zzdc descendingIterator() {
        return this.zzd.zzf().listIterator(0);
    }

    final zzcv zzw(int i, int i2) {
        if (i == 0) {
            if (i2 == this.zzd.size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return zzck.zzs(((zzck) this).zza);
        }
        zzcc zzccVar = this.zzd;
        return new zzcv(zzccVar.subList(i, i2), ((zzck) this).zza);
    }

    final int zzu(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.zzd, obj, ((zzck) this).zza);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    final int zzv(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.zzd, obj, ((zzck) this).zza);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }
}
