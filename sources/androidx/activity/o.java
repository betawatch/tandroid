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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.k implements rd.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ w c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w wVar, int i7) {
        super(1);
        this.b = i7;
        this.c = wVar;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.j.e((b) obj, "backEvent");
                w wVar = this.c;
                hd.d dVar = wVar.b;
                dVar.getClass();
                ListIterator listIterator = dVar.listIterator(dVar.c);
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
                return gd.k.a;
            default:
                b backEvent = (b) obj;
                kotlin.jvm.internal.j.e(backEvent, "backEvent");
                w wVar2 = this.c;
                a0 a0Var2 = wVar2.c;
                if (a0Var2 == null) {
                    hd.d dVar2 = wVar2.b;
                    dVar2.getClass();
                    ListIterator listIterator2 = dVar2.listIterator(dVar2.c);
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
                            int i7 = 0;
                            while (i7 < size) {
                                Object obj4 = arrayList.get(i7);
                                i7++;
                                ((u0) obj4).getClass();
                                hd.l.e(null, arrayList2);
                            }
                            List l10 = hd.f.l(hd.f.o(arrayList2));
                            int size2 = l10.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                ((t0) l10.get(i10)).b(backEvent, lVar.a);
                            }
                        }
                        Iterator it2 = j0Var2.n.iterator();
                        if (it2.hasNext()) {
                            it2.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return gd.k.a;
        }
    }
}
