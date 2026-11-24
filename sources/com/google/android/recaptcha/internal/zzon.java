package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzon implements Iterator {
    final /* synthetic */ zzoo zza;
    private int zzb = 0;

    public zzon(zzoo zzooVar) {
        this.zza = zzooVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zzoo zzooVar = this.zza;
        return i < zzooVar.zza() - zzooVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr;
        int i = this.zzb;
        zzoo zzooVar = this.zza;
        if (i >= zzooVar.zza() - zzooVar.zzb()) {
            u36.g();
            return null;
        }
        objArr = zzooVar.zzb.zzb;
        Object obj = objArr[zzooVar.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
