package mf;

import c3.s;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.g0;
import n4.x;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class m extends kf.a {
    public static final Logger r = Logger.getLogger(m.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0210, code lost:
    
        if (r13 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0214, code lost:
    
        if (r0.f != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0216, code lost:
    
        r2 = r6.A(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021a, code lost:
    
        r15.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024a, code lost:
    
        r2.d.a1(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0220, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0259, code lost:
    
        r2.d.a1(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0264, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0222, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0227, code lost:
    
        if (r12.isLoggable(r5) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0229, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + r10 + ": " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(BufferedInputStream bufferedInputStream, long j3) {
        long j10;
        long j11;
        long j12;
        String str;
        String str2;
        String str3;
        String str4;
        short s10;
        short s11;
        byte b10;
        byte b11;
        byte b12;
        la.h hVar;
        Logger logger;
        nf.a aVar;
        int i10;
        Level level = Level.FINEST;
        this.a = "MP3";
        n nVar = new n(bufferedInputStream);
        nVar.d = 0;
        if (h.b(nVar)) {
            Logger logger2 = h.s;
            h hVar2 = new h();
            if (h.b(nVar)) {
                com.google.firebase.messaging.d dVar = new com.google.firebase.messaging.d((FilterInputStream) nVar);
                i iVar = new i();
                iVar.a = 0;
                iVar.b = 0;
                iVar.c = 0;
                long j13 = dVar.b;
                g0 g0Var = new g0(dVar, 5);
                byte[] bArr = new byte[3];
                int i11 = 0;
                for (int i12 = 3; i11 < i12; i12 = 3) {
                    long j14 = j13;
                    int read = ((com.google.firebase.messaging.d) g0Var.b).read(bArr, i11, 3 - i11);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i11 += read;
                    j13 = j14;
                }
                long j15 = j13;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new c("Invalid ID3 identifier: ".concat(str5));
                }
                byte U0 = g0Var.U0();
                iVar.a = U0;
                if (U0 != 2 && U0 != 3 && U0 != 4) {
                    throw new c(hg.c.h(U0, "Unsupported ID3v2 version: "));
                }
                byte U02 = g0Var.U0();
                byte U03 = g0Var.U0();
                int Y0 = g0Var.Y0();
                iVar.b = Y0 + 10;
                if (U0 == 2) {
                    iVar.d = (U03 & 128) != 0;
                    iVar.e = (U03 & 64) != 0;
                    b11 = U02;
                } else {
                    iVar.d = (U03 & 128) != 0;
                    if ((U03 & 64) == 0) {
                        b11 = U02;
                        b12 = U03;
                    } else if (U0 == 3) {
                        int W0 = g0Var.W0();
                        g0Var.U0();
                        g0Var.U0();
                        g0Var.W0();
                        b11 = U02;
                        b12 = U03;
                        g0Var.a1(W0 - 6);
                    } else {
                        b11 = U02;
                        b12 = U03;
                        g0Var.a1(g0Var.Y0() - 4);
                    }
                    if (U0 >= 4 && (b12 & 16) != 0) {
                        iVar.c = 10;
                        iVar.b = Y0 + 20;
                    }
                }
                int i13 = (int) (dVar.b - j15);
                hVar2.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(U0), Integer.valueOf(b11));
                int i14 = iVar.b;
                if (iVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (U0 >= 4 || !iVar.d) {
                    logger = logger2;
                    hVar = new la.h(nVar, i13, (i14 - i13) - iVar.c, iVar);
                } else {
                    int i15 = i14 - i13;
                    byte[] bArr2 = new byte[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        int read2 = nVar.read(bArr2, i16, i15 - i16);
                        if (read2 <= 0) {
                            throw new EOFException();
                        }
                        i16 += read2;
                    }
                    boolean z10 = false;
                    int i17 = 0;
                    for (int i18 = 0; i18 < i15; i18++) {
                        byte b13 = bArr2[i18];
                        if (!z10 || b13 != 0) {
                            bArr2[i17] = b13;
                            i17++;
                        }
                        z10 = b13 == -1;
                    }
                    hVar = new la.h(new ByteArrayInputStream(bArr2, 0, i17), i13, i17, iVar);
                    logger = logger2;
                }
                g0 g0Var2 = (g0) hVar.d;
                nf.a aVar2 = (nf.a) hVar.b;
                while (true) {
                    try {
                        if (aVar2.e() <= 10) {
                            aVar = aVar2;
                            break;
                        }
                        f fVar = new f(hVar);
                        String str6 = fVar.a;
                        int i19 = fVar.c;
                        aVar = aVar2;
                        int i20 = 0;
                        while (true) {
                            try {
                                if (i20 >= str6.length()) {
                                    if (i19 == 0) {
                                        break;
                                    }
                                } else if (str6.charAt(0) != 0) {
                                    break;
                                } else {
                                    i20++;
                                }
                            } catch (c e7) {
                                e = e7;
                                if (logger.isLoggable(level)) {
                                    logger.log(level, "ID3 exception occured: " + e.getMessage());
                                }
                                g0Var2.a1(aVar.e());
                                i10 = iVar.c;
                                if (i10 > 0) {
                                }
                                this.f = hVar2.f;
                                this.e = hVar2.e;
                                this.d = hVar2.d;
                                this.i = hVar2.i;
                                this.o = hVar2.o;
                                this.p = hVar2.p;
                                this.m = hVar2.m;
                                this.l = hVar2.l;
                                this.k = hVar2.k;
                                this.b = hVar2.b;
                                this.h = hVar2.h;
                                this.n = hVar2.n;
                                this.c = hVar2.c;
                                this.j = hVar2.j;
                                this.g = hVar2.g;
                                j10 = this.b;
                                if (j10 > 0) {
                                }
                                try {
                                    s sVar = new s();
                                    sVar.a = j3 - 128;
                                    this.b = b(nVar, j3, sVar);
                                } catch (j e10) {
                                    Logger logger3 = r;
                                    if (logger3.isLoggable(level)) {
                                        logger3.log(level, "Could not determine MP3 duration", (Throwable) e10);
                                    }
                                }
                                if (this.c == null) {
                                }
                                j11 = nVar.b;
                                j12 = j3 - 128;
                                if (j11 <= j12) {
                                }
                            }
                        }
                        if (i19 <= aVar.e()) {
                            int i21 = 0;
                            while (true) {
                                if (i21 >= str6.length()) {
                                    break;
                                }
                                if ((str6.charAt(i21) < 'A' || str6.charAt(i21) > 'Z') && (str6.charAt(i21) < '0' || str6.charAt(i21) > '9')) {
                                    break;
                                } else {
                                    i21++;
                                }
                            }
                            g0Var2.a1(i19);
                            aVar2 = aVar;
                        } else if (logger.isLoggable(level)) {
                            logger.log(level, "ID3 frame claims to extend frames area");
                        }
                    } catch (c e11) {
                        e = e11;
                        aVar = aVar2;
                    }
                }
                g0Var2.a1(aVar.e());
                i10 = iVar.c;
                if (i10 > 0) {
                    nVar.skip(i10);
                }
            }
            this.f = hVar2.f;
            this.e = hVar2.e;
            this.d = hVar2.d;
            this.i = hVar2.i;
            this.o = hVar2.o;
            this.p = hVar2.p;
            this.m = hVar2.m;
            this.l = hVar2.l;
            this.k = hVar2.k;
            this.b = hVar2.b;
            this.h = hVar2.h;
            this.n = hVar2.n;
            this.c = hVar2.c;
            this.j = hVar2.j;
            this.g = hVar2.g;
        }
        j10 = this.b;
        if (j10 > 0 || j10 >= 3600000) {
            s sVar2 = new s();
            sVar2.a = j3 - 128;
            this.b = b(nVar, j3, sVar2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j11 = nVar.b;
        j12 = j3 - 128;
        if (j11 <= j12) {
            return;
        }
        long j16 = j12 - j11;
        long j17 = 0;
        while (j17 < j16) {
            long skip = nVar.skip(j16 - j17);
            if (skip <= 0) {
                throw new EOFException();
            }
            j17 += skip;
        }
        if (!a.c(bufferedInputStream)) {
            return;
        }
        if (a.c(bufferedInputStream)) {
            byte[] bArr3 = new byte[128];
            int i22 = 0;
            while (i22 < 128) {
                int read3 = bufferedInputStream.read(bArr3, i22, 128 - i22);
                if (read3 <= 0) {
                    throw new EOFException();
                }
                i22 += read3;
            }
            str3 = a.b(3, 30, bArr3);
            str4 = a.b(33, 30, bArr3);
            String b14 = a.b(63, 30, bArr3);
            try {
                s10 = Short.parseShort(a.b(93, 4, bArr3));
            } catch (NumberFormatException unused) {
                s10 = 0;
            }
            str = a.b(97, 30, bArr3);
            int a2 = hg.c.a(bArr3[127]);
            r2 = a2 != 0 ? hg.c.c(a2) : null;
            if (bArr3[125] == 0 && (b10 = bArr3[126]) != 0) {
                s11 = (short) (b10 & 255);
                str2 = r2;
                r2 = b14;
                if (this.f == null) {
                    this.f = r2;
                }
                if (this.d == null) {
                    this.d = str4;
                }
                if (this.i == null) {
                    this.i = str;
                }
                if (this.h == null) {
                    this.h = str2;
                }
                if (this.c == null) {
                    this.c = str3;
                }
                if (this.j == 0) {
                    this.j = s11;
                }
                if (this.g != 0) {
                    this.g = s10;
                    return;
                }
                return;
            }
            str2 = r2;
            r2 = b14;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            s10 = 0;
        }
        s11 = 0;
        if (this.f == null) {
        }
        if (this.d == null) {
        }
        if (this.i == null) {
        }
        if (this.h == null) {
        }
        if (this.c == null) {
        }
        if (this.j == 0) {
        }
        if (this.g != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x00dc, code lost:
    
        if (((r5[5] & 255) | ((r5[4] & 255) << 8)) != r9.a) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0038, code lost:
    
        r22 = 1;
        r19 = 0;
        r21 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0036, code lost:
    
        r18 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(n nVar, long j3, s sVar) {
        int[][] iArr;
        int i10;
        int i11;
        int i12;
        long j10;
        char c10;
        int i13;
        x xVar;
        int i14;
        int i15;
        int read;
        int i16;
        int read2;
        long j11;
        int i17;
        l lVar;
        byte b10;
        int read3;
        s sVar2 = sVar;
        int i18 = -1;
        int read4 = sVar2.a(nVar) ? -1 : nVar.read();
        int i19 = 0;
        while (true) {
            iArr = l.m;
            i10 = 4;
            if (read4 == -1) {
                break;
            }
            if (i19 == 255 && (read4 & 224) == 224) {
                nVar.mark(2);
                int read5 = sVar2.a(nVar) ? -1 : nVar.read();
                if (read5 == -1) {
                    break;
                }
                if (sVar2.a(nVar)) {
                    i11 = 2;
                    read3 = -1;
                } else {
                    i11 = 2;
                    read3 = nVar.read();
                }
                if (read3 == -1) {
                    break;
                }
                j10 = 0;
                l lVar2 = new l(read4, read5, read3);
                nVar.reset();
                nVar.mark(lVar2.b() + 2);
                int b11 = lVar2.b();
                byte[] bArr = new byte[b11];
                bArr[0] = -1;
                bArr[1] = (byte) read4;
                int i20 = b11 - 2;
                int i21 = 0;
                while (i21 < i20) {
                    c10 = 3;
                    try {
                        int read6 = nVar.read(bArr, i11 + i21, i20 - i21);
                        if (read6 <= 0) {
                            throw new EOFException();
                        }
                        i21 += read6;
                    } catch (EOFException unused) {
                        i12 = 1;
                        i13 = 5;
                        xVar = null;
                        if (xVar != null) {
                        }
                    }
                }
                c10 = 3;
                xVar = new x(lVar2, bArr, false, 27);
                if (lVar2.g == 0 && lVar2.b == 1) {
                    k kVar = new k();
                    kVar.a = (short) -1;
                    kVar.a(bArr[i11]);
                    kVar.a(bArr[3]);
                    i12 = 1;
                    int i22 = iArr[lVar2.e][lVar2.a];
                    for (int i23 = 0; i23 < i22; i23++) {
                        kVar.a(bArr[i23 + 6]);
                    }
                    i13 = 5;
                } else {
                    i12 = 1;
                    i13 = 5;
                }
                int read7 = sVar2.a(nVar) ? -1 : nVar.read();
                int read8 = sVar2.a(nVar) ? -1 : nVar.read();
                if (read7 == -1 || read8 == -1) {
                    break;
                }
                if (read7 == 255 && (read8 & 254) == (read4 & 254)) {
                    int read9 = sVar2.a(nVar) ? -1 : nVar.read();
                    int read10 = sVar2.a(nVar) ? -1 : nVar.read();
                    if (read9 == -1 || read10 == -1) {
                        break;
                    }
                    if (new l(read8, read9, read10).d(lVar2)) {
                        nVar.reset();
                        long j12 = i20;
                        long j13 = 0;
                        while (j13 < j12) {
                            long skip = nVar.skip(j12 - j13);
                            if (skip <= 0) {
                                throw new EOFException();
                            }
                            j13 += skip;
                        }
                    }
                }
                nVar.reset();
            }
            i19 = read4;
            read4 = sVar2.a(nVar) ? -1 : nVar.read();
        }
        if (xVar != null) {
            throw new j("No audio frame");
        }
        byte[] bArr2 = (byte[]) xVar.b;
        l lVar3 = (l) xVar.c;
        int i24 = iArr[lVar3.e][lVar3.a];
        int i25 = i24 + 4;
        if (bArr2.length >= i24 + 16 && i25 >= 0 && bArr2.length >= i24 + 12 && (((b10 = bArr2[i25]) == 88 && bArr2[i24 + 5] == 105 && bArr2[i24 + 6] == 110 && bArr2[i24 + 7] == 103) || (b10 == 73 && bArr2[i24 + 5] == 110 && bArr2[i24 + 6] == 102 && bArr2[i24 + 7] == 111))) {
            if ((bArr2[i24 + 11] & 1) != 0) {
                i14 = (bArr2[i24 + 15] & 255) | ((bArr2[i24 + 12] & 255) << 24) | ((bArr2[i24 + 13] & 255) << 16) | ((bArr2[i24 + 14] & 255) << 8);
            }
            i14 = -1;
        } else {
            if (bArr2.length >= 62 && bArr2[36] == 86 && bArr2[37] == 66 && bArr2[38] == 82 && bArr2[39] == 73) {
                i14 = ((bArr2[50] & 255) << 24) | ((bArr2[51] & 255) << 16) | ((bArr2[52] & 255) << 8) | (bArr2[53] & 255);
            }
            i14 = -1;
        }
        if (i14 > 0) {
            return lVar3.c(i14 * bArr2.length);
        }
        long length = nVar.b - bArr2.length;
        long length2 = bArr2.length;
        int a2 = lVar3.a();
        long j14 = a2;
        int c11 = 10000 / ((int) lVar3.c(lVar3.b()));
        int i26 = 0;
        int i27 = i12;
        while (true) {
            l lVar4 = (l) xVar.c;
            if (i27 == c11 && i26 == 0 && j3 > j10) {
                return lVar4.c(j3 - length);
            }
            nVar.mark(i10);
            if (sVar2.a(nVar)) {
                i15 = i10;
                read = i18;
            } else {
                i15 = i10;
                read = nVar.read();
            }
            if (sVar2.a(nVar)) {
                i16 = c11;
                read2 = i18;
            } else {
                i16 = c11;
                read2 = nVar.read();
            }
            if (read == i18 || read2 == i18) {
                j11 = length;
            } else {
                if (read == 255 && (read2 & 224) == 224) {
                    int read11 = sVar2.a(nVar) ? -1 : nVar.read();
                    int read12 = sVar2.a(nVar) ? -1 : nVar.read();
                    j11 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            lVar = new l(read2, read11, read12);
                            i17 = i13;
                        } catch (j e7) {
                            int i28 = nVar.d + 1;
                            nVar.d = i28;
                            i17 = i13;
                            if (i28 > i17) {
                                throw e7;
                            }
                            lVar = null;
                        }
                        if (lVar != null && lVar.d(lVar4)) {
                            int b12 = lVar.b();
                            byte[] bArr3 = new byte[b12];
                            bArr3[0] = (byte) read;
                            bArr3[i12] = (byte) read2;
                            bArr3[i11] = (byte) read11;
                            bArr3[c10] = (byte) read12;
                            int i29 = b12 - 4;
                            int i30 = 0;
                            while (i30 < i29) {
                                try {
                                    int read13 = nVar.read(bArr3, i15 + i30, i29 - i30);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i30 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            xVar = new x(lVar, bArr3, false, 27);
                            if (xVar == null) {
                                return (((length2 * 1000) * i27) * 8) / j14;
                            }
                            int a10 = ((l) xVar.c).a();
                            if (a10 != a2) {
                                i26 = i12;
                            }
                            j14 += a10;
                            length2 += ((byte[]) xVar.b).length;
                            i27++;
                            sVar2 = sVar;
                            i13 = i17;
                            i10 = i15;
                            c11 = i16;
                            length = j11;
                            i18 = -1;
                        }
                    }
                } else {
                    j11 = length;
                    i17 = i13;
                }
                nVar.reset();
                xVar = null;
                if (xVar == null) {
                }
            }
            i17 = i13;
            xVar = null;
            if (xVar == null) {
            }
        }
    }
}
