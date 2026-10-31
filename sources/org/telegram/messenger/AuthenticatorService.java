package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class AuthenticatorService extends Service {
    public static z0 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            return null;
        }
        if (a == null) {
            a = new z0(this);
        }
        return a.getIBinder();
    }
}
