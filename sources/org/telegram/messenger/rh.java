package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class rh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SharedConfig.ProxyInfo b;
    public final /* synthetic */ long c;

    public /* synthetic */ rh(SharedConfig.ProxyInfo proxyInfo, long j3, int i10) {
        this.a = i10;
        this.b = proxyInfo;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.c;
        SharedConfig.ProxyInfo proxyInfo = this.b;
        switch (i10) {
            case 0:
                ProxyRotationController.lambda$new$0(proxyInfo, j3);
                break;
            default:
                proxyInfo.availableCheckTime = SystemClock.elapsedRealtime();
                proxyInfo.checking = false;
                if (j3 == -1) {
                    proxyInfo.available = false;
                    proxyInfo.ping = 0L;
                } else {
                    proxyInfo.ping = j3;
                    proxyInfo.available = true;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyCheckDone, proxyInfo);
                break;
        }
    }
}
