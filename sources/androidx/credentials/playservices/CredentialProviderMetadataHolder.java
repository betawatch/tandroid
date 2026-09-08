package androidx.credentials.playservices;

import a1.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final a a = new a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.e(intent, "intent");
        return this.a;
    }
}
