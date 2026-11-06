package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class l0 extends androidx.lifecycle.p0 {
    public static final w7.s j = new w7.s(3, false);
    public final boolean g;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public boolean h = false;
    public boolean i = false;

    public l0(boolean z9) {
        this.g = z9;
    }

    @Override // androidx.lifecycle.p0
    public final void b() {
        if (i0.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void c(r rVar, boolean z9) {
        if (i0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + rVar);
        }
        e(rVar.e, z9);
    }

    public final void d(String str, boolean z9) {
        if (i0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z9);
    }

    public final void e(String str, boolean z9) {
        HashMap hashMap = this.e;
        l0 l0Var = (l0) hashMap.get(str);
        if (l0Var != null) {
            if (z9) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l0Var.e.keySet());
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    l0Var.d((String) obj, true);
                }
            }
            l0Var.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) hashMap2.get(str);
        if (t0Var != null) {
            t0Var.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.d.equals(l0Var.d) && this.e.equals(l0Var.e) && this.f.equals(l0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(r rVar) {
        if (this.i) {
            if (i0.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.remove(rVar.e) == null || !i0.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + rVar);
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
