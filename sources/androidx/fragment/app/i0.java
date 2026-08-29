package androidx.fragment.app;

import android.util.Log;
import j7.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i0 implements g0 {
    public final /* synthetic */ j0 a;

    public i0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean U;
        j0 j0Var = this.a;
        ArrayList arrayList3 = j0Var.n;
        if (j0.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + j0Var.a);
        }
        int i10 = 0;
        if (j0Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            U = false;
        } else {
            a aVar = (a) l1.i(1, j0Var.d);
            j0Var.h = aVar;
            ArrayList arrayList4 = aVar.a;
            int size = arrayList4.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList4.get(i11);
                i11++;
                s sVar = ((q0) obj).b;
                if (sVar != null) {
                    sVar.x = true;
                }
            }
            U = j0Var.U(-1, 0, arrayList, arrayList2);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                linkedHashSet.addAll(j0.F((a) obj2));
            }
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return U;
    }
}
