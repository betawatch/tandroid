package com.google.android.gms.internal.recaptchabase;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzi extends Api.AbstractClientBuilder {
    zzi() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings commonSettings, Object obj, ConnectionCallbacks connectedListener, OnConnectionFailedListener connectionFailedListener) {
        Api.ApiOptions.NoOptions apiOptions = (Api.ApiOptions.NoOptions) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(commonSettings, "commonSettings");
        Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
        Intrinsics.checkNotNullParameter(connectedListener, "connectedListener");
        Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
        return new zzm(context, looper, commonSettings, connectedListener, connectionFailedListener);
    }
}
