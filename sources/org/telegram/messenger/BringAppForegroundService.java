package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
