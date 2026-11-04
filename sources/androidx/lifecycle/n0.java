package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n0 implements s0 {
    public final Application a;
    public final r0 b;
    public final Bundle c;
    public final o d;
    public final m.p e;

    public n0(Application application, v4.e eVar, Bundle bundle) {
        r0 r0Var;
        this.e = eVar.g();
        this.d = eVar.m();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (r0.e == null) {
                r0.e = new r0(application);
            }
            r0Var = r0.e;
            kotlin.jvm.internal.j.b(r0Var);
        } else {
            r0Var = new r0(null);
        }
        this.b = r0Var;
    }

    @Override // androidx.lifecycle.s0
    public final p0 G(Class cls, x1.b bVar) {
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
        Constructor a10 = (!isAssignableFrom || application == null) ? o0.a(cls, o0.b) : o0.a(cls, o0.a);
        return a10 == null ? this.b.G(cls, bVar) : (!isAssignableFrom || application == null) ? o0.b(cls, a10, j0.c(bVar)) : o0.b(cls, a10, application, j0.c(bVar));
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
        Constructor a10 = (!isAssignableFrom || this.a == null) ? o0.a(cls, o0.b) : o0.a(cls, o0.a);
        if (a10 == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (q0.c == null) {
                q0.c = new q0();
            }
            q0 q0Var = q0.c;
            kotlin.jvm.internal.j.b(q0Var);
            return q0Var.a(cls);
        }
        m.p pVar = this.e;
        kotlin.jvm.internal.j.b(pVar);
        Bundle bundle = this.c;
        Bundle c2 = pVar.c(str);
        Class[] clsArr = i0.f;
        i0 b10 = j0.b(c2, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, b10);
        savedStateHandleController.c(oVar, pVar);
        n nVar = ((v) oVar).c;
        if (nVar == n.b || nVar.compareTo(n.d) >= 0) {
            pVar.g();
        } else {
            oVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(oVar, pVar));
        }
        p0 b11 = (!isAssignableFrom || (application = this.a) == null) ? o0.b(cls, a10, b10) : o0.b(cls, a10, application, b10);
        synchronized (b11.a) {
            try {
                obj = b11.a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == 0) {
                    b11.a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th2) {
                throw th2;
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
}
