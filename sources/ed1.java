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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ed1 extends d5a {
    public static final dc6 m = new dc6("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final f8d e;
    public final dd1 f;
    public final ocd g;
    public final kgf h;
    public afd i;
    public i69 j;
    public CastDevice k;
    public e6e l;

    public ed1(Context context, String str, String str2, dd1 dd1Var, ocd ocdVar, kgf kgfVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = dd1Var;
        this.g = ocdVar;
        this.h = kgfVar;
        yi5 f = f();
        r5d r5dVar = new r5d(this);
        dc6 dc6Var = t6d.a;
        f8d f8dVar = null;
        if (f != null) {
            try {
                f8dVar = t6d.b(context).Z(dd1Var, f, r5dVar);
            } catch (RemoteException | qe7 e) {
                t6d.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", o7d.class.getSimpleName());
            }
        }
        this.e = f8dVar;
    }

    public static void g(ed1 ed1Var, int i) {
        kgf kgfVar = ed1Var.h;
        if (kgfVar.q) {
            kgfVar.q = false;
            i69 i69Var = kgfVar.n;
            if (i69Var != null) {
                cbf cbfVar = kgfVar.m;
                fre.e("Must be called from the main thread.");
                if (cbfVar != null) {
                    i69Var.i.remove(cbfVar);
                }
            }
            kgfVar.c.T(null);
            gl2 gl2Var = kgfVar.h;
            if (gl2Var != null) {
                gl2Var.R();
                gl2Var.f = null;
            }
            gl2 gl2Var2 = kgfVar.i;
            if (gl2Var2 != null) {
                gl2Var2.R();
                gl2Var2.f = null;
            }
            mv6 mv6Var = kgfVar.p;
            if (mv6Var != null) {
                mv6Var.k0(null, null);
                kgfVar.p.m0(new MediaMetadataCompat(new Bundle()));
                kgfVar.j(0, null);
            }
            mv6 mv6Var2 = kgfVar.p;
            if (mv6Var2 != null) {
                mv6Var2.i0(false);
                zu6 zu6Var = (zu6) kgfVar.p.b;
                MediaSession mediaSession = zu6Var.a;
                zu6Var.e.kill();
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
                zu6Var.b.a.set(null);
                mediaSession.release();
                kgfVar.p = null;
            }
            kgfVar.n = null;
            kgfVar.o = null;
            kgfVar.h();
            if (i == 0) {
                kgfVar.i();
            }
        }
        afd afdVar = ed1Var.i;
        if (afdVar != null) {
            agb b = bgb.b();
            b.a = pd5.e;
            b.d = (char) 8403;
            afdVar.e(1, b.a());
            afdVar.h();
            u56 u56Var = s34.w(afdVar.g, afdVar.l, "castDeviceControllerListenerKey").b;
            fre.i(u56Var, "Key must not be null");
            afdVar.c(u56Var, 8415);
            ed1Var.i = null;
        }
        ed1Var.k = null;
        i69 i69Var2 = ed1Var.j;
        if (i69Var2 != null) {
            i69Var2.v(null);
            ed1Var.j = null;
        }
    }

    public static void h(ed1 ed1Var, String str, Task task) {
        dc6 dc6Var = m;
        f8d f8dVar = ed1Var.e;
        if (f8dVar == null) {
            return;
        }
        byte b = 0;
        try {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (!(exception instanceof zn)) {
                    u7d u7dVar = (u7d) f8dVar;
                    Parcel R = u7dVar.R();
                    R.writeInt(2476);
                    u7dVar.V(R, 5);
                    return;
                }
                int statusCode = ((zn) exception).getStatusCode();
                u7d u7dVar2 = (u7d) f8dVar;
                Parcel R2 = u7dVar2.R();
                R2.writeInt(statusCode);
                u7dVar2.V(R2, 5);
                return;
            }
            i9f i9fVar = (i9f) task.getResult();
            Status status = i9fVar.a;
            if (!status.b()) {
                dc6Var.b("%s() -> failure result", str);
                int i = status.a;
                u7d u7dVar3 = (u7d) f8dVar;
                Parcel R3 = u7dVar3.R();
                R3.writeInt(i);
                u7dVar3.V(R3, 5);
                return;
            }
            dc6Var.b("%s() -> success result", str);
            i69 i69Var = new i69(new y8d());
            ed1Var.j = i69Var;
            i69Var.v(ed1Var.i);
            ed1Var.j.p(new cbf(ed1Var, b));
            ed1Var.j.u();
            kgf kgfVar = ed1Var.h;
            i69 i69Var2 = ed1Var.j;
            fre.e("Must be called from the main thread.");
            kgfVar.a(i69Var2, ed1Var.k);
            wr wrVar = i9fVar.b;
            fre.h(wrVar);
            String str2 = i9fVar.c;
            String str3 = i9fVar.d;
            fre.h(str3);
            boolean z = i9fVar.e;
            u7d u7dVar4 = (u7d) f8dVar;
            Parcel R4 = u7dVar4.R();
            jgd.c(R4, wrVar);
            R4.writeString(str2);
            R4.writeString(str3);
            R4.writeInt(z ? 1 : 0);
            u7dVar4.V(R4, 4);
        } catch (RemoteException e) {
            dc6Var.a(e, "Unable to call %s on %s.", "methods", f8d.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z;
        gad gadVar = this.a;
        dc6 dc6Var = d5a.b;
        CastDevice b = CastDevice.b(bundle);
        this.k = b;
        if (b != null) {
            afd afdVar = this.i;
            if (afdVar != null) {
                agb b2 = bgb.b();
                b2.a = pd5.e;
                b2.d = (char) 8403;
                afdVar.e(1, b2.a());
                afdVar.h();
                u56 u56Var = s34.w(afdVar.g, afdVar.l, "castDeviceControllerListenerKey").b;
                fre.i(u56Var, "Key must not be null");
                afdVar.c(u56Var, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            fre.h(castDevice);
            Bundle bundle2 = new Bundle();
            dd1 dd1Var = this.f;
            bd1 bd1Var = dd1Var == null ? null : dd1Var.f;
            ql7 ql7Var = bd1Var != null ? bd1Var.d : null;
            boolean z2 = bd1Var != null && bd1Var.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", ql7Var != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z2);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.f);
            mv6 mv6Var = new mv6(castDevice, new uhf(this));
            mv6Var.d = bundle2;
            yc1 yc1Var = new yc1(mv6Var);
            Context context = this.c;
            int i = zc1.a;
            afd afdVar2 = new afd(context, yc1Var);
            afdVar2.F.add(new j5d(this));
            this.i = afdVar2;
            w56 w = s34.w(afdVar2.g, afdVar2.l, "castDeviceControllerListenerKey");
            t59 t59Var = new t59();
            t59Var.e = true;
            u39 u39Var = new u39(afdVar2, (byte) 28);
            ize izeVar = ize.f;
            t59Var.c = w;
            t59Var.a = u39Var;
            t59Var.b = izeVar;
            t59Var.d = new f84[]{ied.a};
            t59Var.f = (short) 8428;
            afdVar2.b(t59Var.a());
            return;
        }
        fre.e("Must be called from the main thread.");
        if (gadVar != null) {
            try {
                t9d t9dVar = (t9d) gadVar;
                Parcel T = t9dVar.T(t9dVar.R(), 9);
                int i2 = jgd.a;
                z = T.readInt() != 0;
                T.recycle();
            } catch (RemoteException e) {
                dc6Var.a(e, "Unable to call %s on %s.", "isResuming", gad.class.getSimpleName());
            }
            if (z) {
                if (gadVar != null) {
                    try {
                        t9d t9dVar2 = (t9d) gadVar;
                        Parcel R = t9dVar2.R();
                        R.writeInt(2151);
                        t9dVar2.V(R, 12);
                        return;
                    } catch (RemoteException e2) {
                        dc6Var.a(e2, "Unable to call %s on %s.", "notifyFailedToStartSession", gad.class.getSimpleName());
                        return;
                    }
                }
                return;
            }
            if (gadVar != null) {
                try {
                    t9d t9dVar3 = (t9d) gadVar;
                    Parcel R2 = t9dVar3.R();
                    R2.writeInt(2153);
                    t9dVar3.V(R2, 15);
                    return;
                } catch (RemoteException e3) {
                    dc6Var.a(e3, "Unable to call %s on %s.", "notifyFailedToResumeSession", gad.class.getSimpleName());
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
