package lf;

import c3.s;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m extends jf.a {
    public static final Logger r = Logger.getLogger(m.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0200, code lost:
    
        if (r13 <= 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0204, code lost:
    
        if (r0.f != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0206, code lost:
    
        r2 = r6.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020a, code lost:
    
        r15.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023a, code lost:
    
        r2.d.Z(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0210, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0249, code lost:
    
        r2.d.Z(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0254, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0212, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0217, code lost:
    
        if (r12.isLoggable(r5) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0219, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + r10 + ": " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
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
        int i10;
        aa.a aVar;
        Logger logger;
        mf.a aVar2;
        int i11;
        Level level = Level.FINEST;
        this.a = "MP3";
        n nVar = new n(bufferedInputStream);
        nVar.d = 0;
        if (h.b(nVar)) {
            Logger logger2 = h.s;
            h hVar = new h();
            if (h.b(nVar)) {
                com.google.firebase.messaging.d dVar = new com.google.firebase.messaging.d((FilterInputStream) nVar);
                i iVar = new i();
                iVar.a = 0;
                iVar.b = 0;
                iVar.c = 0;
                long j13 = dVar.b;
                l2.g gVar = new l2.g(dVar, 1);
                byte[] bArr = new byte[3];
                int i12 = 0;
                for (int i13 = 3; i12 < i13; i13 = 3) {
                    long j14 = j13;
                    int read = ((com.google.firebase.messaging.d) gVar.b).read(bArr, i12, 3 - i12);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i12 += read;
                    j13 = j14;
                }
                long j15 = j13;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new c("Invalid ID3 identifier: ".concat(str5));
                }
                byte F = gVar.F();
                iVar.a = F;
                if (F != 2 && F != 3 && F != 4) {
                    throw new c(hc.b.j(F, "Unsupported ID3v2 version: "));
                }
                byte F2 = gVar.F();
                byte F3 = gVar.F();
                int I = gVar.I();
                iVar.b = I + 10;
                if (F == 2) {
                    iVar.d = (F3 & 128) != 0;
                    iVar.e = (F3 & 64) != 0;
                } else {
                    iVar.d = (F3 & 128) != 0;
                    if ((F3 & 64) == 0) {
                        b11 = F3;
                    } else if (F == 3) {
                        int G = gVar.G();
                        gVar.F();
                        gVar.F();
                        gVar.G();
                        b11 = F3;
                        gVar.Z(G - 6);
                    } else {
                        b11 = F3;
                        i10 = I;
                        gVar.Z(gVar.I() - 4);
                        if (F >= 4 && (b11 & 16) != 0) {
                            iVar.c = 10;
                            iVar.b = i10 + 20;
                        }
                    }
                    i10 = I;
                    if (F >= 4) {
                        iVar.c = 10;
                        iVar.b = i10 + 20;
                    }
                }
                int i14 = (int) (dVar.b - j15);
                hVar.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(F), Integer.valueOf(F2));
                int i15 = iVar.b;
                if (iVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (F >= 4 || !iVar.d) {
                    logger = logger2;
                    aVar = new aa.a(nVar, i14, (i15 - i14) - iVar.c, iVar);
                } else {
                    int i16 = i15 - i14;
                    byte[] bArr2 = new byte[i16];
                    int i17 = 0;
                    while (i17 < i16) {
                        int read2 = nVar.read(bArr2, i17, i16 - i17);
                        if (read2 <= 0) {
                            throw new EOFException();
                        }
                        i17 += read2;
                    }
                    boolean z10 = false;
                    int i18 = 0;
                    for (int i19 = 0; i19 < i16; i19++) {
                        byte b12 = bArr2[i19];
                        if (!z10 || b12 != 0) {
                            bArr2[i18] = b12;
                            i18++;
                        }
                        z10 = b12 == -1;
                    }
                    aVar = new aa.a(new ByteArrayInputStream(bArr2, 0, i18), i14, i18, iVar);
                    logger = logger2;
                }
                l2.g gVar2 = (l2.g) aVar.d;
                mf.a aVar3 = (mf.a) aVar.b;
                while (true) {
                    try {
                        if (aVar3.e() <= 10) {
                            aVar2 = aVar3;
                            break;
                        }
                        f fVar = new f(aVar);
                        String str6 = fVar.a;
                        int i20 = fVar.c;
                        aVar2 = aVar3;
                        int i21 = 0;
                        while (true) {
                            try {
                                if (i21 >= str6.length()) {
                                    if (i20 == 0) {
                                        break;
                                    }
                                } else if (str6.charAt(0) != 0) {
                                    break;
                                } else {
                                    i21++;
                                }
                            } catch (c e) {
                                e = e;
                                if (logger.isLoggable(level)) {
                                    logger.log(level, "ID3 exception occured: " + e.getMessage());
                                }
                                gVar2.Z(aVar2.e());
                                i11 = iVar.c;
                                if (i11 > 0) {
                                }
                                this.f = hVar.f;
                                this.e = hVar.e;
                                this.d = hVar.d;
                                this.i = hVar.i;
                                this.o = hVar.o;
                                this.p = hVar.p;
                                this.m = hVar.m;
                                this.l = hVar.l;
                                this.k = hVar.k;
                                this.b = hVar.b;
                                this.h = hVar.h;
                                this.n = hVar.n;
                                this.c = hVar.c;
                                this.j = hVar.j;
                                this.g = hVar.g;
                                j10 = this.b;
                                if (j10 > 0) {
                                }
                                try {
                                    s sVar = new s();
                                    sVar.a = j3 - 128;
                                    this.b = b(nVar, j3, sVar);
                                } catch (j e7) {
                                    Logger logger3 = r;
                                    if (logger3.isLoggable(level)) {
                                        logger3.log(level, "Could not determine MP3 duration", (Throwable) e7);
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
                        if (i20 <= aVar2.e()) {
                            int i22 = 0;
                            while (true) {
                                if (i22 >= str6.length()) {
                                    break;
                                }
                                if ((str6.charAt(i22) < 'A' || str6.charAt(i22) > 'Z') && (str6.charAt(i22) < '0' || str6.charAt(i22) > '9')) {
                                    break;
                                } else {
                                    i22++;
                                }
                            }
                            gVar2.Z(i20);
                            aVar3 = aVar2;
                        } else if (logger.isLoggable(level)) {
                            logger.log(level, "ID3 frame claims to extend frames area");
                        }
                    } catch (c e10) {
                        e = e10;
                        aVar2 = aVar3;
                    }
                }
                gVar2.Z(aVar2.e());
                i11 = iVar.c;
                if (i11 > 0) {
                    nVar.skip(i11);
                }
            }
            this.f = hVar.f;
            this.e = hVar.e;
            this.d = hVar.d;
            this.i = hVar.i;
            this.o = hVar.o;
            this.p = hVar.p;
            this.m = hVar.m;
            this.l = hVar.l;
            this.k = hVar.k;
            this.b = hVar.b;
            this.h = hVar.h;
            this.n = hVar.n;
            this.c = hVar.c;
            this.j = hVar.j;
            this.g = hVar.g;
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
            int i23 = 0;
            while (i23 < 128) {
                int read3 = bufferedInputStream.read(bArr3, i23, 128 - i23);
                if (read3 <= 0) {
                    throw new EOFException();
                }
                i23 += read3;
            }
            str3 = a.b(3, 30, bArr3);
            str4 = a.b(33, 30, bArr3);
            String b13 = a.b(63, 30, bArr3);
            try {
                s10 = Short.parseShort(a.b(93, 4, bArr3));
            } catch (NumberFormatException unused) {
                s10 = 0;
            }
            str = a.b(97, 30, bArr3);
            int b14 = hc.b.b(bArr3[127]);
            r2 = b14 != 0 ? hc.b.d(b14) : null;
            if (bArr3[125] == 0 && (b10 = bArr3[126]) != 0) {
                s11 = (short) (b10 & 255);
                str2 = r2;
                r2 = b13;
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
            r2 = b13;
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

    /* JADX WARN: Code restructure failed: missing block: B:163:0x00d7, code lost:
    
        if (((r5[5] & 255) | ((r5[4] & 255) << 8)) != r9.a) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0038, code lost:
    
        r19 = 0;
        r21 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0036, code lost:
    
        r18 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(n nVar, long j3, s sVar) {
        int[][] iArr;
        int i10;
        char c10;
        long j10;
        char c11;
        char c12;
        of.b bVar;
        int i11;
        int i12;
        int read;
        long j11;
        l lVar;
        byte b10;
        s sVar2 = sVar;
        int i13 = -1;
        int read2 = sVar2.a(nVar) ? -1 : nVar.read();
        int i14 = 0;
        while (true) {
            iArr = l.m;
            i10 = 4;
            if (read2 == -1) {
                break;
            }
            if (i14 == 255 && (read2 & 224) == 224) {
                nVar.mark(2);
                int read3 = sVar2.a(nVar) ? -1 : nVar.read();
                if (read3 == -1) {
                    break;
                }
                int read4 = sVar2.a(nVar) ? -1 : nVar.read();
                c10 = 2;
                if (read4 == -1) {
                    break;
                }
                j10 = 0;
                l lVar2 = new l(read2, read3, read4);
                nVar.reset();
                nVar.mark(lVar2.b() + 2);
                int b11 = lVar2.b();
                byte[] bArr = new byte[b11];
                bArr[0] = -1;
                bArr[1] = (byte) read2;
                int i15 = b11 - 2;
                int i16 = 0;
                while (i16 < i15) {
                    c11 = 3;
                    try {
                        int read5 = nVar.read(bArr, 2 + i16, i15 - i16);
                        if (read5 <= 0) {
                            throw new EOFException();
                        }
                        i16 += read5;
                    } catch (EOFException unused) {
                        c12 = 1;
                        bVar = null;
                        if (bVar != null) {
                        }
                    }
                }
                c11 = 3;
                bVar = new of.b(23, lVar2, bArr);
                if (lVar2.g == 0 && lVar2.b == 1) {
                    k kVar = new k();
                    kVar.a = (short) -1;
                    kVar.a(bArr[2]);
                    kVar.a(bArr[3]);
                    c12 = 1;
                    int i17 = iArr[lVar2.e][lVar2.a];
                    for (int i18 = 0; i18 < i17; i18++) {
                        kVar.a(bArr[i18 + 6]);
                    }
                } else {
                    c12 = 1;
                }
                int read6 = sVar2.a(nVar) ? -1 : nVar.read();
                int read7 = sVar2.a(nVar) ? -1 : nVar.read();
                if (read6 == -1 || read7 == -1) {
                    break;
                }
                if (read6 == 255 && (read7 & 254) == (read2 & 254)) {
                    int read8 = sVar2.a(nVar) ? -1 : nVar.read();
                    int read9 = sVar2.a(nVar) ? -1 : nVar.read();
                    if (read8 == -1 || read9 == -1) {
                        break;
                    }
                    if (new l(read7, read8, read9).d(lVar2)) {
                        nVar.reset();
                        long j12 = i15;
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
            i14 = read2;
            read2 = sVar2.a(nVar) ? -1 : nVar.read();
        }
        if (bVar != null) {
            throw new j("No audio frame");
        }
        byte[] bArr2 = (byte[]) bVar.b;
        l lVar3 = (l) bVar.c;
        int i19 = iArr[lVar3.e][lVar3.a];
        int i20 = i19 + 4;
        if (bArr2.length >= i19 + 16 && i20 >= 0 && bArr2.length >= i19 + 12 && (((b10 = bArr2[i20]) == 88 && bArr2[i19 + 5] == 105 && bArr2[i19 + 6] == 110 && bArr2[i19 + 7] == 103) || (b10 == 73 && bArr2[i19 + 5] == 110 && bArr2[i19 + 6] == 102 && bArr2[i19 + 7] == 111))) {
            if ((bArr2[i19 + 11] & 1) != 0) {
                i11 = (bArr2[i19 + 15] & 255) | ((bArr2[i19 + 12] & 255) << 24) | ((bArr2[i19 + 13] & 255) << 16) | ((bArr2[i19 + 14] & 255) << 8);
            }
            i11 = -1;
        } else {
            if (bArr2.length >= 62 && bArr2[36] == 86 && bArr2[37] == 66 && bArr2[38] == 82 && bArr2[39] == 73) {
                i11 = ((bArr2[50] & 255) << 24) | ((bArr2[51] & 255) << 16) | ((bArr2[52] & 255) << 8) | (bArr2[53] & 255);
            }
            i11 = -1;
        }
        if (i11 > 0) {
            return lVar3.c(i11 * bArr2.length);
        }
        long length = nVar.b - bArr2.length;
        long length2 = bArr2.length;
        int a2 = lVar3.a();
        long j14 = a2;
        int c13 = 10000 / ((int) lVar3.c(lVar3.b()));
        int i21 = 1;
        boolean z10 = false;
        while (true) {
            l lVar4 = (l) bVar.c;
            if (i21 == c13 && !z10 && j3 > j10) {
                return lVar4.c(j3 - length);
            }
            nVar.mark(i10);
            int read10 = sVar2.a(nVar) ? -1 : nVar.read();
            if (sVar2.a(nVar)) {
                i12 = c13;
                read = -1;
            } else {
                i12 = c13;
                read = nVar.read();
            }
            if (read10 == i13 || read == i13) {
                j11 = length;
            } else {
                if (read10 == 255 && (read & 224) == 224) {
                    int read11 = sVar2.a(nVar) ? -1 : nVar.read();
                    int read12 = sVar2.a(nVar) ? -1 : nVar.read();
                    j11 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            lVar = new l(read, read11, read12);
                        } catch (j e) {
                            int i22 = nVar.d + 1;
                            nVar.d = i22;
                            if (i22 > 5) {
                                throw e;
                            }
                            lVar = null;
                        }
                        if (lVar != null && lVar.d(lVar4)) {
                            int b12 = lVar.b();
                            byte[] bArr3 = new byte[b12];
                            bArr3[0] = (byte) read10;
                            bArr3[c12] = (byte) read;
                            bArr3[c10] = (byte) read11;
                            bArr3[c11] = (byte) read12;
                            int i23 = b12 - 4;
                            int i24 = 0;
                            while (i24 < i23) {
                                try {
                                    int read13 = nVar.read(bArr3, 4 + i24, i23 - i24);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i24 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            bVar = new of.b(23, lVar, bArr3);
                            if (bVar == null) {
                                return (((length2 * 1000) * i21) * 8) / j14;
                            }
                            int a10 = ((l) bVar.c).a();
                            if (a10 != a2) {
                                z10 = true;
                            }
                            j14 += a10;
                            length2 += ((byte[]) bVar.b).length;
                            i21++;
                            sVar2 = sVar;
                            c13 = i12;
                            length = j11;
                            i13 = -1;
                            i10 = 4;
                        }
                    }
                } else {
                    j11 = length;
                }
                nVar.reset();
                bVar = null;
                if (bVar == null) {
                }
            }
            bVar = null;
            if (bVar == null) {
            }
        }
    }
}
