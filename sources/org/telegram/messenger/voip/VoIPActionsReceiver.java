package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class VoIPActionsReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("group_call_invite_msg_id") && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().handleNotificationAction(intent);
            return;
        }
        String packageName = context.getPackageName();
        if (t8.b.v(packageName, ".END_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
                return;
            } else {
                VoIPPreNotificationService.decline(context, 1);
                return;
            }
        }
        if (t8.b.v(packageName, ".DECLINE_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
                return;
            } else {
                VoIPPreNotificationService.decline(context, 4);
                return;
            }
        }
        if (t8.b.v(packageName, ".ANSWER_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.answer(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
                return;
            } else {
                VoIPPreNotificationService.answer(context);
                return;
            }
        }
        if (t8.b.v(packageName, ".HIDE_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.hide(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.dismiss(context, false);
            }
        }
    }
}
