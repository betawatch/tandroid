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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class md1 extends v8a {
    public static final he6 m = new he6("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final ycd e;
    public final ld1 f;
    public final hhd g;
    public final alf h;
    public rjd i;
    public v99 j;
    public CastDevice k;
    public uae l;

    public md1(Context context, String str, String str2, ld1 ld1Var, hhd hhdVar, alf alfVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = ld1Var;
        this.g = hhdVar;
        this.h = alfVar;
        al5 f = f();
        kad kadVar = new kad(this);
        he6 he6Var = mbd.a;
        ycd ycdVar = null;
        if (f != null) {
            try {
                ycdVar = mbd.b(context).Z(ld1Var, f, kadVar);
            } catch (RemoteException | zg7 e) {
                mbd.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", hcd.class.getSimpleName());
            }
        }
        this.e = ycdVar;
    }

    public static void g(md1 md1Var, int i) {
        alf alfVar = md1Var.h;
        if (alfVar.q) {
            alfVar.q = false;
            v99 v99Var = alfVar.n;
            if (v99Var != null) {
                sff sffVar = alfVar.m;
                xve.e("Must be called from the main thread.");
                if (sffVar != null) {
                    v99Var.i.remove(sffVar);
                }
            }
            alfVar.c.T(null);
            am2 am2Var = alfVar.h;
            if (am2Var != null) {
                am2Var.Q();
                am2Var.f = null;
            }
            am2 am2Var2 = alfVar.i;
            if (am2Var2 != null) {
                am2Var2.Q();
                am2Var2.f = null;
            }
            rx6 rx6Var = alfVar.p;
            if (rx6Var != null) {
                rx6Var.p0(null, null);
                alfVar.p.r0(new MediaMetadataCompat(new Bundle()));
                alfVar.j(0, null);
            }
            rx6 rx6Var2 = alfVar.p;
            if (rx6Var2 != null) {
                rx6Var2.n0(false);
                ex6 ex6Var = (ex6) alfVar.p.b;
                MediaSession mediaSession = ex6Var.a;
                ex6Var.e.kill();
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
                ex6Var.b.a.set(null);
                mediaSession.release();
                alfVar.p = null;
            }
            alfVar.n = null;
            alfVar.o = null;
            alfVar.h();
            if (i == 0) {
                alfVar.i();
            }
        }
        rjd rjdVar = md1Var.i;
        if (rjdVar != null) {
            wjb b = xjb.b();
            b.a = qf5.e;
            b.d = (char) 8403;
            rjdVar.e(1, b.a());
            rjdVar.h();
            y76 y76Var = aj3.T(rjdVar.g, rjdVar.l, "castDeviceControllerListenerKey").b;
            xve.i(y76Var, "Key must not be null");
            rjdVar.c(y76Var, 8415);
            md1Var.i = null;
        }
        md1Var.k = null;
        v99 v99Var2 = md1Var.j;
        if (v99Var2 != null) {
            v99Var2.v(null);
            md1Var.j = null;
        }
    }

    public static void h(md1 md1Var, String str, Task task) {
        he6 he6Var = m;
        ycd ycdVar = md1Var.e;
        if (ycdVar == null) {
            return;
        }
        byte b = 0;
        try {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (!(exception instanceof ao)) {
                    ncd ncdVar = (ncd) ycdVar;
                    Parcel R = ncdVar.R();
                    R.writeInt(2476);
                    ncdVar.V(R, 5);
                    return;
                }
                int statusCode = ((ao) exception).getStatusCode();
                ncd ncdVar2 = (ncd) ycdVar;
                Parcel R2 = ncdVar2.R();
                R2.writeInt(statusCode);
                ncdVar2.V(R2, 5);
                return;
            }
            zdf zdfVar = (zdf) task.getResult();
            Status status = zdfVar.a;
            if (!status.b()) {
                he6Var.b("%s() -> failure result", str);
                int i = status.a;
                ncd ncdVar3 = (ncd) ycdVar;
                Parcel R3 = ncdVar3.R();
                R3.writeInt(i);
                ncdVar3.V(R3, 5);
                return;
            }
            he6Var.b("%s() -> success result", str);
            v99 v99Var = new v99(new rdd());
            md1Var.j = v99Var;
            v99Var.v(md1Var.i);
            md1Var.j.p(new sff(md1Var, b));
            md1Var.j.u();
            alf alfVar = md1Var.h;
            v99 v99Var2 = md1Var.j;
            xve.e("Must be called from the main thread.");
            alfVar.a(v99Var2, md1Var.k);
            xr xrVar = zdfVar.b;
            xve.h(xrVar);
            String str2 = zdfVar.c;
            String str3 = zdfVar.d;
            xve.h(str3);
            boolean z = zdfVar.e;
            ncd ncdVar4 = (ncd) ycdVar;
            Parcel R4 = ncdVar4.R();
            ald.c(R4, xrVar);
            R4.writeString(str2);
            R4.writeString(str3);
            R4.writeInt(z ? 1 : 0);
            ncdVar4.V(R4, 4);
        } catch (RemoteException e) {
            he6Var.a(e, "Unable to call %s on %s.", "methods", ycd.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z;
        zed zedVar = this.a;
        he6 he6Var = v8a.b;
        CastDevice b = CastDevice.b(bundle);
        this.k = b;
        if (b != null) {
            rjd rjdVar = this.i;
            if (rjdVar != null) {
                wjb b2 = xjb.b();
                b2.a = qf5.e;
                b2.d = (char) 8403;
                rjdVar.e(1, b2.a());
                rjdVar.h();
                y76 y76Var = aj3.T(rjdVar.g, rjdVar.l, "castDeviceControllerListenerKey").b;
                xve.i(y76Var, "Key must not be null");
                rjdVar.c(y76Var, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            xve.h(castDevice);
            Bundle bundle2 = new Bundle();
            ld1 ld1Var = this.f;
            jd1 jd1Var = ld1Var == null ? null : ld1Var.f;
            po7 po7Var = jd1Var != null ? jd1Var.d : null;
            boolean z2 = jd1Var != null && jd1Var.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", po7Var != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z2);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.f);
            rx6 rx6Var = new rx6(castDevice, new kmf(this));
            rx6Var.d = bundle2;
            gd1 gd1Var = new gd1(rx6Var);
            Context context = this.c;
            int i = hd1.a;
            rjd rjdVar2 = new rjd(context, gd1Var);
            rjdVar2.F.add(new cad(this));
            this.i = rjdVar2;
            a86 T = aj3.T(rjdVar2.g, rjdVar2.l, "castDeviceControllerListenerKey");
            g99 g99Var = new g99();
            g99Var.e = true;
            ve9 ve9Var = new ve9((Object) rjdVar2, (byte) 25);
            z3f z3fVar = z3f.f;
            g99Var.c = T;
            g99Var.a = ve9Var;
            g99Var.b = z3fVar;
            g99Var.d = new a94[]{zid.a};
            g99Var.f = (short) 8428;
            rjdVar2.b(g99Var.a());
            return;
        }
        xve.e("Must be called from the main thread.");
        if (zedVar != null) {
            try {
                med medVar = (med) zedVar;
                Parcel T2 = medVar.T(medVar.R(), 9);
                int i2 = ald.a;
                z = T2.readInt() != 0;
                T2.recycle();
            } catch (RemoteException e) {
                he6Var.a(e, "Unable to call %s on %s.", "isResuming", zed.class.getSimpleName());
            }
            if (z) {
                if (zedVar != null) {
                    try {
                        med medVar2 = (med) zedVar;
                        Parcel R = medVar2.R();
                        R.writeInt(2151);
                        medVar2.V(R, 12);
                        return;
                    } catch (RemoteException e2) {
                        he6Var.a(e2, "Unable to call %s on %s.", "notifyFailedToStartSession", zed.class.getSimpleName());
                        return;
                    }
                }
                return;
            }
            if (zedVar != null) {
                try {
                    med medVar3 = (med) zedVar;
                    Parcel R2 = medVar3.R();
                    R2.writeInt(2153);
                    medVar3.V(R2, 15);
                    return;
                } catch (RemoteException e3) {
                    he6Var.a(e3, "Unable to call %s on %s.", "notifyFailedToResumeSession", zed.class.getSimpleName());
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
