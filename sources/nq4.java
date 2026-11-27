// default package

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class nq4 extends nhc {
    public static final sae h = new sae();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public nq4(boolean z) {
        this.e = z;
    }

    @Override // nhc
    public final void b() {
        if (kq4.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void c(gp4 gp4Var, boolean z) {
        if (kq4.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + gp4Var);
        }
        e(gp4Var.e, z);
    }

    public final void d(String str, boolean z) {
        if (kq4.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z);
    }

    public final void e(String str, boolean z) {
        HashMap hashMap = this.c;
        nq4 nq4Var = (nq4) hashMap.get(str);
        if (nq4Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(nq4Var.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    nq4Var.d((String) obj, true);
                }
            }
            nq4Var.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        rhc rhcVar = (rhc) hashMap2.get(str);
        if (rhcVar != null) {
            rhcVar.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nq4.class != obj.getClass()) {
            return false;
        }
        nq4 nq4Var = (nq4) obj;
        return this.b.equals(nq4Var.b) && this.c.equals(nq4Var.c) && this.d.equals(nq4Var.d);
    }

    public final void f(gp4 gp4Var) {
        if (this.g) {
            if (kq4.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(gp4Var.e) == null || !kq4.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + gp4Var);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
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
