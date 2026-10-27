package e6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class f {
    public static final h6.b b = new h6.b("Session", null);
    public final x a;

    public f(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = com.google.android.gms.internal.cast.d.b(context).X0(str, str2, new j(this));
        } catch (RemoteException | d e) {
            com.google.android.gms.internal.cast.d.a.a(e, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            xVar = null;
        }
        this.a = xVar;
    }

    public final String a() {
        o6.l.e("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 3);
                String readString = P0.readString();
                P0.recycle();
                return readString;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionId", x.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        o6.l.e("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 5);
                int i10 = com.google.android.gms.internal.cast.t.a;
                boolean z10 = P0.readInt() != 0;
                P0.recycle();
                return z10;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        o6.l.e("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 6);
                int i10 = com.google.android.gms.internal.cast.t.a;
                boolean z10 = P0.readInt() != 0;
                P0.recycle();
                return z10;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "isConnecting", x.class.getSimpleName());
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
            Parcel N0 = vVar.N0();
            N0.writeInt(i10);
            vVar.R0(N0, 13);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int e() {
        o6.l.e("Must be called from the main thread.");
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 17);
                int readInt = P0.readInt();
                P0.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel P02 = vVar2.P0(vVar2.N0(), 18);
                    int readInt2 = P02.readInt();
                    P02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final y6.a f() {
        x xVar = this.a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 1);
                y6.a K0 = y6.b.K0(P0.readStrongBinder());
                P0.recycle();
                return K0;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
