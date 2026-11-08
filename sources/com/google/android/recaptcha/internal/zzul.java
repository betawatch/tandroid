package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
final class zzul implements Iterator {
    final /* synthetic */ zzuo zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        Map map;
        int i10 = this.zzb + 1;
        zzuo zzuoVar = this.zza;
        i7 = zzuoVar.zzb;
        if (i10 < i7) {
            return true;
        }
        map = zzuoVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i7;
        Object[] objArr;
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzuo zzuoVar = this.zza;
        i7 = zzuoVar.zzb;
        if (i10 >= i7) {
            return (Map.Entry) zza().next();
        }
        objArr = zzuoVar.zza;
        return (zzuk) objArr[i10];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzuo zzuoVar = this.zza;
        zzuoVar.zzo();
        int i10 = this.zzb;
        i7 = zzuoVar.zzb;
        if (i10 >= i7) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzuoVar.zzm(i10);
        }
    }
}
