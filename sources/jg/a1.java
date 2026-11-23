package jg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a1 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public a1(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(g1 g1Var) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i7 >= Math.min(20, arrayList2.size())) {
                        return -1;
                    }
                    if (((TLRPC.Document) arrayList2.get(i7)).id == g1Var.a.id) {
                        return (arrayList2.size() - i7) + 1000000;
                    }
                    i7++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i10)).id == g1Var.a.id) {
                    return i10 + 2000000;
                }
                i10++;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g1 g1Var = (g1) obj;
        g1 g1Var2 = (g1) obj2;
        boolean K2 = gj.K2(g1Var.a, true);
        if (K2 == gj.K2(g1Var2.a, true)) {
            int a10 = a(g1Var);
            int a11 = a(g1Var2);
            if (a10 > a11) {
                return -1;
            }
            if (a10 >= a11) {
                return 0;
            }
        } else if (K2) {
            return -1;
        }
        return 1;
    }
}
