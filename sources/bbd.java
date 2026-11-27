// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bbd extends d05 {
    @Override // hg0
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        return queryLocalInterface instanceof aad ? (aad) queryLocalInterface : new aad(iBinder);
    }

    @Override // hg0
    public final int i() {
        return 12600000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
