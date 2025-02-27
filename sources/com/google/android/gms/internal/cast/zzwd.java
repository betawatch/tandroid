package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzwd implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzwe zzb;

    zzwd(zzwe zzweVar) {
        zzuf zzufVar;
        this.zzb = zzweVar;
        zzufVar = zzweVar.zza;
        this.zza = zzufVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
