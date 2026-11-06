package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a0;
import c.d;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends d {
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
        if (!bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
