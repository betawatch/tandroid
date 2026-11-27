// default package

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gcf extends d05 {
    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof ghf ? (ghf) queryLocalInterface : new ghf(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // hg0
    public final a94[] f() {
        return new a94[]{sid.b, sid.a};
    }

    @Override // hg0
    public final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // hg0
    public final int i() {
        return 13000000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
