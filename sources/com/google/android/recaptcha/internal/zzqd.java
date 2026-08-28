package com.google.android.recaptcha.internal;

import aa.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzqd extends zzpz implements RandomAccess, zzsu, zzub {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzqd(zArr, 0, false);
    }

    public zzqd() {
        this(zza, 0, true);
    }

    private static int zzg(int i9) {
        return Math.max(((i9 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i9) {
        return d.k(i9, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i9) {
        if (i9 < 0 || i9 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i9));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i9));
        }
        int i11 = i9 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i10 < length) {
            System.arraycopy(zArr, i9, zArr, i11, i10 - i9);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i9);
            System.arraycopy(this.zzb, i9, zArr2, i11, this.zzc - i9);
            this.zzb = zArr2;
        }
        this.zzb[i9] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzsv.zzb;
        collection.getClass();
        if (!(collection instanceof zzqd)) {
            return super.addAll(collection);
        }
        zzqd zzqdVar = (zzqd) collection;
        int i9 = zzqdVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        boolean[] zArr = this.zzb;
        if (i11 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(zzqdVar.zzb, 0, this.zzb, this.zzc, zzqdVar.zzc);
        this.zzc = i11;
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
        if (!(obj instanceof zzqd)) {
            return super.equals(obj);
        }
        zzqd zzqdVar = (zzqd) obj;
        if (this.zzc != zzqdVar.zzc) {
            return false;
        }
        boolean[] zArr = zzqdVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (this.zzb[i9] != zArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzi(i9);
        return Boolean.valueOf(this.zzb[i9]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i9 = (i9 * 31) + zzsv.zza(this.zzb[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i9 = this.zzc;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzb[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        zzi(i9);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(zArr, i9 + 1, zArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i10, zArr, i9, this.zzc - i10);
        this.zzc -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzi(i9);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i9];
        zArr[i9] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    public final /* bridge */ /* synthetic */ zzsu zzd(int i9) {
        if (i9 >= this.zzc) {
            return new zzqd(i9 == 0 ? zza : Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z10) {
        zza();
        int i9 = this.zzc;
        int length = this.zzb.length;
        if (i9 == length) {
            boolean[] zArr = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zArr2[i10] = z10;
    }

    public final boolean zzf(int i9) {
        zzi(i9);
        return this.zzb[i9];
    }

    private zzqd(boolean[] zArr, int i9, boolean z10) {
        super(z10);
        this.zzb = zArr;
        this.zzc = i9;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
