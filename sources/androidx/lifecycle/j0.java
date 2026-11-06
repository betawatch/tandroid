package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class j0 {
    public static final q0 a = new q0();
    public static final q0 b = new q0();
    public static final q0 c = new q0();

    public static final void a(p0 p0Var, m.q registry, o lifecycle) {
        Object obj;
        kotlin.jvm.internal.j.e(registry, "registry");
        kotlin.jvm.internal.j.e(lifecycle, "lifecycle");
        HashMap hashMap = p0Var.a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = p0Var.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.c) {
            return;
        }
        savedStateHandleController.c(lifecycle, registry);
        n nVar = ((v) lifecycle).c;
        if (nVar == n.b || nVar.compareTo(n.d) >= 0) {
            registry.g();
        } else {
            lifecycle.a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, registry));
        }
    }

    public static i0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new i0();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.j.d(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new i0(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = parcelableArrayList.get(i7);
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
        }
        return new i0(linkedHashMap);
    }

    public static final i0 c(y1.b bVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.a;
        w4.e eVar = (w4.e) linkedHashMap.get(a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        u0 u0Var = (u0) linkedHashMap.get(b);
        if (u0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(q0.b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        w4.d d = eVar.g().d();
        l0 l0Var = d instanceof l0 ? (l0) d : null;
        if (l0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = e(u0Var).d;
        i0 i0Var = (i0) linkedHashMap2.get(str);
        if (i0Var != null) {
            return i0Var;
        }
        Class[] clsArr = i0.f;
        l0Var.a();
        Bundle bundle2 = l0Var.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = l0Var.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = l0Var.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            l0Var.c = null;
        }
        i0 b10 = b(bundle3, bundle);
        linkedHashMap2.put(str, b10);
        return b10;
    }

    public static final void d(w4.e eVar) {
        n nVar = ((v) eVar.m()).c;
        if (nVar != n.b && nVar != n.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.g().d() == null) {
            l0 l0Var = new l0(eVar.g(), (u0) eVar);
            eVar.g().f("androidx.lifecycle.internal.SavedStateHandlesProvider", l0Var);
            eVar.m().a(new SavedStateHandleAttacher(l0Var));
        }
    }

    public static final m0 e(u0 u0Var) {
        ArrayList arrayList = new ArrayList();
        Class a10 = kotlin.jvm.internal.s.a(m0.class).a();
        kotlin.jvm.internal.j.c(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new y1.c(a10));
        y1.c[] cVarArr = (y1.c[]) arrayList.toArray(new y1.c[0]);
        return (m0) new android.support.v4.media.session.a0(u0Var.f(), new qt((y1.c[]) Arrays.copyOf(cVarArr, cVarArr.length)), u0Var instanceof i ? ((i) u0Var).d() : y1.a.b).j(m0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
