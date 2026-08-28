package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n0 implements s0 {
    public final Application a;
    public final r0 b;
    public final Bundle c;
    public final o d;
    public final g2.e e;

    public n0(Application application, g2.f fVar, Bundle bundle) {
        r0 r0Var;
        this.e = fVar.g();
        this.d = fVar.m();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (r0.e == null) {
                r0.e = new r0(application);
            }
            r0Var = r0.e;
            kotlin.jvm.internal.i.b(r0Var);
        } else {
            r0Var = new r0(null);
        }
        this.b = r0Var;
    }

    @Override // androidx.lifecycle.s0
    public final p0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p0 b(Class cls, String str) {
        Object obj;
        Application application;
        o oVar = this.d;
        if (oVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom || this.a == null) ? o0.a(o0.b, cls) : o0.a(o0.a, cls);
        if (a2 == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (q0.c == null) {
                q0.c = new q0();
            }
            q0 q0Var = q0.c;
            kotlin.jvm.internal.i.b(q0Var);
            return q0Var.a(cls);
        }
        g2.e eVar = this.e;
        kotlin.jvm.internal.i.b(eVar);
        Bundle bundle = this.c;
        Bundle c10 = eVar.c(str);
        Class[] clsArr = i0.f;
        i0 b10 = j0.b(c10, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, b10);
        savedStateHandleController.c(oVar, eVar);
        n nVar = ((v) oVar).c;
        if (nVar == n.b || nVar.compareTo(n.d) >= 0) {
            eVar.g();
        } else {
            oVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(oVar, eVar));
        }
        p0 b11 = (!isAssignableFrom || (application = this.a) == null) ? o0.b(cls, a2, b10) : o0.b(cls, a2, application, b10);
        synchronized (b11.a) {
            try {
                obj = b11.a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == 0) {
                    b11.a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            savedStateHandleController = obj;
        }
        if (b11.c) {
            p0.a(savedStateHandleController);
        }
        return b11;
    }

    @Override // androidx.lifecycle.s0
    public final p0 o(Class cls, v1.b bVar) {
        q0 q0Var = q0.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.a;
        String str = (String) linkedHashMap.get(q0Var);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(j0.a) == null || linkedHashMap.get(j0.b) == null) {
            if (this.d != null) {
                return b(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(q0.a);
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom || application == null) ? o0.a(o0.b, cls) : o0.a(o0.a, cls);
        return a2 == null ? this.b.o(cls, bVar) : (!isAssignableFrom || application == null) ? o0.b(cls, a2, j0.c(bVar)) : o0.b(cls, a2, application, j0.c(bVar));
    }
}
