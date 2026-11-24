package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ContactsSyncAdapterService extends Service {
    public static uu2 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        uu2 uu2Var = a;
        if (uu2Var == null) {
            uu2Var = new uu2(this, true);
            a = uu2Var;
        }
        return uu2Var.getSyncAdapterBinder();
    }
}
