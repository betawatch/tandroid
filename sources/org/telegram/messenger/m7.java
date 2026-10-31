package org.telegram.messenger;

import android.graphics.Typeface;
import android.util.Pair;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m7 {
    public static rf.x l1;
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
    public int G;
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
    public final b30 X;
    public final j8 X0;
    public volatile int Y;
    public volatile boolean Y0;
    public volatile boolean Z;
    public volatile boolean Z0;
    public boolean a;
    public long a0;
    public boolean a1;
    public n7 b;
    public long b0;
    public final int b1;
    public boolean c;
    public final long c0;
    public j4.w c1;
    public long d;
    public long d0;
    public long d1;
    public boolean e;
    public long e0;
    public bg.h e1;
    public boolean f;
    public l7 f0;
    public final Runnable f1;
    public int g;
    public z7 g0;
    public long g1;
    public final Runnable h;
    public final byte[] h0;
    public long h1;
    public t6 i;
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
    public int o;
    public boolean o0;
    public int p;
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
    public static volatile r5 k1 = new r5("writeFileQueue");
    public static final Object m1 = new Object();

    public m7(ic icVar, Object obj, String str, long j10) {
        this.g = 2;
        this.h = new b7(this, 0);
        this.n = 131072;
        this.o = 4;
        this.p = 4;
        this.q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f1 = new b7(this, 5);
        u();
        this.p0 = obj;
        this.j = obj instanceof TL_stories.TL_storyItem;
        this.X0 = b8.E(obj);
        this.r0 = icVar.p == 2;
        if (icVar.c != null) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.V = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = icVar.f;
            long j11 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.id = j11;
            tL_inputEncryptedFileLocation.volume_id = j11;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = icVar.e;
            byte[] bArr = new byte[32];
            this.i0 = bArr;
            System.arraycopy(icVar.d, 0, bArr, 0, 32);
            this.h0 = icVar.c;
        } else if (icVar.n != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = icVar.f;
            long j12 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.id = j12;
            tL_inputPeerPhotoFileLocation.volume_id = j12;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = icVar.s;
            tL_inputPeerPhotoFileLocation.big = icVar.m == 0;
            tL_inputPeerPhotoFileLocation.peer = icVar.n;
            this.V = tL_inputPeerPhotoFileLocation;
        } else if (icVar.o != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = icVar.f;
            long j13 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.id = j13;
            tL_inputStickerSetThumb.volume_id = j13;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = icVar.q;
            tL_inputStickerSetThumb.stickerset = icVar.o;
            this.V = tL_inputStickerSetThumb;
        } else if (icVar.u != null) {
            if (icVar.s != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.V = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.id = icVar.s;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = icVar.f;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = icVar.e;
                tL_inputPhotoFileLocation.file_reference = icVar.b;
                tL_inputPhotoFileLocation.thumb_size = icVar.u;
                if (icVar.p == 2) {
                    this.o0 = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = icVar.t;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = icVar.f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = icVar.e;
                tL_inputDocumentFileLocation.file_reference = icVar.b;
                tL_inputDocumentFileLocation.thumb_size = icVar.u;
            }
            TLRPC.InputFileLocation inputFileLocation = this.V;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.V = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = icVar.f;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = icVar.e;
            byte[] bArr2 = icVar.b;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.o0 = true;
        }
        int i10 = icVar.p;
        this.a1 = i10 == 1 || i10 == 3;
        int i11 = icVar.a;
        this.T = i11;
        this.U = i11;
        this.b1 = 16777216;
        this.b0 = j10;
        this.P0 = str == null ? "jpg" : str;
    }

    public static /* synthetic */ void a(m7 m7Var) {
        if (m7Var.Y != 1 || m7Var.Z) {
            return;
        }
        m7Var.s(-1);
    }

    public static void b(m7 m7Var) {
        m7Var.l();
        b8.G(m7Var.R).e(null, null, null, null, null, m7Var.r);
    }

    public static void n(long j10, long j11, ArrayList arrayList) {
        boolean z10;
        if (arrayList == null || j11 < j10) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            k7 k7Var = (k7) arrayList.get(i11);
            if (j10 == k7Var.b) {
                k7Var.b = j11;
            } else if (j11 == k7Var.a) {
                k7Var.a = j10;
            }
            z10 = true;
        }
        z10 = false;
        Collections.sort(arrayList, new a4.d(18));
        while (i10 < arrayList.size() - 1) {
            k7 k7Var2 = (k7) arrayList.get(i10);
            int i12 = i10 + 1;
            k7 k7Var3 = (k7) arrayList.get(i12);
            if (k7Var2.b == k7Var3.a) {
                k7Var2.b = k7Var3.b;
                arrayList.remove(i12);
                i10--;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        arrayList.add(new k7(j10, j11));
    }

    public final void c(long j10, long j11, ArrayList arrayList, boolean z10) {
        if (arrayList == null || j11 < j10) {
            return;
        }
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            k7 k7Var = (k7) arrayList.get(i10);
            long j12 = k7Var.a;
            if (j10 > j12) {
                long j13 = k7Var.b;
                if (j11 < j13) {
                    arrayList.add(0, new k7(j12, j10));
                    k7Var.a = j11;
                } else if (j10 < j13) {
                    k7Var.b = j10;
                }
                z11 = true;
                break;
            }
            if (j11 >= k7Var.b) {
                arrayList.remove(i10);
            } else if (j11 > j12) {
                k7Var.a = j11;
            }
            z11 = true;
            break;
        }
        if (z10) {
            if (!z11) {
                if (v2.a) {
                    f8.d(this.L0 + " downloaded duplicate file part " + j10 + " - " + j11);
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
            r5 r5Var = k1;
            t6 t6Var = new t6(4, this, arrayList2);
            this.i = t6Var;
            r5Var.c(t6Var);
            i();
        }
    }

    public final void d() {
        try {
            RandomAccessFile randomAccessFile = this.Q0;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e) {
                    f8.g(e, true);
                }
                this.Q0.close();
                this.Q0 = null;
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.v;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
                this.v.close();
                this.v = null;
            }
        } catch (Exception e11) {
            f8.g(e11, true);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.C0;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e12) {
                    f8.g(e12, true);
                }
                this.C0.close();
                this.C0 = null;
            }
        } catch (Exception e13) {
            f8.g(e13, true);
        }
        try {
            if (this.S0 != null) {
                synchronized (this) {
                    if (this.Y0) {
                        this.Z0 = true;
                    } else {
                        try {
                            this.S0.getChannel().close();
                        } catch (Exception e14) {
                            f8.g(e14, true);
                        }
                        this.S0.close();
                        this.S0 = null;
                    }
                }
            }
        } catch (Exception e15) {
            f8.g(e15, true);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.R0;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.R0 = null;
            }
        } catch (Exception e16) {
            f8.g(e16, true);
        }
        if (this.I0 != null) {
            for (int i10 = 0; i10 < this.I0.size(); i10++) {
                l7 l7Var = (l7) this.I0.get(i10);
                TLRPC.TL_upload_file tL_upload_file = l7Var.f;
                if (tL_upload_file != null) {
                    tL_upload_file.disableFree = false;
                    tL_upload_file.freeResources();
                } else {
                    TLRPC.TL_upload_webFile tL_upload_webFile = l7Var.g;
                    if (tL_upload_webFile != null) {
                        tL_upload_webFile.disableFree = false;
                        tL_upload_webFile.freeResources();
                    } else {
                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile = l7Var.h;
                        if (tL_upload_cdnFile != null) {
                            tL_upload_cdnFile.disableFree = false;
                            tL_upload_cdnFile.freeResources();
                        }
                    }
                }
            }
            this.I0.clear();
        }
    }

    public final void e(l7 l7Var, boolean z10, boolean z11) {
        int[] iArr = new int[8];
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.G0.size(); i10++) {
            l7 l7Var2 = (l7) this.G0.get(i10);
            j10 = Math.min(l7Var2.e, j10);
            if (this.y) {
                this.u.remove(Long.valueOf(l7Var2.e));
            } else {
                ArrayList arrayList = this.O;
                long j11 = l7Var2.e;
                n(j11, l7Var2.c + j11, arrayList);
            }
            if (l7Var != l7Var2 && l7Var2.a != 0) {
                l7Var2.j = true;
                if (z11) {
                    this.H0.add(l7Var2);
                    l7Var2.l = new e7(this, l7Var2, 0);
                    ConnectionsManager.getInstance(this.R).cancelRequest(l7Var2.a, true, new f7(l7Var2, 0));
                } else {
                    ConnectionsManager.getInstance(this.R).cancelRequest(l7Var2.a, true);
                    l7Var2.k = true;
                }
                if (!d6.g()) {
                    int i11 = l7Var2.d >>> 16;
                    iArr[i11] = iArr[i11] + l7Var2.c;
                }
            }
        }
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = (i12 << 16) | 2;
            if (iArr[i12] > ((!this.j || d6.g()) ? TLObject.FLAG_20 : 262144)) {
                ConnectionsManager.getInstance(this.R).discardConnection(this.u0 ? this.y0 : this.T, i13);
            }
        }
        this.G0.clear();
        i0.g3(new b7(this, 2));
        for (int i14 = 0; i14 < this.I0.size(); i14++) {
            l7 l7Var3 = (l7) this.I0.get(i14);
            if (this.y) {
                this.u.remove(Long.valueOf(l7Var3.e));
            } else {
                ArrayList arrayList2 = this.O;
                long j12 = l7Var3.e;
                n(j12, l7Var3.c + j12, arrayList2);
            }
            TLRPC.TL_upload_file tL_upload_file = l7Var3.f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = l7Var3.g;
                if (tL_upload_webFile != null) {
                    tL_upload_webFile.disableFree = false;
                    tL_upload_webFile.freeResources();
                } else {
                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile = l7Var3.h;
                    if (tL_upload_cdnFile != null) {
                        tL_upload_cdnFile.disableFree = false;
                        tL_upload_cdnFile.freeResources();
                    }
                }
            }
            j10 = Math.min(l7Var3.e, j10);
        }
        this.I0.clear();
        this.l0 = 0;
        if (!z10 && this.y) {
            this.Q = this.x;
        } else if (this.M == null) {
            this.a0 = j10;
            this.Q = j10;
        }
    }

    public final long f(long j10, long j11, NativeByteBuffer nativeByteBuffer) {
        int limit = nativeByteBuffer.limit();
        long j12 = j10;
        while (j12 >= j11 - 16) {
            long j13 = j11 + limit;
            if (j12 >= j13) {
                return 0L;
            }
            long j14 = j13 - 16;
            byte[] bArr = this.H;
            if (j12 >= j14) {
                long j15 = j13 - j12;
                if (j15 > 2147483647L) {
                    throw new RuntimeException("!!!");
                }
                this.I = (int) j15;
                nativeByteBuffer.position(nativeByteBuffer.limit() - this.I);
                nativeByteBuffer.readBytes(bArr, 0, this.I, false);
                return j13;
            }
            if (this.I != 0) {
                nativeByteBuffer.position(0);
                int i10 = this.I;
                nativeByteBuffer.readBytes(bArr, i10, 16 - i10, false);
                this.I = 0;
            } else {
                long j16 = j12 - j11;
                if (j16 > 2147483647L) {
                    throw new RuntimeException("!!!");
                }
                nativeByteBuffer.position((int) j16);
                nativeByteBuffer.readBytes(bArr, 0, 16, false);
            }
            int i11 = ((bArr[0] & 255) << 24) + ((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255);
            if (i11 == 0) {
                return 0L;
            }
            if (i11 == 1) {
                i11 = ((bArr[12] & 255) << 24) + ((bArr[13] & 255) << 16) + ((bArr[14] & 255) << 8) + (bArr[15] & 255);
            }
            if (bArr[4] == 109 && bArr[5] == 111 && bArr[6] == 111 && bArr[7] == 118) {
                return -i11;
            }
            j12 += i11;
            if (j12 >= j13) {
                return j12;
            }
        }
        return 0L;
    }

    public final File g() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        File[] fileArr = new File[1];
        Utilities.d.c(new mg(this, fileArr, countDownLatch, 21));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            f8.g(e, true);
        }
        return fileArr[0];
    }

    public final long h(long j10, long j11, ArrayList arrayList) {
        long j12;
        if (arrayList == null || this.Y == 3 || arrayList.isEmpty()) {
            if (this.Y == 3) {
                return j11;
            }
            long j13 = this.a0;
            if (j13 == 0) {
                return 0L;
            }
            return Math.min(j11, Math.max(j13 - j10, 0L));
        }
        int size = arrayList.size();
        k7 k7Var = null;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                j12 = j11;
                break;
            }
            k7 k7Var2 = (k7) arrayList.get(i10);
            long j14 = k7Var2.a;
            if (j10 <= j14 && (k7Var == null || j14 < k7Var.a)) {
                k7Var = k7Var2;
            }
            if (j14 <= j10 && k7Var2.b > j10) {
                j12 = 0;
                break;
            }
            i10++;
        }
        if (j12 == 0) {
            return 0L;
        }
        return k7Var != null ? Math.min(j11, k7Var.a - j10) : Math.min(j11, Math.max(this.b0 - j10, 0L));
    }

    public final void i() {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((n7) this.m.get(i10)).a();
            }
        }
    }

    public final void j(int i10, boolean z10) {
        d();
        this.Y = i10 == 1 ? 4 : 2;
        if (this.g0 != null && v2.a) {
            long currentTimeMillis = this.d1 != 0 ? System.currentTimeMillis() - this.d1 : 0L;
            if (i10 == 1) {
                f8.b("cancel downloading file to " + this.L0 + " time = " + currentTimeMillis + " dc = " + this.T + " size = " + i0.i0(this.b0, false, false));
            } else {
                f8.b("failed downloading file to " + this.L0 + " reason = " + i10 + " time = " + currentTimeMillis + " dc = " + this.T + " size = " + i0.i0(this.b0, false, false));
            }
        }
        if (z10) {
            Utilities.d.c(new d7(this, i10, 3));
            return;
        }
        z7 z7Var = this.g0;
        if (z7Var != null) {
            z7Var.b(this, i10);
        }
        i();
    }

    public final void k(int i10, boolean z10, boolean z11) {
        if (this.Y == 1 || this.Y == 5) {
            this.Y = 3;
            i();
            d();
            int i11 = 8;
            if (!this.y && !z11) {
                k1.c(new sy(this, this.M0, this.N0, this.A, this.J0, z10, 2));
                this.M0 = null;
                this.N0 = null;
                this.A = null;
                this.g0.getClass();
                b8.J.c(new t6(i11, this, this.e1));
                return;
            }
            this.z = true;
            boolean z12 = v2.a;
            if (i10 == 1) {
                f8.b("file already exist " + this.J0);
            } else {
                StringBuilder sb2 = new StringBuilder("finished preloading file to ");
                sb2.append(this.J0);
                sb2.append(" loaded ");
                sb2.append(this.a0);
                sb2.append(" of ");
                sb2.append(this.b0);
                sb2.append(" prefSize=");
                i0.a.p(this.J, sb2);
            }
            if (this.X0 != null) {
                int i12 = 10;
                if (this.J0 != null) {
                    k8 k8Var = b8.G(this.R).d;
                    List singletonList = Collections.singletonList(new sh.a(this.J0));
                    k8Var.getClass();
                    k8Var.h(new t6(i12, k8Var, singletonList));
                }
                if (this.N0 != null) {
                    k8 k8Var2 = b8.G(this.R).d;
                    List singletonList2 = Collections.singletonList(new sh.a(this.N0));
                    k8Var2.getClass();
                    k8Var2.h(new t6(i12, k8Var2, singletonList2));
                }
            }
            this.g0.getClass();
            b8.J.c(new t6(i11, this, this.e1));
            this.g0.c(this, this.L0);
        }
    }

    public final void l() {
        if (this.Y != 1) {
            return;
        }
        this.Z = true;
        this.g1 = 0L;
        Utilities.d.c(new b7(this, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0411, code lost:
    
        if (r6 == (r4 - r2)) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x026a A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05e4 A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05ea A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0278 A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f1 A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x033c A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0374 A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d0 A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0556 A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0574 A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:71:0x0080, B:73:0x0084, B:75:0x0090, B:77:0x0099, B:79:0x009c, B:81:0x00a0, B:83:0x00a3, B:85:0x00a7, B:87:0x00af, B:89:0x00b3, B:91:0x00cd, B:93:0x00d7, B:95:0x00e1, B:97:0x00ee, B:99:0x00fc, B:101:0x0105, B:102:0x0117, B:104:0x0109, B:106:0x010e, B:107:0x0111, B:109:0x0115, B:111:0x011b, B:113:0x0131, B:114:0x0170, B:116:0x0174, B:118:0x01bd, B:119:0x01c4, B:121:0x01e7, B:123:0x01f6, B:125:0x020a, B:126:0x0220, B:127:0x022b, B:128:0x0216, B:129:0x0223, B:130:0x022d, B:132:0x024e, B:134:0x0252, B:136:0x0258, B:138:0x025e, B:143:0x026a, B:146:0x058a, B:148:0x0592, B:150:0x059e, B:152:0x05a9, B:155:0x05ac, B:157:0x05b8, B:159:0x05bc, B:160:0x05c3, B:162:0x05c7, B:163:0x05ce, B:165:0x05d4, B:167:0x05e4, B:169:0x05ea, B:171:0x05ef, B:173:0x05f4, B:177:0x0278, B:179:0x027c, B:181:0x0287, B:185:0x0299, B:187:0x029d, B:189:0x02a2, B:191:0x02a6, B:195:0x02b0, B:200:0x02bc, B:203:0x02e8, B:205:0x02f1, B:207:0x030a, B:209:0x0312, B:211:0x0321, B:212:0x0326, B:213:0x0337, B:214:0x0338, B:216:0x033c, B:217:0x0370, B:219:0x0374, B:220:0x03ae, B:222:0x03d0, B:224:0x03e2, B:226:0x03f0, B:229:0x03f6, B:233:0x0408, B:235:0x040e, B:240:0x041c, B:242:0x042c, B:243:0x043d, B:245:0x0448, B:247:0x0457, B:248:0x0494, B:250:0x04a2, B:252:0x04a6, B:254:0x04aa, B:255:0x04f6, B:257:0x04fa, B:259:0x0519, B:261:0x0522, B:262:0x0552, B:264:0x0556, B:265:0x0562, B:267:0x056a, B:269:0x056f, B:272:0x057d, B:273:0x0574, B:276:0x0538, B:277:0x053f, B:279:0x0540, B:285:0x02cc, B:289:0x02d6, B:298:0x05fe, B:300:0x00b6, B:302:0x00ba, B:303:0x00bd, B:305:0x00c3), top: B:70:0x0080 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(l7 l7Var, TLRPC.TL_error tL_error) {
        long j10;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile;
        NativeByteBuffer nativeByteBuffer;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile2;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile3;
        String str;
        char c10;
        char c11;
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        long j11;
        long j12;
        boolean z13;
        RandomAccessFile randomAccessFile;
        boolean z14;
        boolean z15;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile4;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile5;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile6;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        boolean z16;
        long j25;
        Integer num;
        boolean z17;
        long j26;
        long j27;
        long j28;
        int i10 = 1;
        if (this.Y == 1 || this.Y == 5) {
            int i11 = l7Var.a;
            this.G0.remove(l7Var);
            i0.g3(new d7(this, i11, i10));
            String str2 = " secret = ";
            if (tL_error == null) {
                try {
                    if (this.M == null) {
                        j10 = 0;
                        long j29 = this.a0;
                        j25 = l7Var.e;
                        if (j29 != j25) {
                            this.I0.add(l7Var);
                            TLRPC.TL_upload_file tL_upload_file = l7Var.f;
                            if (tL_upload_file != null) {
                                tL_upload_file.disableFree = true;
                                return false;
                            }
                            TLRPC.TL_upload_webFile tL_upload_webFile = l7Var.g;
                            if (tL_upload_webFile != null) {
                                tL_upload_webFile.disableFree = true;
                                return false;
                            }
                            TLRPC.TL_upload_cdnFile tL_upload_cdnFile7 = l7Var.h;
                            if (tL_upload_cdnFile7 != null) {
                                tL_upload_cdnFile7.disableFree = true;
                                return false;
                            }
                        }
                    } else {
                        j10 = 0;
                    }
                    TLRPC.TL_upload_file tL_upload_file2 = l7Var.f;
                    if (tL_upload_file2 != null) {
                        nativeByteBuffer = tL_upload_file2.bytes;
                    } else {
                        TLRPC.TL_upload_webFile tL_upload_webFile2 = l7Var.g;
                        if (tL_upload_webFile2 != null) {
                            nativeByteBuffer = tL_upload_webFile2.bytes;
                        } else {
                            tL_upload_cdnFile = l7Var.h;
                            if (tL_upload_cdnFile != null) {
                                tL_upload_cdnFile2 = l7Var.h;
                                nativeByteBuffer = tL_upload_cdnFile2.bytes;
                            } else {
                                nativeByteBuffer = null;
                            }
                        }
                    }
                    if (nativeByteBuffer == null || nativeByteBuffer.limit() == 0) {
                        k(0, true, false);
                        return false;
                    }
                    int limit = nativeByteBuffer.limit();
                    if (this.u0) {
                        j24 = l7Var.e;
                        long j30 = 131072;
                        long j31 = j30 * (j24 / j30);
                        HashMap hashMap = this.q0;
                        if ((hashMap != null ? (TLRPC.TL_fileHash) hashMap.get(Long.valueOf(j31)) : null) == null) {
                            this.I0.add(l7Var);
                            TLRPC.TL_upload_file tL_upload_file3 = l7Var.f;
                            if (tL_upload_file3 != null) {
                                z16 = true;
                                tL_upload_file3.disableFree = true;
                            } else {
                                z16 = true;
                                TLRPC.TL_upload_webFile tL_upload_webFile3 = l7Var.g;
                                if (tL_upload_webFile3 != null) {
                                    tL_upload_webFile3.disableFree = true;
                                } else {
                                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile8 = l7Var.h;
                                    if (tL_upload_cdnFile8 != null) {
                                        tL_upload_cdnFile8.disableFree = true;
                                    }
                                }
                            }
                            o(j31);
                            return z16;
                        }
                    }
                    tL_upload_cdnFile3 = l7Var.h;
                    if (tL_upload_cdnFile3 != null) {
                        j23 = l7Var.e;
                        long j32 = j23 / 16;
                        byte[] bArr2 = this.v0;
                        c11 = '\f';
                        bArr2[15] = (byte) (j32 & 255);
                        bArr2[14] = (byte) ((j32 >> 8) & 255);
                        bArr2[13] = (byte) ((j32 >> 16) & 255);
                        bArr2[12] = (byte) ((j32 >> 24) & 255);
                        c10 = '\r';
                        str = " access_hash = ";
                        Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.w0, bArr2, 0, nativeByteBuffer.limit());
                    } else {
                        str = " access_hash = ";
                        c10 = '\r';
                        c11 = '\f';
                    }
                    if (this.y) {
                        RandomAccessFile randomAccessFile2 = this.v;
                        j19 = l7Var.e;
                        randomAccessFile2.writeLong(j19);
                        long j33 = limit;
                        this.v.writeLong(j33);
                        this.w += 16;
                        this.v.getChannel().write(nativeByteBuffer.buffer);
                        boolean z18 = v2.a;
                        StringBuilder sb2 = new StringBuilder("save preload file part ");
                        sb2.append(this.A);
                        sb2.append(" offset ");
                        j20 = l7Var.e;
                        sb2.append(j20);
                        sb2.append(" size ");
                        sb2.append(limit);
                        f8.b(sb2.toString());
                        if (this.t == null) {
                            this.t = new HashMap();
                        }
                        HashMap hashMap2 = this.t;
                        j21 = l7Var.e;
                        hashMap2.put(Long.valueOf(j21), new j7(this.w, j33));
                        this.x += limit;
                        this.w += limit;
                        if (this.G == 0) {
                            long j34 = this.D;
                            j22 = l7Var.e;
                            long f7 = f(j34, j22, nativeByteBuffer);
                            if (f7 < j10) {
                                f7 *= -1;
                                long j35 = this.C + this.j0;
                                this.C = j35;
                                if (j35 < this.b0 / 2) {
                                    long j36 = 1048576 + f7;
                                    this.E = j36;
                                    this.F = j36;
                                    this.G = 1;
                                } else {
                                    this.E = 2097152L;
                                    this.F = 2097152L;
                                    this.G = 2;
                                }
                                this.C = -1L;
                            } else {
                                this.C += this.j0;
                            }
                            this.D = f7;
                        }
                        this.v.writeLong(this.E);
                        this.v.writeLong(this.C);
                        this.v.writeLong(this.D);
                        this.w += 24;
                        long j37 = this.C;
                        if (j37 != j10 && ((this.G == 0 || this.E >= j10) && this.x <= 2097152 && j37 < this.b0)) {
                            z15 = false;
                            if (!z15) {
                                this.v.seek(j10);
                                this.v.write(1);
                            } else if (this.G != 0) {
                                this.E -= this.j0;
                            }
                            z14 = false;
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        z14 = false;
                    } else {
                        long j38 = limit;
                        long j39 = this.a0 + j38;
                        this.a0 = j39;
                        long j40 = this.b0;
                        if (j40 > 0) {
                            if (j39 < j40) {
                                int i12 = this.J;
                                if (i12 > 0 && j39 >= i12) {
                                    if ((this.j && this.W0 < 3) && this.G0.isEmpty()) {
                                    }
                                }
                                z10 = false;
                                if (this.a0 < this.b0) {
                                    z11 = z10;
                                    z12 = true;
                                    boolean z19 = v2.a;
                                    bArr = this.h0;
                                    if (bArr != null) {
                                        Utilities.c(nativeByteBuffer.buffer, bArr, this.i0, false, true, 0, nativeByteBuffer.limit());
                                        if (z11 && this.c0 != 0) {
                                            long limit2 = nativeByteBuffer.limit() - this.c0;
                                            if (limit2 > 2147483647L) {
                                                throw new RuntimeException("Out of limit" + limit2);
                                            }
                                            nativeByteBuffer.limit((int) limit2);
                                        }
                                    }
                                    if (this.n0) {
                                        j17 = l7Var.e;
                                        long j41 = j17 / 16;
                                        byte[] bArr3 = this.t0;
                                        bArr3[15] = (byte) (j41 & 255);
                                        bArr3[14] = (byte) ((j41 >> 8) & 255);
                                        bArr3[c10] = (byte) ((j41 >> 16) & 255);
                                        bArr3[c11] = (byte) ((j41 >> 24) & 255);
                                        Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.s0, bArr3, 0, nativeByteBuffer.limit());
                                    }
                                    if (this.M != null) {
                                        RandomAccessFile randomAccessFile3 = this.Q0;
                                        j15 = l7Var.e;
                                        randomAccessFile3.seek(j15);
                                        StringBuilder sb3 = new StringBuilder("save file part ");
                                        sb3.append(this.r);
                                        sb3.append(" offset=");
                                        j16 = l7Var.e;
                                        sb3.append(j16);
                                        sb3.append(" chunk_size=");
                                        sb3.append(this.j0);
                                        sb3.append(" isCdn=");
                                        sb3.append(this.u0);
                                        f8.b(sb3.toString());
                                    }
                                    this.Q0.getChannel().write(nativeByteBuffer.buffer);
                                    ArrayList arrayList = this.M;
                                    j11 = l7Var.e;
                                    j12 = l7Var.e;
                                    long j42 = j12 + j38;
                                    String str3 = str;
                                    c(j11, j42, arrayList, true);
                                    if (this.u0) {
                                        j13 = l7Var.e;
                                        long j43 = 131072;
                                        long j44 = j13 / j43;
                                        int size = this.P.size();
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= size) {
                                                break;
                                            }
                                            k7 k7Var = (k7) this.P.get(i13);
                                            if (k7Var.a > j44 || j44 > k7Var.b) {
                                                i13++;
                                                z12 = z12;
                                                str2 = str2;
                                                j44 = j44;
                                            } else {
                                                long j45 = j44 * j43;
                                                long h = h(j45, j43, this.M);
                                                if (h != 0) {
                                                    if (h != j43) {
                                                        long j46 = this.b0;
                                                        if (j46 > 0) {
                                                        }
                                                        if (j46 <= 0 && z11) {
                                                        }
                                                    }
                                                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) this.q0.get(Long.valueOf(j45));
                                                    if (this.C0 == null) {
                                                        this.D0 = new byte[131072];
                                                        this.C0 = new RandomAccessFile(this.J0, "r");
                                                    }
                                                    this.C0.seek(j45);
                                                    boolean z20 = v2.a;
                                                    if (h > 2147483647L) {
                                                        throw new RuntimeException("!!!");
                                                    }
                                                    this.C0.readFully(this.D0, 0, (int) h);
                                                    if (this.n0) {
                                                        long j47 = j45 / 16;
                                                        byte[] bArr4 = this.t0;
                                                        z13 = z12;
                                                        bArr4[15] = (byte) (j47 & 255);
                                                        bArr4[14] = (byte) ((j47 >> 8) & 255);
                                                        bArr4[c10] = (byte) ((j47 >> 16) & 255);
                                                        bArr4[c11] = (byte) ((j47 >> 24) & 255);
                                                        Utilities.aesCtrDecryptionByteArray(this.D0, this.s0, bArr4, 0, h, 0);
                                                        j14 = h;
                                                    } else {
                                                        j14 = h;
                                                        z13 = z12;
                                                    }
                                                    if (!Arrays.equals(Utilities.o(j14, this.D0), tL_fileHash.hash)) {
                                                        if (v2.a) {
                                                            if (this.V != null) {
                                                                f8.d("invalid cdn hash " + this.V + " id = " + this.V.id + " local_id = " + this.V.local_id + str3 + this.V.access_hash + " volume_id = " + this.V.volume_id + str2 + this.V.secret);
                                                            } else if (this.W != null) {
                                                                f8.d("invalid cdn hash  " + this.W + " id = " + this.r);
                                                            }
                                                        }
                                                        j(0, false);
                                                        this.J0.delete();
                                                        return false;
                                                    }
                                                    this.q0.remove(Long.valueOf(j45));
                                                    c(j44, j44 + 1, this.P, false);
                                                }
                                            }
                                        }
                                    }
                                    z13 = z12;
                                    randomAccessFile = this.R0;
                                    if (randomAccessFile != null) {
                                        randomAccessFile.seek(0L);
                                        this.R0.write(this.i0);
                                    }
                                    if (this.b0 > 0 && this.Y == 1) {
                                        if (this.M == null) {
                                            this.N = new ArrayList(this.M);
                                        }
                                        this.g0.a(this, this.a0, this.b0);
                                    }
                                    z14 = z13;
                                    z15 = z11;
                                }
                            }
                            z10 = true;
                            if (this.a0 < this.b0) {
                            }
                        } else {
                            int i14 = this.j0;
                            if (limit == i14 && ((j40 != j39 && j39 % i14 == 0) || (j40 > 0 && j40 > j39))) {
                                z10 = false;
                            }
                            z10 = true;
                        }
                        z11 = z10;
                        z12 = false;
                        boolean z192 = v2.a;
                        bArr = this.h0;
                        if (bArr != null) {
                        }
                        if (this.n0) {
                        }
                        if (this.M != null) {
                        }
                        this.Q0.getChannel().write(nativeByteBuffer.buffer);
                        ArrayList arrayList2 = this.M;
                        j11 = l7Var.e;
                        j12 = l7Var.e;
                        long j422 = j12 + j38;
                        String str32 = str;
                        c(j11, j422, arrayList2, true);
                        if (this.u0) {
                        }
                        z13 = z12;
                        randomAccessFile = this.R0;
                        if (randomAccessFile != null) {
                        }
                        if (this.b0 > 0) {
                            if (this.M == null) {
                            }
                            this.g0.a(this, this.a0, this.b0);
                        }
                        z14 = z13;
                        z15 = z11;
                    }
                    for (int i15 = 0; i15 < this.I0.size(); i15++) {
                        l7 l7Var2 = (l7) this.I0.get(i15);
                        if (this.M == null) {
                            long j48 = this.a0;
                            j18 = l7Var2.e;
                            if (j48 != j18) {
                            }
                        }
                        this.I0.remove(i15);
                        if (!m(l7Var2, null)) {
                            TLRPC.TL_upload_file tL_upload_file4 = l7Var2.f;
                            if (tL_upload_file4 != null) {
                                tL_upload_file4.disableFree = false;
                                tL_upload_file4.freeResources();
                            } else {
                                TLRPC.TL_upload_webFile tL_upload_webFile4 = l7Var2.g;
                                if (tL_upload_webFile4 != null) {
                                    tL_upload_webFile4.disableFree = false;
                                    tL_upload_webFile4.freeResources();
                                } else {
                                    tL_upload_cdnFile4 = l7Var2.h;
                                    if (tL_upload_cdnFile4 != null) {
                                        tL_upload_cdnFile5 = l7Var2.h;
                                        tL_upload_cdnFile5.disableFree = false;
                                        tL_upload_cdnFile6 = l7Var2.h;
                                        tL_upload_cdnFile6.freeResources();
                                    }
                                }
                            }
                        }
                        if (!z15) {
                            k(0, true, z14);
                            return false;
                        }
                        if (this.Y != 4 && this.Y != 5) {
                            s(l7Var.d);
                            return false;
                        }
                    }
                    if (!z15) {
                    }
                } catch (Exception e) {
                    f8.g(e, ((e instanceof FileNotFoundException) || (e instanceof EOFException) || i0.F1(e)) ? false : true);
                    if (i0.F1(e)) {
                        j(-1, false);
                    } else if (i0.G1(e)) {
                        tz.h(this.L0);
                        j(-1, true);
                    } else {
                        j(0, false);
                    }
                }
            } else {
                if (tL_error.text.contains("LIMIT_INVALID")) {
                    z17 = l7Var.i;
                    if (!z17) {
                        Runnable runnable = l7Var.l;
                        if (runnable != null) {
                            runnable.run();
                        }
                        ArrayList arrayList3 = this.O;
                        j26 = l7Var.e;
                        j27 = l7Var.e;
                        n(j26, j27 + l7Var.c, arrayList3);
                        if (!this.e) {
                            this.e = true;
                            this.j0 = 32768;
                            this.k0 = 4;
                        }
                        s(l7Var.d);
                        return false;
                    }
                }
                if (!tL_error.text.contains("FILE_MIGRATE_")) {
                    if (tL_error.text.contains("OFFSET_INVALID")) {
                        if (this.a0 % this.j0 != 0) {
                            j(0, false);
                            return false;
                        }
                        try {
                            k(0, true, false);
                            return false;
                        } catch (Exception e7) {
                            f8.f(e7);
                            j(0, false);
                            return false;
                        }
                    }
                    if (tL_error.text.contains("RETRY_LIMIT")) {
                        j(2, false);
                        return false;
                    }
                    if (v2.a) {
                        TLRPC.InputFileLocation inputFileLocation = this.V;
                        if (inputFileLocation != null) {
                            if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                                f8.d(tL_error.text + " " + this.V + " peer_did = " + o5.n(((TLRPC.TL_inputPeerPhotoFileLocation) this.V).peer) + " peer_access_hash=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).peer.access_hash + " photo_id=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).photo_id + " big=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).big);
                            } else {
                                f8.d(tL_error.text + " " + this.V + " id = " + this.V.id + " local_id = " + this.V.local_id + " access_hash = " + this.V.access_hash + " volume_id = " + this.V.volume_id + str2 + this.V.secret);
                            }
                        } else if (this.W != null) {
                            f8.d(tL_error.text + " " + this.W + " id = " + this.r);
                        }
                    }
                    j(0, false);
                    return false;
                }
                Scanner scanner = new Scanner(tL_error.text.replace("FILE_MIGRATE_", ""));
                scanner.useDelimiter("");
                try {
                    num = Integer.valueOf(scanner.nextInt());
                } catch (Exception unused) {
                    num = null;
                }
                if (num == null) {
                    j(0, false);
                } else {
                    this.T = num.intValue();
                    this.a0 = 0L;
                    this.Q = 0L;
                    s(l7Var.d);
                }
            }
            return false;
        }
        boolean z21 = v2.a;
        if (this.Y == 3) {
            StringBuilder sb4 = new StringBuilder("trying to write to finished file ");
            sb4.append(this.r);
            sb4.append(" offset ");
            j28 = l7Var.e;
            sb4.append(j28);
            sb4.append(" ");
            sb4.append(this.b0);
            sb4.append(" reqToken=");
            sb4.append(l7Var.a);
            sb4.append(" (state=");
            f8.f(new e8(a1.g.p(sb4, this.Y, ")")));
            return false;
        }
        return false;
    }

    public final void o(long j10) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.x0;
        tL_upload_getCdnFileHashes.offset = j10;
        ConnectionsManager.getInstance(this.R).sendRequest(tL_upload_getCdnFileHashes, new v1(this, 2), null, null, 0, this.T, 1, true);
    }

    public final void p(l7 l7Var) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (this.A0) {
            return;
        }
        e(null, false, false);
        this.A0 = true;
        this.B0 = true;
        Object obj = this.p0;
        if (obj instanceof jj) {
            jj jjVar = (jj) obj;
            if (jjVar.f1() < 0 && (message = jjVar.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.p0 = webPage;
                this.j = false;
            }
        }
        if (v2.a) {
            f8.b("debug_loading: " + this.L0.getName() + " file reference expired ");
        }
        w8.n(this.R).u(new Object[]{this.V, this, l7Var}, this.p0);
    }

    public final void q(boolean z10) {
        if (this.y != z10) {
            if (!z10 || this.b0 > 2097152) {
                f8.d("setIsPreloadVideoOperation " + z10 + " file=" + this.r);
                if (z10 || !this.y) {
                    this.y = z10;
                    return;
                }
                if (this.Y != 3) {
                    if (this.Y == 1) {
                        Utilities.d.c(new h7(this, z10, 1));
                        return;
                    } else {
                        this.y = z10;
                        return;
                    }
                }
                this.y = z10;
                if (this.j0 != 0 && !this.e && !this.j && !this.r0) {
                    t();
                }
                this.Y = 0;
                this.z = false;
                r();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x038b, code lost:
    
        if (r9 != r34.L0.length()) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08cb A[Catch: Exception -> 0x08cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x08cf, blocks: (B:274:0x08ba, B:276:0x08cb), top: B:273:0x08ba }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        long j10;
        String q6;
        String str;
        String str2;
        String str3;
        String q10;
        String q11;
        String r10;
        String q12;
        String str4;
        String str5;
        String str6;
        Object obj;
        boolean exists;
        int i10;
        boolean z10;
        boolean z11;
        boolean[] zArr;
        boolean z12;
        boolean[] zArr2;
        long j11;
        long j12;
        ArrayList arrayList;
        z7 z7Var;
        int i11;
        boolean z13;
        long j13;
        boolean z14;
        int i12;
        boolean z15;
        boolean z16;
        boolean z17;
        RandomAccessFile randomAccessFile;
        String str7;
        final n7 n7Var = this.b;
        final long j14 = this.d;
        final boolean z18 = this.c;
        this.d1 = System.currentTimeMillis();
        u();
        int i13 = 1;
        if (this.j0 == 0) {
            if (this.e) {
                if (v2.a) {
                    f8.b("debug_loading: restart with small chunk");
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
                boolean z19 = this.b0 >= ((long) 10485760);
                this.j0 = z19 ? this.n : 32768;
                this.k0 = z19 ? this.p : this.o;
                t();
            }
        }
        final boolean z20 = this.Y != 0;
        this.Z = false;
        int i14 = 3;
        if (n7Var != null) {
            Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.g7
                @Override // java.lang.Runnable
                public final void run() {
                    m7 m7Var = m7.this;
                    boolean z21 = z18;
                    long j15 = j14;
                    n7 n7Var2 = n7Var;
                    boolean z22 = z20;
                    if (m7Var.m == null) {
                        m7Var.m = new ArrayList();
                    }
                    if (z21) {
                        long j16 = m7Var.j0;
                        long j17 = (j15 / j16) * j16;
                        l7 l7Var = m7Var.f0;
                        if (l7Var != null && l7Var.e != j17) {
                            int i15 = l7Var.a;
                            m7Var.G0.remove(l7Var);
                            i0.g3(new d7(m7Var, i15, 2));
                            long j18 = m7Var.Q;
                            long j19 = m7Var.j0;
                            m7Var.Q = j18 - j19;
                            ArrayList arrayList2 = m7Var.O;
                            long j20 = m7Var.f0.e;
                            m7.n(j20, j19 + j20, arrayList2);
                            if (m7Var.f0.a != 0) {
                                ConnectionsManager.getInstance(m7Var.R).cancelRequest(m7Var.f0.a, true);
                                m7Var.l0--;
                            }
                            boolean z23 = v2.a;
                            i0.a.q(m7Var.f0.e, new StringBuilder("frame get cancel request at offset "));
                            m7Var.f0 = null;
                        }
                        if (m7Var.f0 == null) {
                            m7Var.e0 = j17;
                        }
                    } else {
                        long j21 = m7Var.j0;
                        m7Var.d0 = (j15 / j21) * j21;
                    }
                    if (!m7Var.m.contains(n7Var2)) {
                        m7Var.m.add(n7Var2);
                        f8.d("FileLoadOperation " + m7Var.r + " start, adding stream " + n7Var2);
                    }
                    if (!m7Var.m.isEmpty()) {
                        Utilities.d.a(m7Var.f1);
                    }
                    if (z22) {
                        if (m7Var.t != null) {
                            if (m7Var.h(m7Var.d0, 1L, m7Var.M) == 0 && m7Var.t.get(Long.valueOf(m7Var.d0)) != null) {
                                m7Var.K = true;
                            }
                        }
                        m7Var.s(-1);
                        m7Var.K = false;
                    }
                    if (m7Var.M != null) {
                        m7Var.i();
                    }
                }
            });
        } else if (z20) {
            Utilities.d.c(new b7(this, i14));
        }
        if (z20) {
            return;
        }
        if (this.V == null && this.W == null) {
            boolean z21 = v2.a;
            f8.b("loadOperation: no location, failing");
            j(0, true);
            return;
        }
        long j15 = this.j0;
        this.d0 = (j14 / j15) * j15;
        if (this.o0) {
            long j16 = this.b0;
            if (j16 > 0 && j16 > j15) {
                this.M = new ArrayList();
                this.O = new ArrayList();
            }
        }
        if (this.W != null) {
            String a2 = Utilities.a(this.X.a);
            if (this.n0) {
                q11 = sc.e.A(a2, ".temp.enc");
                str7 = a1.g.r(sc.e.i(a2, "."), this.P0, ".enc");
                if (this.h0 != null) {
                    q12 = sc.e.A(a2, "_64.iv.enc");
                    str5 = str7;
                    j10 = 0;
                }
                q12 = null;
                str5 = str7;
                j10 = 0;
            } else {
                String A = sc.e.A(a2, ".temp");
                StringBuilder i15 = sc.e.i(a2, ".");
                i15.append(this.P0);
                String sb2 = i15.toString();
                if (this.h0 != null) {
                    q12 = sc.e.A(a2, "_64.iv");
                    q11 = A;
                    str7 = sb2;
                    str5 = str7;
                    j10 = 0;
                } else {
                    q11 = A;
                    str7 = sb2;
                    q12 = null;
                    str5 = str7;
                    j10 = 0;
                }
            }
            this.G0 = new ArrayList(this.k0);
            this.H0 = new ArrayList();
            this.I0 = new ArrayList(this.k0 - 1);
            this.Y = 1;
            obj = this.p0;
            if (!(obj instanceof TLRPC.TL_theme)) {
                this.L0 = new File(w0.h(), a1.g.q(new StringBuilder("remote"), ((TLRPC.TL_theme) obj).id, ".attheme"));
            } else if (this.n0) {
                this.L0 = new File(this.T0, str5);
            } else {
                this.L0 = new File(this.T0, this.s);
            }
            exists = this.L0.exists();
            this.O0 = exists;
            if (exists) {
                if (!(this.p0 instanceof TLRPC.TL_theme)) {
                    long j17 = this.b0;
                    if (j17 != j10) {
                        if (!this.a1) {
                        }
                    }
                }
                z7 z7Var2 = this.g0;
                final String file = this.L0.toString();
                final k8 k8Var = z7Var2.e.d;
                k8Var.getClass();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final boolean[] zArr3 = {false};
                final int i16 = 0;
                k8Var.h(new Runnable() { // from class: org.telegram.messenger.h8
                    @Override // java.lang.Runnable
                    public final void run() {
                        CountDownLatch countDownLatch2;
                        switch (i16) {
                            case 0:
                                String str8 = file;
                                boolean[] zArr4 = zArr3;
                                countDownLatch2 = countDownLatch;
                                k8 k8Var2 = k8Var;
                                k8Var2.c();
                                try {
                                    try {
                                        SQLiteCursor queryFinalized = k8Var2.c.queryFinalized("SELECT flags FROM paths WHERE path = '" + str8 + "'", new Object[0]);
                                        if (queryFinalized.next()) {
                                            zArr4[0] = (queryFinalized.intValue(0) & 1) != 0;
                                        }
                                    } finally {
                                    }
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                                return;
                            default:
                                String str9 = file;
                                boolean[] zArr5 = zArr3;
                                countDownLatch2 = countDownLatch;
                                k8 k8Var3 = k8Var;
                                k8Var3.c();
                                try {
                                    try {
                                        if (k8Var3.c.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str9 + "'", new Object[0]).next()) {
                                            zArr5[0] = true;
                                        }
                                    } catch (Exception e7) {
                                        f8.g(e7, true);
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
                    f8.g(e, true);
                }
                if (!zArr3[0]) {
                    if (v2.a) {
                        f8.b("debug_loading: delete existing file cause file size mismatch " + this.L0.getName() + " totalSize=" + this.b0 + " existingFileSize=" + this.L0.length());
                    }
                    z7 z7Var3 = this.g0;
                    final String file2 = this.L0.toString();
                    final k8 k8Var2 = z7Var3.e.d;
                    k8Var2.getClass();
                    final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    final boolean[] zArr4 = {false};
                    final int i17 = 1;
                    k8Var2.h(new Runnable() { // from class: org.telegram.messenger.h8
                        @Override // java.lang.Runnable
                        public final void run() {
                            CountDownLatch countDownLatch22;
                            switch (i17) {
                                case 0:
                                    String str8 = file2;
                                    boolean[] zArr42 = zArr4;
                                    countDownLatch22 = countDownLatch2;
                                    k8 k8Var22 = k8Var2;
                                    k8Var22.c();
                                    try {
                                        try {
                                            SQLiteCursor queryFinalized = k8Var22.c.queryFinalized("SELECT flags FROM paths WHERE path = '" + str8 + "'", new Object[0]);
                                            if (queryFinalized.next()) {
                                                zArr42[0] = (queryFinalized.intValue(0) & 1) != 0;
                                            }
                                        } finally {
                                        }
                                    } catch (Exception e7) {
                                        f8.g(e7, true);
                                    }
                                    return;
                                default:
                                    String str9 = file2;
                                    boolean[] zArr5 = zArr4;
                                    countDownLatch22 = countDownLatch2;
                                    k8 k8Var3 = k8Var2;
                                    k8Var3.c();
                                    try {
                                        try {
                                            if (k8Var3.c.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str9 + "'", new Object[0]).next()) {
                                                zArr5[0] = true;
                                            }
                                        } catch (Exception e72) {
                                            f8.g(e72, true);
                                        }
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                    try {
                        countDownLatch2.await();
                    } catch (InterruptedException e7) {
                        f8.g(e7, true);
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
                    k(1, false, false);
                    j4.w wVar = this.c1;
                    if (wVar != null) {
                        z7 z7Var4 = this.g0;
                        File file3 = this.L0;
                        k8 k8Var3 = z7Var4.e.d;
                        long j18 = wVar.b;
                        int i18 = wVar.c;
                        int i19 = wVar.d;
                        String file4 = file3 != null ? file3.toString() : null;
                        k8Var3.getClass();
                        k8Var3.h(new i8(k8Var3, j18, i18, i19, file4, 0));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    f8.g(e10, false);
                    if (i0.F1(e10)) {
                        z10 = true;
                        LaunchActivity.D(1);
                        i10 = -1;
                        j(-1, true);
                    } else {
                        i10 = -1;
                        z10 = true;
                    }
                    if (!i0.G1(e10)) {
                        j(0, z10);
                        return;
                    } else {
                        tz.h(this.L0);
                        j(i10, z10);
                        return;
                    }
                }
            }
            this.J0 = new File(this.U0, str6);
            if (this.a1) {
                this.K0 = new File(this.U0, sc.e.A(str6, ".gz"));
            }
            if (this.n0) {
                File file5 = new File(w0.b.getCacheDir(), sc.e.A(str5, ".key"));
                try {
                    randomAccessFile = new RandomAccessFile(file5, "rws");
                    long length = file5.length();
                    byte[] bArr = new byte[32];
                    this.s0 = bArr;
                    this.t0 = new byte[16];
                    if (length <= j10 || length % 48 != j10) {
                        SecureRandom secureRandom = Utilities.b;
                        secureRandom.nextBytes(bArr);
                        secureRandom.nextBytes(this.t0);
                        randomAccessFile.write(this.s0);
                        randomAccessFile.write(this.t0);
                        z17 = true;
                    } else {
                        randomAccessFile.read(bArr, 0, 32);
                        randomAccessFile.read(this.t0, 0, 16);
                        z17 = false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z17 = false;
                }
                try {
                    try {
                        randomAccessFile.getChannel().close();
                    } catch (Exception e12) {
                        f8.g(e12, true);
                    }
                    randomAccessFile.close();
                    z11 = z17;
                } catch (Exception e13) {
                    e = e13;
                    if (i0.F1(e)) {
                        LaunchActivity.D(1);
                        f8.g(e, false);
                        z11 = z17;
                    } else if (i0.G1(e)) {
                        tz.h(this.L0);
                        f8.g(e, false);
                        z11 = z17;
                    } else {
                        f8.g(e, true);
                        z11 = z17;
                    }
                    zArr = new boolean[]{false};
                    long j19 = 1;
                    if (this.B) {
                    }
                    z12 = z11;
                    zArr2 = zArr;
                    j11 = 1;
                    j12 = 2;
                    if (str4 != null) {
                    }
                    if (this.X0 != null) {
                    }
                    if (this.J0.exists()) {
                    }
                    arrayList = this.M;
                    if (arrayList != null) {
                    }
                    if (v2.a) {
                    }
                    if (str2 != null) {
                    }
                    if (!this.y) {
                        this.N = new ArrayList(this.M);
                    }
                    z7Var = this.g0;
                    if (z7Var != null) {
                    }
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.J0, "rws");
                    this.Q0 = randomAccessFile2;
                    j13 = this.a0;
                    if (j13 != 0) {
                    }
                    z13 = true;
                    i11 = 0;
                    if (this.Q0 != null) {
                    }
                }
            } else {
                z11 = false;
            }
            zArr = new boolean[]{false};
            long j192 = 1;
            if (this.B || q10 == null) {
                z12 = z11;
                zArr2 = zArr;
                j11 = 1;
                j12 = 2;
            } else {
                this.A = new File(this.U0, q10);
                try {
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.A, "rws");
                    this.v = randomAccessFile3;
                    long length2 = randomAccessFile3.length();
                    this.w = 1;
                    if (length2 > 1) {
                        zArr[0] = this.v.readByte() != 0;
                        long j20 = 1;
                        z11 = z11;
                        while (j20 < length2) {
                            if (length2 - j20 < 8) {
                                break;
                            }
                            long readLong = this.v.readLong();
                            if (length2 - (j20 + 8) < 8 || readLong < j10) {
                                break;
                            }
                            j12 = 2;
                            try {
                                if (readLong > this.b0) {
                                    z14 = z11;
                                    i12 = i13;
                                    zArr2 = zArr;
                                    j11 = j192;
                                    break;
                                }
                                long readLong2 = this.v.readLong();
                                j11 = j192;
                                long j21 = j20 + 16;
                                if (length2 - j21 < readLong2) {
                                    z14 = z11;
                                    i12 = i13;
                                    zArr2 = zArr;
                                    break;
                                }
                                try {
                                    zArr2 = zArr;
                                    if (readLong2 <= this.j0) {
                                        try {
                                            j7 j7Var = new j7(j21, readLong2);
                                            long j22 = j21 + readLong2;
                                            this.v.seek(j22);
                                            if (length2 - j22 >= 24) {
                                                long readLong3 = this.v.readLong();
                                                this.E = readLong3;
                                                if (readLong3 != j10) {
                                                    i12 = i13;
                                                    try {
                                                        z14 = z11;
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        z14 = z11;
                                                        f8.g(e, false);
                                                        z15 = z14;
                                                        z12 = z15;
                                                        if (!this.y) {
                                                        }
                                                        if (str4 != null) {
                                                        }
                                                        if (this.X0 != null) {
                                                        }
                                                        if (this.J0.exists()) {
                                                        }
                                                        arrayList = this.M;
                                                        if (arrayList != null) {
                                                        }
                                                        if (v2.a) {
                                                        }
                                                        if (str2 != null) {
                                                        }
                                                        if (!this.y) {
                                                        }
                                                        z7Var = this.g0;
                                                        if (z7Var != null) {
                                                        }
                                                        RandomAccessFile randomAccessFile22 = new RandomAccessFile(this.J0, "rws");
                                                        this.Q0 = randomAccessFile22;
                                                        j13 = this.a0;
                                                        if (j13 != 0) {
                                                        }
                                                        z13 = true;
                                                        i11 = 0;
                                                        if (this.Q0 != null) {
                                                        }
                                                    }
                                                    try {
                                                        this.G = this.C > this.b0 / 2 ? 2 : i12 == true ? 1 : 0;
                                                        this.F = readLong3;
                                                        z16 = z14;
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        f8.g(e, false);
                                                        z15 = z14;
                                                        z12 = z15;
                                                        if (!this.y) {
                                                        }
                                                        if (str4 != null) {
                                                        }
                                                        if (this.X0 != null) {
                                                        }
                                                        if (this.J0.exists()) {
                                                        }
                                                        arrayList = this.M;
                                                        if (arrayList != null) {
                                                        }
                                                        if (v2.a) {
                                                        }
                                                        if (str2 != null) {
                                                        }
                                                        if (!this.y) {
                                                        }
                                                        z7Var = this.g0;
                                                        if (z7Var != null) {
                                                        }
                                                        RandomAccessFile randomAccessFile222 = new RandomAccessFile(this.J0, "rws");
                                                        this.Q0 = randomAccessFile222;
                                                        j13 = this.a0;
                                                        if (j13 != 0) {
                                                        }
                                                        z13 = true;
                                                        i11 = 0;
                                                        if (this.Q0 != null) {
                                                        }
                                                    }
                                                } else {
                                                    z16 = z11;
                                                    i12 = i13;
                                                }
                                                this.C = this.v.readLong();
                                                this.D = this.v.readLong();
                                                long j23 = j22 + 24;
                                                if (this.t == null) {
                                                    this.t = new HashMap();
                                                }
                                                if (this.u == null) {
                                                    this.u = new HashMap();
                                                }
                                                this.t.put(Long.valueOf(readLong), j7Var);
                                                this.u.put(Long.valueOf(readLong), Integer.valueOf(i12));
                                                this.x = (int) (this.x + readLong2);
                                                this.w = (int) (readLong2 + 36 + this.w);
                                                zArr = zArr2;
                                                j192 = j11;
                                                i13 = i12;
                                                j20 = j23;
                                                z11 = z16;
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            z14 = z11;
                                            i12 = i13;
                                        }
                                    }
                                    z14 = z11;
                                    i12 = i13;
                                    break;
                                } catch (Exception e17) {
                                    e = e17;
                                    z14 = z11;
                                    i12 = i13;
                                    zArr2 = zArr;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                z14 = z11;
                                i12 = i13;
                                zArr2 = zArr;
                                j11 = j192;
                            }
                        }
                    }
                    z14 = z11;
                    i12 = i13;
                    zArr2 = zArr;
                    j11 = j192;
                    j12 = 2;
                    this.v.seek(this.w);
                    z15 = z14;
                } catch (Exception e19) {
                    e = e19;
                    z14 = z11;
                    i12 = i13;
                    zArr2 = zArr;
                    j11 = j192;
                    j12 = 2;
                }
                z12 = z15;
                if (!this.y) {
                    z12 = z15;
                    if (this.t == null) {
                        this.A = null;
                        try {
                            RandomAccessFile randomAccessFile4 = this.v;
                            z12 = z15;
                            if (randomAccessFile4 != null) {
                                try {
                                    randomAccessFile4.getChannel().close();
                                } catch (Exception e20) {
                                    f8.g(e20, i12);
                                }
                                this.v.close();
                                this.v = null;
                                z12 = z15;
                            }
                        } catch (Exception e21) {
                            f8.g(e21, true);
                            z12 = z15;
                        }
                    }
                }
            }
            if (str4 != null) {
                this.N0 = new File(this.U0, str4);
                if (!this.J0.exists()) {
                    this.N0.delete();
                }
                try {
                    RandomAccessFile randomAccessFile5 = new RandomAccessFile(this.N0, "rws");
                    this.S0 = randomAccessFile5;
                    long length3 = randomAccessFile5.length();
                    if (length3 % 8 == 4) {
                        int readInt = this.S0.readInt();
                        if (readInt <= (length3 - 4) / j12) {
                            for (int i20 = 0; i20 < readInt; i20++) {
                                long readLong4 = this.S0.readLong();
                                long readLong5 = this.S0.readLong();
                                this.M.add(new k7(readLong4, readLong5));
                                this.O.add(new k7(readLong4, readLong5));
                            }
                        }
                    }
                } catch (Exception e22) {
                    Typeface typeface = i0.a;
                    f8.g(e22, !((e22 instanceof FileNotFoundException) || (e22 instanceof EOFException)));
                }
            }
            if (this.X0 != null) {
                k8 k8Var4 = b8.G(this.R).d;
                File file6 = this.N0;
                j8 j8Var = this.X0;
                k8Var4.getClass();
                int i21 = 24;
                if (file6 != null && j8Var != null) {
                    k8Var4.h(new mg(k8Var4, file6, j8Var, i21));
                }
                k8 k8Var5 = b8.G(this.R).d;
                File file7 = this.J0;
                j8 j8Var2 = this.X0;
                k8Var5.getClass();
                if (file7 != null && j8Var2 != null) {
                    k8Var5.h(new mg(k8Var5, file7, j8Var2, i21));
                }
            }
            if (this.J0.exists()) {
                ArrayList arrayList2 = this.M;
                if (arrayList2 != null && arrayList2.isEmpty()) {
                    this.M.add(new k7(0L, this.b0));
                    this.O.add(new k7(0L, this.b0));
                }
            } else if (z12) {
                this.J0.delete();
            } else {
                long length4 = this.J0.length();
                if (str2 == null || length4 % this.j0 == j10) {
                    long j24 = j10;
                    long length5 = this.J0.length();
                    int i22 = this.j0;
                    long j25 = i22;
                    long j26 = length5 / j25;
                    if ((length5 ^ j25) < j24 && j25 * j26 != length5) {
                        j26 -= j11;
                    }
                    long j27 = j26 * i22;
                    this.a0 = j27;
                    this.Q = j27;
                } else {
                    this.Q = j10;
                }
                ArrayList arrayList3 = this.M;
                if (arrayList3 != null && arrayList3.isEmpty()) {
                    this.M.add(new k7(this.a0, this.b0));
                    this.O.add(new k7(this.a0, this.b0));
                }
            }
            arrayList = this.M;
            if (arrayList != null) {
                this.a0 = this.b0;
                int size = arrayList.size();
                for (int i23 = 0; i23 < size; i23++) {
                    k7 k7Var = (k7) this.M.get(i23);
                    this.a0 -= k7Var.b - k7Var.a;
                }
                this.Q = this.a0;
            }
            if (v2.a) {
                if (this.y) {
                    f8.b("start preloading file to temp = " + this.J0);
                } else {
                    StringBuilder sb3 = new StringBuilder("start loading file to temp = ");
                    sb3.append(this.J0);
                    sb3.append(" final = ");
                    sb3.append(this.L0);
                    sb3.append(" priority");
                    i0.a.p(this.W0, sb3);
                }
            }
            if (str2 != null) {
                this.M0 = new File(this.U0, str2);
                try {
                    this.R0 = new RandomAccessFile(this.M0, "rws");
                    if (this.a0 != 0 && !z12) {
                        long length6 = this.M0.length();
                        if (length6 <= 0 || length6 % 64 != 0) {
                            this.a0 = 0L;
                            this.Q = 0L;
                        } else {
                            this.R0.read(this.i0, 0, 64);
                        }
                    }
                } catch (Exception e23) {
                    this.a0 = 0L;
                    this.Q = 0L;
                    if (i0.F1(e23)) {
                        LaunchActivity.D(1);
                        f8.g(e23, false);
                    } else if (i0.G1(e23)) {
                        tz.h(this.L0);
                        f8.g(e23, false);
                    } else {
                        f8.g(e23, true);
                    }
                }
            }
            if (!this.y && this.a0 != 0 && this.b0 > 0 && this.M != null) {
                this.N = new ArrayList(this.M);
            }
            z7Var = this.g0;
            if (z7Var != null) {
                long j28 = this.a0;
                long j29 = this.b0;
                if (j28 != j29 && j29 > 0) {
                    z7Var.a(this, j28, j29);
                }
            }
            try {
                RandomAccessFile randomAccessFile2222 = new RandomAccessFile(this.J0, "rws");
                this.Q0 = randomAccessFile2222;
                j13 = this.a0;
                if (j13 != 0) {
                    randomAccessFile2222.seek(j13);
                }
                z13 = true;
                i11 = 0;
            } catch (Exception e24) {
                i11 = 0;
                f8.g(e24, false);
                if (i0.F1(e24)) {
                    LaunchActivity.D(1);
                    j(-1, true);
                    return;
                }
                z13 = true;
                if (i0.G1(e24)) {
                    tz.h(this.L0);
                    f8.g(e24, false);
                    j(-1, true);
                    return;
                }
            }
            if (this.Q0 != null) {
                j(i11, z13);
                return;
            } else {
                this.S = z13;
                Utilities.d.c(new t6(3, this, zArr2));
                return;
            }
        }
        TLRPC.InputFileLocation inputFileLocation = this.V;
        long j30 = inputFileLocation.volume_id;
        j10 = 0;
        if (j30 == 0 || inputFileLocation.local_id == 0) {
            if (this.T == 0 || inputFileLocation.id == 0) {
                j(0, true);
                return;
            }
            if (this.n0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.T);
                sb4.append("_");
                q11 = a1.g.q(sb4, this.V.id, ".temp.enc");
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.T);
                sb5.append("_");
                sb5.append(this.V.id);
                r10 = a1.g.r(sb5, this.P0, ".enc");
                if (this.h0 != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.T);
                    sb6.append("_");
                    q12 = a1.g.q(sb6, this.V.id, "_64.iv.enc");
                    str5 = r10;
                }
                str5 = r10;
                q10 = null;
                str4 = null;
                str6 = q11;
                str2 = null;
                this.G0 = new ArrayList(this.k0);
                this.H0 = new ArrayList();
                this.I0 = new ArrayList(this.k0 - 1);
                this.Y = 1;
                obj = this.p0;
                if (!(obj instanceof TLRPC.TL_theme)) {
                }
                exists = this.L0.exists();
                this.O0 = exists;
                if (exists) {
                }
                if (!exists) {
                }
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(this.T);
                sb7.append("_");
                q6 = a1.g.q(sb7, this.V.id, ".temp");
                str = this.T + "_" + this.V.id + this.P0;
                if (this.h0 != null) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(this.T);
                    sb8.append("_");
                    str2 = a1.g.q(sb8, this.V.id, "_64.iv");
                } else {
                    str2 = null;
                }
                if (this.M != null) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(this.T);
                    sb9.append("_");
                    str3 = a1.g.q(sb9, this.V.id, "_64.pt");
                } else {
                    str3 = null;
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(this.T);
                sb10.append("_");
                q10 = a1.g.q(sb10, this.V.id, "_64.preload");
                str4 = str3;
                str5 = str;
                str6 = q6;
                this.G0 = new ArrayList(this.k0);
                this.H0 = new ArrayList();
                this.I0 = new ArrayList(this.k0 - 1);
                this.Y = 1;
                obj = this.p0;
                if (!(obj instanceof TLRPC.TL_theme)) {
                }
                exists = this.L0.exists();
                this.O0 = exists;
                if (exists) {
                }
                if (!exists) {
                }
            }
        } else {
            int i24 = this.T;
            if (i24 == Integer.MIN_VALUE || j30 == -2147483648L || i24 == 0) {
                j(0, true);
                return;
            }
            if (this.n0) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(this.V.volume_id);
                sb11.append("_");
                q11 = a1.g.p(sb11, this.V.local_id, ".temp.enc");
                StringBuilder sb12 = new StringBuilder();
                sb12.append(this.V.volume_id);
                sb12.append("_");
                sb12.append(this.V.local_id);
                sb12.append(".");
                r10 = a1.g.r(sb12, this.P0, ".enc");
                if (this.h0 != null) {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(this.V.volume_id);
                    sb13.append("_");
                    q12 = a1.g.p(sb13, this.V.local_id, "_64.iv.enc");
                    str5 = r10;
                }
                str5 = r10;
                q10 = null;
                str4 = null;
                str6 = q11;
                str2 = null;
                this.G0 = new ArrayList(this.k0);
                this.H0 = new ArrayList();
                this.I0 = new ArrayList(this.k0 - 1);
                this.Y = 1;
                obj = this.p0;
                if (!(obj instanceof TLRPC.TL_theme)) {
                }
                exists = this.L0.exists();
                this.O0 = exists;
                if (exists) {
                }
                if (!exists) {
                }
            } else {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(this.V.volume_id);
                sb14.append("_");
                q6 = a1.g.p(sb14, this.V.local_id, ".temp");
                str = this.V.volume_id + "_" + this.V.local_id + "." + this.P0;
                if (this.h0 != null) {
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(this.V.volume_id);
                    sb15.append("_");
                    str2 = a1.g.p(sb15, this.V.local_id, "_64.iv");
                } else {
                    str2 = null;
                }
                if (this.M != null) {
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append(this.V.volume_id);
                    sb16.append("_");
                    str3 = a1.g.p(sb16, this.V.local_id, "_64.pt");
                } else {
                    str3 = null;
                }
                StringBuilder sb17 = new StringBuilder();
                sb17.append(this.V.volume_id);
                sb17.append("_");
                q10 = a1.g.p(sb17, this.V.local_id, "_64.preload");
                str4 = str3;
                str5 = str;
                str6 = q6;
                this.G0 = new ArrayList(this.k0);
                this.H0 = new ArrayList();
                this.I0 = new ArrayList(this.k0 - 1);
                this.Y = 1;
                obj = this.p0;
                if (!(obj instanceof TLRPC.TL_theme)) {
                }
                exists = this.L0.exists();
                this.O0 = exists;
                if (exists) {
                }
                if (!exists) {
                }
            }
        }
        q10 = null;
        str4 = null;
        str6 = q11;
        str2 = q12;
        this.G0 = new ArrayList(this.k0);
        this.H0 = new ArrayList();
        this.I0 = new ArrayList(this.k0 - 1);
        this.Y = 1;
        obj = this.p0;
        if (!(obj instanceof TLRPC.TL_theme)) {
        }
        exists = this.L0.exists();
        this.O0 = exists;
        if (exists) {
        }
        if (!exists) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        if ("update".equals(r2) != false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(int i10) {
        int i11;
        int max;
        int i12;
        long j10;
        int i13;
        int i14;
        long j11;
        long j12;
        long j13;
        TLObject tLObject;
        int i15;
        int i16;
        HashMap hashMap;
        j7 j7Var;
        ArrayList arrayList;
        int i17;
        Pair m10;
        boolean w9;
        Pair m11;
        m7 m7Var = this;
        Utilities.d.a(m7Var.h);
        boolean z10 = v2.a;
        int i18 = 1;
        if (m7Var.Y == 5) {
            m7Var.Y = 1;
        }
        if (m7Var.Z || m7Var.z0 || m7Var.Y != 1 || m7Var.A0) {
            return;
        }
        long j14 = 0;
        if (m7Var.j || m7Var.e0 != 0 || m7Var.K || m7Var.I0.size() + m7Var.G0.size() < m7Var.k0) {
            if (m7Var.y) {
                if (m7Var.Q > 2097152) {
                    return;
                }
                if (m7Var.G != 0 && m7Var.G0.size() > 0) {
                    return;
                }
            }
            ?? r10 = 0;
            if (m7Var.j) {
                max = Math.max(0, m7Var.k0 - m7Var.G0.size());
            } else {
                if (m7Var.e0 != 0 || m7Var.K || ((m7Var.y && m7Var.G == 0) || m7Var.b0 <= 0)) {
                    i11 = 1;
                    if (!m7Var.B0) {
                        w8 n10 = w8.n(m7Var.R);
                        Object obj = m7Var.p0;
                        Object[] objArr = {m7Var.V, m7Var};
                        Pair p5 = w8.p(objArr, obj);
                        if (p5 != null) {
                            TLRPC.InputFileLocation inputFileLocation = (TLRPC.InputFileLocation) p5.first;
                            String str = (String) p5.second;
                            String o10 = w8.o(obj);
                            if (o10 != null) {
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
                                                }
                                            }
                                        }
                                    }
                                    str = str3;
                                }
                                t8 b10 = n10.b(str);
                                if (b10 == null || (m11 = n10.m(inputFileLocation, o10, b10.a, objArr)) == null) {
                                    t8 b11 = n10.b(o10);
                                    if (b11 != null && (m10 = n10.m(inputFileLocation, null, b11.a, objArr)) != null) {
                                        w9 = w8.w((byte[]) m10.first, (TLRPC.InputFileLocation) m10.second, inputFileLocation, objArr);
                                    }
                                } else {
                                    w9 = w8.w((byte[]) m11.first, (TLRPC.InputFileLocation) m11.second, inputFileLocation, objArr);
                                }
                                if (w9) {
                                    f8.b(m7Var.r + " before download updated file ref from file ref cache!");
                                }
                            }
                        }
                        w9 = false;
                        if (w9) {
                        }
                    }
                    i12 = 0;
                    m7 m7Var2 = m7Var;
                    while (i12 < i11) {
                        if (!m7Var2.y) {
                            j10 = j14;
                            ArrayList arrayList2 = m7Var2.O;
                            if (arrayList2 != null) {
                                long j15 = m7Var2.e0;
                                if (j15 == j10) {
                                    j15 = m7Var2.d0;
                                }
                                int size = arrayList2.size();
                                int i19 = r10;
                                long j16 = Long.MAX_VALUE;
                                long j17 = Long.MAX_VALUE;
                                while (true) {
                                    if (i19 >= size) {
                                        i13 = i18;
                                        i14 = i11;
                                        j12 = Long.MAX_VALUE;
                                        j11 = j16;
                                        break;
                                    }
                                    j12 = Long.MAX_VALUE;
                                    k7 k7Var = (k7) m7Var2.O.get(i19);
                                    if (j15 != j10) {
                                        i14 = i11;
                                        long j18 = k7Var.a;
                                        i13 = i18;
                                        j13 = j16;
                                        if (j18 <= j15 && k7Var.b > j15) {
                                            j11 = j15;
                                            j17 = Long.MAX_VALUE;
                                            break;
                                        } else if (j15 < j18 && j18 < j13) {
                                            j16 = j18;
                                            j17 = Math.min(j17, k7Var.a);
                                            i19++;
                                            i11 = i14;
                                            i18 = i13;
                                        }
                                    } else {
                                        i13 = i18;
                                        j13 = j16;
                                        i14 = i11;
                                    }
                                    j16 = j13;
                                    j17 = Math.min(j17, k7Var.a);
                                    i19++;
                                    i11 = i14;
                                    i18 = i13;
                                }
                                if (j11 == j12) {
                                    if (j17 == j12) {
                                        boolean z11 = v2.a;
                                        return;
                                    }
                                    j11 = j17;
                                }
                            } else {
                                i13 = i18;
                                i14 = i11;
                                j11 = m7Var2.Q;
                            }
                        } else {
                            if (m7Var2.G != 0 && m7Var2.F <= j14) {
                                boolean z12 = v2.a;
                                return;
                            }
                            j11 = m7Var2.C;
                            if (j11 == -1) {
                                int i20 = (TLObject.FLAG_21 / m7Var2.j0) + 2;
                                long j19 = j14;
                                while (true) {
                                    if (i20 == 0) {
                                        j10 = j14;
                                        j11 = j19;
                                        break;
                                    }
                                    if (!m7Var2.u.containsKey(Long.valueOf(j19))) {
                                        j11 = j19;
                                        i17 = i18;
                                        j10 = j14;
                                        break;
                                    }
                                    long j20 = m7Var2.j0;
                                    j19 += j20;
                                    long j21 = m7Var2.b0;
                                    if (j19 > j21) {
                                        j11 = j19;
                                        j10 = j14;
                                        break;
                                    }
                                    long j22 = j14;
                                    if (m7Var2.G == 2 && j19 == r1 * 8) {
                                        j19 = ((j21 - 1048576) / j20) * j20;
                                    }
                                    i20--;
                                    j14 = j22;
                                }
                                i17 = r10;
                                if (i17 == 0 && m7Var2.G0.isEmpty()) {
                                    m7Var2.k(r10, r10, r10);
                                }
                            } else {
                                j10 = j14;
                            }
                            if (m7Var2.u == null) {
                                m7Var2.u = new HashMap();
                            }
                            m7Var2.u.put(Long.valueOf(j11), Integer.valueOf(i18));
                            boolean z13 = v2.a;
                            StringBuilder s10 = a1.g.s(j11, "start next preload from ", " size ");
                            s10.append(m7Var2.b0);
                            s10.append(" for ");
                            s10.append(m7Var2.A);
                            f8.b(s10.toString());
                            m7Var2.F -= m7Var2.j0;
                            i13 = i18;
                            i14 = i11;
                        }
                        int i21 = m7Var2.J;
                        if (i21 > 0 && j11 >= i21) {
                            if (((!m7Var2.j || m7Var2.W0 >= 3) ? 0 : i13) != 0) {
                                boolean z14 = v2.a;
                                return;
                            }
                        }
                        long j23 = m7Var2.b0;
                        if (j23 > j10 && j11 > j10 && j11 >= j23) {
                            boolean z15 = v2.a;
                            return;
                        }
                        if (!m7Var2.y && (arrayList = m7Var2.O) != null) {
                            m7Var2.c(j11, m7Var2.j0 + j11, arrayList, false);
                            boolean z16 = v2.a;
                        }
                        long j24 = m7Var2.b0;
                        boolean z17 = (j24 <= j10 || i12 == i14 + (-1) || (j24 > j10 && ((long) m7Var2.j0) + j11 >= j24)) ? i13 : 0;
                        int i22 = i10 == -1 ? ((m7Var2.l0 & (m7Var2.g - 1)) << 16) | 2 : i10;
                        int i23 = m7Var2.V0 ? 32 : 0;
                        if (m7Var2.f) {
                            i23 = j24 < 20480 ? i23 | 393216 : 262144 | i23;
                        }
                        if (m7Var2.u0) {
                            TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                            tL_upload_getCdnFile.file_token = m7Var2.x0;
                            tL_upload_getCdnFile.offset = j11;
                            tL_upload_getCdnFile.limit = m7Var2.j0;
                            i23 |= 1;
                            tLObject = tL_upload_getCdnFile;
                        } else if (m7Var2.W != null) {
                            TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                            tL_upload_getWebFile.location = m7Var2.W;
                            tL_upload_getWebFile.offset = (int) j11;
                            tL_upload_getWebFile.limit = m7Var2.j0;
                            tLObject = tL_upload_getWebFile;
                        } else {
                            TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                            tL_upload_getFile.location = m7Var2.V;
                            tL_upload_getFile.offset = j11;
                            tL_upload_getFile.limit = m7Var2.j0;
                            tL_upload_getFile.cdn_supported = i13;
                            tLObject = tL_upload_getFile;
                        }
                        int i24 = i23;
                        TLObject tLObject2 = tLObject;
                        m7Var2.Q += m7Var2.j0;
                        l7 l7Var = new l7();
                        m7Var2.G0.add(l7Var);
                        l7Var.e = j11;
                        l7Var.c = m7Var2.j0;
                        l7Var.i = m7Var2.e;
                        l7Var.d = i22;
                        if (!m7Var2.y && m7Var2.B && m7Var2.v != null && (hashMap = m7Var2.t) != null && (j7Var = (j7) hashMap.get(Long.valueOf(j11))) != null) {
                            l7Var.f = new TLRPC.TL_upload_file();
                            try {
                                boolean z18 = v2.a;
                            } catch (Exception unused) {
                            }
                            if (j7Var.b > 2147483647L) {
                                throw new RuntimeException("cast long to integer");
                            }
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) j7Var.b);
                            m7Var2.v.seek(j7Var.a);
                            m7Var2.v.getChannel().read(nativeByteBuffer.buffer);
                            nativeByteBuffer.buffer.position(0);
                            l7Var.f.bytes = nativeByteBuffer;
                            Utilities.d.c(new e7(m7Var2, l7Var, 1));
                            j14 = j10;
                            i15 = 0;
                            i16 = 1;
                            i12++;
                            r10 = i15;
                            i11 = i14;
                            i18 = i16;
                            m7Var2 = m7Var2;
                        }
                        if (m7Var2.e0 != j10) {
                            boolean z19 = v2.a;
                            i0.a.q(m7Var2.e0, new StringBuilder("frame get offset = "));
                            j14 = j10;
                            m7Var2.e0 = j14;
                            m7Var2.f0 = l7Var;
                        } else {
                            j14 = j10;
                        }
                        TLRPC.InputFileLocation inputFileLocation2 = m7Var2.V;
                        if ((inputFileLocation2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) && ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation2).photo_id == j14) {
                            m7Var2.p(l7Var);
                            i15 = 0;
                            i16 = 1;
                            i12++;
                            r10 = i15;
                            i11 = i14;
                            i18 = i16;
                            m7Var2 = m7Var2;
                        } else {
                            l7Var.i = m7Var2.e;
                            if (v2.a) {
                                l7Var.b = System.currentTimeMillis();
                            }
                            int i25 = i24 | 2048;
                            int i26 = m7Var2.u0 ? m7Var2.y0 : m7Var2.T;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m7Var2.R);
                            int i27 = i22;
                            Object obj2 = m7Var2;
                            m7Var2 = obj2;
                            int i28 = i26;
                            int sendRequestSync = connectionsManager.sendRequestSync(tLObject2, new c7(i26, i27, 0, obj2, l7Var, tLObject2), null, null, i25, i28, i27, z17);
                            l7Var.a = sendRequestSync;
                            if (v2.a) {
                                StringBuilder sb2 = new StringBuilder("debug_loading: ");
                                sb2.append(m7Var2.L0.getName());
                                sb2.append(" dc=");
                                sb2.append(i28);
                                sb2.append(" send reqId ");
                                sb2.append(l7Var.a);
                                sb2.append(" offset=");
                                sb2.append(l7Var.e);
                                sb2.append(" conType=");
                                sb2.append(i27);
                                sb2.append(" priority=");
                                i0.a.p(m7Var2.W0, sb2);
                            }
                            i15 = 0;
                            i0.g3(new d7(m7Var2, sendRequestSync, i15));
                            i16 = 1;
                            m7Var2.l0++;
                            i12++;
                            r10 = i15;
                            i11 = i14;
                            i18 = i16;
                            m7Var2 = m7Var2;
                        }
                    }
                }
                max = Math.max(0, (m7Var.k0 - m7Var.G0.size()) - (m7Var.f ? m7Var.I0.size() : 0));
            }
            i11 = max;
            if (!m7Var.B0) {
            }
            i12 = 0;
            m7 m7Var22 = m7Var;
            while (i12 < i11) {
            }
        }
    }

    public final void t() {
        boolean z10 = !vp.r1(this.R).G3 && this.b0 > 0 && this.h0 == null && !this.n0 && !this.y && this.J == 0;
        this.f = z10;
        if (z10) {
            boolean q6 = d20.i(this.R).q();
            this.g = q6 ? 8 : 2;
            this.k0 = ((q6 ? 16 : 2) * TLObject.FLAG_20) / this.j0;
        }
    }

    public final void u() {
        if ((this.J > 0 || vp.r1(this.R).F3) && !this.e) {
            this.n = TLObject.FLAG_19;
            this.o = 8;
            this.p = 8;
        } else {
            this.n = 131072;
            this.o = 4;
            this.p = 4;
        }
        if (this.j) {
            this.n = 131072;
            this.p = 8;
        }
        this.q = (int) (2097152000 / this.n);
    }

    public m7(pw pwVar) {
        this.g = 2;
        this.h = new b7(this, 0);
        this.n = 131072;
        this.o = 4;
        this.p = 4;
        this.q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f1 = new b7(this, 5);
        u();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.V = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = pwVar.b;
        tL_inputSecureFileLocation.id = tL_secureFile.id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.T = tL_secureFile.dc_id;
        this.b0 = tL_secureFile.size;
        this.o0 = true;
        this.b1 = 67108864;
        this.P0 = ".jpg";
    }

    public m7(int i10, b30 b30Var) {
        this.g = 2;
        this.h = new b7(this, 0);
        this.n = 131072;
        this.o = 4;
        this.p = 4;
        this.q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f1 = new b7(this, 5);
        u();
        this.R = i10;
        this.X = b30Var;
        this.W = b30Var.b;
        this.b0 = b30Var.d;
        int i11 = vp.r1(i10).P3;
        this.T = i11;
        this.U = i11;
        String H = b8.H(b30Var.e);
        if (b30Var.e.startsWith("image/")) {
            this.b1 = 16777216;
        } else if (b30Var.e.equals("audio/ogg")) {
            this.b1 = ConnectionsManager.FileTypeAudio;
        } else if (b30Var.e.startsWith("video/")) {
            this.b1 = 33554432;
        } else {
            this.b1 = 67108864;
        }
        this.o0 = true;
        this.P0 = hc.B(b30Var.a, H);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x013d A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:8:0x0050, B:11:0x0062, B:12:0x00e6, B:14:0x00f0, B:18:0x00fc, B:20:0x0106, B:22:0x0110, B:23:0x0118, B:25:0x0120, B:28:0x012a, B:29:0x0133, B:31:0x013d, B:32:0x0162, B:34:0x016a, B:39:0x0142, B:41:0x014c, B:43:0x0150, B:46:0x0159, B:47:0x015e, B:48:0x0131, B:50:0x008a, B:52:0x008e, B:54:0x00a5, B:55:0x00a9, B:57:0x00ba, B:61:0x00c4, B:59:0x00d3, B:62:0x00d6, B:64:0x00da, B:66:0x00de, B:68:0x00e2), top: B:7:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #0 {Exception -> 0x0087, blocks: (B:8:0x0050, B:11:0x0062, B:12:0x00e6, B:14:0x00f0, B:18:0x00fc, B:20:0x0106, B:22:0x0110, B:23:0x0118, B:25:0x0120, B:28:0x012a, B:29:0x0133, B:31:0x013d, B:32:0x0162, B:34:0x016a, B:39:0x0142, B:41:0x014c, B:43:0x0150, B:46:0x0159, B:47:0x015e, B:48:0x0131, B:50:0x008a, B:52:0x008e, B:54:0x00a5, B:55:0x00a9, B:57:0x00ba, B:61:0x00c4, B:59:0x00d3, B:62:0x00d6, B:64:0x00da, B:66:0x00de, B:68:0x00e2), top: B:7:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142 A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:8:0x0050, B:11:0x0062, B:12:0x00e6, B:14:0x00f0, B:18:0x00fc, B:20:0x0106, B:22:0x0110, B:23:0x0118, B:25:0x0120, B:28:0x012a, B:29:0x0133, B:31:0x013d, B:32:0x0162, B:34:0x016a, B:39:0x0142, B:41:0x014c, B:43:0x0150, B:46:0x0159, B:47:0x015e, B:48:0x0131, B:50:0x008a, B:52:0x008e, B:54:0x00a5, B:55:0x00a9, B:57:0x00ba, B:61:0x00c4, B:59:0x00d3, B:62:0x00d6, B:64:0x00da, B:66:0x00de, B:68:0x00e2), top: B:7:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m7(Object obj, TLRPC.Document document) {
        boolean z10;
        long j10;
        String B;
        int lastIndexOf;
        this.g = 2;
        this.h = new b7(this, 0);
        this.n = 131072;
        this.o = 4;
        this.p = 4;
        this.q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f1 = new b7(this, 5);
        this.k = jj.K4(document);
        if (document != null && !jj.N2(document)) {
            "application/x-tgwallpattern".equals(document.mime_type);
        }
        u();
        try {
            this.p0 = obj;
            this.j = obj instanceof TL_stories.TL_storyItem;
            this.X0 = b8.E(obj);
            if (document instanceof TLRPC.TL_documentEncrypted) {
                TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
                this.V = tL_inputEncryptedFileLocation;
                tL_inputEncryptedFileLocation.id = document.id;
                tL_inputEncryptedFileLocation.access_hash = document.access_hash;
                int i10 = document.dc_id;
                this.T = i10;
                this.U = i10;
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
                int i11 = document.dc_id;
                this.T = i11;
                this.U = i11;
                this.o0 = true;
                int size = document.attributes.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    if (document.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                        this.B = true;
                        this.J = document.attributes.get(i12).preload_prefix_size;
                        break;
                    }
                    i12++;
                }
                if (this.j && this.B && this.J <= 0) {
                    this.J = TLObject.FLAG_19;
                }
            }
            if (!"application/x-tgsticker".equals(document.mime_type) && !"application/x-tgwallpattern".equals(document.mime_type)) {
                z10 = false;
                this.a1 = z10;
                j10 = document.size;
                this.b0 = j10;
                if (this.h0 != null && j10 % 16 != 0) {
                    long j11 = 16 - (j10 % 16);
                    this.c0 = j11;
                    this.b0 = j10 + j11;
                }
                B = b8.B(document);
                this.P0 = B;
                if (B != null && (lastIndexOf = B.lastIndexOf(46)) != -1) {
                    this.P0 = B.substring(lastIndexOf);
                    if (!"audio/ogg".equals(document.mime_type)) {
                        this.b1 = ConnectionsManager.FileTypeAudio;
                    } else {
                        String str = document.mime_type;
                        if (!"video/mp4".equals(str) && (!tz.D0 || !"video/x-matroska".equals(str))) {
                            this.b1 = 67108864;
                        }
                        this.b1 = 33554432;
                    }
                    if (this.P0.length() > 1) {
                        this.P0 = b8.C(document.mime_type);
                        return;
                    }
                    return;
                }
                this.P0 = "";
                if (!"audio/ogg".equals(document.mime_type)) {
                }
                if (this.P0.length() > 1) {
                }
            }
            z10 = true;
            this.a1 = z10;
            j10 = document.size;
            this.b0 = j10;
            if (this.h0 != null) {
                long j112 = 16 - (j10 % 16);
                this.c0 = j112;
                this.b0 = j10 + j112;
            }
            B = b8.B(document);
            this.P0 = B;
            if (B != null) {
                this.P0 = B.substring(lastIndexOf);
                if (!"audio/ogg".equals(document.mime_type)) {
                }
                if (this.P0.length() > 1) {
                }
            }
            this.P0 = "";
            if (!"audio/ogg".equals(document.mime_type)) {
            }
            if (this.P0.length() > 1) {
            }
        } catch (Exception e) {
            f8.g(e, true);
            j(0, true);
        }
    }
}
