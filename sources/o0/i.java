package o0;

import f5.w;
import j3.s0;
import j3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y3.a0;
import y3.e0;
import y3.m;
import y3.p;
import y3.r;
import y3.s;
import y3.t;
import y3.u;
import y3.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final List b;

    public i(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    public e0 a(int i10, v5.c cVar) {
        String str = (String) cVar.c;
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new u(new t(str));
            }
            if (i10 == 21) {
                return new u(new y3.g());
            }
            if (i10 == 27) {
                if (c(4)) {
                    return null;
                }
                return new u(new p(new a0(0, b(cVar)), c(1), c(8)));
            }
            if (i10 == 36) {
                return new u(new r(new a0(0, b(cVar))));
            }
            if (i10 == 89) {
                return new u(new y3.g((List) cVar.b));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new u(new y3.b(str, 1));
                }
                if (i10 == 257) {
                    return new z(new v5.c("application/vnd.dvb.ait", 6));
                }
                if (i10 == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new z(new v5.c("application/x-scte35", 6));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (c(2)) {
                                return null;
                            }
                            return new u(new y3.e(str, false));
                        case 16:
                            return new u(new m(new a0(1, b(cVar))));
                        case 17:
                            if (c(2)) {
                                return null;
                            }
                            return new u(new s(str));
                        default:
                            switch (i10) {
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
                return new u(new y3.b(str, 0));
            }
            return new u(new y3.f(str));
        }
        return new u(new y3.j(new a0(1, b(cVar))));
    }

    public List b(v5.c cVar) {
        String str;
        int i10;
        boolean c3 = c(32);
        List list = this.b;
        if (c3) {
            return list;
        }
        w wVar = new w((byte[]) cVar.d);
        while (wVar.a() > 0) {
            int r6 = wVar.r();
            int r9 = wVar.b + wVar.r();
            if (r6 == 134) {
                ArrayList arrayList = new ArrayList();
                int r10 = wVar.r() & 31;
                for (int i11 = 0; i11 < r10; i11++) {
                    String p10 = wVar.p(3, p8.d.c);
                    int r11 = wVar.r();
                    boolean z10 = (r11 & 128) != 0;
                    if (z10) {
                        i10 = r11 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte r12 = (byte) wVar.r();
                    wVar.D(1);
                    List singletonList = z10 ? Collections.singletonList((r12 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    s0 s0Var = new s0();
                    s0Var.o = str;
                    s0Var.c = p10;
                    s0Var.G = i10;
                    s0Var.q = singletonList;
                    arrayList.add(new t0(s0Var));
                }
                list = arrayList;
            }
            wVar.C(r9);
        }
        return list;
    }

    public boolean c(int i10) {
        return (i10 & this.a) != 0;
    }

    public i() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public i(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
