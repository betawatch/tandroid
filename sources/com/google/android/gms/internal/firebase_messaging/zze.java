package com.google.android.gms.internal.firebase_messaging;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zze {
    private static final zzae zza;

    static {
        zzad zzadVar = new zzad();
        zzd.zza.configure(zzadVar);
        zza = zzadVar.zza();
    }

    public static byte[] zza(Object obj) {
        zzae zzaeVar = zza;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            zzaeVar.zza(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
