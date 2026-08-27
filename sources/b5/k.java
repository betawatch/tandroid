package b5;

import android.media.Spatializer;
import p8.k0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ q a;

    public k(q qVar) {
        this.a = qVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        q qVar = this.a;
        k0 k0Var = q.k;
        qVar.g();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        q qVar = this.a;
        k0 k0Var = q.k;
        qVar.g();
    }
}
