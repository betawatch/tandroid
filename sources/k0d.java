// default package

import android.os.IBinder;
import android.os.IInterface;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class k0d extends xx4 {
    @Override // gg0
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = t0d.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvService");
        return queryLocalInterface instanceof v0d ? (v0d) queryLocalInterface : new r0d(iBinder);
    }

    @Override // gg0
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (fileDescriptor == null || strArr == null) {
            return;
        }
        super.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // gg0
    public final f84[] f() {
        return sdd.b;
    }

    @Override // gg0
    public final int i() {
        return 17895000;
    }

    @Override // gg0
    public final void j(ug5 ug5Var, Set set) {
        if (set != null) {
            super.j(ug5Var, set);
        }
    }

    @Override // gg0
    public final String l() {
        return "com.google.firebase.pnv.internal.IFpnvService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.firebase.fpnv.service.START";
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
