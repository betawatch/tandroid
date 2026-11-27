// default package

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class f76 implements pc0 {
    public final j99 a;
    public final int b;

    public f76(int i, j99 j99Var) {
        this.b = i;
        this.a = j99Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f76 b(int i, ey7 ey7Var) {
        pc0 rcbVar;
        String str;
        int i2 = 4;
        awd.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = ey7Var.c;
        int i4 = -2;
        int i5 = 0;
        while (ey7Var.a() > 8) {
            int o = ey7Var.o();
            int o2 = ey7Var.b + ey7Var.o();
            ey7Var.M(o2);
            if (o != 1414744396) {
                uc0 uc0Var = null;
                switch (o) {
                    case 1718776947:
                        if (i4 == 2) {
                            ey7Var.O(i2);
                            int o3 = ey7Var.o();
                            int o4 = ey7Var.o();
                            ey7Var.O(i2);
                            int o5 = ey7Var.o();
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
                                jo4 jo4Var = new jo4();
                                jo4Var.z = o3;
                                jo4Var.A = o4;
                                jo4Var.s = eg7.n(str);
                                rcbVar = new rcb(new ko4(jo4Var));
                                break;
                            } else {
                                c00.p(o5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                rcbVar = uc0Var;
                                break;
                            }
                        } else {
                            if (i4 == 1) {
                                int t = ey7Var.t();
                                String str2 = t != 1 ? t != 85 ? t != 255 ? t != 8192 ? t != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int t2 = ey7Var.t();
                                    int o6 = ey7Var.o();
                                    ey7Var.O(6);
                                    int t3 = ey7Var.t();
                                    String str3 = gcc.a;
                                    int F = gcc.F(t3, ByteOrder.LITTLE_ENDIAN);
                                    int t4 = ey7Var.a() > 0 ? ey7Var.t() : 0;
                                    jo4 jo4Var2 = new jo4();
                                    jo4Var2.s = eg7.n(str2);
                                    jo4Var2.M = t2;
                                    jo4Var2.O = o6;
                                    if (str2.equals("audio/raw") && F != 0) {
                                        jo4Var2.P = F;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && t4 > 0) {
                                        byte[] bArr = new byte[t4];
                                        ey7Var.k(0, t4, bArr);
                                        jo4Var2.v = po5.u(bArr);
                                    }
                                    rcbVar = new rcb(new ko4(jo4Var2));
                                    break;
                                } else {
                                    c00.p(t, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                efd.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(gcc.K(i4)));
                            }
                            rcbVar = uc0Var;
                        }
                    case 1751742049:
                        int o7 = ey7Var.o();
                        ey7Var.O(8);
                        int o8 = ey7Var.o();
                        int o9 = ey7Var.o();
                        ey7Var.O(i2);
                        ey7Var.o();
                        ey7Var.O(12);
                        rcbVar = new tc0(o7, o8, o9);
                        break;
                    case 1752331379:
                        int o10 = ey7Var.o();
                        ey7Var.O(12);
                        ey7Var.o();
                        int o11 = ey7Var.o();
                        int o12 = ey7Var.o();
                        ey7Var.O(i2);
                        int o13 = ey7Var.o();
                        int o14 = ey7Var.o();
                        ey7Var.O(i2);
                        uc0Var = new uc0(o10, o11, o12, o13, o14, ey7Var.o());
                        rcbVar = uc0Var;
                        break;
                    case 1852994675:
                        rcbVar = new tcb(ey7Var.y(ey7Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        rcbVar = uc0Var;
                        break;
                }
            } else {
                rcbVar = b(ey7Var.o(), ey7Var);
            }
            if (rcbVar != null) {
                if (rcbVar.getType() == 1752331379) {
                    i4 = ((uc0) rcbVar).a();
                }
                int i6 = i5 + 1;
                int b = io5.b(objArr.length, i6);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i5] = rcbVar;
                i5 = i6;
            }
            ey7Var.N(o2);
            ey7Var.M(i3);
            i2 = 4;
        }
        return new f76(i, po5.o(i5, objArr));
    }

    public final pc0 a(Class cls) {
        no5 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            pc0 pc0Var = (pc0) listIterator.next();
            if (pc0Var.getClass() == cls) {
                return pc0Var;
            }
        }
        return null;
    }

    @Override // pc0
    public final int getType() {
        return this.b;
    }
}
