package com.google.android.gms.identitycredentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* loaded from: classes.dex */
public interface IIdentityCredentialService extends IInterface {

    public static abstract class Stub extends zzb implements IIdentityCredentialService {

        public static class Proxy extends zza implements IIdentityCredentialService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void createCredential(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, CreateCredentialRequest createCredentialRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                zzc.zzb(obtainAndWriteInterfaceToken, createCredentialRequest);
                zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void getCredential(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, GetCredentialRequest getCredentialRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                zzc.zzb(obtainAndWriteInterfaceToken, getCredentialRequest);
                zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void signalCredentialState(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, SignalCredentialStateRequest signalCredentialStateRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                zzc.zzb(obtainAndWriteInterfaceToken, signalCredentialStateRequest);
                zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }
        }

        public static IIdentityCredentialService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return queryLocalInterface instanceof IIdentityCredentialService ? (IIdentityCredentialService) queryLocalInterface : new Proxy(iBinder);
        }
    }

    void createCredential(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, CreateCredentialRequest createCredentialRequest, ApiMetadata apiMetadata);

    void getCredential(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, GetCredentialRequest getCredentialRequest, ApiMetadata apiMetadata);

    void signalCredentialState(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, SignalCredentialStateRequest signalCredentialStateRequest, ApiMetadata apiMetadata);
}
