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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.k implements bd.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ w c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w wVar, int i10) {
        super(1);
        this.b = i10;
        this.c = wVar;
    }

    @Override // bd.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.j.e((b) obj, "backEvent");
                w wVar = this.c;
                rc.e eVar = wVar.b;
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
                wVar.c = a0Var;
                if (a0Var != null) {
                    j0 j0Var = a0Var.d;
                    if (j0.K(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + j0Var);
                    }
                    j0Var.x();
                    j0Var.y(new i0(j0Var), false);
                }
                return qc.i.a;
            default:
                b backEvent = (b) obj;
                kotlin.jvm.internal.j.e(backEvent, "backEvent");
                w wVar2 = this.c;
                a0 a0Var2 = wVar2.c;
                if (a0Var2 == null) {
                    rc.e eVar2 = wVar2.b;
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
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj4 = arrayList.get(i10);
                                i10++;
                                ((u0) obj4).getClass();
                                rc.m.e(arrayList2, null);
                            }
                            List m10 = rc.g.m(rc.g.p(arrayList2));
                            int size2 = m10.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                ((t0) m10.get(i11)).b(backEvent, lVar.a);
                            }
                        }
                        Iterator it2 = j0Var2.n.iterator();
                        if (it2.hasNext()) {
                            it2.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return qc.i.a;
        }
    }
}
