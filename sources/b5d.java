// default package

import android.os.IBinder;
import android.os.IInterface;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class b5d extends d05 {
    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = k5d.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvService");
        return queryLocalInterface instanceof m5d ? (m5d) queryLocalInterface : new i5d(iBinder);
    }

    @Override // hg0
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (fileDescriptor == null || strArr == null) {
            return;
        }
        super.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // hg0
    public final a94[] f() {
        return kid.b;
    }

    @Override // hg0
    public final int i() {
        return 17895000;
    }

    @Override // hg0
    public final void j(wi5 wi5Var, Set set) {
        if (set != null) {
            super.j(wi5Var, set);
        }
    }

    @Override // hg0
    public final String l() {
        return "com.google.firebase.pnv.internal.IFpnvService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.firebase.fpnv.service.START";
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
