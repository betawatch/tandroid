package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class zzml extends zzmm implements Collection {
    public boolean add(Object obj) {
        return zzc().add(obj);
    }

    public boolean addAll(Collection collection) {
        return zzc().addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        zzc().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return zzc().contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return zzc().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return zzc().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return zzc().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return zzc().remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return zzc().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return zzc().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return zzc().size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return zzc().toArray();
    }

    @Override // com.google.android.recaptcha.internal.zzmm
    public /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    public abstract Collection zzc();

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zzc().toArray(objArr);
    }
}
