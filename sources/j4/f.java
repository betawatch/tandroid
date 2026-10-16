package j4;

import b2.w0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                return new w(new u(str, lVar.b(), "video/mp2t"));
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
                return new w(new b(lVar.b(), 1, str, "video/mp2t"));
            }
            if (i10 == 257) {
                return new b0(new androidx.biometric.e("application/vnd.dvb.ait", 21));
            }
            if (i10 != 138) {
                if (i10 == 139) {
                    return new w(new g(str, lVar.b(), 5408));
                }
                switch (i10) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new w(new e(lVar.b(), str, "video/mp2t", false));
                    case 16:
                        return new w(new n(new c0(1, b(lVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new w(new t(str, lVar.b()));
                    default:
                        switch (i10) {
                            case 128:
                                break;
                            case 129:
                                return new w(new b(lVar.b(), 0, str, "video/mp2t"));
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
                                        return new b0(new androidx.biometric.e("application/x-scte35", 21));
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
            return new w(new g(str, lVar.b(), 4096));
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
        e2.x xVar = new e2.x((byte[]) lVar.d);
        while (xVar.a() > 0) {
            int A = xVar.A();
            int A2 = xVar.b + xVar.A();
            if (A == 134) {
                ArrayList arrayList = new ArrayList();
                int A3 = xVar.A() & 31;
                for (int i11 = 0; i11 < A3; i11++) {
                    String y3 = xVar.y(3, StandardCharsets.UTF_8);
                    int A4 = xVar.A();
                    boolean z10 = (A4 & 128) != 0;
                    if (z10) {
                        i10 = A4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte A5 = (byte) xVar.A();
                    xVar.O(1);
                    if (z10) {
                        boolean z11 = (A5 & 64) != 0;
                        byte[] bArr = e2.g.a;
                        list = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    b2.w wVar = new b2.w();
                    wVar.r = w0.n(str);
                    wVar.d = y3;
                    wVar.O = i10;
                    wVar.u = list;
                    arrayList.add(new b2.x(wVar));
                }
                list2 = arrayList;
            }
            xVar.N(A2);
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
