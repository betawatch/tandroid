package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class NotificationRepeat extends IntentService {
    public static final /* synthetic */ int a = 0;

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", p10.s0);
        if (p10.r(intExtra)) {
            g0.h3(new hi.j2(intExtra, 4));
        }
    }
}
