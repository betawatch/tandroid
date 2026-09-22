package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
