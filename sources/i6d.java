// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
