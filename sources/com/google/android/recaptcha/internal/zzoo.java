package com.google.android.recaptcha.internal;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzoo extends AbstractSet {
    final int zza = -1;
    final /* synthetic */ zzop zzb;

    public zzoo(zzop zzopVar, int i7) {
        this.zzb = zzopVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr;
        int i7 = this.zza;
        objArr = this.zzb.zzb;
        return Arrays.binarySearch(objArr, zzb(), zza(), obj, i7 == -1 ? zzop.zza : zzor.zza) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzon(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza() - zzb();
    }

    public final int zza() {
        int[] iArr;
        int i7 = this.zza;
        iArr = this.zzb.zzc;
        return iArr[i7 + 1];
    }

    public final int zzb() {
        int[] iArr;
        if (this.zza == -1) {
            return 0;
        }
        iArr = this.zzb.zzc;
        return iArr[0];
    }
}
