package o6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b0 extends c8.b {
    public g b;
    public final int c;

    public b0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.b = gVar;
        this.c = i10;
    }

    @Override // c8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) n7.a.a(parcel, Bundle.CREATOR);
            n7.a.b(parcel);
            l.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.B(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i10 == 2) {
            parcel.readInt();
            n7.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            f0 f0Var = (f0) n7.a.a(parcel, f0.CREATOR);
            n7.a.b(parcel);
            g gVar = this.b;
            l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            l.h(f0Var);
            gVar.Q = f0Var;
            if (gVar.C()) {
                e eVar = f0Var.d;
                m a2 = m.a();
                n nVar = eVar == null ? null : eVar.a;
                synchronized (a2) {
                    if (nVar == null) {
                        nVar = m.c;
                    } else {
                        n nVar2 = (n) a2.a;
                        if (nVar2 != null) {
                            if (nVar2.a < nVar.a) {
                            }
                        }
                    }
                    a2.a = nVar;
                }
            }
            Bundle bundle2 = f0Var.a;
            l.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.B(readInt2, readStrongBinder2, bundle2, this.c);
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
