package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        if (UserConfig.isValidAccount(intExtra)) {
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                NotificationsController.getInstance(intExtra).processIgnoreStories();
                return;
            }
            if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                NotificationsController.getInstance(intExtra).processIgnoreStoryReactions();
                return;
            }
            if (longExtra == 0) {
                FileLog.d("set dismissDate of global to " + intExtra2);
                MessagesController.getNotificationsSettings(intExtra).edit().putInt("dismissDate", intExtra2).commit();
                return;
            }
            FileLog.d("set dismissDate of " + longExtra + " to " + intExtra2);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(intExtra).edit();
            StringBuilder sb2 = new StringBuilder("dismissDate");
            sb2.append(longExtra);
            edit.putInt(sb2.toString(), intExtra2).commit();
        }
    }
}
