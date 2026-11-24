// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n3d extends xx4 {
    @Override // gg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof q2d ? (q2d) queryLocalInterface : new q2d(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", (byte) 1);
    }

    @Override // gg0
    public final f84[] f() {
        return vdd.b;
    }

    @Override // gg0
    public final int i() {
        return 17895000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // gg0
    public final boolean p() {
        return true;
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
