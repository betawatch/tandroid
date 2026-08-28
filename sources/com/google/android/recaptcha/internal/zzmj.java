package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzmj extends zzmn implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzmj(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException(zzmg.zza("maxSize (%s) must >= 0", Integer.valueOf(i9)));
        }
        this.zzb = new ArrayDeque(i9);
        this.zza = i9;
    }

    public static zzmj zza(int i9) {
        return new zzmj(i9);
    }

    @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        int i9 = this.zza;
        if (i9 == 0) {
            return true;
        }
        if (size() == i9) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i9 = this.zza;
        if (size < i9) {
            return zzmq.zza(this, collection.iterator());
        }
        clear();
        int i10 = size - i9;
        zzmd.zzb(i10 >= 0, "number to skip cannot be negative");
        return zzmq.zza(this, new zzmp(collection, i10).iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzmn, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzml, com.google.android.recaptcha.internal.zzmm
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmn, com.google.android.recaptcha.internal.zzml
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmn
    public final Queue zzd() {
        return this.zzb;
    }
}
