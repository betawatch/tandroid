package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
            AndroidUtilities.runOnUIThread(new s7(10, remove));
        }
    }
}
