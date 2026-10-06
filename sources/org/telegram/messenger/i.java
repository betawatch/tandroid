package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
