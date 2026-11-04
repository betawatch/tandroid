package androidx.savedstate;

import a1.g;
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
import m.p;
import v4.c;
import v4.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        Bundle c2 = eVar.g().c("androidx.savedstate.Restarter");
        if (c2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = c2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = stringArrayList.get(i3);
            i3++;
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
                        p g7 = eVar.g();
                        f10.getClass();
                        LinkedHashMap linkedHashMap = f10.a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String key = (String) it.next();
                            j.e(key, "key");
                            p0 p0Var = (p0) linkedHashMap.get(key);
                            j.b(p0Var);
                            j0.a(p0Var, g7, eVar.m());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            g7.g();
                        }
                    } catch (Exception e10) {
                        throw new RuntimeException(t4.c.f("Failed to instantiate ", str2), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(g.q("Class ", str2, " wasn't found"), e12);
            }
        }
    }
}
