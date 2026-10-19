package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
