package androidx.credentials.playservices;

import a1.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final a a = new a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        j.e(intent, "intent");
        return this.a;
    }
}
