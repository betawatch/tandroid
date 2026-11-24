package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends yc9 {
    @Override // yc9
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = mx6.A0(bundle);
        }
        if (i != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
