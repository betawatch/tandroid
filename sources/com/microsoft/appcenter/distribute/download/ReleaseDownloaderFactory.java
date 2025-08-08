package com.microsoft.appcenter.distribute.download;

import android.content.Context;
import com.microsoft.appcenter.distribute.ReleaseDetails;
import com.microsoft.appcenter.distribute.download.ReleaseDownloader;
import com.microsoft.appcenter.distribute.download.manager.DownloadManagerReleaseDownloader;

/* loaded from: classes.dex */
public abstract class ReleaseDownloaderFactory {
    public static ReleaseDownloader create(Context context, ReleaseDetails releaseDetails, ReleaseDownloader.Listener listener) {
        return new DownloadManagerReleaseDownloader(context, releaseDetails, listener);
    }
}
