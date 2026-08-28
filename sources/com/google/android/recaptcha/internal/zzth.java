package com.google.android.recaptcha.internal;

import aa.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzth extends zzpz implements RandomAccess, zzst, zzub {
    private static final long[] zza;
    private static final zzth zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzth(jArr, 0, false);
    }

    public zzth() {
        this(zza, 0, true);
    }

    public static zzth zzf() {
        return zzb;
    }

    private static int zzi(int i9) {
        return Math.max(((i9 * 3) / 2) + 1, 10);
    }

    private final String zzj(int i9) {
        return d.k(i9, this.zzd, "Index:", ", Size:");
    }

    private final void zzk(int i9) {
        if (i9 < 0 || i9 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i9));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i9));
        }
        int i11 = i9 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i9, jArr, i11, i10 - i9);
        } else {
            long[] jArr2 = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i9);
            System.arraycopy(this.zzc, i9, jArr2, i11, this.zzd - i9);
            this.zzc = jArr2;
        }
        this.zzc[i9] = longValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzsv.zzb;
        collection.getClass();
        if (!(collection instanceof zzth)) {
            return super.addAll(collection);
        }
        zzth zzthVar = (zzth) collection;
        int i9 = zzthVar.zzd;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        long[] jArr = this.zzc;
        if (i11 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(zzthVar.zzc, 0, this.zzc, this.zzd, zzthVar.zzd);
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
        if (!(obj instanceof zzth)) {
            return super.equals(obj);
        }
        zzth zzthVar = (zzth) obj;
        if (this.zzd != zzthVar.zzd) {
            return false;
        }
        long[] jArr = zzthVar.zzc;
        for (int i9 = 0; i9 < this.zzd; i9++) {
            if (this.zzc[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzk(i9);
        return Long.valueOf(this.zzc[i9]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            long j10 = this.zzc[i10];
            byte[] bArr = zzsv.zzb;
            i9 = (i9 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i9 = this.zzd;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzc[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        zzk(i9);
        long[] jArr = this.zzc;
        long j10 = jArr[i9];
        if (i9 < this.zzd - 1) {
            System.arraycopy(jArr, i9 + 1, jArr, i9, (r3 - i9) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i10, jArr, i9, this.zzd - i10);
        this.zzd -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzk(i9);
        long[] jArr = this.zzc;
        long j10 = jArr[i9];
        jArr[i9] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    public final /* bridge */ /* synthetic */ zzsu zzd(int i9) {
        if (i9 >= this.zzd) {
            return new zzth(i9 == 0 ? zza : Arrays.copyOf(this.zzc, i9), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i9) {
        zzk(i9);
        return this.zzc[i9];
    }

    public final void zzg(long j10) {
        zza();
        int i9 = this.zzd;
        int length = this.zzc.length;
        if (i9 == length) {
            long[] jArr = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        jArr2[i10] = j10;
    }

    public final void zzh(int i9) {
        int length = this.zzc.length;
        if (i9 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i9, 10)];
            return;
        }
        while (length < i9) {
            length = zzi(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzth(long[] jArr, int i9, boolean z10) {
        super(z10);
        this.zzc = jArr;
        this.zzd = i9;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
