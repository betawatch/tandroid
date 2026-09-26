package androidx.activity;

import android.util.Log;
import androidx.fragment.app.b0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.u0;
import androidx.fragment.app.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.j implements rd.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ v c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(v vVar, int i10) {
        super(1);
        this.b = i10;
        this.c = vVar;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.i.e((b) obj, "backEvent");
                v vVar = this.c;
                hd.e eVar = vVar.b;
                eVar.getClass();
                ListIterator listIterator = eVar.listIterator(eVar.c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((b0) obj2).a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                b0 b0Var = (b0) obj2;
                vVar.c = b0Var;
                if (b0Var != null) {
                    k0 k0Var = b0Var.d;
                    if (k0.K(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + k0Var);
                    }
                    k0Var.x();
                    k0Var.y(new j0(k0Var), false);
                }
                return gd.i.a;
            default:
                b backEvent = (b) obj;
                kotlin.jvm.internal.i.e(backEvent, "backEvent");
                v vVar2 = this.c;
                b0 b0Var2 = vVar2.c;
                if (b0Var2 == null) {
                    hd.e eVar2 = vVar2.b;
                    eVar2.getClass();
                    ListIterator listIterator2 = eVar2.listIterator(eVar2.c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((b0) obj3).a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    b0Var2 = (b0) obj3;
                }
                if (b0Var2 != null) {
                    k0 k0Var2 = b0Var2.d;
                    if (k0.K(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + k0Var2);
                    }
                    if (k0Var2.h != null) {
                        Iterator it = k0Var2.f(0, 1, new ArrayList(Collections.singletonList(k0Var2.h))).iterator();
                        while (it.hasNext()) {
                            androidx.fragment.app.l lVar = (androidx.fragment.app.l) it.next();
                            lVar.getClass();
                            if (k0.K(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.c);
                            }
                            ArrayList arrayList = lVar.c;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj4 = arrayList.get(i10);
                                i10++;
                                ((v0) obj4).getClass();
                                hd.m.e(arrayList2, null);
                            }
                            List m10 = hd.g.m(hd.g.p(arrayList2));
                            int size2 = m10.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                ((u0) m10.get(i11)).b(backEvent, lVar.a);
                            }
                        }
                        Iterator it2 = k0Var2.n.iterator();
                        if (it2.hasNext()) {
                            throw a4.a.k(it2);
                        }
                    }
                }
                return gd.i.a;
        }
    }
}
