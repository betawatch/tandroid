package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzmj extends zzmn implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzmj(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(zzmg.zza("maxSize (%s) must >= 0", Integer.valueOf(i3)));
        }
        this.zzb = new ArrayDeque(i3);
        this.zza = i3;
    }

    public static zzmj zza(int i3) {
        return new zzmj(i3);
    }

    @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        int i3 = this.zza;
        if (i3 == 0) {
            return true;
        }
        if (size() == i3) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i3 = this.zza;
        if (size < i3) {
            return zzmq.zza(this, collection.iterator());
        }
        clear();
        int i10 = size - i3;
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
