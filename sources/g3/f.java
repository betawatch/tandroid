package g3;

import d2.u;
import d2.u0;
import d2.v;
import g2.n0;
import g2.y;
import g9.c0;
import g9.g0;
import g9.i0;
import g9.o;
import g9.s1;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements a {
    public final i0 a;
    public final int b;

    public f(int i3, s1 s1Var) {
        this.b = i3;
        this.a = s1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i3, y yVar) {
        a gVar;
        String str;
        int i10 = 4;
        o.g(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = yVar.c;
        int i12 = -2;
        int i13 = 0;
        while (yVar.a() > 8) {
            int o10 = yVar.o();
            int o11 = yVar.b + yVar.o();
            yVar.M(o11);
            if (o10 != 1414744396) {
                d dVar = null;
                switch (o10) {
                    case 1718776947:
                        if (i12 == 2) {
                            yVar.O(i10);
                            int o12 = yVar.o();
                            int o13 = yVar.o();
                            yVar.O(i10);
                            int o14 = yVar.o();
                            switch (o14) {
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
                                u uVar = new u();
                                uVar.y = o12;
                                uVar.z = o13;
                                uVar.r = u0.n(str);
                                gVar = new g(new v(uVar));
                                break;
                            } else {
                                com.google.android.recaptcha.internal.a.o(o14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i12 == 1) {
                                int t10 = yVar.t();
                                String str2 = t10 != 1 ? t10 != 85 ? t10 != 255 ? t10 != 8192 ? t10 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int t11 = yVar.t();
                                    int o15 = yVar.o();
                                    yVar.O(6);
                                    int t12 = yVar.t();
                                    String str3 = n0.a;
                                    int D = n0.D(t12, ByteOrder.LITTLE_ENDIAN);
                                    int t13 = yVar.a() > 0 ? yVar.t() : 0;
                                    u uVar2 = new u();
                                    uVar2.r = u0.n(str2);
                                    uVar2.J = t11;
                                    uVar2.K = o15;
                                    if (str2.equals("audio/raw") && D != 0) {
                                        uVar2.L = D;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && t13 > 0) {
                                        byte[] bArr = new byte[t13];
                                        yVar.k(0, t13, bArr);
                                        uVar2.u = i0.u(bArr);
                                    }
                                    gVar = new g(new v(uVar2));
                                    break;
                                } else {
                                    com.google.android.recaptcha.internal.a.o(t10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                g2.a.l("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + n0.I(i12));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int o16 = yVar.o();
                        yVar.O(8);
                        int o17 = yVar.o();
                        int o18 = yVar.o();
                        yVar.O(i10);
                        yVar.o();
                        yVar.O(12);
                        gVar = new c(o16, o17, o18);
                        break;
                    case 1752331379:
                        int o19 = yVar.o();
                        yVar.O(12);
                        yVar.o();
                        int o20 = yVar.o();
                        int o21 = yVar.o();
                        yVar.O(i10);
                        int o22 = yVar.o();
                        int o23 = yVar.o();
                        yVar.O(i10);
                        dVar = new d(o19, o20, o21, o22, o23, yVar.o());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(yVar.y(yVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(yVar.o(), yVar);
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
            yVar.N(o11);
            yVar.M(i11);
            i10 = 4;
        }
        return new f(i3, i0.o(i13, objArr));
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

    @Override // g3.a
    public final int getType() {
        return this.b;
    }
}
