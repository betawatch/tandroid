// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k8d extends zz4 {
    @Override // hh0
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        return queryLocalInterface instanceof j7d ? (j7d) queryLocalInterface : new j7d(iBinder);
    }

    @Override // hh0
    public final int i() {
        return 12600000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
