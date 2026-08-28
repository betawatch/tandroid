package b5;

import android.media.Spatializer;
import o8.k0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ r a;

    public l(r rVar) {
        this.a = rVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        r rVar = this.a;
        k0 k0Var = r.k;
        rVar.g();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        r rVar = this.a;
        k0 k0Var = r.k;
        rVar.g();
    }
}
