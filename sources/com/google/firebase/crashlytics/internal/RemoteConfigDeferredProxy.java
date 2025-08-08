package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;

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
                    RemoteConfigDeferredProxy.lambda$setupListener$0(CrashlyticsRemoteConfigListener.this, provider);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setupListener$0(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).registerRolloutsStateSubscriber("firebase", crashlyticsRemoteConfigListener);
        Logger.getLogger().d("Registering RemoteConfig Rollouts subscriber");
    }
}
