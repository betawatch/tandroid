package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ j(Intent intent, int i10) {
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
