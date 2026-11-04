package f6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class f {
    public static final i6.b b = new i6.b("Session", null);
    public final x a;

    public f(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = com.google.android.gms.internal.cast.d.b(context).Z0(str, str2, new j(this));
        } catch (RemoteException | d e10) {
            com.google.android.gms.internal.cast.d.a.a(e10, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            xVar = null;
        }
        this.a = xVar;
    }

    public final String a() {
        p6.m.d("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 3);
                String readString = R0.readString();
                R0.recycle();
                return readString;
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "getSessionId", x.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        p6.m.d("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 5);
                int i3 = com.google.android.gms.internal.cast.u.a;
                boolean z10 = R0.readInt() != 0;
                R0.recycle();
                return z10;
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        p6.m.d("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 6);
                int i3 = com.google.android.gms.internal.cast.u.a;
                boolean z10 = R0.readInt() != 0;
                R0.recycle();
                return z10;
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "isConnecting", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i3) {
        x xVar = this.a;
        if (xVar == null) {
            return;
        }
        try {
            v vVar = (v) xVar;
            Parcel P0 = vVar.P0();
            P0.writeInt(i3);
            vVar.T0(P0, 13);
        } catch (RemoteException e10) {
            b.a(e10, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int e() {
        p6.m.d("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 17);
                int readInt = R0.readInt();
                R0.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel R02 = vVar2.R0(vVar2.P0(), 18);
                    int readInt2 = R02.readInt();
                    R02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final z6.a f() {
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 1);
                z6.a M0 = z6.b.M0(R0.readStrongBinder());
                R0.recycle();
                return M0;
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
