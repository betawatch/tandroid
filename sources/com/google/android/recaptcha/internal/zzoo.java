package com.google.android.recaptcha.internal;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzoo extends AbstractSet {
    final int zza = -1;
    final /* synthetic */ zzop zzb;

    public zzoo(zzop zzopVar, int i) {
        this.zzb = zzopVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr;
        int i = this.zza;
        objArr = this.zzb.zzb;
        return Arrays.binarySearch(objArr, zzb(), zza(), obj, i == -1 ? zzop.zza : zzor.zza) >= 0;
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
        int i = this.zza;
        iArr = this.zzb.zzc;
        return iArr[i + 1];
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
