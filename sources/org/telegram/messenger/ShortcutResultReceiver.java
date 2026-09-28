package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public class ShortcutResultReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$0(Utilities.Callback callback) {
        callback.run(Boolean.TRUE);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
        Utilities.Callback<Boolean> remove = MediaDataController.getInstance(intExtra).shortcutCallbacks.remove(intent.getStringExtra("req_id"));
        if (remove != null) {
            AndroidUtilities.runOnUIThread(new o7(10, remove));
        }
    }
}
