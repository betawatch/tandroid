package jg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a1 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public a1(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(h1 h1Var) {
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
                    if (((TLRPC.Document) arrayList2.get(i7)).id == h1Var.a.id) {
                        return (arrayList2.size() - i7) + 1000000;
                    }
                    i7++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i10)).id == h1Var.a.id) {
                    return i10 + 2000000;
                }
                i10++;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        h1 h1Var = (h1) obj;
        h1 h1Var2 = (h1) obj2;
        boolean K2 = ij.K2(h1Var.a, true);
        if (K2 == ij.K2(h1Var2.a, true)) {
            int a10 = a(h1Var);
            int a11 = a(h1Var2);
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
