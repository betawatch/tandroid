package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.j0;
import androidx.lifecycle.m;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
import m.q;
import rf.b;
import w4.c;
import w4.e;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class Recreator implements r {
    public final e a;

    public Recreator(e eVar) {
        this.a = eVar;
    }

    @Override // androidx.lifecycle.r
    public final void d(t tVar, m mVar) {
        if (mVar != m.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        tVar.m().b(this);
        e eVar = this.a;
        Bundle c10 = eVar.g().c("androidx.savedstate.Restarter");
        if (c10 == null) {
            return;
        }
        ArrayList<String> stringArrayList = c10.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = stringArrayList.get(i7);
            i7++;
            String str2 = str;
            try {
                Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(c.class);
                j.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        j.d(newInstance, "{\n                constr…wInstance()\n            }");
                        if (!(eVar instanceof u0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        t0 f10 = ((u0) eVar).f();
                        q g10 = eVar.g();
                        f10.getClass();
                        LinkedHashMap linkedHashMap = f10.a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String key = (String) it.next();
                            j.e(key, "key");
                            p0 p0Var = (p0) linkedHashMap.get(key);
                            j.b(p0Var);
                            j0.a(p0Var, g10, eVar.m());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            g10.g();
                        }
                    } catch (Exception e10) {
                        throw new RuntimeException(b.i("Failed to instantiate ", str2), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(a8.p0.p("Class ", str2, " wasn't found"), e12);
            }
        }
    }
}
