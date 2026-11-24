// default package

import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class fkd implements h89, v76, OnCompleteListener, m8a {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fkd(ua4 ua4Var, String[] strArr) {
        this.a = (byte) 3;
        this.b = strArr;
    }

    @Override // m8a
    public final void B(f7a f7aVar, boolean z) {
        hue.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hueVar.c();
        ite.h(hueVar.g);
        y5f b = hueVar.c.b(hueVar.g);
        m5f m = n5f.m(b.d());
        m.c();
        n5f.p((n5f) m.b, z);
        b.c();
        a6f.p((a6f) b.b, (n5f) m.a());
        hueVar.a.a((a6f) b.a(), nm7.D3);
        hue.b(hueVar);
        hueVar.e();
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void C(f7a f7aVar, int i) {
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hue.a(hueVar, i);
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void L(f7a f7aVar, int i) {
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hue.a(hueVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    @Override // m8a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(f7a f7aVar, String str) {
        pye pyeVar;
        ce6 ce6Var = hue.j;
        boolean z = false;
        ce6Var.b("onSessionResuming with sessionId = %s", str);
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        SharedPreferences sharedPreferences = hueVar.f;
        boolean g = hueVar.g(str);
        r8d r8dVar = hueVar.b;
        if (g) {
            ce6Var.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            ite.h(hueVar.g);
        } else {
            if (sharedPreferences == null) {
                ce6 ce6Var2 = pye.k;
            } else {
                pyeVar = new pye(r8dVar);
                pyeVar.i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    pyeVar.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        pyeVar.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            pyeVar.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                pyeVar.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    pyeVar.f = sharedPreferences.getString("receiver_session_id", "");
                                    pyeVar.g = sharedPreferences.getInt("device_capabilities", 0);
                                    pyeVar.h = sharedPreferences.getString("device_model_name", "");
                                    pyeVar.j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    hueVar.g = pyeVar;
                                    if (hueVar.g(str)) {
                                        ce6Var.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        pye pyeVar2 = new pye(r8dVar);
                                        pye.l++;
                                        hueVar.g = pyeVar2;
                                        me1 me1Var = hueVar.h;
                                        if (me1Var != null && me1Var.g.f) {
                                            z = true;
                                        }
                                        pyeVar2.i = z;
                                        ce6 ce6Var3 = ie1.l;
                                        ite.e("Must be called from the main thread.");
                                        ie1 ie1Var = ie1.n;
                                        ite.h(ie1Var);
                                        ite.e("Must be called from the main thread.");
                                        pyeVar2.b = ie1Var.e.a;
                                        pye pyeVar3 = hueVar.g;
                                        ite.h(pyeVar3);
                                        pyeVar3.f = str;
                                    } else {
                                        ce6Var.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        ite.h(hueVar.g);
                                        pye.l = hueVar.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            pyeVar = null;
            hueVar.g = pyeVar;
            if (hueVar.g(str)) {
            }
        }
        ite.h(hueVar.g);
        y5f b = hueVar.c.b(hueVar.g);
        m5f m = n5f.m(b.d());
        m.c();
        n5f.r((n5f) m.b, 10);
        b.e((n5f) m.a());
        m5f m2 = n5f.m(b.d());
        m2.c();
        n5f.p((n5f) m2.b, true);
        b.c();
        a6f.p((a6f) b.b, (n5f) m2.a());
        hueVar.a.a((a6f) b.a(), nm7.C3);
    }

    @Override // m8a
    public final void R(f7a f7aVar, String str) {
        hue.j.b("onSessionStarted with sessionId = %s", str);
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hueVar.c();
        pye pyeVar = hueVar.g;
        pyeVar.f = str;
        hueVar.a.a((a6f) hueVar.c.b(pyeVar).a(), nm7.y3);
        hue.b(hueVar);
        hueVar.e();
    }

    @Override // h89
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                b5f b5fVar = (b5f) ((tpd) obj).k();
                jmd jmdVar = new jmd((TaskCompletionSource) obj2, (byte) 1);
                Parcel R = b5fVar.R();
                int i = sid.a;
                R.writeInt(1);
                ((id6) obj3).writeToParcel(R, 0);
                sid.c(R, jmdVar);
                R.writeString(null);
                b5fVar.V(R, 63);
                break;
            case 1:
            case 2:
            default:
                pr5 pr5Var = new pr5((TaskCompletionSource) obj2, (byte) 1);
                jj5 jj5Var = (jj5) ((zl5) obj).k();
                hp hpVar = new hp(new uq2(-1, -1, 0, true), false);
                hpVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i2 = rid.a;
                obtain.writeStrongBinder(pr5Var);
                rid.b(obtain, (GetCredentialRequest) obj3);
                rid.b(obtain, hpVar);
                ((hj5) jj5Var).a(obtain, 1);
                break;
            case 3:
                fue fueVar = new fue((TaskCompletionSource) obj2, (byte) 0);
                p9d p9dVar = (p9d) ((g7f) obj).k();
                Parcel R2 = p9dVar.R();
                kid.d(R2, fueVar);
                R2.writeStringArray((String[]) obj3);
                p9dVar.W(R2, 5);
                break;
            case 4:
                voe voeVar = new voe((TaskCompletionSource) obj2, b2);
                s0e s0eVar = (s0e) ((b2f) obj).k();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i3 = zid.a;
                obtain2.writeStrongBinder(voeVar);
                obtain2.writeInt(1);
                ((mp5) obj3).writeToParcel(obtain2, 0);
                s0eVar.a(obtain2, 1);
                break;
        }
    }

    @Override // v76
    public final void c(Object obj) {
        u76 u76Var;
        ry ryVar = ((god) this.b).b;
        synchronized (ryVar) {
            ryVar.b = false;
            u76Var = ((w76) ryVar.c).b;
        }
        if (u76Var != null) {
            ((ua4) ryVar.d).c(u76Var, 2441);
        }
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void l(f7a f7aVar, int i) {
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hue.a(hueVar, i);
    }

    @Override // m8a
    public final void o(f7a f7aVar) {
        ce6 ce6Var = hue.j;
        ce6Var.b("onSessionStarting", new Object[0]);
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        if (hueVar.g != null) {
            Log.w(ce6Var.a, ce6Var.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        hueVar.d();
        g2f g2fVar = hueVar.c;
        pye pyeVar = hueVar.g;
        y5f b = g2fVar.b(pyeVar);
        if (pyeVar.j == 1) {
            m5f m = n5f.m(b.d());
            m.c();
            n5f.r((n5f) m.b, 17);
            b.e((n5f) m.a());
        }
        hueVar.a.a((a6f) b.a(), nm7.x3);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ((CountDownLatch) obj).countDown();
                break;
            default:
                me1.h((me1) ((t7d) obj).c, "joinApplication", task);
                break;
        }
    }

    @Override // m8a
    public final void q(f7a f7aVar, int i) {
        hue.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i));
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hueVar.c();
        ite.h(hueVar.g);
        hueVar.a.a(hueVar.c.a(hueVar.g, i), nm7.B3);
        hue.b(hueVar);
        hueVar.e.removeCallbacks(hueVar.d);
    }

    @Override // m8a
    public final /* synthetic */ void z(f7a f7aVar) {
        ((hue) this.b).h = (me1) f7aVar;
    }

    public /* synthetic */ fkd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
