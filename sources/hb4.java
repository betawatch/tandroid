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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hb4 {
    public static go5 l1;
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
    public final jxc X;
    public final hc4 X0;
    public volatile byte Y;
    public volatile boolean Y0;
    public volatile boolean Z;
    public volatile boolean Z0;
    public boolean a;
    public long a0;
    public boolean a1;
    public ib4 b;
    public long b0;
    public final int b1;
    public boolean c;
    public final long c0;
    public xx c1;
    public long d;
    public long d0;
    public long d1;
    public boolean e;
    public long e0;
    public zb4 e1;
    public boolean f;
    public gb4 f0;
    public final Runnable f1;
    public byte g;
    public vb4 g0;
    public long g1;
    public final Runnable h;
    public final byte[] h0;
    public long h1;
    public vx3 i;
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
    public static volatile to3 k1 = new to3("writeFileQueue");
    public static final Object m1 = new Object();

    public hb4(Object obj, TLRPC.Document document) {
        int lastIndexOf;
        this.g = (byte) 2;
        this.h = new xa4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = oc1.AUDIO_CONTENT_SAMPLING_RATE;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new xa4(this, (byte) 4);
        this.k = r47.J4(document);
        if (document != null && !r47.N2(document)) {
            "application/x-tgwallpattern".equals(document.mime_type);
        }
        s();
        try {
            this.p0 = obj;
            this.j = obj instanceof TL_stories.TL_storyItem;
            this.X0 = xb4.E(obj);
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
            String B = xb4.B(document);
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
                if ("video/mp4".equals(str2) || (xea.z0 && "video/x-matroska".equals(str2))) {
                    this.b1 = 33554432;
                } else {
                    this.b1 = 67108864;
                }
            }
            if (str.length() <= 1) {
                this.P0 = xb4.C(document.mime_type);
            }
        } catch (Exception e) {
            cc4.g(e, true);
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
            fb4 fb4Var = (fb4) arrayList.get(i2);
            if (j == fb4Var.b) {
                fb4Var.b = j2;
            } else if (j2 == fb4Var.a) {
                fb4Var.a = j;
            }
            z = true;
        }
        z = false;
        Collections.sort(arrayList, new f03((byte) 17));
        while (i < arrayList.size() - 1) {
            fb4 fb4Var2 = (fb4) arrayList.get(i);
            int i3 = i + 1;
            fb4 fb4Var3 = (fb4) arrayList.get(i3);
            if (fb4Var2.b == fb4Var3.a) {
                fb4Var2.b = fb4Var3.b;
                arrayList.remove(i3);
                i--;
            }
            i++;
        }
        if (z) {
            return;
        }
        arrayList.add(new fb4(j, j2));
    }

    public final void a(long j, long j2, ArrayList arrayList, boolean z) {
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            fb4 fb4Var = (fb4) arrayList.get(i);
            long j3 = fb4Var.a;
            long j4 = fb4Var.b;
            if (j > j3) {
                if (j2 < j4) {
                    arrayList.add(0, new fb4(j3, j));
                    fb4Var.a = j2;
                } else if (j < j4) {
                    fb4Var.b = j;
                }
                z2 = true;
                break;
            }
            if (j2 >= j4) {
                arrayList.remove(i);
            } else if (j2 > j3) {
                fb4Var.a = j2;
            }
            z2 = true;
            break;
        }
        if (z) {
            if (!z2) {
                if (f11.a) {
                    cc4.d(this.L0 + " downloaded duplicate file part " + j + " - " + j2);
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
            to3 to3Var = k1;
            vx3 vx3Var = new vx3(this, arrayList2, (byte) 15);
            this.i = vx3Var;
            to3Var.c(vx3Var);
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
                    cc4.g(e, true);
                }
                this.Q0.close();
                this.Q0 = null;
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.v;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                this.v.close();
                this.v = null;
            }
        } catch (Exception e4) {
            cc4.g(e4, true);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.C0;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e5) {
                    cc4.g(e5, true);
                }
                this.C0.close();
                this.C0 = null;
            }
        } catch (Exception e6) {
            cc4.g(e6, true);
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
                            cc4.g(e7, true);
                        }
                        this.S0.close();
                        this.S0 = null;
                    }
                }
            }
        } catch (Exception e8) {
            cc4.g(e8, true);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.R0;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.R0 = null;
            }
        } catch (Exception e9) {
            cc4.g(e9, true);
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
            gb4 gb4Var = (gb4) arrayList.get(i);
            TLRPC.TL_upload_file tL_upload_file = gb4Var.f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = gb4Var.g;
                if (tL_upload_webFile != null) {
                    tL_upload_webFile.disableFree = false;
                    tL_upload_webFile.freeResources();
                } else {
                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile = gb4Var.h;
                    if (tL_upload_cdnFile != null) {
                        tL_upload_cdnFile.disableFree = false;
                        tL_upload_cdnFile.freeResources();
                    }
                }
            }
            i++;
        }
    }

    public final void c(gb4 gb4Var, boolean z, boolean z2) {
        ArrayList arrayList;
        int[] iArr = new int[8];
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.G0.size(); i++) {
            gb4 gb4Var2 = (gb4) this.G0.get(i);
            j = Math.min(gb4Var2.e, j);
            if (this.y) {
                this.u.remove(Long.valueOf(gb4Var2.e));
            } else {
                ArrayList arrayList2 = this.O;
                long j2 = gb4Var2.e;
                l(j2, gb4Var2.c + j2, arrayList2);
            }
            if (gb4Var != gb4Var2 && gb4Var2.a != 0) {
                byte b = 1;
                gb4Var2.j = true;
                if (z2) {
                    this.H0.add(gb4Var2);
                    gb4Var2.l = new ab4(this, gb4Var2, b);
                    ConnectionsManager.getInstance(this.R).cancelRequest(gb4Var2.a, true, new bb4(gb4Var2, (byte) 0));
                } else {
                    ConnectionsManager.getInstance(this.R).cancelRequest(gb4Var2.a, true);
                    gb4Var2.k = true;
                }
                if (!pq3.d()) {
                    int i2 = gb4Var2.d >>> 16;
                    iArr[i2] = iArr[i2] + gb4Var2.c;
                }
            }
        }
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = (i3 << 16) | 2;
            if (iArr[i3] > ((!this.j || pq3.d()) ? TLObject.FLAG_20 : 262144)) {
                ConnectionsManager.getInstance(this.R).discardConnection(this.u0 ? this.y0 : this.T, i4);
            }
        }
        this.G0.clear();
        hl.c3(new xa4(this, (byte) 3));
        int i5 = 0;
        while (true) {
            int size = this.I0.size();
            arrayList = this.I0;
            if (i5 >= size) {
                break;
            }
            gb4 gb4Var3 = (gb4) arrayList.get(i5);
            if (this.y) {
                this.u.remove(Long.valueOf(gb4Var3.e));
            } else {
                ArrayList arrayList3 = this.O;
                long j3 = gb4Var3.e;
                l(j3, gb4Var3.c + j3, arrayList3);
            }
            TLRPC.TL_upload_file tL_upload_file = gb4Var3.f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = gb4Var3.g;
                if (tL_upload_webFile != null) {
                    tL_upload_webFile.disableFree = false;
                    tL_upload_webFile.freeResources();
                } else {
                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile = gb4Var3.h;
                    if (tL_upload_cdnFile != null) {
                        tL_upload_cdnFile.disableFree = false;
                        tL_upload_cdnFile.freeResources();
                    }
                }
            }
            j = Math.min(gb4Var3.e, j);
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
                    xi4.l("!!!");
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
                    xi4.l("!!!");
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
        Utilities.d.c(new cv2(this, fileArr, countDownLatch, (byte) 26));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        return fileArr[0];
    }

    public final long f(long j, long j2, ArrayList arrayList) {
        long j3;
        if (arrayList != null && this.Y != 3 && !arrayList.isEmpty()) {
            int size = arrayList.size();
            fb4 fb4Var = null;
            int i = 0;
            while (true) {
                if (i >= size) {
                    j3 = j2;
                    break;
                }
                fb4 fb4Var2 = (fb4) arrayList.get(i);
                long j4 = fb4Var2.a;
                if (j <= j4 && (fb4Var == null || j4 < fb4Var.a)) {
                    fb4Var = fb4Var2;
                }
                if (j4 <= j && fb4Var2.b > j) {
                    j3 = 0;
                    break;
                }
                i++;
            }
            if (j3 != 0) {
                return fb4Var != null ? Math.min(j2, fb4Var.a - j) : Math.min(j2, Math.max(this.b0 - j, 0L));
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
                ((ib4) this.m.get(i)).a();
            }
        }
    }

    public final void h(int i, boolean z) {
        b();
        this.Y = i == 1 ? (byte) 4 : (byte) 2;
        byte b = 0;
        if (this.g0 != null && f11.a) {
            long currentTimeMillis = this.d1 != 0 ? System.currentTimeMillis() - this.d1 : 0L;
            File file = this.L0;
            if (i == 1) {
                cc4.b("cancel downloading file to " + file + " time = " + currentTimeMillis + " dc = " + this.T + " size = " + hl.i0(this.b0, false, false));
            } else {
                cc4.b("failed downloading file to " + file + " reason = " + i + " time = " + currentTimeMillis + " dc = " + this.T + " size = " + hl.i0(this.b0, false, false));
            }
        }
        if (z) {
            Utilities.d.c(new za4(this, i, b));
            return;
        }
        vb4 vb4Var = this.g0;
        if (vb4Var != null) {
            vb4Var.b(this, i);
        }
        g();
    }

    public final void i(int i, boolean z, boolean z2) {
        if (this.Y == 1 || this.Y == 5) {
            this.Y = (byte) 3;
            g();
            b();
            byte b = 20;
            if (!this.y && !z2) {
                k1.c(new y6a((Object) this, (Object) this.M0, (Object) this.N0, (Object) this.A, (Serializable) this.J0, z, (byte) 9));
                this.M0 = null;
                this.N0 = null;
                this.A = null;
                this.g0.getClass();
                xb4.K.c(new vx3(this, this.e1, b));
                return;
            }
            this.z = true;
            boolean z3 = f11.a;
            File file = this.J0;
            if (i == 1) {
                cc4.b("file already exist " + file);
            } else {
                StringBuilder sb = new StringBuilder("finished preloading file to ");
                sb.append(file);
                sb.append(" loaded ");
                sb.append(this.a0);
                sb.append(" of ");
                sb.append(this.b0);
                sb.append(" prefSize=");
                c00.q(this.J, sb);
            }
            if (this.X0 != null) {
                byte b2 = 22;
                if (this.J0 != null) {
                    ic4 ic4Var = xb4.G(this.R).d;
                    List singletonList = Collections.singletonList(new c71(this.J0));
                    ic4Var.getClass();
                    ic4Var.h(new vx3(ic4Var, singletonList, b2));
                }
                if (this.N0 != null) {
                    ic4 ic4Var2 = xb4.G(this.R).d;
                    List singletonList2 = Collections.singletonList(new c71(this.N0));
                    ic4Var2.getClass();
                    ic4Var2.h(new vx3(ic4Var2, singletonList2, b2));
                }
            }
            this.g0.getClass();
            xb4.K.c(new vx3(this, this.e1, b));
            this.g0.c(this, this.L0);
        }
    }

    public final void j() {
        if (this.Y != 1) {
            return;
        }
        this.Z = true;
        this.g1 = 0L;
        Utilities.d.c(new xa4(this, (byte) 1));
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
    public final boolean k(gb4 gb4Var, TLRPC.TL_error tL_error) {
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
        byte b = 3;
        if (this.Y != 1 && this.Y != 5) {
            boolean z7 = f11.a;
            if (this.Y != 3) {
                return false;
            }
            StringBuilder sb = new StringBuilder("trying to write to finished file ");
            sb.append(this.r);
            sb.append(" offset ");
            sb.append(gb4Var.e);
            sb.append(" ");
            sb.append(this.b0);
            sb.append(" reqToken=");
            sb.append(gb4Var.a);
            sb.append(" (state=");
            cc4.f(new bc4(uh9.l(sb, this.Y, ")")));
            return false;
        }
        int i2 = gb4Var.a;
        this.G0.remove(gb4Var);
        hl.c3(new za4(this, i2, b));
        String str2 = " secret = ";
        if (tL_error == null) {
            try {
                if (this.M == null) {
                    j = 0;
                    i = 0;
                    if (this.a0 != gb4Var.e) {
                        this.I0.add(gb4Var);
                        TLRPC.TL_upload_file tL_upload_file = gb4Var.f;
                        if (tL_upload_file != null) {
                            tL_upload_file.disableFree = true;
                            return false;
                        }
                        TLRPC.TL_upload_webFile tL_upload_webFile = gb4Var.g;
                        if (tL_upload_webFile != null) {
                            tL_upload_webFile.disableFree = true;
                            return false;
                        }
                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile = gb4Var.h;
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
                TLRPC.TL_upload_file tL_upload_file2 = gb4Var.f;
                if (tL_upload_file2 != null) {
                    nativeByteBuffer = tL_upload_file2.bytes;
                } else {
                    TLRPC.TL_upload_webFile tL_upload_webFile2 = gb4Var.g;
                    if (tL_upload_webFile2 != null) {
                        nativeByteBuffer = tL_upload_webFile2.bytes;
                    } else {
                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile2 = gb4Var.h;
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
                        long j3 = (gb4Var.e / 131072) << 17;
                        HashMap hashMap = this.q0;
                        if (hashMap != null) {
                            c = 17;
                            tL_fileHash = (TLRPC.TL_fileHash) hashMap.get(Long.valueOf(j3));
                        } else {
                            c = 17;
                            tL_fileHash = null;
                        }
                        if (tL_fileHash == null) {
                            this.I0.add(gb4Var);
                            TLRPC.TL_upload_file tL_upload_file3 = gb4Var.f;
                            if (tL_upload_file3 != null) {
                                tL_upload_file3.disableFree = true;
                            } else {
                                TLRPC.TL_upload_webFile tL_upload_webFile3 = gb4Var.g;
                                if (tL_upload_webFile3 != null) {
                                    tL_upload_webFile3.disableFree = true;
                                } else {
                                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile3 = gb4Var.h;
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
                    if (gb4Var.h != null) {
                        c2 = '\r';
                        long j4 = gb4Var.e / 16;
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
                        this.v.writeLong(gb4Var.e);
                        long j5 = limit;
                        this.v.writeLong(j5);
                        this.w += 16;
                        this.v.getChannel().write(nativeByteBuffer.buffer);
                        boolean z8 = f11.a;
                        cc4.b("save preload file part " + this.A + " offset " + gb4Var.e + " size " + limit);
                        HashMap hashMap2 = this.t;
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                            this.t = hashMap2;
                        }
                        hashMap2.put(Long.valueOf(gb4Var.e), new eb4(this.w, j5));
                        this.x += limit;
                        this.w += limit;
                        if (this.G == 0) {
                            long d = d(this.D, gb4Var.e, nativeByteBuffer);
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
                                    boolean z9 = f11.a;
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
                                        long j13 = gb4Var.e / 16;
                                        byte[] bArr3 = this.t0;
                                        bArr3[15] = (byte) (j13 & 255);
                                        bArr3[14] = (byte) ((j13 >> c4) & 255);
                                        bArr3[c2] = (byte) ((j13 >> 16) & 255);
                                        bArr3[c3] = (byte) ((j13 >> 24) & 255);
                                        Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.s0, bArr3, 0, nativeByteBuffer.limit());
                                    }
                                    if (this.M != null) {
                                        this.Q0.seek(gb4Var.e);
                                        cc4.b("save file part " + this.r + " offset=" + gb4Var.e + " chunk_size=" + this.j0 + " isCdn=" + this.u0);
                                    }
                                    this.Q0.getChannel().write(nativeByteBuffer.buffer);
                                    ArrayList arrayList = this.M;
                                    long j14 = gb4Var.e;
                                    a(j14, j14 + j10, arrayList, true);
                                    if (this.u0) {
                                        long j15 = gb4Var.e / 131072;
                                        int size = this.P.size();
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= size) {
                                                break;
                                            }
                                            fb4 fb4Var = (fb4) this.P.get(i5);
                                            if (fb4Var.a > j15 || j15 > fb4Var.b) {
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
                                                    boolean z10 = f11.a;
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
                                                        if (f11.a) {
                                                            if (this.V != null) {
                                                                cc4.d("invalid cdn hash " + this.V + " id = " + this.V.id + " local_id = " + this.V.local_id + " access_hash = " + this.V.access_hash + str + this.V.volume_id + str2 + this.V.secret);
                                                            } else if (this.W != null) {
                                                                cc4.d("invalid cdn hash  " + this.W + " id = " + this.r);
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
                        boolean z92 = f11.a;
                        bArr = this.h0;
                        if (bArr != null) {
                        }
                        if (this.n0) {
                        }
                        if (this.M != null) {
                        }
                        this.Q0.getChannel().write(nativeByteBuffer.buffer);
                        ArrayList arrayList2 = this.M;
                        long j142 = gb4Var.e;
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
                        gb4 gb4Var2 = (gb4) this.I0.get(i7);
                        if (this.M != null || this.a0 == gb4Var2.e) {
                            this.I0.remove(i7);
                            if (!k(gb4Var2, null)) {
                                TLRPC.TL_upload_file tL_upload_file4 = gb4Var2.f;
                                if (tL_upload_file4 != null) {
                                    tL_upload_file4.disableFree = false;
                                    tL_upload_file4.freeResources();
                                } else {
                                    TLRPC.TL_upload_webFile tL_upload_webFile4 = gb4Var2.g;
                                    if (tL_upload_webFile4 != null) {
                                        tL_upload_webFile4.disableFree = false;
                                        tL_upload_webFile4.freeResources();
                                    } else {
                                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile4 = gb4Var2.h;
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
                                q(gb4Var.d);
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
                cc4.g(e, ((e instanceof FileNotFoundException) || (e instanceof EOFException) || hl.D1(e)) ? false : true);
                if (hl.D1(e)) {
                    h(-1, false);
                } else if (hl.E1(e)) {
                    xea.h(this.L0);
                    h(-1, true);
                } else {
                    h(0, false);
                }
            }
        } else {
            if (tL_error.text.contains("LIMIT_INVALID") && !gb4Var.i) {
                Runnable runnable = gb4Var.l;
                if (runnable != null) {
                    runnable.run();
                }
                ArrayList arrayList3 = this.O;
                long j19 = gb4Var.e;
                l(j19, gb4Var.c + j19, arrayList3);
                if (!this.e) {
                    this.e = true;
                    this.j0 = 32768;
                    this.k0 = 4;
                }
                q(gb4Var.d);
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
                        cc4.f(e2);
                        h(0, false);
                        return false;
                    }
                }
                if (tL_error.text.contains("RETRY_LIMIT")) {
                    h(2, false);
                    return false;
                }
                if (f11.a) {
                    TLRPC.InputFileLocation inputFileLocation = this.V;
                    if (inputFileLocation != null) {
                        boolean z11 = inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation;
                        String str4 = tL_error.text;
                        if (z11) {
                            cc4.d(str4 + " " + this.V + " peer_did = " + wf3.m(((TLRPC.TL_inputPeerPhotoFileLocation) this.V).peer) + " peer_access_hash=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).peer.access_hash + " photo_id=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).photo_id + " big=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).big);
                        } else {
                            cc4.d(str4 + " " + this.V + " id = " + this.V.id + " local_id = " + this.V.local_id + " access_hash = " + this.V.access_hash + " volume_id = " + this.V.volume_id + str2 + this.V.secret);
                        }
                    } else if (this.W != null) {
                        cc4.d(tL_error.text + " " + this.W + " id = " + this.r);
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
                q(gb4Var.d);
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
        ConnectionsManager.getInstance(this.R).sendRequest(tL_upload_getCdnFileHashes, new ye(this, (byte) 26), null, null, 0, this.T, 1, true);
    }

    public final void n(gb4 gb4Var) {
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
        if (obj instanceof r47) {
            r47 r47Var = (r47) obj;
            if (r47Var.e1() < 0 && (message = r47Var.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.p0 = webPage;
                this.j = false;
            }
        }
        if (f11.a) {
            cc4.b("debug_loading: " + this.L0.getName() + " file reference expired ");
        }
        xc4.n(this.R).u(new Object[]{this.V, this, gb4Var}, this.p0);
    }

    public final void o(boolean z) {
        if (this.y != z) {
            if (!z || this.b0 > 2097152) {
                cc4.d("setIsPreloadVideoOperation " + z + " file=" + this.r);
                if (z || !this.y) {
                    this.y = z;
                    return;
                }
                if (this.Y != 3) {
                    if (this.Y == 1) {
                        Utilities.d.c(new cb4(this, z, (byte) 2));
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
    
        if (r9 != r35.L0.length()) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x062f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08b0 A[Catch: Exception -> 0x08b6, TRY_LEAVE, TryCatch #9 {Exception -> 0x08b6, blocks: (B:267:0x089f, B:269:0x08b0), top: B:266:0x089f }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0431  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        long j;
        String p;
        String str;
        String str2;
        String str3;
        String p2;
        String p3;
        String k;
        String p4;
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
        String str7;
        boolean[] zArr2;
        long j2;
        String str8;
        ArrayList arrayList;
        vb4 vb4Var;
        int i3;
        boolean z3;
        long j3;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        String str9;
        final ib4 ib4Var = this.b;
        final long j4 = this.d;
        final boolean z4 = this.c;
        this.d1 = System.currentTimeMillis();
        s();
        if (this.j0 == 0) {
            if (this.e) {
                if (f11.a) {
                    cc4.b("debug_loading: restart with small chunk");
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
        if (ib4Var != null) {
            Utilities.d.c(new Runnable() { // from class: db4
                @Override // java.lang.Runnable
                public final void run() {
                    hb4 hb4Var = hb4.this;
                    boolean z7 = z4;
                    long j5 = j4;
                    ib4 ib4Var2 = ib4Var;
                    boolean z8 = z6;
                    if (hb4Var.m == null) {
                        hb4Var.m = new ArrayList();
                    }
                    long j6 = hb4Var.j0;
                    if (z7) {
                        long j7 = (j5 / j6) * j6;
                        gb4 gb4Var = hb4Var.f0;
                        if (gb4Var != null && gb4Var.e != j7) {
                            int i4 = gb4Var.a;
                            hb4Var.G0.remove(gb4Var);
                            hl.c3(new za4(hb4Var, i4, (byte) 2));
                            long j8 = hb4Var.Q;
                            long j9 = hb4Var.j0;
                            hb4Var.Q = j8 - j9;
                            ArrayList arrayList2 = hb4Var.O;
                            long j10 = hb4Var.f0.e;
                            hb4.l(j10, j9 + j10, arrayList2);
                            if (hb4Var.f0.a != 0) {
                                ConnectionsManager.getInstance(hb4Var.R).cancelRequest(hb4Var.f0.a, true);
                                hb4Var.l0--;
                            }
                            boolean z9 = f11.a;
                            ik8.q(hb4Var.f0.e, new StringBuilder("frame get cancel request at offset "));
                            gb4Var = null;
                            hb4Var.f0 = null;
                        }
                        if (gb4Var == null) {
                            hb4Var.e0 = j7;
                        }
                    } else {
                        hb4Var.d0 = (j5 / j6) * j6;
                    }
                    if (!hb4Var.m.contains(ib4Var2)) {
                        hb4Var.m.add(ib4Var2);
                        cc4.d("FileLoadOperation " + hb4Var.r + " start, adding stream " + ib4Var2);
                    }
                    if (!hb4Var.m.isEmpty()) {
                        Utilities.d.a(hb4Var.f1);
                    }
                    if (z8) {
                        if (hb4Var.t != null) {
                            if (hb4Var.f(hb4Var.d0, 1L, hb4Var.M) == 0 && hb4Var.t.get(Long.valueOf(hb4Var.d0)) != null) {
                                hb4Var.K = true;
                            }
                        }
                        hb4Var.q(-1);
                        hb4Var.K = false;
                    }
                    if (hb4Var.M != null) {
                        hb4Var.g();
                    }
                }
            });
        } else if (z6) {
            Utilities.d.c(new xa4(this, (byte) 6));
        }
        if (z6) {
            return;
        }
        if (this.V == null && this.W == null) {
            boolean z7 = f11.a;
            cc4.b("loadOperation: no location, failing");
            h(0, true);
            return;
        }
        long j5 = this.j0;
        this.d0 = (j4 / j5) * j5;
        if (this.o0) {
            long j6 = this.b0;
            if (j6 > 0 && j6 > j5) {
                this.M = new ArrayList();
                this.O = new ArrayList();
            }
        }
        if (this.W != null) {
            String a = Utilities.a(this.X.a);
            if (this.n0) {
                p3 = qd4.o(a, ".temp.enc");
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(".");
                str9 = c00.k(sb, this.P0, ".enc");
                if (this.h0 != null) {
                    p4 = qd4.o(a, "_64.iv.enc");
                    str5 = str9;
                    j = 0;
                }
                p4 = null;
                str5 = str9;
                j = 0;
            } else {
                String o = qd4.o(a, ".temp");
                String str10 = a + "." + this.P0;
                if (this.h0 != null) {
                    p4 = qd4.o(a, "_64.iv");
                    p3 = o;
                    str9 = str10;
                    str5 = str9;
                    j = 0;
                } else {
                    p3 = o;
                    str9 = str10;
                    p4 = null;
                    str5 = str9;
                    j = 0;
                }
            }
            this.G0 = new ArrayList(this.k0);
            this.H0 = new ArrayList();
            this.I0 = new ArrayList(this.k0 - 1);
            this.Y = (byte) 1;
            obj = this.p0;
            if (!(obj instanceof TLRPC.TL_theme)) {
                file = new File(a.h(), qu6.p(new StringBuilder("remote"), ((TLRPC.TL_theme) obj).id, ".attheme"));
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
                    long j7 = this.b0;
                    if (j7 != j) {
                        if (!this.a1) {
                        }
                    }
                }
                vb4 vb4Var2 = this.g0;
                final String file2 = this.L0.toString();
                final ic4 ic4Var = vb4Var2.e.d;
                ic4Var.getClass();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final boolean[] zArr3 = {false};
                final byte b = 0;
                ic4Var.h(new Runnable() { // from class: fc4
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
                    
                        if (r1 == null) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:43:0x006c, code lost:
                    
                        if (r1 == null) goto L29;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        byte b2 = b;
                        SQLiteCursor sQLiteCursor = null;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        boolean[] zArr4 = zArr3;
                        String str11 = file2;
                        ic4 ic4Var2 = ic4Var;
                        switch (b2) {
                            case 0:
                                ic4Var2.c();
                                try {
                                    try {
                                        sQLiteCursor = ic4Var2.c.queryFinalized("SELECT flags FROM paths WHERE path = ?", str11);
                                        if (sQLiteCursor.next()) {
                                            zArr4[0] = (sQLiteCursor.intValue(0) & 1) != 0;
                                        }
                                    } finally {
                                    }
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    break;
                                }
                                sQLiteCursor.dispose();
                                countDownLatch2.countDown();
                                return;
                            default:
                                ic4Var2.c();
                                try {
                                    try {
                                        sQLiteCursor = ic4Var2.c.queryFinalized("SELECT document_id FROM paths WHERE path = ?", str11);
                                        if (sQLiteCursor.next()) {
                                            zArr4[0] = true;
                                        }
                                    } catch (Exception e2) {
                                        cc4.g(e2, true);
                                        break;
                                    }
                                    sQLiteCursor.dispose();
                                    countDownLatch2.countDown();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    cc4.g(e, true);
                }
                if (!zArr3[0]) {
                    if (f11.a) {
                        cc4.b("debug_loading: delete existing file cause file size mismatch " + this.L0.getName() + " totalSize=" + this.b0 + " existingFileSize=" + this.L0.length());
                    }
                    vb4 vb4Var3 = this.g0;
                    final String file3 = this.L0.toString();
                    final ic4 ic4Var2 = vb4Var3.e.d;
                    ic4Var2.getClass();
                    final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    final boolean[] zArr4 = {false};
                    final byte b2 = 1;
                    ic4Var2.h(new Runnable() { // from class: fc4
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
                        
                            if (r1 == null) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:43:0x006c, code lost:
                        
                            if (r1 == null) goto L29;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            byte b22 = b2;
                            SQLiteCursor sQLiteCursor = null;
                            CountDownLatch countDownLatch22 = countDownLatch2;
                            boolean[] zArr42 = zArr4;
                            String str11 = file3;
                            ic4 ic4Var22 = ic4Var2;
                            switch (b22) {
                                case 0:
                                    ic4Var22.c();
                                    try {
                                        try {
                                            sQLiteCursor = ic4Var22.c.queryFinalized("SELECT flags FROM paths WHERE path = ?", str11);
                                            if (sQLiteCursor.next()) {
                                                zArr42[0] = (sQLiteCursor.intValue(0) & 1) != 0;
                                            }
                                        } finally {
                                        }
                                    } catch (Exception e2) {
                                        cc4.g(e2, true);
                                        break;
                                    }
                                    sQLiteCursor.dispose();
                                    countDownLatch22.countDown();
                                    return;
                                default:
                                    ic4Var22.c();
                                    try {
                                        try {
                                            sQLiteCursor = ic4Var22.c.queryFinalized("SELECT document_id FROM paths WHERE path = ?", str11);
                                            if (sQLiteCursor.next()) {
                                                zArr42[0] = true;
                                            }
                                        } catch (Exception e22) {
                                            cc4.g(e22, true);
                                            break;
                                        }
                                        sQLiteCursor.dispose();
                                        countDownLatch22.countDown();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                    try {
                        countDownLatch2.await();
                    } catch (InterruptedException e2) {
                        cc4.g(e2, true);
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
                    xx xxVar = this.c1;
                    if (xxVar != null) {
                        vb4 vb4Var4 = this.g0;
                        File file4 = this.L0;
                        ic4 ic4Var3 = vb4Var4.e.d;
                        long j8 = xxVar.b;
                        int i4 = xxVar.c;
                        byte b3 = xxVar.d;
                        String file5 = file4 != null ? file4.toString() : null;
                        ic4Var3.getClass();
                        ic4Var3.h(new gc4(ic4Var3, j8, i4, b3, file5, 0));
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, false);
                    if (hl.D1(e3)) {
                        LaunchActivity.F(1);
                        i = -1;
                        h(-1, true);
                    } else {
                        i = -1;
                    }
                    if (!hl.E1(e3)) {
                        h(0, true);
                        return;
                    } else {
                        xea.h(this.L0);
                        h(i, true);
                        return;
                    }
                }
            }
            this.J0 = new File(this.U0, str6);
            if (this.a1) {
                this.K0 = new File(this.U0, str6.concat(".gz"));
            }
            String str11 = "rws";
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
                        cc4.g(e5, true);
                    }
                    randomAccessFile2.close();
                    i2 = 1;
                } catch (Exception e6) {
                    e = e6;
                    i2 = 1;
                    if (hl.D1(e)) {
                        LaunchActivity.F(1);
                        cc4.g(e, false);
                    } else if (hl.E1(e)) {
                        xea.h(this.L0);
                        cc4.g(e, false);
                    } else {
                        cc4.g(e, true);
                    }
                    zArr = new boolean[i2];
                    zArr[0] = false;
                    if (this.B) {
                    }
                    z2 = z;
                    str7 = "rws";
                    zArr2 = zArr;
                    j2 = 2;
                    if (str4 == null) {
                    }
                    if (this.X0 != null) {
                    }
                    if (this.J0.exists()) {
                    }
                    arrayList = this.M;
                    if (arrayList != null) {
                    }
                    if (f11.a) {
                    }
                    if (str2 != null) {
                    }
                    if (!this.y) {
                    }
                    vb4Var = this.g0;
                    if (vb4Var != null) {
                    }
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.J0, str8);
                    this.Q0 = randomAccessFile3;
                    j3 = this.a0;
                    if (j3 != 0) {
                    }
                    i3 = 0;
                    z3 = true;
                    if (this.Q0 == null) {
                    }
                }
            } else {
                i2 = 1;
                z = false;
            }
            zArr = new boolean[i2];
            zArr[0] = false;
            if (this.B || p2 == null) {
                z2 = z;
                str7 = "rws";
                zArr2 = zArr;
                j2 = 2;
            } else {
                this.A = new File(this.U0, p2);
                try {
                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(this.A, "rws");
                    this.v = randomAccessFile4;
                    long length2 = randomAccessFile4.length();
                    this.w = 1;
                    if (length2 > 1) {
                        zArr[0] = this.v.readByte() != 0;
                        long j9 = 1;
                        while (j9 < length2) {
                            if (length2 - j9 < 8) {
                                break;
                            }
                            long readLong = this.v.readLong();
                            if (length2 - (j9 + 8) < 8 || readLong < j) {
                                break;
                            }
                            j2 = 2;
                            try {
                                if (readLong <= this.b0) {
                                    long readLong2 = this.v.readLong();
                                    long j10 = j9 + 16;
                                    if (length2 - j10 >= readLong2) {
                                        zArr2 = zArr;
                                        if (readLong2 <= this.j0) {
                                            try {
                                                eb4 eb4Var = new eb4(j10, readLong2);
                                                long j11 = j10 + readLong2;
                                                this.v.seek(j11);
                                                if (length2 - j11 >= 24) {
                                                    long readLong3 = this.v.readLong();
                                                    this.E = readLong3;
                                                    if (readLong3 != j) {
                                                        str7 = str11;
                                                        try {
                                                            z2 = z;
                                                            try {
                                                                this.G = this.C > this.b0 / 2 ? (byte) 2 : (byte) 1;
                                                                this.F = readLong3;
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                cc4.g(e, false);
                                                                if (!this.y) {
                                                                    this.A = null;
                                                                    try {
                                                                        randomAccessFile = this.v;
                                                                        if (randomAccessFile != null) {
                                                                        }
                                                                    } catch (Exception e8) {
                                                                        cc4.g(e8, true);
                                                                    }
                                                                }
                                                                if (str4 == null) {
                                                                }
                                                                if (this.X0 != null) {
                                                                }
                                                                if (this.J0.exists()) {
                                                                }
                                                                arrayList = this.M;
                                                                if (arrayList != null) {
                                                                }
                                                                if (f11.a) {
                                                                }
                                                                if (str2 != null) {
                                                                }
                                                                if (!this.y) {
                                                                    this.N = new ArrayList(this.M);
                                                                }
                                                                vb4Var = this.g0;
                                                                if (vb4Var != null) {
                                                                }
                                                                RandomAccessFile randomAccessFile32 = new RandomAccessFile(this.J0, str8);
                                                                this.Q0 = randomAccessFile32;
                                                                j3 = this.a0;
                                                                if (j3 != 0) {
                                                                }
                                                                i3 = 0;
                                                                z3 = true;
                                                                if (this.Q0 == null) {
                                                                }
                                                            }
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                            z2 = z;
                                                            cc4.g(e, false);
                                                            if (!this.y) {
                                                            }
                                                            if (str4 == null) {
                                                            }
                                                            if (this.X0 != null) {
                                                            }
                                                            if (this.J0.exists()) {
                                                            }
                                                            arrayList = this.M;
                                                            if (arrayList != null) {
                                                            }
                                                            if (f11.a) {
                                                            }
                                                            if (str2 != null) {
                                                            }
                                                            if (!this.y) {
                                                            }
                                                            vb4Var = this.g0;
                                                            if (vb4Var != null) {
                                                            }
                                                            RandomAccessFile randomAccessFile322 = new RandomAccessFile(this.J0, str8);
                                                            this.Q0 = randomAccessFile322;
                                                            j3 = this.a0;
                                                            if (j3 != 0) {
                                                            }
                                                            i3 = 0;
                                                            z3 = true;
                                                            if (this.Q0 == null) {
                                                            }
                                                        }
                                                    } else {
                                                        z2 = z;
                                                        str7 = str11;
                                                    }
                                                    this.C = this.v.readLong();
                                                    this.D = this.v.readLong();
                                                    long j12 = j11 + 24;
                                                    if (this.t == null) {
                                                        this.t = new HashMap();
                                                    }
                                                    if (this.u == null) {
                                                        this.u = new HashMap();
                                                    }
                                                    this.t.put(Long.valueOf(readLong), eb4Var);
                                                    this.u.put(Long.valueOf(readLong), 1);
                                                    this.x = (int) (this.x + readLong2);
                                                    this.w = (int) (readLong2 + 36 + this.w);
                                                    zArr = zArr2;
                                                    str11 = str7;
                                                    j9 = j12;
                                                    z = z2;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                z2 = z;
                                                str7 = str11;
                                            }
                                        }
                                        z2 = z;
                                        str7 = str11;
                                        break;
                                    }
                                }
                                z2 = z;
                                str7 = str11;
                                zArr2 = zArr;
                                break;
                            } catch (Exception e11) {
                                e = e11;
                                z2 = z;
                                str7 = str11;
                                zArr2 = zArr;
                            }
                        }
                    }
                    z2 = z;
                    str7 = str11;
                    zArr2 = zArr;
                    j2 = 2;
                    this.v.seek(this.w);
                } catch (Exception e12) {
                    e = e12;
                    z2 = z;
                    str7 = str11;
                    zArr2 = zArr;
                    j2 = 2;
                }
                if (!this.y && this.t == null) {
                    this.A = null;
                    randomAccessFile = this.v;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.getChannel().close();
                        } catch (Exception e13) {
                            cc4.g(e13, true);
                        }
                        this.v.close();
                        this.v = null;
                    }
                }
            }
            if (str4 == null) {
                this.N0 = new File(this.U0, str4);
                if (!this.J0.exists()) {
                    this.N0.delete();
                }
                try {
                    str8 = str7;
                } catch (Exception e14) {
                    e = e14;
                    str8 = str7;
                }
                try {
                    RandomAccessFile randomAccessFile5 = new RandomAccessFile(this.N0, str8);
                    this.S0 = randomAccessFile5;
                    long length3 = randomAccessFile5.length();
                    if (length3 % 8 == 4) {
                        int readInt = this.S0.readInt();
                        if (readInt <= (length3 - 4) / j2) {
                            for (int i5 = 0; i5 < readInt; i5++) {
                                long readLong4 = this.S0.readLong();
                                long readLong5 = this.S0.readLong();
                                this.M.add(new fb4(readLong4, readLong5));
                                this.O.add(new fb4(readLong4, readLong5));
                            }
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                    Typeface typeface = hl.a;
                    cc4.g(e, !((e instanceof FileNotFoundException) || (e instanceof EOFException)));
                    if (this.X0 != null) {
                    }
                    if (this.J0.exists()) {
                    }
                    arrayList = this.M;
                    if (arrayList != null) {
                    }
                    if (f11.a) {
                    }
                    if (str2 != null) {
                    }
                    if (!this.y) {
                    }
                    vb4Var = this.g0;
                    if (vb4Var != null) {
                    }
                    RandomAccessFile randomAccessFile3222 = new RandomAccessFile(this.J0, str8);
                    this.Q0 = randomAccessFile3222;
                    j3 = this.a0;
                    if (j3 != 0) {
                    }
                    i3 = 0;
                    z3 = true;
                    if (this.Q0 == null) {
                    }
                }
            } else {
                str8 = str7;
            }
            if (this.X0 != null) {
                ic4 ic4Var4 = xb4.G(this.R).d;
                File file7 = this.N0;
                hc4 hc4Var = this.X0;
                ic4Var4.getClass();
                byte b4 = 29;
                if (file7 != null && hc4Var != null) {
                    ic4Var4.h(new cv2(ic4Var4, file7, hc4Var, b4));
                }
                ic4 ic4Var5 = xb4.G(this.R).d;
                File file8 = this.J0;
                hc4 hc4Var2 = this.X0;
                ic4Var5.getClass();
                if (file8 != null && hc4Var2 != null) {
                    ic4Var5.h(new cv2(ic4Var5, file8, hc4Var2, b4));
                }
            }
            if (this.J0.exists()) {
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
                    ArrayList arrayList2 = this.M;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        this.M.add(new fb4(this.a0, this.b0));
                        this.O.add(new fb4(this.a0, this.b0));
                    }
                }
            } else {
                ArrayList arrayList3 = this.M;
                if (arrayList3 != null && arrayList3.isEmpty()) {
                    this.M.add(new fb4(0L, this.b0));
                    this.O.add(new fb4(0L, this.b0));
                }
            }
            arrayList = this.M;
            if (arrayList != null) {
                this.a0 = this.b0;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    fb4 fb4Var = (fb4) this.M.get(i7);
                    this.a0 -= fb4Var.b - fb4Var.a;
                }
                this.Q = this.a0;
            }
            if (f11.a) {
                boolean z8 = this.y;
                File file10 = this.J0;
                if (z8) {
                    cc4.b("start preloading file to temp = " + file10);
                } else {
                    StringBuilder sb2 = new StringBuilder("start loading file to temp = ");
                    sb2.append(file10);
                    sb2.append(" final = ");
                    sb2.append(this.L0);
                    sb2.append(" priority");
                    c00.q(this.W0, sb2);
                }
            }
            if (str2 != null) {
                this.M0 = new File(this.U0, str2);
                try {
                    this.R0 = new RandomAccessFile(this.M0, str8);
                    if (this.a0 != 0 && !z2) {
                        long length6 = this.M0.length();
                        if (length6 <= 0 || length6 % 64 != 0) {
                            this.a0 = 0L;
                            this.Q = 0L;
                        } else {
                            this.R0.read(this.i0, 0, 64);
                        }
                    }
                } catch (Exception e16) {
                    this.a0 = 0L;
                    this.Q = 0L;
                    if (hl.D1(e16)) {
                        LaunchActivity.F(1);
                        cc4.g(e16, false);
                    } else if (hl.E1(e16)) {
                        xea.h(this.L0);
                        cc4.g(e16, false);
                    } else {
                        cc4.g(e16, true);
                    }
                }
            }
            if (!this.y && this.a0 != 0 && this.b0 > 0 && this.M != null) {
                this.N = new ArrayList(this.M);
            }
            vb4Var = this.g0;
            if (vb4Var != null) {
                long j17 = this.a0;
                long j18 = this.b0;
                if (j17 != j18 && j18 > 0) {
                    vb4Var.a(this, j17, j18);
                }
            }
            try {
                RandomAccessFile randomAccessFile32222 = new RandomAccessFile(this.J0, str8);
                this.Q0 = randomAccessFile32222;
                j3 = this.a0;
                if (j3 != 0) {
                    randomAccessFile32222.seek(j3);
                }
                i3 = 0;
                z3 = true;
            } catch (Exception e17) {
                i3 = 0;
                cc4.g(e17, false);
                z3 = true;
                if (hl.D1(e17)) {
                    LaunchActivity.F(1);
                    h(-1, true);
                    return;
                } else if (hl.E1(e17)) {
                    xea.h(this.L0);
                    cc4.g(e17, false);
                    h(-1, true);
                    return;
                }
            }
            if (this.Q0 == null) {
                h(i3, z3);
                return;
            } else {
                this.S = z3;
                Utilities.d.c(new vx3(this, zArr2, (byte) 16));
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
                p3 = qu6.p(sb3, this.V.id, ".temp.enc");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.T);
                sb4.append("_");
                sb4.append(this.V.id);
                k = c00.k(sb4, this.P0, ".enc");
                if (this.h0 != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(this.T);
                    sb5.append("_");
                    p4 = qu6.p(sb5, this.V.id, "_64.iv.enc");
                    str5 = k;
                }
                str5 = k;
                p2 = null;
                str4 = null;
                str6 = p3;
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
                p = qu6.p(sb6, this.V.id, ".temp");
                str = this.T + "_" + this.V.id + this.P0;
                if (this.h0 != null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(this.T);
                    sb7.append("_");
                    str2 = qu6.p(sb7, this.V.id, "_64.iv");
                } else {
                    str2 = null;
                }
                if (this.M != null) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(this.T);
                    sb8.append("_");
                    str3 = qu6.p(sb8, this.V.id, "_64.pt");
                } else {
                    str3 = null;
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(this.T);
                sb9.append("_");
                p2 = qu6.p(sb9, this.V.id, "_64.preload");
                str4 = str3;
                str5 = str;
                str6 = p;
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
                p3 = uh9.l(sb10, this.V.local_id, ".temp.enc");
                StringBuilder sb11 = new StringBuilder();
                sb11.append(this.V.volume_id);
                sb11.append("_");
                sb11.append(this.V.local_id);
                sb11.append(".");
                k = c00.k(sb11, this.P0, ".enc");
                if (this.h0 != null) {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(this.V.volume_id);
                    sb12.append("_");
                    p4 = uh9.l(sb12, this.V.local_id, "_64.iv.enc");
                    str5 = k;
                }
                str5 = k;
                p2 = null;
                str4 = null;
                str6 = p3;
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
                p = uh9.l(sb13, this.V.local_id, ".temp");
                str = this.V.volume_id + "_" + this.V.local_id + "." + this.P0;
                if (this.h0 != null) {
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(this.V.volume_id);
                    sb14.append("_");
                    str2 = uh9.l(sb14, this.V.local_id, "_64.iv");
                } else {
                    str2 = null;
                }
                if (this.M != null) {
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(this.V.volume_id);
                    sb15.append("_");
                    str3 = uh9.l(sb15, this.V.local_id, "_64.pt");
                } else {
                    str3 = null;
                }
                StringBuilder sb16 = new StringBuilder();
                sb16.append(this.V.volume_id);
                sb16.append("_");
                p2 = uh9.l(sb16, this.V.local_id, "_64.preload");
                str4 = str3;
                str5 = str;
                str6 = p;
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
        p2 = null;
        str4 = null;
        str6 = p3;
        str2 = p4;
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
    /* JADX WARN: Removed duplicated region for block: B:182:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i) {
        int i2;
        int max;
        int i3;
        long j;
        byte b;
        int i4;
        long j2;
        long j3;
        long j4;
        int i5;
        TLObject tLObject;
        byte b2;
        long j5;
        TLRPC.InputFileLocation inputFileLocation;
        byte b3;
        HashMap hashMap;
        eb4 eb4Var;
        ArrayList arrayList;
        byte b4;
        boolean z;
        Pair m;
        Pair m2;
        hb4 hb4Var = this;
        Utilities.d.a(hb4Var.h);
        boolean z2 = f11.a;
        byte b5 = 1;
        if (hb4Var.Y == 5) {
            hb4Var.Y = (byte) 1;
        }
        if (hb4Var.Z || hb4Var.z0 || hb4Var.Y != 1 || hb4Var.A0) {
            return;
        }
        long j6 = 0;
        if (hb4Var.j || hb4Var.e0 != 0 || hb4Var.K || hb4Var.I0.size() + hb4Var.G0.size() < hb4Var.k0) {
            if (hb4Var.y) {
                if (hb4Var.Q > 2097152) {
                    return;
                }
                if (hb4Var.G != 0 && hb4Var.G0.size() > 0) {
                    return;
                }
            }
            ?? r10 = 0;
            if (hb4Var.j) {
                max = Math.max(0, hb4Var.k0 - hb4Var.G0.size());
            } else {
                if (hb4Var.e0 != 0 || hb4Var.K || ((hb4Var.y && hb4Var.G == 0) || hb4Var.b0 <= 0)) {
                    i2 = 1;
                    if (!hb4Var.B0) {
                        xc4 n = xc4.n(hb4Var.R);
                        Object obj = hb4Var.p0;
                        Object[] objArr = {hb4Var.V, hb4Var};
                        Pair p = xc4.p(objArr, obj);
                        if (p != null) {
                            TLRPC.InputFileLocation inputFileLocation2 = (TLRPC.InputFileLocation) p.first;
                            String str = (String) p.second;
                            String o = xc4.o(obj);
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
                                uc4 b6 = n.b(str);
                                if (b6 == null || (m2 = n.m(inputFileLocation2, o, b6.a, objArr)) == null) {
                                    uc4 b7 = n.b(o);
                                    if (b7 != null && (m = n.m(inputFileLocation2, null, b7.a, objArr)) != null) {
                                        z = xc4.w((byte[]) m.first, (TLRPC.InputFileLocation) m.second, inputFileLocation2, objArr);
                                    }
                                } else {
                                    z = xc4.w((byte[]) m2.first, (TLRPC.InputFileLocation) m2.second, inputFileLocation2, objArr);
                                }
                                if (z) {
                                    cc4.b(hb4Var.r + " before download updated file ref from file ref cache!");
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    i3 = 0;
                    hb4 hb4Var2 = hb4Var;
                    while (i3 < i2) {
                        if (!hb4Var2.y) {
                            j = j6;
                            ArrayList arrayList2 = hb4Var2.O;
                            if (arrayList2 != null) {
                                long j7 = hb4Var2.e0;
                                if (j7 == j) {
                                    j7 = hb4Var2.d0;
                                }
                                int size = arrayList2.size();
                                int i6 = r10;
                                long j8 = Long.MAX_VALUE;
                                long j9 = Long.MAX_VALUE;
                                while (true) {
                                    if (i6 >= size) {
                                        b = b5;
                                        i4 = i2;
                                        j3 = Long.MAX_VALUE;
                                        j7 = j8;
                                        break;
                                    }
                                    j3 = Long.MAX_VALUE;
                                    fb4 fb4Var = (fb4) hb4Var2.O.get(i6);
                                    if (j7 != j) {
                                        i4 = i2;
                                        long j10 = fb4Var.a;
                                        b = b5;
                                        j4 = j8;
                                        if (j10 <= j7 && fb4Var.b > j7) {
                                            j9 = Long.MAX_VALUE;
                                            break;
                                        } else if (j7 < j10 && j10 < j4) {
                                            j8 = j10;
                                            j9 = Math.min(j9, fb4Var.a);
                                            i6++;
                                            i2 = i4;
                                            b5 = b;
                                        }
                                    } else {
                                        b = b5;
                                        j4 = j8;
                                        i4 = i2;
                                    }
                                    j8 = j4;
                                    j9 = Math.min(j9, fb4Var.a);
                                    i6++;
                                    i2 = i4;
                                    b5 = b;
                                }
                                if (j7 != j3) {
                                    j2 = j7;
                                } else {
                                    if (j9 == j3) {
                                        boolean z3 = f11.a;
                                        return;
                                    }
                                    j2 = j9;
                                }
                            } else {
                                b = b5;
                                i4 = i2;
                                j2 = hb4Var2.Q;
                            }
                        } else {
                            if (hb4Var2.G != 0 && hb4Var2.F <= j6) {
                                boolean z4 = f11.a;
                                return;
                            }
                            j2 = hb4Var2.C;
                            if (j2 == -1) {
                                int i7 = (TLObject.FLAG_21 / hb4Var2.j0) + 2;
                                long j11 = j6;
                                while (true) {
                                    if (i7 == 0) {
                                        j = j6;
                                        j2 = j11;
                                        break;
                                    }
                                    if (!hb4Var2.u.containsKey(Long.valueOf(j11))) {
                                        j2 = j11;
                                        b4 = b5;
                                        j = j6;
                                        break;
                                    }
                                    long j12 = hb4Var2.j0;
                                    j11 += j12;
                                    long j13 = hb4Var2.b0;
                                    if (j11 > j13) {
                                        j2 = j11;
                                        j = j6;
                                        break;
                                    }
                                    long j14 = j6;
                                    if (hb4Var2.G == 2 && j11 == (r4 << 3)) {
                                        j11 = ((j13 - 1048576) / j12) * j12;
                                    }
                                    i7--;
                                    j6 = j14;
                                }
                                b4 = r10;
                                if (b4 == 0 && hb4Var2.G0.isEmpty()) {
                                    hb4Var2.i(r10, r10, r10);
                                }
                            } else {
                                j = j6;
                            }
                            HashMap hashMap2 = hb4Var2.u;
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                                hb4Var2.u = hashMap2;
                            }
                            hashMap2.put(Long.valueOf(j2), Integer.valueOf(b5));
                            boolean z5 = f11.a;
                            StringBuilder o2 = ik8.o(j2, "start next preload from ", " size ");
                            o2.append(hb4Var2.b0);
                            o2.append(" for ");
                            o2.append(hb4Var2.A);
                            cc4.b(o2.toString());
                            hb4Var2.F -= hb4Var2.j0;
                            b = b5;
                            i4 = i2;
                        }
                        int i8 = hb4Var2.J;
                        if (i8 > 0 && j2 >= i8 && hb4Var2.j && hb4Var2.W0 < 3) {
                            boolean z6 = f11.a;
                            return;
                        }
                        long j15 = hb4Var2.b0;
                        if (j15 > j && j2 > j && j2 >= j15) {
                            boolean z7 = f11.a;
                            return;
                        }
                        if (!hb4Var2.y && (arrayList = hb4Var2.O) != null) {
                            hb4Var2.a(j2, hb4Var2.j0 + j2, arrayList, false);
                            boolean z8 = f11.a;
                        }
                        long j16 = hb4Var2.b0;
                        boolean z9 = (j16 <= j || i3 == i4 + (-1) || (j16 > j && ((long) hb4Var2.j0) + j2 >= j16)) ? b : 0;
                        int i9 = i == -1 ? ((hb4Var2.l0 & (hb4Var2.g - 1)) << 16) | 2 : i;
                        int i10 = hb4Var2.V0 ? 32 : 0;
                        if (hb4Var2.f) {
                            i10 = j16 < 20480 ? i10 | 393216 : 262144 | i10;
                        }
                        if (hb4Var2.u0) {
                            TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                            tL_upload_getCdnFile.file_token = hb4Var2.x0;
                            tL_upload_getCdnFile.offset = j2;
                            i5 = hb4Var2.j0;
                            tL_upload_getCdnFile.limit = i5;
                            i10 |= 1;
                            tLObject = tL_upload_getCdnFile;
                        } else if (hb4Var2.W != null) {
                            TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                            tL_upload_getWebFile.location = hb4Var2.W;
                            tL_upload_getWebFile.offset = (int) j2;
                            i5 = hb4Var2.j0;
                            tL_upload_getWebFile.limit = i5;
                            tLObject = tL_upload_getWebFile;
                        } else {
                            TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                            tL_upload_getFile.location = hb4Var2.V;
                            tL_upload_getFile.offset = j2;
                            i5 = hb4Var2.j0;
                            tL_upload_getFile.limit = i5;
                            tL_upload_getFile.cdn_supported = b;
                            tLObject = tL_upload_getFile;
                        }
                        TLObject tLObject2 = tLObject;
                        hb4Var2.Q += i5;
                        gb4 gb4Var = new gb4();
                        hb4Var2.G0.add(gb4Var);
                        gb4Var.e = j2;
                        gb4Var.c = hb4Var2.j0;
                        gb4Var.i = hb4Var2.e;
                        gb4Var.d = i9;
                        if (!hb4Var2.y && hb4Var2.B && hb4Var2.v != null && (hashMap = hb4Var2.t) != null && (eb4Var = (eb4) hashMap.get(Long.valueOf(j2))) != null) {
                            gb4Var.f = new TLRPC.TL_upload_file();
                            try {
                                boolean z10 = f11.a;
                            } catch (Exception unused) {
                            }
                            if (eb4Var.b > 2147483647L) {
                                b2 = 0;
                                throw new RuntimeException("cast long to integer");
                            }
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) eb4Var.b);
                            hb4Var2.v.seek(eb4Var.a);
                            hb4Var2.v.getChannel().read(nativeByteBuffer.buffer);
                            b2 = 0;
                            try {
                                nativeByteBuffer.buffer.position(0);
                                gb4Var.f.bytes = nativeByteBuffer;
                                Utilities.d.c(new ab4(hb4Var2, gb4Var, b2));
                                j5 = j;
                            } catch (Exception unused2) {
                            }
                            b3 = 1;
                            i3++;
                            r10 = b2;
                            j6 = j5;
                            b5 = b3;
                            i2 = i4;
                            hb4Var2 = hb4Var2;
                            if (hb4Var2.e0 == j) {
                                boolean z11 = f11.a;
                                ik8.q(hb4Var2.e0, new StringBuilder("frame get offset = "));
                                j5 = j;
                                hb4Var2.e0 = j5;
                                hb4Var2.f0 = gb4Var;
                            } else {
                                j5 = j;
                            }
                            inputFileLocation = hb4Var2.V;
                            if ((inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) || ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation).photo_id != j5) {
                                gb4Var.i = hb4Var2.e;
                                if (f11.a) {
                                    gb4Var.b = System.currentTimeMillis();
                                }
                                int i11 = i10 | 2048;
                                int i12 = !hb4Var2.u0 ? hb4Var2.y0 : hb4Var2.T;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(hb4Var2.R);
                                Object obj2 = hb4Var2;
                                int i13 = i9;
                                hb4Var2 = obj2;
                                int sendRequestSync = connectionsManager.sendRequestSync(tLObject2, new il3(obj2, gb4Var, i12, i13, tLObject2, (byte) 2), null, null, i11, i12, i13, z9);
                                gb4Var.a = sendRequestSync;
                                if (f11.a) {
                                    StringBuilder sb = new StringBuilder("debug_loading: ");
                                    sb.append(hb4Var2.L0.getName());
                                    sb.append(" dc=");
                                    sb.append(i12);
                                    sb.append(" send reqId ");
                                    sb.append(gb4Var.a);
                                    sb.append(" offset=");
                                    sb.append(gb4Var.e);
                                    sb.append(" conType=");
                                    sb.append(i13);
                                    sb.append(" priority=");
                                    c00.q(hb4Var2.W0, sb);
                                }
                                b3 = 1;
                                hl.c3(new za4(hb4Var2, sendRequestSync, b3));
                                hb4Var2.l0++;
                                i3++;
                                r10 = b2;
                                j6 = j5;
                                b5 = b3;
                                i2 = i4;
                                hb4Var2 = hb4Var2;
                            } else {
                                hb4Var2.n(gb4Var);
                                b3 = 1;
                                i3++;
                                r10 = b2;
                                j6 = j5;
                                b5 = b3;
                                i2 = i4;
                                hb4Var2 = hb4Var2;
                            }
                        }
                        b2 = 0;
                        if (hb4Var2.e0 == j) {
                        }
                        inputFileLocation = hb4Var2.V;
                        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                        }
                        gb4Var.i = hb4Var2.e;
                        if (f11.a) {
                        }
                        int i112 = i10 | 2048;
                        int i122 = !hb4Var2.u0 ? hb4Var2.y0 : hb4Var2.T;
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(hb4Var2.R);
                        Object obj22 = hb4Var2;
                        int i132 = i9;
                        hb4Var2 = obj22;
                        int sendRequestSync2 = connectionsManager2.sendRequestSync(tLObject2, new il3(obj22, gb4Var, i122, i132, tLObject2, (byte) 2), null, null, i112, i122, i132, z9);
                        gb4Var.a = sendRequestSync2;
                        if (f11.a) {
                        }
                        b3 = 1;
                        hl.c3(new za4(hb4Var2, sendRequestSync2, b3));
                        hb4Var2.l0++;
                        i3++;
                        r10 = b2;
                        j6 = j5;
                        b5 = b3;
                        i2 = i4;
                        hb4Var2 = hb4Var2;
                    }
                }
                max = Math.max(0, (hb4Var.k0 - hb4Var.G0.size()) - (hb4Var.f ? hb4Var.I0.size() : 0));
            }
            i2 = max;
            if (!hb4Var.B0) {
            }
            i3 = 0;
            hb4 hb4Var22 = hb4Var;
            while (i3 < i2) {
            }
        }
    }

    public final void r() {
        boolean z = !uc7.s1(this.R).k4.C0.f && this.b0 > 0 && this.h0 == null && !this.n0 && !this.y && this.J == 0;
        this.f = z;
        if (z) {
            boolean p = yac.h(this.R).p();
            this.g = p ? (byte) 8 : (byte) 2;
            this.k0 = ((p ? 16 : 2) << 20) / this.j0;
        }
    }

    public final void s() {
        int i;
        int i2 = 131072;
        if ((this.J > 0 || uc7.s1(this.R).k4.Z2.f) && !this.e) {
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

    public hb4(oy9 oy9Var) {
        this.g = (byte) 2;
        this.h = new xa4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = oc1.AUDIO_CONTENT_SAMPLING_RATE;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new xa4(this, (byte) 4);
        s();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.V = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = oy9Var.b;
        tL_inputSecureFileLocation.id = tL_secureFile.id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.T = tL_secureFile.dc_id;
        this.b0 = tL_secureFile.size;
        this.o0 = true;
        this.b1 = 67108864;
        this.P0 = ".jpg";
    }

    public hb4(int i, jxc jxcVar) {
        this.g = (byte) 2;
        this.h = new xa4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = oc1.AUDIO_CONTENT_SAMPLING_RATE;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new xa4(this, (byte) 4);
        s();
        this.R = i;
        this.X = jxcVar;
        this.W = jxcVar.b;
        this.b0 = jxcVar.d;
        int i2 = uc7.s1(i).r3;
        this.T = i2;
        this.U = i2;
        String H = xb4.H(jxcVar.e);
        if (jxcVar.e.startsWith("image/")) {
            this.b1 = 16777216;
        } else if (jxcVar.e.equals("audio/ogg")) {
            this.b1 = ConnectionsManager.FileTypeAudio;
        } else if (jxcVar.e.startsWith("video/")) {
            this.b1 = 33554432;
        } else {
            this.b1 = 67108864;
        }
        this.o0 = true;
        this.P0 = in5.x(jxcVar.a, H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hb4(jn5 jn5Var, Object obj, String str, long j) {
        TLRPC.InputFileLocation tL_inputDocumentFileLocation;
        this.g = (byte) 2;
        this.h = new xa4(this, 0 == true ? 1 : 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = oc1.AUDIO_CONTENT_SAMPLING_RATE;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new xa4(this, (byte) 4);
        s();
        this.p0 = obj;
        this.j = obj instanceof TL_stories.TL_storyItem;
        this.X0 = xb4.E(obj);
        this.r0 = jn5Var.p == 2;
        if (jn5Var.c != null) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.V = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jn5Var.f;
            long j2 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.id = j2;
            tL_inputEncryptedFileLocation.volume_id = j2;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = jn5Var.e;
            byte[] bArr = new byte[32];
            this.i0 = bArr;
            System.arraycopy(jn5Var.d, 0, bArr, 0, 32);
            this.h0 = jn5Var.c;
        } else if (jn5Var.n != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = jn5Var.f;
            long j3 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.id = j3;
            tL_inputPeerPhotoFileLocation.volume_id = j3;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = jn5Var.s;
            tL_inputPeerPhotoFileLocation.big = jn5Var.m == 0;
            tL_inputPeerPhotoFileLocation.peer = jn5Var.n;
            this.V = tL_inputPeerPhotoFileLocation;
        } else if (jn5Var.o != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = jn5Var.f;
            long j4 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.id = j4;
            tL_inputStickerSetThumb.volume_id = j4;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = jn5Var.q;
            tL_inputStickerSetThumb.stickerset = jn5Var.o;
            this.V = tL_inputStickerSetThumb;
        } else if (jn5Var.u != null) {
            if (jn5Var.s != 0) {
                tL_inputDocumentFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = jn5Var.s;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = jn5Var.f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputDocumentFileLocation.access_hash = jn5Var.e;
                tL_inputDocumentFileLocation.file_reference = jn5Var.b;
                tL_inputDocumentFileLocation.thumb_size = jn5Var.u;
                if (jn5Var.p == 2) {
                    this.o0 = true;
                }
            } else {
                tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = jn5Var.t;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = jn5Var.f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = jn5Var.e;
                tL_inputDocumentFileLocation.file_reference = jn5Var.b;
                tL_inputDocumentFileLocation.thumb_size = jn5Var.u;
            }
            if (tL_inputDocumentFileLocation.file_reference == null) {
                tL_inputDocumentFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.V = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = jn5Var.f;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = jn5Var.e;
            byte[] bArr2 = jn5Var.b;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.o0 = true;
        }
        byte b = jn5Var.p;
        this.a1 = b == 1 || b == 3;
        int i = jn5Var.a;
        this.T = i;
        this.U = i;
        this.b1 = 16777216;
        this.b0 = j;
        this.P0 = str == null ? "jpg" : str;
    }
}
