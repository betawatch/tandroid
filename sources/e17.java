// default package

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e17 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public e17(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(j17 j17Var) {
        TLRPC.Document document = j17Var.a;
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
        j17 j17Var = (j17) obj;
        j17 j17Var2 = (j17) obj2;
        boolean K2 = k47.K2(j17Var.a, true);
        if (K2 == k47.K2(j17Var2.a, true)) {
            int a = a(j17Var);
            int a2 = a(j17Var2);
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
