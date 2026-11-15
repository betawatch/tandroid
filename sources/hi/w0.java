package hi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ w0(a1 a1Var, int i7) {
        this.a = i7;
        this.b = a1Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    d7 a10 = ((z0) arrayList.get(i7)).a();
                    if ((a10.v() || ((file = a10.L) != null && file.exists())) && currentTimeMillis - a10.d <= 604800000) {
                        arrayList4.add(a10);
                        arrayList2.add(Long.valueOf(a10.b));
                    } else {
                        arrayList3.add(a10);
                    }
                }
                a1 a1Var = this.b;
                a1Var.c(arrayList3);
                a1Var.f = false;
                a1Var.e = true;
                fi.s6 P1 = np.s1(a1Var.a).P1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    fi.r6 r6Var = new fi.r6(P1, (d7) obj2);
                    P1.d(r6Var.K, r6Var, P1.b, false);
                }
                ns.f(P1.a).k(ns.v5, new Object[0]);
                break;
            default:
                a1 a1Var2 = this.b;
                a1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    d7 a11 = ((z0) arrayList.get(i11)).a();
                    if ((a11.v() || ((file2 = a11.L) != null && file2.exists())) && (!a11.g ? currentTimeMillis2 - a11.d <= 604800000 : currentTimeMillis2 <= a11.J)) {
                        a1Var2.b.add(a11);
                        arrayList5.add(Long.valueOf(a11.b));
                    } else {
                        arrayList6.add(a11);
                    }
                }
                a1Var2.c(arrayList6);
                a1Var2.d = false;
                a1Var2.c = true;
                ns.f(a1Var2.a).k(ns.y5, new Object[0]);
                break;
        }
    }
}
