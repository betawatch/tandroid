// default package

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kd4 implements a83, mb4 {
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public boolean E = true;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public g83 H;
    public lb4 a;
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

    public static Uri j(int i, Object obj, TLRPC.Document document) {
        String r = bc4.r(null, document);
        bc4.G(i);
        File I2 = bc4.I(document);
        if (I2 != null && I2.exists()) {
            return Uri.fromFile(I2);
        }
        try {
            StringBuilder sb = new StringBuilder("?account=");
            sb.append(i);
            sb.append("&id=");
            sb.append(document.id);
            sb.append("&hash=");
            sb.append(document.access_hash);
            sb.append("&dc=");
            sb.append(document.dc_id);
            sb.append("&size=");
            sb.append(document.size);
            sb.append("&mime=");
            sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb.append("&rid=");
            sb.append(bc4.G(i).F(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(bc4.B(document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb.append(Utilities.f(bArr));
            return Uri.parse("tg://" + r + sb.toString());
        } catch (UnsupportedEncodingException e) {
            fc4.g(e, true);
            return null;
        }
    }

    @Override // mb4
    public final void a() {
        CountDownLatch countDownLatch = this.n;
        this.n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // a83
    public final void addTransferListener(w0c w0cVar) {
        w0cVar.getClass();
        ArrayList arrayList = this.F;
        if (arrayList.contains(w0cVar)) {
            return;
        }
        arrayList.add(w0cVar);
        this.G++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a83
    public final void close() {
        fc4.d("FileStreamLoadOperation " + this.s.id + " close me=" + this);
        lb4 lb4Var = this.a;
        Object[] objArr = 0;
        if (lb4Var != null) {
            Utilities.d.c(new hb4(lb4Var, this, objArr == true ? 1 : 0));
        }
        RandomAccessFile randomAccessFile = this.r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            this.r = null;
        }
        this.b = null;
        I.remove(Long.valueOf(this.s.id));
        if (this.f) {
            this.f = false;
            g83 g83Var = this.H;
            String str = hac.a;
            for (int i = 0; i < this.G; i++) {
                ((eb3) ((w0c) this.F.get(i))).g(g83Var, this.E);
            }
            this.H = null;
        }
        CountDownLatch countDownLatch = this.n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.n = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if ((r0.h & 8) != 8) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i) {
        g83 g83Var = this.H;
        String str = hac.a;
        for (int i2 = 0; i2 < this.G; i2++) {
            w0c w0cVar = (w0c) this.F.get(i2);
            boolean z = this.E;
            eb3 eb3Var = (eb3) w0cVar;
            synchronized (eb3Var) {
                if (z) {
                    if (g83Var != null) {
                    }
                    eb3Var.i += i;
                }
            }
        }
    }

    @Override // a83
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // a83
    public final Uri getUri() {
        return this.b;
    }

    public final int h() {
        Integer num = (Integer) ConcurrentMap$-EL.getOrDefault(J, Long.valueOf(this.s.id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x024b  */
    @Override // a83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(g83 g83Var) {
        int i;
        TLRPC.TL_document tL_document;
        ArrayList arrayList = this.F;
        Uri uri = g83Var.a;
        long j = g83Var.e;
        this.b = uri;
        for (int i2 = 0; i2 < this.G; i2++) {
            ((w0c) arrayList.get(i2)).getClass();
        }
        int intValue = Utilities.z(this.b.getQueryParameter("account")).intValue();
        this.x = intValue;
        this.w = bc4.G(intValue).H.get(Utilities.z(this.b.getQueryParameter("rid")));
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
        boolean startsWith = this.s.mime_type.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND);
        TLRPC.TL_document tL_document3 = this.s;
        if (startsWith) {
            tL_document3.attributes.add(new TLRPC.TL_documentAttributeVideo());
        } else if (tL_document3.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            this.s.attributes.add(new TLRPC.TL_documentAttributeAudio());
        }
        I.put(Long.valueOf(this.s.id), this);
        this.h = j;
        this.e = g83Var.f;
        bc4 G = bc4.G(this.x);
        TLRPC.TL_document tL_document4 = this.s;
        Object obj = this.w;
        long j2 = this.h;
        int h = h();
        int i3 = tL_document4 == null ? 1 : 0;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        lb4[] lb4VarArr = new lb4[1];
        bc4.K.c(new nb4(G, lb4VarArr, tL_document4, null, obj, h, this, j2, false, i3, countDownLatch));
        bc4.a(countDownLatch, true);
        this.a = lb4VarArr[0];
        this.d = 0L;
        long j3 = this.s.size - j;
        this.c = j3;
        long j4 = this.e;
        if (j4 != -1) {
            this.c = Math.min(j3, j4);
        }
        this.f = true;
        this.H = g83Var;
        for (int i4 = 0; i4 < this.G; i4++) {
            ((eb3) ((w0c) arrayList.get(i4))).h(g83Var, this.E);
        }
        lb4 lb4Var = this.a;
        if (lb4Var != null) {
            File e = lb4Var.e();
            this.y = e;
            if (e != null) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.y, "r");
                    this.r = randomAccessFile;
                    randomAccessFile.seek(this.h);
                } catch (Throwable unused) {
                }
                if (this.a.Y == 3) {
                    i = 0;
                    try {
                        this.E = false;
                        long length = this.y.length() - this.h;
                        this.c = length;
                        long j5 = this.e;
                        if (j5 != -1) {
                            this.c = Math.min(length, j5 - this.d);
                        }
                    } catch (Throwable unused2) {
                    }
                    fc4.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
                    StringBuilder sb = new StringBuilder("FileStreamLoadOperation ");
                    sb.append(this.s.id);
                    sb.append(" ");
                    sb.append(k47.h2(this.s));
                    sb.append("x");
                    sb.append(k47.h2(this.s));
                    sb.append(" mime_type=");
                    sb.append(this.s.mime_type);
                    sb.append(" codec=");
                    tL_document = this.s;
                    String str = null;
                    if (tL_document != null) {
                        int size = tL_document.attributes.size();
                        int i5 = i;
                        while (true) {
                            if (i5 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = tL_document.attributes.get(i5);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                str = ((TLRPC.TL_documentAttributeVideo) documentAttribute).video_codec;
                                break;
                            }
                            i5++;
                        }
                    }
                    sb.append(str);
                    sb.append(" size=");
                    sb.append(this.s.size);
                    fc4.d(sb.toString());
                    return this.c;
                }
            }
        }
        i = 0;
        fc4.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
        StringBuilder sb2 = new StringBuilder("FileStreamLoadOperation ");
        sb2.append(this.s.id);
        sb2.append(" ");
        sb2.append(k47.h2(this.s));
        sb2.append("x");
        sb2.append(k47.h2(this.s));
        sb2.append(" mime_type=");
        sb2.append(this.s.mime_type);
        sb2.append(" codec=");
        tL_document = this.s;
        String str2 = null;
        if (tL_document != null) {
        }
        sb2.append(str2);
        sb2.append(" size=");
        sb2.append(this.s.size);
        fc4.d(sb2.toString());
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0022, code lost:
    
        if (r26.f == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable, long[]] */
    @Override // s73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        RandomAccessFile randomAccessFile;
        int i4 = i2;
        byte b = 0;
        if (i4 == 0) {
            return 0;
        }
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        if (j < i4) {
            i4 = (int) j;
        }
        int i5 = i4;
        int i6 = 0;
        while (true) {
            if (i6 == 0) {
                try {
                } catch (InterruptedException e) {
                    fc4.g(e, true);
                    return -3;
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            }
            randomAccessFile = this.r;
            if (randomAccessFile != null) {
                break;
            }
            lb4 lb4Var = this.a;
            lb4Var.getClass();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ?? r6 = new long[2];
            Utilities.d.c(new ev4((Object) lb4Var, (Serializable) r6, this.h, i5, (Object) countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
            } catch (Exception unused) {
            }
            int i7 = (int) r6[b];
            if (i7 == 0) {
                this.n = new CountDownLatch(1);
                bc4 G = bc4.G(this.x);
                TLRPC.TL_document tL_document = this.s;
                Object obj = this.w;
                long j2 = this.h;
                int h = h();
                byte b2 = tL_document == null ? (byte) 1 : b;
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                lb4[] lb4VarArr = new lb4[1];
                i3 = i7;
                byte b3 = b;
                bc4.K.c(new nb4(G, lb4VarArr, tL_document, null, obj, h, this, j2, false, b2, countDownLatch2));
                bc4.a(countDownLatch2, true);
                lb4 lb4Var2 = lb4VarArr[b3];
                lb4 lb4Var3 = this.a;
                if (lb4Var3 != lb4Var2) {
                    lb4Var3.getClass();
                    Utilities.d.c(new hb4(lb4Var3, this, b3));
                    this.a = lb4Var2;
                }
                CountDownLatch countDownLatch3 = this.n;
                if (countDownLatch3 != null) {
                    countDownLatch3.await();
                    this.n = null;
                }
            } else {
                i3 = i7;
            }
            lb4 lb4Var4 = this.a;
            File file = (lb4Var4.Y == 3 && !lb4Var4.z && lb4Var4.O0) ? lb4Var4.L0 : lb4Var4.J0;
            if (this.r == null || !Objects.equals(this.y, file)) {
                if (e21.a) {
                    fc4.b("check stream file " + file);
                }
                RandomAccessFile randomAccessFile2 = this.r;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (Exception unused2) {
                    }
                }
                this.y = file;
                if (file != null) {
                    try {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.y, "r");
                        this.r = randomAccessFile3;
                        randomAccessFile3.seek(this.h);
                        if (this.a.Y == 3) {
                            this.E = false;
                            long length = this.y.length() - this.h;
                            this.c = length;
                            long j3 = this.e;
                            if (j3 != -1) {
                                this.c = Math.min(length, j3 - this.d);
                            }
                        }
                    } catch (Throwable unused3) {
                        if ((this.a.Y == 3) && !this.y.exists()) {
                            bc4.G(this.x).e(null, null, null, null, null, this.a.r);
                            bc4 G2 = bc4.G(this.x);
                            TLRPC.TL_document tL_document2 = this.s;
                            Object obj2 = this.w;
                            long j4 = this.h;
                            int h2 = h();
                            int i8 = tL_document2 == null ? 1 : 0;
                            CountDownLatch countDownLatch4 = new CountDownLatch(1);
                            lb4[] lb4VarArr2 = new lb4[1];
                            bc4.K.c(new nb4(G2, lb4VarArr2, tL_document2, null, obj2, h2, this, j4, false, i8, countDownLatch4));
                            bc4.a(countDownLatch4, true);
                            byte b4 = 0;
                            lb4 lb4Var5 = lb4VarArr2[0];
                            lb4 lb4Var6 = this.a;
                            if (lb4Var6 != lb4Var5) {
                                lb4Var6.getClass();
                                Utilities.d.c(new hb4(lb4Var6, this, b4));
                                this.a = lb4Var5;
                            }
                        }
                    }
                }
            }
            i6 = i3;
            b = 0;
        }
        if (!this.f) {
            return 0;
        }
        int read = randomAccessFile.read(bArr, i, i6);
        if (read > 0) {
            long j5 = read;
            this.h += j5;
            this.c -= j5;
            this.d += j5;
            e(read);
        }
        return read;
    }
}
