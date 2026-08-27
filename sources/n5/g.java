package n5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class g {
    public static final r5.b b = new r5.b("Session", null);
    public final y a;

    public g(Context context, String str, String str2) {
        y yVar;
        try {
            yVar = com.google.android.gms.internal.cast.e.b(context).W0(str, str2, new k(this));
        } catch (RemoteException | d e9) {
            com.google.android.gms.internal.cast.e.a.a(e9, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            yVar = null;
        }
        this.a = yVar;
    }

    public final String a() {
        y5.l.e("Must be called from the main thread.");
        y yVar = this.a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel O0 = wVar.O0(wVar.M0(), 3);
                String readString = O0.readString();
                O0.recycle();
                return readString;
            } catch (RemoteException e9) {
                b.a(e9, "Unable to call %s on %s.", "getSessionId", y.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        y5.l.e("Must be called from the main thread.");
        y yVar = this.a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel O0 = wVar.O0(wVar.M0(), 5);
                int i10 = com.google.android.gms.internal.cast.t.a;
                boolean z10 = O0.readInt() != 0;
                O0.recycle();
                return z10;
            } catch (RemoteException e9) {
                b.a(e9, "Unable to call %s on %s.", "isConnected", y.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        y5.l.e("Must be called from the main thread.");
        y yVar = this.a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel O0 = wVar.O0(wVar.M0(), 6);
                int i10 = com.google.android.gms.internal.cast.t.a;
                boolean z10 = O0.readInt() != 0;
                O0.recycle();
                return z10;
            } catch (RemoteException e9) {
                b.a(e9, "Unable to call %s on %s.", "isConnecting", y.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i10) {
        y yVar = this.a;
        if (yVar == null) {
            return;
        }
        try {
            w wVar = (w) yVar;
            Parcel M0 = wVar.M0();
            M0.writeInt(i10);
            wVar.Q0(M0, 13);
        } catch (RemoteException e9) {
            b.a(e9, "Unable to call %s on %s.", "notifySessionEnded", y.class.getSimpleName());
        }
    }

    public final int e() {
        y5.l.e("Must be called from the main thread.");
        y yVar = this.a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel O0 = wVar.O0(wVar.M0(), 17);
                int readInt = O0.readInt();
                O0.recycle();
                if (readInt >= 211100000) {
                    w wVar2 = (w) yVar;
                    Parcel O02 = wVar2.O0(wVar2.M0(), 18);
                    int readInt2 = O02.readInt();
                    O02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e9) {
                b.a(e9, "Unable to call %s on %s.", "getSessionStartType", y.class.getSimpleName());
            }
        }
        return 0;
    }

    public final i6.a f() {
        y yVar = this.a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel O0 = wVar.O0(wVar.M0(), 1);
                i6.a J0 = i6.b.J0(O0.readStrongBinder());
                O0.recycle();
                return J0;
            } catch (RemoteException e9) {
                b.a(e9, "Unable to call %s on %s.", "getWrappedObject", y.class.getSimpleName());
            }
        }
        return null;
    }
}
