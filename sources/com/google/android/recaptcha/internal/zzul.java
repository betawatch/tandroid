package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzul implements Iterator {
    final /* synthetic */ zzuo zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        Map map;
        Iterator it = this.zzd;
        if (it != null) {
            return it;
        }
        map = this.zza.zzc;
        Iterator it2 = map.entrySet().iterator();
        this.zzd = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        Map map;
        int i2 = this.zzb + 1;
        zzuo zzuoVar = this.zza;
        i = zzuoVar.zzb;
        if (i2 < i) {
            return true;
        }
        map = zzuoVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i;
        Object[] objArr;
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        zzuo zzuoVar = this.zza;
        i = zzuoVar.zzb;
        if (i2 >= i) {
            return (Map.Entry) zza().next();
        }
        objArr = zzuoVar.zza;
        return (zzuk) objArr[i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (!this.zzc) {
            grb.i("remove() was called before next()");
            return;
        }
        this.zzc = false;
        zzuo zzuoVar = this.zza;
        zzuoVar.zzo();
        int i2 = this.zzb;
        i = zzuoVar.zzb;
        if (i2 >= i) {
            zza().remove();
        } else {
            this.zzb = i2 - 1;
            zzuoVar.zzm(i2);
        }
    }
}
