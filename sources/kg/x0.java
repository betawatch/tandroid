package kg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x0 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public x0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(d1 d1Var) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i3 >= Math.min(20, arrayList2.size())) {
                        return -1;
                    }
                    if (((TLRPC.Document) arrayList2.get(i3)).id == d1Var.a.id) {
                        return (arrayList2.size() - i3) + 1000000;
                    }
                    i3++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i10)).id == d1Var.a.id) {
                    return i10 + 2000000;
                }
                i10++;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        d1 d1Var = (d1) obj;
        d1 d1Var2 = (d1) obj2;
        boolean L2 = zi.L2(d1Var.a, true);
        if (L2 == zi.L2(d1Var2.a, true)) {
            int a10 = a(d1Var);
            int a11 = a(d1Var2);
            if (a10 > a11) {
                return -1;
            }
            if (a10 >= a11) {
                return 0;
            }
        } else if (L2) {
            return -1;
        }
        return 1;
    }
}
