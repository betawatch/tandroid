package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    private final LocalBinder binder = new LocalBinder();

    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.binder;
    }
}
