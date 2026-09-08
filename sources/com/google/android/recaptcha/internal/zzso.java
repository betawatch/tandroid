package com.google.android.recaptcha.internal;

import a4.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzso extends zzpz implements RandomAccess, zzss, zzub {
    private static final int[] zza;
    private static final zzso zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzso(iArr, 0, false);
    }

    public zzso() {
        this(zza, 0, true);
    }

    public static zzso zzf() {
        return zzb;
    }

    private static int zzj(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i10) {
        return a.l(i10, this.zzd, "Index:", ", Size:");
    }

    private final void zzl(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i10));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i10);
            System.arraycopy(this.zzc, i10, iArr2, i12, this.zzd - i10);
            this.zzc = iArr2;
        }
        this.zzc[i10] = intValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzsv.zzb;
        collection.getClass();
        if (!(collection instanceof zzso)) {
            return super.addAll(collection);
        }
        zzso zzsoVar = (zzso) collection;
        int i10 = zzsoVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.zzc;
        if (i12 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(zzsoVar.zzc, 0, this.zzc, this.zzd, zzsoVar.zzd);
        this.zzd = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzso)) {
            return super.equals(obj);
        }
        zzso zzsoVar = (zzso) obj;
        if (this.zzd != zzsoVar.zzd) {
            return false;
        }
        int[] iArr = zzsoVar.zzc;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            if (this.zzc[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzl(i10);
        return Integer.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            i10 = (i10 * 31) + this.zzc[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.zzd;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzc[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzl(i10);
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i11, iArr, i10, this.zzd - i11);
        this.zzd -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzl(i10);
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final int zze(int i10) {
        zzl(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzss zzd(int i10) {
        if (i10 >= this.zzd) {
            return new zzso(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.recaptcha.internal.zzss
    public final void zzh(int i10) {
        zza();
        int i11 = this.zzd;
        int length = this.zzc.length;
        if (i11 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i12 = this.zzd;
        this.zzd = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void zzi(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzso(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.zzc = iArr;
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
