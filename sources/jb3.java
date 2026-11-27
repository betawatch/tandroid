// default package

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jb3 implements oh5 {
    public final /* synthetic */ mb3 a;

    public jb3(mb3 mb3Var) {
        this.a = mb3Var;
    }

    @Override // oh5
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // oh5
    public final boolean b(Uri uri, ed edVar, boolean z) {
        mb3 mb3Var = this.a;
        HashMap hashMap = mb3Var.d;
        if (mb3Var.J == null) {
            ug5 ug5Var = mb3Var.y;
            boolean z2 = ug5Var != null && ug5Var.k;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lb3 lb3Var = (lb3) hashMap.get(uri);
            lb3Var.getClass();
            qh5 qh5Var = lb3Var.a;
            int size = qh5Var.b.size();
            v9c it = bp5.q(qh5Var.b.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                if (mb3Var.e(elapsedRealtime, (Uri) it.next())) {
                    i++;
                }
            }
            int size2 = mb3Var.E.size();
            no5 listIterator = mb3Var.E.listIterator(0);
            int i2 = 0;
            while (listIterator.hasNext()) {
                qh5 qh5Var2 = (qh5) listIterator.next();
                if (z2 ? mb3Var.e(elapsedRealtime, qh5Var2.b()) : mb3Var.g(qh5Var2, elapsedRealtime)) {
                    i2++;
                }
            }
            ga6 ga6Var = new ga6(z2, size, i, size2, i2);
            mb3Var.c.getClass();
            ha6 u3 = z6f.u3(ga6Var, edVar);
            if (u3 != null) {
                long j = u3.b;
                if (z2 && u3.a == 1) {
                    ug5 ug5Var2 = mb3Var.y;
                    ug5Var2.getClass();
                    return ug5Var2.a(j);
                }
                lb3 lb3Var2 = (lb3) hashMap.get(uri);
                if (lb3Var2 != null) {
                    return lb3Var2.a(j, uri, null);
                }
            }
        }
        return false;
    }
}
