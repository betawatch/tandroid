package com.google.android.recaptcha.internal;

import a1.g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    private static int zzj(int i3) {
        return Math.max(((i3 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i3) {
        return g.n(i3, this.zzd, "Index:", ", Size:");
    }

    private final void zzl(int i3) {
        if (i3 < 0 || i3 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i3));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i3, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i3 < 0 || i3 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i3));
        }
        int i11 = i3 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i3, iArr, i11, i10 - i3);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i3);
            System.arraycopy(this.zzc, i3, iArr2, i11, this.zzd - i3);
            this.zzc = iArr2;
        }
        this.zzc[i3] = intValue;
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
        int i3 = zzsoVar.zzd;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
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
        for (int i3 = 0; i3 < this.zzd; i3++) {
            if (this.zzc[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        zzl(i3);
        return Integer.valueOf(this.zzc[i3]);
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            i3 = (i3 * 31) + this.zzc[i10];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i3 = this.zzd;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.zzc[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        zza();
        zzl(i3);
        int[] iArr = this.zzc;
        int i10 = iArr[i3];
        if (i3 < this.zzd - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (r2 - i3) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        zza();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i10, iArr, i3, this.zzd - i10);
        this.zzd -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzl(i3);
        int[] iArr = this.zzc;
        int i10 = iArr[i3];
        iArr[i3] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final int zze(int i3) {
        zzl(i3);
        return this.zzc[i3];
    }

    @Override // com.google.android.recaptcha.internal.zzsu
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzss zzd(int i3) {
        if (i3 >= this.zzd) {
            return new zzso(i3 == 0 ? zza : Arrays.copyOf(this.zzc, i3), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.recaptcha.internal.zzss
    public final void zzh(int i3) {
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
        iArr2[i11] = i3;
    }

    public final void zzi(int i3) {
        int length = this.zzc.length;
        if (i3 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i3, 10)];
            return;
        }
        while (length < i3) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzso(int[] iArr, int i3, boolean z10) {
        super(z10);
        this.zzc = iArr;
        this.zzd = i3;
    }

    @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
