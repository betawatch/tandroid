package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class jh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SharedConfig.ProxyInfo b;
    public final /* synthetic */ long c;

    public /* synthetic */ jh(SharedConfig.ProxyInfo proxyInfo, long j10, int i9) {
        this.a = i9;
        this.b = proxyInfo;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        long j10 = this.c;
        SharedConfig.ProxyInfo proxyInfo = this.b;
        switch (i9) {
            case 0:
                ProxyRotationController.lambda$new$0(proxyInfo, j10);
                break;
            default:
                proxyInfo.availableCheckTime = SystemClock.elapsedRealtime();
                proxyInfo.checking = false;
                if (j10 == -1) {
                    proxyInfo.available = false;
                    proxyInfo.ping = 0L;
                } else {
                    proxyInfo.ping = j10;
                    proxyInfo.available = true;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyCheckDone, proxyInfo);
                break;
        }
    }
}
