package androidx.activity;

import android.util.Log;
import androidx.fragment.app.h0;
import androidx.fragment.app.i0;
import androidx.fragment.app.s0;
import androidx.fragment.app.t0;
import androidx.fragment.app.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                        if (((z) obj2).a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                z zVar = (z) obj2;
                xVar.c = zVar;
                if (zVar != null) {
                    i0 i0Var = zVar.d;
                    if (i0.K(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + i0Var);
                    }
                    i0Var.x();
                    i0Var.y(new h0(i0Var), false);
                }
                return gd.i.a;
            default:
                b backEvent = (b) obj;
                kotlin.jvm.internal.i.e(backEvent, "backEvent");
                x xVar2 = this.c;
                z zVar2 = xVar2.c;
                if (zVar2 == null) {
                    hd.e eVar2 = xVar2.b;
                    eVar2.getClass();
                    ListIterator listIterator2 = eVar2.listIterator(eVar2.c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((z) obj3).a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    zVar2 = (z) obj3;
                }
                if (zVar2 != null) {
                    i0 i0Var2 = zVar2.d;
                    if (i0.K(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + i0Var2);
                    }
                    if (i0Var2.h != null) {
                        Iterator it = i0Var2.f(0, 1, new ArrayList(Collections.singletonList(i0Var2.h))).iterator();
                        while (it.hasNext()) {
                            androidx.fragment.app.k kVar = (androidx.fragment.app.k) it.next();
                            kVar.getClass();
                            if (i0.K(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.c);
                            }
                            ArrayList arrayList = kVar.c;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj4 = arrayList.get(i10);
                                i10++;
                                ((t0) obj4).getClass();
                                hd.m.e(arrayList2, null);
                            }
                            List m10 = hd.g.m(hd.g.p(arrayList2));
                            int size2 = m10.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                ((s0) m10.get(i11)).b(backEvent, kVar.a);
                            }
                        }
                        Iterator it2 = i0Var2.n.iterator();
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
