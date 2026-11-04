package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q0 extends BroadcastReceiver {
    public final /* synthetic */ int a;

    public /* synthetic */ q0(int i3) {
        this.a = i3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                try {
                    t0.c = t0.e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p10 = t0.p();
                for (int i3 = 0; i3 < 4; i3++) {
                    ConnectionsManager.getInstance(i3).checkConnection();
                    w7.K.c(new g10(1, w7.G(i3), p10));
                }
                break;
            case 1:
                lc.h(intent);
                break;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().v0, true);
                    break;
                }
                break;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (r2.a) {
                        a8.b("screen off");
                    }
                    ConnectionsManager.getInstance(h10.t0).setAppPaused(true, true);
                    t0.w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (r2.a) {
                        a8.b("screen on");
                    }
                    ConnectionsManager.getInstance(h10.t0).setAppPaused(false, true);
                    t0.w = true;
                }
                hs.e().k(hs.K4, new Object[0]);
                break;
        }
    }
}
