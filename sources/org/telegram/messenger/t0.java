package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class t0 extends BroadcastReceiver {
    public final /* synthetic */ int a;

    public /* synthetic */ t0(int i10) {
        this.a = i10;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                try {
                    w0.c = w0.e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p5 = w0.p();
                for (int i10 = 0; i10 < 4; i10++) {
                    ConnectionsManager.getInstance(i10).checkConnection();
                    b8.J.c(new d20(1, b8.G(i10), p5));
                }
                break;
            case 1:
                tc.h(intent);
                break;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().u0, true);
                    break;
                }
                break;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (v2.a) {
                        f8.b("screen off");
                    }
                    ConnectionsManager.getInstance(e20.s0).setAppPaused(true, true);
                    w0.w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (v2.a) {
                        f8.b("screen on");
                    }
                    ConnectionsManager.getInstance(e20.s0).setAppPaused(false, true);
                    w0.w = true;
                }
                at.e().k(at.K4, new Object[0]);
                break;
        }
    }
}
