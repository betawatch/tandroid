package com.google.android.recaptcha.internal;

import aa.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    private static int zzj(int i9) {
        return Math.max(((i9 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i9) {
        return d.k(i9, this.zzd, "Index:", ", Size:");
    }

    private final void zzl(int i9) {
        if (i9 < 0 || i9 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i9));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i9));
        }
        int i11 = i9 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i9, iArr, i11, i10 - i9);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i9);
            System.arraycopy(this.zzc, i9, iArr2, i11, this.zzd - i9);
            this.zzc = iArr2;
        }
        this.zzc[i9] = intValue;
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
        int i9 = zzsoVar.zzd;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        int[] iArr = this.zzc;
        if (i11 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(zzsoVar.zzc, 0, this.zzc, this.zzd, zzsoVar.zzd);
        this.zzd = i11;
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
        for (int i9 = 0; i9 < this.zzd; i9++) {
            if (this.zzc[i9] != iArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzl(i9);
        return Integer.valueOf(this.zzc[i9]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            i9 = (i9 * 31) + this.zzc[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i9 = this.zzd;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzc[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        zzl(i9);
        int[] iArr = this.zzc;
        int i10 = iArr[i9];
        if (i9 < this.zzd - 1) {
            System.arraycopy(iArr, i9 + 1, iArr, i9, (r2 - i9) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i10, iArr, i9, this.zzd - i10);
        this.zzd -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzl(i9);
        int[] iArr = this.zzc;
        int i10 = iArr[i9];
        iArr[i9] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final int zze(int i9) {
        zzl(i9);
        return this.zzc[i9];
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzss zzd(int i9) {
        if (i9 >= this.zzd) {
            return new zzso(i9 == 0 ? zza : Arrays.copyOf(this.zzc, i9), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.recaptcha.internal.zzss
    public final void zzh(int i9) {
        zza();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        iArr2[i11] = i9;
    }

    public final void zzi(int i9) {
        int length = this.zzc.length;
        if (i9 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i9, 10)];
            return;
        }
        while (length < i9) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzso(int[] iArr, int i9, boolean z10) {
        super(z10);
        this.zzc = iArr;
        this.zzd = i9;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
