// default package

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class eq9 implements rdc {
    public final Application a;
    public final qdc b;
    public final Bundle c;
    public final w06 d;
    public final oo e;

    public eq9(Application application, dq9 dq9Var, Bundle bundle) {
        qdc qdcVar;
        this.e = dq9Var.g();
        this.d = dq9Var.m();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            qdcVar = qdc.H;
            if (qdcVar == null) {
                qdcVar = new qdc(application);
                qdc.H = qdcVar;
            }
        } else {
            qdcVar = new qdc(null);
        }
        this.b = qdcVar;
    }

    @Override // rdc
    public final odc e(Class cls, l13 l13Var) {
        AutoCloseable autoCloseable;
        Application application;
        l13Var.getClass();
        String str = (String) l13Var.b(ize.e);
        if (str == null) {
            sc8.j("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        byte b = 1;
        if (l13Var.b(mcd.a) != null && l13Var.b(mcd.b) != null) {
            Application application2 = (Application) l13Var.b(qdc.I);
            boolean isAssignableFrom = hl.class.isAssignableFrom(cls);
            Constructor a = (!isAssignableFrom || application2 == null) ? fq9.a(cls, fq9.b) : fq9.a(cls, fq9.a);
            return a == null ? this.b.e(cls, l13Var) : (!isAssignableFrom || application2 == null) ? fq9.b(cls, a, mcd.a(l13Var)) : fq9.b(cls, a, application2, mcd.a(l13Var));
        }
        if (this.d == null) {
            sc8.j("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        w06 w06Var = this.d;
        if (w06Var == null) {
            fyb.i("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom2 = hl.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom2 || this.a == null) ? fq9.a(cls, fq9.b) : fq9.a(cls, fq9.a);
        if (a2 == null) {
            if (this.a != null) {
                return this.b.h(cls);
            }
            pd5 pd5Var = pd5.F;
            if (pd5Var == null) {
                pd5Var = new pd5((byte) 29);
                pd5.F = pd5Var;
            }
            return pd5Var.h(cls);
        }
        oo ooVar = this.e;
        ooVar.getClass();
        Bundle bundle = this.c;
        Bundle c = ooVar.c(str);
        Class[] clsArr = wp9.f;
        wp9 a3 = nte.a(c, bundle);
        xp9 xp9Var = new xp9(str, a3);
        xp9Var.a(ooVar, w06Var);
        v06 v06Var = ((g16) w06Var).b;
        if (v06Var == v06.b || v06Var.compareTo(v06.d) >= 0) {
            ooVar.g();
        } else {
            w06Var.a(new ib3(w06Var, ooVar, b));
        }
        odc b2 = (!isAssignableFrom2 || (application = this.a) == null) ? fq9.b(cls, a2, a3) : fq9.b(cls, a2, application, a3);
        b2.getClass();
        pdc pdcVar = b2.a;
        if (pdcVar.d) {
            pdc.a(xp9Var);
            return b2;
        }
        synchronized (pdcVar.a) {
            autoCloseable = (AutoCloseable) pdcVar.b.put("androidx.lifecycle.savedstate.vm.tag", xp9Var);
        }
        pdc.a(autoCloseable);
        return b2;
    }

    @Override // rdc
    public final /* synthetic */ odc f(oh2 oh2Var, l13 l13Var) {
        return yjb.a(this, oh2Var, l13Var);
    }
}
