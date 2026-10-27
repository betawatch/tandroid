package e6;

import a8.h0;
import a8.me;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.tasks.Task;
import d6.e0;
import java.util.HashSet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends f {
    public static final h6.b m = new h6.b("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final q e;
    public final b f;
    public final com.google.android.gms.internal.cast.p g;
    public final g6.h h;
    public e0 i;
    public f6.h j;
    public CastDevice k;
    public l4 l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.p pVar, g6.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = bVar;
        this.g = pVar;
        this.h = hVar;
        y6.a f7 = f();
        j jVar = new j(this);
        h6.b bVar2 = com.google.android.gms.internal.cast.d.a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.d.b(context).V0(bVar, f7, jVar);
            } catch (RemoteException | d e) {
                com.google.android.gms.internal.cast.d.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i10) {
        g6.h hVar = cVar.h;
        if (hVar.q) {
            hVar.q = false;
            f6.h hVar2 = hVar.n;
            if (hVar2 != null) {
                c0 c0Var = hVar.m;
                o6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar2.i.remove(c0Var);
                }
            }
            hVar.c.K0(null);
            me meVar = hVar.h;
            if (meVar != null) {
                meVar.C();
                meVar.e = null;
            }
            me meVar2 = hVar.i;
            if (meVar2 != null) {
                meVar2.C();
                meVar2.e = null;
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
            b10.c = d6.z.b;
            b10.a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = za.c.l(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
            o6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.i = null;
        }
        cVar.k = null;
        f6.h hVar3 = cVar.j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        h6.b bVar = m;
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
            h6.t tVar = (h6.t) task.getResult();
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
            f6.h hVar = new f6.h(new h6.m());
            cVar.j = hVar;
            hVar.v(cVar.i);
            cVar.j.p(new c0(cVar, i10));
            cVar.j.u();
            g6.h hVar2 = cVar.h;
            f6.h hVar3 = cVar.j;
            o6.l.e("Must be called from the main thread.");
            hVar2.a(hVar3, cVar.k);
            d6.d dVar = tVar.b;
            o6.l.h(dVar);
            String str2 = tVar.c;
            String str3 = tVar.d;
            o6.l.h(str3);
            boolean z10 = tVar.e;
            o oVar4 = (o) qVar;
            Parcel N04 = oVar4.N0();
            com.google.android.gms.internal.cast.t.c(N04, dVar);
            N04.writeString(str2);
            N04.writeString(str3);
            N04.writeInt(z10 ? 1 : 0);
            oVar4.R0(N04, 4);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z10;
        h6.b bVar = f.b;
        x xVar = this.a;
        CastDevice b10 = CastDevice.b(bundle);
        this.k = b10;
        if (b10 != null) {
            e0 e0Var = this.i;
            if (e0Var != null) {
                com.google.android.gms.common.api.internal.u b11 = com.google.android.gms.common.api.internal.v.b();
                b11.c = d6.z.b;
                b11.a = 8403;
                e0Var.e(1, b11.a());
                e0Var.h();
                com.google.android.gms.common.api.internal.n nVar = za.c.l(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
                o6.l.i(nVar, "Key must not be null");
                e0Var.c(nVar, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            o6.l.h(castDevice);
            Bundle bundle2 = new Bundle();
            b bVar2 = this.f;
            f6.a aVar = bVar2 == null ? null : bVar2.f;
            f6.f fVar = aVar != null ? aVar.d : null;
            boolean z11 = aVar != null && aVar.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z11);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.i);
            h0 h0Var = new h0(castDevice, new d0(this));
            h0Var.d = bundle2;
            d6.e eVar = new d6.e(h0Var);
            Context context = this.c;
            int i10 = d6.g.a;
            e0 e0Var2 = new e0(context, eVar);
            e0Var2.E.add(new i(this));
            this.i = e0Var2;
            com.google.android.gms.common.api.internal.p l4 = za.c.l(e0Var2.f, e0Var2.k, "castDeviceControllerListenerKey");
            bi.a aVar2 = new bi.a();
            aVar2.a = true;
            rb.c cVar = new rb.c(e0Var2, 16);
            d6.z zVar = d6.z.c;
            aVar2.e = l4;
            aVar2.c = cVar;
            aVar2.d = zVar;
            aVar2.f = new l6.c[]{d6.y.a};
            aVar2.b = 8428;
            e0Var2.b(aVar2.a());
            return;
        }
        o6.l.e("Must be called from the main thread.");
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 9);
                int i11 = com.google.android.gms.internal.cast.t.a;
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
                } catch (RemoteException e10) {
                    bVar.a(e10, "Unable to call %s on %s.", "notifyFailedToStartSession", x.class.getSimpleName());
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
            } catch (RemoteException e11) {
                bVar.a(e11, "Unable to call %s on %s.", "notifyFailedToResumeSession", x.class.getSimpleName());
                return;
            }
        }
        z10 = false;
        if (z10) {
        }
    }
}
