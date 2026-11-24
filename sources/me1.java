// default package

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Field;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class me1 extends f7a {
    public static final ce6 m = new ce6("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final had e;
    public final le1 f;
    public final qed g;
    public final lif h;
    public bhd i;
    public k89 j;
    public CastDevice k;
    public fkd l;

    public me1(Context context, String str, String str2, le1 le1Var, qed qedVar, lif lifVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = le1Var;
        this.g = qedVar;
        this.h = lifVar;
        xk5 f = f();
        t7d t7dVar = new t7d(this);
        ce6 ce6Var = v8d.a;
        had hadVar = null;
        if (f != null) {
            try {
                hadVar = v8d.b(context).Z(le1Var, f, t7dVar);
            } catch (RemoteException | sg7 e) {
                v8d.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", q9d.class.getSimpleName());
            }
        }
        this.e = hadVar;
    }

    public static void g(me1 me1Var, int i) {
        lif lifVar = me1Var.h;
        if (lifVar.q) {
            lifVar.q = false;
            k89 k89Var = lifVar.n;
            if (k89Var != null) {
                ddf ddfVar = lifVar.m;
                ite.e("Must be called from the main thread.");
                if (ddfVar != null) {
                    k89Var.i.remove(ddfVar);
                }
            }
            lifVar.c.T(null);
            sm2 sm2Var = lifVar.h;
            if (sm2Var != null) {
                sm2Var.Q();
                sm2Var.f = null;
            }
            sm2 sm2Var2 = lifVar.i;
            if (sm2Var2 != null) {
                sm2Var2.Q();
                sm2Var2.f = null;
            }
            mx6 mx6Var = lifVar.p;
            if (mx6Var != null) {
                mx6Var.o0(null, null);
                lifVar.p.q0(new MediaMetadataCompat(new Bundle()));
                lifVar.j(0, null);
            }
            mx6 mx6Var2 = lifVar.p;
            if (mx6Var2 != null) {
                mx6Var2.l0(false);
                zw6 zw6Var = (zw6) lifVar.p.b;
                MediaSession mediaSession = zw6Var.a;
                zw6Var.e.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                    }
                }
                mediaSession.setCallback(null);
                zw6Var.b.a.set(null);
                mediaSession.release();
                lifVar.p = null;
            }
            lifVar.n = null;
            lifVar.o = null;
            lifVar.h();
            if (i == 0) {
                lifVar.i();
            }
        }
        bhd bhdVar = me1Var.i;
        if (bhdVar != null) {
            bib b = cib.b();
            b.a = nf5.e;
            b.d = (char) 8403;
            bhdVar.e(1, b.a());
            bhdVar.h();
            u76 u76Var = fk3.U(bhdVar.g, bhdVar.l, "castDeviceControllerListenerKey").b;
            ite.i(u76Var, "Key must not be null");
            bhdVar.c(u76Var, 8415);
            me1Var.i = null;
        }
        me1Var.k = null;
        k89 k89Var2 = me1Var.j;
        if (k89Var2 != null) {
            k89Var2.v(null);
            me1Var.j = null;
        }
    }

    public static void h(me1 me1Var, String str, Task task) {
        ce6 ce6Var = m;
        had hadVar = me1Var.e;
        if (hadVar == null) {
            return;
        }
        byte b = 0;
        try {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (!(exception instanceof ap)) {
                    w9d w9dVar = (w9d) hadVar;
                    Parcel R = w9dVar.R();
                    R.writeInt(2476);
                    w9dVar.V(R, 5);
                    return;
                }
                int statusCode = ((ap) exception).getStatusCode();
                w9d w9dVar2 = (w9d) hadVar;
                Parcel R2 = w9dVar2.R();
                R2.writeInt(statusCode);
                w9dVar2.V(R2, 5);
                return;
            }
            kbf kbfVar = (kbf) task.getResult();
            Status status = kbfVar.a;
            if (!status.b()) {
                ce6Var.b("%s() -> failure result", str);
                int i = status.a;
                w9d w9dVar3 = (w9d) hadVar;
                Parcel R3 = w9dVar3.R();
                R3.writeInt(i);
                w9dVar3.V(R3, 5);
                return;
            }
            ce6Var.b("%s() -> success result", str);
            k89 k89Var = new k89(new abd());
            me1Var.j = k89Var;
            k89Var.v(me1Var.i);
            me1Var.j.p(new ddf(me1Var, b));
            me1Var.j.u();
            lif lifVar = me1Var.h;
            k89 k89Var2 = me1Var.j;
            ite.e("Must be called from the main thread.");
            lifVar.a(k89Var2, me1Var.k);
            ws wsVar = kbfVar.b;
            ite.h(wsVar);
            String str2 = kbfVar.c;
            String str3 = kbfVar.d;
            ite.h(str3);
            boolean z = kbfVar.e;
            w9d w9dVar4 = (w9d) hadVar;
            Parcel R4 = w9dVar4.R();
            kid.c(R4, wsVar);
            R4.writeString(str2);
            R4.writeString(str3);
            R4.writeInt(z ? 1 : 0);
            w9dVar4.V(R4, 4);
        } catch (RemoteException e) {
            ce6Var.a(e, "Unable to call %s on %s.", "methods", had.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z;
        icd icdVar = this.a;
        ce6 ce6Var = f7a.b;
        CastDevice b = CastDevice.b(bundle);
        this.k = b;
        if (b != null) {
            bhd bhdVar = this.i;
            if (bhdVar != null) {
                bib b2 = cib.b();
                b2.a = nf5.e;
                b2.d = (char) 8403;
                bhdVar.e(1, b2.a());
                bhdVar.h();
                u76 u76Var = fk3.U(bhdVar.g, bhdVar.l, "castDeviceControllerListenerKey").b;
                ite.i(u76Var, "Key must not be null");
                bhdVar.c(u76Var, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            ite.h(castDevice);
            Bundle bundle2 = new Bundle();
            le1 le1Var = this.f;
            je1 je1Var = le1Var == null ? null : le1Var.f;
            tn7 tn7Var = je1Var != null ? je1Var.d : null;
            boolean z2 = je1Var != null && je1Var.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", tn7Var != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z2);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.f);
            mx6 mx6Var = new mx6(castDevice, new vjf(this));
            mx6Var.d = bundle2;
            ge1 ge1Var = new ge1(mx6Var);
            Context context = this.c;
            int i = he1.a;
            bhd bhdVar2 = new bhd(context, ge1Var);
            bhdVar2.F.add(new l7d(this));
            this.i = bhdVar2;
            w76 U = fk3.U(bhdVar2.g, bhdVar2.l, "castDeviceControllerListenerKey");
            v79 v79Var = new v79();
            v79Var.e = true;
            x59 x59Var = new x59(bhdVar2, (byte) 28);
            k1f k1fVar = k1f.f;
            v79Var.c = U;
            v79Var.a = x59Var;
            v79Var.b = k1fVar;
            v79Var.d = new o94[]{jgd.a};
            v79Var.f = (short) 8428;
            bhdVar2.b(v79Var.a());
            return;
        }
        ite.e("Must be called from the main thread.");
        if (icdVar != null) {
            try {
                vbd vbdVar = (vbd) icdVar;
                Parcel T = vbdVar.T(vbdVar.R(), 9);
                int i2 = kid.a;
                z = T.readInt() != 0;
                T.recycle();
            } catch (RemoteException e) {
                ce6Var.a(e, "Unable to call %s on %s.", "isResuming", icd.class.getSimpleName());
            }
            if (z) {
                if (icdVar != null) {
                    try {
                        vbd vbdVar2 = (vbd) icdVar;
                        Parcel R = vbdVar2.R();
                        R.writeInt(2151);
                        vbdVar2.V(R, 12);
                        return;
                    } catch (RemoteException e2) {
                        ce6Var.a(e2, "Unable to call %s on %s.", "notifyFailedToStartSession", icd.class.getSimpleName());
                        return;
                    }
                }
                return;
            }
            if (icdVar != null) {
                try {
                    vbd vbdVar3 = (vbd) icdVar;
                    Parcel R2 = vbdVar3.R();
                    R2.writeInt(2153);
                    vbdVar3.V(R2, 15);
                    return;
                } catch (RemoteException e3) {
                    ce6Var.a(e3, "Unable to call %s on %s.", "notifyFailedToResumeSession", icd.class.getSimpleName());
                    return;
                }
            }
            return;
        }
        z = false;
        if (z) {
        }
    }
}
