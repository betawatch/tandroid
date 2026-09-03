package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class BringAppForegroundService extends IntentService {
    public BringAppForegroundService() {
        super("BringAppForegroundService");
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        Intent intent2 = new Intent(this, (Class<?>) LaunchActivity.class);
        intent2.setFlags(TLObject.FLAG_28);
        intent2.setAction("android.intent.action.MAIN");
        startActivity(intent2);
    }
}
