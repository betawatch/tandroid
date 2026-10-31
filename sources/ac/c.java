package ac;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class c {
    public static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(b4.d dVar, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (dVar.d() < 11) {
                throw vb.c.a();
            }
            int f7 = dVar.f(11);
            sb2.append(f(f7 / 45));
            sb2.append(f(f7 % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (dVar.d() < 6) {
                throw vb.c.a();
            }
            sb2.append(f(dVar.f(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
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
    public static void b(b4.d dVar, StringBuilder sb2, int i10, wb.c cVar, ArrayList arrayList) {
        Charset forName;
        boolean z10;
        byte b10;
        if (i10 * 8 > dVar.d()) {
            throw vb.c.a();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) dVar.f(8);
        }
        if (cVar == null) {
            Charset charset = wb.h.b;
            boolean z11 = true;
            if (i10 <= 2 || !(((b10 = bArr[0]) == -2 && bArr[1] == -1) || (b10 == -1 && bArr[1] == -2))) {
                boolean z12 = charset != null;
                boolean z13 = i10 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
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
                int i23 = 0;
                boolean z14 = z12;
                boolean z15 = true;
                while (i15 < i10 && (z11 || z14 || z15)) {
                    Charset charset2 = charset;
                    byte b11 = bArr[i15];
                    boolean z16 = z11;
                    int i24 = b11 & 255;
                    if (z15) {
                        if (i16 <= 0) {
                            z10 = z15;
                            if ((b11 & 128) != 0) {
                                if ((b11 & 64) != 0) {
                                    int i25 = i16 + 1;
                                    if ((b11 & 32) == 0) {
                                        i18++;
                                    } else {
                                        i25 = i16 + 2;
                                        if ((b11 & 16) == 0) {
                                            i19++;
                                        } else {
                                            i16 += 3;
                                            if ((b11 & 8) == 0) {
                                                i20++;
                                            }
                                        }
                                    }
                                    i16 = i25;
                                }
                            }
                        } else if ((b11 & 128) != 0) {
                            i16--;
                            if (z16) {
                                if (i24 > 127 && i24 < 160) {
                                    z16 = false;
                                } else if (i24 > 159 && (i24 < 192 || i24 == 215 || i24 == 247)) {
                                    i21++;
                                }
                            }
                            if (z14) {
                                if (i17 > 0) {
                                    if (i24 >= 64 && i24 != 127 && i24 <= 252) {
                                        i17--;
                                    }
                                    z14 = false;
                                } else {
                                    if (i24 != 128 && i24 != 160 && i24 <= 239) {
                                        if (i24 <= 160 || i24 >= 224) {
                                            if (i24 > 127) {
                                                i17++;
                                                int i26 = i22 + 1;
                                                if (i26 > i13) {
                                                    i13 = i26;
                                                    i22 = i13;
                                                } else {
                                                    i22 = i26;
                                                }
                                            } else {
                                                i22 = 0;
                                            }
                                            i23 = 0;
                                        } else {
                                            i14++;
                                            int i27 = i23 + 1;
                                            if (i27 > i11) {
                                                i11 = i27;
                                                i23 = i11;
                                            } else {
                                                i23 = i27;
                                            }
                                            i22 = 0;
                                        }
                                    }
                                    z14 = false;
                                }
                            }
                            i15++;
                            charset = charset2;
                            z11 = z16;
                        }
                        z15 = false;
                        if (z16) {
                        }
                        if (z14) {
                        }
                        i15++;
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
                    i15++;
                    charset = charset2;
                    z11 = z16;
                }
                Charset charset3 = charset;
                boolean z17 = z11;
                boolean z18 = z15;
                boolean z19 = (!z18 || i16 <= 0) ? z18 : false;
                boolean z20 = (!z14 || i17 <= 0) ? z14 : false;
                if (!z19 || (!z13 && i18 + i19 + i20 <= 0)) {
                    if (!z20 || (!wb.h.d && i11 < 3 && i13 < 3)) {
                        if (z17 && z20) {
                            if ((i11 != 2 || i14 != 2) && i21 * 10 < i10) {
                                forName = StandardCharsets.ISO_8859_1;
                            }
                        } else if (z17) {
                            forName = StandardCharsets.ISO_8859_1;
                        } else if (!z20) {
                            forName = z19 ? StandardCharsets.UTF_8 : wb.h.a;
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

    public static void c(b4.d dVar, StringBuilder sb2, int i10) {
        if (wb.h.c == null) {
            throw vb.c.a();
        }
        if (i10 * 13 > dVar.d()) {
            throw vb.c.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int f7 = dVar.f(13);
            int i12 = (f7 % 96) | ((f7 / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) ((i13 >> 8) & zs.e4);
            bArr[i11 + 1] = (byte) (i13 & zs.e4);
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, wb.h.c));
    }

    public static void d(b4.d dVar, StringBuilder sb2, int i10) {
        if (wb.h.b == null) {
            throw vb.c.a();
        }
        if (i10 * 13 > dVar.d()) {
            throw vb.c.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int f7 = dVar.f(13);
            int i12 = (f7 % zs.W2) | ((f7 / zs.W2) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, wb.h.b));
    }

    public static void e(b4.d dVar, StringBuilder sb2, int i10) {
        while (i10 >= 3) {
            if (dVar.d() < 10) {
                throw vb.c.a();
            }
            int f7 = dVar.f(10);
            if (f7 >= 1000) {
                throw vb.c.a();
            }
            sb2.append(f(f7 / 100));
            sb2.append(f((f7 / 10) % 10));
            sb2.append(f(f7 % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (dVar.d() < 7) {
                throw vb.c.a();
            }
            int f10 = dVar.f(7);
            if (f10 >= 100) {
                throw vb.c.a();
            }
            sb2.append(f(f10 / 10));
            sb2.append(f(f10 % 10));
            return;
        }
        if (i10 == 1) {
            if (dVar.d() < 4) {
                throw vb.c.a();
            }
            int f11 = dVar.f(4);
            if (f11 >= 10) {
                throw vb.c.a();
            }
            sb2.append(f(f11));
        }
    }

    public static char f(int i10) {
        char[] cArr = a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw vb.c.a();
    }
}
