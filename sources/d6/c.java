package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class c extends f {
    public static final g6.b m = new g6.b("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final q e;
    public final b f;
    public final com.google.android.gms.internal.cast.r g;
    public final f6.h h;
    public e0 i;
    public e6.h j;
    public CastDevice k;
    public o4 l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = bVar;
        this.g = rVar;
        this.h = hVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).V0(bVar, f7, jVar);
            } catch (RemoteException | d e) {
                com.google.android.gms.internal.cast.e.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.h hVar = cVar.h;
        if (hVar.q) {
            hVar.q = false;
            e6.h hVar2 = hVar.n;
            if (hVar2 != null) {
                c0 c0Var = hVar.m;
                n6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar2.i.remove(c0Var);
                }
            }
            hVar.c.K0(null);
            z5 z5Var = hVar.h;
            if (z5Var != null) {
                z5Var.C();
                z5Var.e = null;
            }
            z5 z5Var2 = hVar.i;
            if (z5Var2 != null) {
                z5Var2.C();
                z5Var2.e = null;
            }
            android.support.v4.media.session.b0 b0Var = hVar.p;
            if (b0Var != null) {
                b0Var.d(null, null);
                hVar.p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.b0 b0Var2 = hVar.p;
            if (b0Var2 != null) {
                b0Var2.c(false);
                hVar.p.b();
                hVar.p = null;
            }
            hVar.n = null;
            hVar.o = null;
            hVar.h();
            if (i10 == 0) {
                hVar.i();
            }
        }
        e0 e0Var = cVar.i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
            b10.c = c6.z.b;
            b10.a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = qb.c.d(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
            n6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.i = null;
        }
        cVar.k = null;
        e6.h hVar3 = cVar.j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        int i10 = 0;
        try {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (!(exception instanceof com.google.android.gms.common.api.f)) {
                    o oVar = (o) qVar;
                    Parcel N0 = oVar.N0();
                    N0.writeInt(2476);
                    oVar.R0(N0, 5);
                    return;
                }
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar2 = (o) qVar;
                Parcel N02 = oVar2.N0();
                N02.writeInt(statusCode);
                oVar2.R0(N02, 5);
                return;
            }
            g6.t tVar = (g6.t) task.getResult();
            Status status = tVar.a;
            if (!status.b()) {
                bVar.b("%s() -> failure result", str);
                int i11 = status.a;
                o oVar3 = (o) qVar;
                Parcel N03 = oVar3.N0();
                N03.writeInt(i11);
                oVar3.R0(N03, 5);
                return;
            }
            bVar.b("%s() -> success result", str);
            e6.h hVar = new e6.h(new g6.m());
            cVar.j = hVar;
            hVar.v(cVar.i);
            cVar.j.p(new c0(cVar, i10));
            cVar.j.u();
            f6.h hVar2 = cVar.h;
            e6.h hVar3 = cVar.j;
            n6.l.e("Must be called from the main thread.");
            hVar2.a(hVar3, cVar.k);
            c6.d dVar = tVar.b;
            n6.l.h(dVar);
            String str2 = tVar.c;
            String str3 = tVar.d;
            n6.l.h(str3);
            boolean z10 = tVar.e;
            o oVar4 = (o) qVar;
            Parcel N04 = oVar4.N0();
            com.google.android.gms.internal.cast.v.c(N04, dVar);
            N04.writeString(str2);
            N04.writeString(str3);
            N04.writeInt(z10 ? 1 : 0);
            oVar4.R0(N04, 4);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z10;
        g6.b bVar = f.b;
        x xVar = this.a;
        CastDevice b10 = CastDevice.b(bundle);
        this.k = b10;
        if (b10 != null) {
            e0 e0Var = this.i;
            if (e0Var != null) {
                com.google.android.gms.common.api.internal.u b11 = com.google.android.gms.common.api.internal.v.b();
                b11.c = c6.z.b;
                b11.a = 8403;
                e0Var.e(1, b11.a());
                e0Var.h();
                com.google.android.gms.common.api.internal.n nVar = qb.c.d(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
                n6.l.i(nVar, "Key must not be null");
                e0Var.c(nVar, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            n6.l.h(castDevice);
            Bundle bundle2 = new Bundle();
            b bVar2 = this.f;
            e6.a aVar = bVar2 == null ? null : bVar2.f;
            e6.f fVar = aVar != null ? aVar.d : null;
            boolean z11 = aVar != null && aVar.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z11);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.i);
            androidx.biometric.e eVar = new androidx.biometric.e(castDevice, new d0(this));
            eVar.d = bundle2;
            c6.e eVar2 = new c6.e(eVar);
            Context context = this.c;
            int i10 = c6.g.a;
            e0 e0Var2 = new e0(context, eVar2);
            e0Var2.E.add(new i(this));
            this.i = e0Var2;
            com.google.android.gms.common.api.internal.p d = qb.c.d(e0Var2.f, e0Var2.k, "castDeviceControllerListenerKey");
            ai.a aVar2 = new ai.a();
            aVar2.a = true;
            a4.l lVar = new a4.l(e0Var2, 8);
            c6.z zVar = c6.z.c;
            aVar2.e = d;
            aVar2.c = lVar;
            aVar2.d = zVar;
            aVar2.f = new k6.c[]{c6.y.a};
            aVar2.b = 8428;
            e0Var2.b(aVar2.a());
            return;
        }
        n6.l.e("Must be called from the main thread.");
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 9);
                int i11 = com.google.android.gms.internal.cast.v.a;
                z10 = P0.readInt() != 0;
                P0.recycle();
            } catch (RemoteException e) {
                bVar.a(e, "Unable to call %s on %s.", "isResuming", x.class.getSimpleName());
            }
            if (z10) {
                if (xVar == null) {
                    return;
                }
                try {
                    v vVar2 = (v) xVar;
                    Parcel N0 = vVar2.N0();
                    N0.writeInt(2151);
                    vVar2.R0(N0, 12);
                    return;
                } catch (RemoteException e7) {
                    bVar.a(e7, "Unable to call %s on %s.", "notifyFailedToStartSession", x.class.getSimpleName());
                    return;
                }
            }
            if (xVar == null) {
                return;
            }
            try {
                v vVar3 = (v) xVar;
                Parcel N02 = vVar3.N0();
                N02.writeInt(2153);
                vVar3.R0(N02, 15);
                return;
            } catch (RemoteException e10) {
                bVar.a(e10, "Unable to call %s on %s.", "notifyFailedToResumeSession", x.class.getSimpleName());
                return;
            }
        }
        z10 = false;
        if (z10) {
        }
    }
}
