package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzcz extends zzdw {
    private final Object zza;
    private boolean zzb;

    zzcz(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
