package n5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g {
    public static final q5.b c = new q5.b("SessionManager", null);
    public final y a;
    public final Context b;

    public g(y yVar, Context context) {
        this.a = yVar;
        this.b = context;
    }

    public final void a(h hVar) {
        x5.l.e("Must be called from the main thread.");
        try {
            y yVar = this.a;
            z zVar = new z(hVar);
            Parcel M0 = yVar.M0();
            com.google.android.gms.internal.cast.u.d(M0, zVar);
            yVar.Q0(M0, 2);
        } catch (RemoteException e10) {
            c.a(e10, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        q5.b bVar = c;
        x5.l.e("Must be called from the main thread.");
        try {
            Log.i(bVar.a, bVar.d("End session for %s", this.b.getPackageName()));
            y yVar = this.a;
            Parcel M0 = yVar.M0();
            int i9 = com.google.android.gms.internal.cast.u.a;
            M0.writeInt(1);
            M0.writeInt(z10 ? 1 : 0);
            yVar.Q0(M0, 6);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        x5.l.e("Must be called from the main thread.");
        f d = d();
        if (d == null || !(d instanceof c)) {
            return null;
        }
        return (c) d;
    }

    public final f d() {
        x5.l.e("Must be called from the main thread.");
        try {
            y yVar = this.a;
            Parcel O0 = yVar.O0(yVar.M0(), 1);
            h6.a J0 = h6.b.J0(O0.readStrongBinder());
            O0.recycle();
            return (f) h6.b.K0(J0);
        } catch (RemoteException e10) {
            c.a(e10, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
