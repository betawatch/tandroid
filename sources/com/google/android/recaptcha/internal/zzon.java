package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
            lq5.n();
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
