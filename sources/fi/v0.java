package fi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ v0(z0 z0Var, int i7) {
        this.a = i7;
        this.b = z0Var;
    }

    @Override // org.telegram.messenger.c20
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
                    e7 a10 = ((y0) arrayList.get(i7)).a();
                    if ((a10.v() || ((file = a10.L) != null && file.exists())) && currentTimeMillis - a10.d <= 604800000) {
                        arrayList4.add(a10);
                        arrayList2.add(Long.valueOf(a10.b));
                    } else {
                        arrayList3.add(a10);
                    }
                }
                z0 z0Var = this.b;
                z0Var.c(arrayList3);
                z0Var.f = false;
                z0Var.e = true;
                di.y6 P1 = qp.s1(z0Var.a).P1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    di.x6 x6Var = new di.x6(P1, (e7) obj2);
                    P1.d(x6Var.J, x6Var, P1.b, false);
                }
                qs.f(P1.a).k(qs.v5, new Object[0]);
                break;
            default:
                z0 z0Var2 = this.b;
                z0Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    e7 a11 = ((y0) arrayList.get(i11)).a();
                    if ((a11.v() || ((file2 = a11.L) != null && file2.exists())) && (!a11.g ? currentTimeMillis2 - a11.d <= 604800000 : currentTimeMillis2 <= a11.J)) {
                        z0Var2.b.add(a11);
                        arrayList5.add(Long.valueOf(a11.b));
                    } else {
                        arrayList6.add(a11);
                    }
                }
                z0Var2.c(arrayList6);
                z0Var2.d = false;
                z0Var2.c = true;
                qs.f(z0Var2.a).k(qs.y5, new Object[0]);
                break;
        }
    }
}
