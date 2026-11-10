package gc;

import cc.j;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class a {
    public static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(cc.c cVar, StringBuilder sb2, int i7, boolean z9) {
        while (i7 > 1) {
            if (cVar.d() < 11) {
                throw bc.c.a();
            }
            int f10 = cVar.f(11);
            sb2.append(f(f10 / 45));
            sb2.append(f(f10 % 45));
            i7 -= 2;
        }
        if (i7 == 1) {
            if (cVar.d() < 6) {
                throw bc.c.a();
            }
            sb2.append(f(cVar.f(6)));
        }
        if (z9) {
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
    public static void b(cc.c cVar, StringBuilder sb2, int i7, cc.d dVar, ArrayList arrayList) {
        Charset forName;
        boolean z9;
        byte b10;
        if (i7 * 8 > cVar.d()) {
            throw bc.c.a();
        }
        byte[] bArr = new byte[i7];
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            bArr[i11] = (byte) cVar.f(8);
        }
        if (dVar == null) {
            Charset charset = j.b;
            boolean z10 = true;
            if (i7 <= 2 || !(((b10 = bArr[0]) == -2 && bArr[1] == -1) || (b10 == -1 && bArr[1] == -2))) {
                boolean z11 = charset != null;
                boolean z12 = i7 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
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
                boolean z13 = z11;
                boolean z14 = true;
                while (i14 < i7 && (z10 || z13 || z14)) {
                    Charset charset2 = charset;
                    byte b11 = bArr[i14];
                    boolean z15 = z10;
                    int i23 = b11 & 255;
                    if (z14) {
                        if (i15 <= 0) {
                            z9 = z14;
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
                            if (z15) {
                                if (i23 > 127 && i23 < 160) {
                                    z15 = false;
                                } else if (i23 > 159 && (i23 < 192 || i23 == 215 || i23 == 247)) {
                                    i20++;
                                }
                            }
                            if (z13) {
                                if (i16 > 0) {
                                    if (i23 >= 64 && i23 != 127 && i23 <= 252) {
                                        i16--;
                                    }
                                    z13 = false;
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
                                    z13 = false;
                                }
                            }
                            i14++;
                            charset = charset2;
                            z10 = z15;
                        }
                        z14 = false;
                        if (z15) {
                        }
                        if (z13) {
                        }
                        i14++;
                        charset = charset2;
                        z10 = z15;
                    } else {
                        z9 = z14;
                    }
                    z14 = z9;
                    if (z15) {
                    }
                    if (z13) {
                    }
                    i14++;
                    charset = charset2;
                    z10 = z15;
                }
                Charset charset3 = charset;
                boolean z16 = z10;
                boolean z17 = z14;
                boolean z18 = (!z17 || i15 <= 0) ? z17 : false;
                boolean z19 = (!z13 || i16 <= 0) ? z13 : false;
                if (!z18 || (!z12 && i17 + i18 + i19 <= 0)) {
                    if (!z19 || (!j.d && i10 < 3 && i12 < 3)) {
                        if (z16 && z19) {
                            if ((i10 != 2 || i13 != 2) && i20 * 10 < i7) {
                                forName = StandardCharsets.ISO_8859_1;
                            }
                        } else if (z16) {
                            forName = StandardCharsets.ISO_8859_1;
                        } else if (!z19) {
                            forName = z18 ? StandardCharsets.UTF_8 : j.a;
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
            forName = Charset.forName(dVar.name());
        }
        sb2.append(new String(bArr, forName));
        arrayList.add(bArr);
    }

    public static void c(cc.c cVar, StringBuilder sb2, int i7) {
        if (j.c == null) {
            throw bc.c.a();
        }
        if (i7 * 13 > cVar.d()) {
            throw bc.c.a();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int f10 = cVar.f(13);
            int i11 = (f10 % 96) | ((f10 / 96) << 8);
            int i12 = i11 + (i11 < 2560 ? 41377 : 42657);
            bArr[i10] = (byte) ((i12 >> 8) & qs.e4);
            bArr[i10 + 1] = (byte) (i12 & qs.e4);
            i10 += 2;
            i7--;
        }
        sb2.append(new String(bArr, j.c));
    }

    public static void d(cc.c cVar, StringBuilder sb2, int i7) {
        if (j.b == null) {
            throw bc.c.a();
        }
        if (i7 * 13 > cVar.d()) {
            throw bc.c.a();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int f10 = cVar.f(13);
            int i11 = (f10 % qs.W2) | ((f10 / qs.W2) << 8);
            int i12 = i11 + (i11 < 7936 ? 33088 : 49472);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i7--;
        }
        sb2.append(new String(bArr, j.b));
    }

    public static void e(cc.c cVar, StringBuilder sb2, int i7) {
        while (i7 >= 3) {
            if (cVar.d() < 10) {
                throw bc.c.a();
            }
            int f10 = cVar.f(10);
            if (f10 >= 1000) {
                throw bc.c.a();
            }
            sb2.append(f(f10 / 100));
            sb2.append(f((f10 / 10) % 10));
            sb2.append(f(f10 % 10));
            i7 -= 3;
        }
        if (i7 == 2) {
            if (cVar.d() < 7) {
                throw bc.c.a();
            }
            int f11 = cVar.f(7);
            if (f11 >= 100) {
                throw bc.c.a();
            }
            sb2.append(f(f11 / 10));
            sb2.append(f(f11 % 10));
            return;
        }
        if (i7 == 1) {
            if (cVar.d() < 4) {
                throw bc.c.a();
            }
            int f12 = cVar.f(4);
            if (f12 >= 10) {
                throw bc.c.a();
            }
            sb2.append(f(f12));
        }
    }

    public static char f(int i7) {
        char[] cArr = a;
        if (i7 < cArr.length) {
            return cArr[i7];
        }
        throw bc.c.a();
    }
}
