// default package

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b76 implements nd0 {
    public final y79 a;
    public final int b;

    public b76(int i, y79 y79Var) {
        this.b = i;
        this.a = y79Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b76 b(int i, yw7 yw7Var) {
        nd0 uabVar;
        String str;
        int i2 = 4;
        ntd.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = yw7Var.c;
        int i4 = -2;
        int i5 = 0;
        while (yw7Var.a() > 8) {
            int o = yw7Var.o();
            int o2 = yw7Var.b + yw7Var.o();
            yw7Var.M(o2);
            if (o != 1414744396) {
                sd0 sd0Var = null;
                switch (o) {
                    case 1718776947:
                        if (i4 == 2) {
                            yw7Var.O(i2);
                            int o3 = yw7Var.o();
                            int o4 = yw7Var.o();
                            yw7Var.O(i2);
                            int o5 = yw7Var.o();
                            switch (o5) {
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
                                fo4 fo4Var = new fo4();
                                fo4Var.z = o3;
                                fo4Var.A = o4;
                                fo4Var.s = wf7.n(str);
                                uabVar = new uab(new go4(fo4Var));
                                break;
                            } else {
                                b10.o(o5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                uabVar = sd0Var;
                                break;
                            }
                        } else {
                            if (i4 == 1) {
                                int t = yw7Var.t();
                                String str2 = t != 1 ? t != 85 ? t != 255 ? t != 8192 ? t != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int t2 = yw7Var.t();
                                    int o6 = yw7Var.o();
                                    yw7Var.O(6);
                                    int t3 = yw7Var.t();
                                    String str3 = hac.a;
                                    int F = hac.F(t3, ByteOrder.LITTLE_ENDIAN);
                                    int t4 = yw7Var.a() > 0 ? yw7Var.t() : 0;
                                    fo4 fo4Var2 = new fo4();
                                    fo4Var2.s = wf7.n(str2);
                                    fo4Var2.M = t2;
                                    fo4Var2.O = o6;
                                    if (str2.equals("audio/raw") && F != 0) {
                                        fo4Var2.P = F;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && t4 > 0) {
                                        byte[] bArr = new byte[t4];
                                        yw7Var.k(0, t4, bArr);
                                        fo4Var2.v = mo5.u(bArr);
                                    }
                                    uabVar = new uab(new go4(fo4Var2));
                                    break;
                                } else {
                                    b10.o(t, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                ncd.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(hac.K(i4)));
                            }
                            uabVar = sd0Var;
                        }
                    case 1751742049:
                        int o7 = yw7Var.o();
                        yw7Var.O(8);
                        int o8 = yw7Var.o();
                        int o9 = yw7Var.o();
                        yw7Var.O(i2);
                        yw7Var.o();
                        yw7Var.O(12);
                        uabVar = new rd0(o7, o8, o9);
                        break;
                    case 1752331379:
                        int o10 = yw7Var.o();
                        yw7Var.O(12);
                        yw7Var.o();
                        int o11 = yw7Var.o();
                        int o12 = yw7Var.o();
                        yw7Var.O(i2);
                        int o13 = yw7Var.o();
                        int o14 = yw7Var.o();
                        yw7Var.O(i2);
                        sd0Var = new sd0(o10, o11, o12, o13, o14, yw7Var.o());
                        uabVar = sd0Var;
                        break;
                    case 1852994675:
                        uabVar = new wab(yw7Var.y(yw7Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        uabVar = sd0Var;
                        break;
                }
            } else {
                uabVar = b(yw7Var.o(), yw7Var);
            }
            if (uabVar != null) {
                if (uabVar.getType() == 1752331379) {
                    i4 = ((sd0) uabVar).a();
                }
                int i6 = i5 + 1;
                int b = fo5.b(objArr.length, i6);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i5] = uabVar;
                i5 = i6;
            }
            yw7Var.N(o2);
            yw7Var.M(i3);
            i2 = 4;
        }
        return new b76(i, mo5.o(i5, objArr));
    }

    public final nd0 a(Class cls) {
        ko5 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            nd0 nd0Var = (nd0) listIterator.next();
            if (nd0Var.getClass() == cls) {
                return nd0Var;
            }
        }
        return null;
    }

    @Override // nd0
    public final int getType() {
        return this.b;
    }
}
