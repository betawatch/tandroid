package o3;

import f5.c0;
import java.util.ArrayList;
import java.util.Collections;
import q8.l0;
import q8.z;
import y3.b0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i {
    public static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final g9.l c = new g9.l(new m4.a(7));
    public static final g9.l d = new g9.l(new m4.a(8));
    public final l0 a;

    public i() {
        q8.x xVar = z.b;
        this.a = l0.e;
    }

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new y3.a());
                break;
            case 1:
                arrayList.add(new y3.c());
                break;
            case 2:
                arrayList.add(new y3.d(1));
                break;
            case 3:
                arrayList.add(new p3.a(1));
                break;
            case 4:
                k n10 = c.n(0);
                if (n10 == null) {
                    arrayList.add(new r3.b());
                    break;
                } else {
                    arrayList.add(n10);
                    break;
                }
            case 5:
                arrayList.add(new s3.b());
                break;
            case 6:
                arrayList.add(new u3.e(0));
                break;
            case 7:
                arrayList.add(new v3.d(1));
                break;
            case 8:
                arrayList.add(new w3.i(0, null, Collections.EMPTY_LIST, null));
                arrayList.add(new w3.l(0));
                break;
            case 9:
                arrayList.add(new x3.d());
                break;
            case 10:
                arrayList.add(new y3.x());
                break;
            case 11:
                arrayList.add(new b0(1, new c0(0L), new o0.i(0, this.a)));
                break;
            case 12:
                z3.c cVar = new z3.c();
                cVar.c = 0;
                cVar.d = -1L;
                cVar.f = -1;
                cVar.g = -1L;
                arrayList.add(cVar);
                break;
            case 14:
                arrayList.add(new t3.a());
                break;
            case 15:
                k n11 = d.n(new Object[0]);
                if (n11 != null) {
                    arrayList.add(n11);
                    break;
                }
                break;
            case 16:
                arrayList.add(new q3.b());
                break;
        }
    }
}
