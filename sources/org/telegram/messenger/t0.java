package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                    b8.J.c(new c20(1, b8.G(i10), p5));
                }
                break;
            case 1:
                sc.h(intent);
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
                    ConnectionsManager.getInstance(d20.s0).setAppPaused(true, true);
                    w0.w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (v2.a) {
                        f8.b("screen on");
                    }
                    ConnectionsManager.getInstance(d20.s0).setAppPaused(false, true);
                    w0.w = true;
                }
                zs.e().k(zs.K4, new Object[0]);
                break;
        }
    }
}
