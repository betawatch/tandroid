package b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c0 extends a7.c {
    public g b;
    public final int c;

    public c0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.b = gVar;
        this.c = i10;
    }

    @Override // a7.c
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) a7.d.a(parcel, Bundle.CREATOR);
            a7.d.b(parcel);
            m.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.B(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i10 == 2) {
            parcel.readInt();
            a7.d.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            g0 g0Var = (g0) a7.d.a(parcel, g0.CREATOR);
            a7.d.b(parcel);
            g gVar = this.b;
            m.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            m.h(g0Var);
            gVar.N = g0Var;
            if (gVar.C()) {
                e eVar = g0Var.d;
                n a2 = n.a();
                o oVar = eVar == null ? null : eVar.a;
                synchronized (a2) {
                    if (oVar == null) {
                        oVar = n.c;
                    } else {
                        o oVar2 = (o) a2.a;
                        if (oVar2 != null) {
                            if (oVar2.a < oVar.a) {
                            }
                        }
                    }
                    a2.a = oVar;
                }
            }
            Bundle bundle2 = g0Var.a;
            m.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.B(readInt2, readStrongBinder2, bundle2, this.c);
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
