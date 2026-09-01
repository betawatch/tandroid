package b4;

import j3.m0;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f {
    public final int a;
    public final List b;

    public f(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    public i0 a(int i10, androidx.biometric.e eVar) {
        String str = (String) eVar.b;
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new u(str));
            }
            if (i10 == 21) {
                return new w(new h());
            }
            if (i10 == 27) {
                if (c(4)) {
                    return null;
                }
                return new w(new q(new d0(0, b(eVar)), c(1), c(8)));
            }
            if (i10 == 36) {
                return new w(new s(new d0(0, b(eVar))));
            }
            if (i10 == 89) {
                return new w(new h((List) eVar.c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new w(new b(str, 1));
                }
                if (i10 == 257) {
                    return new c0(new androidx.biometric.e("application/vnd.dvb.ait", 3));
                }
                if (i10 == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new c0(new androidx.biometric.e("application/x-scte35", 3));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (c(2)) {
                                return null;
                            }
                            return new w(new e(str, false));
                        case 16:
                            return new w(new n(new d0(1, b(eVar))));
                        case 17:
                            if (c(2)) {
                                return null;
                            }
                            return new w(new t(str));
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
                return new w(new b(str, 0));
            }
            return new w(new g(str));
        }
        return new w(new k(new d0(1, b(eVar))));
    }

    public List b(androidx.biometric.e eVar) {
        String str;
        int i10;
        boolean c3 = c(32);
        List list = this.b;
        if (c3) {
            return list;
        }
        h5.w wVar = new h5.w((byte[]) eVar.d);
        while (wVar.a() > 0) {
            int u10 = wVar.u();
            int u11 = wVar.b + wVar.u();
            if (u10 == 134) {
                ArrayList arrayList = new ArrayList();
                int u12 = wVar.u() & 31;
                for (int i11 = 0; i11 < u12; i11++) {
                    String s6 = wVar.s(3, r8.d.c);
                    int u13 = wVar.u();
                    boolean z4 = (u13 & 128) != 0;
                    if (z4) {
                        i10 = u13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte u14 = (byte) wVar.u();
                    wVar.G(1);
                    List singletonList = z4 ? Collections.singletonList((u14 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    m0 m0Var = new m0();
                    m0Var.o = str;
                    m0Var.c = s6;
                    m0Var.G = i10;
                    m0Var.q = singletonList;
                    arrayList.add(new n0(m0Var));
                }
                list = arrayList;
            }
            wVar.F(u11);
        }
        return list;
    }

    public boolean c(int i10) {
        return (i10 & this.a) != 0;
    }

    public f() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
