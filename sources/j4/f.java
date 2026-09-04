package j4;

import b2.r0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f {
    public final int a;
    public final List b;

    public f(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0 a(int i10, j6.l lVar) {
        String str = (String) lVar.b;
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new u(str, lVar.d(), "video/mp2t"));
            }
            if (i10 == 21) {
                return new w(new h());
            }
            if (i10 == 27) {
                if (c(4)) {
                    return null;
                }
                return new w(new q(new c0(0, b(lVar)), c(1), c(8)));
            }
            if (i10 == 36) {
                return new w(new s(new c0(0, b(lVar))));
            }
            if (i10 == 45) {
                return new w(new v());
            }
            if (i10 == 89) {
                return new w(new h((List) lVar.c));
            }
            if (i10 == 172) {
                return new w(new b(lVar.d(), 1, str, "video/mp2t"));
            }
            if (i10 == 257) {
                return new b0(new aa.a("application/vnd.dvb.ait", 19));
            }
            if (i10 != 138) {
                if (i10 == 139) {
                    return new w(new g(str, lVar.d(), 5408));
                }
                switch (i10) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new w(new e(lVar.d(), str, "video/mp2t", false));
                    case 16:
                        return new w(new n(new c0(1, b(lVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new w(new t(str, lVar.d()));
                    default:
                        switch (i10) {
                            case 128:
                                break;
                            case 129:
                                return new w(new b(lVar.d(), 0, str, "video/mp2t"));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i10) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new b0(new aa.a("application/x-scte35", 19));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new w(new g(str, lVar.d(), 4096));
        }
        return new w(new k(new c0(1, b(lVar)), "video/mp2t"));
    }

    public List b(j6.l lVar) {
        String str;
        int i10;
        List list;
        boolean c10 = c(32);
        List list2 = this.b;
        if (c10) {
            return list2;
        }
        e2.v vVar = new e2.v((byte[]) lVar.d);
        while (vVar.a() > 0) {
            int x10 = vVar.x();
            int x11 = vVar.b + vVar.x();
            if (x10 == 134) {
                ArrayList arrayList = new ArrayList();
                int x12 = vVar.x() & 31;
                for (int i11 = 0; i11 < x12; i11++) {
                    String v = vVar.v(3, StandardCharsets.UTF_8);
                    int x13 = vVar.x();
                    boolean z10 = (x13 & 128) != 0;
                    if (z10) {
                        i10 = x13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte x14 = (byte) vVar.x();
                    vVar.K(1);
                    if (z10) {
                        boolean z11 = (x14 & 64) != 0;
                        byte[] bArr = e2.e.a;
                        list = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    b2.r rVar = new b2.r();
                    rVar.q = r0.n(str);
                    rVar.d = v;
                    rVar.N = i10;
                    rVar.t = list;
                    arrayList.add(new b2.s(rVar));
                }
                list2 = arrayList;
            }
            vVar.J(x11);
        }
        return list2;
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
