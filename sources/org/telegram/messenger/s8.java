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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class s8 implements j2.h, j7 {
    public static final ConcurrentHashMap H = new ConcurrentHashMap();
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public boolean D = true;
    public final ArrayList E = new ArrayList(1);
    public int F;
    public j2.m G;
    public i7 a;
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

    public static Uri f(int i7, Object obj, TLRPC.Document document) {
        String r10 = w7.r(null, document);
        w7.G(i7);
        File I2 = w7.I(document);
        if (I2 != null && I2.exists()) {
            return Uri.fromFile(I2);
        }
        try {
            StringBuilder sb2 = new StringBuilder("?account=");
            sb2.append(i7);
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
            sb2.append(w7.G(i7).F(obj));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(w7.B(document), "UTF-8"));
            sb2.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb2.append(Utilities.f(bArr));
            return Uri.parse("tg://" + r10 + sb2.toString());
        } catch (UnsupportedEncodingException e10) {
            a8.g(e10, true);
            return null;
        }
    }

    @Override // org.telegram.messenger.j7
    public final void a() {
        CountDownLatch countDownLatch = this.n;
        this.n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // j2.h
    public final void addTransferListener(j2.d0 d0Var) {
        d0Var.getClass();
        ArrayList arrayList = this.E;
        if (arrayList.contains(d0Var)) {
            return;
        }
        arrayList.add(d0Var);
        this.F++;
    }

    @Override // j2.h
    public final void close() {
        a8.d("FileStreamLoadOperation " + this.s.id + " close me=" + this);
        i7 i7Var = this.a;
        int i7 = 0;
        if (i7Var != null) {
            Utilities.d.c(new e7(i7Var, this, i7));
        }
        RandomAccessFile randomAccessFile = this.r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.r = null;
        }
        this.b = null;
        H.remove(Long.valueOf(this.s.id));
        if (this.f) {
            this.f = false;
            j2.m mVar = this.G;
            String str = h2.m0.a;
            while (i7 < this.F) {
                ((b3.g) ((j2.d0) this.E.get(i7))).f(mVar, this.D);
                i7++;
            }
            this.G = null;
        }
        CountDownLatch countDownLatch = this.n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.n = null;
        }
    }

    public final void d(int i7) {
        j2.m mVar = this.G;
        String str = h2.m0.a;
        for (int i10 = 0; i10 < this.F; i10++) {
            j2.d0 d0Var = (j2.d0) this.E.get(i10);
            boolean z9 = this.D;
            b3.g gVar = (b3.g) d0Var;
            synchronized (gVar) {
                if (z9) {
                    if (mVar != null) {
                        try {
                            if ((mVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    gVar.i += i7;
                }
            }
        }
    }

    public final int e() {
        Integer num = (Integer) ConcurrentMap$-EL.getOrDefault(I, Long.valueOf(this.s.id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    @Override // j2.h
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // j2.h
    public final Uri getUri() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0251  */
    @Override // j2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(j2.m mVar) {
        int i7;
        TLRPC.TL_document tL_document;
        ArrayList arrayList = this.E;
        Uri uri = mVar.a;
        long j3 = mVar.e;
        this.b = uri;
        for (int i10 = 0; i10 < this.F; i10++) {
            ((j2.d0) arrayList.get(i10)).getClass();
        }
        int intValue = Utilities.z(this.b.getQueryParameter("account")).intValue();
        this.x = intValue;
        this.w = w7.G(intValue).G.get(Utilities.z(this.b.getQueryParameter("rid")));
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
        this.h = j3;
        this.e = mVar.f;
        w7 G = w7.G(this.x);
        TLRPC.TL_document tL_document3 = this.s;
        Object obj = this.w;
        long j10 = this.h;
        int e10 = e();
        int i11 = tL_document3 == null ? 1 : 0;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        i7[] i7VarArr = new i7[1];
        w7.J.c(new o7(G, i7VarArr, tL_document3, null, obj, e10, this, j10, false, i11, countDownLatch));
        w7.a(countDownLatch, true);
        this.a = i7VarArr[0];
        this.d = 0L;
        long j11 = this.s.size - j3;
        this.c = j11;
        long j12 = this.e;
        if (j12 != -1) {
            this.c = Math.min(j11, j12);
        }
        this.f = true;
        this.G = mVar;
        for (int i12 = 0; i12 < this.F; i12++) {
            ((b3.g) ((j2.d0) arrayList.get(i12))).g(mVar, this.D);
        }
        i7 i7Var = this.a;
        if (i7Var != null) {
            File g10 = i7Var.g();
            this.y = g10;
            if (g10 != null) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.y, "r");
                    this.r = randomAccessFile;
                    randomAccessFile.seek(this.h);
                } catch (Throwable unused) {
                }
                if (this.a.Y == 3) {
                    i7 = 0;
                    try {
                        this.D = false;
                        long length = this.y.length() - this.h;
                        this.c = length;
                        long j13 = this.e;
                        if (j13 != -1) {
                            this.c = Math.min(length, j13 - this.d);
                        }
                    } catch (Throwable unused2) {
                    }
                    a8.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
                    StringBuilder sb2 = new StringBuilder("FileStreamLoadOperation ");
                    sb2.append(this.s.id);
                    sb2.append(" ");
                    sb2.append(ij.i2(this.s));
                    sb2.append("x");
                    sb2.append(ij.i2(this.s));
                    sb2.append(" mime_type=");
                    sb2.append(this.s.mime_type);
                    sb2.append(" codec=");
                    tL_document = this.s;
                    String str = null;
                    if (tL_document != null) {
                        int size = tL_document.attributes.size();
                        int i13 = i7;
                        while (true) {
                            if (i13 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = tL_document.attributes.get(i13);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                str = ((TLRPC.TL_documentAttributeVideo) documentAttribute).video_codec;
                                break;
                            }
                            i13++;
                        }
                    }
                    sb2.append(str);
                    sb2.append(" size=");
                    sb2.append(this.s.size);
                    a8.d(sb2.toString());
                    return this.c;
                }
            }
        }
        i7 = 0;
        a8.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
        StringBuilder sb22 = new StringBuilder("FileStreamLoadOperation ");
        sb22.append(this.s.id);
        sb22.append(" ");
        sb22.append(ij.i2(this.s));
        sb22.append("x");
        sb22.append(ij.i2(this.s));
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
        a8.d(sb22.toString());
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
    @Override // e2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        int i13;
        File file;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        int i14 = i10;
        int i15 = 0;
        if (i14 == 0) {
            return 0;
        }
        long j3 = this.c;
        if (j3 == 0) {
            return -1;
        }
        if (j3 < i14) {
            i14 = (int) j3;
        }
        int i16 = i14;
        int i17 = 0;
        while (true) {
            if (i17 == 0) {
                try {
                    if (!this.f) {
                    }
                    i7 i7Var = this.a;
                    i7Var.getClass();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    ?? r62 = new long[2];
                    Utilities.d.c(new l9(i7Var, (Serializable) r62, this.h, i16, countDownLatch, 2));
                    countDownLatch.await();
                    i11 = (int) r62[i15];
                    if (i11 != 0) {
                        this.n = new CountDownLatch(1);
                        w7 G = w7.G(this.x);
                        TLRPC.TL_document tL_document = this.s;
                        Object obj = this.w;
                        long j10 = this.h;
                        int e10 = e();
                        int i18 = tL_document == null ? 1 : i15;
                        CountDownLatch countDownLatch2 = new CountDownLatch(1);
                        i7[] i7VarArr = new i7[1];
                        i12 = i11;
                        i13 = i15;
                        w7.J.c(new o7(G, i7VarArr, tL_document, null, obj, e10, this, j10, false, i18, countDownLatch2));
                        w7.a(countDownLatch2, true);
                        i7 i7Var2 = i7VarArr[i13 == true ? 1 : 0];
                        i7 i7Var3 = this.a;
                        if (i7Var3 != i7Var2) {
                            i7Var3.getClass();
                            Utilities.d.c(new e7(i7Var3, this, 0));
                            this.a = i7Var2;
                        }
                        CountDownLatch countDownLatch3 = this.n;
                        if (countDownLatch3 != null) {
                            countDownLatch3.await();
                            this.n = null;
                        }
                    } else {
                        i12 = i11;
                        i13 = i15;
                    }
                    i7 i7Var4 = this.a;
                    file = (i7Var4.Y == 3 || i7Var4.z || !i7Var4.O0) ? i7Var4.J0 : i7Var4.L0;
                    if (this.r != null || !Objects.equals(this.y, file)) {
                        if (r2.a) {
                            a8.b("check stream file " + file);
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
                                if ((this.a.Y == 3 ? true : i13) != false) {
                                    this.D = i13;
                                    long length = this.y.length() - this.h;
                                    this.c = length;
                                    long j11 = this.e;
                                    if (j11 != -1) {
                                        this.c = Math.min(length, j11 - this.d);
                                    }
                                }
                            } catch (Throwable unused2) {
                                if ((this.a.Y == 3) && !this.y.exists()) {
                                    w7.G(this.x).e(null, null, null, null, null, this.a.r);
                                    w7 G2 = w7.G(this.x);
                                    TLRPC.TL_document tL_document2 = this.s;
                                    Object obj2 = this.w;
                                    long j12 = this.h;
                                    int e11 = e();
                                    int i19 = tL_document2 == null ? 1 : 0;
                                    CountDownLatch countDownLatch4 = new CountDownLatch(1);
                                    i7[] i7VarArr2 = new i7[1];
                                    w7.J.c(new o7(G2, i7VarArr2, tL_document2, null, obj2, e11, this, j12, false, i19, countDownLatch4));
                                    w7.a(countDownLatch4, true);
                                    i7 i7Var5 = i7VarArr2[0];
                                    i7 i7Var6 = this.a;
                                    if (i7Var6 != i7Var5) {
                                        i7Var6.getClass();
                                        Utilities.d.c(new e7(i7Var6, this, 0));
                                        this.a = i7Var5;
                                    }
                                }
                            }
                        }
                    }
                    i17 = i12;
                    i15 = 0;
                } catch (InterruptedException e12) {
                    a8.g(e12, true);
                    return -3;
                } catch (Exception e13) {
                    throw new IOException(e13);
                }
            }
            randomAccessFile2 = this.r;
            if (randomAccessFile2 != null) {
                break;
            }
            i7 i7Var7 = this.a;
            i7Var7.getClass();
            CountDownLatch countDownLatch5 = new CountDownLatch(1);
            ?? r622 = new long[2];
            Utilities.d.c(new l9(i7Var7, (Serializable) r622, this.h, i16, countDownLatch5, 2));
            countDownLatch5.await();
            i11 = (int) r622[i15];
            if (i11 != 0) {
            }
            i7 i7Var42 = this.a;
            if (i7Var42.Y == 3) {
            }
            if (this.r != null) {
            }
            if (r2.a) {
            }
            randomAccessFile = this.r;
            if (randomAccessFile != null) {
            }
            this.y = file;
            if (file == null) {
            }
            i17 = i12;
            i15 = 0;
        }
        if (!this.f) {
            return 0;
        }
        int read = randomAccessFile2.read(bArr, i7, i17);
        if (read > 0) {
            long j13 = read;
            this.h += j13;
            this.c -= j13;
            this.d += j13;
            d(read);
        }
        return read;
    }
}
