// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class e8d extends d05 {
    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof h7d ? (h7d) queryLocalInterface : new h7d(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", (byte) 1);
    }

    @Override // hg0
    public final a94[] f() {
        return nid.b;
    }

    @Override // hg0
    public final int i() {
        return 17895000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // hg0
    public final boolean p() {
        return true;
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
