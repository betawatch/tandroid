package f5;

import android.media.Spatializer;
import s8.h0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
