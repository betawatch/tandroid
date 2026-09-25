package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class NotificationRepeat extends IntentService {
    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onHandleIntent$0(int i10) {
        NotificationsController.getInstance(i10).repeatNotificationMaybe();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        if (UserConfig.isValidAccount(intExtra)) {
            AndroidUtilities.runOnUIThread(new ei.r2(intExtra, 3));
        }
    }
}
