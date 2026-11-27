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
import org.telegram.messenger.voip.GroupCallEngine;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hd4 implements h73, ib4 {
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public boolean E = true;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public n73 H;
    public hb4 a;
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
        String r = xb4.r(null, document);
        xb4.G(i);
        File I2 = xb4.I(document);
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
            sb.append(xb4.G(i).F(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(xb4.B(document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb.append(Utilities.f(bArr));
            return Uri.parse("tg://" + r + sb.toString());
        } catch (UnsupportedEncodingException e) {
            cc4.g(e, true);
            return null;
        }
    }

    @Override // ib4
    public final void a() {
        CountDownLatch countDownLatch = this.n;
        this.n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // h73
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
        ArrayList arrayList = this.F;
        if (arrayList.contains(v2cVar)) {
            return;
        }
        arrayList.add(v2cVar);
        this.G++;
    }

    @Override // h73
    public final void close() {
        cc4.d("FileStreamLoadOperation " + this.s.id + " close me=" + this);
        hb4 hb4Var = this.a;
        byte b = 1;
        if (hb4Var != null) {
            Utilities.d.c(new ya4(hb4Var, this, b));
        }
        RandomAccessFile randomAccessFile = this.r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            this.r = null;
        }
        this.b = null;
        I.remove(Long.valueOf(this.s.id));
        if (this.f) {
            this.f = false;
            n73 n73Var = this.H;
            String str = gcc.a;
            for (int i = 0; i < this.G; i++) {
                ((la3) ((v2c) this.F.get(i))).g(n73Var, this.E);
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
    public final void f(int i) {
        n73 n73Var = this.H;
        String str = gcc.a;
        for (int i2 = 0; i2 < this.G; i2++) {
            v2c v2cVar = (v2c) this.F.get(i2);
            boolean z = this.E;
            la3 la3Var = (la3) v2cVar;
            synchronized (la3Var) {
                if (z) {
                    if (n73Var != null) {
                    }
                    la3Var.i += i;
                }
            }
        }
    }

    @Override // h73
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // h73
    public final Uri getUri() {
        return this.b;
    }

    public final int i() {
        Integer num = (Integer) ConcurrentMap$-EL.getOrDefault(J, Long.valueOf(this.s.id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x024b  */
    @Override // h73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(n73 n73Var) {
        int i;
        TLRPC.TL_document tL_document;
        ArrayList arrayList = this.F;
        Uri uri = n73Var.a;
        long j = n73Var.e;
        this.b = uri;
        for (int i2 = 0; i2 < this.G; i2++) {
            ((v2c) arrayList.get(i2)).getClass();
        }
        int intValue = Utilities.z(this.b.getQueryParameter("account")).intValue();
        this.x = intValue;
        this.w = xb4.G(intValue).H.get(Utilities.z(this.b.getQueryParameter("rid")));
        TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
        this.s = tL_document2;
        tL_document2.access_hash = Utilities.A(this.b.getQueryParameter("hash")).longValue();
        this.s.id = Utilities.A(this.b.getQueryParameter("id")).longValue();
        this.s.size = Utilities.A(this.b.getQueryParameter("size")).longValue();
        this.s.dc_id = Utilities.z(this.b.getQueryParameter("dc")).intValue();
        this.s.mime_type = this.b.getQueryParameter("mime");
        this.s.file_reference = Utilities.v(this.b.getQueryParameter(GroupCallEngine.NAME_REFERENCE));
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
        this.e = n73Var.f;
        xb4 G = xb4.G(this.x);
        TLRPC.TL_document tL_document4 = this.s;
        Object obj = this.w;
        long j2 = this.h;
        int i3 = i();
        int i4 = tL_document4 == null ? 1 : 0;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hb4[] hb4VarArr = new hb4[1];
        xb4.K.c(new jb4(G, hb4VarArr, tL_document4, null, obj, i3, this, j2, false, i4, countDownLatch));
        xb4.a(countDownLatch, true);
        this.a = hb4VarArr[0];
        this.d = 0L;
        long j3 = this.s.size - j;
        this.c = j3;
        long j4 = this.e;
        if (j4 != -1) {
            this.c = Math.min(j3, j4);
        }
        this.f = true;
        this.H = n73Var;
        for (int i5 = 0; i5 < this.G; i5++) {
            ((la3) ((v2c) arrayList.get(i5))).h(n73Var, this.E);
        }
        hb4 hb4Var = this.a;
        if (hb4Var != null) {
            File e = hb4Var.e();
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
                    cc4.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
                    StringBuilder sb = new StringBuilder("FileStreamLoadOperation ");
                    sb.append(this.s.id);
                    sb.append(" ");
                    sb.append(r47.h2(this.s));
                    sb.append("x");
                    sb.append(r47.h2(this.s));
                    sb.append(" mime_type=");
                    sb.append(this.s.mime_type);
                    sb.append(" codec=");
                    tL_document = this.s;
                    String str = null;
                    if (tL_document != null) {
                        int size = tL_document.attributes.size();
                        int i6 = i;
                        while (true) {
                            if (i6 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = tL_document.attributes.get(i6);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                str = ((TLRPC.TL_documentAttributeVideo) documentAttribute).video_codec;
                                break;
                            }
                            i6++;
                        }
                    }
                    sb.append(str);
                    sb.append(" size=");
                    sb.append(this.s.size);
                    cc4.d(sb.toString());
                    return this.c;
                }
            }
        }
        i = 0;
        cc4.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
        StringBuilder sb2 = new StringBuilder("FileStreamLoadOperation ");
        sb2.append(this.s.id);
        sb2.append(" ");
        sb2.append(r47.h2(this.s));
        sb2.append("x");
        sb2.append(r47.h2(this.s));
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
        cc4.d(sb2.toString());
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0022, code lost:
    
        if (r26.f == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable, long[]] */
    @Override // z63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        RandomAccessFile randomAccessFile;
        int i5 = i2;
        int i6 = 0;
        if (i5 == 0) {
            return 0;
        }
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        if (j < i5) {
            i5 = (int) j;
        }
        int i7 = i5;
        int i8 = 0;
        while (true) {
            byte b = 1;
            if (i8 == 0) {
                try {
                } catch (InterruptedException e) {
                    cc4.g(e, true);
                    return -3;
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            }
            randomAccessFile = this.r;
            if (randomAccessFile != null) {
                break;
            }
            hb4 hb4Var = this.a;
            hb4Var.getClass();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ?? r6 = new long[2];
            Utilities.d.c(new hv4((Object) hb4Var, (Serializable) r6, this.h, i7, (Object) countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
            } catch (Exception unused) {
            }
            int i9 = (int) r6[i6];
            if (i9 == 0) {
                this.n = new CountDownLatch(1);
                xb4 G = xb4.G(this.x);
                TLRPC.TL_document tL_document = this.s;
                Object obj = this.w;
                long j2 = this.h;
                int i10 = i();
                int i11 = tL_document == null ? 1 : i6;
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                hb4[] hb4VarArr = new hb4[1];
                i3 = i9;
                i4 = i6;
                xb4.K.c(new jb4(G, hb4VarArr, tL_document, null, obj, i10, this, j2, false, i11, countDownLatch2));
                xb4.a(countDownLatch2, true);
                hb4 hb4Var2 = hb4VarArr[i4 == true ? 1 : 0];
                hb4 hb4Var3 = this.a;
                if (hb4Var3 != hb4Var2) {
                    hb4Var3.getClass();
                    Utilities.d.c(new ya4(hb4Var3, this, b));
                    this.a = hb4Var2;
                }
                CountDownLatch countDownLatch3 = this.n;
                if (countDownLatch3 != null) {
                    countDownLatch3.await();
                    this.n = null;
                }
            } else {
                i3 = i9;
                i4 = i6;
            }
            hb4 hb4Var4 = this.a;
            File file = (hb4Var4.Y == 3 && !hb4Var4.z && hb4Var4.O0) ? hb4Var4.L0 : hb4Var4.J0;
            if (this.r == null || !Objects.equals(this.y, file)) {
                if (f11.a) {
                    cc4.b("check stream file " + file);
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
                        if ((this.a.Y == 3 ? true : i4) != false) {
                            this.E = i4;
                            long length = this.y.length() - this.h;
                            this.c = length;
                            long j3 = this.e;
                            if (j3 != -1) {
                                this.c = Math.min(length, j3 - this.d);
                            }
                        }
                    } catch (Throwable unused3) {
                        if ((this.a.Y == 3) && !this.y.exists()) {
                            xb4.G(this.x).e(null, null, null, null, null, this.a.r);
                            xb4 G2 = xb4.G(this.x);
                            TLRPC.TL_document tL_document2 = this.s;
                            Object obj2 = this.w;
                            long j4 = this.h;
                            int i12 = i();
                            int i13 = tL_document2 == null ? 1 : 0;
                            CountDownLatch countDownLatch4 = new CountDownLatch(1);
                            hb4[] hb4VarArr2 = new hb4[1];
                            xb4.K.c(new jb4(G2, hb4VarArr2, tL_document2, null, obj2, i12, this, j4, false, i13, countDownLatch4));
                            xb4.a(countDownLatch4, true);
                            hb4 hb4Var5 = hb4VarArr2[0];
                            hb4 hb4Var6 = this.a;
                            if (hb4Var6 != hb4Var5) {
                                hb4Var6.getClass();
                                Utilities.d.c(new ya4(hb4Var6, this, b));
                                this.a = hb4Var5;
                            }
                        }
                    }
                }
            }
            i8 = i3;
            i6 = 0;
        }
        if (!this.f) {
            return 0;
        }
        int read = randomAccessFile.read(bArr, i, i8);
        if (read > 0) {
            long j5 = read;
            this.h += j5;
            this.c -= j5;
            this.d += j5;
            f(read);
        }
        return read;
    }
}
