package com.google.android.recaptcha.internal;

import a1.g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    private static int zzh(int i3) {
        return Math.max(((i3 * 3) / 2) + 1, 10);
    }

    private final String zzi(int i3) {
        return g.n(i3, this.zzc, "Index:", ", Size:");
    }

    private final void zzj(int i3) {
        if (i3 < 0 || i3 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i3));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i3, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i3 < 0 || i3 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i3));
        }
        int i11 = i3 + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i10 < length) {
            System.arraycopy(fArr, i3, fArr, i11, i10 - i3);
        } else {
            float[] fArr2 = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i3);
            System.arraycopy(this.zzb, i3, fArr2, i11, this.zzc - i3);
            this.zzb = fArr2;
        }
        this.zzb[i3] = floatValue;
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
        int i3 = zzsfVar.zzc;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
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
        for (int i3 = 0; i3 < this.zzc; i3++) {
            if (Float.floatToIntBits(this.zzb[i3]) != Float.floatToIntBits(fArr[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        zzj(i3);
        return Float.valueOf(this.zzb[i3]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i3 = (i3 * 31) + Float.floatToIntBits(this.zzb[i10]);
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i3 = this.zzc;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.zzb[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        zza();
        zzj(i3);
        float[] fArr = this.zzb;
        float f10 = fArr[i3];
        if (i3 < this.zzc - 1) {
            System.arraycopy(fArr, i3 + 1, fArr, i3, (r2 - i3) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        zza();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i10, fArr, i3, this.zzc - i10);
        this.zzc -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzj(i3);
        float[] fArr = this.zzb;
        float f10 = fArr[i3];
        fArr[i3] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    public final /* bridge */ /* synthetic */ zzsu zzd(int i3) {
        if (i3 >= this.zzc) {
            return new zzsf(i3 == 0 ? zza : Arrays.copyOf(this.zzb, i3), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i3) {
        zzj(i3);
        return this.zzb[i3];
    }

    public final void zzf(float f10) {
        zza();
        int i3 = this.zzc;
        int length = this.zzb.length;
        if (i3 == length) {
            float[] fArr = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        fArr2[i10] = f10;
    }

    public final void zzg(int i3) {
        int length = this.zzb.length;
        if (i3 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new float[Math.max(i3, 10)];
            return;
        }
        while (length < i3) {
            length = zzh(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzsf(float[] fArr, int i3, boolean z10) {
        super(z10);
        this.zzb = fArr;
        this.zzc = i3;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
