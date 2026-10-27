package of;

import c3.s;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import li.e3;
import m4.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l extends mf.a {
    public static final Logger r = Logger.getLogger(l.class.getName());

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0212, code lost:
    
        if (r13 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r0.f != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0218, code lost:
    
        r2 = r6.t(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021c, code lost:
    
        r15.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024c, code lost:
    
        r2.d.M0(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0224, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0229, code lost:
    
        if (r12.isLoggable(r5) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022b, code lost:
    
        r12.log(r5, "ID3 exception occured in frame " + r10 + ": " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0222, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025b, code lost:
    
        r2.d.M0(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0266, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d9, code lost:
    
        if (r12.isLoggable(r5) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01db, code lost:
    
        r12.log(r5, "ID3 frame claims to extend frames area");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d3, code lost:
    
        if (r13 <= r16.e()) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e5, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ea, code lost:
    
        if (r9 >= r10.length()) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f2, code lost:
    
        if (r10.charAt(r9) < 'A') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fa, code lost:
    
        if (r10.charAt(r9) <= 'Z') goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020d, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0202, code lost:
    
        if (r10.charAt(r9) < '0') goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020a, code lost:
    
        if (r10.charAt(r9) <= '9') goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0267, code lost:
    
        r8.M0(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(BufferedInputStream bufferedInputStream, long j10) {
        long j11;
        long j12;
        long j13;
        String str;
        String str2;
        String str3;
        String str4;
        short s10;
        short s11;
        byte b10;
        byte b11;
        byte b12;
        k6.c cVar;
        Logger logger;
        pf.a aVar;
        int i10;
        Level level = Level.FINEST;
        this.a = "MP3";
        m mVar = new m(bufferedInputStream);
        mVar.d = 0;
        if (g.b(mVar)) {
            Logger logger2 = g.s;
            g gVar = new g();
            if (g.b(mVar)) {
                com.google.firebase.messaging.d dVar = new com.google.firebase.messaging.d((FilterInputStream) mVar);
                h hVar = new h();
                hVar.a = 0;
                hVar.b = 0;
                hVar.c = 0;
                long j14 = dVar.b;
                e3 e3Var = new e3(dVar, 6);
                byte[] bArr = new byte[3];
                int i11 = 0;
                for (int i12 = 3; i11 < i12; i12 = 3) {
                    long j15 = j14;
                    int read = ((com.google.firebase.messaging.d) e3Var.b).read(bArr, i11, 3 - i11);
                    if (read <= 0) {
                        throw new EOFException();
                    }
                    i11 += read;
                    j14 = j15;
                }
                long j16 = j14;
                String str5 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str5)) {
                    throw new c("Invalid ID3 identifier: ".concat(str5));
                }
                byte z02 = e3Var.z0();
                hVar.a = z02;
                if (z02 != 2 && z02 != 3 && z02 != 4) {
                    throw new c(ic.a.i(z02, "Unsupported ID3v2 version: "));
                }
                byte z03 = e3Var.z0();
                byte z04 = e3Var.z0();
                int G0 = e3Var.G0();
                hVar.b = G0 + 10;
                if (z02 == 2) {
                    hVar.d = (z04 & 128) != 0;
                    hVar.e = (z04 & 64) != 0;
                    b11 = z03;
                } else {
                    hVar.d = (z04 & 128) != 0;
                    if ((z04 & 64) == 0) {
                        b11 = z03;
                        b12 = z04;
                    } else if (z02 == 3) {
                        int B0 = e3Var.B0();
                        e3Var.z0();
                        e3Var.z0();
                        e3Var.B0();
                        b11 = z03;
                        b12 = z04;
                        e3Var.M0(B0 - 6);
                    } else {
                        b11 = z03;
                        b12 = z04;
                        e3Var.M0(e3Var.G0() - 4);
                    }
                    if (z02 >= 4 && (b12 & 16) != 0) {
                        hVar.c = 10;
                        hVar.b = G0 + 20;
                    }
                }
                int i13 = (int) (dVar.b - j16);
                gVar.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(z02), Integer.valueOf(b11));
                int i14 = hVar.b;
                if (hVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (z02 >= 4 || !hVar.d) {
                    logger = logger2;
                    cVar = new k6.c(mVar, i13, (i14 - i13) - hVar.c, hVar);
                } else {
                    int i15 = i14 - i13;
                    byte[] bArr2 = new byte[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        int read2 = mVar.read(bArr2, i16, i15 - i16);
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
                    cVar = new k6.c(new ByteArrayInputStream(bArr2, 0, i17), i13, i17, hVar);
                    logger = logger2;
                }
                e3 e3Var2 = (e3) cVar.d;
                pf.a aVar2 = (pf.a) cVar.b;
                while (true) {
                    try {
                        if (aVar2.e() <= 10) {
                            aVar = aVar2;
                            break;
                        }
                        f fVar = new f(cVar);
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
                                e3Var2.M0(aVar.e());
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
                                j11 = this.b;
                                if (j11 > 0) {
                                }
                                try {
                                    s sVar = new s();
                                    sVar.a = j10 - 128;
                                    this.b = b(mVar, j10, sVar);
                                } catch (i e10) {
                                    Logger logger3 = r;
                                    if (logger3.isLoggable(level)) {
                                        logger3.log(level, "Could not determine MP3 duration", (Throwable) e10);
                                    }
                                }
                                if (this.c == null) {
                                }
                                j12 = mVar.b;
                                j13 = j10 - 128;
                                if (j12 <= j13) {
                                }
                            }
                        }
                        aVar2 = aVar;
                    } catch (c e11) {
                        e = e11;
                        aVar = aVar2;
                    }
                }
                e3Var2.M0(aVar.e());
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
        j11 = this.b;
        if (j11 > 0 || j11 >= 3600000) {
            s sVar2 = new s();
            sVar2.a = j10 - 128;
            this.b = b(mVar, j10, sVar2);
        }
        if (this.c == null && this.f != null && this.d != null) {
            return;
        }
        j12 = mVar.b;
        j13 = j10 - 128;
        if (j12 <= j13) {
            return;
        }
        long j17 = j13 - j12;
        long j18 = 0;
        while (j18 < j17) {
            long skip = mVar.skip(j17 - j18);
            if (skip <= 0) {
                throw new EOFException();
            }
            j18 += skip;
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
            int b15 = ic.a.b(bArr3[127]);
            r2 = b15 != 0 ? ic.a.c(b15) : null;
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
    public static long b(m mVar, long j10, s sVar) {
        int[][] iArr;
        int i10;
        int i11;
        int i12;
        long j11;
        char c10;
        int i13;
        w1 w1Var;
        int i14;
        int i15;
        int read;
        int i16;
        int read2;
        long j12;
        int i17;
        k kVar;
        byte b10;
        int read3;
        s sVar2 = sVar;
        int i18 = -1;
        int read4 = sVar2.a(mVar) ? -1 : mVar.read();
        int i19 = 0;
        while (true) {
            iArr = k.m;
            i10 = 4;
            if (read4 == -1) {
                break;
            }
            if (i19 == 255 && (read4 & 224) == 224) {
                mVar.mark(2);
                int read5 = sVar2.a(mVar) ? -1 : mVar.read();
                if (read5 == -1) {
                    break;
                }
                if (sVar2.a(mVar)) {
                    i11 = 2;
                    read3 = -1;
                } else {
                    i11 = 2;
                    read3 = mVar.read();
                }
                if (read3 == -1) {
                    break;
                }
                j11 = 0;
                k kVar2 = new k(read4, read5, read3);
                mVar.reset();
                mVar.mark(kVar2.b() + 2);
                int b11 = kVar2.b();
                byte[] bArr = new byte[b11];
                bArr[0] = -1;
                bArr[1] = (byte) read4;
                int i20 = b11 - 2;
                int i21 = 0;
                while (i21 < i20) {
                    c10 = 3;
                    try {
                        int read6 = mVar.read(bArr, i11 + i21, i20 - i21);
                        if (read6 <= 0) {
                            throw new EOFException();
                        }
                        i21 += read6;
                    } catch (EOFException unused) {
                        i12 = 1;
                        i13 = 5;
                        w1Var = null;
                        if (w1Var != null) {
                        }
                    }
                }
                c10 = 3;
                w1Var = new w1(kVar2, bArr, false, 8);
                if (kVar2.g == 0 && kVar2.b == 1) {
                    j jVar = new j();
                    jVar.a = (short) -1;
                    jVar.a(bArr[i11]);
                    jVar.a(bArr[3]);
                    i12 = 1;
                    int i22 = iArr[kVar2.e][kVar2.a];
                    for (int i23 = 0; i23 < i22; i23++) {
                        jVar.a(bArr[i23 + 6]);
                    }
                    i13 = 5;
                } else {
                    i12 = 1;
                    i13 = 5;
                }
                int read7 = sVar2.a(mVar) ? -1 : mVar.read();
                int read8 = sVar2.a(mVar) ? -1 : mVar.read();
                if (read7 == -1 || read8 == -1) {
                    break;
                }
                if (read7 == 255 && (read8 & 254) == (read4 & 254)) {
                    int read9 = sVar2.a(mVar) ? -1 : mVar.read();
                    int read10 = sVar2.a(mVar) ? -1 : mVar.read();
                    if (read9 == -1 || read10 == -1) {
                        break;
                    }
                    if (new k(read8, read9, read10).d(kVar2)) {
                        mVar.reset();
                        long j13 = i20;
                        long j14 = 0;
                        while (j14 < j13) {
                            long skip = mVar.skip(j13 - j14);
                            if (skip <= 0) {
                                throw new EOFException();
                            }
                            j14 += skip;
                        }
                    }
                }
                mVar.reset();
            }
            i19 = read4;
            read4 = sVar2.a(mVar) ? -1 : mVar.read();
        }
        if (w1Var != null) {
            throw new i("No audio frame");
        }
        byte[] bArr2 = (byte[]) w1Var.b;
        k kVar3 = (k) w1Var.c;
        int i24 = iArr[kVar3.e][kVar3.a];
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
            return kVar3.c(i14 * bArr2.length);
        }
        long length = mVar.b - bArr2.length;
        long length2 = bArr2.length;
        int a2 = kVar3.a();
        long j15 = a2;
        int c11 = 10000 / ((int) kVar3.c(kVar3.b()));
        int i26 = 0;
        int i27 = i12;
        while (true) {
            k kVar4 = (k) w1Var.c;
            if (i27 == c11 && i26 == 0 && j10 > j11) {
                return kVar4.c(j10 - length);
            }
            mVar.mark(i10);
            if (sVar2.a(mVar)) {
                i15 = i10;
                read = i18;
            } else {
                i15 = i10;
                read = mVar.read();
            }
            if (sVar2.a(mVar)) {
                i16 = c11;
                read2 = i18;
            } else {
                i16 = c11;
                read2 = mVar.read();
            }
            if (read == i18 || read2 == i18) {
                j12 = length;
            } else {
                if (read == 255 && (read2 & 224) == 224) {
                    int read11 = sVar2.a(mVar) ? -1 : mVar.read();
                    int read12 = sVar2.a(mVar) ? -1 : mVar.read();
                    j12 = length;
                    if (read11 != -1 && read12 != -1) {
                        try {
                            kVar = new k(read2, read11, read12);
                            i17 = i13;
                        } catch (i e) {
                            int i28 = mVar.d + 1;
                            mVar.d = i28;
                            i17 = i13;
                            if (i28 > i17) {
                                throw e;
                            }
                            kVar = null;
                        }
                        if (kVar != null && kVar.d(kVar4)) {
                            int b12 = kVar.b();
                            byte[] bArr3 = new byte[b12];
                            bArr3[0] = (byte) read;
                            bArr3[i12] = (byte) read2;
                            bArr3[i11] = (byte) read11;
                            bArr3[c10] = (byte) read12;
                            int i29 = b12 - 4;
                            int i30 = 0;
                            while (i30 < i29) {
                                try {
                                    int read13 = mVar.read(bArr3, i15 + i30, i29 - i30);
                                    if (read13 <= 0) {
                                        throw new EOFException();
                                    }
                                    i30 += read13;
                                } catch (EOFException unused2) {
                                }
                            }
                            w1Var = new w1(kVar, bArr3, false, 8);
                            if (w1Var == null) {
                                return (((length2 * 1000) * i27) * 8) / j15;
                            }
                            int a10 = ((k) w1Var.c).a();
                            if (a10 != a2) {
                                i26 = i12;
                            }
                            j15 += a10;
                            length2 += ((byte[]) w1Var.b).length;
                            i27++;
                            sVar2 = sVar;
                            i13 = i17;
                            i10 = i15;
                            c11 = i16;
                            length = j12;
                            i18 = -1;
                        }
                    }
                } else {
                    j12 = length;
                    i17 = i13;
                }
                mVar.reset();
                w1Var = null;
                if (w1Var == null) {
                }
            }
            i17 = i13;
            w1Var = null;
            if (w1Var == null) {
            }
        }
    }
}
