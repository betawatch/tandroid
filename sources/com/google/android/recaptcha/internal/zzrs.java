package com.google.android.recaptcha.internal;

import aa.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzrs extends zzpz implements RandomAccess, zzsu, zzub {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzrs(dArr, 0, false);
    }

    public zzrs() {
        this(zza, 0, true);
    }

    private static int zzh(int i9) {
        return Math.max(((i9 * 3) / 2) + 1, 10);
    }

    private final String zzi(int i9) {
        return d.k(i9, this.zzc, "Index:", ", Size:");
    }

    private final void zzj(int i9) {
        if (i9 < 0 || i9 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i9));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i9));
        }
        int i11 = i9 + 1;
        double[] dArr = this.zzb;
        int length = dArr.length;
        if (i10 < length) {
            System.arraycopy(dArr, i9, dArr, i11, i10 - i9);
        } else {
            double[] dArr2 = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i9);
            System.arraycopy(this.zzb, i9, dArr2, i11, this.zzc - i9);
            this.zzb = dArr2;
        }
        this.zzb[i9] = doubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzsv.zzb;
        collection.getClass();
        if (!(collection instanceof zzrs)) {
            return super.addAll(collection);
        }
        zzrs zzrsVar = (zzrs) collection;
        int i9 = zzrsVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        double[] dArr = this.zzb;
        if (i11 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(zzrsVar.zzb, 0, this.zzb, this.zzc, zzrsVar.zzc);
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
        if (!(obj instanceof zzrs)) {
            return super.equals(obj);
        }
        zzrs zzrsVar = (zzrs) obj;
        if (this.zzc != zzrsVar.zzc) {
            return false;
        }
        double[] dArr = zzrsVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (Double.doubleToLongBits(this.zzb[i9]) != Double.doubleToLongBits(dArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzj(i9);
        return Double.valueOf(this.zzb[i9]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i10]);
            byte[] bArr = zzsv.zzb;
            i9 = (i9 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i9 = this.zzc;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzb[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        zzj(i9);
        double[] dArr = this.zzb;
        double d = dArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(dArr, i9 + 1, dArr, i9, (r3 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i10, dArr, i9, this.zzc - i10);
        this.zzc -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzj(i9);
        double[] dArr = this.zzb;
        double d = dArr[i9];
        dArr[i9] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    public final /* bridge */ /* synthetic */ zzsu zzd(int i9) {
        if (i9 >= this.zzc) {
            return new zzrs(i9 == 0 ? zza : Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i9) {
        zzj(i9);
        return this.zzb[i9];
    }

    public final void zzf(double d) {
        zza();
        int i9 = this.zzc;
        int length = this.zzb.length;
        if (i9 == length) {
            double[] dArr = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        dArr2[i10] = d;
    }

    public final void zzg(int i9) {
        int length = this.zzb.length;
        if (i9 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new double[Math.max(i9, 10)];
            return;
        }
        while (length < i9) {
            length = zzh(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzrs(double[] dArr, int i9, boolean z10) {
        super(z10);
        this.zzb = dArr;
        this.zzc = i9;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
