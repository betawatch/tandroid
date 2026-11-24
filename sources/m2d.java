// default package

import android.os.IBinder;
import android.os.IInterface;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m2d extends zz4 {
    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = v2d.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvService");
        return queryLocalInterface instanceof x2d ? (x2d) queryLocalInterface : new t2d(iBinder);
    }

    @Override // hh0
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (fileDescriptor == null || strArr == null) {
            return;
        }
        super.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // hh0
    public final o94[] f() {
        return ufd.b;
    }

    @Override // hh0
    public final int i() {
        return 17895000;
    }

    @Override // hh0
    public final void j(ti5 ti5Var, Set set) {
        if (set != null) {
            super.j(ti5Var, set);
        }
    }

    @Override // hh0
    public final String l() {
        return "com.google.firebase.pnv.internal.IFpnvService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.firebase.fpnv.service.START";
    }

    @Override // hh0
    public final boolean p() {
        return true;
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
