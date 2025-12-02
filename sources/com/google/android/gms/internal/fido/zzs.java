package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

/* loaded from: classes.dex */
public final class zzs extends zza implements IInterface {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        Parcel zza = zza();
        int i = zzc.$r8$clinit;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, publicKeyCredentialCreationOptions);
        zzb(1, zza);
    }
}
