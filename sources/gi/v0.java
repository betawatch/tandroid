package gi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ v0(z0 z0Var, int i3) {
        this.a = i3;
        this.b = z0Var;
    }

    @Override // org.telegram.messenger.u10
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
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    f7 a10 = ((y0) arrayList.get(i3)).a();
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
                ei.z6 P1 = hp.s1(z0Var.a).P1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    ei.y6 y6Var = new ei.y6(P1, (f7) obj2);
                    P1.d(y6Var.K, y6Var, P1.b, false);
                }
                hs.f(P1.a).k(hs.v5, new Object[0]);
                break;
            default:
                z0 z0Var2 = this.b;
                z0Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    f7 a11 = ((y0) arrayList.get(i11)).a();
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
                hs.f(z0Var2.a).k(hs.y5, new Object[0]);
                break;
        }
    }
}
