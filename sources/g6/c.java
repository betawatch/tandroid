package g6;

import a8.r7;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c extends f {
    public static final j6.b m = new j6.b("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final q e;
    public final b f;
    public final com.google.android.gms.internal.cast.p g;
    public final i6.h h;
    public f6.e0 i;
    public h6.h j;
    public CastDevice k;
    public l4 l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.p pVar, i6.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = bVar;
        this.g = pVar;
        this.h = hVar;
        a7.a f10 = f();
        j jVar = new j(this);
        j6.b bVar2 = com.google.android.gms.internal.cast.d.a;
        q qVar = null;
        if (f10 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.d.b(context).x1(bVar, f10, jVar);
            } catch (RemoteException | d e10) {
                com.google.android.gms.internal.cast.d.a.a(e10, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i7) {
        i6.h hVar = cVar.h;
        if (hVar.q) {
            hVar.q = false;
            h6.h hVar2 = hVar.n;
            if (hVar2 != null) {
                c0 c0Var = hVar.m;
                q6.m.d("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar2.i.remove(c0Var);
                }
            }
            hVar.c.m1(null);
            r7 r7Var = hVar.h;
            if (r7Var != null) {
                r7Var.J();
                r7Var.f = null;
            }
            r7 r7Var2 = hVar.i;
            if (r7Var2 != null) {
                r7Var2.J();
                r7Var2.f = null;
            }
            android.support.v4.media.session.a0 a0Var = hVar.p;
            if (a0Var != null) {
                a0Var.s(null, null);
                hVar.p.t(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.a0 a0Var2 = hVar.p;
            if (a0Var2 != null) {
                a0Var2.r(false);
                hVar.p.q();
                hVar.p = null;
            }
            hVar.n = null;
            hVar.o = null;
            hVar.h();
            if (i7 == 0) {
                hVar.i();
            }
        }
        f6.e0 e0Var = cVar.i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
            b10.c = f6.z.b;
            b10.a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.m mVar = cb.c.o(e0Var.g, e0Var.l, "castDeviceControllerListenerKey").b;
            q6.m.h(mVar, "Key must not be null");
            e0Var.c(mVar, 8415);
            cVar.i = null;
        }
        cVar.k = null;
        h6.h hVar3 = cVar.j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        j6.b bVar = m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        int i7 = 0;
        try {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (!(exception instanceof com.google.android.gms.common.api.f)) {
                    o oVar = (o) qVar;
                    Parcel p12 = oVar.p1();
                    p12.writeInt(2476);
                    oVar.t1(p12, 5);
                    return;
                }
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar2 = (o) qVar;
                Parcel p13 = oVar2.p1();
                p13.writeInt(statusCode);
                oVar2.t1(p13, 5);
                return;
            }
            j6.t tVar = (j6.t) task.getResult();
            Status status = tVar.a;
            if (!status.b()) {
                bVar.b("%s() -> failure result", str);
                int i10 = status.a;
                o oVar3 = (o) qVar;
                Parcel p14 = oVar3.p1();
                p14.writeInt(i10);
                oVar3.t1(p14, 5);
                return;
            }
            bVar.b("%s() -> success result", str);
            h6.h hVar = new h6.h(new j6.m());
            cVar.j = hVar;
            hVar.v(cVar.i);
            cVar.j.p(new c0(cVar, i7));
            cVar.j.u();
            i6.h hVar2 = cVar.h;
            h6.h hVar3 = cVar.j;
            q6.m.d("Must be called from the main thread.");
            hVar2.a(hVar3, cVar.k);
            f6.d dVar = tVar.b;
            q6.m.g(dVar);
            String str2 = tVar.c;
            String str3 = tVar.d;
            q6.m.g(str3);
            boolean z9 = tVar.e;
            o oVar4 = (o) qVar;
            Parcel p15 = oVar4.p1();
            com.google.android.gms.internal.cast.t.c(p15, dVar);
            p15.writeString(str2);
            p15.writeString(str3);
            p15.writeInt(z9 ? 1 : 0);
            oVar4.t1(p15, 4);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z9;
        j6.b bVar = f.b;
        x xVar = this.a;
        CastDevice b10 = CastDevice.b(bundle);
        this.k = b10;
        if (b10 != null) {
            f6.e0 e0Var = this.i;
            if (e0Var != null) {
                com.google.android.gms.common.api.internal.s b11 = com.google.android.gms.common.api.internal.t.b();
                b11.c = f6.z.b;
                b11.a = 8403;
                e0Var.e(1, b11.a());
                e0Var.h();
                com.google.android.gms.common.api.internal.m mVar = cb.c.o(e0Var.g, e0Var.l, "castDeviceControllerListenerKey").b;
                q6.m.h(mVar, "Key must not be null");
                e0Var.c(mVar, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            q6.m.g(castDevice);
            Bundle bundle2 = new Bundle();
            b bVar2 = this.f;
            h6.a aVar = bVar2 == null ? null : bVar2.f;
            h6.f fVar = aVar != null ? aVar.d : null;
            boolean z10 = aVar != null && aVar.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z10);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.i);
            android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(castDevice, new e0(this));
            a0Var.d = bundle2;
            f6.e eVar = new f6.e(a0Var);
            Context context = this.c;
            int i7 = f6.g.a;
            f6.e0 e0Var2 = new f6.e0(context, eVar);
            e0Var2.F.add(new i(this));
            this.i = e0Var2;
            com.google.android.gms.common.api.internal.o o4 = cb.c.o(e0Var2.g, e0Var2.l, "castDeviceControllerListenerKey");
            bi.a aVar2 = new bi.a();
            aVar2.a = true;
            d6.i iVar = new d6.i(e0Var2, 23);
            f6.z zVar = f6.z.c;
            aVar2.e = o4;
            aVar2.c = iVar;
            aVar2.d = zVar;
            aVar2.f = new n6.c[]{f6.y.a};
            aVar2.b = 8428;
            e0Var2.b(aVar2.a());
            return;
        }
        q6.m.d("Must be called from the main thread.");
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel r12 = vVar.r1(vVar.p1(), 9);
                int i10 = com.google.android.gms.internal.cast.t.a;
                z9 = r12.readInt() != 0;
                r12.recycle();
            } catch (RemoteException e10) {
                bVar.a(e10, "Unable to call %s on %s.", "isResuming", x.class.getSimpleName());
            }
            if (z9) {
                if (xVar == null) {
                    return;
                }
                try {
                    v vVar2 = (v) xVar;
                    Parcel p12 = vVar2.p1();
                    p12.writeInt(2151);
                    vVar2.t1(p12, 12);
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
                Parcel p13 = vVar3.p1();
                p13.writeInt(2153);
                vVar3.t1(p13, 15);
                return;
            } catch (RemoteException e12) {
                bVar.a(e12, "Unable to call %s on %s.", "notifyFailedToResumeSession", x.class.getSimpleName());
                return;
            }
        }
        z9 = false;
        if (z9) {
        }
    }
}
