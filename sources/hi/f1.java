package hi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j1 b;

    public /* synthetic */ f1(j1 j1Var, int i7) {
        this.a = i7;
        this.b = j1Var;
    }

    @Override // org.telegram.messenger.w10
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
                    x7 a10 = ((i1) arrayList.get(i7)).a();
                    if ((a10.v() || ((file = a10.L) != null && file.exists())) && currentTimeMillis - a10.d <= 604800000) {
                        arrayList4.add(a10);
                        arrayList2.add(Long.valueOf(a10.b));
                    } else {
                        arrayList3.add(a10);
                    }
                }
                j1 j1Var = this.b;
                j1Var.c(arrayList3);
                j1Var.f = false;
                j1Var.e = true;
                fi.p6 R1 = mp.u1(j1Var.a).R1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    fi.o6 o6Var = new fi.o6(R1, (x7) obj2);
                    R1.d(o6Var.K, o6Var, R1.b, false);
                }
                ks.f(R1.a).k(ks.y5, new Object[0]);
                break;
            default:
                j1 j1Var2 = this.b;
                j1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    x7 a11 = ((i1) arrayList.get(i11)).a();
                    if ((a11.v() || ((file2 = a11.L) != null && file2.exists())) && (!a11.g ? currentTimeMillis2 - a11.d <= 604800000 : currentTimeMillis2 <= a11.J)) {
                        j1Var2.b.add(a11);
                        arrayList5.add(Long.valueOf(a11.b));
                    } else {
                        arrayList6.add(a11);
                    }
                }
                j1Var2.c(arrayList6);
                j1Var2.d = false;
                j1Var2.c = true;
                ks.f(j1Var2.a).k(ks.B5, new Object[0]);
                break;
        }
    }
}
