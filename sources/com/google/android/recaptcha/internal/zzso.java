package com.google.android.recaptcha.internal;

import a8.p0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    private static int zzj(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i7) {
        return p0.m(i7, this.zzd, "Index:", ", Size:");
    }

    private final void zzl(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
        int i11 = i7 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i7, iArr, i11, i10 - i7);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i7);
            System.arraycopy(this.zzc, i7, iArr2, i11, this.zzd - i7);
            this.zzc = iArr2;
        }
        this.zzc[i7] = intValue;
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
        int i7 = zzsoVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
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
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzl(i7);
        return Integer.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            i7 = (i7 * 31) + this.zzc[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.zzd;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzc[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzl(i7);
        int[] iArr = this.zzc;
        int i10 = iArr[i7];
        if (i7 < this.zzd - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i10, iArr, i7, this.zzd - i10);
        this.zzd -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzl(i7);
        int[] iArr = this.zzc;
        int i10 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final int zze(int i7) {
        zzl(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzss zzd(int i7) {
        if (i7 >= this.zzd) {
            return new zzso(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.recaptcha.internal.zzss
    public final void zzh(int i7) {
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
        iArr2[i11] = i7;
    }

    public final void zzi(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzso(int[] iArr, int i7, boolean z9) {
        super(z9);
        this.zzc = iArr;
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
