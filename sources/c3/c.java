package c3;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
