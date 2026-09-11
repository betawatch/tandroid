package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class zzmj extends zzmn implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzmj(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(zzmg.zza("maxSize (%s) must >= 0", Integer.valueOf(i10)));
        }
        this.zzb = new ArrayDeque(i10);
        this.zza = i10;
    }

    public static zzmj zza(int i10) {
        return new zzmj(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        int i10 = this.zza;
        if (i10 == 0) {
            return true;
        }
        if (size() == i10) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i10 = this.zza;
        if (size < i10) {
            return zzmq.zza(this, collection.iterator());
        }
        clear();
        int i11 = size - i10;
        zzmd.zzb(i11 >= 0, "number to skip cannot be negative");
        return zzmq.zza(this, new zzmp(collection, i11).iterator());
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
