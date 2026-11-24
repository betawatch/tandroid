package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationRepeat extends IntentService {
    public static final /* synthetic */ int a = 0;

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", z8c.t0);
            if (z8c.q(intExtra)) {
                gm.c3(new fx0(intExtra, (byte) 8));
            }
        }
    }
}
