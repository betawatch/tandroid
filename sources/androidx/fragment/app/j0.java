package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class j0 implements h0 {
    public final /* synthetic */ k0 a;

    public j0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // androidx.fragment.app.h0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean U;
        k0 k0Var = this.a;
        ArrayList arrayList3 = k0Var.n;
        if (k0.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + k0Var.a);
        }
        int i10 = 0;
        if (k0Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            U = false;
        } else {
            a aVar = (a) hg.c.h(1, k0Var.d);
            k0Var.h = aVar;
            ArrayList arrayList4 = aVar.a;
            int size = arrayList4.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList4.get(i11);
                i11++;
                s sVar = ((r0) obj).b;
                if (sVar != null) {
                    sVar.x = true;
                }
            }
            U = k0Var.U(-1, 0, arrayList, arrayList2);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                linkedHashSet.addAll(k0.F((a) obj2));
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
