package d6;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends y5.g {
    @Override // y5.g
    public final boolean C() {
        return true;
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 17895000;
    }

    @Override // y5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 10);
    }

    @Override // y5.g
    public final v5.c[] r() {
        return v6.b.d;
    }

    @Override // y5.g
    public final String v() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // y5.g
    public final String w() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // y5.g
    public final boolean y() {
        return true;
    }
}
