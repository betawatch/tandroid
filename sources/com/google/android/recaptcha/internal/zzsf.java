package com.google.android.recaptcha.internal;

import aa.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzsf extends zzpz implements RandomAccess, zzsu, zzub {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzsf(fArr, 0, false);
    }

    public zzsf() {
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
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i9));
        }
        int i11 = i9 + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i10 < length) {
            System.arraycopy(fArr, i9, fArr, i11, i10 - i9);
        } else {
            float[] fArr2 = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i9);
            System.arraycopy(this.zzb, i9, fArr2, i11, this.zzc - i9);
            this.zzb = fArr2;
        }
        this.zzb[i9] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzsv.zzb;
        collection.getClass();
        if (!(collection instanceof zzsf)) {
            return super.addAll(collection);
        }
        zzsf zzsfVar = (zzsf) collection;
        int i9 = zzsfVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        float[] fArr = this.zzb;
        if (i11 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(zzsfVar.zzb, 0, this.zzb, this.zzc, zzsfVar.zzc);
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
        if (!(obj instanceof zzsf)) {
            return super.equals(obj);
        }
        zzsf zzsfVar = (zzsf) obj;
        if (this.zzc != zzsfVar.zzc) {
            return false;
        }
        float[] fArr = zzsfVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (Float.floatToIntBits(this.zzb[i9]) != Float.floatToIntBits(fArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzj(i9);
        return Float.valueOf(this.zzb[i9]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i9 = (i9 * 31) + Float.floatToIntBits(this.zzb[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i9 = this.zzc;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzb[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        zzj(i9);
        float[] fArr = this.zzb;
        float f10 = fArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(fArr, i9 + 1, fArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i10, fArr, i9, this.zzc - i10);
        this.zzc -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzj(i9);
        float[] fArr = this.zzb;
        float f10 = fArr[i9];
        fArr[i9] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    public final /* bridge */ /* synthetic */ zzsu zzd(int i9) {
        if (i9 >= this.zzc) {
            return new zzsf(i9 == 0 ? zza : Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i9) {
        zzj(i9);
        return this.zzb[i9];
    }

    public final void zzf(float f10) {
        zza();
        int i9 = this.zzc;
        int length = this.zzb.length;
        if (i9 == length) {
            float[] fArr = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        fArr2[i10] = f10;
    }

    public final void zzg(int i9) {
        int length = this.zzb.length;
        if (i9 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new float[Math.max(i9, 10)];
            return;
        }
        while (length < i9) {
            length = zzh(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzsf(float[] fArr, int i9, boolean z10) {
        super(z10);
        this.zzb = fArr;
        this.zzc = i9;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
