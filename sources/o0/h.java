package o0;

import d5.y;
import h3.s0;
import h3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w3.a0;
import w3.e0;
import w3.m;
import w3.p;
import w3.r;
import w3.s;
import w3.t;
import w3.u;
import w3.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h {
    public final int a;
    public final List b;

    public h(int i9, List list) {
        this.a = i9;
        this.b = list;
    }

    public e0 a(int i9, t5.c cVar) {
        String str = (String) cVar.c;
        if (i9 != 2) {
            if (i9 == 3 || i9 == 4) {
                return new u(new t(str));
            }
            if (i9 == 21) {
                return new u(new w3.g());
            }
            if (i9 == 27) {
                if (c(4)) {
                    return null;
                }
                return new u(new p(new a0(0, b(cVar)), c(1), c(8)));
            }
            if (i9 == 36) {
                return new u(new r(new a0(0, b(cVar))));
            }
            if (i9 == 89) {
                return new u(new w3.g((List) cVar.b));
            }
            if (i9 != 138) {
                if (i9 == 172) {
                    return new u(new w3.b(str, 1));
                }
                if (i9 == 257) {
                    return new z(new t5.c("application/vnd.dvb.ait", 6));
                }
                if (i9 == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new z(new t5.c("application/x-scte35", 6));
                }
                if (i9 != 135) {
                    switch (i9) {
                        case 15:
                            if (c(2)) {
                                return null;
                            }
                            return new u(new w3.e(str, false));
                        case 16:
                            return new u(new m(new a0(1, b(cVar))));
                        case 17:
                            if (c(2)) {
                                return null;
                            }
                            return new u(new s(str));
                        default:
                            switch (i9) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!c(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new u(new w3.b(str, 0));
            }
            return new u(new w3.f(str));
        }
        return new u(new w3.j(new a0(1, b(cVar))));
    }

    public List b(t5.c cVar) {
        String str;
        int i9;
        boolean c10 = c(32);
        List list = this.b;
        if (c10) {
            return list;
        }
        y yVar = new y((byte[]) cVar.d);
        while (yVar.a() > 0) {
            int r10 = yVar.r();
            int r11 = yVar.b + yVar.r();
            if (r10 == 134) {
                ArrayList arrayList = new ArrayList();
                int r12 = yVar.r() & 31;
                for (int i10 = 0; i10 < r12; i10++) {
                    String p6 = yVar.p(3, n8.d.c);
                    int r13 = yVar.r();
                    boolean z10 = (r13 & 128) != 0;
                    if (z10) {
                        i9 = r13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i9 = 1;
                    }
                    byte r14 = (byte) yVar.r();
                    yVar.D(1);
                    List singletonList = z10 ? Collections.singletonList((r14 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    s0 s0Var = new s0();
                    s0Var.o = str;
                    s0Var.c = p6;
                    s0Var.G = i9;
                    s0Var.q = singletonList;
                    arrayList.add(new t0(s0Var));
                }
                list = arrayList;
            }
            yVar.C(r11);
        }
        return list;
    }

    public boolean c(int i9) {
        return (i9 & this.a) != 0;
    }

    public h() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public h(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
