// default package

import java.util.ArrayList;
import java.util.TreeMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class gz0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xz0 b;

    public /* synthetic */ gz0(xz0 xz0Var, byte b) {
        this.a = b;
        this.b = xz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        xz0 xz0Var = this.b;
        switch (b) {
            case 0:
                xz0Var.m = null;
                if (xz0Var.c == 1) {
                    xz0Var.y();
                    break;
                }
                break;
            case 1:
                xz0Var.O = null;
                xz0Var.u();
                break;
            case 2:
                xz0Var.O = null;
                xz0Var.u();
                break;
            case 3:
                xz0Var.O = null;
                xz0Var.u();
                break;
            case 4:
                xz0 xz0Var2 = this.b;
                l54[] l54VarArr = xz0Var2.z;
                xz0Var2.n = null;
                byte b2 = xz0Var2.c;
                if (b2 != 4) {
                    TreeMap treeMap = xz0Var2.d;
                    if (b2 == 2 && xz0Var2.t) {
                        l54 l54Var = l54VarArr[xz0Var2.y ? 1 : 0];
                        if (xz0Var2.o(l54Var)) {
                            long h = xz0Var2.a.h();
                            if (xz0Var2.F) {
                                ArrayList arrayList = new ArrayList(treeMap.values());
                                int size = arrayList.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    nz0 nz0Var = (nz0) obj;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (vz0 vz0Var : nz0Var.k.values()) {
                                        uz0 l = xz0Var2.l(vz0Var.a);
                                        if (vz0Var.d != null && l != null && vz0Var.c > 0) {
                                            arrayList2.add(vz0Var);
                                        }
                                    }
                                    int size2 = arrayList2.size();
                                    int i3 = i;
                                    while (i3 < size2) {
                                        int i4 = i3 + 1;
                                        vz0 vz0Var2 = (vz0) arrayList2.get(i3);
                                        uz0 l2 = xz0Var2.l(vz0Var2.a);
                                        l54 l54Var2 = l54VarArr[xz0Var2.y ? 1 : 0];
                                        long j = vz0Var2.g;
                                        int i5 = size2;
                                        int i6 = vz0Var2.c;
                                        l2.getClass();
                                        int a = xz0Var2.a(l54Var2, h, j, i6, 0, nz0Var.a);
                                        if (a >= 0) {
                                            xz0Var2.g(vz0Var2);
                                            vz0Var2.c = a;
                                            xz0Var2.r(nz0Var, vz0Var2);
                                        }
                                        i3 = i4;
                                        size2 = i5;
                                        i = 0;
                                    }
                                }
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (nz0 nz0Var2 : treeMap.values()) {
                                    if (nz0Var2.c != null && nz0Var2.b > 1) {
                                        arrayList3.add(nz0Var2);
                                    }
                                }
                                int size3 = arrayList3.size();
                                while (i < size3) {
                                    Object obj2 = arrayList3.get(i);
                                    i++;
                                    nz0 nz0Var3 = (nz0) obj2;
                                    int a2 = xz0Var2.a(l54Var, h, nz0Var3.f, nz0Var3.b, 1, nz0Var3.a);
                                    if (a2 >= 0) {
                                        nz0Var3.c.cancel();
                                        nz0Var3.c = null;
                                        xz0Var2.v--;
                                        nz0Var3.b = a2;
                                        xz0Var2.p(nz0Var3);
                                    }
                                }
                            }
                        }
                    }
                    xz0Var2.B();
                    break;
                }
                break;
            case 5:
                xz0Var.l = null;
                xz0Var.w();
                break;
            case 6:
                if (xz0Var.c == 0) {
                    xz0Var.a.c("start");
                    xz0Var.y();
                    break;
                }
                break;
            default:
                mz0 mz0Var = xz0Var.a;
                if (xz0Var.c == 3) {
                    long h2 = mz0Var.h() - xz0Var.o;
                    mz0Var.c("rejoined after " + h2 + " ms");
                    if (h2 > 30000) {
                        xz0Var.e(false);
                        xz0.d(xz0Var.l);
                        xz0Var.l = null;
                        xz0Var.y();
                        break;
                    } else {
                        xz0Var.c = (byte) 2;
                        xz0Var.e = xz0Var.b();
                        xz0Var.w();
                        break;
                    }
                }
                break;
        }
    }
}
