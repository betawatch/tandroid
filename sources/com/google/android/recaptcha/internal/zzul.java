package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int i10;
        Map map;
        int i11 = this.zzb + 1;
        zzuo zzuoVar = this.zza;
        i10 = zzuoVar.zzb;
        if (i11 < i10) {
            return true;
        }
        map = zzuoVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10;
        Object[] objArr;
        this.zzc = true;
        int i11 = this.zzb + 1;
        this.zzb = i11;
        zzuo zzuoVar = this.zza;
        i10 = zzuoVar.zzb;
        if (i11 >= i10) {
            return (Map.Entry) zza().next();
        }
        objArr = zzuoVar.zza;
        return (zzuk) objArr[i11];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzuo zzuoVar = this.zza;
        zzuoVar.zzo();
        int i11 = this.zzb;
        i10 = zzuoVar.zzb;
        if (i11 >= i10) {
            zza().remove();
        } else {
            this.zzb = i11 - 1;
            zzuoVar.zzm(i11);
        }
    }
}
