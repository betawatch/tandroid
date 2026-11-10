package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzon implements Iterator {
    final /* synthetic */ zzoo zza;
    private int zzb = 0;

    public zzon(zzoo zzooVar) {
        this.zza = zzooVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.zzb;
        zzoo zzooVar = this.zza;
        return i7 < zzooVar.zza() - zzooVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr;
        int i7 = this.zzb;
        zzoo zzooVar = this.zza;
        if (i7 >= zzooVar.zza() - zzooVar.zzb()) {
            throw new NoSuchElementException();
        }
        objArr = zzooVar.zzb.zzb;
        Object obj = objArr[zzooVar.zzb() + i7];
        this.zzb = i7 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
