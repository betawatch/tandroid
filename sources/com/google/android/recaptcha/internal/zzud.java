package com.google.android.recaptcha.internal;

import aa.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    private static int zzg(int i9) {
        return Math.max(((i9 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i9) {
        return d.k(i9, this.zzd, "Index:", ", Size:");
    }

    private final void zzi(int i9) {
        if (i9 < 0 || i9 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzh(i9));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzh(i9));
        }
        int i11 = i9 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i9, objArr, i11, i10 - i9);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i9);
            System.arraycopy(this.zzc, i9, objArr2, i11, this.zzd - i9);
            this.zzc = objArr2;
        }
        this.zzc[i9] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        zzi(i9);
        return this.zzc[i9];
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        zza();
        zzi(i9);
        Object[] objArr = this.zzc;
        Object obj = objArr[i9];
        if (i9 < this.zzd - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        zza();
        zzi(i9);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    public final /* bridge */ /* synthetic */ zzsu zzd(int i9) {
        if (i9 >= this.zzd) {
            return new zzud(i9 == 0 ? zza : Arrays.copyOf(this.zzc, i9), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(int i9) {
        int length = this.zzc.length;
        if (i9 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i9, 10)];
            return;
        }
        while (length < i9) {
            length = zzg(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzud(Object[] objArr, int i9, boolean z10) {
        super(z10);
        this.zzc = objArr;
        this.zzd = i9;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i9 = this.zzd;
        int length = this.zzc.length;
        if (i9 == length) {
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
