package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public abstract class zzcv extends zzcj implements Set, j$.util.Set {
    private transient zzco zza;

    zzcv() {
    }

    static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return TLObject.FLAG_30;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcv) && zzk() && ((zzcv) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzds.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public zzco zzd() {
        zzco zzcoVar = this.zza;
        if (zzcoVar != null) {
            return zzcoVar;
        }
        zzco zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    zzco zzi() {
        Object[] array = toArray();
        int i = zzco.$r8$clinit;
        return zzco.zzj(array, array.length);
    }

    boolean zzk() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcv zzl(int i, Object... objArr) {
        if (i == 0) {
            return zzdq.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzdt(obj);
        }
        int zzh = zzh(i);
        Object[] objArr2 = new Object[zzh];
        int i2 = zzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzdd.zza(obj2, i5);
            int hashCode = obj2.hashCode();
            int zza = zzcg.zza(hashCode);
            while (true) {
                int i6 = zza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzdt(obj4);
        }
        if (zzh(i4) < zzh / 2) {
            return zzl(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzdq(objArr, i3, objArr2, i2, i4);
    }
}
