// default package

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fs9 implements sfc {
    public final Application a;
    public final rfc b;
    public final Bundle c;
    public final w26 d;
    public final op e;

    public fs9(Application application, es9 es9Var, Bundle bundle) {
        rfc rfcVar;
        this.e = es9Var.g();
        this.d = es9Var.m();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            rfcVar = rfc.H;
            if (rfcVar == null) {
                rfcVar = new rfc(application);
                rfc.H = rfcVar;
            }
        } else {
            rfcVar = new rfc(null);
        }
        this.b = rfcVar;
    }

    @Override // sfc
    public final pfc d(Class cls, x23 x23Var) {
        AutoCloseable autoCloseable;
        Application application;
        x23Var.getClass();
        String str = (String) x23Var.b(k1f.e);
        if (str == null) {
            dq9.m("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        byte b = 1;
        if (x23Var.b(oed.a) != null && x23Var.b(oed.b) != null) {
            Application application2 = (Application) x23Var.b(rfc.I);
            boolean isAssignableFrom = hm.class.isAssignableFrom(cls);
            Constructor a = (!isAssignableFrom || application2 == null) ? gs9.a(cls, gs9.b) : gs9.a(cls, gs9.a);
            return a == null ? this.b.d(cls, x23Var) : (!isAssignableFrom || application2 == null) ? gs9.b(cls, a, oed.a(x23Var)) : gs9.b(cls, a, application2, oed.a(x23Var));
        }
        if (this.d == null) {
            dq9.m("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        w26 w26Var = this.d;
        if (w26Var == null) {
            rjb.j("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom2 = hm.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom2 || this.a == null) ? gs9.a(cls, gs9.b) : gs9.a(cls, gs9.a);
        if (a2 == null) {
            if (this.a != null) {
                return this.b.j(cls);
            }
            nf5 nf5Var = nf5.F;
            if (nf5Var == null) {
                nf5Var = new nf5((byte) 29);
                nf5.F = nf5Var;
            }
            return nf5Var.j(cls);
        }
        op opVar = this.e;
        opVar.getClass();
        Bundle bundle = this.c;
        Bundle c = opVar.c(str);
        Class[] clsArr = xr9.f;
        xr9 a3 = qve.a(c, bundle);
        yr9 yr9Var = new yr9(str, a3);
        yr9Var.a(opVar, w26Var);
        v26 v26Var = ((g36) w26Var).b;
        if (v26Var == v26.b || v26Var.compareTo(v26.d) >= 0) {
            opVar.g();
        } else {
            w26Var.a(new uc3(w26Var, opVar, b));
        }
        pfc b2 = (!isAssignableFrom2 || (application = this.a) == null) ? gs9.b(cls, a2, a3) : gs9.b(cls, a2, application, a3);
        b2.getClass();
        qfc qfcVar = b2.a;
        if (qfcVar.d) {
            qfc.a(yr9Var);
            return b2;
        }
        synchronized (qfcVar.a) {
            autoCloseable = (AutoCloseable) qfcVar.b.put("androidx.lifecycle.savedstate.vm.tag", yr9Var);
        }
        qfc.a(autoCloseable);
        return b2;
    }

    @Override // sfc
    public final /* synthetic */ pfc g(cj2 cj2Var, x23 x23Var) {
        return mlb.a(this, cj2Var, x23Var);
    }
}
