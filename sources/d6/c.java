package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c extends f {
    public static final g6.b m = new g6.b("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final q e;
    public final b f;
    public final com.google.android.gms.internal.cast.r g;
    public final f6.i h;
    public e0 i;
    public e6.h j;
    public CastDevice k;
    public q4 l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = bVar;
        this.g = rVar;
        this.h = iVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).W0(bVar, f7, jVar);
            } catch (RemoteException | d e7) {
                com.google.android.gms.internal.cast.e.a.a(e7, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.i iVar = cVar.h;
        if (iVar.q) {
            iVar.q = false;
            e6.h hVar = iVar.n;
            if (hVar != null) {
                c0 c0Var = iVar.m;
                n6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.i.remove(c0Var);
                }
            }
            iVar.c.L0(null);
            cf.c cVar2 = iVar.h;
            if (cVar2 != null) {
                cVar2.x();
                cVar2.e = null;
            }
            cf.c cVar3 = iVar.i;
            if (cVar3 != null) {
                cVar3.x();
                cVar3.e = null;
            }
            android.support.v4.media.session.c0 c0Var2 = iVar.p;
            if (c0Var2 != null) {
                c0Var2.d(null, null);
                iVar.p.e(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.c0 c0Var3 = iVar.p;
            if (c0Var3 != null) {
                c0Var3.c(false);
                iVar.p.b();
                iVar.p = null;
            }
            iVar.n = null;
            iVar.o = null;
            iVar.h();
            if (i10 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
            e7.c = c6.z.b;
            e7.a = 8403;
            e0Var.e(1, e7.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = a6.m.U(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
            n6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.i = null;
        }
        cVar.k = null;
        e6.h hVar2 = cVar.j;
        if (hVar2 != null) {
            hVar2.v(null);
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
                    Parcel O0 = oVar.O0();
                    O0.writeInt(2476);
                    oVar.S0(O0, 5);
                    return;
                }
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar2 = (o) qVar;
                Parcel O02 = oVar2.O0();
                O02.writeInt(statusCode);
                oVar2.S0(O02, 5);
                return;
            }
            g6.t tVar = (g6.t) task.getResult();
            Status status = tVar.a;
            if (!status.b()) {
                bVar.b("%s() -> failure result", str);
                int i11 = status.a;
                o oVar3 = (o) qVar;
                Parcel O03 = oVar3.O0();
                O03.writeInt(i11);
                oVar3.S0(O03, 5);
                return;
            }
            bVar.b("%s() -> success result", str);
            e6.h hVar = new e6.h(new g6.m());
            cVar.j = hVar;
            hVar.v(cVar.i);
            cVar.j.p(new c0(cVar, i10));
            cVar.j.u();
            f6.i iVar = cVar.h;
            e6.h hVar2 = cVar.j;
            n6.l.e("Must be called from the main thread.");
            iVar.a(hVar2, cVar.k);
            c6.d dVar = tVar.b;
            n6.l.h(dVar);
            String str2 = tVar.c;
            String str3 = tVar.d;
            n6.l.h(str3);
            boolean z10 = tVar.e;
            o oVar4 = (o) qVar;
            Parcel O04 = oVar4.O0();
            com.google.android.gms.internal.cast.v.c(O04, dVar);
            O04.writeString(str2);
            O04.writeString(str3);
            O04.writeInt(z10 ? 1 : 0);
            oVar4.S0(O04, 4);
        } catch (RemoteException e7) {
            bVar.a(e7, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
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
                com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                e7.c = c6.z.b;
                e7.a = 8403;
                e0Var.e(1, e7.a());
                e0Var.h();
                com.google.android.gms.common.api.internal.n nVar = a6.m.U(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
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
            aa.a aVar2 = new aa.a(castDevice, new d0(this));
            aVar2.d = bundle2;
            c6.e eVar = new c6.e(aVar2);
            Context context = this.c;
            int i10 = c6.g.a;
            e0 e0Var2 = new e0(context, eVar);
            e0Var2.E.add(new i(this));
            this.i = e0Var2;
            com.google.android.gms.common.api.internal.p U = a6.m.U(e0Var2.f, e0Var2.k, "castDeviceControllerListenerKey");
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r();
            rVar.b = true;
            a6.i iVar = new a6.i(e0Var2, 10);
            c6.z zVar = c6.z.c;
            rVar.e = U;
            rVar.c = iVar;
            rVar.d = zVar;
            rVar.f = new k6.c[]{c6.y.a};
            rVar.a = 8428;
            e0Var2.b(rVar.a());
            return;
        }
        n6.l.e("Must be called from the main thread.");
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 9);
                int i11 = com.google.android.gms.internal.cast.v.a;
                z10 = Q0.readInt() != 0;
                Q0.recycle();
            } catch (RemoteException e10) {
                bVar.a(e10, "Unable to call %s on %s.", "isResuming", x.class.getSimpleName());
            }
            if (z10) {
                if (xVar == null) {
                    return;
                }
                try {
                    v vVar2 = (v) xVar;
                    Parcel O0 = vVar2.O0();
                    O0.writeInt(2151);
                    vVar2.S0(O0, 12);
                    return;
                } catch (RemoteException e11) {
                    bVar.a(e11, "Unable to call %s on %s.", "notifyFailedToStartSession", x.class.getSimpleName());
                    return;
                }
            }
            if (xVar == null) {
                return;
            }
            try {
                v vVar3 = (v) xVar;
                Parcel O02 = vVar3.O0();
                O02.writeInt(2153);
                vVar3.S0(O02, 15);
                return;
            } catch (RemoteException e12) {
                bVar.a(e12, "Unable to call %s on %s.", "notifyFailedToResumeSession", x.class.getSimpleName());
                return;
            }
        }
        z10 = false;
        if (z10) {
        }
    }
}
