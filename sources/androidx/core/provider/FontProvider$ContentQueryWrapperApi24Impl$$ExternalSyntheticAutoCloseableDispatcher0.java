package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract /* synthetic */ class FontProvider$ContentQueryWrapperApi24Impl$$ExternalSyntheticAutoCloseableDispatcher0 {
    public static /* synthetic */ void m(Object obj) {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            FontProvider$ContentQueryWrapperApi24Impl$$ExternalSyntheticAutoCloseableForwarder1.m((ExecutorService) obj);
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
            return;
        }
        if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
            return;
        }
        if (obj instanceof DrmManagerClient) {
            ((DrmManagerClient) obj).release();
        } else if (obj instanceof ContentProviderClient) {
            ((ContentProviderClient) obj).release();
        } else {
            FontProvider$ContentQueryWrapperApi24Impl$$ExternalSyntheticThrowIAE2.m(obj);
        }
    }
}
