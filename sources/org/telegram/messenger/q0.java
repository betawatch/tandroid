package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class q0 extends BroadcastReceiver {
    public final /* synthetic */ int a;

    public /* synthetic */ q0(int i7) {
        this.a = i7;
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
                for (int i7 = 0; i7 < 4; i7++) {
                    ConnectionsManager.getInstance(i7).checkConnection();
                    w7.K.c(new j10(1, w7.G(i7), p10));
                }
                break;
            case 1:
                qc.h(intent);
                break;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().v0, true);
                    break;
                }
                break;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (s2.a) {
                        a8.b("screen off");
                    }
                    ConnectionsManager.getInstance(k10.t0).setAppPaused(true, true);
                    t0.w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (s2.a) {
                        a8.b("screen on");
                    }
                    ConnectionsManager.getInstance(k10.t0).setAppPaused(false, true);
                    t0.w = true;
                }
                ls.e().k(ls.N4, new Object[0]);
                break;
        }
    }
}
