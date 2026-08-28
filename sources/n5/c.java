package n5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends f {
    public static final q5.b m = new q5.b("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final q e;
    public final b f;
    public final com.google.android.gms.internal.cast.q g;
    public final p5.h h;
    public m5.f0 i;
    public o5.h j;
    public CastDevice k;
    public o4 l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.q qVar, p5.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = bVar;
        this.g = qVar;
        this.h = hVar;
        h6.a f10 = f();
        j jVar = new j(this);
        q5.b bVar2 = com.google.android.gms.internal.cast.e.a;
        q qVar2 = null;
        if (f10 != null) {
            try {
                qVar2 = com.google.android.gms.internal.cast.e.b(context).U0(bVar, f10, jVar);
            } catch (RemoteException | d e10) {
                com.google.android.gms.internal.cast.e.a.a(e10, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.e = qVar2;
    }

    public static void g(c cVar, int i9) {
        p5.h hVar = cVar.h;
        if (hVar.q) {
            hVar.q = false;
            o5.h hVar2 = hVar.n;
            if (hVar2 != null) {
                d0 d0Var = hVar.m;
                x5.l.e("Must be called from the main thread.");
                if (d0Var != null) {
                    hVar2.i.remove(d0Var);
                }
            }
            hVar.c.J0(null);
            b3.b bVar = hVar.h;
            if (bVar != null) {
                bVar.C();
                bVar.e = null;
            }
            b3.b bVar2 = hVar.i;
            if (bVar2 != null) {
                bVar2.C();
                bVar2.e = null;
            }
            android.support.v4.media.session.d0 d0Var2 = hVar.p;
            if (d0Var2 != null) {
                d0Var2.d(null, null);
                hVar.p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.d0 d0Var3 = hVar.p;
            if (d0Var3 != null) {
                d0Var3.c(false);
                hVar.p.b();
                hVar.p = null;
            }
            hVar.n = null;
            hVar.o = null;
            hVar.h();
            if (i9 == 0) {
                hVar.i();
            }
        }
        m5.f0 f0Var = cVar.i;
        if (f0Var != null) {
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.c = m5.z.b;
            b10.a = 8403;
            f0Var.e(1, b10.b());
            f0Var.h();
            com.google.android.gms.common.api.internal.n nVar = fa.c.D(f0Var.f, f0Var.k, "castDeviceControllerListenerKey").c;
            x5.l.i(nVar, "Key must not be null");
            f0Var.c(nVar, 8415);
            cVar.i = null;
        }
        cVar.k = null;
        o5.h hVar3 = cVar.j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        q5.b bVar = m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        int i9 = 0;
        try {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (!(exception instanceof com.google.android.gms.common.api.f)) {
                    o oVar = (o) qVar;
                    Parcel M0 = oVar.M0();
                    M0.writeInt(2476);
                    oVar.Q0(M0, 5);
                    return;
                }
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar2 = (o) qVar;
                Parcel M02 = oVar2.M0();
                M02.writeInt(statusCode);
                oVar2.Q0(M02, 5);
                return;
            }
            q5.u uVar = (q5.u) task.getResult();
            Status status = uVar.a;
            if (!status.b()) {
                bVar.b("%s() -> failure result", str);
                int i10 = status.a;
                o oVar3 = (o) qVar;
                Parcel M03 = oVar3.M0();
                M03.writeInt(i10);
                oVar3.Q0(M03, 5);
                return;
            }
            bVar.b("%s() -> success result", str);
            o5.h hVar = new o5.h(new q5.n());
            cVar.j = hVar;
            hVar.v(cVar.i);
            cVar.j.p(new d0(cVar, i9));
            cVar.j.u();
            p5.h hVar2 = cVar.h;
            o5.h hVar3 = cVar.j;
            x5.l.e("Must be called from the main thread.");
            hVar2.a(hVar3, cVar.k);
            m5.d dVar = uVar.b;
            x5.l.h(dVar);
            String str2 = uVar.c;
            String str3 = uVar.d;
            x5.l.h(str3);
            boolean z10 = uVar.e;
            o oVar4 = (o) qVar;
            Parcel M04 = oVar4.M0();
            com.google.android.gms.internal.cast.u.c(M04, dVar);
            M04.writeString(str2);
            M04.writeString(str3);
            M04.writeInt(z10 ? 1 : 0);
            oVar4.Q0(M04, 4);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z10;
        q5.b bVar = f.b;
        x xVar = this.a;
        CastDevice b10 = CastDevice.b(bundle);
        this.k = b10;
        int i9 = 0;
        if (b10 != null) {
            m5.f0 f0Var = this.i;
            if (f0Var != null) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.c = m5.z.b;
                b11.a = 8403;
                f0Var.e(1, b11.b());
                f0Var.h();
                com.google.android.gms.common.api.internal.n nVar = fa.c.D(f0Var.f, f0Var.k, "castDeviceControllerListenerKey").c;
                x5.l.i(nVar, "Key must not be null");
                f0Var.c(nVar, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            x5.l.h(castDevice);
            Bundle bundle2 = new Bundle();
            b bVar2 = this.f;
            o5.a aVar = bVar2 == null ? null : bVar2.f;
            o5.f fVar = aVar != null ? aVar.d : null;
            boolean z11 = aVar != null && aVar.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z11);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.i);
            j4.c cVar = new j4.c(castDevice, new f0(this));
            cVar.d = bundle2;
            m5.e eVar = new m5.e(cVar);
            Context context = this.c;
            int i10 = m5.g.a;
            m5.f0 f0Var2 = new m5.f0(context, eVar);
            f0Var2.E.add(new i(this));
            this.i = f0Var2;
            com.google.android.gms.common.api.internal.p D = fa.c.D(f0Var2.f, f0Var2.k, "castDeviceControllerListenerKey");
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r();
            rVar.b = true;
            m5.c0 c0Var = new m5.c0(f0Var2, i9);
            m5.z zVar = m5.z.c;
            rVar.e = D;
            rVar.c = c0Var;
            rVar.d = zVar;
            rVar.f = new u5.c[]{m5.y.a};
            rVar.a = 8428;
            f0Var2.b(rVar.a());
            return;
        }
        x5.l.e("Must be called from the main thread.");
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 9);
                int i11 = com.google.android.gms.internal.cast.u.a;
                z10 = O0.readInt() != 0;
                O0.recycle();
            } catch (RemoteException e10) {
                bVar.a(e10, "Unable to call %s on %s.", "isResuming", x.class.getSimpleName());
            }
            if (z10) {
                if (xVar == null) {
                    return;
                }
                try {
                    v vVar2 = (v) xVar;
                    Parcel M0 = vVar2.M0();
                    M0.writeInt(2151);
                    vVar2.Q0(M0, 12);
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
                Parcel M02 = vVar3.M0();
                M02.writeInt(2153);
                vVar3.Q0(M02, 15);
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
