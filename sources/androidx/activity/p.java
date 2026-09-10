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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements rd.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i10) {
        super(1);
        this.b = i10;
        this.c = xVar;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.i.e((b) obj, "backEvent");
                x xVar = this.c;
                hd.e eVar = xVar.b;
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
                xVar.c = a0Var;
                if (a0Var != null) {
                    j0 j0Var = a0Var.d;
                    if (j0.K(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + j0Var);
                    }
                    j0Var.x();
                    j0Var.y(new i0(j0Var), false);
                }
                return gd.i.a;
            default:
                b backEvent = (b) obj;
                kotlin.jvm.internal.i.e(backEvent, "backEvent");
                x xVar2 = this.c;
                a0 a0Var2 = xVar2.c;
                if (a0Var2 == null) {
                    hd.e eVar2 = xVar2.b;
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
                                hd.m.e(arrayList2, null);
                            }
                            List m10 = hd.g.m(hd.g.p(arrayList2));
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
                return gd.i.a;
        }
    }
}
