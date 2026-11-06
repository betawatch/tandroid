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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                        if (((z) obj2).a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                z zVar = (z) obj2;
                wVar.c = zVar;
                if (zVar != null) {
                    i0 i0Var = zVar.d;
                    if (i0.K(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + i0Var);
                    }
                    i0Var.x();
                    i0Var.y(new h0(i0Var), false);
                }
                return gd.k.a;
            default:
                b backEvent = (b) obj;
                kotlin.jvm.internal.j.e(backEvent, "backEvent");
                w wVar2 = this.c;
                z zVar2 = wVar2.c;
                if (zVar2 == null) {
                    hd.d dVar2 = wVar2.b;
                    dVar2.getClass();
                    ListIterator listIterator2 = dVar2.listIterator(dVar2.c);
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
                            int i7 = 0;
                            while (i7 < size) {
                                Object obj4 = arrayList.get(i7);
                                i7++;
                                ((t0) obj4).getClass();
                                hd.l.e(null, arrayList2);
                            }
                            List l10 = hd.f.l(hd.f.o(arrayList2));
                            int size2 = l10.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                ((s0) l10.get(i10)).b(backEvent, kVar.a);
                            }
                        }
                        Iterator it2 = i0Var2.n.iterator();
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
