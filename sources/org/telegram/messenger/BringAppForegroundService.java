package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
