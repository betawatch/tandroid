package com.google.android.gms.auth.api.signin;

import a6.l;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            Log.w("RevocationService", "Unknown action sent to RevocationBoundService: ".concat(String.valueOf(intent.getAction())));
            return null;
        }
        if (Log.isLoggable("RevocationService", 2)) {
            Log.v("RevocationService", "RevocationBoundService handling ".concat(String.valueOf(intent.getAction())));
        }
        return new l(this);
    }
}
