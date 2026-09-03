package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
