package m4;

import e2.s0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f {
    public final int a;
    public final List b;

    public f(int i7, List list) {
        this.a = i7;
        this.b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0 a(int i7, m6.n nVar) {
        String str = (String) nVar.b;
        if (i7 != 2) {
            if (i7 == 3 || i7 == 4) {
                return new w(new u(str, nVar.c(), "video/mp2t"));
            }
            if (i7 == 21) {
                return new w(new h());
            }
            if (i7 == 27) {
                if (c(4)) {
                    return null;
                }
                return new w(new q(new c0(0, b(nVar)), c(1), c(8)));
            }
            if (i7 == 36) {
                return new w(new s(new c0(0, b(nVar))));
            }
            if (i7 == 45) {
                return new w(new v());
            }
            if (i7 == 89) {
                return new w(new h((List) nVar.c));
            }
            if (i7 == 172) {
                return new w(new b(nVar.c(), 1, str, "video/mp2t"));
            }
            if (i7 == 257) {
                return new b0(new h6.m("application/vnd.dvb.ait"));
            }
            if (i7 != 138) {
                if (i7 == 139) {
                    return new w(new g(str, nVar.c(), 5408));
                }
                switch (i7) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new w(new e(nVar.c(), str, "video/mp2t", false));
                    case 16:
                        return new w(new n(new c0(1, b(nVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new w(new t(str, nVar.c()));
                    default:
                        switch (i7) {
                            case 128:
                                break;
                            case qs.N1 /* 129 */:
                                return new w(new b(nVar.c(), 0, str, "video/mp2t"));
                            case qs.O1 /* 130 */:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i7) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new b0(new h6.m("application/x-scte35"));
                                    case qs.R1 /* 135 */:
                                        break;
                                    case qs.S1 /* 136 */:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new w(new g(str, nVar.c(), TLObject.FLAG_12));
        }
        return new w(new k(new c0(1, b(nVar)), "video/mp2t"));
    }

    public List b(m6.n nVar) {
        String str;
        int i7;
        List list;
        boolean c10 = c(32);
        List list2 = this.b;
        if (c10) {
            return list2;
        }
        h2.x xVar = new h2.x((byte[]) nVar.d);
        while (xVar.a() > 0) {
            int A = xVar.A();
            int A2 = xVar.b + xVar.A();
            if (A == 134) {
                ArrayList arrayList = new ArrayList();
                int A3 = xVar.A() & 31;
                for (int i10 = 0; i10 < A3; i10++) {
                    String y10 = xVar.y(3, StandardCharsets.UTF_8);
                    int A4 = xVar.A();
                    boolean z9 = (A4 & 128) != 0;
                    if (z9) {
                        i7 = A4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte A5 = (byte) xVar.A();
                    xVar.O(1);
                    if (z9) {
                        boolean z10 = (A5 & 64) != 0;
                        byte[] bArr = h2.g.a;
                        list = Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    e2.t tVar = new e2.t();
                    tVar.r = s0.n(str);
                    tVar.d = y10;
                    tVar.O = i7;
                    tVar.u = list;
                    arrayList.add(new e2.u(tVar));
                }
                list2 = arrayList;
            }
            xVar.N(A2);
        }
        return list2;
    }

    public boolean c(int i7) {
        return (i7 & this.a) != 0;
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
