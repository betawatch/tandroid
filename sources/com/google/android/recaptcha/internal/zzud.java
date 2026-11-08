package com.google.android.recaptcha.internal;

import a8.p0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzud extends zzpz implements RandomAccess {
    private static final Object[] zza;
    private static final zzud zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzud(objArr, 0, false);
    }

    public zzud() {
        this(zza, 0, true);
    }

    public static zzud zze() {
        return zzb;
    }

    private static int zzg(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i7) {
        return p0.m(i7, this.zzd, "Index:", ", Size:");
    }

    private final void zzi(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
        int i11 = i7 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i7, objArr, i11, i10 - i7);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i7);
            System.arraycopy(this.zzc, i7, objArr2, i11, this.zzd - i7);
            this.zzc = objArr2;
        }
        this.zzc[i7] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        zzi(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        zza();
        zzi(i7);
        Object[] objArr = this.zzc;
        Object obj = objArr[i7];
        if (i7 < this.zzd - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        zza();
        zzi(i7);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    public final /* bridge */ /* synthetic */ zzsu zzd(int i7) {
        if (i7 >= this.zzd) {
            return new zzud(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzg(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzud(Object[] objArr, int i7, boolean z9) {
        super(z9);
        this.zzc = objArr;
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
