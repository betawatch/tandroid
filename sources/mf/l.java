package mf;

import c3.s;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import m2.t;
import n4.y;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class l extends kf.a {
    public static final Logger r = Logger.getLogger(l.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0204, code lost:
    
        if (r13 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0208, code lost:
    
        if (r0.f != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020a, code lost:
    
        r2 = r6.v(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020e, code lost:
    
        r15.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023e, code lost:
    
        r2.d.D(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0214, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024d, code lost:
    
        r2.d.D(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0258, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0216, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021b, code lost:
    
        if (r12.isLoggable(r5) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021d, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + r10 + ": " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01cb, code lost:
    
        if (r12.isLoggable(r5) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cd, code lost:
    
        r12.log(r5, "ID3 frame claims to extend frames area");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        if (r13 <= r16.e()) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d7, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01dc, code lost:
    
        if (r9 >= r10.length()) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e4, code lost:
    
        if (r10.charAt(r9) < 'A') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ec, code lost:
    
        if (r10.charAt(r9) <= 'Z') goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ff, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f4, code lost:
    
        if (r10.charAt(r9) < '0') goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fc, code lost:
    
        if (r10.charAt(r9) <= '9') goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0259, code lost:
    
        r8.D(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(BufferedInputStream bufferedInputStream, long j3) {
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
        t tVar;
        Logger logger;
        nf.a aVar;
        int i10;
        Level level = Level.FINEST;
        this.a = "MP3";
        m mVar = new m(bufferedInputStream);
        mVar.d = 0;
        int i11 = 4;
        if (g.b(mVar)) {
            Logger logger2 = g.s;
            g gVar = new g();
            if (g.b(mVar)) {
                com.google.firebase.messaging.d dVar = new com.google.firebase.messaging.d((FilterInputStream) mVar);
                h hVar = new h();
                hVar.a = 0;
                hVar.b = 0;
                hVar.c = 0;
                long j13 = dVar.b;
                l.d dVar2 = new l.d(dVar, i11);
                byte[] bArr = new byte[3];
                int i12 = 0;
                for (int i13 = 3; i12 < i13; i13 = 3) {
                    long j14 = j13;
                    int read = ((com.google.firebase.messaging.d) dVar2.b).read(bArr, i12, 3 - i12);
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
                byte y3 = dVar2.y();
                hVar.a = y3;
                if (y3 != 2 && y3 != 3 && y3 != 4) {
                    throw new c(i2.g.i(y3, "Unsupported ID3v2 version: "));
                }
                byte y10 = dVar2.y();
                byte y11 = dVar2.y();
                int B = dVar2.B();
                hVar.b = B + 10;
                if (y3 == 2) {
                    hVar.d = (y11 & 128) != 0;
                    hVar.e = (y11 & 64) != 0;
                    b11 = y10;
                } else {
                    hVar.d = (y11 & 128) != 0;
                    if ((y11 & 64) == 0) {
                        b11 = y10;
                        b12 = y11;
                    } else if (y3 == 3) {
                        int A = dVar2.A();
                        dVar2.y();
                        dVar2.y();
                        dVar2.A();
                        b11 = y10;
                        b12 = y11;
                        dVar2.D(A - 6);
                    } else {
                        b11 = y10;
                        b12 = y11;
                        dVar2.D(dVar2.B() - 4);
                    }
                    if (y3 >= 4 && (b12 & 16) != 0) {
                        hVar.c = 10;
                        hVar.b = B + 20;
                    }
                }
                int i14 = (int) (dVar.b - j15);
                gVar.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(y3), Integer.valueOf(b11));
                int i15 = hVar.b;
                if (hVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (y3 >= 4 || !hVar.d) {
                    logger = logger2;
                    tVar = new t(mVar, i14, (i15 - i14) - hVar.c, hVar);
                } else {
                    int i16 = i15 - i14;
                    byte[] bArr2 = new byte[i16];
                    int i17 = 0;
                    while (i17 < i16) {
                        int read2 = mVar.read(bArr2, i17, i16 - i17);
                        if (read2 <= 0) {
                            throw new EOFException();
                        }
                        i17 += read2;
                    }
                    boolean z10 = false;
                    int i18 = 0;
                    for (int i19 = 0; i19 < i16; i19++) {
                        byte b13 = bArr2[i19];
                        if (!z10 || b13 != 0) {
                            bArr2[i18] = b13;
                            i18++;
                        }
                        z10 = b13 == -1;
                    }
                    tVar = new t(new ByteArrayInputStream(bArr2, 0, i18), i14, i18, hVar);
                    logger = logger2;
                }
                l.d dVar3 = (l.d) tVar.d;
                nf.a aVar2 = (nf.a) tVar.b;
                while (true) {
                    try {
                        if (aVar2.e() <= 10) {
                            aVar = aVar2;
                            break;
                        }
                        f fVar = new f(tVar);
                        String str6 = fVar.a;
                        int i20 = fVar.c;
                        aVar = aVar2;
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
                            } catch (c e7) {
                                e = e7;
                                if (logger.isLoggable(level)) {
                                    logger.log(level, "ID3 exception occured: " + e.getMessage());
                                }
                                dVar3.D(aVar.e());
                                i10 = hVar.c;
                                if (i10 > 0) {
                                }
                                this.f = gVar.f;
                                this.e = gVar.e;
                                this.d = gVar.d;
                                this.i = gVar.i;
                                this.o = gVar.o;
                                this.p = gVar.p;
                                this.m = gVar.m;
                                this.l = gVar.l;
                                this.k = gVar.k;
                                this.b = gVar.b;
                                this.h = gVar.h;
                                this.n = gVar.n;
                                this.c = gVar.c;
                                this.j = gVar.j;
                                this.g = gVar.g;
                                j10 = this.b;
                                if (j10 > 0) {
                                }
                                try {
                                    s sVar = new s();
                                    sVar.a = j3 - 128;
                                    this.b = b(mVar, j3, sVar);
                                } catch (i e10) {
                                    Logger logger3 = r;
                                    if (logger3.isLoggable(level)) {
                                        logger3.log(level, "Could not determine MP3 duration", (Throwable) e10);
                                    }
                                }
                                if (this.c == null) {
                                }
                                j11 = mVar.b;
                                j12 = j3 - 128;
                                if (j11 <= j12) {
                                }
                            }
                        }
                        aVar2 = aVar;
                    } catch (c e11) {
                        e = e11;
                        aVar = aVar2;
                    }
                }
                dVar3.D(aVar.e());
                i10 = hVar.c;
                if (i10 > 0) {
                    mVar.skip(i10);
                }
            }
            this.f = gVar.f;
            this.e = gVar.e;
            this.d = gVar.d;
            this.i = gVar.i;
            this.o = gVar.o;
            this.p = gVar.p;
            this.m = gVar.m;
            this.l = gVar.l;
            this.k = gVar.k;
            this.b = gVar.b;
            this.h = gVar.h;
            this.n = gVar.n;
            this.c = gVar.c;
            this.j = gVar.j;
            this.g = gVar.g;
        }
        j10 = this.b;
        if (j10 > 0 || j10 >= 3600000) {
            s sVar2 = new s();
            sVar2.a = j3 - 128;
            this.b = b(mVar, j3, sVar2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j11 = mVar.b;
        j12 = j3 - 128;
        if (j11 <= j12) {
            return;
        }
        long j16 = j12 - j11;
        long j17 = 0;
        while (j17 < j16) {
            long skip = mVar.skip(j16 - j17);
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
            int a2 = i2.g.a(bArr3[127]);
            r2 = a2 != 0 ? i2.g.c(a2) : null;
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

    /* JADX WARN: Code restructure failed: missing block: B:163:0x00d8, code lost:
    
        if (((r5[5] & 255) | ((r5[4] & 255) << 8)) != r9.a) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0038, code lost:
    
        r19 = 0;
        r21 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0036, code lost:
    
        r18 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(m mVar, long j3, s sVar) {
        int[][] iArr;
        int i10;
        char c10;
        long j10;
        char c11;
        char c12;
        y yVar;
        int i11;
        int i12;
        int read;
        long j11;
        k kVar;
        byte b10;
        s sVar2 = sVar;
        int i13 = -1;
        int read2 = sVar2.a(mVar) ? -1 : mVar.read();
        int i14 = 0;
        while (true) {
            iArr = k.m;
            i10 = 4;
            if (read2 == -1) {
                break;
            }
            if (i14 == 255 && (read2 & 224) == 224) {
                mVar.mark(2);
                int read3 = sVar2.a(mVar) ? -1 : mVar.read();
                if (read3 == -1) {
                    break;
                }
                int read4 = sVar2.a(mVar) ? -1 : mVar.read();
                c10 = 2;
                if (read4 == -1) {
                    break;
                }
                j10 = 0;
                k kVar2 = new k(read2, read3, read4);
                mVar.reset();
                mVar.mark(kVar2.b() + 2);
                int b11 = kVar2.b();
                byte[] bArr = new byte[b11];
                bArr[0] = -1;
                bArr[1] = (byte) read2;
                int i15 = b11 - 2;
                int i16 = 0;
                while (i16 < i15) {
                    c11 = 3;
                    try {
                        int read5 = mVar.read(bArr, 2 + i16, i15 - i16);
                        if (read5 <= 0) {
                            throw new EOFException();
                        }
                        i16 += read5;
                    } catch (EOFException unused) {
                        c12 = 1;
                        yVar = null;
                        if (yVar != null) {
                        }
                    }
                }
                c11 = 3;
                yVar = new y(kVar2, bArr, false, 26);
                if (kVar2.g == 0 && kVar2.b == 1) {
                    j jVar = new j();
                    jVar.a = (short) -1;
                    jVar.a(bArr[2]);
                    jVar.a(bArr[3]);
                    c12 = 1;
                    int i17 = iArr[kVar2.e][kVar2.a];
                    for (int i18 = 0; i18 < i17; i18++) {
                        jVar.a(bArr[i18 + 6]);
                    }
                } else {
                    c12 = 1;
                }
                int read6 = sVar2.a(mVar) ? -1 : mVar.read();
                int read7 = sVar2.a(mVar) ? -1 : mVar.read();
                if (read6 == -1 || read7 == -1) {
                    break;
                }
                if (read6 == 255 && (read7 & 254) == (read2 & 254)) {
                    int read8 = sVar2.a(mVar) ? -1 : mVar.read();
                    int read9 = sVar2.a(mVar) ? -1 : mVar.read();
                    if (read8 == -1 || read9 == -1) {
                        break;
                    }
                    if (new k(read7, read8, read9).d(kVar2)) {
                        mVar.reset();
                        long j12 = i15;
                        long j13 = 0;
                        while (j13 < j12) {
                            long skip = mVar.skip(j12 - j13);
                            if (skip <= 0) {
                                throw new EOFException();
                            }
                            j13 += skip;
                        }
                    }
                }
                mVar.reset();
            }
            i14 = read2;
            read2 = sVar2.a(mVar) ? -1 : mVar.read();
        }
        if (yVar != null) {
            throw new i("No audio frame");
        }
        byte[] bArr2 = (byte[]) yVar.b;
        k kVar3 = (k) yVar.c;
        int i19 = iArr[kVar3.e][kVar3.a];
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
            return kVar3.c(i11 * bArr2.length);
        }
        long length = mVar.b - bArr2.length;
        long length2 = bArr2.length;
        int a2 = kVar3.a();
        long j14 = a2;
        int c13 = 10000 / ((int) kVar3.c(kVar3.b()));
        int i21 = 1;
        boolean z10 = false;
        while (true) {
            k kVar4 = (k) yVar.c;
            if (i21 == c13 && !z10 && j3 > j10) {
                return kVar4.c(j3 - length);
            }
            mVar.mark(i10);
            int read10 = sVar2.a(mVar) ? -1 : mVar.read();
            if (sVar2.a(mVar)) {
                i12 = c13;
                read = -1;
            } else {
                i12 = c13;
                read = mVar.read();
            }
            if (read10 == i13 || read == i13) {
                j11 = length;
            } else {
                if (read10 == 255 && (read & 224) == 224) {
                    int read11 = sVar2.a(mVar) ? -1 : mVar.read();
                    int read12 = sVar2.a(mVar) ? -1 : mVar.read();
                    j11 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            kVar = new k(read, read11, read12);
                        } catch (i e7) {
                            int i22 = mVar.d + 1;
                            mVar.d = i22;
                            if (i22 > 5) {
                                throw e7;
                            }
                            kVar = null;
                        }
                        if (kVar != null && kVar.d(kVar4)) {
                            int b12 = kVar.b();
                            byte[] bArr3 = new byte[b12];
                            bArr3[0] = (byte) read10;
                            bArr3[c12] = (byte) read;
                            bArr3[c10] = (byte) read11;
                            bArr3[c11] = (byte) read12;
                            int i23 = b12 - 4;
                            int i24 = 0;
                            while (i24 < i23) {
                                try {
                                    int read13 = mVar.read(bArr3, 4 + i24, i23 - i24);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i24 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            yVar = new y(kVar, bArr3, false, 26);
                            if (yVar == null) {
                                return (((length2 * 1000) * i21) * 8) / j14;
                            }
                            int a10 = ((k) yVar.c).a();
                            if (a10 != a2) {
                                z10 = true;
                            }
                            j14 += a10;
                            length2 += ((byte[]) yVar.b).length;
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
                mVar.reset();
                yVar = null;
                if (yVar == null) {
                }
            }
            yVar = null;
            if (yVar == null) {
            }
        }
    }
}
