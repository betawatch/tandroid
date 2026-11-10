package db;

import android.os.IBinder;
import android.os.IInterface;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p extends q6.h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final void b(String prefix, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        kotlin.jvm.internal.j.e(prefix, "prefix");
        if (fileDescriptor == null || strArr == null) {
            return;
        }
        super.b(prefix, fileDescriptor, printWriter, strArr);
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 17895000;
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final void g(q6.i iVar, Set set) {
        if (set != null) {
            super.g(iVar, set);
        }
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        kotlin.jvm.internal.j.e(iBinder, "iBinder");
        int i7 = s.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvService");
        return queryLocalInterface instanceof t ? (t) queryLocalInterface : new r(iBinder);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return j.b;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.firebase.pnv.internal.IFpnvService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.firebase.fpnv.service.START";
    }

    @Override // q6.d
    public final boolean r() {
        return true;
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
