package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c0 extends b8.b {
    public g b;
    public final int c;

    public c0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.b = gVar;
        this.c = i10;
    }

    @Override // b8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) m7.a.a(parcel, Bundle.CREATOR);
            m7.a.b(parcel);
            l.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.B(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i10 == 2) {
            parcel.readInt();
            m7.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            g0 g0Var = (g0) m7.a.a(parcel, g0.CREATOR);
            m7.a.b(parcel);
            g gVar = this.b;
            l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            l.h(g0Var);
            gVar.Q = g0Var;
            if (gVar.C()) {
                e eVar = g0Var.d;
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
            Bundle bundle2 = g0Var.a;
            l.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.B(readInt2, readStrongBinder2, bundle2, this.c);
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
