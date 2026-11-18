package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int intExtra = intent.getIntExtra("currentAccount", j10.t0);
        if (j10.r(intExtra)) {
            g0.g3(new jg.x(intExtra, 4));
        }
    }
}
