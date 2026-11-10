package g6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g {
    public static final j6.b c = new j6.b("SessionManager", null);
    public final y a;
    public final Context b;

    public g(y yVar, Context context) {
        this.a = yVar;
        this.b = context;
    }

    public final void a(h hVar) {
        q6.m.d("Must be called from the main thread.");
        try {
            y yVar = this.a;
            z zVar = new z(hVar);
            Parcel p12 = yVar.p1();
            com.google.android.gms.internal.cast.t.d(p12, zVar);
            yVar.t1(p12, 2);
        } catch (RemoteException e10) {
            c.a(e10, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z9) {
        j6.b bVar = c;
        q6.m.d("Must be called from the main thread.");
        try {
            Log.i(bVar.a, bVar.d("End session for %s", this.b.getPackageName()));
            y yVar = this.a;
            Parcel p12 = yVar.p1();
            int i7 = com.google.android.gms.internal.cast.t.a;
            p12.writeInt(1);
            p12.writeInt(z9 ? 1 : 0);
            yVar.t1(p12, 6);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        q6.m.d("Must be called from the main thread.");
        f d = d();
        if (d == null || !(d instanceof c)) {
            return null;
        }
        return (c) d;
    }

    public final f d() {
        q6.m.d("Must be called from the main thread.");
        try {
            y yVar = this.a;
            Parcel r12 = yVar.r1(yVar.p1(), 1);
            a7.a m12 = a7.b.m1(r12.readStrongBinder());
            r12.recycle();
            return (f) a7.b.n1(m12);
        } catch (RemoteException e10) {
            c.a(e10, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
