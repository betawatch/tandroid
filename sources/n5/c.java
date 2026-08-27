package n5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import m5.f0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends g {
    public static final r5.b m = new r5.b("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final r e;
    public final b f;
    public final com.google.android.gms.internal.cast.p g;
    public final p5.h h;
    public f0 i;
    public o5.h j;
    public CastDevice k;
    public m4 l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.p pVar, p5.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = bVar;
        this.g = pVar;
        this.h = hVar;
        i6.a f10 = f();
        k kVar = new k(this);
        r5.b bVar2 = com.google.android.gms.internal.cast.e.a;
        r rVar = null;
        if (f10 != null) {
            try {
                rVar = com.google.android.gms.internal.cast.e.b(context).U0(bVar, f10, kVar);
            } catch (RemoteException | d e9) {
                com.google.android.gms.internal.cast.e.a.a(e9, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.e = rVar;
    }

    public static void g(c cVar, int i10) {
        p5.h hVar = cVar.h;
        if (hVar.q) {
            hVar.q = false;
            o5.h hVar2 = hVar.n;
            if (hVar2 != null) {
                d0 d0Var = hVar.m;
                y5.l.e("Must be called from the main thread.");
                if (d0Var != null) {
                    hVar2.i.remove(d0Var);
                }
            }
            hVar.c.J0(null);
            af.h hVar3 = hVar.h;
            if (hVar3 != null) {
                hVar3.D();
                hVar3.e = null;
            }
            af.h hVar4 = hVar.i;
            if (hVar4 != null) {
                hVar4.D();
                hVar4.e = null;
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
            if (i10 == 0) {
                hVar.i();
            }
        }
        f0 f0Var = cVar.i;
        if (f0Var != null) {
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.c = m5.a0.b;
            b10.a = 8403;
            f0Var.e(1, b10.b());
            f0Var.h();
            com.google.android.gms.common.api.internal.n nVar = a9.i.N(f0Var.f, f0Var.k, "castDeviceControllerListenerKey").c;
            y5.l.i(nVar, "Key must not be null");
            f0Var.c(nVar, 8415);
            cVar.i = null;
        }
        cVar.k = null;
        o5.h hVar5 = cVar.j;
        if (hVar5 != null) {
            hVar5.v(null);
            cVar.j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        r5.b bVar = m;
        r rVar = cVar.e;
        if (rVar == null) {
            return;
        }
        int i10 = 0;
        try {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (!(exception instanceof com.google.android.gms.common.api.f)) {
                    p pVar = (p) rVar;
                    Parcel M0 = pVar.M0();
                    M0.writeInt(2476);
                    pVar.Q0(M0, 5);
                    return;
                }
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                p pVar2 = (p) rVar;
                Parcel M02 = pVar2.M0();
                M02.writeInt(statusCode);
                pVar2.Q0(M02, 5);
                return;
            }
            r5.u uVar = (r5.u) task.getResult();
            Status status = uVar.a;
            if (!status.b()) {
                bVar.b("%s() -> failure result", str);
                int i11 = status.a;
                p pVar3 = (p) rVar;
                Parcel M03 = pVar3.M0();
                M03.writeInt(i11);
                pVar3.Q0(M03, 5);
                return;
            }
            bVar.b("%s() -> success result", str);
            o5.h hVar = new o5.h(new r5.n());
            cVar.j = hVar;
            hVar.v(cVar.i);
            cVar.j.p(new d0(cVar, i10));
            cVar.j.u();
            p5.h hVar2 = cVar.h;
            o5.h hVar3 = cVar.j;
            y5.l.e("Must be called from the main thread.");
            hVar2.a(hVar3, cVar.k);
            m5.d dVar = uVar.b;
            y5.l.h(dVar);
            String str2 = uVar.c;
            String str3 = uVar.d;
            y5.l.h(str3);
            boolean z10 = uVar.e;
            p pVar4 = (p) rVar;
            Parcel M04 = pVar4.M0();
            com.google.android.gms.internal.cast.t.c(M04, dVar);
            M04.writeString(str2);
            M04.writeString(str3);
            M04.writeInt(z10 ? 1 : 0);
            pVar4.Q0(M04, 4);
        } catch (RemoteException e9) {
            bVar.a(e9, "Unable to call %s on %s.", "methods", r.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z10;
        r5.b bVar = g.b;
        y yVar = this.a;
        CastDevice b10 = CastDevice.b(bundle);
        this.k = b10;
        if (b10 != null) {
            f0 f0Var = this.i;
            if (f0Var != null) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.c = m5.a0.b;
                b11.a = 8403;
                f0Var.e(1, b11.b());
                f0Var.h();
                com.google.android.gms.common.api.internal.n nVar = a9.i.N(f0Var.f, f0Var.k, "castDeviceControllerListenerKey").c;
                y5.l.i(nVar, "Key must not be null");
                f0Var.c(nVar, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            y5.l.h(castDevice);
            Bundle bundle2 = new Bundle();
            b bVar2 = this.f;
            o5.a aVar = bVar2 == null ? null : bVar2.f;
            o5.f fVar = aVar != null ? aVar.d : null;
            boolean z11 = aVar != null && aVar.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z11);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.i);
            j9.a aVar2 = new j9.a(castDevice, new e0(this));
            aVar2.d = bundle2;
            m5.e eVar = new m5.e(aVar2);
            Context context = this.c;
            int i10 = m5.g.a;
            f0 f0Var2 = new f0(context, eVar);
            f0Var2.E.add(new j(this));
            this.i = f0Var2;
            com.google.android.gms.common.api.internal.p N = a9.i.N(f0Var2.f, f0Var2.k, "castDeviceControllerListenerKey");
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r();
            rVar.b = true;
            ae.b bVar3 = new ae.b(f0Var2, 28);
            m5.a0 a0Var = m5.a0.c;
            rVar.e = N;
            rVar.c = bVar3;
            rVar.d = a0Var;
            rVar.f = new v5.c[]{m5.z.a};
            rVar.a = 8428;
            f0Var2.b(rVar.a());
            return;
        }
        y5.l.e("Must be called from the main thread.");
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel O0 = wVar.O0(wVar.M0(), 9);
                int i11 = com.google.android.gms.internal.cast.t.a;
                z10 = O0.readInt() != 0;
                O0.recycle();
            } catch (RemoteException e9) {
                bVar.a(e9, "Unable to call %s on %s.", "isResuming", y.class.getSimpleName());
            }
            if (z10) {
                if (yVar == null) {
                    return;
                }
                try {
                    w wVar2 = (w) yVar;
                    Parcel M0 = wVar2.M0();
                    M0.writeInt(2151);
                    wVar2.Q0(M0, 12);
                    return;
                } catch (RemoteException e10) {
                    bVar.a(e10, "Unable to call %s on %s.", "notifyFailedToStartSession", y.class.getSimpleName());
                    return;
                }
            }
            if (yVar == null) {
                return;
            }
            try {
                w wVar3 = (w) yVar;
                Parcel M02 = wVar3.M0();
                M02.writeInt(2153);
                wVar3.Q0(M02, 15);
                return;
            } catch (RemoteException e11) {
                bVar.a(e11, "Unable to call %s on %s.", "notifyFailedToResumeSession", y.class.getSimpleName());
                return;
            }
        }
        z10 = false;
        if (z10) {
        }
    }
}
