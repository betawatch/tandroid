package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class VoIPMediaButtonReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().onMediaButtonEvent((KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
    }
}
