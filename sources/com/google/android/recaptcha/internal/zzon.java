package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzon implements Iterator {
    final /* synthetic */ zzoo zza;
    private int zzb = 0;

    public zzon(zzoo zzooVar) {
        this.zza = zzooVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.zzb;
        zzoo zzooVar = this.zza;
        return i9 < zzooVar.zza() - zzooVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr;
        int i9 = this.zzb;
        zzoo zzooVar = this.zza;
        if (i9 >= zzooVar.zza() - zzooVar.zzb()) {
            throw new NoSuchElementException();
        }
        objArr = zzooVar.zzb.zzb;
        Object obj = objArr[zzooVar.zzb() + i9];
        this.zzb = i9 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
