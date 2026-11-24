// default package

import android.graphics.Typeface;
import android.util.Pair;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lb4 {
    public static do5 l1;
    public File A;
    public boolean A0;
    public final boolean B;
    public boolean B0;
    public long C;
    public RandomAccessFile C0;
    public long D;
    public byte[] D0;
    public long E;
    public boolean E0;
    public long F;
    public final ArrayList F0;
    public byte G;
    public ArrayList G0;
    public final byte[] H;
    public ArrayList H0;
    public int I;
    public ArrayList I0;
    public final int J;
    public File J0;
    public boolean K;
    public File K0;
    public long L;
    public File L0;
    public ArrayList M;
    public File M0;
    public volatile ArrayList N;
    public File N0;
    public ArrayList O;
    public boolean O0;
    public ArrayList P;
    public final String P0;
    public long Q;
    public RandomAccessFile Q0;
    public int R;
    public RandomAccessFile R0;
    public boolean S;
    public RandomAccessFile S0;
    public int T;
    public File T0;
    public final int U;
    public File U0;
    public TLRPC.InputFileLocation V;
    public boolean V0;
    public final TLRPC.InputWebFileLocation W;
    public int W0;
    public final vuc X;
    public final kc4 X0;
    public volatile byte Y;
    public volatile boolean Y0;
    public volatile boolean Z;
    public volatile boolean Z0;
    public boolean a;
    public long a0;
    public boolean a1;
    public mb4 b;
    public long b0;
    public final int b1;
    public boolean c;
    public final long c0;
    public xy c1;
    public long d;
    public long d0;
    public long d1;
    public boolean e;
    public long e0;
    public u30 e1;
    public boolean f;
    public kb4 f0;
    public final Runnable f1;
    public byte g;
    public zb4 g0;
    public long g1;
    public final Runnable h;
    public final byte[] h0;
    public long h1;
    public pv3 i;
    public final byte[] i0;
    public long i1;
    public boolean j;
    public int j0;
    public int j1;
    public final boolean k;
    public int k0;
    public volatile boolean l;
    public int l0;
    public ArrayList m;
    public int m0;
    public int n;
    public boolean n0;
    public byte o;
    public boolean o0;
    public byte p;
    public Object p0;
    public int q;
    public HashMap q0;
    public String r;
    public final boolean r0;
    public String s;
    public byte[] s0;
    public HashMap t;
    public byte[] t0;
    public HashMap u;
    public boolean u0;
    public RandomAccessFile v;
    public byte[] v0;
    public int w;
    public byte[] w0;
    public int x;
    public byte[] x0;
    public boolean y;
    public int y0;
    public boolean z;
    public boolean z0;
    public static volatile mp3 k1 = new mp3("writeFileQueue");
    public static final Object m1 = new Object();

    public lb4(Object obj, TLRPC.Document document) {
        int lastIndexOf;
        this.g = (byte) 2;
        this.h = new bb4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = od1.AUDIO_CONTENT_SAMPLING_RATE;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new bb4(this, (byte) 5);
        this.k = k47.J4(document);
        if (document != null && !k47.N2(document)) {
            "application/x-tgwallpattern".equals(document.mime_type);
        }
        s();
        try {
            this.p0 = obj;
            this.j = obj instanceof TL_stories.TL_storyItem;
            this.X0 = bc4.E(obj);
            String str = "";
            if (document instanceof TLRPC.TL_documentEncrypted) {
                TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
                this.V = tL_inputEncryptedFileLocation;
                tL_inputEncryptedFileLocation.id = document.id;
                tL_inputEncryptedFileLocation.access_hash = document.access_hash;
                int i = document.dc_id;
                this.T = i;
                this.U = i;
                byte[] bArr = new byte[32];
                this.i0 = bArr;
                System.arraycopy(document.iv, 0, bArr, 0, 32);
                this.h0 = document.key;
            } else if (document instanceof TLRPC.TL_document) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = document.id;
                tL_inputDocumentFileLocation.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocumentFileLocation.file_reference = bArr2;
                tL_inputDocumentFileLocation.thumb_size = "";
                if (bArr2 == null) {
                    tL_inputDocumentFileLocation.file_reference = new byte[0];
                }
                int i2 = document.dc_id;
                this.T = i2;
                this.U = i2;
                this.o0 = true;
                int size = document.attributes.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                        this.B = true;
                        this.J = document.attributes.get(i3).preload_prefix_size;
                        break;
                    }
                    i3++;
                }
                if (this.j && this.B && this.J <= 0) {
                    this.J = TLObject.FLAG_19;
                }
            }
            this.a1 = "application/x-tgsticker".equals(document.mime_type) || "application/x-tgwallpattern".equals(document.mime_type);
            long j = document.size;
            this.b0 = j;
            if (this.h0 != null && j % 16 != 0) {
                long j2 = 16 - (j % 16);
                this.c0 = j2;
                this.b0 = j + j2;
            }
            String B = bc4.B(document);
            this.P0 = B;
            if (B == null || (lastIndexOf = B.lastIndexOf(46)) == -1) {
                this.P0 = "";
            } else {
                str = B.substring(lastIndexOf);
                this.P0 = str;
            }
            if ("audio/ogg".equals(document.mime_type)) {
                this.b1 = ConnectionsManager.FileTypeAudio;
            } else {
                String str2 = document.mime_type;
                if ("video/mp4".equals(str2) || (gda.z0 && "video/x-matroska".equals(str2))) {
                    this.b1 = 33554432;
                } else {
                    this.b1 = 67108864;
                }
            }
            if (str.length() <= 1) {
                this.P0 = bc4.C(document.mime_type);
            }
        } catch (Exception e) {
            fc4.g(e, true);
            h(0, true);
        }
    }

    public static void l(long j, long j2, ArrayList arrayList) {
        boolean z;
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jb4 jb4Var = (jb4) arrayList.get(i2);
            if (j == jb4Var.b) {
                jb4Var.b = j2;
            } else if (j2 == jb4Var.a) {
                jb4Var.a = j;
            }
            z = true;
        }
        z = false;
        Collections.sort(arrayList, new x03((byte) 17));
        while (i < arrayList.size() - 1) {
            jb4 jb4Var2 = (jb4) arrayList.get(i);
            int i3 = i + 1;
            jb4 jb4Var3 = (jb4) arrayList.get(i3);
            if (jb4Var2.b == jb4Var3.a) {
                jb4Var2.b = jb4Var3.b;
                arrayList.remove(i3);
                i--;
            }
            i++;
        }
        if (z) {
            return;
        }
        arrayList.add(new jb4(j, j2));
    }

    public final void a(long j, long j2, ArrayList arrayList, boolean z) {
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            jb4 jb4Var = (jb4) arrayList.get(i);
            long j3 = jb4Var.a;
            long j4 = jb4Var.b;
            if (j > j3) {
                if (j2 < j4) {
                    arrayList.add(0, new jb4(j3, j));
                    jb4Var.a = j2;
                } else if (j < j4) {
                    jb4Var.b = j;
                }
                z2 = true;
                break;
            }
            if (j2 >= j4) {
                arrayList.remove(i);
            } else if (j2 > j3) {
                jb4Var.a = j2;
            }
            z2 = true;
            break;
        }
        if (z) {
            if (!z2) {
                if (e21.a) {
                    fc4.d(this.L0 + " downloaded duplicate file part " + j + " - " + j2);
                    return;
                }
                return;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (this.i != null) {
                k1.a(this.i);
            }
            synchronized (this) {
                this.Y0 = true;
            }
            mp3 mp3Var = k1;
            pv3 pv3Var = new pv3(this, arrayList2, (byte) 20);
            this.i = pv3Var;
            mp3Var.c(pv3Var);
            g();
        }
    }

    public final void b() {
        try {
            RandomAccessFile randomAccessFile = this.Q0;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                this.Q0.close();
                this.Q0 = null;
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.v;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                this.v.close();
                this.v = null;
            }
        } catch (Exception e4) {
            fc4.g(e4, true);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.C0;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e5) {
                    fc4.g(e5, true);
                }
                this.C0.close();
                this.C0 = null;
            }
        } catch (Exception e6) {
            fc4.g(e6, true);
        }
        try {
            if (this.S0 != null) {
                synchronized (this) {
                    if (this.Y0) {
                        this.Z0 = true;
                    } else {
                        try {
                            this.S0.getChannel().close();
                        } catch (Exception e7) {
                            fc4.g(e7, true);
                        }
                        this.S0.close();
                        this.S0 = null;
                    }
                }
            }
        } catch (Exception e8) {
            fc4.g(e8, true);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.R0;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.R0 = null;
            }
        } catch (Exception e9) {
            fc4.g(e9, true);
        }
        if (this.I0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int size = this.I0.size();
            ArrayList arrayList = this.I0;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            kb4 kb4Var = (kb4) arrayList.get(i);
            TLRPC.TL_upload_file tL_upload_file = kb4Var.f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = kb4Var.g;
                if (tL_upload_webFile != null) {
                    tL_upload_webFile.disableFree = false;
                    tL_upload_webFile.freeResources();
                } else {
                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile = kb4Var.h;
                    if (tL_upload_cdnFile != null) {
                        tL_upload_cdnFile.disableFree = false;
                        tL_upload_cdnFile.freeResources();
                    }
                }
            }
            i++;
        }
    }

    public final void c(kb4 kb4Var, boolean z, boolean z2) {
        byte b;
        ArrayList arrayList;
        int[] iArr = new int[8];
        long j = Long.MAX_VALUE;
        byte b2 = 0;
        for (int i = 0; i < this.G0.size(); i++) {
            kb4 kb4Var2 = (kb4) this.G0.get(i);
            j = Math.min(kb4Var2.e, j);
            if (this.y) {
                this.u.remove(Long.valueOf(kb4Var2.e));
            } else {
                ArrayList arrayList2 = this.O;
                long j2 = kb4Var2.e;
                l(j2, kb4Var2.c + j2, arrayList2);
            }
            if (kb4Var != kb4Var2 && kb4Var2.a != 0) {
                kb4Var2.j = true;
                if (z2) {
                    this.H0.add(kb4Var2);
                    kb4Var2.l = new db4(this, kb4Var2, b2);
                    ConnectionsManager.getInstance(this.R).cancelRequest(kb4Var2.a, true, new eb4(kb4Var2, (byte) 0));
                } else {
                    ConnectionsManager.getInstance(this.R).cancelRequest(kb4Var2.a, true);
                    kb4Var2.k = true;
                }
                if (!ir3.d()) {
                    int i2 = kb4Var2.d >>> 16;
                    iArr[i2] = iArr[i2] + kb4Var2.c;
                }
            }
        }
        int i3 = 0;
        while (true) {
            b = 2;
            if (i3 >= 8) {
                break;
            }
            int i4 = (i3 << 16) | 2;
            if (iArr[i3] > ((!this.j || ir3.d()) ? TLObject.FLAG_20 : 262144)) {
                ConnectionsManager.getInstance(this.R).discardConnection(this.u0 ? this.y0 : this.T, i4);
            }
            i3++;
        }
        this.G0.clear();
        gm.c3(new bb4(this, b));
        int i5 = 0;
        while (true) {
            int size = this.I0.size();
            arrayList = this.I0;
            if (i5 >= size) {
                break;
            }
            kb4 kb4Var3 = (kb4) arrayList.get(i5);
            if (this.y) {
                this.u.remove(Long.valueOf(kb4Var3.e));
            } else {
                ArrayList arrayList3 = this.O;
                long j3 = kb4Var3.e;
                l(j3, kb4Var3.c + j3, arrayList3);
            }
            TLRPC.TL_upload_file tL_upload_file = kb4Var3.f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = kb4Var3.g;
                if (tL_upload_webFile != null) {
                    tL_upload_webFile.disableFree = false;
                    tL_upload_webFile.freeResources();
                } else {
                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile = kb4Var3.h;
                    if (tL_upload_cdnFile != null) {
                        tL_upload_cdnFile.disableFree = false;
                        tL_upload_cdnFile.freeResources();
                    }
                }
            }
            j = Math.min(kb4Var3.e, j);
            i5++;
        }
        arrayList.clear();
        this.l0 = 0;
        if (!z && this.y) {
            this.Q = this.x;
        } else if (this.M == null) {
            this.a0 = j;
            this.Q = j;
        }
    }

    public final long d(long j, long j2, NativeByteBuffer nativeByteBuffer) {
        long j3;
        int limit = nativeByteBuffer.limit();
        long j4 = j;
        while (j4 >= j2 - 16) {
            long j5 = j2 + limit;
            if (j4 >= j5) {
                break;
            }
            long j6 = j5 - 16;
            byte[] bArr = this.H;
            if (j4 >= j6) {
                long j7 = j5 - j4;
                if (j7 > 2147483647L) {
                    zo4.k("!!!");
                    return 0L;
                }
                this.I = (int) j7;
                nativeByteBuffer.position(nativeByteBuffer.limit() - this.I);
                nativeByteBuffer.readBytes(bArr, 0, this.I, false);
                return j5;
            }
            if (this.I != 0) {
                nativeByteBuffer.position(0);
                int i = this.I;
                nativeByteBuffer.readBytes(bArr, i, 16 - i, false);
                this.I = 0;
                j3 = 0;
            } else {
                j3 = 0;
                long j8 = j4 - j2;
                if (j8 > 2147483647L) {
                    zo4.k("!!!");
                    return 0L;
                }
                nativeByteBuffer.position((int) j8);
                nativeByteBuffer.readBytes(bArr, 0, 16, false);
            }
            int i2 = ((bArr[0] & 255) << 24) + ((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255);
            if (i2 == 0) {
                return j3;
            }
            if (i2 == 1) {
                i2 = ((bArr[12] & 255) << 24) + ((bArr[13] & 255) << 16) + ((bArr[14] & 255) << 8) + (bArr[15] & 255);
            }
            if (bArr[4] == 109 && bArr[5] == 111 && bArr[6] == 111 && bArr[7] == 118) {
                return -i2;
            }
            j4 += i2;
            if (j4 >= j5) {
                return j4;
            }
        }
        return 0L;
    }

    public final File e() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        File[] fileArr = new File[1];
        Utilities.d.c(new pz2(this, fileArr, countDownLatch, (byte) 24));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        return fileArr[0];
    }

    public final long f(long j, long j2, ArrayList arrayList) {
        long j3;
        if (arrayList != null && this.Y != 3 && !arrayList.isEmpty()) {
            int size = arrayList.size();
            jb4 jb4Var = null;
            int i = 0;
            while (true) {
                if (i >= size) {
                    j3 = j2;
                    break;
                }
                jb4 jb4Var2 = (jb4) arrayList.get(i);
                long j4 = jb4Var2.a;
                if (j <= j4 && (jb4Var == null || j4 < jb4Var.a)) {
                    jb4Var = jb4Var2;
                }
                if (j4 <= j && jb4Var2.b > j) {
                    j3 = 0;
                    break;
                }
                i++;
            }
            if (j3 != 0) {
                return jb4Var != null ? Math.min(j2, jb4Var.a - j) : Math.min(j2, Math.max(this.b0 - j, 0L));
            }
        } else {
            if (this.Y == 3) {
                return j2;
            }
            long j5 = this.a0;
            if (j5 != 0) {
                return Math.min(j2, Math.max(j5 - j, 0L));
            }
        }
        return 0L;
    }

    public final void g() {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((mb4) this.m.get(i)).a();
            }
        }
    }

    public final void h(int i, boolean z) {
        b();
        this.Y = i == 1 ? (byte) 4 : (byte) 2;
        if (this.g0 != null && e21.a) {
            long currentTimeMillis = this.d1 != 0 ? System.currentTimeMillis() - this.d1 : 0L;
            File file = this.L0;
            if (i == 1) {
                fc4.b("cancel downloading file to " + file + " time = " + currentTimeMillis + " dc = " + this.T + " size = " + gm.i0(this.b0, false, false));
            } else {
                fc4.b("failed downloading file to " + file + " reason = " + i + " time = " + currentTimeMillis + " dc = " + this.T + " size = " + gm.i0(this.b0, false, false));
            }
        }
        if (z) {
            Utilities.d.c(new cb4(this, i, (byte) 3));
            return;
        }
        zb4 zb4Var = this.g0;
        if (zb4Var != null) {
            zb4Var.b(this, i);
        }
        g();
    }

    public final void i(int i, boolean z, boolean z2) {
        if (this.Y == 1 || this.Y == 5) {
            this.Y = (byte) 3;
            g();
            b();
            byte b = 24;
            if (!this.y && !z2) {
                k1.c(new b5a((Object) this, (Object) this.M0, (Object) this.N0, (Object) this.A, (Serializable) this.J0, z, (byte) 9));
                this.M0 = null;
                this.N0 = null;
                this.A = null;
                this.g0.getClass();
                bc4.K.c(new pv3(this, this.e1, b));
                return;
            }
            this.z = true;
            boolean z3 = e21.a;
            File file = this.J0;
            if (i == 1) {
                fc4.b("file already exist " + file);
            } else {
                StringBuilder sb = new StringBuilder("finished preloading file to ");
                sb.append(file);
                sb.append(" loaded ");
                sb.append(this.a0);
                sb.append(" of ");
                sb.append(this.b0);
                sb.append(" prefSize=");
                b10.p(this.J, sb);
            }
            if (this.X0 != null) {
                byte b2 = 26;
                if (this.J0 != null) {
                    lc4 lc4Var = bc4.G(this.R).d;
                    List singletonList = Collections.singletonList(new b81(this.J0));
                    lc4Var.getClass();
                    lc4Var.h(new pv3(lc4Var, singletonList, b2));
                }
                if (this.N0 != null) {
                    lc4 lc4Var2 = bc4.G(this.R).d;
                    List singletonList2 = Collections.singletonList(new b81(this.N0));
                    lc4Var2.getClass();
                    lc4Var2.h(new pv3(lc4Var2, singletonList2, b2));
                }
            }
            this.g0.getClass();
            bc4.K.c(new pv3(this, this.e1, b));
            this.g0.c(this, this.L0);
        }
    }

    public final void j() {
        if (this.Y != 1) {
            return;
        }
        this.Z = true;
        this.g1 = 0L;
        Utilities.d.c(new bb4(this, (byte) 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x02a8, code lost:
    
        if (r44.G0.isEmpty() != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03ee, code lost:
    
        if (r12 != false) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05ab A[Catch: Exception -> 0x05ca, TryCatch #0 {Exception -> 0x05ca, blocks: (B:70:0x007e, B:72:0x0082, B:74:0x008e, B:76:0x0098, B:78:0x009b, B:80:0x009f, B:82:0x00a2, B:84:0x00a6, B:88:0x00b1, B:90:0x00b5, B:92:0x00c9, B:96:0x05c6, B:98:0x00d4, B:100:0x00de, B:102:0x00ea, B:104:0x00fc, B:106:0x0106, B:107:0x0116, B:109:0x0109, B:111:0x010d, B:112:0x0110, B:114:0x0114, B:115:0x011c, B:117:0x012c, B:118:0x0170, B:120:0x0174, B:122:0x01b9, B:123:0x01c0, B:125:0x01df, B:127:0x01f0, B:129:0x0200, B:130:0x0216, B:131:0x021d, B:132:0x020c, B:133:0x0219, B:134:0x021f, B:136:0x0240, B:138:0x0244, B:140:0x024a, B:142:0x0250, B:146:0x025b, B:149:0x055e, B:151:0x0566, B:153:0x0572, B:155:0x057a, B:157:0x057d, B:159:0x0589, B:161:0x058d, B:162:0x0594, B:164:0x0598, B:165:0x059f, B:167:0x05a3, B:169:0x05ab, B:171:0x05b1, B:173:0x05b6, B:175:0x05bb, B:179:0x0269, B:181:0x026d, B:183:0x0278, B:187:0x028b, B:189:0x028f, B:191:0x0294, B:193:0x0298, B:197:0x02a2, B:201:0x02ad, B:204:0x02cf, B:206:0x02d8, B:208:0x02f1, B:210:0x02f9, B:212:0x0308, B:213:0x030d, B:214:0x031e, B:215:0x031f, B:217:0x0323, B:218:0x0355, B:220:0x0359, B:221:0x038f, B:223:0x03ab, B:225:0x03bb, B:227:0x03c9, B:230:0x03cf, B:234:0x03e1, B:236:0x03e7, B:240:0x03f0, B:242:0x0400, B:243:0x0416, B:245:0x041f, B:247:0x042e, B:248:0x0469, B:250:0x0477, B:252:0x047b, B:254:0x047f, B:255:0x04cc, B:257:0x04d0, B:258:0x04ee, B:260:0x04f8, B:261:0x0527, B:263:0x052b, B:264:0x0537, B:266:0x053f, B:268:0x0544, B:270:0x0548, B:271:0x0551, B:274:0x050d, B:275:0x0514, B:278:0x0515, B:284:0x02ba, B:288:0x02c2, B:297:0x00b8, B:299:0x00bc, B:300:0x00bf, B:302:0x00c3), top: B:69:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05b1 A[Catch: Exception -> 0x05ca, TryCatch #0 {Exception -> 0x05ca, blocks: (B:70:0x007e, B:72:0x0082, B:74:0x008e, B:76:0x0098, B:78:0x009b, B:80:0x009f, B:82:0x00a2, B:84:0x00a6, B:88:0x00b1, B:90:0x00b5, B:92:0x00c9, B:96:0x05c6, B:98:0x00d4, B:100:0x00de, B:102:0x00ea, B:104:0x00fc, B:106:0x0106, B:107:0x0116, B:109:0x0109, B:111:0x010d, B:112:0x0110, B:114:0x0114, B:115:0x011c, B:117:0x012c, B:118:0x0170, B:120:0x0174, B:122:0x01b9, B:123:0x01c0, B:125:0x01df, B:127:0x01f0, B:129:0x0200, B:130:0x0216, B:131:0x021d, B:132:0x020c, B:133:0x0219, B:134:0x021f, B:136:0x0240, B:138:0x0244, B:140:0x024a, B:142:0x0250, B:146:0x025b, B:149:0x055e, B:151:0x0566, B:153:0x0572, B:155:0x057a, B:157:0x057d, B:159:0x0589, B:161:0x058d, B:162:0x0594, B:164:0x0598, B:165:0x059f, B:167:0x05a3, B:169:0x05ab, B:171:0x05b1, B:173:0x05b6, B:175:0x05bb, B:179:0x0269, B:181:0x026d, B:183:0x0278, B:187:0x028b, B:189:0x028f, B:191:0x0294, B:193:0x0298, B:197:0x02a2, B:201:0x02ad, B:204:0x02cf, B:206:0x02d8, B:208:0x02f1, B:210:0x02f9, B:212:0x0308, B:213:0x030d, B:214:0x031e, B:215:0x031f, B:217:0x0323, B:218:0x0355, B:220:0x0359, B:221:0x038f, B:223:0x03ab, B:225:0x03bb, B:227:0x03c9, B:230:0x03cf, B:234:0x03e1, B:236:0x03e7, B:240:0x03f0, B:242:0x0400, B:243:0x0416, B:245:0x041f, B:247:0x042e, B:248:0x0469, B:250:0x0477, B:252:0x047b, B:254:0x047f, B:255:0x04cc, B:257:0x04d0, B:258:0x04ee, B:260:0x04f8, B:261:0x0527, B:263:0x052b, B:264:0x0537, B:266:0x053f, B:268:0x0544, B:270:0x0548, B:271:0x0551, B:274:0x050d, B:275:0x0514, B:278:0x0515, B:284:0x02ba, B:288:0x02c2, B:297:0x00b8, B:299:0x00bc, B:300:0x00bf, B:302:0x00c3), top: B:69:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d8 A[Catch: Exception -> 0x05ca, TryCatch #0 {Exception -> 0x05ca, blocks: (B:70:0x007e, B:72:0x0082, B:74:0x008e, B:76:0x0098, B:78:0x009b, B:80:0x009f, B:82:0x00a2, B:84:0x00a6, B:88:0x00b1, B:90:0x00b5, B:92:0x00c9, B:96:0x05c6, B:98:0x00d4, B:100:0x00de, B:102:0x00ea, B:104:0x00fc, B:106:0x0106, B:107:0x0116, B:109:0x0109, B:111:0x010d, B:112:0x0110, B:114:0x0114, B:115:0x011c, B:117:0x012c, B:118:0x0170, B:120:0x0174, B:122:0x01b9, B:123:0x01c0, B:125:0x01df, B:127:0x01f0, B:129:0x0200, B:130:0x0216, B:131:0x021d, B:132:0x020c, B:133:0x0219, B:134:0x021f, B:136:0x0240, B:138:0x0244, B:140:0x024a, B:142:0x0250, B:146:0x025b, B:149:0x055e, B:151:0x0566, B:153:0x0572, B:155:0x057a, B:157:0x057d, B:159:0x0589, B:161:0x058d, B:162:0x0594, B:164:0x0598, B:165:0x059f, B:167:0x05a3, B:169:0x05ab, B:171:0x05b1, B:173:0x05b6, B:175:0x05bb, B:179:0x0269, B:181:0x026d, B:183:0x0278, B:187:0x028b, B:189:0x028f, B:191:0x0294, B:193:0x0298, B:197:0x02a2, B:201:0x02ad, B:204:0x02cf, B:206:0x02d8, B:208:0x02f1, B:210:0x02f9, B:212:0x0308, B:213:0x030d, B:214:0x031e, B:215:0x031f, B:217:0x0323, B:218:0x0355, B:220:0x0359, B:221:0x038f, B:223:0x03ab, B:225:0x03bb, B:227:0x03c9, B:230:0x03cf, B:234:0x03e1, B:236:0x03e7, B:240:0x03f0, B:242:0x0400, B:243:0x0416, B:245:0x041f, B:247:0x042e, B:248:0x0469, B:250:0x0477, B:252:0x047b, B:254:0x047f, B:255:0x04cc, B:257:0x04d0, B:258:0x04ee, B:260:0x04f8, B:261:0x0527, B:263:0x052b, B:264:0x0537, B:266:0x053f, B:268:0x0544, B:270:0x0548, B:271:0x0551, B:274:0x050d, B:275:0x0514, B:278:0x0515, B:284:0x02ba, B:288:0x02c2, B:297:0x00b8, B:299:0x00bc, B:300:0x00bf, B:302:0x00c3), top: B:69:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0323 A[Catch: Exception -> 0x05ca, TryCatch #0 {Exception -> 0x05ca, blocks: (B:70:0x007e, B:72:0x0082, B:74:0x008e, B:76:0x0098, B:78:0x009b, B:80:0x009f, B:82:0x00a2, B:84:0x00a6, B:88:0x00b1, B:90:0x00b5, B:92:0x00c9, B:96:0x05c6, B:98:0x00d4, B:100:0x00de, B:102:0x00ea, B:104:0x00fc, B:106:0x0106, B:107:0x0116, B:109:0x0109, B:111:0x010d, B:112:0x0110, B:114:0x0114, B:115:0x011c, B:117:0x012c, B:118:0x0170, B:120:0x0174, B:122:0x01b9, B:123:0x01c0, B:125:0x01df, B:127:0x01f0, B:129:0x0200, B:130:0x0216, B:131:0x021d, B:132:0x020c, B:133:0x0219, B:134:0x021f, B:136:0x0240, B:138:0x0244, B:140:0x024a, B:142:0x0250, B:146:0x025b, B:149:0x055e, B:151:0x0566, B:153:0x0572, B:155:0x057a, B:157:0x057d, B:159:0x0589, B:161:0x058d, B:162:0x0594, B:164:0x0598, B:165:0x059f, B:167:0x05a3, B:169:0x05ab, B:171:0x05b1, B:173:0x05b6, B:175:0x05bb, B:179:0x0269, B:181:0x026d, B:183:0x0278, B:187:0x028b, B:189:0x028f, B:191:0x0294, B:193:0x0298, B:197:0x02a2, B:201:0x02ad, B:204:0x02cf, B:206:0x02d8, B:208:0x02f1, B:210:0x02f9, B:212:0x0308, B:213:0x030d, B:214:0x031e, B:215:0x031f, B:217:0x0323, B:218:0x0355, B:220:0x0359, B:221:0x038f, B:223:0x03ab, B:225:0x03bb, B:227:0x03c9, B:230:0x03cf, B:234:0x03e1, B:236:0x03e7, B:240:0x03f0, B:242:0x0400, B:243:0x0416, B:245:0x041f, B:247:0x042e, B:248:0x0469, B:250:0x0477, B:252:0x047b, B:254:0x047f, B:255:0x04cc, B:257:0x04d0, B:258:0x04ee, B:260:0x04f8, B:261:0x0527, B:263:0x052b, B:264:0x0537, B:266:0x053f, B:268:0x0544, B:270:0x0548, B:271:0x0551, B:274:0x050d, B:275:0x0514, B:278:0x0515, B:284:0x02ba, B:288:0x02c2, B:297:0x00b8, B:299:0x00bc, B:300:0x00bf, B:302:0x00c3), top: B:69:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0359 A[Catch: Exception -> 0x05ca, TryCatch #0 {Exception -> 0x05ca, blocks: (B:70:0x007e, B:72:0x0082, B:74:0x008e, B:76:0x0098, B:78:0x009b, B:80:0x009f, B:82:0x00a2, B:84:0x00a6, B:88:0x00b1, B:90:0x00b5, B:92:0x00c9, B:96:0x05c6, B:98:0x00d4, B:100:0x00de, B:102:0x00ea, B:104:0x00fc, B:106:0x0106, B:107:0x0116, B:109:0x0109, B:111:0x010d, B:112:0x0110, B:114:0x0114, B:115:0x011c, B:117:0x012c, B:118:0x0170, B:120:0x0174, B:122:0x01b9, B:123:0x01c0, B:125:0x01df, B:127:0x01f0, B:129:0x0200, B:130:0x0216, B:131:0x021d, B:132:0x020c, B:133:0x0219, B:134:0x021f, B:136:0x0240, B:138:0x0244, B:140:0x024a, B:142:0x0250, B:146:0x025b, B:149:0x055e, B:151:0x0566, B:153:0x0572, B:155:0x057a, B:157:0x057d, B:159:0x0589, B:161:0x058d, B:162:0x0594, B:164:0x0598, B:165:0x059f, B:167:0x05a3, B:169:0x05ab, B:171:0x05b1, B:173:0x05b6, B:175:0x05bb, B:179:0x0269, B:181:0x026d, B:183:0x0278, B:187:0x028b, B:189:0x028f, B:191:0x0294, B:193:0x0298, B:197:0x02a2, B:201:0x02ad, B:204:0x02cf, B:206:0x02d8, B:208:0x02f1, B:210:0x02f9, B:212:0x0308, B:213:0x030d, B:214:0x031e, B:215:0x031f, B:217:0x0323, B:218:0x0355, B:220:0x0359, B:221:0x038f, B:223:0x03ab, B:225:0x03bb, B:227:0x03c9, B:230:0x03cf, B:234:0x03e1, B:236:0x03e7, B:240:0x03f0, B:242:0x0400, B:243:0x0416, B:245:0x041f, B:247:0x042e, B:248:0x0469, B:250:0x0477, B:252:0x047b, B:254:0x047f, B:255:0x04cc, B:257:0x04d0, B:258:0x04ee, B:260:0x04f8, B:261:0x0527, B:263:0x052b, B:264:0x0537, B:266:0x053f, B:268:0x0544, B:270:0x0548, B:271:0x0551, B:274:0x050d, B:275:0x0514, B:278:0x0515, B:284:0x02ba, B:288:0x02c2, B:297:0x00b8, B:299:0x00bc, B:300:0x00bf, B:302:0x00c3), top: B:69:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ab A[Catch: Exception -> 0x05ca, TryCatch #0 {Exception -> 0x05ca, blocks: (B:70:0x007e, B:72:0x0082, B:74:0x008e, B:76:0x0098, B:78:0x009b, B:80:0x009f, B:82:0x00a2, B:84:0x00a6, B:88:0x00b1, B:90:0x00b5, B:92:0x00c9, B:96:0x05c6, B:98:0x00d4, B:100:0x00de, B:102:0x00ea, B:104:0x00fc, B:106:0x0106, B:107:0x0116, B:109:0x0109, B:111:0x010d, B:112:0x0110, B:114:0x0114, B:115:0x011c, B:117:0x012c, B:118:0x0170, B:120:0x0174, B:122:0x01b9, B:123:0x01c0, B:125:0x01df, B:127:0x01f0, B:129:0x0200, B:130:0x0216, B:131:0x021d, B:132:0x020c, B:133:0x0219, B:134:0x021f, B:136:0x0240, B:138:0x0244, B:140:0x024a, B:142:0x0250, B:146:0x025b, B:149:0x055e, B:151:0x0566, B:153:0x0572, B:155:0x057a, B:157:0x057d, B:159:0x0589, B:161:0x058d, B:162:0x0594, B:164:0x0598, B:165:0x059f, B:167:0x05a3, B:169:0x05ab, B:171:0x05b1, B:173:0x05b6, B:175:0x05bb, B:179:0x0269, B:181:0x026d, B:183:0x0278, B:187:0x028b, B:189:0x028f, B:191:0x0294, B:193:0x0298, B:197:0x02a2, B:201:0x02ad, B:204:0x02cf, B:206:0x02d8, B:208:0x02f1, B:210:0x02f9, B:212:0x0308, B:213:0x030d, B:214:0x031e, B:215:0x031f, B:217:0x0323, B:218:0x0355, B:220:0x0359, B:221:0x038f, B:223:0x03ab, B:225:0x03bb, B:227:0x03c9, B:230:0x03cf, B:234:0x03e1, B:236:0x03e7, B:240:0x03f0, B:242:0x0400, B:243:0x0416, B:245:0x041f, B:247:0x042e, B:248:0x0469, B:250:0x0477, B:252:0x047b, B:254:0x047f, B:255:0x04cc, B:257:0x04d0, B:258:0x04ee, B:260:0x04f8, B:261:0x0527, B:263:0x052b, B:264:0x0537, B:266:0x053f, B:268:0x0544, B:270:0x0548, B:271:0x0551, B:274:0x050d, B:275:0x0514, B:278:0x0515, B:284:0x02ba, B:288:0x02c2, B:297:0x00b8, B:299:0x00bc, B:300:0x00bf, B:302:0x00c3), top: B:69:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x052b A[Catch: Exception -> 0x05ca, TryCatch #0 {Exception -> 0x05ca, blocks: (B:70:0x007e, B:72:0x0082, B:74:0x008e, B:76:0x0098, B:78:0x009b, B:80:0x009f, B:82:0x00a2, B:84:0x00a6, B:88:0x00b1, B:90:0x00b5, B:92:0x00c9, B:96:0x05c6, B:98:0x00d4, B:100:0x00de, B:102:0x00ea, B:104:0x00fc, B:106:0x0106, B:107:0x0116, B:109:0x0109, B:111:0x010d, B:112:0x0110, B:114:0x0114, B:115:0x011c, B:117:0x012c, B:118:0x0170, B:120:0x0174, B:122:0x01b9, B:123:0x01c0, B:125:0x01df, B:127:0x01f0, B:129:0x0200, B:130:0x0216, B:131:0x021d, B:132:0x020c, B:133:0x0219, B:134:0x021f, B:136:0x0240, B:138:0x0244, B:140:0x024a, B:142:0x0250, B:146:0x025b, B:149:0x055e, B:151:0x0566, B:153:0x0572, B:155:0x057a, B:157:0x057d, B:159:0x0589, B:161:0x058d, B:162:0x0594, B:164:0x0598, B:165:0x059f, B:167:0x05a3, B:169:0x05ab, B:171:0x05b1, B:173:0x05b6, B:175:0x05bb, B:179:0x0269, B:181:0x026d, B:183:0x0278, B:187:0x028b, B:189:0x028f, B:191:0x0294, B:193:0x0298, B:197:0x02a2, B:201:0x02ad, B:204:0x02cf, B:206:0x02d8, B:208:0x02f1, B:210:0x02f9, B:212:0x0308, B:213:0x030d, B:214:0x031e, B:215:0x031f, B:217:0x0323, B:218:0x0355, B:220:0x0359, B:221:0x038f, B:223:0x03ab, B:225:0x03bb, B:227:0x03c9, B:230:0x03cf, B:234:0x03e1, B:236:0x03e7, B:240:0x03f0, B:242:0x0400, B:243:0x0416, B:245:0x041f, B:247:0x042e, B:248:0x0469, B:250:0x0477, B:252:0x047b, B:254:0x047f, B:255:0x04cc, B:257:0x04d0, B:258:0x04ee, B:260:0x04f8, B:261:0x0527, B:263:0x052b, B:264:0x0537, B:266:0x053f, B:268:0x0544, B:270:0x0548, B:271:0x0551, B:274:0x050d, B:275:0x0514, B:278:0x0515, B:284:0x02ba, B:288:0x02c2, B:297:0x00b8, B:299:0x00bc, B:300:0x00bf, B:302:0x00c3), top: B:69:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0548 A[Catch: Exception -> 0x05ca, TryCatch #0 {Exception -> 0x05ca, blocks: (B:70:0x007e, B:72:0x0082, B:74:0x008e, B:76:0x0098, B:78:0x009b, B:80:0x009f, B:82:0x00a2, B:84:0x00a6, B:88:0x00b1, B:90:0x00b5, B:92:0x00c9, B:96:0x05c6, B:98:0x00d4, B:100:0x00de, B:102:0x00ea, B:104:0x00fc, B:106:0x0106, B:107:0x0116, B:109:0x0109, B:111:0x010d, B:112:0x0110, B:114:0x0114, B:115:0x011c, B:117:0x012c, B:118:0x0170, B:120:0x0174, B:122:0x01b9, B:123:0x01c0, B:125:0x01df, B:127:0x01f0, B:129:0x0200, B:130:0x0216, B:131:0x021d, B:132:0x020c, B:133:0x0219, B:134:0x021f, B:136:0x0240, B:138:0x0244, B:140:0x024a, B:142:0x0250, B:146:0x025b, B:149:0x055e, B:151:0x0566, B:153:0x0572, B:155:0x057a, B:157:0x057d, B:159:0x0589, B:161:0x058d, B:162:0x0594, B:164:0x0598, B:165:0x059f, B:167:0x05a3, B:169:0x05ab, B:171:0x05b1, B:173:0x05b6, B:175:0x05bb, B:179:0x0269, B:181:0x026d, B:183:0x0278, B:187:0x028b, B:189:0x028f, B:191:0x0294, B:193:0x0298, B:197:0x02a2, B:201:0x02ad, B:204:0x02cf, B:206:0x02d8, B:208:0x02f1, B:210:0x02f9, B:212:0x0308, B:213:0x030d, B:214:0x031e, B:215:0x031f, B:217:0x0323, B:218:0x0355, B:220:0x0359, B:221:0x038f, B:223:0x03ab, B:225:0x03bb, B:227:0x03c9, B:230:0x03cf, B:234:0x03e1, B:236:0x03e7, B:240:0x03f0, B:242:0x0400, B:243:0x0416, B:245:0x041f, B:247:0x042e, B:248:0x0469, B:250:0x0477, B:252:0x047b, B:254:0x047f, B:255:0x04cc, B:257:0x04d0, B:258:0x04ee, B:260:0x04f8, B:261:0x0527, B:263:0x052b, B:264:0x0537, B:266:0x053f, B:268:0x0544, B:270:0x0548, B:271:0x0551, B:274:0x050d, B:275:0x0514, B:278:0x0515, B:284:0x02ba, B:288:0x02c2, B:297:0x00b8, B:299:0x00bc, B:300:0x00bf, B:302:0x00c3), top: B:69:0x007e }] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(kb4 kb4Var, TLRPC.TL_error tL_error) {
        int i;
        long j;
        NativeByteBuffer nativeByteBuffer;
        ?? r15;
        char c;
        String str;
        char c2;
        char c3;
        char c4;
        boolean z;
        boolean z2;
        byte[] bArr;
        boolean z3;
        RandomAccessFile randomAccessFile;
        boolean z4;
        boolean z5;
        long j2;
        boolean z6;
        TLRPC.TL_fileHash tL_fileHash;
        Integer num;
        byte b = 1;
        if (this.Y != 1 && this.Y != 5) {
            boolean z7 = e21.a;
            if (this.Y != 3) {
                return false;
            }
            StringBuilder sb = new StringBuilder("trying to write to finished file ");
            sb.append(this.r);
            sb.append(" offset ");
            sb.append(kb4Var.e);
            sb.append(" ");
            sb.append(this.b0);
            sb.append(" reqToken=");
            sb.append(kb4Var.a);
            sb.append(" (state=");
            fc4.f(new ec4(hg9.k(sb, this.Y, ")")));
            return false;
        }
        int i2 = kb4Var.a;
        this.G0.remove(kb4Var);
        gm.c3(new cb4(this, i2, b));
        String str2 = " secret = ";
        if (tL_error == null) {
            try {
                if (this.M == null) {
                    j = 0;
                    i = 0;
                    if (this.a0 != kb4Var.e) {
                        this.I0.add(kb4Var);
                        TLRPC.TL_upload_file tL_upload_file = kb4Var.f;
                        if (tL_upload_file != null) {
                            tL_upload_file.disableFree = true;
                            return false;
                        }
                        TLRPC.TL_upload_webFile tL_upload_webFile = kb4Var.g;
                        if (tL_upload_webFile != null) {
                            tL_upload_webFile.disableFree = true;
                            return false;
                        }
                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile = kb4Var.h;
                        if (tL_upload_cdnFile == null) {
                            return false;
                        }
                        tL_upload_cdnFile.disableFree = true;
                        return false;
                    }
                } else {
                    i = 0;
                    j = 0;
                }
                TLRPC.TL_upload_file tL_upload_file2 = kb4Var.f;
                if (tL_upload_file2 != null) {
                    nativeByteBuffer = tL_upload_file2.bytes;
                } else {
                    TLRPC.TL_upload_webFile tL_upload_webFile2 = kb4Var.g;
                    if (tL_upload_webFile2 != null) {
                        nativeByteBuffer = tL_upload_webFile2.bytes;
                    } else {
                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile2 = kb4Var.h;
                        nativeByteBuffer = tL_upload_cdnFile2 != null ? tL_upload_cdnFile2.bytes : null;
                    }
                }
                if (nativeByteBuffer == null) {
                    r15 = 0;
                } else if (nativeByteBuffer.limit() == 0) {
                    r15 = i;
                } else {
                    int limit = nativeByteBuffer.limit();
                    if (this.u0) {
                        long j3 = (kb4Var.e / 131072) << 17;
                        HashMap hashMap = this.q0;
                        if (hashMap != null) {
                            c = 17;
                            tL_fileHash = (TLRPC.TL_fileHash) hashMap.get(Long.valueOf(j3));
                        } else {
                            c = 17;
                            tL_fileHash = null;
                        }
                        if (tL_fileHash == null) {
                            this.I0.add(kb4Var);
                            TLRPC.TL_upload_file tL_upload_file3 = kb4Var.f;
                            if (tL_upload_file3 != null) {
                                tL_upload_file3.disableFree = true;
                            } else {
                                TLRPC.TL_upload_webFile tL_upload_webFile3 = kb4Var.g;
                                if (tL_upload_webFile3 != null) {
                                    tL_upload_webFile3.disableFree = true;
                                } else {
                                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile3 = kb4Var.h;
                                    if (tL_upload_cdnFile3 != null) {
                                        tL_upload_cdnFile3.disableFree = true;
                                    }
                                }
                            }
                            m(j3);
                            return true;
                        }
                    } else {
                        c = 17;
                    }
                    if (kb4Var.h != null) {
                        c2 = '\r';
                        long j4 = kb4Var.e / 16;
                        c3 = '\f';
                        byte[] bArr2 = this.v0;
                        str = " volume_id = ";
                        c4 = '\b';
                        bArr2[15] = (byte) (j4 & 255);
                        bArr2[14] = (byte) ((j4 >> 8) & 255);
                        bArr2[13] = (byte) ((j4 >> 16) & 255);
                        bArr2[12] = (byte) ((j4 >> 24) & 255);
                        Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.w0, bArr2, i, nativeByteBuffer.limit());
                    } else {
                        str = " volume_id = ";
                        c2 = '\r';
                        c3 = '\f';
                        c4 = '\b';
                    }
                    if (this.y) {
                        this.v.writeLong(kb4Var.e);
                        long j5 = limit;
                        this.v.writeLong(j5);
                        this.w += 16;
                        this.v.getChannel().write(nativeByteBuffer.buffer);
                        boolean z8 = e21.a;
                        fc4.b("save preload file part " + this.A + " offset " + kb4Var.e + " size " + limit);
                        HashMap hashMap2 = this.t;
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                            this.t = hashMap2;
                        }
                        hashMap2.put(Long.valueOf(kb4Var.e), new ib4(this.w, j5));
                        this.x += limit;
                        this.w += limit;
                        if (this.G == 0) {
                            long d = d(this.D, kb4Var.e, nativeByteBuffer);
                            long j6 = this.C;
                            int i3 = this.j0;
                            if (d < j) {
                                d *= -1;
                                long j7 = j6 + i3;
                                this.C = j7;
                                if (j7 < this.b0 / 2) {
                                    long j8 = 1048576 + d;
                                    this.E = j8;
                                    this.F = j8;
                                    this.G = (byte) 1;
                                } else {
                                    this.E = 2097152L;
                                    this.F = 2097152L;
                                    this.G = (byte) 2;
                                }
                                this.C = -1L;
                            } else {
                                this.C = j6 + i3;
                            }
                            this.D = d;
                        }
                        this.v.writeLong(this.E);
                        this.v.writeLong(this.C);
                        this.v.writeLong(this.D);
                        this.w += 24;
                        long j9 = this.C;
                        z4 = j9 == j || (this.G != 0 && this.E < j) || this.x > 2097152 || j9 >= this.b0;
                        if (z4) {
                            this.v.seek(j);
                            this.v.write(1);
                        } else if (this.G != 0) {
                            this.E -= this.j0;
                        }
                        z5 = false;
                    } else {
                        long j10 = limit;
                        long j11 = this.a0 + j10;
                        this.a0 = j11;
                        long j12 = this.b0;
                        if (j12 > 0) {
                            if (j11 < j12) {
                                int i4 = this.J;
                                if (i4 > 0 && j11 >= i4) {
                                    if (this.j && this.W0 < 3) {
                                    }
                                }
                                z6 = false;
                                z = z6;
                                if (this.a0 < this.b0) {
                                    z2 = true;
                                    boolean z9 = e21.a;
                                    bArr = this.h0;
                                    if (bArr != null) {
                                        Utilities.c(nativeByteBuffer.buffer, bArr, this.i0, false, true, 0, nativeByteBuffer.limit());
                                        if (z && this.c0 != 0) {
                                            long limit2 = nativeByteBuffer.limit() - this.c0;
                                            if (limit2 > 2147483647L) {
                                                throw new RuntimeException("Out of limit" + limit2);
                                            }
                                            nativeByteBuffer.limit((int) limit2);
                                        }
                                    }
                                    if (this.n0) {
                                        long j13 = kb4Var.e / 16;
                                        byte[] bArr3 = this.t0;
                                        bArr3[15] = (byte) (j13 & 255);
                                        bArr3[14] = (byte) ((j13 >> c4) & 255);
                                        bArr3[c2] = (byte) ((j13 >> 16) & 255);
                                        bArr3[c3] = (byte) ((j13 >> 24) & 255);
                                        Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.s0, bArr3, 0, nativeByteBuffer.limit());
                                    }
                                    if (this.M != null) {
                                        this.Q0.seek(kb4Var.e);
                                        fc4.b("save file part " + this.r + " offset=" + kb4Var.e + " chunk_size=" + this.j0 + " isCdn=" + this.u0);
                                    }
                                    this.Q0.getChannel().write(nativeByteBuffer.buffer);
                                    ArrayList arrayList = this.M;
                                    long j14 = kb4Var.e;
                                    a(j14, j14 + j10, arrayList, true);
                                    if (this.u0) {
                                        long j15 = kb4Var.e / 131072;
                                        int size = this.P.size();
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= size) {
                                                break;
                                            }
                                            jb4 jb4Var = (jb4) this.P.get(i5);
                                            if (jb4Var.a > j15 || j15 > jb4Var.b) {
                                                i5++;
                                                str = str;
                                                str2 = str2;
                                                z2 = z2;
                                            } else {
                                                long j16 = j15 << c;
                                                long f = f(j16, 131072L, this.M);
                                                if (f != 0) {
                                                    if (f != 131072) {
                                                        long j17 = this.b0;
                                                        if (j17 > 0) {
                                                            if (f != j17 - j16) {
                                                            }
                                                        }
                                                    }
                                                    TLRPC.TL_fileHash tL_fileHash2 = (TLRPC.TL_fileHash) this.q0.get(Long.valueOf(j16));
                                                    RandomAccessFile randomAccessFile2 = this.C0;
                                                    if (randomAccessFile2 == null) {
                                                        this.D0 = new byte[131072];
                                                        z3 = z2;
                                                        randomAccessFile2 = new RandomAccessFile(this.J0, "r");
                                                        this.C0 = randomAccessFile2;
                                                    } else {
                                                        z3 = z2;
                                                    }
                                                    randomAccessFile2.seek(j16);
                                                    boolean z10 = e21.a;
                                                    if (f > 2147483647L) {
                                                        throw new RuntimeException("!!!");
                                                    }
                                                    this.C0.readFully(this.D0, 0, (int) f);
                                                    if (this.n0) {
                                                        long j18 = j16 / 16;
                                                        byte[] bArr4 = this.t0;
                                                        bArr4[15] = (byte) (j18 & 255);
                                                        bArr4[14] = (byte) ((j18 >> c4) & 255);
                                                        bArr4[c2] = (byte) ((j18 >> 16) & 255);
                                                        bArr4[c3] = (byte) ((j18 >> 24) & 255);
                                                        Utilities.aesCtrDecryptionByteArray(this.D0, this.s0, bArr4, 0, f, 0);
                                                        j2 = f;
                                                    } else {
                                                        j2 = f;
                                                    }
                                                    if (!Arrays.equals(Utilities.o(j2, this.D0), tL_fileHash2.hash)) {
                                                        if (e21.a) {
                                                            if (this.V != null) {
                                                                fc4.d("invalid cdn hash " + this.V + " id = " + this.V.id + " local_id = " + this.V.local_id + " access_hash = " + this.V.access_hash + str + this.V.volume_id + str2 + this.V.secret);
                                                            } else if (this.W != null) {
                                                                fc4.d("invalid cdn hash  " + this.W + " id = " + this.r);
                                                            }
                                                        }
                                                        h(0, false);
                                                        this.J0.delete();
                                                        return false;
                                                    }
                                                    this.q0.remove(Long.valueOf(j16));
                                                    a(j15, j15 + 1, this.P, false);
                                                }
                                            }
                                        }
                                    }
                                    z3 = z2;
                                    randomAccessFile = this.R0;
                                    if (randomAccessFile != null) {
                                        randomAccessFile.seek(0L);
                                        this.R0.write(this.i0);
                                    }
                                    if (this.b0 > 0 && this.Y == 1) {
                                        if (this.M != null) {
                                            this.N = new ArrayList(this.M);
                                        }
                                        this.g0.a(this, this.a0, this.b0);
                                    }
                                    z4 = z;
                                    z5 = z3;
                                }
                            }
                            z6 = true;
                            z = z6;
                            if (this.a0 < this.b0) {
                            }
                        } else {
                            int i6 = this.j0;
                            z = (limit == i6 && j12 != j11 && j11 % ((long) i6) == 0) ? false : true;
                        }
                        z2 = false;
                        boolean z92 = e21.a;
                        bArr = this.h0;
                        if (bArr != null) {
                        }
                        if (this.n0) {
                        }
                        if (this.M != null) {
                        }
                        this.Q0.getChannel().write(nativeByteBuffer.buffer);
                        ArrayList arrayList2 = this.M;
                        long j142 = kb4Var.e;
                        a(j142, j142 + j10, arrayList2, true);
                        if (this.u0) {
                        }
                        z3 = z2;
                        randomAccessFile = this.R0;
                        if (randomAccessFile != null) {
                        }
                        if (this.b0 > 0) {
                            if (this.M != null) {
                            }
                            this.g0.a(this, this.a0, this.b0);
                        }
                        z4 = z;
                        z5 = z3;
                    }
                    for (int i7 = 0; i7 < this.I0.size(); i7++) {
                        kb4 kb4Var2 = (kb4) this.I0.get(i7);
                        if (this.M != null || this.a0 == kb4Var2.e) {
                            this.I0.remove(i7);
                            if (!k(kb4Var2, null)) {
                                TLRPC.TL_upload_file tL_upload_file4 = kb4Var2.f;
                                if (tL_upload_file4 != null) {
                                    tL_upload_file4.disableFree = false;
                                    tL_upload_file4.freeResources();
                                } else {
                                    TLRPC.TL_upload_webFile tL_upload_webFile4 = kb4Var2.g;
                                    if (tL_upload_webFile4 != null) {
                                        tL_upload_webFile4.disableFree = false;
                                        tL_upload_webFile4.freeResources();
                                    } else {
                                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile4 = kb4Var2.h;
                                        if (tL_upload_cdnFile4 != null) {
                                            tL_upload_cdnFile4.disableFree = false;
                                            tL_upload_cdnFile4.freeResources();
                                        }
                                    }
                                }
                            }
                            if (!z4) {
                                i(0, true, z5);
                                return false;
                            }
                            if (this.Y != 4 && this.Y != 5) {
                                q(kb4Var.d);
                                return false;
                            }
                        }
                    }
                    if (!z4) {
                    }
                }
                i(r15, true, r15);
                return r15;
            } catch (Exception e) {
                fc4.g(e, ((e instanceof FileNotFoundException) || (e instanceof EOFException) || gm.D1(e)) ? false : true);
                if (gm.D1(e)) {
                    h(-1, false);
                } else if (gm.E1(e)) {
                    gda.h(this.L0);
                    h(-1, true);
                } else {
                    h(0, false);
                }
            }
        } else {
            if (tL_error.text.contains("LIMIT_INVALID") && !kb4Var.i) {
                Runnable runnable = kb4Var.l;
                if (runnable != null) {
                    runnable.run();
                }
                ArrayList arrayList3 = this.O;
                long j19 = kb4Var.e;
                l(j19, kb4Var.c + j19, arrayList3);
                if (!this.e) {
                    this.e = true;
                    this.j0 = 32768;
                    this.k0 = 4;
                }
                q(kb4Var.d);
                return false;
            }
            boolean contains = tL_error.text.contains("FILE_MIGRATE_");
            String str3 = tL_error.text;
            if (!contains) {
                if (str3.contains("OFFSET_INVALID")) {
                    if (this.a0 % this.j0 != 0) {
                        h(0, false);
                        return false;
                    }
                    try {
                        i(0, true, false);
                        return false;
                    } catch (Exception e2) {
                        fc4.f(e2);
                        h(0, false);
                        return false;
                    }
                }
                if (tL_error.text.contains("RETRY_LIMIT")) {
                    h(2, false);
                    return false;
                }
                if (e21.a) {
                    TLRPC.InputFileLocation inputFileLocation = this.V;
                    if (inputFileLocation != null) {
                        boolean z11 = inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation;
                        String str4 = tL_error.text;
                        if (z11) {
                            fc4.d(str4 + " " + this.V + " peer_did = " + pg3.m(((TLRPC.TL_inputPeerPhotoFileLocation) this.V).peer) + " peer_access_hash=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).peer.access_hash + " photo_id=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).photo_id + " big=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).big);
                        } else {
                            fc4.d(str4 + " " + this.V + " id = " + this.V.id + " local_id = " + this.V.local_id + " access_hash = " + this.V.access_hash + " volume_id = " + this.V.volume_id + str2 + this.V.secret);
                        }
                    } else if (this.W != null) {
                        fc4.d(tL_error.text + " " + this.W + " id = " + this.r);
                    }
                }
                h(0, false);
                return false;
            }
            Scanner scanner = new Scanner(str3.replace("FILE_MIGRATE_", ""));
            scanner.useDelimiter("");
            try {
                num = Integer.valueOf(scanner.nextInt());
            } catch (Exception unused) {
                num = null;
            }
            if (num == null) {
                h(0, false);
            } else {
                this.T = num.intValue();
                this.a0 = 0L;
                this.Q = 0L;
                q(kb4Var.d);
            }
        }
        return false;
    }

    public final void m(long j) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.x0;
        tL_upload_getCdnFileHashes.offset = j;
        ConnectionsManager.getInstance(this.R).sendRequest(tL_upload_getCdnFileHashes, new tg(this, (byte) 26), null, null, 0, this.T, 1, true);
    }

    public final void n(kb4 kb4Var) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (this.A0) {
            return;
        }
        c(null, false, false);
        this.A0 = true;
        this.B0 = true;
        Object obj = this.p0;
        if (obj instanceof k47) {
            k47 k47Var = (k47) obj;
            if (k47Var.e1() < 0 && (message = k47Var.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.p0 = webPage;
                this.j = false;
            }
        }
        if (e21.a) {
            fc4.b("debug_loading: " + this.L0.getName() + " file reference expired ");
        }
        ad4.n(this.R).u(new Object[]{this.V, this, kb4Var}, this.p0);
    }

    public final void o(boolean z) {
        if (this.y != z) {
            if (!z || this.b0 > 2097152) {
                fc4.d("setIsPreloadVideoOperation " + z + " file=" + this.r);
                if (z || !this.y) {
                    this.y = z;
                    return;
                }
                if (this.Y != 3) {
                    byte b = 1;
                    if (this.Y == 1) {
                        Utilities.d.c(new gb4(this, z, b));
                        return;
                    } else {
                        this.y = z;
                        return;
                    }
                }
                this.y = z;
                if (this.j0 != 0 && !this.e && !this.j && !this.r0) {
                    r();
                }
                this.Y = (byte) 0;
                this.z = false;
                p();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0386, code lost:
    
        if (r9 != r33.L0.length()) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0621 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0899 A[Catch: Exception -> 0x089f, TRY_LEAVE, TryCatch #10 {Exception -> 0x089f, blocks: (B:273:0x0888, B:275:0x0899), top: B:272:0x0888 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0431  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        long j;
        String q;
        String str;
        String str2;
        String str3;
        String q2;
        String q3;
        String j2;
        String q4;
        String str4;
        String str5;
        String str6;
        Object obj;
        File file;
        boolean exists;
        int i;
        int i2;
        boolean z;
        boolean[] zArr;
        boolean z2;
        boolean[] zArr2;
        String str7;
        long j3;
        ArrayList arrayList;
        zb4 zb4Var;
        int i3;
        boolean z3;
        long j4;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        String str8;
        final mb4 mb4Var = this.b;
        final long j5 = this.d;
        final boolean z4 = this.c;
        this.d1 = System.currentTimeMillis();
        s();
        if (this.j0 == 0) {
            if (this.e) {
                if (e21.a) {
                    fc4.b("debug_loading: restart with small chunk");
                }
                this.j0 = 32768;
                this.k0 = 4;
            } else if (this.j) {
                this.j0 = this.n;
                this.k0 = this.p;
            } else if (this.r0) {
                this.j0 = 131072;
                this.k0 = 4;
            } else {
                boolean z5 = this.b0 >= 10485760;
                this.j0 = z5 ? this.n : 32768;
                this.k0 = z5 ? this.p : this.o;
                r();
            }
        }
        final boolean z6 = this.Y != 0;
        this.Z = false;
        if (mb4Var != null) {
            Utilities.d.c(new Runnable() { // from class: fb4
                @Override // java.lang.Runnable
                public final void run() {
                    lb4 lb4Var = lb4.this;
                    boolean z7 = z4;
                    long j6 = j5;
                    mb4 mb4Var2 = mb4Var;
                    boolean z8 = z6;
                    if (lb4Var.m == null) {
                        lb4Var.m = new ArrayList();
                    }
                    long j7 = lb4Var.j0;
                    if (z7) {
                        long j8 = (j6 / j7) * j7;
                        kb4 kb4Var = lb4Var.f0;
                        if (kb4Var != null && kb4Var.e != j8) {
                            int i4 = kb4Var.a;
                            lb4Var.G0.remove(kb4Var);
                            gm.c3(new cb4(lb4Var, i4, (byte) 2));
                            long j9 = lb4Var.Q;
                            long j10 = lb4Var.j0;
                            lb4Var.Q = j9 - j10;
                            ArrayList arrayList2 = lb4Var.O;
                            long j11 = lb4Var.f0.e;
                            lb4.l(j11, j10 + j11, arrayList2);
                            if (lb4Var.f0.a != 0) {
                                ConnectionsManager.getInstance(lb4Var.R).cancelRequest(lb4Var.f0.a, true);
                                lb4Var.l0--;
                            }
                            boolean z9 = e21.a;
                            wi8.q(lb4Var.f0.e, new StringBuilder("frame get cancel request at offset "));
                            kb4Var = null;
                            lb4Var.f0 = null;
                        }
                        if (kb4Var == null) {
                            lb4Var.e0 = j8;
                        }
                    } else {
                        lb4Var.d0 = (j6 / j7) * j7;
                    }
                    if (!lb4Var.m.contains(mb4Var2)) {
                        lb4Var.m.add(mb4Var2);
                        fc4.d("FileLoadOperation " + lb4Var.r + " start, adding stream " + mb4Var2);
                    }
                    if (!lb4Var.m.isEmpty()) {
                        Utilities.d.a(lb4Var.f1);
                    }
                    if (z8) {
                        if (lb4Var.t != null) {
                            if (lb4Var.f(lb4Var.d0, 1L, lb4Var.M) == 0 && lb4Var.t.get(Long.valueOf(lb4Var.d0)) != null) {
                                lb4Var.K = true;
                            }
                        }
                        lb4Var.q(-1);
                        lb4Var.K = false;
                    }
                    if (lb4Var.M != null) {
                        lb4Var.g();
                    }
                }
            });
        } else if (z6) {
            Utilities.d.c(new bb4(this, (byte) 3));
        }
        if (z6) {
            return;
        }
        if (this.V == null && this.W == null) {
            boolean z7 = e21.a;
            fc4.b("loadOperation: no location, failing");
            h(0, true);
            return;
        }
        long j6 = this.j0;
        this.d0 = (j5 / j6) * j6;
        if (this.o0) {
            long j7 = this.b0;
            if (j7 > 0 && j7 > j6) {
                this.M = new ArrayList();
                this.O = new ArrayList();
            }
        }
        if (this.W != null) {
            String a = Utilities.a(this.X.a);
            if (this.n0) {
                q3 = td4.p(a, ".temp.enc");
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(".");
                str8 = b10.j(sb, this.P0, ".enc");
                if (this.h0 != null) {
                    q4 = td4.p(a, "_64.iv.enc");
                    str5 = str8;
                    j = 0;
                }
                q4 = null;
                str5 = str8;
                j = 0;
            } else {
                String p = td4.p(a, ".temp");
                String str9 = a + "." + this.P0;
                if (this.h0 != null) {
                    q4 = td4.p(a, "_64.iv");
                    q3 = p;
                    str8 = str9;
                    str5 = str8;
                    j = 0;
                } else {
                    q3 = p;
                    str8 = str9;
                    q4 = null;
                    str5 = str8;
                    j = 0;
                }
            }
            this.G0 = new ArrayList(this.k0);
            this.H0 = new ArrayList();
            this.I0 = new ArrayList(this.k0 - 1);
            this.Y = (byte) 1;
            obj = this.p0;
            if (!(obj instanceof TLRPC.TL_theme)) {
                file = new File(a.h(), kt6.q(new StringBuilder("remote"), ((TLRPC.TL_theme) obj).id, ".attheme"));
                this.L0 = file;
            } else if (this.n0) {
                file = new File(this.T0, str5);
                this.L0 = file;
            } else {
                file = new File(this.T0, this.s);
                this.L0 = file;
            }
            exists = file.exists();
            this.O0 = exists;
            if (exists) {
                if (!(this.p0 instanceof TLRPC.TL_theme)) {
                    long j8 = this.b0;
                    if (j8 != j) {
                        if (!this.a1) {
                        }
                    }
                }
                zb4 zb4Var2 = this.g0;
                final String file2 = this.L0.toString();
                final lc4 lc4Var = zb4Var2.e.d;
                lc4Var.getClass();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final boolean[] zArr3 = {false};
                final byte b = 0;
                lc4Var.h(new Runnable() { // from class: ic4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        boolean[] zArr4 = zArr3;
                        String str10 = file2;
                        lc4 lc4Var2 = lc4Var;
                        switch (b2) {
                            case 0:
                                lc4Var2.c();
                                try {
                                    try {
                                        SQLiteCursor queryFinalized = lc4Var2.c.queryFinalized("SELECT flags FROM paths WHERE path = '" + str10 + "'", new Object[0]);
                                        if (queryFinalized.next()) {
                                            zArr4[0] = (queryFinalized.intValue(0) & 1) != 0;
                                        }
                                    } finally {
                                    }
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                return;
                            default:
                                lc4Var2.c();
                                try {
                                    try {
                                        if (lc4Var2.c.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str10 + "'", new Object[0]).next()) {
                                            zArr4[0] = true;
                                        }
                                    } catch (Exception e2) {
                                        fc4.g(e2, true);
                                    }
                                    return;
                                } finally {
                                }
                        }
                    }
                });
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    fc4.g(e, true);
                }
                if (!zArr3[0]) {
                    if (e21.a) {
                        fc4.b("debug_loading: delete existing file cause file size mismatch " + this.L0.getName() + " totalSize=" + this.b0 + " existingFileSize=" + this.L0.length());
                    }
                    zb4 zb4Var3 = this.g0;
                    final String file3 = this.L0.toString();
                    final lc4 lc4Var2 = zb4Var3.e.d;
                    lc4Var2.getClass();
                    final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    final boolean[] zArr4 = {false};
                    final byte b2 = 1;
                    lc4Var2.h(new Runnable() { // from class: ic4
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b2;
                            CountDownLatch countDownLatch22 = countDownLatch2;
                            boolean[] zArr42 = zArr4;
                            String str10 = file3;
                            lc4 lc4Var22 = lc4Var2;
                            switch (b22) {
                                case 0:
                                    lc4Var22.c();
                                    try {
                                        try {
                                            SQLiteCursor queryFinalized = lc4Var22.c.queryFinalized("SELECT flags FROM paths WHERE path = '" + str10 + "'", new Object[0]);
                                            if (queryFinalized.next()) {
                                                zArr42[0] = (queryFinalized.intValue(0) & 1) != 0;
                                            }
                                        } finally {
                                        }
                                    } catch (Exception e2) {
                                        fc4.g(e2, true);
                                    }
                                    return;
                                default:
                                    lc4Var22.c();
                                    try {
                                        try {
                                            if (lc4Var22.c.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str10 + "'", new Object[0]).next()) {
                                                zArr42[0] = true;
                                            }
                                        } catch (Exception e22) {
                                            fc4.g(e22, true);
                                        }
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                    try {
                        countDownLatch2.await();
                    } catch (InterruptedException e2) {
                        fc4.g(e2, true);
                    }
                    if (!zArr4[0]) {
                        this.L0.delete();
                    }
                    exists = false;
                }
            }
            if (!exists) {
                this.S = true;
                try {
                    i(1, false, false);
                    xy xyVar = this.c1;
                    if (xyVar != null) {
                        zb4 zb4Var4 = this.g0;
                        File file4 = this.L0;
                        lc4 lc4Var3 = zb4Var4.e.d;
                        long j9 = xyVar.b;
                        int i4 = xyVar.c;
                        byte b3 = xyVar.d;
                        String file5 = file4 != null ? file4.toString() : null;
                        lc4Var3.getClass();
                        lc4Var3.h(new jc4(lc4Var3, j9, i4, b3, file5, 0));
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, false);
                    if (gm.D1(e3)) {
                        LaunchActivity.F(1);
                        i = -1;
                        h(-1, true);
                    } else {
                        i = -1;
                    }
                    if (!gm.E1(e3)) {
                        h(0, true);
                        return;
                    } else {
                        gda.h(this.L0);
                        h(i, true);
                        return;
                    }
                }
            }
            this.J0 = new File(this.U0, str6);
            if (this.a1) {
                this.K0 = new File(this.U0, str6.concat(".gz"));
            }
            if (this.n0) {
                File file6 = new File(a.b.getCacheDir(), str5.concat(".key"));
                try {
                    randomAccessFile2 = new RandomAccessFile(file6, "rws");
                    long length = file6.length();
                    byte[] bArr = new byte[32];
                    this.s0 = bArr;
                    this.t0 = new byte[16];
                    if (length <= j || length % 48 != j) {
                        SecureRandom secureRandom = Utilities.b;
                        secureRandom.nextBytes(bArr);
                        secureRandom.nextBytes(this.t0);
                        randomAccessFile2.write(this.s0);
                        randomAccessFile2.write(this.t0);
                        z = true;
                    } else {
                        randomAccessFile2.read(bArr, 0, 32);
                        randomAccessFile2.read(this.t0, 0, 16);
                        z = false;
                    }
                } catch (Exception e4) {
                    e = e4;
                    z = false;
                }
                try {
                    try {
                        randomAccessFile2.getChannel().close();
                    } catch (Exception e5) {
                        fc4.g(e5, true);
                    }
                    randomAccessFile2.close();
                    i2 = 1;
                } catch (Exception e6) {
                    e = e6;
                    i2 = 1;
                    if (gm.D1(e)) {
                        LaunchActivity.F(1);
                        fc4.g(e, false);
                    } else if (gm.E1(e)) {
                        gda.h(this.L0);
                        fc4.g(e, false);
                    } else {
                        fc4.g(e, true);
                    }
                    zArr = new boolean[i2];
                    zArr[0] = false;
                    if (this.B) {
                    }
                    z2 = z;
                    zArr2 = zArr;
                    str7 = str4;
                    j3 = 2;
                    if (str7 != null) {
                    }
                    if (this.X0 != null) {
                    }
                    if (this.J0.exists()) {
                    }
                    arrayList = this.M;
                    if (arrayList != null) {
                    }
                    if (e21.a) {
                    }
                    if (str2 != null) {
                    }
                    if (!this.y) {
                    }
                    zb4Var = this.g0;
                    if (zb4Var != null) {
                    }
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.J0, "rws");
                    this.Q0 = randomAccessFile3;
                    j4 = this.a0;
                    if (j4 != 0) {
                    }
                    z3 = true;
                    i3 = 0;
                    if (this.Q0 != null) {
                    }
                }
            } else {
                i2 = 1;
                z = false;
            }
            zArr = new boolean[i2];
            zArr[0] = false;
            if (this.B || q2 == null) {
                z2 = z;
                zArr2 = zArr;
                str7 = str4;
                j3 = 2;
            } else {
                this.A = new File(this.U0, q2);
                try {
                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(this.A, "rws");
                    this.v = randomAccessFile4;
                    long length2 = randomAccessFile4.length();
                    this.w = 1;
                    if (length2 > 1) {
                        zArr[0] = this.v.readByte() != 0;
                        long j10 = 1;
                        while (j10 < length2) {
                            if (length2 - j10 < 8) {
                                break;
                            }
                            long readLong = this.v.readLong();
                            if (length2 - (j10 + 8) < 8 || readLong < j) {
                                break;
                            }
                            j3 = 2;
                            try {
                                if (readLong <= this.b0) {
                                    long readLong2 = this.v.readLong();
                                    long j11 = j10 + 16;
                                    if (length2 - j11 >= readLong2) {
                                        zArr2 = zArr;
                                        if (readLong2 <= this.j0) {
                                            try {
                                                ib4 ib4Var = new ib4(j11, readLong2);
                                                long j12 = j11 + readLong2;
                                                this.v.seek(j12);
                                                if (length2 - j12 >= 24) {
                                                    long readLong3 = this.v.readLong();
                                                    this.E = readLong3;
                                                    if (readLong3 != j) {
                                                        z2 = z;
                                                        try {
                                                            str7 = str4;
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            str7 = str4;
                                                            fc4.g(e, false);
                                                            if (!this.y) {
                                                                this.A = null;
                                                                try {
                                                                    randomAccessFile = this.v;
                                                                    if (randomAccessFile != null) {
                                                                    }
                                                                } catch (Exception e8) {
                                                                    fc4.g(e8, true);
                                                                }
                                                            }
                                                            if (str7 != null) {
                                                            }
                                                            if (this.X0 != null) {
                                                            }
                                                            if (this.J0.exists()) {
                                                            }
                                                            arrayList = this.M;
                                                            if (arrayList != null) {
                                                            }
                                                            if (e21.a) {
                                                            }
                                                            if (str2 != null) {
                                                            }
                                                            if (!this.y) {
                                                                this.N = new ArrayList(this.M);
                                                            }
                                                            zb4Var = this.g0;
                                                            if (zb4Var != null) {
                                                            }
                                                            RandomAccessFile randomAccessFile32 = new RandomAccessFile(this.J0, "rws");
                                                            this.Q0 = randomAccessFile32;
                                                            j4 = this.a0;
                                                            if (j4 != 0) {
                                                            }
                                                            z3 = true;
                                                            i3 = 0;
                                                            if (this.Q0 != null) {
                                                            }
                                                        }
                                                        try {
                                                            this.G = this.C > this.b0 / 2 ? (byte) 2 : (byte) 1;
                                                            this.F = readLong3;
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                            fc4.g(e, false);
                                                            if (!this.y) {
                                                            }
                                                            if (str7 != null) {
                                                            }
                                                            if (this.X0 != null) {
                                                            }
                                                            if (this.J0.exists()) {
                                                            }
                                                            arrayList = this.M;
                                                            if (arrayList != null) {
                                                            }
                                                            if (e21.a) {
                                                            }
                                                            if (str2 != null) {
                                                            }
                                                            if (!this.y) {
                                                            }
                                                            zb4Var = this.g0;
                                                            if (zb4Var != null) {
                                                            }
                                                            RandomAccessFile randomAccessFile322 = new RandomAccessFile(this.J0, "rws");
                                                            this.Q0 = randomAccessFile322;
                                                            j4 = this.a0;
                                                            if (j4 != 0) {
                                                            }
                                                            z3 = true;
                                                            i3 = 0;
                                                            if (this.Q0 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z2 = z;
                                                        str7 = str4;
                                                    }
                                                    this.C = this.v.readLong();
                                                    this.D = this.v.readLong();
                                                    j10 = j12 + 24;
                                                    if (this.t == null) {
                                                        this.t = new HashMap();
                                                    }
                                                    if (this.u == null) {
                                                        this.u = new HashMap();
                                                    }
                                                    this.t.put(Long.valueOf(readLong), ib4Var);
                                                    this.u.put(Long.valueOf(readLong), 1);
                                                    this.x = (int) (this.x + readLong2);
                                                    this.w = (int) (readLong2 + 36 + this.w);
                                                    z = z2;
                                                    zArr = zArr2;
                                                    str4 = str7;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                z2 = z;
                                            }
                                        }
                                        z2 = z;
                                        str7 = str4;
                                        break;
                                    }
                                }
                                z2 = z;
                                zArr2 = zArr;
                                str7 = str4;
                                break;
                            } catch (Exception e11) {
                                e = e11;
                                z2 = z;
                                zArr2 = zArr;
                            }
                        }
                    }
                    z2 = z;
                    zArr2 = zArr;
                    str7 = str4;
                    j3 = 2;
                    this.v.seek(this.w);
                } catch (Exception e12) {
                    e = e12;
                    z2 = z;
                    zArr2 = zArr;
                    str7 = str4;
                    j3 = 2;
                }
                if (!this.y && this.t == null) {
                    this.A = null;
                    randomAccessFile = this.v;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.getChannel().close();
                        } catch (Exception e13) {
                            fc4.g(e13, true);
                        }
                        this.v.close();
                        this.v = null;
                    }
                }
            }
            if (str7 != null) {
                this.N0 = new File(this.U0, str7);
                if (!this.J0.exists()) {
                    this.N0.delete();
                }
                try {
                    RandomAccessFile randomAccessFile5 = new RandomAccessFile(this.N0, "rws");
                    this.S0 = randomAccessFile5;
                    long length3 = randomAccessFile5.length();
                    if (length3 % 8 == 4) {
                        int readInt = this.S0.readInt();
                        if (readInt <= (length3 - 4) / j3) {
                            for (int i5 = 0; i5 < readInt; i5++) {
                                long readLong4 = this.S0.readLong();
                                long readLong5 = this.S0.readLong();
                                this.M.add(new jb4(readLong4, readLong5));
                                this.O.add(new jb4(readLong4, readLong5));
                            }
                        }
                    }
                } catch (Exception e14) {
                    Typeface typeface = gm.a;
                    fc4.g(e14, !((e14 instanceof FileNotFoundException) || (e14 instanceof EOFException)));
                }
            }
            if (this.X0 != null) {
                lc4 lc4Var4 = bc4.G(this.R).d;
                File file7 = this.N0;
                kc4 kc4Var = this.X0;
                lc4Var4.getClass();
                byte b4 = 27;
                if (file7 != null && kc4Var != null) {
                    lc4Var4.h(new pz2(lc4Var4, file7, kc4Var, b4));
                }
                lc4 lc4Var5 = bc4.G(this.R).d;
                File file8 = this.J0;
                kc4 kc4Var2 = this.X0;
                lc4Var5.getClass();
                if (file8 != null && kc4Var2 != null) {
                    lc4Var5.h(new pz2(lc4Var5, file8, kc4Var2, b4));
                }
            }
            if (this.J0.exists()) {
                ArrayList arrayList2 = this.M;
                if (arrayList2 != null && arrayList2.isEmpty()) {
                    this.M.add(new jb4(0L, this.b0));
                    this.O.add(new jb4(0L, this.b0));
                }
            } else {
                File file9 = this.J0;
                if (z2) {
                    file9.delete();
                } else {
                    long length4 = file9.length();
                    if (str2 == null || length4 % this.j0 == j) {
                        long j13 = j;
                        long length5 = this.J0.length();
                        int i6 = this.j0;
                        long j14 = i6;
                        long j15 = length5 / j14;
                        if ((length5 ^ j14) < j13 && j14 * j15 != length5) {
                            j15--;
                        }
                        long j16 = j15 * i6;
                        this.a0 = j16;
                        this.Q = j16;
                    } else {
                        this.Q = j;
                    }
                    ArrayList arrayList3 = this.M;
                    if (arrayList3 != null && arrayList3.isEmpty()) {
                        this.M.add(new jb4(this.a0, this.b0));
                        this.O.add(new jb4(this.a0, this.b0));
                    }
                }
            }
            arrayList = this.M;
            if (arrayList != null) {
                this.a0 = this.b0;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    jb4 jb4Var = (jb4) this.M.get(i7);
                    this.a0 -= jb4Var.b - jb4Var.a;
                }
                this.Q = this.a0;
            }
            if (e21.a) {
                boolean z8 = this.y;
                File file10 = this.J0;
                if (z8) {
                    fc4.b("start preloading file to temp = " + file10);
                } else {
                    StringBuilder sb2 = new StringBuilder("start loading file to temp = ");
                    sb2.append(file10);
                    sb2.append(" final = ");
                    sb2.append(this.L0);
                    sb2.append(" priority");
                    b10.p(this.W0, sb2);
                }
            }
            if (str2 != null) {
                this.M0 = new File(this.U0, str2);
                try {
                    this.R0 = new RandomAccessFile(this.M0, "rws");
                    if (this.a0 != 0 && !z2) {
                        long length6 = this.M0.length();
                        if (length6 <= 0 || length6 % 64 != 0) {
                            this.a0 = 0L;
                            this.Q = 0L;
                        } else {
                            this.R0.read(this.i0, 0, 64);
                        }
                    }
                } catch (Exception e15) {
                    this.a0 = 0L;
                    this.Q = 0L;
                    if (gm.D1(e15)) {
                        LaunchActivity.F(1);
                        fc4.g(e15, false);
                    } else if (gm.E1(e15)) {
                        gda.h(this.L0);
                        fc4.g(e15, false);
                    } else {
                        fc4.g(e15, true);
                    }
                }
            }
            if (!this.y && this.a0 != 0 && this.b0 > 0 && this.M != null) {
                this.N = new ArrayList(this.M);
            }
            zb4Var = this.g0;
            if (zb4Var != null) {
                long j17 = this.a0;
                long j18 = this.b0;
                if (j17 != j18 && j18 > 0) {
                    zb4Var.a(this, j17, j18);
                }
            }
            try {
                RandomAccessFile randomAccessFile3222 = new RandomAccessFile(this.J0, "rws");
                this.Q0 = randomAccessFile3222;
                j4 = this.a0;
                if (j4 != 0) {
                    randomAccessFile3222.seek(j4);
                }
                z3 = true;
                i3 = 0;
            } catch (Exception e16) {
                i3 = 0;
                fc4.g(e16, false);
                z3 = true;
                if (gm.D1(e16)) {
                    LaunchActivity.F(1);
                    h(-1, true);
                    return;
                } else if (gm.E1(e16)) {
                    gda.h(this.L0);
                    fc4.g(e16, false);
                    h(-1, true);
                    return;
                }
            }
            if (this.Q0 != null) {
                h(i3, z3);
                return;
            } else {
                this.S = z3;
                Utilities.d.c(new pv3(this, zArr2, (byte) 19));
                return;
            }
        }
        TLRPC.InputFileLocation inputFileLocation = this.V;
        long j19 = inputFileLocation.volume_id;
        j = 0;
        if (j19 == 0 || inputFileLocation.local_id == 0) {
            int i8 = this.T;
            if (i8 == 0 || inputFileLocation.id == 0) {
                h(0, true);
                return;
            }
            if (this.n0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i8);
                sb3.append("_");
                q3 = kt6.q(sb3, this.V.id, ".temp.enc");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.T);
                sb4.append("_");
                sb4.append(this.V.id);
                j2 = b10.j(sb4, this.P0, ".enc");
                if (this.h0 != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(this.T);
                    sb5.append("_");
                    q4 = kt6.q(sb5, this.V.id, "_64.iv.enc");
                    str5 = j2;
                }
                str5 = j2;
                q2 = null;
                str4 = null;
                str6 = q3;
                str2 = null;
                this.G0 = new ArrayList(this.k0);
                this.H0 = new ArrayList();
                this.I0 = new ArrayList(this.k0 - 1);
                this.Y = (byte) 1;
                obj = this.p0;
                if (!(obj instanceof TLRPC.TL_theme)) {
                }
                exists = file.exists();
                this.O0 = exists;
                if (exists) {
                }
                if (!exists) {
                }
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(i8);
                sb6.append("_");
                q = kt6.q(sb6, this.V.id, ".temp");
                str = this.T + "_" + this.V.id + this.P0;
                if (this.h0 != null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(this.T);
                    sb7.append("_");
                    str2 = kt6.q(sb7, this.V.id, "_64.iv");
                } else {
                    str2 = null;
                }
                if (this.M != null) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(this.T);
                    sb8.append("_");
                    str3 = kt6.q(sb8, this.V.id, "_64.pt");
                } else {
                    str3 = null;
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(this.T);
                sb9.append("_");
                q2 = kt6.q(sb9, this.V.id, "_64.preload");
                str4 = str3;
                str5 = str;
                str6 = q;
                this.G0 = new ArrayList(this.k0);
                this.H0 = new ArrayList();
                this.I0 = new ArrayList(this.k0 - 1);
                this.Y = (byte) 1;
                obj = this.p0;
                if (!(obj instanceof TLRPC.TL_theme)) {
                }
                exists = file.exists();
                this.O0 = exists;
                if (exists) {
                }
                if (!exists) {
                }
            }
        } else {
            int i9 = this.T;
            if (i9 == Integer.MIN_VALUE || j19 == -2147483648L || i9 == 0) {
                h(0, true);
                return;
            }
            boolean z9 = this.n0;
            long j20 = inputFileLocation.volume_id;
            if (z9) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(j20);
                sb10.append("_");
                q3 = hg9.k(sb10, this.V.local_id, ".temp.enc");
                StringBuilder sb11 = new StringBuilder();
                sb11.append(this.V.volume_id);
                sb11.append("_");
                sb11.append(this.V.local_id);
                sb11.append(".");
                j2 = b10.j(sb11, this.P0, ".enc");
                if (this.h0 != null) {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(this.V.volume_id);
                    sb12.append("_");
                    q4 = hg9.k(sb12, this.V.local_id, "_64.iv.enc");
                    str5 = j2;
                }
                str5 = j2;
                q2 = null;
                str4 = null;
                str6 = q3;
                str2 = null;
                this.G0 = new ArrayList(this.k0);
                this.H0 = new ArrayList();
                this.I0 = new ArrayList(this.k0 - 1);
                this.Y = (byte) 1;
                obj = this.p0;
                if (!(obj instanceof TLRPC.TL_theme)) {
                }
                exists = file.exists();
                this.O0 = exists;
                if (exists) {
                }
                if (!exists) {
                }
            } else {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(j20);
                sb13.append("_");
                q = hg9.k(sb13, this.V.local_id, ".temp");
                str = this.V.volume_id + "_" + this.V.local_id + "." + this.P0;
                if (this.h0 != null) {
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(this.V.volume_id);
                    sb14.append("_");
                    str2 = hg9.k(sb14, this.V.local_id, "_64.iv");
                } else {
                    str2 = null;
                }
                if (this.M != null) {
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(this.V.volume_id);
                    sb15.append("_");
                    str3 = hg9.k(sb15, this.V.local_id, "_64.pt");
                } else {
                    str3 = null;
                }
                StringBuilder sb16 = new StringBuilder();
                sb16.append(this.V.volume_id);
                sb16.append("_");
                q2 = hg9.k(sb16, this.V.local_id, "_64.preload");
                str4 = str3;
                str5 = str;
                str6 = q;
                this.G0 = new ArrayList(this.k0);
                this.H0 = new ArrayList();
                this.I0 = new ArrayList(this.k0 - 1);
                this.Y = (byte) 1;
                obj = this.p0;
                if (!(obj instanceof TLRPC.TL_theme)) {
                }
                exists = file.exists();
                this.O0 = exists;
                if (exists) {
                }
                if (!exists) {
                }
            }
        }
        q2 = null;
        str4 = null;
        str6 = q3;
        str2 = q4;
        this.G0 = new ArrayList(this.k0);
        this.H0 = new ArrayList();
        this.I0 = new ArrayList(this.k0 - 1);
        this.Y = (byte) 1;
        obj = this.p0;
        if (!(obj instanceof TLRPC.TL_theme)) {
        }
        exists = file.exists();
        this.O0 = exists;
        if (exists) {
        }
        if (!exists) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if ("speech_model".equals(r2) != false) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i) {
        int i2;
        int max;
        int i3;
        long j;
        int i4;
        int i5;
        long j2;
        long j3;
        long j4;
        int i6;
        TLObject tLObject;
        byte b;
        int i7;
        HashMap hashMap;
        ib4 ib4Var;
        ArrayList arrayList;
        int i8;
        boolean z;
        Pair m;
        Pair m2;
        lb4 lb4Var = this;
        Utilities.d.a(lb4Var.h);
        boolean z2 = e21.a;
        int i9 = 1;
        if (lb4Var.Y == 5) {
            lb4Var.Y = (byte) 1;
        }
        if (lb4Var.Z || lb4Var.z0 || lb4Var.Y != 1 || lb4Var.A0) {
            return;
        }
        long j5 = 0;
        if (lb4Var.j || lb4Var.e0 != 0 || lb4Var.K || lb4Var.I0.size() + lb4Var.G0.size() < lb4Var.k0) {
            if (lb4Var.y) {
                if (lb4Var.Q > 2097152) {
                    return;
                }
                if (lb4Var.G != 0 && lb4Var.G0.size() > 0) {
                    return;
                }
            }
            ?? r10 = 0;
            if (lb4Var.j) {
                max = Math.max(0, lb4Var.k0 - lb4Var.G0.size());
            } else {
                if (lb4Var.e0 != 0 || lb4Var.K || ((lb4Var.y && lb4Var.G == 0) || lb4Var.b0 <= 0)) {
                    i2 = 1;
                    if (!lb4Var.B0) {
                        ad4 n = ad4.n(lb4Var.R);
                        Object obj = lb4Var.p0;
                        Object[] objArr = {lb4Var.V, lb4Var};
                        Pair p = ad4.p(objArr, obj);
                        if (p != null) {
                            TLRPC.InputFileLocation inputFileLocation = (TLRPC.InputFileLocation) p.first;
                            String str = (String) p.second;
                            String o = ad4.o(obj);
                            if (o != null) {
                                if (obj instanceof String) {
                                    String str2 = (String) obj;
                                    String str3 = "wallpaper";
                                    if (!"wallpaper".equals(str2)) {
                                        str3 = "gif";
                                        if (!str2.startsWith("gif")) {
                                            str3 = "recent";
                                            if (!"recent".equals(str2)) {
                                                str3 = "fav";
                                                if (!"fav".equals(str2)) {
                                                    str3 = "update";
                                                    if (!"update".equals(str2)) {
                                                        str3 = "speech_model";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    str = str3;
                                }
                                xc4 b2 = n.b(str);
                                if (b2 == null || (m2 = n.m(inputFileLocation, o, b2.a, objArr)) == null) {
                                    xc4 b3 = n.b(o);
                                    if (b3 != null && (m = n.m(inputFileLocation, null, b3.a, objArr)) != null) {
                                        z = ad4.w((byte[]) m.first, (TLRPC.InputFileLocation) m.second, inputFileLocation, objArr);
                                    }
                                } else {
                                    z = ad4.w((byte[]) m2.first, (TLRPC.InputFileLocation) m2.second, inputFileLocation, objArr);
                                }
                                if (z) {
                                    fc4.b(lb4Var.r + " before download updated file ref from file ref cache!");
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    i3 = 0;
                    lb4 lb4Var2 = lb4Var;
                    while (i3 < i2) {
                        if (!lb4Var2.y) {
                            j = j5;
                            ArrayList arrayList2 = lb4Var2.O;
                            if (arrayList2 != null) {
                                long j6 = lb4Var2.e0;
                                if (j6 == j) {
                                    j6 = lb4Var2.d0;
                                }
                                int size = arrayList2.size();
                                int i10 = r10;
                                long j7 = Long.MAX_VALUE;
                                long j8 = Long.MAX_VALUE;
                                while (true) {
                                    if (i10 >= size) {
                                        i4 = i9;
                                        i5 = i2;
                                        j3 = Long.MAX_VALUE;
                                        j6 = j7;
                                        break;
                                    }
                                    j3 = Long.MAX_VALUE;
                                    jb4 jb4Var = (jb4) lb4Var2.O.get(i10);
                                    if (j6 != j) {
                                        i5 = i2;
                                        long j9 = jb4Var.a;
                                        i4 = i9;
                                        j4 = j7;
                                        if (j9 <= j6 && jb4Var.b > j6) {
                                            j8 = Long.MAX_VALUE;
                                            break;
                                        } else if (j6 < j9 && j9 < j4) {
                                            j7 = j9;
                                            j8 = Math.min(j8, jb4Var.a);
                                            i10++;
                                            i2 = i5;
                                            i9 = i4;
                                        }
                                    } else {
                                        i4 = i9;
                                        j4 = j7;
                                        i5 = i2;
                                    }
                                    j7 = j4;
                                    j8 = Math.min(j8, jb4Var.a);
                                    i10++;
                                    i2 = i5;
                                    i9 = i4;
                                }
                                if (j6 != j3) {
                                    j2 = j6;
                                } else {
                                    if (j8 == j3) {
                                        boolean z3 = e21.a;
                                        return;
                                    }
                                    j2 = j8;
                                }
                            } else {
                                i4 = i9;
                                i5 = i2;
                                j2 = lb4Var2.Q;
                            }
                        } else {
                            if (lb4Var2.G != 0 && lb4Var2.F <= j5) {
                                boolean z4 = e21.a;
                                return;
                            }
                            j2 = lb4Var2.C;
                            if (j2 == -1) {
                                int i11 = (TLObject.FLAG_21 / lb4Var2.j0) + 2;
                                long j10 = j5;
                                while (true) {
                                    if (i11 == 0) {
                                        j = j5;
                                        j2 = j10;
                                        break;
                                    }
                                    if (!lb4Var2.u.containsKey(Long.valueOf(j10))) {
                                        j2 = j10;
                                        i8 = i9;
                                        j = j5;
                                        break;
                                    }
                                    long j11 = lb4Var2.j0;
                                    j10 += j11;
                                    long j12 = lb4Var2.b0;
                                    if (j10 > j12) {
                                        j2 = j10;
                                        j = j5;
                                        break;
                                    }
                                    long j13 = j5;
                                    if (lb4Var2.G == 2 && j10 == (r4 << 3)) {
                                        j10 = ((j12 - 1048576) / j11) * j11;
                                    }
                                    i11--;
                                    j5 = j13;
                                }
                                i8 = r10;
                                if (i8 == 0 && lb4Var2.G0.isEmpty()) {
                                    lb4Var2.i(r10, r10, r10);
                                }
                            } else {
                                j = j5;
                            }
                            HashMap hashMap2 = lb4Var2.u;
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                                lb4Var2.u = hashMap2;
                            }
                            hashMap2.put(Long.valueOf(j2), Integer.valueOf(i9));
                            boolean z5 = e21.a;
                            StringBuilder o2 = wi8.o(j2, "start next preload from ", " size ");
                            o2.append(lb4Var2.b0);
                            o2.append(" for ");
                            o2.append(lb4Var2.A);
                            fc4.b(o2.toString());
                            lb4Var2.F -= lb4Var2.j0;
                            i4 = i9;
                            i5 = i2;
                        }
                        int i12 = lb4Var2.J;
                        if (i12 > 0 && j2 >= i12 && lb4Var2.j && lb4Var2.W0 < 3) {
                            boolean z6 = e21.a;
                            return;
                        }
                        long j14 = lb4Var2.b0;
                        if (j14 > j && j2 > j && j2 >= j14) {
                            boolean z7 = e21.a;
                            return;
                        }
                        if (!lb4Var2.y && (arrayList = lb4Var2.O) != null) {
                            lb4Var2.a(j2, lb4Var2.j0 + j2, arrayList, false);
                            boolean z8 = e21.a;
                        }
                        long j15 = lb4Var2.b0;
                        boolean z9 = (j15 <= j || i3 == i5 + (-1) || (j15 > j && ((long) lb4Var2.j0) + j2 >= j15)) ? i4 : 0;
                        int i13 = i == -1 ? ((lb4Var2.l0 & (lb4Var2.g - 1)) << 16) | 2 : i;
                        int i14 = lb4Var2.V0 ? 32 : 0;
                        if (lb4Var2.f) {
                            i14 = j15 < 20480 ? i14 | 393216 : 262144 | i14;
                        }
                        if (lb4Var2.u0) {
                            TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                            tL_upload_getCdnFile.file_token = lb4Var2.x0;
                            tL_upload_getCdnFile.offset = j2;
                            i6 = lb4Var2.j0;
                            tL_upload_getCdnFile.limit = i6;
                            i14 |= 1;
                            tLObject = tL_upload_getCdnFile;
                        } else if (lb4Var2.W != null) {
                            TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                            tL_upload_getWebFile.location = lb4Var2.W;
                            tL_upload_getWebFile.offset = (int) j2;
                            i6 = lb4Var2.j0;
                            tL_upload_getWebFile.limit = i6;
                            tLObject = tL_upload_getWebFile;
                        } else {
                            TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                            tL_upload_getFile.location = lb4Var2.V;
                            tL_upload_getFile.offset = j2;
                            i6 = lb4Var2.j0;
                            tL_upload_getFile.limit = i6;
                            tL_upload_getFile.cdn_supported = i4;
                            tLObject = tL_upload_getFile;
                        }
                        TLObject tLObject2 = tLObject;
                        lb4Var2.Q += i6;
                        kb4 kb4Var = new kb4();
                        lb4Var2.G0.add(kb4Var);
                        kb4Var.e = j2;
                        kb4Var.c = lb4Var2.j0;
                        kb4Var.i = lb4Var2.e;
                        kb4Var.d = i13;
                        if (!lb4Var2.y && lb4Var2.B && lb4Var2.v != null && (hashMap = lb4Var2.t) != null && (ib4Var = (ib4) hashMap.get(Long.valueOf(j2))) != null) {
                            kb4Var.f = new TLRPC.TL_upload_file();
                            try {
                                boolean z10 = e21.a;
                            } catch (Exception unused) {
                            }
                            if (ib4Var.b > 2147483647L) {
                                throw new RuntimeException("cast long to integer");
                            }
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) ib4Var.b);
                            lb4Var2.v.seek(ib4Var.a);
                            lb4Var2.v.getChannel().read(nativeByteBuffer.buffer);
                            nativeByteBuffer.buffer.position(0);
                            kb4Var.f.bytes = nativeByteBuffer;
                            Utilities.d.c(new db4(lb4Var2, kb4Var, (byte) 1));
                            j5 = j;
                            b = 0;
                            i7 = 1;
                            i3++;
                            r10 = b;
                            i2 = i5;
                            i9 = i7;
                            lb4Var2 = lb4Var2;
                        }
                        if (lb4Var2.e0 != j) {
                            boolean z11 = e21.a;
                            wi8.q(lb4Var2.e0, new StringBuilder("frame get offset = "));
                            j5 = j;
                            lb4Var2.e0 = j5;
                            lb4Var2.f0 = kb4Var;
                        } else {
                            j5 = j;
                        }
                        TLRPC.InputFileLocation inputFileLocation2 = lb4Var2.V;
                        if ((inputFileLocation2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) && ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation2).photo_id == j5) {
                            lb4Var2.n(kb4Var);
                            b = 0;
                            i7 = 1;
                            i3++;
                            r10 = b;
                            i2 = i5;
                            i9 = i7;
                            lb4Var2 = lb4Var2;
                        } else {
                            kb4Var.i = lb4Var2.e;
                            if (e21.a) {
                                kb4Var.b = System.currentTimeMillis();
                            }
                            int i15 = i14 | 2048;
                            int i16 = lb4Var2.u0 ? lb4Var2.y0 : lb4Var2.T;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(lb4Var2.R);
                            Object obj2 = lb4Var2;
                            int i17 = i13;
                            lb4Var2 = obj2;
                            int sendRequestSync = connectionsManager.sendRequestSync(tLObject2, new am3(obj2, kb4Var, i16, i17, tLObject2, (byte) 2), null, null, i15, i16, i17, z9);
                            kb4Var.a = sendRequestSync;
                            if (e21.a) {
                                StringBuilder sb = new StringBuilder("debug_loading: ");
                                sb.append(lb4Var2.L0.getName());
                                sb.append(" dc=");
                                sb.append(i16);
                                sb.append(" send reqId ");
                                sb.append(kb4Var.a);
                                sb.append(" offset=");
                                sb.append(kb4Var.e);
                                sb.append(" conType=");
                                sb.append(i17);
                                sb.append(" priority=");
                                b10.p(lb4Var2.W0, sb);
                            }
                            b = 0;
                            gm.c3(new cb4(lb4Var2, sendRequestSync, b));
                            i7 = 1;
                            lb4Var2.l0++;
                            i3++;
                            r10 = b;
                            i2 = i5;
                            i9 = i7;
                            lb4Var2 = lb4Var2;
                        }
                    }
                }
                max = Math.max(0, (lb4Var.k0 - lb4Var.G0.size()) - (lb4Var.f ? lb4Var.I0.size() : 0));
            }
            i2 = max;
            if (!lb4Var.B0) {
            }
            i3 = 0;
            lb4 lb4Var22 = lb4Var;
            while (i3 < i2) {
            }
        }
    }

    public final void r() {
        boolean z = !oc7.r1(this.R).l4.u0.f && this.b0 > 0 && this.h0 == null && !this.n0 && !this.y && this.J == 0;
        this.f = z;
        if (z) {
            boolean p = z8c.h(this.R).p();
            this.g = p ? (byte) 8 : (byte) 2;
            this.k0 = ((p ? 16 : 2) << 20) / this.j0;
        }
    }

    public final void s() {
        int i;
        int i2 = 131072;
        if ((this.J > 0 || oc7.r1(this.R).l4.R2.f) && !this.e) {
            i = TLObject.FLAG_19;
            this.n = TLObject.FLAG_19;
            this.o = (byte) 8;
            this.p = (byte) 8;
        } else {
            this.n = 131072;
            this.o = (byte) 4;
            this.p = (byte) 4;
            i = 131072;
        }
        if (this.j) {
            this.n = 131072;
            this.p = (byte) 8;
        } else {
            i2 = i;
        }
        this.q = (int) (2097152000 / i2);
    }

    public lb4(xw9 xw9Var) {
        this.g = (byte) 2;
        this.h = new bb4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = od1.AUDIO_CONTENT_SAMPLING_RATE;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new bb4(this, (byte) 5);
        s();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.V = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = xw9Var.b;
        tL_inputSecureFileLocation.id = tL_secureFile.id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.T = tL_secureFile.dc_id;
        this.b0 = tL_secureFile.size;
        this.o0 = true;
        this.b1 = 67108864;
        this.P0 = ".jpg";
    }

    public lb4(int i, vuc vucVar) {
        this.g = (byte) 2;
        this.h = new bb4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = od1.AUDIO_CONTENT_SAMPLING_RATE;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new bb4(this, (byte) 5);
        s();
        this.R = i;
        this.X = vucVar;
        this.W = vucVar.b;
        this.b0 = vucVar.d;
        int i2 = oc7.r1(i).r3;
        this.T = i2;
        this.U = i2;
        String H = bc4.H(vucVar.e);
        if (vucVar.e.startsWith("image/")) {
            this.b1 = 16777216;
        } else if (vucVar.e.equals("audio/ogg")) {
            this.b1 = ConnectionsManager.FileTypeAudio;
        } else if (vucVar.e.startsWith("video/")) {
            this.b1 = 33554432;
        } else {
            this.b1 = 67108864;
        }
        this.o0 = true;
        this.P0 = fn5.x(vucVar.a, H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lb4(gn5 gn5Var, Object obj, String str, long j) {
        TLRPC.InputFileLocation tL_inputDocumentFileLocation;
        this.g = (byte) 2;
        this.h = new bb4(this, 0 == true ? 1 : 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = od1.AUDIO_CONTENT_SAMPLING_RATE;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new bb4(this, (byte) 5);
        s();
        this.p0 = obj;
        this.j = obj instanceof TL_stories.TL_storyItem;
        this.X0 = bc4.E(obj);
        this.r0 = gn5Var.p == 2;
        if (gn5Var.c != null) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.V = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gn5Var.f;
            long j2 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.id = j2;
            tL_inputEncryptedFileLocation.volume_id = j2;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = gn5Var.e;
            byte[] bArr = new byte[32];
            this.i0 = bArr;
            System.arraycopy(gn5Var.d, 0, bArr, 0, 32);
            this.h0 = gn5Var.c;
        } else if (gn5Var.n != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gn5Var.f;
            long j3 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.id = j3;
            tL_inputPeerPhotoFileLocation.volume_id = j3;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = gn5Var.s;
            tL_inputPeerPhotoFileLocation.big = gn5Var.m == 0;
            tL_inputPeerPhotoFileLocation.peer = gn5Var.n;
            this.V = tL_inputPeerPhotoFileLocation;
        } else if (gn5Var.o != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = gn5Var.f;
            long j4 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.id = j4;
            tL_inputStickerSetThumb.volume_id = j4;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = gn5Var.q;
            tL_inputStickerSetThumb.stickerset = gn5Var.o;
            this.V = tL_inputStickerSetThumb;
        } else if (gn5Var.u != null) {
            if (gn5Var.s != 0) {
                tL_inputDocumentFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = gn5Var.s;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = gn5Var.f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputDocumentFileLocation.access_hash = gn5Var.e;
                tL_inputDocumentFileLocation.file_reference = gn5Var.b;
                tL_inputDocumentFileLocation.thumb_size = gn5Var.u;
                if (gn5Var.p == 2) {
                    this.o0 = true;
                }
            } else {
                tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = gn5Var.t;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = gn5Var.f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = gn5Var.e;
                tL_inputDocumentFileLocation.file_reference = gn5Var.b;
                tL_inputDocumentFileLocation.thumb_size = gn5Var.u;
            }
            if (tL_inputDocumentFileLocation.file_reference == null) {
                tL_inputDocumentFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.V = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = gn5Var.f;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = gn5Var.e;
            byte[] bArr2 = gn5Var.b;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.o0 = true;
        }
        byte b = gn5Var.p;
        this.a1 = b == 1 || b == 3;
        int i = gn5Var.a;
        this.T = i;
        this.U = i;
        this.b1 = 16777216;
        this.b0 = j;
        this.P0 = str == null ? "jpg" : str;
    }
}
