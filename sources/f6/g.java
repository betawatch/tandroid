package f6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g {
    public static final i6.b c = new i6.b("SessionManager", null);
    public final y a;
    public final Context b;

    public g(y yVar, Context context) {
        this.a = yVar;
        this.b = context;
    }

    public final void a(h hVar) {
        p6.m.d("Must be called from the main thread.");
        try {
            y yVar = this.a;
            z zVar = new z(hVar);
            Parcel P0 = yVar.P0();
            com.google.android.gms.internal.cast.u.d(P0, zVar);
            yVar.T0(P0, 2);
        } catch (RemoteException e10) {
            c.a(e10, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        i6.b bVar = c;
        p6.m.d("Must be called from the main thread.");
        try {
            Log.i(bVar.a, bVar.d("End session for %s", this.b.getPackageName()));
            y yVar = this.a;
            Parcel P0 = yVar.P0();
            int i3 = com.google.android.gms.internal.cast.u.a;
            P0.writeInt(1);
            P0.writeInt(z10 ? 1 : 0);
            yVar.T0(P0, 6);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        p6.m.d("Must be called from the main thread.");
        f d = d();
        if (d == null || !(d instanceof c)) {
            return null;
        }
        return (c) d;
    }

    public final f d() {
        p6.m.d("Must be called from the main thread.");
        try {
            y yVar = this.a;
            Parcel R0 = yVar.R0(yVar.P0(), 1);
            z6.a M0 = z6.b.M0(R0.readStrongBinder());
            R0.recycle();
            return (f) z6.b.N0(M0);
        } catch (RemoteException e10) {
            c.a(e10, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
