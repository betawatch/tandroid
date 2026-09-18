package lf;

import c3.s;
import hg.k0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import n4.y;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class n extends jf.a {
    public static final Logger r = Logger.getLogger(n.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0205, code lost:
    
        if (r13 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0209, code lost:
    
        if (r0.f != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020b, code lost:
    
        r2 = r6.z(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020f, code lost:
    
        r15.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023f, code lost:
    
        r2.d.E0(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0215, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024e, code lost:
    
        r2.d.E0(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0259, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0217, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021c, code lost:
    
        if (r12.isLoggable(r5) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021e, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + r10 + ": " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01cc, code lost:
    
        if (r12.isLoggable(r5) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ce, code lost:
    
        r12.log(r5, "ID3 frame claims to extend frames area");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c6, code lost:
    
        if (r13 <= r16.e()) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d8, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01dd, code lost:
    
        if (r9 >= r10.length()) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e5, code lost:
    
        if (r10.charAt(r9) < 'A') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ed, code lost:
    
        if (r10.charAt(r9) <= 'Z') goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0200, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f5, code lost:
    
        if (r10.charAt(r9) < '0') goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fd, code lost:
    
        if (r10.charAt(r9) <= '9') goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025a, code lost:
    
        r8.E0(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(BufferedInputStream bufferedInputStream, long j3) {
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
        i iVar;
        Logger logger;
        mf.a aVar;
        int i10;
        Level level = Level.FINEST;
        this.a = "MP3";
        o oVar = new o(bufferedInputStream);
        oVar.d = 0;
        if (h.b(oVar)) {
            Logger logger2 = h.s;
            h hVar = new h();
            if (h.b(oVar)) {
                com.google.firebase.messaging.d dVar = new com.google.firebase.messaging.d((FilterInputStream) oVar);
                j jVar = new j();
                jVar.a = 0;
                jVar.b = 0;
                jVar.c = 0;
                long j13 = dVar.b;
                a4.m mVar = new a4.m(dVar, 27);
                byte[] bArr = new byte[3];
                int i11 = 0;
                for (int i12 = 3; i11 < i12; i12 = 3) {
                    long j14 = j13;
                    int read = ((com.google.firebase.messaging.d) mVar.b).read(bArr, i11, 3 - i11);
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
                byte y02 = mVar.y0();
                jVar.a = y02;
                if (y02 != 2 && y02 != 3 && y02 != 4) {
                    throw new c(k0.h(y02, "Unsupported ID3v2 version: "));
                }
                byte y03 = mVar.y0();
                byte y04 = mVar.y0();
                int B0 = mVar.B0();
                jVar.b = B0 + 10;
                if (y02 == 2) {
                    jVar.d = (y04 & 128) != 0;
                    jVar.e = (y04 & 64) != 0;
                    b11 = y03;
                } else {
                    jVar.d = (y04 & 128) != 0;
                    if ((y04 & 64) == 0) {
                        b11 = y03;
                        b12 = y04;
                    } else if (y02 == 3) {
                        int A0 = mVar.A0();
                        mVar.y0();
                        mVar.y0();
                        mVar.A0();
                        b11 = y03;
                        b12 = y04;
                        mVar.E0(A0 - 6);
                    } else {
                        b11 = y03;
                        b12 = y04;
                        mVar.E0(mVar.B0() - 4);
                    }
                    if (y02 >= 4 && (b12 & 16) != 0) {
                        jVar.c = 10;
                        jVar.b = B0 + 20;
                    }
                }
                int i13 = (int) (dVar.b - j15);
                hVar.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(y02), Integer.valueOf(b11));
                int i14 = jVar.b;
                if (jVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (y02 >= 4 || !jVar.d) {
                    logger = logger2;
                    iVar = new i(oVar, i13, (i14 - i13) - jVar.c, jVar);
                } else {
                    int i15 = i14 - i13;
                    byte[] bArr2 = new byte[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        int read2 = oVar.read(bArr2, i16, i15 - i16);
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
                    iVar = new i(new ByteArrayInputStream(bArr2, 0, i17), i13, i17, jVar);
                    logger = logger2;
                }
                a4.m mVar2 = (a4.m) iVar.d;
                mf.a aVar2 = (mf.a) iVar.b;
                while (true) {
                    try {
                        if (aVar2.e() <= 10) {
                            aVar = aVar2;
                            break;
                        }
                        f fVar = new f(iVar);
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
                            } catch (c e) {
                                e = e;
                                if (logger.isLoggable(level)) {
                                    logger.log(level, "ID3 exception occured: " + e.getMessage());
                                }
                                mVar2.E0(aVar.e());
                                i10 = jVar.c;
                                if (i10 > 0) {
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
                                    this.b = b(oVar, j3, sVar);
                                } catch (k e7) {
                                    Logger logger3 = r;
                                    if (logger3.isLoggable(level)) {
                                        logger3.log(level, "Could not determine MP3 duration", (Throwable) e7);
                                    }
                                }
                                if (this.c == null) {
                                }
                                j11 = oVar.b;
                                j12 = j3 - 128;
                                if (j11 <= j12) {
                                }
                            }
                        }
                        aVar2 = aVar;
                    } catch (c e10) {
                        e = e10;
                        aVar = aVar2;
                    }
                }
                mVar2.E0(aVar.e());
                i10 = jVar.c;
                if (i10 > 0) {
                    oVar.skip(i10);
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
            this.b = b(oVar, j3, sVar2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j11 = oVar.b;
        j12 = j3 - 128;
        if (j11 <= j12) {
            return;
        }
        long j16 = j12 - j11;
        long j17 = 0;
        while (j17 < j16) {
            long skip = oVar.skip(j16 - j17);
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
            int i21 = 0;
            while (i21 < 128) {
                int read3 = bufferedInputStream.read(bArr3, i21, 128 - i21);
                if (read3 <= 0) {
                    throw new EOFException();
                }
                i21 += read3;
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
            int a2 = k0.a(bArr3[127]);
            r2 = a2 != 0 ? k0.c(a2) : null;
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
    public static long b(o oVar, long j3, s sVar) {
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
        m mVar;
        byte b10;
        s sVar2 = sVar;
        int i13 = -1;
        int read2 = sVar2.a(oVar) ? -1 : oVar.read();
        int i14 = 0;
        while (true) {
            iArr = m.m;
            i10 = 4;
            if (read2 == -1) {
                break;
            }
            if (i14 == 255 && (read2 & 224) == 224) {
                oVar.mark(2);
                int read3 = sVar2.a(oVar) ? -1 : oVar.read();
                if (read3 == -1) {
                    break;
                }
                int read4 = sVar2.a(oVar) ? -1 : oVar.read();
                c10 = 2;
                if (read4 == -1) {
                    break;
                }
                j10 = 0;
                m mVar2 = new m(read2, read3, read4);
                oVar.reset();
                oVar.mark(mVar2.b() + 2);
                int b11 = mVar2.b();
                byte[] bArr = new byte[b11];
                bArr[0] = -1;
                bArr[1] = (byte) read2;
                int i15 = b11 - 2;
                int i16 = 0;
                while (i16 < i15) {
                    c11 = 3;
                    try {
                        int read5 = oVar.read(bArr, 2 + i16, i15 - i16);
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
                yVar = new y(mVar2, bArr, false, 24);
                if (mVar2.g == 0 && mVar2.b == 1) {
                    l lVar = new l();
                    lVar.a = (short) -1;
                    lVar.a(bArr[2]);
                    lVar.a(bArr[3]);
                    c12 = 1;
                    int i17 = iArr[mVar2.e][mVar2.a];
                    for (int i18 = 0; i18 < i17; i18++) {
                        lVar.a(bArr[i18 + 6]);
                    }
                } else {
                    c12 = 1;
                }
                int read6 = sVar2.a(oVar) ? -1 : oVar.read();
                int read7 = sVar2.a(oVar) ? -1 : oVar.read();
                if (read6 == -1 || read7 == -1) {
                    break;
                }
                if (read6 == 255 && (read7 & 254) == (read2 & 254)) {
                    int read8 = sVar2.a(oVar) ? -1 : oVar.read();
                    int read9 = sVar2.a(oVar) ? -1 : oVar.read();
                    if (read8 == -1 || read9 == -1) {
                        break;
                    }
                    if (new m(read7, read8, read9).d(mVar2)) {
                        oVar.reset();
                        long j12 = i15;
                        long j13 = 0;
                        while (j13 < j12) {
                            long skip = oVar.skip(j12 - j13);
                            if (skip <= 0) {
                                throw new EOFException();
                            }
                            j13 += skip;
                        }
                    }
                }
                oVar.reset();
            }
            i14 = read2;
            read2 = sVar2.a(oVar) ? -1 : oVar.read();
        }
        if (yVar != null) {
            throw new k("No audio frame");
        }
        byte[] bArr2 = (byte[]) yVar.b;
        m mVar3 = (m) yVar.c;
        int i19 = iArr[mVar3.e][mVar3.a];
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
            return mVar3.c(i11 * bArr2.length);
        }
        long length = oVar.b - bArr2.length;
        long length2 = bArr2.length;
        int a2 = mVar3.a();
        long j14 = a2;
        int c13 = 10000 / ((int) mVar3.c(mVar3.b()));
        int i21 = 1;
        boolean z10 = false;
        while (true) {
            m mVar4 = (m) yVar.c;
            if (i21 == c13 && !z10 && j3 > j10) {
                return mVar4.c(j3 - length);
            }
            oVar.mark(i10);
            int read10 = sVar2.a(oVar) ? -1 : oVar.read();
            if (sVar2.a(oVar)) {
                i12 = c13;
                read = -1;
            } else {
                i12 = c13;
                read = oVar.read();
            }
            if (read10 == i13 || read == i13) {
                j11 = length;
            } else {
                if (read10 == 255 && (read & 224) == 224) {
                    int read11 = sVar2.a(oVar) ? -1 : oVar.read();
                    int read12 = sVar2.a(oVar) ? -1 : oVar.read();
                    j11 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            mVar = new m(read, read11, read12);
                        } catch (k e) {
                            int i22 = oVar.d + 1;
                            oVar.d = i22;
                            if (i22 > 5) {
                                throw e;
                            }
                            mVar = null;
                        }
                        if (mVar != null && mVar.d(mVar4)) {
                            int b12 = mVar.b();
                            byte[] bArr3 = new byte[b12];
                            bArr3[0] = (byte) read10;
                            bArr3[c12] = (byte) read;
                            bArr3[c10] = (byte) read11;
                            bArr3[c11] = (byte) read12;
                            int i23 = b12 - 4;
                            int i24 = 0;
                            while (i24 < i23) {
                                try {
                                    int read13 = oVar.read(bArr3, 4 + i24, i23 - i24);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i24 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            yVar = new y(mVar, bArr3, false, 24);
                            if (yVar == null) {
                                return (((length2 * 1000) * i21) * 8) / j14;
                            }
                            int a10 = ((m) yVar.c).a();
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
                oVar.reset();
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
