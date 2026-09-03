package f5;

import android.media.Spatializer;
import s8.h0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ p a;

    public j(p pVar) {
        this.a = pVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.a;
        h0 h0Var = p.k;
        pVar.g();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.a;
        h0 h0Var = p.k;
        pVar.g();
    }
}
