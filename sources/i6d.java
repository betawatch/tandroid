// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class i6d extends xx4 {
    @Override // gg0
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        return queryLocalInterface instanceof h5d ? (h5d) queryLocalInterface : new h5d(iBinder);
    }

    @Override // gg0
    public final int i() {
        return 12600000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
