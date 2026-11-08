package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a0;
import c.d;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends d {
    @Override // c.d
    public final void a(int i7, Bundle bundle) {
        if (bundle != null) {
            bundle = a0.y(bundle);
        }
        if (i7 != 0) {
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
