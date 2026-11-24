// default package

import java.util.ArrayList;
import java.util.TreeMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class f01 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w01 b;

    public /* synthetic */ f01(w01 w01Var, byte b) {
        this.a = b;
        this.b = w01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        w01 w01Var = this.b;
        switch (b) {
            case 0:
                w01Var.m = null;
                if (w01Var.c == 1) {
                    w01Var.y();
                    break;
                }
                break;
            case 1:
                w01Var.O = null;
                w01Var.u();
                break;
            case 2:
                w01Var.O = null;
                w01Var.u();
                break;
            case 3:
                w01Var.O = null;
                w01Var.u();
                break;
            case 4:
                w01 w01Var2 = this.b;
                a64[] a64VarArr = w01Var2.z;
                w01Var2.n = null;
                byte b2 = w01Var2.c;
                if (b2 != 4) {
                    TreeMap treeMap = w01Var2.d;
                    if (b2 == 2 && w01Var2.t) {
                        a64 a64Var = a64VarArr[w01Var2.y ? 1 : 0];
                        if (w01Var2.o(a64Var)) {
                            long h = w01Var2.a.h();
                            if (w01Var2.F) {
                                ArrayList arrayList = new ArrayList(treeMap.values());
                                int size = arrayList.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    m01 m01Var = (m01) obj;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (u01 u01Var : m01Var.k.values()) {
                                        t01 l = w01Var2.l(u01Var.a);
                                        if (u01Var.d != null && l != null && u01Var.c > 0) {
                                            arrayList2.add(u01Var);
                                        }
                                    }
                                    int size2 = arrayList2.size();
                                    int i3 = i;
                                    while (i3 < size2) {
                                        int i4 = i3 + 1;
                                        u01 u01Var2 = (u01) arrayList2.get(i3);
                                        t01 l2 = w01Var2.l(u01Var2.a);
                                        a64 a64Var2 = a64VarArr[w01Var2.y ? 1 : 0];
                                        long j = u01Var2.g;
                                        int i5 = size2;
                                        int i6 = u01Var2.c;
                                        l2.getClass();
                                        int a = w01Var2.a(a64Var2, h, j, i6, 0, m01Var.a);
                                        if (a >= 0) {
                                            w01Var2.g(u01Var2);
                                            u01Var2.c = a;
                                            w01Var2.r(m01Var, u01Var2);
                                        }
                                        i3 = i4;
                                        size2 = i5;
                                        i = 0;
                                    }
                                }
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (m01 m01Var2 : treeMap.values()) {
                                    if (m01Var2.c != null && m01Var2.b > 1) {
                                        arrayList3.add(m01Var2);
                                    }
                                }
                                int size3 = arrayList3.size();
                                while (i < size3) {
                                    Object obj2 = arrayList3.get(i);
                                    i++;
                                    m01 m01Var3 = (m01) obj2;
                                    int a2 = w01Var2.a(a64Var, h, m01Var3.f, m01Var3.b, 1, m01Var3.a);
                                    if (a2 >= 0) {
                                        m01Var3.c.cancel();
                                        m01Var3.c = null;
                                        w01Var2.v--;
                                        m01Var3.b = a2;
                                        w01Var2.p(m01Var3);
                                    }
                                }
                            }
                        }
                    }
                    w01Var2.B();
                    break;
                }
                break;
            case 5:
                w01Var.l = null;
                w01Var.w();
                break;
            case 6:
                if (w01Var.c == 0) {
                    w01Var.a.d("start");
                    w01Var.y();
                    break;
                }
                break;
            default:
                l01 l01Var = w01Var.a;
                if (w01Var.c == 3) {
                    long h2 = l01Var.h() - w01Var.o;
                    l01Var.d("rejoined after " + h2 + " ms");
                    if (h2 > 30000) {
                        w01Var.e(false);
                        w01.d(w01Var.l);
                        w01Var.l = null;
                        w01Var.y();
                        break;
                    } else {
                        w01Var.c = (byte) 2;
                        w01Var.e = w01Var.b();
                        w01Var.w();
                        break;
                    }
                }
                break;
        }
    }
}
