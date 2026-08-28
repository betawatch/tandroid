package c6;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends x5.g {
    @Override // x5.g
    public final boolean C() {
        return true;
    }

    @Override // x5.g, com.google.android.gms.common.api.c
    public final int l() {
        return 17895000;
    }

    @Override // x5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 10);
    }

    @Override // x5.g
    public final u5.c[] r() {
        return u6.b.d;
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // x5.g
    public final boolean y() {
        return true;
    }
}
