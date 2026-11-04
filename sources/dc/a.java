package dc;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.telegram.messenger.hs;
import zb.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a {
    public static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(d4.d dVar, StringBuilder sb2, int i3, boolean z10) {
        while (i3 > 1) {
            if (dVar.d() < 11) {
                throw yb.c.a();
            }
            int f10 = dVar.f(11);
            sb2.append(f(f10 / 45));
            sb2.append(f(f10 % 45));
            i3 -= 2;
        }
        if (i3 == 1) {
            if (dVar.d() < 6) {
                throw yb.c.a();
            }
            sb2.append(f(dVar.f(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i10 = length + 1;
                        if (sb2.charAt(i10) == '%') {
                            sb2.deleteCharAt(i10);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(d4.d dVar, StringBuilder sb2, int i3, zb.c cVar, ArrayList arrayList) {
        Charset forName;
        boolean z10;
        byte b10;
        if (i3 * 8 > dVar.d()) {
            throw yb.c.a();
        }
        byte[] bArr = new byte[i3];
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            bArr[i11] = (byte) dVar.f(8);
        }
        if (cVar == null) {
            Charset charset = h.b;
            boolean z11 = true;
            if (i3 <= 2 || !(((b10 = bArr[0]) == -2 && bArr[1] == -1) || (b10 == -1 && bArr[1] == -2))) {
                boolean z12 = charset != null;
                boolean z13 = i3 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                boolean z14 = z12;
                boolean z15 = true;
                while (i14 < i3 && (z11 || z14 || z15)) {
                    Charset charset2 = charset;
                    byte b11 = bArr[i14];
                    boolean z16 = z11;
                    int i23 = b11 & 255;
                    if (z15) {
                        if (i15 <= 0) {
                            z10 = z15;
                            if ((b11 & 128) != 0) {
                                if ((b11 & 64) != 0) {
                                    int i24 = i15 + 1;
                                    if ((b11 & 32) == 0) {
                                        i17++;
                                    } else {
                                        i24 = i15 + 2;
                                        if ((b11 & 16) == 0) {
                                            i18++;
                                        } else {
                                            i15 += 3;
                                            if ((b11 & 8) == 0) {
                                                i19++;
                                            }
                                        }
                                    }
                                    i15 = i24;
                                }
                            }
                        } else if ((b11 & 128) != 0) {
                            i15--;
                            if (z16) {
                                if (i23 > 127 && i23 < 160) {
                                    z16 = false;
                                } else if (i23 > 159 && (i23 < 192 || i23 == 215 || i23 == 247)) {
                                    i20++;
                                }
                            }
                            if (z14) {
                                if (i16 > 0) {
                                    if (i23 >= 64 && i23 != 127 && i23 <= 252) {
                                        i16--;
                                    }
                                    z14 = false;
                                } else {
                                    if (i23 != 128 && i23 != 160 && i23 <= 239) {
                                        if (i23 <= 160 || i23 >= 224) {
                                            if (i23 > 127) {
                                                i16++;
                                                int i25 = i21 + 1;
                                                if (i25 > i12) {
                                                    i12 = i25;
                                                    i21 = i12;
                                                } else {
                                                    i21 = i25;
                                                }
                                            } else {
                                                i21 = 0;
                                            }
                                            i22 = 0;
                                        } else {
                                            i13++;
                                            int i26 = i22 + 1;
                                            if (i26 > i10) {
                                                i10 = i26;
                                                i22 = i10;
                                            } else {
                                                i22 = i26;
                                            }
                                            i21 = 0;
                                        }
                                    }
                                    z14 = false;
                                }
                            }
                            i14++;
                            charset = charset2;
                            z11 = z16;
                        }
                        z15 = false;
                        if (z16) {
                        }
                        if (z14) {
                        }
                        i14++;
                        charset = charset2;
                        z11 = z16;
                    } else {
                        z10 = z15;
                    }
                    z15 = z10;
                    if (z16) {
                    }
                    if (z14) {
                    }
                    i14++;
                    charset = charset2;
                    z11 = z16;
                }
                Charset charset3 = charset;
                boolean z17 = z11;
                boolean z18 = z15;
                boolean z19 = (!z18 || i15 <= 0) ? z18 : false;
                boolean z20 = (!z14 || i16 <= 0) ? z14 : false;
                if (!z19 || (!z13 && i17 + i18 + i19 <= 0)) {
                    if (!z20 || (!h.d && i10 < 3 && i12 < 3)) {
                        if (z17 && z20) {
                            if ((i10 != 2 || i13 != 2) && i20 * 10 < i3) {
                                forName = StandardCharsets.ISO_8859_1;
                            }
                        } else if (z17) {
                            forName = StandardCharsets.ISO_8859_1;
                        } else if (!z20) {
                            forName = z19 ? StandardCharsets.UTF_8 : h.a;
                        }
                    }
                    forName = charset3;
                } else {
                    forName = StandardCharsets.UTF_8;
                }
            } else {
                forName = StandardCharsets.UTF_16;
            }
        } else {
            forName = Charset.forName(cVar.name());
        }
        sb2.append(new String(bArr, forName));
        arrayList.add(bArr);
    }

    public static void c(d4.d dVar, StringBuilder sb2, int i3) {
        if (h.c == null) {
            throw yb.c.a();
        }
        if (i3 * 13 > dVar.d()) {
            throw yb.c.a();
        }
        byte[] bArr = new byte[i3 * 2];
        int i10 = 0;
        while (i3 > 0) {
            int f10 = dVar.f(13);
            int i11 = (f10 % 96) | ((f10 / 96) << 8);
            int i12 = i11 + (i11 < 2560 ? 41377 : 42657);
            bArr[i10] = (byte) ((i12 >> 8) & hs.e4);
            bArr[i10 + 1] = (byte) (i12 & hs.e4);
            i10 += 2;
            i3--;
        }
        sb2.append(new String(bArr, h.c));
    }

    public static void d(d4.d dVar, StringBuilder sb2, int i3) {
        if (h.b == null) {
            throw yb.c.a();
        }
        if (i3 * 13 > dVar.d()) {
            throw yb.c.a();
        }
        byte[] bArr = new byte[i3 * 2];
        int i10 = 0;
        while (i3 > 0) {
            int f10 = dVar.f(13);
            int i11 = (f10 % hs.W2) | ((f10 / hs.W2) << 8);
            int i12 = i11 + (i11 < 7936 ? 33088 : 49472);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i3--;
        }
        sb2.append(new String(bArr, h.b));
    }

    public static void e(d4.d dVar, StringBuilder sb2, int i3) {
        while (i3 >= 3) {
            if (dVar.d() < 10) {
                throw yb.c.a();
            }
            int f10 = dVar.f(10);
            if (f10 >= 1000) {
                throw yb.c.a();
            }
            sb2.append(f(f10 / 100));
            sb2.append(f((f10 / 10) % 10));
            sb2.append(f(f10 % 10));
            i3 -= 3;
        }
        if (i3 == 2) {
            if (dVar.d() < 7) {
                throw yb.c.a();
            }
            int f11 = dVar.f(7);
            if (f11 >= 100) {
                throw yb.c.a();
            }
            sb2.append(f(f11 / 10));
            sb2.append(f(f11 % 10));
            return;
        }
        if (i3 == 1) {
            if (dVar.d() < 4) {
                throw yb.c.a();
            }
            int f12 = dVar.f(4);
            if (f12 >= 10) {
                throw yb.c.a();
            }
            sb2.append(f(f12));
        }
    }

    public static char f(int i3) {
        char[] cArr = a;
        if (i3 < cArr.length) {
            return cArr[i3];
        }
        throw yb.c.a();
    }
}
