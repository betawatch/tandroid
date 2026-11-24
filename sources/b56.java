// default package

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class b56 implements nc0 {
    public final w59 a;
    public final int b;

    public b56(int i, w59 w59Var) {
        this.b = i;
        this.a = w59Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b56 b(int i, xu7 xu7Var) {
        nc0 s8bVar;
        String str;
        int i2 = 4;
        krd.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = xu7Var.c;
        int i4 = -2;
        int i5 = 0;
        while (xu7Var.a() > 8) {
            int o = xu7Var.o();
            int o2 = xu7Var.b + xu7Var.o();
            xu7Var.M(o2);
            if (o != 1414744396) {
                sc0 sc0Var = null;
                switch (o) {
                    case 1718776947:
                        if (i4 == 2) {
                            xu7Var.O(i2);
                            int o3 = xu7Var.o();
                            int o4 = xu7Var.o();
                            xu7Var.O(i2);
                            int o5 = xu7Var.o();
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
                                em4 em4Var = new em4();
                                em4Var.z = o3;
                                em4Var.A = o4;
                                em4Var.s = ud7.n(str);
                                s8bVar = new s8b(new fm4(em4Var));
                                break;
                            } else {
                                b00.o(o5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                s8bVar = sc0Var;
                                break;
                            }
                        } else {
                            if (i4 == 1) {
                                int t = xu7Var.t();
                                String str2 = t != 1 ? t != 85 ? t != 255 ? t != 8192 ? t != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int t2 = xu7Var.t();
                                    int o6 = xu7Var.o();
                                    xu7Var.O(6);
                                    int t3 = xu7Var.t();
                                    String str3 = g8c.a;
                                    int F = g8c.F(t3, ByteOrder.LITTLE_ENDIAN);
                                    int t4 = xu7Var.a() > 0 ? xu7Var.t() : 0;
                                    em4 em4Var2 = new em4();
                                    em4Var2.s = ud7.n(str2);
                                    em4Var2.M = t2;
                                    em4Var2.O = o6;
                                    if (str2.equals("audio/raw") && F != 0) {
                                        em4Var2.P = F;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && t4 > 0) {
                                        byte[] bArr = new byte[t4];
                                        xu7Var.k(0, t4, bArr);
                                        em4Var2.v = mm5.u(bArr);
                                    }
                                    s8bVar = new s8b(new fm4(em4Var2));
                                    break;
                                } else {
                                    b00.o(t, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                lad.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(g8c.K(i4)));
                            }
                            s8bVar = sc0Var;
                        }
                    case 1751742049:
                        int o7 = xu7Var.o();
                        xu7Var.O(8);
                        int o8 = xu7Var.o();
                        int o9 = xu7Var.o();
                        xu7Var.O(i2);
                        xu7Var.o();
                        xu7Var.O(12);
                        s8bVar = new rc0(o7, o8, o9);
                        break;
                    case 1752331379:
                        int o10 = xu7Var.o();
                        xu7Var.O(12);
                        xu7Var.o();
                        int o11 = xu7Var.o();
                        int o12 = xu7Var.o();
                        xu7Var.O(i2);
                        int o13 = xu7Var.o();
                        int o14 = xu7Var.o();
                        xu7Var.O(i2);
                        sc0Var = new sc0(o10, o11, o12, o13, o14, xu7Var.o());
                        s8bVar = sc0Var;
                        break;
                    case 1852994675:
                        s8bVar = new u8b(xu7Var.y(xu7Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        s8bVar = sc0Var;
                        break;
                }
            } else {
                s8bVar = b(xu7Var.o(), xu7Var);
            }
            if (s8bVar != null) {
                if (s8bVar.getType() == 1752331379) {
                    i4 = ((sc0) s8bVar).a();
                }
                int i6 = i5 + 1;
                int b = fm5.b(objArr.length, i6);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i5] = s8bVar;
                i5 = i6;
            }
            xu7Var.N(o2);
            xu7Var.M(i3);
            i2 = 4;
        }
        return new b56(i, mm5.o(i5, objArr));
    }

    public final nc0 a(Class cls) {
        km5 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            nc0 nc0Var = (nc0) listIterator.next();
            if (nc0Var.getClass() == cls) {
                return nc0Var;
            }
        }
        return null;
    }

    @Override // nc0
    public final int getType() {
        return this.b;
    }
}
