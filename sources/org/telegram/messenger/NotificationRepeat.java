package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NotificationRepeat extends IntentService {
    public static final /* synthetic */ int a = 0;

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
            if (y6c.q(intExtra)) {
                gl.c3(new xv0(intExtra, (byte) 8));
            }
        }
    }
}
