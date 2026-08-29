package androidx.credentials.playservices;

import a1.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final a a = new a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        j.e(intent, "intent");
        return this.a;
    }
}
