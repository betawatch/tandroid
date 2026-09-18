package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
            AndroidUtilities.runOnUIThread(new r7(10, remove));
        }
    }
}
