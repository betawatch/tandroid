package org.telegram.messenger;

import android.content.pm.PackageManager;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Process;
import android.service.media.MediaBrowserService;
import android.widget.Toast;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class MusicBrowserService extends MediaBrowserService {
    @Override // android.service.media.MediaBrowserService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a.v();
        setSessionToken((MediaSession.Token) ((ex6) dkb.a(this).b.b).c.b);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        if (str == null) {
            return null;
        }
        if (1000 != i && Process.myUid() != i) {
            HashSet hashSet = ru7.a;
            if (i != 1000 && i != Process.myUid() && !ru7.a.contains(str)) {
                PackageManager packageManager = getPackageManager();
                try {
                    if (packageManager.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", str) != 0) {
                        if (packageManager.checkPermission("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE", str) != 0) {
                            return null;
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        dkb.a(this).getClass();
        if (dkb.b()) {
            return null;
        }
        dkb.a(this).getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
        bundle2.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
        bundle2.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
        return new MediaBrowserService.BrowserRoot("__ROOT__", bundle2);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        dkb a = dkb.a(this);
        a.getClass();
        if (!dkb.b()) {
            result.detach();
            a.c(str, new bm6(result, (byte) 16));
        } else {
            Toast.makeText(getApplicationContext(), ob6.M0(2131751075, null), 1).show();
            stopSelf();
            result.detach();
        }
    }
}
