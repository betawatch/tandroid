package n5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h {
    public static final r5.b c = new r5.b("SessionManager", null);
    public final z a;
    public final Context b;

    public h(z zVar, Context context) {
        this.a = zVar;
        this.b = context;
    }

    public final void a(i iVar) {
        y5.l.e("Must be called from the main thread.");
        try {
            z zVar = this.a;
            a0 a0Var = new a0(iVar);
            Parcel M0 = zVar.M0();
            com.google.android.gms.internal.cast.t.d(M0, a0Var);
            zVar.Q0(M0, 2);
        } catch (RemoteException e9) {
            c.a(e9, "Unable to call %s on %s.", "addSessionManagerListener", z.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        r5.b bVar = c;
        y5.l.e("Must be called from the main thread.");
        try {
            Log.i(bVar.a, bVar.d("End session for %s", this.b.getPackageName()));
            z zVar = this.a;
            Parcel M0 = zVar.M0();
            int i10 = com.google.android.gms.internal.cast.t.a;
            M0.writeInt(1);
            M0.writeInt(z10 ? 1 : 0);
            zVar.Q0(M0, 6);
        } catch (RemoteException e9) {
            bVar.a(e9, "Unable to call %s on %s.", "endCurrentSession", z.class.getSimpleName());
        }
    }

    public final c c() {
        y5.l.e("Must be called from the main thread.");
        g d = d();
        if (d == null || !(d instanceof c)) {
            return null;
        }
        return (c) d;
    }

    public final g d() {
        y5.l.e("Must be called from the main thread.");
        try {
            z zVar = this.a;
            Parcel O0 = zVar.O0(zVar.M0(), 1);
            i6.a J0 = i6.b.J0(O0.readStrongBinder());
            O0.recycle();
            return (g) i6.b.K0(J0);
        } catch (RemoteException e9) {
            c.a(e9, "Unable to call %s on %s.", "getWrappedCurrentSession", z.class.getSimpleName());
            return null;
        }
    }
}
