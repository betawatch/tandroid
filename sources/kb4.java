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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class kb4 implements o63, m94 {
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public boolean E = true;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public u63 H;
    public l94 a;
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
        String r = ba4.r(null, document);
        ba4.G(i);
        File I2 = ba4.I(document);
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
            sb.append(ba4.G(i).F(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(ba4.B(document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb.append(Utilities.f(bArr));
            return Uri.parse("tg://" + r + sb.toString());
        } catch (UnsupportedEncodingException e) {
            fa4.g(e, true);
            return null;
        }
    }

    @Override // m94
    public final void a() {
        CountDownLatch countDownLatch = this.n;
        this.n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // o63
    public final void addTransferListener(vyb vybVar) {
        vybVar.getClass();
        ArrayList arrayList = this.F;
        if (arrayList.contains(vybVar)) {
            return;
        }
        arrayList.add(vybVar);
        this.G++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o63
    public final void close() {
        fa4.d("FileStreamLoadOperation " + this.s.id + " close me=" + this);
        l94 l94Var = this.a;
        Object[] objArr = 0;
        if (l94Var != null) {
            Utilities.d.c(new h94(l94Var, this, objArr == true ? 1 : 0));
        }
        RandomAccessFile randomAccessFile = this.r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            this.r = null;
        }
        this.b = null;
        I.remove(Long.valueOf(this.s.id));
        if (this.f) {
            this.f = false;
            u63 u63Var = this.H;
            String str = g8c.a;
            for (int i = 0; i < this.G; i++) {
                ((s93) ((vyb) this.F.get(i))).g(u63Var, this.E);
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
        u63 u63Var = this.H;
        String str = g8c.a;
        for (int i2 = 0; i2 < this.G; i2++) {
            vyb vybVar = (vyb) this.F.get(i2);
            boolean z = this.E;
            s93 s93Var = (s93) vybVar;
            synchronized (s93Var) {
                if (z) {
                    if (u63Var != null) {
                    }
                    s93Var.i += i;
                }
            }
        }
    }

    @Override // o63
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // o63
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
    @Override // o63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(u63 u63Var) {
        int i;
        TLRPC.TL_document tL_document;
        ArrayList arrayList = this.F;
        Uri uri = u63Var.a;
        long j = u63Var.e;
        this.b = uri;
        for (int i2 = 0; i2 < this.G; i2++) {
            ((vyb) arrayList.get(i2)).getClass();
        }
        int intValue = Utilities.z(this.b.getQueryParameter("account")).intValue();
        this.x = intValue;
        this.w = ba4.G(intValue).H.get(Utilities.z(this.b.getQueryParameter("rid")));
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
        this.e = u63Var.f;
        ba4 G = ba4.G(this.x);
        TLRPC.TL_document tL_document4 = this.s;
        Object obj = this.w;
        long j2 = this.h;
        int i3 = i();
        int i4 = tL_document4 == null ? 1 : 0;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        l94[] l94VarArr = new l94[1];
        ba4.K.c(new n94(G, l94VarArr, tL_document4, null, obj, i3, this, j2, false, i4, countDownLatch));
        ba4.a(countDownLatch, true);
        this.a = l94VarArr[0];
        this.d = 0L;
        long j3 = this.s.size - j;
        this.c = j3;
        long j4 = this.e;
        if (j4 != -1) {
            this.c = Math.min(j3, j4);
        }
        this.f = true;
        this.H = u63Var;
        for (int i5 = 0; i5 < this.G; i5++) {
            ((s93) ((vyb) arrayList.get(i5))).h(u63Var, this.E);
        }
        l94 l94Var = this.a;
        if (l94Var != null) {
            File e = l94Var.e();
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
                    fa4.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
                    StringBuilder sb = new StringBuilder("FileStreamLoadOperation ");
                    sb.append(this.s.id);
                    sb.append(" ");
                    sb.append(k27.h2(this.s));
                    sb.append("x");
                    sb.append(k27.h2(this.s));
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
                    fa4.d(sb.toString());
                    return this.c;
                }
            }
        }
        i = 0;
        fa4.d("FileStreamLoadOperation " + this.s.id + " open operation=" + this.a + " currentFile=" + this.y + " file=" + this.r + " bytesRemaining=" + this.c + " me=" + this);
        StringBuilder sb2 = new StringBuilder("FileStreamLoadOperation ");
        sb2.append(this.s.id);
        sb2.append(" ");
        sb2.append(k27.h2(this.s));
        sb2.append("x");
        sb2.append(k27.h2(this.s));
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
        fa4.d(sb2.toString());
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0022, code lost:
    
        if (r26.f == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable, long[]] */
    @Override // g63
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
                    fa4.g(e, true);
                    return -3;
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            }
            randomAccessFile = this.r;
            if (randomAccessFile != null) {
                break;
            }
            l94 l94Var = this.a;
            l94Var.getClass();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ?? r6 = new long[2];
            Utilities.d.c(new dt4((Object) l94Var, (Serializable) r6, this.h, i5, (Object) countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
            } catch (Exception unused) {
            }
            int i7 = (int) r6[b];
            if (i7 == 0) {
                this.n = new CountDownLatch(1);
                ba4 G = ba4.G(this.x);
                TLRPC.TL_document tL_document = this.s;
                Object obj = this.w;
                long j2 = this.h;
                int i8 = i();
                byte b2 = tL_document == null ? (byte) 1 : b;
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                l94[] l94VarArr = new l94[1];
                i3 = i7;
                byte b3 = b;
                ba4.K.c(new n94(G, l94VarArr, tL_document, null, obj, i8, this, j2, false, b2, countDownLatch2));
                ba4.a(countDownLatch2, true);
                l94 l94Var2 = l94VarArr[b3];
                l94 l94Var3 = this.a;
                if (l94Var3 != l94Var2) {
                    l94Var3.getClass();
                    Utilities.d.c(new h94(l94Var3, this, b3));
                    this.a = l94Var2;
                }
                CountDownLatch countDownLatch3 = this.n;
                if (countDownLatch3 != null) {
                    countDownLatch3.await();
                    this.n = null;
                }
            } else {
                i3 = i7;
            }
            l94 l94Var4 = this.a;
            File file = (l94Var4.Y == 3 && !l94Var4.z && l94Var4.O0) ? l94Var4.L0 : l94Var4.J0;
            if (this.r == null || !Objects.equals(this.y, file)) {
                if (w01.a) {
                    fa4.b("check stream file " + file);
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
                            ba4.G(this.x).e(null, null, null, null, null, this.a.r);
                            ba4 G2 = ba4.G(this.x);
                            TLRPC.TL_document tL_document2 = this.s;
                            Object obj2 = this.w;
                            long j4 = this.h;
                            int i9 = i();
                            int i10 = tL_document2 == null ? 1 : 0;
                            CountDownLatch countDownLatch4 = new CountDownLatch(1);
                            l94[] l94VarArr2 = new l94[1];
                            ba4.K.c(new n94(G2, l94VarArr2, tL_document2, null, obj2, i9, this, j4, false, i10, countDownLatch4));
                            ba4.a(countDownLatch4, true);
                            byte b4 = 0;
                            l94 l94Var5 = l94VarArr2[0];
                            l94 l94Var6 = this.a;
                            if (l94Var6 != l94Var5) {
                                l94Var6.getClass();
                                Utilities.d.c(new h94(l94Var6, this, b4));
                                this.a = l94Var5;
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
