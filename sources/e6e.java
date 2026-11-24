// default package

import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e6e implements f69, k6a, OnCompleteListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e6e(u84 u84Var, String[] strArr) {
        this.a = (byte) 0;
        this.b = strArr;
    }

    @Override // k6a
    public final void E(d5a d5aVar, boolean z) {
        ese.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        eseVar.c();
        fre.h(eseVar.g);
        w3f b = eseVar.c.b(eseVar.g);
        k3f m = l3f.m(b.d());
        m.c();
        l3f.p((l3f) m.b, z);
        b.c();
        y3f.p((y3f) b.b, (l3f) m.a());
        eseVar.a.a((y3f) b.a(), kk7.D3);
        ese.b(eseVar);
        eseVar.e();
    }

    @Override // k6a
    public final /* bridge */ /* synthetic */ void F(d5a d5aVar, int i) {
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        ese.a(eseVar, i);
    }

    @Override // k6a
    public final /* bridge */ /* synthetic */ void L(d5a d5aVar, int i) {
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        ese.a(eseVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    @Override // k6a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(d5a d5aVar, String str) {
        nwe nweVar;
        dc6 dc6Var = ese.j;
        boolean z = false;
        dc6Var.b("onSessionResuming with sessionId = %s", str);
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        SharedPreferences sharedPreferences = eseVar.f;
        boolean g = eseVar.g(str);
        p6d p6dVar = eseVar.b;
        if (g) {
            dc6Var.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            fre.h(eseVar.g);
        } else {
            if (sharedPreferences == null) {
                dc6 dc6Var2 = nwe.k;
            } else {
                nweVar = new nwe(p6dVar);
                nweVar.i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    nweVar.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        nweVar.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            nweVar.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                nweVar.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    nweVar.f = sharedPreferences.getString("receiver_session_id", "");
                                    nweVar.g = sharedPreferences.getInt("device_capabilities", 0);
                                    nweVar.h = sharedPreferences.getString("device_model_name", "");
                                    nweVar.j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    eseVar.g = nweVar;
                                    if (eseVar.g(str)) {
                                        dc6Var.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        nwe nweVar2 = new nwe(p6dVar);
                                        nwe.l++;
                                        eseVar.g = nweVar2;
                                        ed1 ed1Var = eseVar.h;
                                        if (ed1Var != null && ed1Var.g.f) {
                                            z = true;
                                        }
                                        nweVar2.i = z;
                                        dc6 dc6Var3 = ad1.l;
                                        fre.e("Must be called from the main thread.");
                                        ad1 ad1Var = ad1.n;
                                        fre.h(ad1Var);
                                        fre.e("Must be called from the main thread.");
                                        nweVar2.b = ad1Var.e.a;
                                        nwe nweVar3 = eseVar.g;
                                        fre.h(nweVar3);
                                        nweVar3.f = str;
                                    } else {
                                        dc6Var.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        fre.h(eseVar.g);
                                        nwe.l = eseVar.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            nweVar = null;
            eseVar.g = nweVar;
            if (eseVar.g(str)) {
            }
        }
        fre.h(eseVar.g);
        w3f b = eseVar.c.b(eseVar.g);
        k3f m = l3f.m(b.d());
        m.c();
        l3f.r((l3f) m.b, 10);
        b.e((l3f) m.a());
        k3f m2 = l3f.m(b.d());
        m2.c();
        l3f.p((l3f) m2.b, true);
        b.c();
        y3f.p((y3f) b.b, (l3f) m2.a());
        eseVar.a.a((y3f) b.a(), kk7.C3);
    }

    @Override // k6a
    public final void T(d5a d5aVar, String str) {
        ese.j.b("onSessionStarted with sessionId = %s", str);
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        eseVar.c();
        nwe nweVar = eseVar.g;
        nweVar.f = str;
        eseVar.a.a((y3f) eseVar.c.b(nweVar).a(), kk7.y3);
        ese.b(eseVar);
        eseVar.e();
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                cse cseVar = new cse((TaskCompletionSource) obj2, (byte) 0);
                n7d n7dVar = (n7d) ((e5f) obj).k();
                Parcel R = n7dVar.R();
                jgd.d(R, cseVar);
                R.writeStringArray((String[]) obj3);
                n7dVar.W(R, 5);
                break;
            case 1:
                sme smeVar = new sme((TaskCompletionSource) obj2, b2);
                pyd pydVar = (pyd) ((zze) obj).k();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i = ygd.a;
                obtain.writeStrongBinder(smeVar);
                obtain.writeInt(1);
                ((mn5) obj3).writeToParcel(obtain, 0);
                pydVar.a(obtain, 1);
                break;
            default:
                pp5 pp5Var = new pp5((TaskCompletionSource) obj2, (byte) 1);
                kh5 kh5Var = (kh5) ((zj5) obj).k();
                ho hoVar = new ho(new jp2(-1, -1, 0, true), false);
                hoVar.c = false;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i2 = qgd.a;
                obtain2.writeStrongBinder(pp5Var);
                qgd.b(obtain2, (GetCredentialRequest) obj3);
                qgd.b(obtain2, hoVar);
                ((ih5) kh5Var).a(obtain2, 1);
                break;
        }
    }

    @Override // k6a
    public final /* bridge */ /* synthetic */ void n(d5a d5aVar, int i) {
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        ese.a(eseVar, i);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        ed1.h((ed1) ((r5d) this.b).c, "joinApplication", task);
    }

    @Override // k6a
    public final void p(d5a d5aVar) {
        dc6 dc6Var = ese.j;
        dc6Var.b("onSessionStarting", new Object[0]);
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        if (eseVar.g != null) {
            Log.w(dc6Var.a, dc6Var.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        eseVar.d();
        e0f e0fVar = eseVar.c;
        nwe nweVar = eseVar.g;
        w3f b = e0fVar.b(nweVar);
        if (nweVar.j == 1) {
            k3f m = l3f.m(b.d());
            m.c();
            l3f.r((l3f) m.b, 17);
            b.e((l3f) m.a());
        }
        eseVar.a.a((y3f) b.a(), kk7.x3);
    }

    @Override // k6a
    public final void q(d5a d5aVar, int i) {
        ese.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i));
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        eseVar.c();
        fre.h(eseVar.g);
        eseVar.a.a(eseVar.c.a(eseVar.g, i), kk7.B3);
        ese.b(eseVar);
        eseVar.e.removeCallbacks(eseVar.d);
    }

    @Override // k6a
    public final /* synthetic */ void y(d5a d5aVar) {
        ((ese) this.b).h = (ed1) d5aVar;
    }

    public /* synthetic */ e6e(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
