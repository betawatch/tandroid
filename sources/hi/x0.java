package hi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ x0(b1 b1Var, int i7) {
        this.a = i7;
        this.b = b1Var;
    }

    @Override // org.telegram.messenger.y10
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
                    c7 a10 = ((a1) arrayList.get(i7)).a();
                    if ((a10.v() || ((file = a10.L) != null && file.exists())) && currentTimeMillis - a10.d <= 604800000) {
                        arrayList4.add(a10);
                        arrayList2.add(Long.valueOf(a10.b));
                    } else {
                        arrayList3.add(a10);
                    }
                }
                b1 b1Var = this.b;
                b1Var.c(arrayList3);
                b1Var.f = false;
                b1Var.e = true;
                fi.p6 R1 = np.u1(b1Var.a).R1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    fi.o6 o6Var = new fi.o6(R1, (c7) obj2);
                    R1.d(o6Var.K, o6Var, R1.b, false);
                }
                ls.f(R1.a).k(ls.y5, new Object[0]);
                break;
            default:
                b1 b1Var2 = this.b;
                b1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    c7 a11 = ((a1) arrayList.get(i11)).a();
                    if ((a11.v() || ((file2 = a11.L) != null && file2.exists())) && (!a11.g ? currentTimeMillis2 - a11.d <= 604800000 : currentTimeMillis2 <= a11.J)) {
                        b1Var2.b.add(a11);
                        arrayList5.add(Long.valueOf(a11.b));
                    } else {
                        arrayList6.add(a11);
                    }
                }
                b1Var2.c(arrayList6);
                b1Var2.d = false;
                b1Var2.c = true;
                ls.f(b1Var2.a).k(ls.B5, new Object[0]);
                break;
        }
    }
}
