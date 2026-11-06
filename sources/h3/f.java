package h3;

import e2.s0;
import e2.t;
import e2.u;
import h2.m0;
import h2.x;
import h9.c0;
import h9.g0;
import h9.i0;
import h9.o;
import h9.t1;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f implements a {
    public final i0 a;
    public final int b;

    public f(int i7, t1 t1Var) {
        this.b = i7;
        this.a = t1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i7, x xVar) {
        a gVar;
        String str;
        int i10 = 4;
        o.g(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = xVar.c;
        int i12 = -2;
        int i13 = 0;
        while (xVar.a() > 8) {
            int o4 = xVar.o();
            int o10 = xVar.b + xVar.o();
            xVar.M(o10);
            if (o4 != 1414744396) {
                d dVar = null;
                switch (o4) {
                    case 1718776947:
                        if (i12 == 2) {
                            xVar.O(i10);
                            int o11 = xVar.o();
                            int o12 = xVar.o();
                            xVar.O(i10);
                            int o13 = xVar.o();
                            switch (o13) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                t tVar = new t();
                                tVar.y = o11;
                                tVar.z = o12;
                                tVar.r = s0.n(str);
                                gVar = new g(new u(tVar));
                                break;
                            } else {
                                com.google.android.recaptcha.internal.a.o(o13, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i12 == 1) {
                                int t6 = xVar.t();
                                String str2 = t6 != 1 ? t6 != 85 ? t6 != 255 ? t6 != 8192 ? t6 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int t10 = xVar.t();
                                    int o14 = xVar.o();
                                    xVar.O(6);
                                    int t11 = xVar.t();
                                    String str3 = m0.a;
                                    int D = m0.D(t11, ByteOrder.LITTLE_ENDIAN);
                                    int t12 = xVar.a() > 0 ? xVar.t() : 0;
                                    t tVar2 = new t();
                                    tVar2.r = s0.n(str2);
                                    tVar2.J = t10;
                                    tVar2.K = o14;
                                    if (str2.equals("audio/raw") && D != 0) {
                                        tVar2.L = D;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && t12 > 0) {
                                        byte[] bArr = new byte[t12];
                                        xVar.k(0, t12, bArr);
                                        tVar2.u = i0.u(bArr);
                                    }
                                    gVar = new g(new u(tVar2));
                                    break;
                                } else {
                                    com.google.android.recaptcha.internal.a.o(t6, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                h2.a.l("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + m0.I(i12));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int o15 = xVar.o();
                        xVar.O(8);
                        int o16 = xVar.o();
                        int o17 = xVar.o();
                        xVar.O(i10);
                        xVar.o();
                        xVar.O(12);
                        gVar = new c(o15, o16, o17);
                        break;
                    case 1752331379:
                        int o18 = xVar.o();
                        xVar.O(12);
                        xVar.o();
                        int o19 = xVar.o();
                        int o20 = xVar.o();
                        xVar.O(i10);
                        int o21 = xVar.o();
                        int o22 = xVar.o();
                        xVar.O(i10);
                        dVar = new d(o18, o19, o20, o21, o22, xVar.o());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(xVar.y(xVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(xVar.o(), xVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    i12 = ((d) gVar).a();
                }
                int i14 = i13 + 1;
                int b10 = c0.b(objArr.length, i14);
                if (b10 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b10);
                }
                objArr[i13] = gVar;
                i13 = i14;
            }
            xVar.N(o10);
            xVar.M(i11);
            i10 = 4;
        }
        return new f(i7, i0.o(i13, objArr));
    }

    public final a a(Class cls) {
        g0 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // h3.a
    public final int getType() {
        return this.b;
    }
}
