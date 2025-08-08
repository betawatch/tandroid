package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzfv implements zzim {
    protected int zza = 0;

    protected static void zzg(Iterable iterable, List list) {
        zzfu.zzc(iterable, list);
    }

    abstract int zze(zzix zzixVar);

    public final byte[] zzh() {
        try {
            int zzk = zzk();
            byte[] bArr = new byte[zzk];
            zzgo zzgoVar = new zzgo(bArr, 0, zzk);
            zzJ(zzgoVar);
            zzgoVar.zzB();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
