package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zbv;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* loaded from: classes.dex */
final class zbal extends Api.AbstractClientBuilder {
    zbal() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zbar(context, looper, (zbv) obj, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
