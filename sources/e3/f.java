package e3;

import b2.v;
import b2.v0;
import b2.w;
import e2.m0;
import e2.x;
import e9.h0;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class f implements a {
    public final n0 a;
    public final int b;

    public f(int i10, x1 x1Var) {
        this.b = i10;
        this.a = x1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i10, x xVar) {
        a gVar;
        String str;
        int i11 = 4;
        s.f(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = xVar.c;
        int i13 = -2;
        int i14 = 0;
        while (xVar.a() > 8) {
            int o10 = xVar.o();
            int o11 = xVar.b + xVar.o();
            xVar.M(o11);
            if (o10 != 1414744396) {
                d dVar = null;
                switch (o10) {
                    case 1718776947:
                        if (i13 == 2) {
                            xVar.O(i11);
                            int o12 = xVar.o();
                            int o13 = xVar.o();
                            xVar.O(i11);
                            int o14 = xVar.o();
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
                                    str = MediaController.VIDEO_MIME_TYPE;
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
                                v vVar = new v();
                                vVar.y = o12;
                                vVar.z = o13;
                                vVar.r = v0.n(str);
                                gVar = new g(new w(vVar));
                                break;
                            } else {
                                a1.g.x(o14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i13 == 1) {
                                int t10 = xVar.t();
                                String str2 = t10 != 1 ? t10 != 85 ? t10 != 255 ? t10 != 8192 ? t10 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : MediaController.AUDIO_MIME_TYPE : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int t11 = xVar.t();
                                    int o15 = xVar.o();
                                    xVar.O(6);
                                    int t12 = xVar.t();
                                    String str3 = m0.a;
                                    int D = m0.D(t12, ByteOrder.LITTLE_ENDIAN);
                                    int t13 = xVar.a() > 0 ? xVar.t() : 0;
                                    v vVar2 = new v();
                                    vVar2.r = v0.n(str2);
                                    vVar2.J = t11;
                                    vVar2.K = o15;
                                    if (str2.equals("audio/raw") && D != 0) {
                                        vVar2.L = D;
                                    }
                                    if (str2.equals(MediaController.AUDIO_MIME_TYPE) && t13 > 0) {
                                        byte[] bArr = new byte[t13];
                                        xVar.k(0, t13, bArr);
                                        vVar2.u = n0.y(bArr);
                                    }
                                    gVar = new g(new w(vVar2));
                                    break;
                                } else {
                                    a1.g.x(t10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                e2.a.l("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + m0.I(i13));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int o16 = xVar.o();
                        xVar.O(8);
                        int o17 = xVar.o();
                        int o18 = xVar.o();
                        xVar.O(i11);
                        xVar.o();
                        xVar.O(12);
                        gVar = new c(o16, o17, o18);
                        break;
                    case 1752331379:
                        int o19 = xVar.o();
                        xVar.O(12);
                        xVar.o();
                        int o20 = xVar.o();
                        int o21 = xVar.o();
                        xVar.O(i11);
                        int o22 = xVar.o();
                        int o23 = xVar.o();
                        xVar.O(i11);
                        dVar = new d(o19, o20, o21, o22, o23, xVar.o());
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
                    i13 = ((d) gVar).a();
                }
                int i15 = i14 + 1;
                int b10 = h0.b(objArr.length, i15);
                if (b10 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b10);
                }
                objArr[i14] = gVar;
                i14 = i15;
            }
            xVar.N(o11);
            xVar.M(i12);
            i11 = 4;
        }
        return new f(i10, n0.s(i14, objArr));
    }

    public final a a(Class cls) {
        l0 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // e3.a
    public final int getType() {
        return this.b;
    }
}
