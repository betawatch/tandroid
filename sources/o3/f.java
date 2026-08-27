package o3;

import d5.g0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import org.telegram.messenger.MediaController;
import p8.l;
import p8.l0;
import p8.w;
import p8.x;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements a {
    public final z a;
    public final int b;

    public f(int i10, l0 l0Var) {
        this.b = i10;
        this.a = l0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i10, d5.z zVar) {
        a gVar;
        String str;
        int i11 = 4;
        l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = zVar.c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (zVar.a() > 8) {
            int g10 = zVar.g();
            int g11 = zVar.b + zVar.g();
            zVar.B(g11);
            if (g10 != 1414744396) {
                d dVar = null;
                switch (g10) {
                    case 1718776947:
                        if (i14 == 2) {
                            zVar.D(i11);
                            int g12 = zVar.g();
                            int g13 = zVar.g();
                            zVar.D(i11);
                            int g14 = zVar.g();
                            switch (g14) {
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
                                s0 s0Var = new s0();
                                s0Var.t = g12;
                                s0Var.u = g13;
                                s0Var.o = str;
                                gVar = new g(new t0(s0Var));
                                break;
                            } else {
                                com.google.android.recaptcha.internal.a.s(g14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int k10 = zVar.k();
                                String str2 = k10 != 1 ? k10 != 85 ? k10 != 255 ? k10 != 8192 ? k10 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : MediaController.AUDIO_MIME_TYPE : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int k11 = zVar.k();
                                    int g15 = zVar.g();
                                    zVar.D(6);
                                    int u10 = g0.u(zVar.w());
                                    int k12 = zVar.k();
                                    byte[] bArr = new byte[k12];
                                    zVar.c(i13, k12, bArr);
                                    s0 s0Var2 = new s0();
                                    s0Var2.o = str2;
                                    s0Var2.B = k11;
                                    s0Var2.C = g15;
                                    if ("audio/raw".equals(str2) && u10 != 0) {
                                        s0Var2.D = u10;
                                    }
                                    if (MediaController.AUDIO_MIME_TYPE.equals(str2) && k12 > 0) {
                                        s0Var2.q = z.y(bArr);
                                    }
                                    gVar = new g(new t0(s0Var2));
                                    break;
                                } else {
                                    com.google.android.recaptcha.internal.a.s(k10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                d5.a.K("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + g0.B(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int g16 = zVar.g();
                        zVar.D(8);
                        int g17 = zVar.g();
                        int g18 = zVar.g();
                        zVar.D(i11);
                        zVar.g();
                        zVar.D(12);
                        gVar = new c(g16, g17, g18);
                        break;
                    case 1752331379:
                        int g19 = zVar.g();
                        zVar.D(12);
                        zVar.g();
                        int g20 = zVar.g();
                        int g21 = zVar.g();
                        zVar.D(i11);
                        int g22 = zVar.g();
                        int g23 = zVar.g();
                        zVar.D(8);
                        dVar = new d(g19, g20, g21, g22, g23);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(zVar.p(zVar.a(), o8.d.c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(zVar.g(), zVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i16 = ((d) gVar).a;
                    if (i16 == 1935960438) {
                        i14 = 2;
                    } else if (i16 == 1935963489) {
                        i14 = 1;
                    } else if (i16 != 1937012852) {
                        d5.a.K("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i16));
                        i14 = -1;
                    } else {
                        i14 = 3;
                    }
                }
                int i17 = i15 + 1;
                if (objArr.length < i17) {
                    objArr = Arrays.copyOf(objArr, w.d(objArr.length, i17));
                }
                objArr[i15] = gVar;
                i15 = i17;
            }
            zVar.C(g11);
            zVar.B(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i10, z.s(i15, objArr));
    }

    public final a a(Class cls) {
        x listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // o3.a
    public final int getType() {
        return this.b;
    }
}
