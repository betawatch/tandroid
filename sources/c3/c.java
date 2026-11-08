package c3;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ Runnable a;

    public c(Runnable runnable) {
        this.a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z9) {
        this.a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z9) {
        this.a.run();
    }
}
