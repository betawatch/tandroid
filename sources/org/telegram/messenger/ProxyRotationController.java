package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class ProxyRotationController implements NotificationCenter.NotificationCenterDelegate {
    public static final int DEFAULT_TIMEOUT_INDEX = 1;
    private static final ProxyRotationController INSTANCE = new ProxyRotationController();
    public static final List<Integer> ROTATION_TIMEOUTS = Arrays.asList(5, 10, 15, 30, 60);
    private Runnable checkProxyAndSwitchRunnable = new xg(this, 4);
    private boolean isCurrentlyChecking;

    public static void init() {
        INSTANCE.initInternal();
    }

    private void initInternal() {
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(SharedConfig.ProxyInfo proxyInfo, long j10) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(SharedConfig.ProxyInfo proxyInfo, long j10) {
        AndroidUtilities.runOnUIThread(new th(proxyInfo, j10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        this.isCurrentlyChecking = true;
        int i10 = UserConfig.selectedAccount;
        boolean z4 = false;
        for (int i11 = 0; i11 < SharedConfig.proxyList.size(); i11++) {
            SharedConfig.ProxyInfo proxyInfo = SharedConfig.proxyList.get(i11);
            if (!proxyInfo.checking && SystemClock.elapsedRealtime() - proxyInfo.availableCheckTime >= 120000) {
                proxyInfo.checking = true;
                ConnectionsManager.getInstance(i10).checkProxy(proxyInfo.settings, new d0(proxyInfo, 10));
                z4 = true;
            }
        }
        if (z4) {
            return;
        }
        this.isCurrentlyChecking = false;
        switchToAvailable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$switchToAvailable$3(SharedConfig.ProxyInfo proxyInfo, SharedConfig.ProxyInfo proxyInfo2) {
        return Long.compare(proxyInfo.ping, proxyInfo2.ping);
    }

    private void switchToAvailable() {
        this.isCurrentlyChecking = false;
        if (SharedConfig.proxyRotationEnabled) {
            ArrayList arrayList = new ArrayList(SharedConfig.proxyList);
            Collections.sort(arrayList, new d(26));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                if (proxyInfo != SharedConfig.currentProxy && !proxyInfo.checking && proxyInfo.available) {
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", true);
                    proxyInfo.settings.f(edit);
                    if (!proxyInfo.settings.f.isEmpty()) {
                        edit.putBoolean("proxy_enabled_calls", false);
                    }
                    edit.apply();
                    SharedConfig.currentProxy = proxyInfo;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyChangedByRotation, new Object[0]);
                    ConnectionsManager.setProxySettings(true, SharedConfig.currentProxy.settings);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.proxyCheckDone) {
            if (SharedConfig.isProxyEnabled() && SharedConfig.proxyRotationEnabled && SharedConfig.proxyList.size() > 1 && this.isCurrentlyChecking) {
                switchToAvailable();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.proxySettingsChanged) {
            AndroidUtilities.cancelRunOnUIThread(this.checkProxyAndSwitchRunnable);
            return;
        }
        if (i10 == NotificationCenter.didUpdateConnectionState && i11 == UserConfig.selectedAccount) {
            if ((SharedConfig.isProxyEnabled() || SharedConfig.proxyRotationEnabled) && SharedConfig.proxyList.size() > 1) {
                if (ConnectionsManager.getInstance(i11).getConnectionState() != 4) {
                    AndroidUtilities.cancelRunOnUIThread(this.checkProxyAndSwitchRunnable);
                } else {
                    if (this.isCurrentlyChecking) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(this.checkProxyAndSwitchRunnable, ROTATION_TIMEOUTS.get(SharedConfig.proxyRotationTimeout).intValue() * 1000);
                }
            }
        }
    }
}
