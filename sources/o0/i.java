package o0;

import h3.s0;
import h3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w3.a0;
import w3.f0;
import w3.p;
import w3.r;
import w3.s;
import w3.t;
import w3.u;
import w3.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final List b;

    public i(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    public f0 a(int i10, u2.b bVar) {
        String str = (String) bVar.b;
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new u(new t(str));
            }
            if (i10 == 21) {
                return new u(new w3.g());
            }
            if (i10 == 27) {
                if (c(4)) {
                    return null;
                }
                return new u(new p(new a0(0, b(bVar)), c(1), c(8)));
            }
            if (i10 == 36) {
                return new u(new r(new a0(0, b(bVar))));
            }
            if (i10 == 89) {
                return new u(new w3.g((List) bVar.c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new u(new w3.b(str, 1));
                }
                if (i10 == 257) {
                    return new z(new u2.b("application/vnd.dvb.ait", 6));
                }
                if (i10 == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new z(new u2.b("application/x-scte35", 6));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (c(2)) {
                                return null;
                            }
                            return new u(new w3.e(str, false));
                        case 16:
                            return new u(new w3.m(new a0(1, b(bVar))));
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
                return new u(new w3.b(str, 0));
            }
            return new u(new w3.f(str));
        }
        return new u(new w3.j(new a0(1, b(bVar))));
    }

    public List b(u2.b bVar) {
        String str;
        int i10;
        boolean c10 = c(32);
        List list = this.b;
        if (c10) {
            return list;
        }
        d5.z zVar = new d5.z((byte[]) bVar.d);
        while (zVar.a() > 0) {
            int r10 = zVar.r();
            int r11 = zVar.b + zVar.r();
            if (r10 == 134) {
                ArrayList arrayList = new ArrayList();
                int r12 = zVar.r() & 31;
                for (int i11 = 0; i11 < r12; i11++) {
                    String p6 = zVar.p(3, o8.d.c);
                    int r13 = zVar.r();
                    boolean z10 = (r13 & 128) != 0;
                    if (z10) {
                        i10 = r13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte r14 = (byte) zVar.r();
                    zVar.D(1);
                    List singletonList = z10 ? Collections.singletonList((r14 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    s0 s0Var = new s0();
                    s0Var.o = str;
                    s0Var.c = p6;
                    s0Var.G = i10;
                    s0Var.q = singletonList;
                    arrayList.add(new t0(s0Var));
                }
                list = arrayList;
            }
            zVar.C(r11);
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
