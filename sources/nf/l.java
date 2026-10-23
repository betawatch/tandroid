package nf;

import c3.u;
import i2.o1;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.w0;
import m.g3;
import mi.q;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class l extends lf.a {
    public static final Logger r = Logger.getLogger(l.class.getName());

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
    
        r2.d.u(r2.a.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0220, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0259, code lost:
    
        r2.d.u(r2.a.e());
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
        g3 g3Var;
        Logger logger;
        of.a aVar;
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
                w0 w0Var = new w0(dVar, 7);
                byte[] bArr = new byte[3];
                int i11 = 0;
                for (int i12 = 3; i11 < i12; i12 = 3) {
                    long j15 = j14;
                    int read = ((com.google.firebase.messaging.d) w0Var.b).read(bArr, i11, 3 - i11);
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
                byte n10 = w0Var.n();
                hVar.a = n10;
                if (n10 != 2 && n10 != 3 && n10 != 4) {
                    throw new c(o1.k(n10, "Unsupported ID3v2 version: "));
                }
                byte n11 = w0Var.n();
                byte n12 = w0Var.n();
                int r10 = w0Var.r();
                hVar.b = r10 + 10;
                if (n10 == 2) {
                    hVar.d = (n12 & 128) != 0;
                    hVar.e = (n12 & 64) != 0;
                    b11 = n11;
                } else {
                    hVar.d = (n12 & 128) != 0;
                    if ((n12 & 64) == 0) {
                        b11 = n11;
                        b12 = n12;
                    } else if (n10 == 3) {
                        int q6 = w0Var.q();
                        w0Var.n();
                        w0Var.n();
                        w0Var.q();
                        b11 = n11;
                        b12 = n12;
                        w0Var.u(q6 - 6);
                    } else {
                        b11 = n11;
                        b12 = n12;
                        w0Var.u(w0Var.r() - 4);
                    }
                    if (n10 >= 4 && (b12 & 16) != 0) {
                        hVar.c = 10;
                        hVar.b = r10 + 20;
                    }
                }
                int i13 = (int) (dVar.b - j16);
                gVar.a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(n10), Integer.valueOf(b11));
                int i14 = hVar.b;
                if (hVar.e) {
                    throw new c("Tag compression is not supported");
                }
                if (n10 >= 4 || !hVar.d) {
                    logger = logger2;
                    g3Var = new g3(mVar, i13, (i14 - i13) - hVar.c, hVar);
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
                    g3Var = new g3(new ByteArrayInputStream(bArr2, 0, i17), i13, i17, hVar);
                    logger = logger2;
                }
                w0 w0Var2 = (w0) g3Var.d;
                of.a aVar2 = (of.a) g3Var.b;
                while (true) {
                    try {
                        if (aVar2.e() <= 10) {
                            aVar = aVar2;
                            break;
                        }
                        f fVar = new f(g3Var);
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
                                w0Var2.u(aVar.e());
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
                                    u uVar = new u();
                                    uVar.a = j10 - 128;
                                    this.b = b(mVar, j10, uVar);
                                } catch (i e7) {
                                    Logger logger3 = r;
                                    if (logger3.isLoggable(level)) {
                                        logger3.log(level, "Could not determine MP3 duration", (Throwable) e7);
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
                            w0Var2.u(i19);
                            aVar2 = aVar;
                        } else if (logger.isLoggable(level)) {
                            logger.log(level, "ID3 frame claims to extend frames area");
                        }
                    } catch (c e10) {
                        e = e10;
                        aVar = aVar2;
                    }
                }
                w0Var2.u(aVar.e());
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
            u uVar2 = new u();
            uVar2.a = j10 - 128;
            this.b = b(mVar, j10, uVar2);
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
            int b15 = o1.b(bArr3[127]);
            r2 = b15 != 0 ? o1.d(b15) : null;
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

    /* JADX WARN: Code restructure failed: missing block: B:161:0x00db, code lost:
    
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
    /* JADX WARN: Removed duplicated region for block: B:104:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(m mVar, long j10, u uVar) {
        int[][] iArr;
        int i10;
        int i11;
        int i12;
        long j11;
        char c10;
        int i13;
        q qVar;
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
        u uVar2 = uVar;
        int i18 = -1;
        int read4 = uVar2.a(mVar) ? -1 : mVar.read();
        int i19 = 0;
        while (true) {
            iArr = k.m;
            i10 = 4;
            if (read4 == -1) {
                break;
            }
            if (i19 == 255 && (read4 & 224) == 224) {
                mVar.mark(2);
                int read5 = uVar2.a(mVar) ? -1 : mVar.read();
                if (read5 == -1) {
                    break;
                }
                if (uVar2.a(mVar)) {
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
                        qVar = null;
                        if (qVar != null) {
                        }
                    }
                }
                c10 = 3;
                qVar = new q(kVar2, bArr, false, 6);
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
                int read7 = uVar2.a(mVar) ? -1 : mVar.read();
                int read8 = uVar2.a(mVar) ? -1 : mVar.read();
                if (read7 == -1 || read8 == -1) {
                    break;
                }
                if (read7 == 255 && (read8 & 254) == (read4 & 254)) {
                    int read9 = uVar2.a(mVar) ? -1 : mVar.read();
                    int read10 = uVar2.a(mVar) ? -1 : mVar.read();
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
            read4 = uVar2.a(mVar) ? -1 : mVar.read();
        }
        if (qVar != null) {
            throw new i("No audio frame");
        }
        byte[] bArr2 = (byte[]) qVar.b;
        k kVar3 = (k) qVar.c;
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
            k kVar4 = (k) qVar.c;
            if (i27 == c11 && i26 == 0 && j10 > j11) {
                return kVar4.c(j10 - length);
            }
            mVar.mark(i10);
            if (uVar2.a(mVar)) {
                i15 = i10;
                read = i18;
            } else {
                i15 = i10;
                read = mVar.read();
            }
            if (uVar2.a(mVar)) {
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
                    int read11 = uVar2.a(mVar) ? -1 : mVar.read();
                    int read12 = uVar2.a(mVar) ? -1 : mVar.read();
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
                            qVar = new q(kVar, bArr3, false, 6);
                            if (qVar == null) {
                                return (((length2 * 1000) * i27) * 8) / j15;
                            }
                            int a10 = ((k) qVar.c).a();
                            if (a10 != a2) {
                                i26 = i12;
                            }
                            j15 += a10;
                            length2 += ((byte[]) qVar.b).length;
                            i27++;
                            uVar2 = uVar;
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
                qVar = null;
                if (qVar == null) {
                }
            }
            i17 = i13;
            qVar = null;
            if (qVar == null) {
            }
        }
    }
}
