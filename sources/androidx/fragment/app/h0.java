package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class h0 implements f0 {
    public final /* synthetic */ i0 a;

    public h0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // androidx.fragment.app.f0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean U;
        i0 i0Var = this.a;
        ArrayList arrayList3 = i0Var.n;
        if (i0.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + i0Var.a);
        }
        int i7 = 0;
        if (i0Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            U = false;
        } else {
            a aVar = (a) jg.g.i(1, i0Var.d);
            i0Var.h = aVar;
            ArrayList arrayList4 = aVar.a;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                r rVar = ((p0) obj).b;
                if (rVar != null) {
                    rVar.y = true;
                }
            }
            U = i0Var.U(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                linkedHashSet.addAll(i0.F((a) obj2));
            }
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
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
