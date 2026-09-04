package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
