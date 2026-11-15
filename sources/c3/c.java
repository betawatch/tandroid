package c3;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ Runnable a;

    public c(Runnable runnable) {
        this.a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.a.run();
    }
}
