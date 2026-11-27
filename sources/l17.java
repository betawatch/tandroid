// default package

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class l17 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public l17(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(q17 q17Var) {
        TLRPC.Document document = q17Var.a;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i2 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i >= Math.min(20, arrayList2.size())) {
                        return -1;
                    }
                    if (((TLRPC.Document) arrayList2.get(i)).id == document.id) {
                        return (arrayList2.size() - i) + 1000000;
                    }
                    i++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i2)).id == document.id) {
                    return i2 + 2000000;
                }
                i2++;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q17 q17Var = (q17) obj;
        q17 q17Var2 = (q17) obj2;
        boolean K2 = r47.K2(q17Var.a, true);
        if (K2 == r47.K2(q17Var2.a, true)) {
            int a = a(q17Var);
            int a2 = a(q17Var2);
            if (a > a2) {
                return -1;
            }
            if (a >= a2) {
                return 0;
            }
        } else if (K2) {
            return -1;
        }
        return 1;
    }
}
