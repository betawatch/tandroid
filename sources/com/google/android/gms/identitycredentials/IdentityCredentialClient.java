package com.google.android.gms.identitycredentials;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface IdentityCredentialClient {
    Task createCredential(CreateCredentialRequest createCredentialRequest);

    Task getCredential(GetCredentialRequest getCredentialRequest);

    Task signalCredentialState(SignalCredentialStateRequest signalCredentialStateRequest);
}
