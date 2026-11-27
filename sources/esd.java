// default package

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class esd extends u3d {
    public hg0 b;
    public final int c;

    public esd(hg0 hg0Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 6);
        this.b = hg0Var;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r5.a >= r9.a) goto L24;
     */
    @Override // u3d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) dld.a(parcel, Bundle.CREATOR);
            dld.c(parcel);
            xve.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.u(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i == 2) {
            parcel.readInt();
            dld.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            ore oreVar = (ore) dld.a(parcel, ore.CREATOR);
            dld.c(parcel);
            hg0 hg0Var = this.b;
            xve.i(hg0Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            xve.h(oreVar);
            hg0Var.B = oreVar;
            if (hg0Var.x()) {
                ys2 ys2Var = oreVar.d;
                zm9 I0 = zm9.I0();
                an9 an9Var = ys2Var == null ? null : ys2Var.a;
                synchronized (I0) {
                    if (an9Var == null) {
                        an9Var = zm9.d;
                    } else {
                        an9 an9Var2 = (an9) I0.b;
                        if (an9Var2 != null) {
                        }
                    }
                    I0.b = an9Var;
                }
            }
            Bundle bundle2 = oreVar.a;
            xve.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.u(readInt2, readStrongBinder2, bundle2, this.c);
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
