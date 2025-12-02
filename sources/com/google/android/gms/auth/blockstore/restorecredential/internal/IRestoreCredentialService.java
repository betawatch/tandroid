package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* loaded from: classes.dex */
public interface IRestoreCredentialService extends IInterface {

    public static abstract class Stub extends zzb implements IRestoreCredentialService {

        public static class Proxy extends zza implements IRestoreCredentialService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void getRestoreCredential(GetRestoreCredentialRequest getRestoreCredentialRequest, IGetRestoreCredentialCallback iGetRestoreCredentialCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(obtainAndWriteInterfaceToken, getRestoreCredentialRequest);
                zzc.zzc(obtainAndWriteInterfaceToken, iGetRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public static IRestoreCredentialService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return queryLocalInterface instanceof IRestoreCredentialService ? (IRestoreCredentialService) queryLocalInterface : new Proxy(iBinder);
        }
    }

    void getRestoreCredential(GetRestoreCredentialRequest getRestoreCredentialRequest, IGetRestoreCredentialCallback iGetRestoreCredentialCallback);
}
