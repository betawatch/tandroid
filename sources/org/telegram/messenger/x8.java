package org.telegram.messenger;

import android.net.Uri;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$-EL;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x8 implements g2.h, n7 {
    public static final ConcurrentHashMap H = new ConcurrentHashMap();
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public boolean D = true;
    public final ArrayList E = new ArrayList(1);
    public int F;
    public g2.n G;
    public m7 a;
    public Uri b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public long h;
    public CountDownLatch n;
    public RandomAccessFile r;
    public TLRPC.TL_document s;
    public Object w;
    public int x;
    public File y;

    public static Uri f(int i10, Object obj, TLRPC.Document document) {
        String r10 = b8.r(null, document);
        b8.G(i10);
        File I2 = b8.I(document);
        if (I2 != null && I2.exists()) {
            return Uri.fromFile(I2);
        }
        try {
            StringBuilder sb2 = new StringBuilder("?account=");
            sb2.append(i10);
            sb2.append("&id=");
            sb2.append(document.id);
            sb2.append("&hash=");
            sb2.append(document.access_hash);
            sb2.append("&dc=");
            sb2.append(document.dc_id);
            sb2.append("&size=");
            sb2.append(document.size);
            sb2.append("&mime=");
            sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb2.append("&rid=");
            sb2.append(b8.G(i10).F(obj));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(b8.B(document), "UTF-8"));
            sb2.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb2.append(Utilities.f(bArr));
            return Uri.parse("tg://" + r10 + sb2.toString());
        } catch (UnsupportedEncodingException e) {
            f8.g(e, true);
            return null;
        }
    }

    @Override // org.telegram.messenger.n7
    public final void a() {
        CountDownLatch countDownLatch = this.n;
        this.n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // g2.h
    public final void addTransferListener(g2.d0 d0Var) {
        d0Var.getClass();
        ArrayList arrayList = this.E;
        if (arrayList.contains(d0Var)) {
            return;
        }
        arrayList.add(d0Var);
        this.F++;
    }

    public final void c(int i10) {
        g2.n nVar = this.G;
        String str = e2.l0.a;
        for (int i11 = 0; i11 < this.F; i11++) {
            g2.d0 d0Var = (g2.d0) this.E.get(i11);
            boolean z10 = this.D;
            y2.f fVar = (y2.f) d0Var;
            synchronized (fVar) {
                if (z10) {
                    if (nVar != null) {
                        try {
                            if ((nVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    fVar.i += i10;
                }
            }
        }
    }

    @Override // g2.h
    public final void close() {
        f8.d("FileStreamLoadOperation " + this.s.id + " close me=" + this);
        m7 m7Var = this.a;
        int i10 = 0;
        if (m7Var != null) {
            Utilities.d.c(new i7(m7Var, this, i10));
        }
        RandomAccessFile randomAccessFile = this.r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                f8.g(e, true);
            }
            this.r = null;
        }
        this.b = null;
        H.remove(Long.valueOf(this.s.id));
        if (this.f) {
            this.f = false;
            g2.n nVar = this.G;
            String str = e2.l0.a;
            while (i10 < this.F) {
                ((y2.f) ((g2.d0) this.E.get(i10))).f(nVar, this.D);
                i10++;
            }
            this.G = null;
        }
        CountDownLatch countDownLatch = this.n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.n = null;
        }
    }

    public final int e() {
        Integer num = (Integer) ConcurrentMap$-EL.getOrDefault(I, Long.valueOf(this.s.id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    @Override // g2.h
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // g2.h
    public final Uri getUri() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0251  */
    @Override // g2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(g2.n nVar) {
        int i10;
        TLRPC.TL_document tL_document;
        ArrayList arrayList = this.E;
        Uri uri = nVar.a;
        long j10 = nVar.e;
        this.b = uri;
        for (int i11 = 0; i11 < this.F; i11++) {
            ((g2.d0) arrayList.get(i11)).getClass();
        }
        int intValue = Utilities.z(this.b.getQueryParameter("account")).intValue();
        this.x = intValue;
        this.w = b8.G(intValue).G.get(Utilities.z(this.b.getQueryParameter("rid")));
        TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
        this.s = tL_document2;
        tL_document2.access_hash = Utilities.A(this.b.getQueryParameter("hash")).longValue();
        this.s.id = Utilities.A(this.b.getQueryParameter("id")).longValue();
        this.s.size = Utilities.A(this.b.getQueryParameter("size")).longValue();
        this.s.dc_id = Utilities.z(this.b.getQueryParameter("dc")).intValue();
        this.s.mime_type = this.b.getQueryParameter("mime");
        this.s.file_reference = Utilities.v(this.b.getQueryParameter("reference"));
        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
        tL_documentAttributeFilename.file_name = this.b.getQueryParameter("name");
        this.s.attributes.add(tL_documentAttributeFilename);
        if (this.s.mime_type.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            this.s.attributes.add(new TLRPC.TL_documentAttributeVideo());
        } else if (this.s.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            this.s.attributes.add(new TLRPC.TL_documentAttributeAudio());
        }
        H.put(Long.valueOf(this.s.id), this);
        this.h = j10;
        this.e = nVar.f;
        b8 G = b8.G(this.x);
        TLRPC.TL_document tL_document3 = this.s;
        Object obj = this.w;
        long j11 = this.h;
        int e = e();
        int i12 = tL_document3 == null ? 1 : 0;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m7[] m7VarArr = new m7[1];
        b8.J.c(new t7(G, m7VarArr, tL_document3, null, obj, e, this, j11, false, i12, countDownLatch));
        b8.a(countDownLatch, true);
        this.a = m7VarArr[0];
        this.d = 0L;
        long j12 = this.s.size - j10;
        this.c = j12;
        long j13 = this.e;
        if (j13 != -1) {
            this.c = Math.min(j12, j13);
        }
        this.f = true;
        this.G = nVar;
        for (int i13 = 0; i13 < this.F; i13++) {
            ((y2.f) ((g2.d0) arrayList.get(i13))).g(nVar, this.D);
        }
        m7 m7Var = this.a;
        if (m7Var != null) {
            File g10 = m7Var.g();
            this.y = g10;
            if (g10 != null) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.y, "r");
                    this.r = randomAccessFile;
                    randomAccessFile.seek(this.h);
                } catch (Throwable unused) {
                }
                if (this.a.Y == 3) {
                    i10 = 0;
                    try {
                        this.D = false;
                        long length = this.y.length() - this.h;
                        this.c = length;
                        long j14 = this.e;
                        if (j14 != -1) {
                            this.c = Math.min(length, j14 - this.d);
                        }
                    } catch (Throwable unused2) {
                    }
                    f8.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
                    StringBuilder sb2 = new StringBuilder("FileStreamLoadOperation ");
                    sb2.append(this.s.id);
                    sb2.append(" ");
                    sb2.append(jj.i2(this.s));
                    sb2.append("x");
                    sb2.append(jj.i2(this.s));
                    sb2.append(" mime_type=");
                    sb2.append(this.s.mime_type);
                    sb2.append(" codec=");
                    tL_document = this.s;
                    String str = null;
                    if (tL_document != null) {
                        int size = tL_document.attributes.size();
                        int i14 = i10;
                        while (true) {
                            if (i14 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = tL_document.attributes.get(i14);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                str = ((TLRPC.TL_documentAttributeVideo) documentAttribute).video_codec;
                                break;
                            }
                            i14++;
                        }
                    }
                    sb2.append(str);
                    sb2.append(" size=");
                    sb2.append(this.s.size);
                    f8.d(sb2.toString());
                    return this.c;
                }
            }
        }
        i10 = 0;
        f8.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
        StringBuilder sb22 = new StringBuilder("FileStreamLoadOperation ");
        sb22.append(this.s.id);
        sb22.append(" ");
        sb22.append(jj.i2(this.s));
        sb22.append("x");
        sb22.append(jj.i2(this.s));
        sb22.append(" mime_type=");
        sb22.append(this.s.mime_type);
        sb22.append(" codec=");
        tL_document = this.s;
        String str2 = null;
        if (tL_document != null) {
        }
        sb22.append(str2);
        sb22.append(" size=");
        sb22.append(this.s.size);
        f8.d(sb22.toString());
        return this.c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:13|(13:109|110|(1:112)|17|18|19|20|(6:22|(1:24)(1:96)|25|(1:27)|28|(1:30))(1:97)|31|(1:95)(1:37)|38|(6:44|(1:46)|47|(2:91|92)|49|(4:51|52|(1:54)(1:62)|(2:56|(2:58|59)(1:60))(1:61))(1:90))(1:42)|43)|15|(1:100)|17|18|19|20|(0)(0)|31|(1:33)|95|38|(1:40)|44|(0)|47|(0)|49|(0)(0)|43) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: Exception -> 0x0025, InterruptedException -> 0x0028, TryCatch #5 {InterruptedException -> 0x0028, Exception -> 0x0025, blocks: (B:110:0x0020, B:17:0x002f, B:20:0x005a, B:22:0x005f, B:25:0x007b, B:27:0x00a2, B:28:0x00b2, B:30:0x00b6, B:31:0x00c1, B:33:0x00c8, B:35:0x00cc, B:37:0x00d0, B:38:0x00d5, B:40:0x00d9, B:44:0x00e1, B:46:0x00e5, B:47:0x00f9, B:49:0x0100, B:64:0x0142, B:68:0x014d, B:70:0x0155, B:73:0x0183, B:75:0x01a1, B:95:0x00d3, B:15:0x002b, B:101:0x01b6, B:104:0x01bd, B:106:0x01c7, B:52:0x0104, B:56:0x0120, B:58:0x0137), top: B:109:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[Catch: Exception -> 0x0025, InterruptedException -> 0x0028, TryCatch #5 {InterruptedException -> 0x0028, Exception -> 0x0025, blocks: (B:110:0x0020, B:17:0x002f, B:20:0x005a, B:22:0x005f, B:25:0x007b, B:27:0x00a2, B:28:0x00b2, B:30:0x00b6, B:31:0x00c1, B:33:0x00c8, B:35:0x00cc, B:37:0x00d0, B:38:0x00d5, B:40:0x00d9, B:44:0x00e1, B:46:0x00e5, B:47:0x00f9, B:49:0x0100, B:64:0x0142, B:68:0x014d, B:70:0x0155, B:73:0x0183, B:75:0x01a1, B:95:0x00d3, B:15:0x002b, B:101:0x01b6, B:104:0x01bd, B:106:0x01c7, B:52:0x0104, B:56:0x0120, B:58:0x0137), top: B:109:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bd  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable, long[]] */
    @Override // b2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        File file;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        int i15 = i11;
        int i16 = 0;
        if (i15 == 0) {
            return 0;
        }
        long j10 = this.c;
        if (j10 == 0) {
            return -1;
        }
        if (j10 < i15) {
            i15 = (int) j10;
        }
        int i17 = i15;
        int i18 = 0;
        while (true) {
            if (i18 == 0) {
                try {
                    if (!this.f) {
                    }
                    m7 m7Var = this.a;
                    m7Var.getClass();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    ?? r62 = new long[2];
                    Utilities.d.c(new m9(m7Var, (Serializable) r62, this.h, i17, countDownLatch, 2));
                    countDownLatch.await();
                    i12 = (int) r62[i16];
                    if (i12 != 0) {
                        this.n = new CountDownLatch(1);
                        b8 G = b8.G(this.x);
                        TLRPC.TL_document tL_document = this.s;
                        Object obj = this.w;
                        long j11 = this.h;
                        int e = e();
                        int i19 = tL_document == null ? 1 : i16;
                        CountDownLatch countDownLatch2 = new CountDownLatch(1);
                        m7[] m7VarArr = new m7[1];
                        i13 = i12;
                        i14 = i16;
                        b8.J.c(new t7(G, m7VarArr, tL_document, null, obj, e, this, j11, false, i19, countDownLatch2));
                        b8.a(countDownLatch2, true);
                        m7 m7Var2 = m7VarArr[i14 == true ? 1 : 0];
                        m7 m7Var3 = this.a;
                        if (m7Var3 != m7Var2) {
                            m7Var3.getClass();
                            Utilities.d.c(new i7(m7Var3, this, 0));
                            this.a = m7Var2;
                        }
                        CountDownLatch countDownLatch3 = this.n;
                        if (countDownLatch3 != null) {
                            countDownLatch3.await();
                            this.n = null;
                        }
                    } else {
                        i13 = i12;
                        i14 = i16;
                    }
                    m7 m7Var4 = this.a;
                    file = (m7Var4.Y == 3 || m7Var4.z || !m7Var4.O0) ? m7Var4.J0 : m7Var4.L0;
                    if (this.r != null || !Objects.equals(this.y, file)) {
                        if (v2.a) {
                            f8.b("check stream file " + file);
                        }
                        randomAccessFile = this.r;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Exception unused) {
                            }
                        }
                        this.y = file;
                        if (file == null) {
                            try {
                                RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.y, "r");
                                this.r = randomAccessFile3;
                                randomAccessFile3.seek(this.h);
                                if ((this.a.Y == 3 ? true : i14) != false) {
                                    this.D = i14;
                                    long length = this.y.length() - this.h;
                                    this.c = length;
                                    long j12 = this.e;
                                    if (j12 != -1) {
                                        this.c = Math.min(length, j12 - this.d);
                                    }
                                }
                            } catch (Throwable unused2) {
                                if ((this.a.Y == 3) && !this.y.exists()) {
                                    b8.G(this.x).e(null, null, null, null, null, this.a.r);
                                    b8 G2 = b8.G(this.x);
                                    TLRPC.TL_document tL_document2 = this.s;
                                    Object obj2 = this.w;
                                    long j13 = this.h;
                                    int e7 = e();
                                    int i20 = tL_document2 == null ? 1 : 0;
                                    CountDownLatch countDownLatch4 = new CountDownLatch(1);
                                    m7[] m7VarArr2 = new m7[1];
                                    b8.J.c(new t7(G2, m7VarArr2, tL_document2, null, obj2, e7, this, j13, false, i20, countDownLatch4));
                                    b8.a(countDownLatch4, true);
                                    m7 m7Var5 = m7VarArr2[0];
                                    m7 m7Var6 = this.a;
                                    if (m7Var6 != m7Var5) {
                                        m7Var6.getClass();
                                        Utilities.d.c(new i7(m7Var6, this, 0));
                                        this.a = m7Var5;
                                    }
                                }
                            }
                        }
                    }
                    i18 = i13;
                    i16 = 0;
                } catch (InterruptedException e10) {
                    f8.g(e10, true);
                    return -3;
                } catch (Exception e11) {
                    throw new IOException(e11);
                }
            }
            randomAccessFile2 = this.r;
            if (randomAccessFile2 != null) {
                break;
            }
            m7 m7Var7 = this.a;
            m7Var7.getClass();
            CountDownLatch countDownLatch5 = new CountDownLatch(1);
            ?? r622 = new long[2];
            Utilities.d.c(new m9(m7Var7, (Serializable) r622, this.h, i17, countDownLatch5, 2));
            countDownLatch5.await();
            i12 = (int) r622[i16];
            if (i12 != 0) {
            }
            m7 m7Var42 = this.a;
            if (m7Var42.Y == 3) {
            }
            if (this.r != null) {
            }
            if (v2.a) {
            }
            randomAccessFile = this.r;
            if (randomAccessFile != null) {
            }
            this.y = file;
            if (file == null) {
            }
            i18 = i13;
            i16 = 0;
        }
        if (!this.f) {
            return 0;
        }
        int read = randomAccessFile2.read(bArr, i10, i18);
        if (read > 0) {
            long j14 = read;
            this.h += j14;
            this.c -= j14;
            this.d += j14;
            c(read);
        }
        return read;
    }
}
