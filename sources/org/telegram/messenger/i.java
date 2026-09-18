package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ i(Intent intent, int i10) {
        this.a = i10;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.b);
                break;
            case 1:
                NotificationBadge.AdwHomeBadger.lambda$executeBadge$0(this.b);
                break;
            case 2:
                NotificationBadge.ApexHomeBadger.lambda$executeBadge$0(this.b);
                break;
            case 3:
                NotificationBadge.AsusHomeBadger.lambda$executeBadge$0(this.b);
                break;
            case 4:
                NotificationBadge.DefaultBadger.lambda$executeBadge$0(this.b);
                break;
            default:
                NotificationBadge.SonyHomeBadger.lambda$executeBadgeByBroadcast$0(this.b);
                break;
        }
    }
}
