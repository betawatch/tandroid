package com.google.android.recaptcha.internal;

import a8.p0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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

    private static int zzg(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i7) {
        return p0.m(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
        int i11 = i7 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i10 < length) {
            System.arraycopy(zArr, i7, zArr, i11, i10 - i7);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i7);
            System.arraycopy(this.zzb, i7, zArr2, i11, this.zzc - i7);
            this.zzb = zArr2;
        }
        this.zzb[i7] = booleanValue;
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
        int i7 = zzqdVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
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
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzi(i7);
        return Boolean.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i7 = (i7 * 31) + zzsv.zza(this.zzb[i10]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzc;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzb[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzi(i7);
        boolean[] zArr = this.zzb;
        boolean z9 = zArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i10, zArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzi(i7);
        boolean[] zArr = this.zzb;
        boolean z9 = zArr[i7];
        zArr[i7] = booleanValue;
        return Boolean.valueOf(z9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    public final /* bridge */ /* synthetic */ zzsu zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzqd(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z9) {
        zza();
        int i7 = this.zzc;
        int length = this.zzb.length;
        if (i7 == length) {
            boolean[] zArr = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zArr2[i10] = z9;
    }

    public final boolean zzf(int i7) {
        zzi(i7);
        return this.zzb[i7];
    }

    private zzqd(boolean[] zArr, int i7, boolean z9) {
        super(z9);
        this.zzb = zArr;
        this.zzc = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
