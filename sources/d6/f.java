package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class f {
    public static final g6.b b = new g6.b("Session", null);
    public final x a;

    public f(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = com.google.android.gms.internal.cast.e.b(context).Y0(str, str2, new j(this));
        } catch (RemoteException | d e7) {
            com.google.android.gms.internal.cast.e.a.a(e7, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            xVar = null;
        }
        this.a = xVar;
    }

    public final String a() {
        n6.l.e("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 3);
                String readString = Q0.readString();
                Q0.recycle();
                return readString;
            } catch (RemoteException e7) {
                b.a(e7, "Unable to call %s on %s.", "getSessionId", x.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        n6.l.e("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 5);
                int i10 = com.google.android.gms.internal.cast.v.a;
                boolean z10 = Q0.readInt() != 0;
                Q0.recycle();
                return z10;
            } catch (RemoteException e7) {
                b.a(e7, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        n6.l.e("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 6);
                int i10 = com.google.android.gms.internal.cast.v.a;
                boolean z10 = Q0.readInt() != 0;
                Q0.recycle();
                return z10;
            } catch (RemoteException e7) {
                b.a(e7, "Unable to call %s on %s.", "isConnecting", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i10) {
        x xVar = this.a;
        if (xVar == null) {
            return;
        }
        try {
            v vVar = (v) xVar;
            Parcel O0 = vVar.O0();
            O0.writeInt(i10);
            vVar.S0(O0, 13);
        } catch (RemoteException e7) {
            b.a(e7, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int e() {
        n6.l.e("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 17);
                int readInt = Q0.readInt();
                Q0.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel Q02 = vVar2.Q0(vVar2.O0(), 18);
                    int readInt2 = Q02.readInt();
                    Q02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e7) {
                b.a(e7, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final x6.a f() {
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 1);
                x6.a L0 = x6.b.L0(Q0.readStrongBinder());
                Q0.recycle();
                return L0;
            } catch (RemoteException e7) {
                b.a(e7, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
