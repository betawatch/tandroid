package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g {
    public static final g6.b c = new g6.b("SessionManager", null);
    public final y a;
    public final Context b;

    public g(y yVar, Context context) {
        this.a = yVar;
        this.b = context;
    }

    public final void a(h hVar) {
        n6.l.d("Must be called from the main thread.");
        try {
            y yVar = this.a;
            z zVar = new z(hVar);
            Parcel P0 = yVar.P0();
            com.google.android.gms.internal.cast.u.d(P0, zVar);
            yVar.T0(P0, 2);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        g6.b bVar = c;
        n6.l.d("Must be called from the main thread.");
        try {
            Log.i(bVar.a, bVar.d("End session for %s", this.b.getPackageName()));
            y yVar = this.a;
            Parcel P0 = yVar.P0();
            int i10 = com.google.android.gms.internal.cast.u.a;
            P0.writeInt(1);
            P0.writeInt(z10 ? 1 : 0);
            yVar.T0(P0, 6);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        n6.l.d("Must be called from the main thread.");
        f d = d();
        if (d == null || !(d instanceof c)) {
            return null;
        }
        return (c) d;
    }

    public final f d() {
        n6.l.d("Must be called from the main thread.");
        try {
            y yVar = this.a;
            Parcel R0 = yVar.R0(yVar.P0(), 1);
            x6.a M0 = x6.b.M0(R0.readStrongBinder());
            R0.recycle();
            return (f) x6.b.N0(M0);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
