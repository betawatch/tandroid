package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m0 extends androidx.lifecycle.p0 {
    public static final z9.d j = new z9.d(2);
    public final boolean g;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public boolean h = false;
    public boolean i = false;

    public m0(boolean z4) {
        this.g = z4;
    }

    @Override // androidx.lifecycle.p0
    public final void b() {
        if (j0.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void c(s sVar, boolean z4) {
        if (j0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + sVar);
        }
        e(sVar.e, z4);
    }

    public final void d(String str, boolean z4) {
        if (j0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z4);
    }

    public final void e(String str, boolean z4) {
        HashMap hashMap = this.e;
        m0 m0Var = (m0) hashMap.get(str);
        if (m0Var != null) {
            if (z4) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m0Var.e.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    m0Var.d((String) obj, true);
                }
            }
            m0Var.b();
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
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.d.equals(m0Var.d) && this.e.equals(m0Var.e) && this.f.equals(m0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(s sVar) {
        if (this.i) {
            if (j0.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.remove(sVar.e) == null || !j0.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + sVar);
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
