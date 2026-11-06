package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
