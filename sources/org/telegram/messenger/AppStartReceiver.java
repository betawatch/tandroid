package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class AppStartReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$0() {
        SharedConfig.loadConfig();
        if (SharedConfig.passcodeHash.length() > 0) {
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
        }
        ApplicationLoader.startPushService();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            return;
        }
        AndroidUtilities.runOnUIThread(new u1(2));
    }
}
