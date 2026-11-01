package org.telegram.messenger;

import android.content.pm.PackageManager;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Process;
import android.service.media.MediaBrowserService;
import android.widget.Toast;
import java.util.HashSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class MusicBrowserService extends MediaBrowserService {
    @Override // android.service.media.MediaBrowserService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        w0.w();
        setSessionToken((MediaSession.Token) ((android.support.v4.media.session.u) i00.a(this).b.b).c.b);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
        if (str == null) {
            return null;
        }
        if (1000 != i10 && Process.myUid() != i10) {
            HashSet hashSet = rt.a;
            if (i10 != 1000 && i10 != Process.myUid() && !rt.a.contains(str)) {
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
        i00.a(this).getClass();
        if (i00.b()) {
            return null;
        }
        i00.a(this).getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
        bundle2.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
        bundle2.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
        return new MediaBrowserService.BrowserRoot("__ROOT__", bundle2);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        i00 a2 = i00.a(this);
        a2.getClass();
        if (!i00.b()) {
            result.detach();
            a2.c(str, new s1(result, 11));
        } else {
            Toast.makeText(getApplicationContext(), dd.L0(2131751111, null), 1).show();
            stopSelf();
            result.detach();
        }
    }
}
