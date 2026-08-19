package com.google.firebase.crashlytics.internal;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public class RemoteConfigDeferredProxy {
    private final Deferred remoteConfigInteropDeferred;

    public RemoteConfigDeferredProxy(Deferred deferred) {
        this.remoteConfigInteropDeferred = deferred;
    }

    public void setupListener(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.getLogger().w("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener(userMetadata);
            this.remoteConfigInteropDeferred.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy$$ExternalSyntheticLambda0
                @Override // com.google.firebase.inject.Deferred.DeferredHandler
                public final void handle(Provider provider) {
                    RemoteConfigDeferredProxy.$r8$lambda$tM9cwbkvs3BgPiTMmQjNX30V2r4(CrashlyticsRemoteConfigListener.this, provider);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$tM9cwbkvs3BgPiTMmQjNX30V2r4(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(provider.get());
        throw null;
    }
}
