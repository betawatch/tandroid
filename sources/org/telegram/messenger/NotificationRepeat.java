package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int intExtra = intent.getIntExtra("currentAccount", m10.t0);
        if (m10.r(intExtra)) {
            g0.h3(new jg.x(intExtra, 4));
        }
    }
}
