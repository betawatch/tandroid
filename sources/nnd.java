// default package

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class nnd extends dzc {
    public gg0 b;
    public final int c;

    public nnd(gg0 gg0Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 6);
        this.b = gg0Var;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r5.a >= r9.a) goto L24;
     */
    @Override // dzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) mgd.a(parcel, Bundle.CREATOR);
            mgd.c(parcel);
            fre.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.u(readInt, readStrongBinder, bundle, this.c);
            this.b = null;
        } else if (i == 2) {
            parcel.readInt();
            mgd.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            xme xmeVar = (xme) mgd.a(parcel, xme.CREATOR);
            mgd.c(parcel);
            gg0 gg0Var = this.b;
            fre.i(gg0Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            fre.h(xmeVar);
            gg0Var.B = xmeVar;
            if (gg0Var.x()) {
                fs2 fs2Var = xmeVar.d;
                lj9 y = lj9.y();
                mj9 mj9Var = fs2Var == null ? null : fs2Var.a;
                synchronized (y) {
                    if (mj9Var == null) {
                        mj9Var = lj9.d;
                    } else {
                        mj9 mj9Var2 = (mj9) y.b;
                        if (mj9Var2 != null) {
                        }
                    }
                    y.b = mj9Var;
                }
            }
            Bundle bundle2 = xmeVar.a;
            fre.i(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.b.u(readInt2, readStrongBinder2, bundle2, this.c);
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
