package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public final class zzbv {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzbu zzc;

    public final zzbv zza(Object obj, Object obj2) {
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 > length) {
                length = length + (length >> 1) + 1;
                if (length < i2) {
                    int highestOneBit = Integer.highestOneBit(i2 - 1);
                    length = highestOneBit + highestOneBit;
                }
                if (length < 0) {
                    length = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
            }
            this.zza = Arrays.copyOf(objArr, length);
        }
        zzbo.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.zzb = i3 + 1;
        return this;
    }

    public final zzbw zzb() {
        zzbu zzbuVar = this.zzc;
        if (zzbuVar != null) {
            throw zzbuVar.zza();
        }
        zzcf zzg = zzcf.zzg(this.zzb, this.zza, this);
        zzbu zzbuVar2 = this.zzc;
        if (zzbuVar2 == null) {
            return zzg;
        }
        throw zzbuVar2.zza();
    }
}
