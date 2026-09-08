package org.telegram.messenger;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Process;
import android.service.media.MediaBrowserService;
import android.widget.Toast;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class MusicBrowserService extends MediaBrowserService {
    private static final String MEDIA_ID_ROOT = "__ROOT__";

    @Override // android.service.media.MediaBrowserService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ApplicationLoader.postInitApplication();
        setSessionToken(TelegramMediaSession.getInstance(this).getFrameworkSessionToken());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.service.media.MediaBrowserService
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
        if (str == null) {
            return null;
        }
        if ((1000 == i10 || Process.myUid() == i10 || PackageValidator.isKnownCaller(this, str, i10)) && !TelegramMediaSession.getInstance(this).isPasscodeLocked()) {
            return new MediaBrowserService.BrowserRoot(MEDIA_ID_ROOT, TelegramMediaSession.getInstance(this).buildRootHints());
        }
        return null;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        TelegramMediaSession telegramMediaSession = TelegramMediaSession.getInstance(this);
        if (!telegramMediaSession.isPasscodeLocked()) {
            result.detach();
            telegramMediaSession.loadBrowseChildren(str, new c0(result, 8));
        } else {
            Toast.makeText(getApplicationContext(), LocaleController.getString(R.string.EnterYourTelegramPasscode), 1).show();
            stopSelf();
            result.detach();
        }
    }
}
