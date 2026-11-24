// default package

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class oed {
    public static final kg7 a = new kg7((byte) 25);
    public static final f8e b = new f8e();
    public static final nf5 c = new nf5(25);

    public static final xr9 a(x23 x23Var) {
        x23Var.getClass();
        es9 es9Var = (es9) x23Var.b(a);
        if (es9Var == null) {
            u36.j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        ufc ufcVar = (ufc) x23Var.b(b);
        if (ufcVar == null) {
            u36.j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) x23Var.b(c);
        String str = (String) x23Var.b(k1f.e);
        if (str == null) {
            u36.j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        ds9 d = es9Var.g().d();
        zr9 zr9Var = d instanceof zr9 ? (zr9) d : null;
        if (zr9Var == null) {
            dq9.m("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = c(ufcVar).b;
        xr9 xr9Var = (xr9) linkedHashMap.get(str);
        if (xr9Var != null) {
            return xr9Var;
        }
        Class[] clsArr = xr9.f;
        zr9Var.a();
        Bundle bundle2 = zr9Var.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = zr9Var.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = zr9Var.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            zr9Var.c = null;
        }
        xr9 a2 = qve.a(bundle3, bundle);
        linkedHashMap.put(str, a2);
        return a2;
    }

    public static final void b(es9 es9Var) {
        v26 v26Var = es9Var.m().b;
        if (v26Var != v26.b && v26Var != v26.c) {
            u36.j("Failed requirement.");
        } else if (es9Var.g().d() == null) {
            zr9 zr9Var = new zr9(es9Var.g(), (ufc) es9Var);
            es9Var.g().f("androidx.lifecycle.internal.SavedStateHandlesProvider", zr9Var);
            es9Var.m().a(new n49(zr9Var, (byte) 2));
        }
    }

    public static final as9 c(ufc ufcVar) {
        k1f k1fVar = new k1f((byte) 25);
        tfc f = ufcVar.f();
        x23 d = ufcVar instanceof me5 ? ((me5) ufcVar).d() : v23.b;
        f.getClass();
        d.getClass();
        return (as9) new wm9(f, k1fVar, d).t(h79.a(as9.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
