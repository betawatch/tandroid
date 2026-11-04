package com.google.android.recaptcha.internal;

import a1.g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    private static int zzg(int i3) {
        return Math.max(((i3 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i3) {
        return g.n(i3, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i3) {
        if (i3 < 0 || i3 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i3));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i3, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i3 < 0 || i3 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i3));
        }
        int i11 = i3 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i10 < length) {
            System.arraycopy(zArr, i3, zArr, i11, i10 - i3);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i3);
            System.arraycopy(this.zzb, i3, zArr2, i11, this.zzc - i3);
            this.zzb = zArr2;
        }
        this.zzb[i3] = booleanValue;
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
        int i3 = zzqdVar.zzc;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
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
        for (int i3 = 0; i3 < this.zzc; i3++) {
            if (this.zzb[i3] != zArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        zzi(i3);
        return Boolean.valueOf(this.zzb[i3]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i3 = (i3 * 31) + zzsv.zza(this.zzb[i10]);
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i3 = this.zzc;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.zzb[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        zza();
        zzi(i3);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i3];
        if (i3 < this.zzc - 1) {
            System.arraycopy(zArr, i3 + 1, zArr, i3, (r2 - i3) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        zza();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i10, zArr, i3, this.zzc - i10);
        this.zzc -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzi(i3);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i3];
        zArr[i3] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    public final /* bridge */ /* synthetic */ zzsu zzd(int i3) {
        if (i3 >= this.zzc) {
            return new zzqd(i3 == 0 ? zza : Arrays.copyOf(this.zzb, i3), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z10) {
        zza();
        int i3 = this.zzc;
        int length = this.zzb.length;
        if (i3 == length) {
            boolean[] zArr = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zArr2[i10] = z10;
    }

    public final boolean zzf(int i3) {
        zzi(i3);
        return this.zzb[i3];
    }

    private zzqd(boolean[] zArr, int i3, boolean z10) {
        super(z10);
        this.zzb = zArr;
        this.zzc = i3;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
