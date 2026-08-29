package androidx.savedstate;

import a4.w;
import android.os.Bundle;
import androidx.lifecycle.j0;
import androidx.lifecycle.m;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import g2.c;
import g2.e;
import g2.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class Recreator implements r {
    public final f a;

    public Recreator(f fVar) {
        this.a = fVar;
    }

    @Override // androidx.lifecycle.r
    public final void d(t tVar, m mVar) {
        if (mVar != m.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        tVar.m().b(this);
        f fVar = this.a;
        Bundle c3 = fVar.g().c("androidx.savedstate.Restarter");
        if (c3 == null) {
            return;
        }
        ArrayList<String> stringArrayList = c3.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = stringArrayList.get(i10);
            i10++;
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
                        if (!(fVar instanceof u0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        t0 f9 = ((u0) fVar).f();
                        e g10 = fVar.g();
                        f9.getClass();
                        LinkedHashMap linkedHashMap = f9.a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String key = (String) it.next();
                            j.e(key, "key");
                            p0 p0Var = (p0) linkedHashMap.get(key);
                            j.b(p0Var);
                            j0.a(p0Var, g10, fVar.m());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            g10.g();
                        }
                    } catch (Exception e10) {
                        throw new RuntimeException(u3.c.e("Failed to instantiate ", str2), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(w.n("Class ", str2, " wasn't found"), e12);
            }
        }
    }
}
