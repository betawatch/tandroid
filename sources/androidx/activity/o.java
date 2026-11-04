package androidx.activity;

import android.util.Log;
import androidx.fragment.app.a0;
import androidx.fragment.app.i0;
import androidx.fragment.app.j0;
import androidx.fragment.app.t0;
import androidx.fragment.app.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.k implements od.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ v c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(v vVar, int i3) {
        super(1);
        this.b = i3;
        this.c = vVar;
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.j.e((b) obj, "backEvent");
                v vVar = this.c;
                ed.e eVar = vVar.b;
                eVar.getClass();
                ListIterator listIterator = eVar.listIterator(eVar.c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((a0) obj2).a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                a0 a0Var = (a0) obj2;
                vVar.c = a0Var;
                if (a0Var != null) {
                    j0 j0Var = a0Var.d;
                    if (j0.K(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + j0Var);
                    }
                    j0Var.x();
                    j0Var.y(new i0(j0Var), false);
                }
                return dd.k.a;
            default:
                b backEvent = (b) obj;
                kotlin.jvm.internal.j.e(backEvent, "backEvent");
                v vVar2 = this.c;
                a0 a0Var2 = vVar2.c;
                if (a0Var2 == null) {
                    ed.e eVar2 = vVar2.b;
                    eVar2.getClass();
                    ListIterator listIterator2 = eVar2.listIterator(eVar2.c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((a0) obj3).a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    a0Var2 = (a0) obj3;
                }
                if (a0Var2 != null) {
                    j0 j0Var2 = a0Var2.d;
                    if (j0.K(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + j0Var2);
                    }
                    if (j0Var2.h != null) {
                        Iterator it = j0Var2.f(0, 1, new ArrayList(Collections.singletonList(j0Var2.h))).iterator();
                        while (it.hasNext()) {
                            androidx.fragment.app.l lVar = (androidx.fragment.app.l) it.next();
                            lVar.getClass();
                            if (j0.K(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.c);
                            }
                            ArrayList arrayList = lVar.c;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj4 = arrayList.get(i3);
                                i3++;
                                ((u0) obj4).getClass();
                                ed.m.e(null, arrayList2);
                            }
                            List l10 = ed.g.l(ed.g.o(arrayList2));
                            int size2 = l10.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                ((t0) l10.get(i10)).b(backEvent, lVar.a);
                            }
                        }
                        Iterator it2 = j0Var2.n.iterator();
                        if (it2.hasNext()) {
                            throw a1.g.m(it2);
                        }
                    }
                }
                return dd.k.a;
        }
    }
}
