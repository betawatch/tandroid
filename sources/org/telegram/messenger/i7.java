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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i7 {
    public static bg.d0 l1;
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
    public final m20 X;
    public final e8 X0;
    public volatile int Y;
    public volatile boolean Y0;
    public volatile boolean Z;
    public volatile boolean Z0;
    public boolean a;
    public long a0;
    public boolean a1;
    public j7 b;
    public long b0;
    public final int b1;
    public boolean c;
    public final long c0;
    public di.s6 c1;
    public long d;
    public long d0;
    public long d1;
    public boolean e;
    public long e0;
    public lg.f e1;
    public boolean f;
    public h7 f0;
    public final Runnable f1;
    public int g;
    public u7 g0;
    public long g1;
    public final Runnable h;
    public final byte[] h0;
    public long h1;
    public y4 i;
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
    public static volatile p5 k1 = new p5("writeFileQueue");
    public static final Object m1 = new Object();

    public i7(hc hcVar, Object obj, String str, long j3) {
        this.g = 2;
        this.h = new y6(this, 0);
        this.n = 131072;
        this.o = 4;
        this.p = 4;
        this.q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f1 = new y6(this, 5);
        u();
        this.p0 = obj;
        this.j = obj instanceof TL_stories.TL_storyItem;
        this.X0 = w7.E(obj);
        this.r0 = hcVar.p == 2;
        if (hcVar.c != null) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.V = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar.f;
            long j10 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.id = j10;
            tL_inputEncryptedFileLocation.volume_id = j10;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = hcVar.e;
            byte[] bArr = new byte[32];
            this.i0 = bArr;
            System.arraycopy(hcVar.d, 0, bArr, 0, 32);
            this.h0 = hcVar.c;
        } else if (hcVar.n != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = hcVar.f;
            long j11 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.id = j11;
            tL_inputPeerPhotoFileLocation.volume_id = j11;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = hcVar.s;
            tL_inputPeerPhotoFileLocation.big = hcVar.m == 0;
            tL_inputPeerPhotoFileLocation.peer = hcVar.n;
            this.V = tL_inputPeerPhotoFileLocation;
        } else if (hcVar.o != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = hcVar.f;
            long j12 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.id = j12;
            tL_inputStickerSetThumb.volume_id = j12;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = hcVar.q;
            tL_inputStickerSetThumb.stickerset = hcVar.o;
            this.V = tL_inputStickerSetThumb;
        } else if (hcVar.u != null) {
            if (hcVar.s != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.V = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.id = hcVar.s;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = hcVar.f;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = hcVar.e;
                tL_inputPhotoFileLocation.file_reference = hcVar.b;
                tL_inputPhotoFileLocation.thumb_size = hcVar.u;
                if (hcVar.p == 2) {
                    this.o0 = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = hcVar.t;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = hcVar.f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = hcVar.e;
                tL_inputDocumentFileLocation.file_reference = hcVar.b;
                tL_inputDocumentFileLocation.thumb_size = hcVar.u;
            }
            TLRPC.InputFileLocation inputFileLocation = this.V;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.V = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = hcVar.f;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = hcVar.e;
            byte[] bArr2 = hcVar.b;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.o0 = true;
        }
        int i7 = hcVar.p;
        this.a1 = i7 == 1 || i7 == 3;
        int i10 = hcVar.a;
        this.T = i10;
        this.U = i10;
        this.b1 = 16777216;
        this.b0 = j3;
        this.P0 = str == null ? "jpg" : str;
    }

    public static /* synthetic */ void a(i7 i7Var) {
        if (i7Var.Y != 1 || i7Var.Z) {
            return;
        }
        i7Var.s(-1);
    }

    public static void b(i7 i7Var) {
        i7Var.l();
        w7.G(i7Var.R).e(null, null, null, null, null, i7Var.r);
    }

    public static void n(long j3, long j10, ArrayList arrayList) {
        boolean z9;
        if (arrayList == null || j10 < j3) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            g7 g7Var = (g7) arrayList.get(i10);
            if (j3 == g7Var.b) {
                g7Var.b = j10;
            } else if (j10 == g7Var.a) {
                g7Var.a = j3;
            }
            z9 = true;
        }
        z9 = false;
        Collections.sort(arrayList, new jg.x(16));
        while (i7 < arrayList.size() - 1) {
            g7 g7Var2 = (g7) arrayList.get(i7);
            int i11 = i7 + 1;
            g7 g7Var3 = (g7) arrayList.get(i11);
            if (g7Var2.b == g7Var3.a) {
                g7Var2.b = g7Var3.b;
                arrayList.remove(i11);
                i7--;
            }
            i7++;
        }
        if (z9) {
            return;
        }
        arrayList.add(new g7(j3, j10));
    }

    public final void c(long j3, long j10, ArrayList arrayList, boolean z9) {
        if (arrayList == null || j10 < j3) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i7 = 0; i7 < size; i7++) {
            g7 g7Var = (g7) arrayList.get(i7);
            long j11 = g7Var.a;
            if (j3 > j11) {
                long j12 = g7Var.b;
                if (j10 < j12) {
                    arrayList.add(0, new g7(j11, j3));
                    g7Var.a = j10;
                } else if (j3 < j12) {
                    g7Var.b = j3;
                }
                z10 = true;
                break;
            }
            if (j10 >= g7Var.b) {
                arrayList.remove(i7);
            } else if (j10 > j11) {
                g7Var.a = j10;
            }
            z10 = true;
            break;
        }
        if (z9) {
            if (!z10) {
                if (r2.a) {
                    a8.d(this.L0 + " downloaded duplicate file part " + j3 + " - " + j10);
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
            p5 p5Var = k1;
            y4 y4Var = new y4(6, this, arrayList2);
            this.i = y4Var;
            p5Var.c(y4Var);
            i();
        }
    }

    public final void d() {
        try {
            RandomAccessFile randomAccessFile = this.Q0;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                this.Q0.close();
                this.Q0 = null;
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.v;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                this.v.close();
                this.v = null;
            }
        } catch (Exception e13) {
            a8.g(e13, true);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.C0;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e14) {
                    a8.g(e14, true);
                }
                this.C0.close();
                this.C0 = null;
            }
        } catch (Exception e15) {
            a8.g(e15, true);
        }
        try {
            if (this.S0 != null) {
                synchronized (this) {
                    if (this.Y0) {
                        this.Z0 = true;
                    } else {
                        try {
                            this.S0.getChannel().close();
                        } catch (Exception e16) {
                            a8.g(e16, true);
                        }
                        this.S0.close();
                        this.S0 = null;
                    }
                }
            }
        } catch (Exception e17) {
            a8.g(e17, true);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.R0;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.R0 = null;
            }
        } catch (Exception e18) {
            a8.g(e18, true);
        }
        if (this.I0 != null) {
            for (int i7 = 0; i7 < this.I0.size(); i7++) {
                h7 h7Var = (h7) this.I0.get(i7);
                TLRPC.TL_upload_file tL_upload_file = h7Var.f;
                if (tL_upload_file != null) {
                    tL_upload_file.disableFree = false;
                    tL_upload_file.freeResources();
                } else {
                    TLRPC.TL_upload_webFile tL_upload_webFile = h7Var.g;
                    if (tL_upload_webFile != null) {
                        tL_upload_webFile.disableFree = false;
                        tL_upload_webFile.freeResources();
                    } else {
                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile = h7Var.h;
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

    public final void e(h7 h7Var, boolean z9, boolean z10) {
        int[] iArr = new int[8];
        long j3 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.G0.size(); i7++) {
            h7 h7Var2 = (h7) this.G0.get(i7);
            j3 = Math.min(h7Var2.e, j3);
            if (this.y) {
                this.u.remove(Long.valueOf(h7Var2.e));
            } else {
                ArrayList arrayList = this.O;
                long j10 = h7Var2.e;
                n(j10, h7Var2.c + j10, arrayList);
            }
            if (h7Var != h7Var2 && h7Var2.a != 0) {
                h7Var2.j = true;
                if (z10) {
                    this.H0.add(h7Var2);
                    h7Var2.l = new a7(this, h7Var2, 0);
                    ConnectionsManager.getInstance(this.R).cancelRequest(h7Var2.a, true, new b7(h7Var2, 0));
                } else {
                    ConnectionsManager.getInstance(this.R).cancelRequest(h7Var2.a, true);
                    h7Var2.k = true;
                }
                if (!b6.g()) {
                    int i10 = h7Var2.d >>> 16;
                    iArr[i10] = iArr[i10] + h7Var2.c;
                }
            }
        }
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = (i11 << 16) | 2;
            if (iArr[i11] > ((!this.j || b6.g()) ? TLObject.FLAG_20 : 262144)) {
                ConnectionsManager.getInstance(this.R).discardConnection(this.u0 ? this.y0 : this.T, i12);
            }
        }
        this.G0.clear();
        g0.h3(new y6(this, 2));
        for (int i13 = 0; i13 < this.I0.size(); i13++) {
            h7 h7Var3 = (h7) this.I0.get(i13);
            if (this.y) {
                this.u.remove(Long.valueOf(h7Var3.e));
            } else {
                ArrayList arrayList2 = this.O;
                long j11 = h7Var3.e;
                n(j11, h7Var3.c + j11, arrayList2);
            }
            TLRPC.TL_upload_file tL_upload_file = h7Var3.f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = h7Var3.g;
                if (tL_upload_webFile != null) {
                    tL_upload_webFile.disableFree = false;
                    tL_upload_webFile.freeResources();
                } else {
                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile = h7Var3.h;
                    if (tL_upload_cdnFile != null) {
                        tL_upload_cdnFile.disableFree = false;
                        tL_upload_cdnFile.freeResources();
                    }
                }
            }
            j3 = Math.min(h7Var3.e, j3);
        }
        this.I0.clear();
        this.l0 = 0;
        if (!z9 && this.y) {
            this.Q = this.x;
        } else if (this.M == null) {
            this.a0 = j3;
            this.Q = j3;
        }
    }

    public final long f(long j3, long j10, NativeByteBuffer nativeByteBuffer) {
        int limit = nativeByteBuffer.limit();
        long j11 = j3;
        while (j11 >= j10 - 16) {
            long j12 = j10 + limit;
            if (j11 >= j12) {
                return 0L;
            }
            long j13 = j12 - 16;
            byte[] bArr = this.H;
            if (j11 >= j13) {
                long j14 = j12 - j11;
                if (j14 > 2147483647L) {
                    throw new RuntimeException("!!!");
                }
                this.I = (int) j14;
                nativeByteBuffer.position(nativeByteBuffer.limit() - this.I);
                nativeByteBuffer.readBytes(bArr, 0, this.I, false);
                return j12;
            }
            if (this.I != 0) {
                nativeByteBuffer.position(0);
                int i7 = this.I;
                nativeByteBuffer.readBytes(bArr, i7, 16 - i7, false);
                this.I = 0;
            } else {
                long j15 = j11 - j10;
                if (j15 > 2147483647L) {
                    throw new RuntimeException("!!!");
                }
                nativeByteBuffer.position((int) j15);
                nativeByteBuffer.readBytes(bArr, 0, 16, false);
            }
            int i10 = ((bArr[0] & 255) << 24) + ((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255);
            if (i10 == 0) {
                return 0L;
            }
            if (i10 == 1) {
                i10 = ((bArr[12] & 255) << 24) + ((bArr[13] & 255) << 16) + ((bArr[14] & 255) << 8) + (bArr[15] & 255);
            }
            if (bArr[4] == 109 && bArr[5] == 111 && bArr[6] == 111 && bArr[7] == 118) {
                return -i10;
            }
            j11 += i10;
            if (j11 >= j12) {
                return j11;
            }
        }
        return 0L;
    }

    public final File g() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        File[] fileArr = new File[1];
        Utilities.d.c(new ng(this, fileArr, countDownLatch, 21));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return fileArr[0];
    }

    public final long h(long j3, long j10, ArrayList arrayList) {
        long j11;
        if (arrayList == null || this.Y == 3 || arrayList.isEmpty()) {
            if (this.Y == 3) {
                return j10;
            }
            long j12 = this.a0;
            if (j12 == 0) {
                return 0L;
            }
            return Math.min(j10, Math.max(j12 - j3, 0L));
        }
        int size = arrayList.size();
        g7 g7Var = null;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                j11 = j10;
                break;
            }
            g7 g7Var2 = (g7) arrayList.get(i7);
            long j13 = g7Var2.a;
            if (j3 <= j13 && (g7Var == null || j13 < g7Var.a)) {
                g7Var = g7Var2;
            }
            if (j13 <= j3 && g7Var2.b > j3) {
                j11 = 0;
                break;
            }
            i7++;
        }
        if (j11 == 0) {
            return 0L;
        }
        return g7Var != null ? Math.min(j10, g7Var.a - j3) : Math.min(j10, Math.max(this.b0 - j3, 0L));
    }

    public final void i() {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((j7) this.m.get(i7)).a();
            }
        }
    }

    public final void j(int i7, boolean z9) {
        d();
        this.Y = i7 == 1 ? 4 : 2;
        if (this.g0 != null && r2.a) {
            long currentTimeMillis = this.d1 != 0 ? System.currentTimeMillis() - this.d1 : 0L;
            if (i7 == 1) {
                a8.b("cancel downloading file to " + this.L0 + " time = " + currentTimeMillis + " dc = " + this.T + " size = " + g0.i0(this.b0, false, false));
            } else {
                a8.b("failed downloading file to " + this.L0 + " reason = " + i7 + " time = " + currentTimeMillis + " dc = " + this.T + " size = " + g0.i0(this.b0, false, false));
            }
        }
        if (z9) {
            Utilities.d.c(new z6(this, i7, 3));
            return;
        }
        u7 u7Var = this.g0;
        if (u7Var != null) {
            u7Var.b(this, i7);
        }
        i();
    }

    public final void k(int i7, boolean z9, boolean z10) {
        if (this.Y == 1 || this.Y == 5) {
            this.Y = 3;
            i();
            d();
            int i10 = 10;
            if (!this.y && !z10) {
                k1.c(new iy(2, this, this.M0, this.N0, this.A, this.J0, z9));
                this.M0 = null;
                this.N0 = null;
                this.A = null;
                this.g0.getClass();
                w7.J.c(new y4(i10, this, this.e1));
                return;
            }
            this.z = true;
            boolean z11 = r2.a;
            if (i7 == 1) {
                a8.b("file already exist " + this.J0);
            } else {
                StringBuilder sb2 = new StringBuilder("finished preloading file to ");
                sb2.append(this.J0);
                sb2.append(" loaded ");
                sb2.append(this.a0);
                sb2.append(" of ");
                sb2.append(this.b0);
                sb2.append(" prefSize=");
                jg.g.s(this.J, sb2);
            }
            if (this.X0 != null) {
                int i11 = 12;
                if (this.J0 != null) {
                    f8 f8Var = w7.G(this.R).d;
                    List singletonList = Collections.singletonList(new ci.b(this.J0));
                    f8Var.getClass();
                    f8Var.h(new y4(i11, f8Var, singletonList));
                }
                if (this.N0 != null) {
                    f8 f8Var2 = w7.G(this.R).d;
                    List singletonList2 = Collections.singletonList(new ci.b(this.N0));
                    f8Var2.getClass();
                    f8Var2.h(new y4(i11, f8Var2, singletonList2));
                }
            }
            this.g0.getClass();
            w7.J.c(new y4(i10, this, this.e1));
            this.g0.c(this, this.L0);
        }
    }

    public final void l() {
        if (this.Y != 1) {
            return;
        }
        this.Z = true;
        this.g1 = 0L;
        Utilities.d.c(new y6(this, 4));
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
    public final boolean m(h7 h7Var, TLRPC.TL_error tL_error) {
        long j3;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile;
        NativeByteBuffer nativeByteBuffer;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile2;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile3;
        String str;
        char c10;
        char c11;
        boolean z9;
        boolean z10;
        boolean z11;
        byte[] bArr;
        long j10;
        long j11;
        boolean z12;
        RandomAccessFile randomAccessFile;
        boolean z13;
        boolean z14;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile4;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile5;
        TLRPC.TL_upload_cdnFile tL_upload_cdnFile6;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        boolean z15;
        long j24;
        Integer num;
        boolean z16;
        long j25;
        long j26;
        long j27;
        int i7 = 1;
        if (this.Y == 1 || this.Y == 5) {
            int i10 = h7Var.a;
            this.G0.remove(h7Var);
            g0.h3(new z6(this, i10, i7));
            String str2 = " secret = ";
            if (tL_error == null) {
                try {
                    if (this.M == null) {
                        j3 = 0;
                        long j28 = this.a0;
                        j24 = h7Var.e;
                        if (j28 != j24) {
                            this.I0.add(h7Var);
                            TLRPC.TL_upload_file tL_upload_file = h7Var.f;
                            if (tL_upload_file != null) {
                                tL_upload_file.disableFree = true;
                                return false;
                            }
                            TLRPC.TL_upload_webFile tL_upload_webFile = h7Var.g;
                            if (tL_upload_webFile != null) {
                                tL_upload_webFile.disableFree = true;
                                return false;
                            }
                            TLRPC.TL_upload_cdnFile tL_upload_cdnFile7 = h7Var.h;
                            if (tL_upload_cdnFile7 != null) {
                                tL_upload_cdnFile7.disableFree = true;
                                return false;
                            }
                        }
                    } else {
                        j3 = 0;
                    }
                    TLRPC.TL_upload_file tL_upload_file2 = h7Var.f;
                    if (tL_upload_file2 != null) {
                        nativeByteBuffer = tL_upload_file2.bytes;
                    } else {
                        TLRPC.TL_upload_webFile tL_upload_webFile2 = h7Var.g;
                        if (tL_upload_webFile2 != null) {
                            nativeByteBuffer = tL_upload_webFile2.bytes;
                        } else {
                            tL_upload_cdnFile = h7Var.h;
                            if (tL_upload_cdnFile != null) {
                                tL_upload_cdnFile2 = h7Var.h;
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
                        j23 = h7Var.e;
                        long j29 = 131072;
                        long j30 = j29 * (j23 / j29);
                        HashMap hashMap = this.q0;
                        if ((hashMap != null ? (TLRPC.TL_fileHash) hashMap.get(Long.valueOf(j30)) : null) == null) {
                            this.I0.add(h7Var);
                            TLRPC.TL_upload_file tL_upload_file3 = h7Var.f;
                            if (tL_upload_file3 != null) {
                                z15 = true;
                                tL_upload_file3.disableFree = true;
                            } else {
                                z15 = true;
                                TLRPC.TL_upload_webFile tL_upload_webFile3 = h7Var.g;
                                if (tL_upload_webFile3 != null) {
                                    tL_upload_webFile3.disableFree = true;
                                } else {
                                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile8 = h7Var.h;
                                    if (tL_upload_cdnFile8 != null) {
                                        tL_upload_cdnFile8.disableFree = true;
                                    }
                                }
                            }
                            o(j30);
                            return z15;
                        }
                    }
                    tL_upload_cdnFile3 = h7Var.h;
                    if (tL_upload_cdnFile3 != null) {
                        j22 = h7Var.e;
                        long j31 = j22 / 16;
                        byte[] bArr2 = this.v0;
                        c11 = '\f';
                        bArr2[15] = (byte) (j31 & 255);
                        bArr2[14] = (byte) ((j31 >> 8) & 255);
                        bArr2[13] = (byte) ((j31 >> 16) & 255);
                        bArr2[12] = (byte) ((j31 >> 24) & 255);
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
                        j18 = h7Var.e;
                        randomAccessFile2.writeLong(j18);
                        long j32 = limit;
                        this.v.writeLong(j32);
                        this.w += 16;
                        this.v.getChannel().write(nativeByteBuffer.buffer);
                        boolean z17 = r2.a;
                        StringBuilder sb2 = new StringBuilder("save preload file part ");
                        sb2.append(this.A);
                        sb2.append(" offset ");
                        j19 = h7Var.e;
                        sb2.append(j19);
                        sb2.append(" size ");
                        sb2.append(limit);
                        a8.b(sb2.toString());
                        if (this.t == null) {
                            this.t = new HashMap();
                        }
                        HashMap hashMap2 = this.t;
                        j20 = h7Var.e;
                        hashMap2.put(Long.valueOf(j20), new f7(this.w, j32));
                        this.x += limit;
                        this.w += limit;
                        if (this.G == 0) {
                            long j33 = this.D;
                            j21 = h7Var.e;
                            long f10 = f(j33, j21, nativeByteBuffer);
                            if (f10 < j3) {
                                f10 *= -1;
                                long j34 = this.C + this.j0;
                                this.C = j34;
                                if (j34 < this.b0 / 2) {
                                    long j35 = 1048576 + f10;
                                    this.E = j35;
                                    this.F = j35;
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
                            this.D = f10;
                        }
                        this.v.writeLong(this.E);
                        this.v.writeLong(this.C);
                        this.v.writeLong(this.D);
                        this.w += 24;
                        long j36 = this.C;
                        if (j36 != j3 && ((this.G == 0 || this.E >= j3) && this.x <= 2097152 && j36 < this.b0)) {
                            z14 = false;
                            if (!z14) {
                                this.v.seek(j3);
                                this.v.write(1);
                            } else if (this.G != 0) {
                                this.E -= this.j0;
                            }
                            z13 = false;
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        z13 = false;
                    } else {
                        long j37 = limit;
                        long j38 = this.a0 + j37;
                        this.a0 = j38;
                        long j39 = this.b0;
                        if (j39 > 0) {
                            if (j38 < j39) {
                                int i11 = this.J;
                                if (i11 > 0 && j38 >= i11) {
                                    if ((this.j && this.W0 < 3) && this.G0.isEmpty()) {
                                    }
                                }
                                z9 = false;
                                if (this.a0 < this.b0) {
                                    z10 = z9;
                                    z11 = true;
                                    boolean z18 = r2.a;
                                    bArr = this.h0;
                                    if (bArr != null) {
                                        Utilities.c(nativeByteBuffer.buffer, bArr, this.i0, false, true, 0, nativeByteBuffer.limit());
                                        if (z10 && this.c0 != 0) {
                                            long limit2 = nativeByteBuffer.limit() - this.c0;
                                            if (limit2 > 2147483647L) {
                                                throw new RuntimeException("Out of limit" + limit2);
                                            }
                                            nativeByteBuffer.limit((int) limit2);
                                        }
                                    }
                                    if (this.n0) {
                                        j16 = h7Var.e;
                                        long j40 = j16 / 16;
                                        byte[] bArr3 = this.t0;
                                        bArr3[15] = (byte) (j40 & 255);
                                        bArr3[14] = (byte) ((j40 >> 8) & 255);
                                        bArr3[c10] = (byte) ((j40 >> 16) & 255);
                                        bArr3[c11] = (byte) ((j40 >> 24) & 255);
                                        Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.s0, bArr3, 0, nativeByteBuffer.limit());
                                    }
                                    if (this.M != null) {
                                        RandomAccessFile randomAccessFile3 = this.Q0;
                                        j14 = h7Var.e;
                                        randomAccessFile3.seek(j14);
                                        StringBuilder sb3 = new StringBuilder("save file part ");
                                        sb3.append(this.r);
                                        sb3.append(" offset=");
                                        j15 = h7Var.e;
                                        sb3.append(j15);
                                        sb3.append(" chunk_size=");
                                        sb3.append(this.j0);
                                        sb3.append(" isCdn=");
                                        sb3.append(this.u0);
                                        a8.b(sb3.toString());
                                    }
                                    this.Q0.getChannel().write(nativeByteBuffer.buffer);
                                    ArrayList arrayList = this.M;
                                    j10 = h7Var.e;
                                    j11 = h7Var.e;
                                    long j41 = j11 + j37;
                                    String str3 = str;
                                    c(j10, j41, arrayList, true);
                                    if (this.u0) {
                                        j12 = h7Var.e;
                                        long j42 = 131072;
                                        long j43 = j12 / j42;
                                        int size = this.P.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= size) {
                                                break;
                                            }
                                            g7 g7Var = (g7) this.P.get(i12);
                                            if (g7Var.a > j43 || j43 > g7Var.b) {
                                                i12++;
                                                z11 = z11;
                                                str2 = str2;
                                                j43 = j43;
                                            } else {
                                                long j44 = j43 * j42;
                                                long h = h(j44, j42, this.M);
                                                if (h != 0) {
                                                    if (h != j42) {
                                                        long j45 = this.b0;
                                                        if (j45 > 0) {
                                                        }
                                                        if (j45 <= 0 && z10) {
                                                        }
                                                    }
                                                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) this.q0.get(Long.valueOf(j44));
                                                    if (this.C0 == null) {
                                                        this.D0 = new byte[131072];
                                                        this.C0 = new RandomAccessFile(this.J0, "r");
                                                    }
                                                    this.C0.seek(j44);
                                                    boolean z19 = r2.a;
                                                    if (h > 2147483647L) {
                                                        throw new RuntimeException("!!!");
                                                    }
                                                    this.C0.readFully(this.D0, 0, (int) h);
                                                    if (this.n0) {
                                                        long j46 = j44 / 16;
                                                        byte[] bArr4 = this.t0;
                                                        z12 = z11;
                                                        bArr4[15] = (byte) (j46 & 255);
                                                        bArr4[14] = (byte) ((j46 >> 8) & 255);
                                                        bArr4[c10] = (byte) ((j46 >> 16) & 255);
                                                        bArr4[c11] = (byte) ((j46 >> 24) & 255);
                                                        Utilities.aesCtrDecryptionByteArray(this.D0, this.s0, bArr4, 0, h, 0);
                                                        j13 = h;
                                                    } else {
                                                        j13 = h;
                                                        z12 = z11;
                                                    }
                                                    if (!Arrays.equals(Utilities.o(j13, this.D0), tL_fileHash.hash)) {
                                                        if (r2.a) {
                                                            if (this.V != null) {
                                                                a8.d("invalid cdn hash " + this.V + " id = " + this.V.id + " local_id = " + this.V.local_id + str3 + this.V.access_hash + " volume_id = " + this.V.volume_id + str2 + this.V.secret);
                                                            } else if (this.W != null) {
                                                                a8.d("invalid cdn hash  " + this.W + " id = " + this.r);
                                                            }
                                                        }
                                                        j(0, false);
                                                        this.J0.delete();
                                                        return false;
                                                    }
                                                    this.q0.remove(Long.valueOf(j44));
                                                    c(j43, j43 + 1, this.P, false);
                                                }
                                            }
                                        }
                                    }
                                    z12 = z11;
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
                                    z13 = z12;
                                    z14 = z10;
                                }
                            }
                            z9 = true;
                            if (this.a0 < this.b0) {
                            }
                        } else {
                            int i13 = this.j0;
                            if (limit == i13 && ((j39 != j38 && j38 % i13 == 0) || (j39 > 0 && j39 > j38))) {
                                z9 = false;
                            }
                            z9 = true;
                        }
                        z10 = z9;
                        z11 = false;
                        boolean z182 = r2.a;
                        bArr = this.h0;
                        if (bArr != null) {
                        }
                        if (this.n0) {
                        }
                        if (this.M != null) {
                        }
                        this.Q0.getChannel().write(nativeByteBuffer.buffer);
                        ArrayList arrayList2 = this.M;
                        j10 = h7Var.e;
                        j11 = h7Var.e;
                        long j412 = j11 + j37;
                        String str32 = str;
                        c(j10, j412, arrayList2, true);
                        if (this.u0) {
                        }
                        z12 = z11;
                        randomAccessFile = this.R0;
                        if (randomAccessFile != null) {
                        }
                        if (this.b0 > 0) {
                            if (this.M == null) {
                            }
                            this.g0.a(this, this.a0, this.b0);
                        }
                        z13 = z12;
                        z14 = z10;
                    }
                    for (int i14 = 0; i14 < this.I0.size(); i14++) {
                        h7 h7Var2 = (h7) this.I0.get(i14);
                        if (this.M == null) {
                            long j47 = this.a0;
                            j17 = h7Var2.e;
                            if (j47 != j17) {
                            }
                        }
                        this.I0.remove(i14);
                        if (!m(h7Var2, null)) {
                            TLRPC.TL_upload_file tL_upload_file4 = h7Var2.f;
                            if (tL_upload_file4 != null) {
                                tL_upload_file4.disableFree = false;
                                tL_upload_file4.freeResources();
                            } else {
                                TLRPC.TL_upload_webFile tL_upload_webFile4 = h7Var2.g;
                                if (tL_upload_webFile4 != null) {
                                    tL_upload_webFile4.disableFree = false;
                                    tL_upload_webFile4.freeResources();
                                } else {
                                    tL_upload_cdnFile4 = h7Var2.h;
                                    if (tL_upload_cdnFile4 != null) {
                                        tL_upload_cdnFile5 = h7Var2.h;
                                        tL_upload_cdnFile5.disableFree = false;
                                        tL_upload_cdnFile6 = h7Var2.h;
                                        tL_upload_cdnFile6.freeResources();
                                    }
                                }
                            }
                        }
                        if (!z14) {
                            k(0, true, z13);
                            return false;
                        }
                        if (this.Y != 4 && this.Y != 5) {
                            s(h7Var.d);
                            return false;
                        }
                    }
                    if (!z14) {
                    }
                } catch (Exception e10) {
                    a8.g(e10, ((e10 instanceof FileNotFoundException) || (e10 instanceof EOFException) || g0.F1(e10)) ? false : true);
                    if (g0.F1(e10)) {
                        j(-1, false);
                    } else if (g0.G1(e10)) {
                        iz.h(this.L0);
                        j(-1, true);
                    } else {
                        j(0, false);
                    }
                }
            } else {
                if (tL_error.text.contains("LIMIT_INVALID")) {
                    z16 = h7Var.i;
                    if (!z16) {
                        Runnable runnable = h7Var.l;
                        if (runnable != null) {
                            runnable.run();
                        }
                        ArrayList arrayList3 = this.O;
                        j25 = h7Var.e;
                        j26 = h7Var.e;
                        n(j25, j26 + h7Var.c, arrayList3);
                        if (!this.e) {
                            this.e = true;
                            this.j0 = 32768;
                            this.k0 = 4;
                        }
                        s(h7Var.d);
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
                        } catch (Exception e11) {
                            a8.f(e11);
                            j(0, false);
                            return false;
                        }
                    }
                    if (tL_error.text.contains("RETRY_LIMIT")) {
                        j(2, false);
                        return false;
                    }
                    if (r2.a) {
                        TLRPC.InputFileLocation inputFileLocation = this.V;
                        if (inputFileLocation != null) {
                            if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                                a8.d(tL_error.text + " " + this.V + " peer_did = " + m5.n(((TLRPC.TL_inputPeerPhotoFileLocation) this.V).peer) + " peer_access_hash=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).peer.access_hash + " photo_id=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).photo_id + " big=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.V).big);
                            } else {
                                a8.d(tL_error.text + " " + this.V + " id = " + this.V.id + " local_id = " + this.V.local_id + " access_hash = " + this.V.access_hash + " volume_id = " + this.V.volume_id + str2 + this.V.secret);
                            }
                        } else if (this.W != null) {
                            a8.d(tL_error.text + " " + this.W + " id = " + this.r);
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
                    s(h7Var.d);
                }
            }
            return false;
        }
        boolean z20 = r2.a;
        if (this.Y == 3) {
            StringBuilder sb4 = new StringBuilder("trying to write to finished file ");
            sb4.append(this.r);
            sb4.append(" offset ");
            j27 = h7Var.e;
            sb4.append(j27);
            sb4.append(" ");
            sb4.append(this.b0);
            sb4.append(" reqToken=");
            sb4.append(h7Var.a);
            sb4.append(" (state=");
            a8.f(new z7(a8.p0.n(this.Y, ")", sb4)));
            return false;
        }
        return false;
    }

    public final void o(long j3) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.x0;
        tL_upload_getCdnFileHashes.offset = j3;
        ConnectionsManager.getInstance(this.R).sendRequest(tL_upload_getCdnFileHashes, new s1(this, 2), null, null, 0, this.T, 1, true);
    }

    public final void p(h7 h7Var) {
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
        if (obj instanceof ij) {
            ij ijVar = (ij) obj;
            if (ijVar.f1() < 0 && (message = ijVar.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.p0 = webPage;
                this.j = false;
            }
        }
        if (r2.a) {
            a8.b("debug_loading: " + this.L0.getName() + " file reference expired ");
        }
        r8.n(this.R).u(new Object[]{this.V, this, h7Var}, this.p0);
    }

    public final void q(boolean z9) {
        if (this.y != z9) {
            if (!z9 || this.b0 > 2097152) {
                a8.d("setIsPreloadVideoOperation " + z9 + " file=" + this.r);
                if (z9 || !this.y) {
                    this.y = z9;
                    return;
                }
                if (this.Y != 3) {
                    if (this.Y == 1) {
                        Utilities.d.c(new d7(this, z9, 1));
                        return;
                    } else {
                        this.y = z9;
                        return;
                    }
                }
                this.y = z9;
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
    /* JADX WARN: Removed duplicated region for block: B:184:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08cc A[Catch: Exception -> 0x08d0, TRY_LEAVE, TryCatch #0 {Exception -> 0x08d0, blocks: (B:274:0x08bb, B:276:0x08cc), top: B:273:0x08bb }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        long j3;
        String r10;
        String str;
        String str2;
        String str3;
        String r11;
        String r12;
        String s5;
        String r13;
        String str4;
        String str5;
        String str6;
        Object obj;
        boolean exists;
        int i7;
        boolean z9;
        boolean[] zArr;
        boolean z10;
        boolean[] zArr2;
        String str7;
        long j10;
        ArrayList arrayList;
        u7 u7Var;
        int i10;
        boolean z11;
        long j11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        RandomAccessFile randomAccessFile;
        String str8;
        final j7 j7Var = this.b;
        final long j12 = this.d;
        final boolean z17 = this.c;
        this.d1 = System.currentTimeMillis();
        u();
        int i12 = 1;
        if (this.j0 == 0) {
            if (this.e) {
                if (r2.a) {
                    a8.b("debug_loading: restart with small chunk");
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
                boolean z18 = this.b0 >= ((long) 10485760);
                this.j0 = z18 ? this.n : 32768;
                this.k0 = z18 ? this.p : this.o;
                t();
            }
        }
        final boolean z19 = this.Y != 0;
        this.Z = false;
        if (j7Var != null) {
            Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.c7
                @Override // java.lang.Runnable
                public final void run() {
                    i7 i7Var = i7.this;
                    boolean z20 = z17;
                    long j13 = j12;
                    j7 j7Var2 = j7Var;
                    boolean z21 = z19;
                    if (i7Var.m == null) {
                        i7Var.m = new ArrayList();
                    }
                    if (z20) {
                        long j14 = i7Var.j0;
                        long j15 = (j13 / j14) * j14;
                        h7 h7Var = i7Var.f0;
                        if (h7Var != null && h7Var.e != j15) {
                            int i13 = h7Var.a;
                            i7Var.G0.remove(h7Var);
                            g0.h3(new z6(i7Var, i13, 2));
                            long j16 = i7Var.Q;
                            long j17 = i7Var.j0;
                            i7Var.Q = j16 - j17;
                            ArrayList arrayList2 = i7Var.O;
                            long j18 = i7Var.f0.e;
                            i7.n(j18, j17 + j18, arrayList2);
                            if (i7Var.f0.a != 0) {
                                ConnectionsManager.getInstance(i7Var.R).cancelRequest(i7Var.f0.a, true);
                                i7Var.l0--;
                            }
                            boolean z22 = r2.a;
                            jg.g.u(i7Var.f0.e, new StringBuilder("frame get cancel request at offset "));
                            i7Var.f0 = null;
                        }
                        if (i7Var.f0 == null) {
                            i7Var.e0 = j15;
                        }
                    } else {
                        long j19 = i7Var.j0;
                        i7Var.d0 = (j13 / j19) * j19;
                    }
                    if (!i7Var.m.contains(j7Var2)) {
                        i7Var.m.add(j7Var2);
                        a8.d("FileLoadOperation " + i7Var.r + " start, adding stream " + j7Var2);
                    }
                    if (!i7Var.m.isEmpty()) {
                        Utilities.d.a(i7Var.f1);
                    }
                    if (z21) {
                        if (i7Var.t != null) {
                            if (i7Var.h(i7Var.d0, 1L, i7Var.M) == 0 && i7Var.t.get(Long.valueOf(i7Var.d0)) != null) {
                                i7Var.K = true;
                            }
                        }
                        i7Var.s(-1);
                        i7Var.K = false;
                    }
                    if (i7Var.M != null) {
                        i7Var.i();
                    }
                }
            });
        } else if (z19) {
            Utilities.d.c(new y6(this, 3));
        }
        if (z19) {
            return;
        }
        if (this.V == null && this.W == null) {
            boolean z20 = r2.a;
            a8.b("loadOperation: no location, failing");
            j(0, true);
            return;
        }
        long j13 = this.j0;
        this.d0 = (j12 / j13) * j13;
        if (this.o0) {
            long j14 = this.b0;
            if (j14 > 0 && j14 > j13) {
                this.M = new ArrayList();
                this.O = new ArrayList();
            }
        }
        if (this.W != null) {
            String a10 = Utilities.a(this.X.a);
            if (this.n0) {
                r12 = rf.b.q(a10, ".temp.enc");
                str8 = a8.p0.s(rf.b.j(a10, "."), this.P0, ".enc");
                if (this.h0 != null) {
                    r13 = rf.b.q(a10, "_64.iv.enc");
                    str5 = str8;
                    j3 = 0;
                }
                r13 = null;
                str5 = str8;
                j3 = 0;
            } else {
                String q10 = rf.b.q(a10, ".temp");
                StringBuilder j15 = rf.b.j(a10, ".");
                j15.append(this.P0);
                String sb2 = j15.toString();
                if (this.h0 != null) {
                    r13 = rf.b.q(a10, "_64.iv");
                    r12 = q10;
                    str8 = sb2;
                    str5 = str8;
                    j3 = 0;
                } else {
                    r12 = q10;
                    str8 = sb2;
                    r13 = null;
                    str5 = str8;
                    j3 = 0;
                }
            }
            this.G0 = new ArrayList(this.k0);
            this.H0 = new ArrayList();
            this.I0 = new ArrayList(this.k0 - 1);
            this.Y = 1;
            obj = this.p0;
            if (!(obj instanceof TLRPC.TL_theme)) {
                this.L0 = new File(t0.h(), a8.p0.r(new StringBuilder("remote"), ((TLRPC.TL_theme) obj).id, ".attheme"));
            } else if (this.n0) {
                this.L0 = new File(this.T0, str5);
            } else {
                this.L0 = new File(this.T0, this.s);
            }
            exists = this.L0.exists();
            this.O0 = exists;
            if (exists) {
                if (!(this.p0 instanceof TLRPC.TL_theme)) {
                    long j16 = this.b0;
                    if (j16 != j3) {
                        if (!this.a1) {
                        }
                    }
                }
                u7 u7Var2 = this.g0;
                final String file = this.L0.toString();
                final f8 f8Var = u7Var2.e.d;
                f8Var.getClass();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final boolean[] zArr3 = {false};
                final int i13 = 0;
                f8Var.h(new Runnable() { // from class: org.telegram.messenger.c8
                    @Override // java.lang.Runnable
                    public final void run() {
                        CountDownLatch countDownLatch2;
                        switch (i13) {
                            case 0:
                                String str9 = file;
                                boolean[] zArr4 = zArr3;
                                countDownLatch2 = countDownLatch;
                                f8 f8Var2 = f8Var;
                                f8Var2.c();
                                try {
                                    try {
                                        SQLiteCursor queryFinalized = f8Var2.c.queryFinalized("SELECT flags FROM paths WHERE path = '" + str9 + "'", new Object[0]);
                                        if (queryFinalized.next()) {
                                            zArr4[0] = (queryFinalized.intValue(0) & 1) != 0;
                                        }
                                    } finally {
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                                return;
                            default:
                                String str10 = file;
                                boolean[] zArr5 = zArr3;
                                countDownLatch2 = countDownLatch;
                                f8 f8Var3 = f8Var;
                                f8Var3.c();
                                try {
                                    try {
                                        if (f8Var3.c.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str10 + "'", new Object[0]).next()) {
                                            zArr5[0] = true;
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    return;
                                } finally {
                                }
                        }
                    }
                });
                try {
                    countDownLatch.await();
                } catch (InterruptedException e10) {
                    a8.g(e10, true);
                }
                if (!zArr3[0]) {
                    if (r2.a) {
                        a8.b("debug_loading: delete existing file cause file size mismatch " + this.L0.getName() + " totalSize=" + this.b0 + " existingFileSize=" + this.L0.length());
                    }
                    u7 u7Var3 = this.g0;
                    final String file2 = this.L0.toString();
                    final f8 f8Var2 = u7Var3.e.d;
                    f8Var2.getClass();
                    final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    final boolean[] zArr4 = {false};
                    final int i14 = 1;
                    f8Var2.h(new Runnable() { // from class: org.telegram.messenger.c8
                        @Override // java.lang.Runnable
                        public final void run() {
                            CountDownLatch countDownLatch22;
                            switch (i14) {
                                case 0:
                                    String str9 = file2;
                                    boolean[] zArr42 = zArr4;
                                    countDownLatch22 = countDownLatch2;
                                    f8 f8Var22 = f8Var2;
                                    f8Var22.c();
                                    try {
                                        try {
                                            SQLiteCursor queryFinalized = f8Var22.c.queryFinalized("SELECT flags FROM paths WHERE path = '" + str9 + "'", new Object[0]);
                                            if (queryFinalized.next()) {
                                                zArr42[0] = (queryFinalized.intValue(0) & 1) != 0;
                                            }
                                        } finally {
                                        }
                                    } catch (Exception e102) {
                                        a8.g(e102, true);
                                    }
                                    return;
                                default:
                                    String str10 = file2;
                                    boolean[] zArr5 = zArr4;
                                    countDownLatch22 = countDownLatch2;
                                    f8 f8Var3 = f8Var2;
                                    f8Var3.c();
                                    try {
                                        try {
                                            if (f8Var3.c.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str10 + "'", new Object[0]).next()) {
                                                zArr5[0] = true;
                                            }
                                        } catch (Exception e11) {
                                            a8.g(e11, true);
                                        }
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                    try {
                        countDownLatch2.await();
                    } catch (InterruptedException e11) {
                        a8.g(e11, true);
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
                    di.s6 s6Var = this.c1;
                    if (s6Var != null) {
                        u7 u7Var4 = this.g0;
                        File file3 = this.L0;
                        f8 f8Var3 = u7Var4.e.d;
                        long j17 = s6Var.c;
                        int i15 = s6Var.b;
                        int i16 = s6Var.d;
                        String file4 = file3 != null ? file3.toString() : null;
                        f8Var3.getClass();
                        f8Var3.h(new d8(f8Var3, j17, i15, i16, file4, 0));
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    a8.g(e12, false);
                    if (g0.F1(e12)) {
                        LaunchActivity.D(1);
                        i7 = -1;
                        j(-1, true);
                    } else {
                        i7 = -1;
                    }
                    if (!g0.G1(e12)) {
                        j(0, true);
                        return;
                    } else {
                        iz.h(this.L0);
                        j(i7, true);
                        return;
                    }
                }
            }
            this.J0 = new File(this.U0, str6);
            if (this.a1) {
                this.K0 = new File(this.U0, rf.b.q(str6, ".gz"));
            }
            if (this.n0) {
                File file5 = new File(t0.b.getCacheDir(), rf.b.q(str5, ".key"));
                try {
                    randomAccessFile = new RandomAccessFile(file5, "rws");
                    long length = file5.length();
                    byte[] bArr = new byte[32];
                    this.s0 = bArr;
                    this.t0 = new byte[16];
                    if (length <= j3 || length % 48 != j3) {
                        SecureRandom secureRandom = Utilities.b;
                        secureRandom.nextBytes(bArr);
                        secureRandom.nextBytes(this.t0);
                        randomAccessFile.write(this.s0);
                        randomAccessFile.write(this.t0);
                        z16 = true;
                    } else {
                        randomAccessFile.read(bArr, 0, 32);
                        randomAccessFile.read(this.t0, 0, 16);
                        z16 = false;
                    }
                } catch (Exception e13) {
                    e = e13;
                    z16 = false;
                }
                try {
                    try {
                        randomAccessFile.getChannel().close();
                    } catch (Exception e14) {
                        a8.g(e14, true);
                    }
                    randomAccessFile.close();
                    z9 = z16;
                } catch (Exception e15) {
                    e = e15;
                    if (g0.F1(e)) {
                        LaunchActivity.D(1);
                        a8.g(e, false);
                        z9 = z16;
                    } else if (g0.G1(e)) {
                        iz.h(this.L0);
                        a8.g(e, false);
                        z9 = z16;
                    } else {
                        a8.g(e, true);
                        z9 = z16;
                    }
                    zArr = new boolean[]{false};
                    if (this.B) {
                    }
                    z10 = z9;
                    zArr2 = zArr;
                    str7 = str4;
                    j10 = 2;
                    if (str7 != null) {
                    }
                    if (this.X0 != null) {
                    }
                    if (!this.J0.exists()) {
                    }
                    arrayList = this.M;
                    if (arrayList != null) {
                    }
                    if (r2.a) {
                    }
                    if (str2 != null) {
                    }
                    if (!this.y) {
                    }
                    u7Var = this.g0;
                    if (u7Var != null) {
                    }
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.J0, "rws");
                    this.Q0 = randomAccessFile2;
                    j11 = this.a0;
                    if (j11 != 0) {
                    }
                    z11 = true;
                    i10 = 0;
                    if (this.Q0 == null) {
                    }
                }
            } else {
                z9 = false;
            }
            zArr = new boolean[]{false};
            if (this.B || r11 == null) {
                z10 = z9;
                zArr2 = zArr;
                str7 = str4;
                j10 = 2;
            } else {
                this.A = new File(this.U0, r11);
                try {
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.A, "rws");
                    this.v = randomAccessFile3;
                    long length2 = randomAccessFile3.length();
                    this.w = 1;
                    if (length2 > 1) {
                        zArr[0] = this.v.readByte() != 0;
                        long j18 = 1;
                        z9 = z9;
                        while (j18 < length2) {
                            if (length2 - j18 < 8) {
                                break;
                            }
                            long readLong = this.v.readLong();
                            if (length2 - (j18 + 8) < 8 || readLong < j3) {
                                break;
                            }
                            j10 = 2;
                            try {
                                if (readLong > this.b0) {
                                    z14 = z9;
                                    i11 = i12;
                                    zArr2 = zArr;
                                } else {
                                    long readLong2 = this.v.readLong();
                                    zArr2 = zArr;
                                    long j19 = j18 + 16;
                                    if (length2 - j19 >= readLong2) {
                                        try {
                                            String str9 = str4;
                                            if (readLong2 <= this.j0) {
                                                try {
                                                    f7 f7Var = new f7(j19, readLong2);
                                                    long j20 = j19 + readLong2;
                                                    this.v.seek(j20);
                                                    if (length2 - j20 >= 24) {
                                                        long readLong3 = this.v.readLong();
                                                        this.E = readLong3;
                                                        if (readLong3 != j3) {
                                                            i11 = i12;
                                                            try {
                                                                str7 = str9;
                                                                z12 = z9;
                                                            } catch (Exception e16) {
                                                                e = e16;
                                                                str7 = str9;
                                                                z12 = z9;
                                                                a8.g(e, false);
                                                                z13 = z12;
                                                                z10 = z13;
                                                                if (!this.y) {
                                                                }
                                                                if (str7 != null) {
                                                                }
                                                                if (this.X0 != null) {
                                                                }
                                                                if (!this.J0.exists()) {
                                                                }
                                                                arrayList = this.M;
                                                                if (arrayList != null) {
                                                                }
                                                                if (r2.a) {
                                                                }
                                                                if (str2 != null) {
                                                                }
                                                                if (!this.y) {
                                                                }
                                                                u7Var = this.g0;
                                                                if (u7Var != null) {
                                                                }
                                                                RandomAccessFile randomAccessFile22 = new RandomAccessFile(this.J0, "rws");
                                                                this.Q0 = randomAccessFile22;
                                                                j11 = this.a0;
                                                                if (j11 != 0) {
                                                                }
                                                                z11 = true;
                                                                i10 = 0;
                                                                if (this.Q0 == null) {
                                                                }
                                                            }
                                                            try {
                                                                this.G = this.C > this.b0 / 2 ? 2 : i11 == true ? 1 : 0;
                                                                this.F = readLong3;
                                                                z15 = z12;
                                                            } catch (Exception e17) {
                                                                e = e17;
                                                                a8.g(e, false);
                                                                z13 = z12;
                                                                z10 = z13;
                                                                if (!this.y) {
                                                                }
                                                                if (str7 != null) {
                                                                }
                                                                if (this.X0 != null) {
                                                                }
                                                                if (!this.J0.exists()) {
                                                                }
                                                                arrayList = this.M;
                                                                if (arrayList != null) {
                                                                }
                                                                if (r2.a) {
                                                                }
                                                                if (str2 != null) {
                                                                }
                                                                if (!this.y) {
                                                                }
                                                                u7Var = this.g0;
                                                                if (u7Var != null) {
                                                                }
                                                                RandomAccessFile randomAccessFile222 = new RandomAccessFile(this.J0, "rws");
                                                                this.Q0 = randomAccessFile222;
                                                                j11 = this.a0;
                                                                if (j11 != 0) {
                                                                }
                                                                z11 = true;
                                                                i10 = 0;
                                                                if (this.Q0 == null) {
                                                                }
                                                            }
                                                        } else {
                                                            str7 = str9;
                                                            z15 = z9;
                                                            i11 = i12;
                                                        }
                                                        this.C = this.v.readLong();
                                                        this.D = this.v.readLong();
                                                        long j21 = j20 + 24;
                                                        if (this.t == null) {
                                                            this.t = new HashMap();
                                                        }
                                                        if (this.u == null) {
                                                            this.u = new HashMap();
                                                        }
                                                        this.t.put(Long.valueOf(readLong), f7Var);
                                                        this.u.put(Long.valueOf(readLong), Integer.valueOf(i11));
                                                        this.x = (int) (this.x + readLong2);
                                                        this.w = (int) (readLong2 + 36 + this.w);
                                                        zArr = zArr2;
                                                        i12 = i11;
                                                        str4 = str7;
                                                        j18 = j21;
                                                        z9 = z15;
                                                    }
                                                } catch (Exception e18) {
                                                    e = e18;
                                                    str7 = str9;
                                                    z12 = z9;
                                                    i11 = i12;
                                                }
                                            }
                                            str7 = str9;
                                            z12 = z9;
                                            i11 = i12;
                                            break;
                                        } catch (Exception e19) {
                                            e = e19;
                                            z12 = z9;
                                            i11 = i12;
                                            str7 = str4;
                                            a8.g(e, false);
                                            z13 = z12;
                                            z10 = z13;
                                            if (!this.y) {
                                            }
                                            if (str7 != null) {
                                            }
                                            if (this.X0 != null) {
                                            }
                                            if (!this.J0.exists()) {
                                            }
                                            arrayList = this.M;
                                            if (arrayList != null) {
                                            }
                                            if (r2.a) {
                                            }
                                            if (str2 != null) {
                                            }
                                            if (!this.y) {
                                                this.N = new ArrayList(this.M);
                                            }
                                            u7Var = this.g0;
                                            if (u7Var != null) {
                                            }
                                            RandomAccessFile randomAccessFile2222 = new RandomAccessFile(this.J0, "rws");
                                            this.Q0 = randomAccessFile2222;
                                            j11 = this.a0;
                                            if (j11 != 0) {
                                            }
                                            z11 = true;
                                            i10 = 0;
                                            if (this.Q0 == null) {
                                            }
                                        }
                                    } else {
                                        z14 = z9;
                                        i11 = i12;
                                    }
                                }
                                str7 = str4;
                                z12 = z14;
                                break;
                            } catch (Exception e20) {
                                e = e20;
                                z12 = z9;
                                i11 = i12;
                                zArr2 = zArr;
                            }
                        }
                    }
                    z12 = z9;
                    i11 = i12;
                    zArr2 = zArr;
                    str7 = str4;
                    j10 = 2;
                    this.v.seek(this.w);
                    z13 = z12;
                } catch (Exception e21) {
                    e = e21;
                    z12 = z9;
                    i11 = i12;
                    zArr2 = zArr;
                    str7 = str4;
                    j10 = 2;
                }
                z10 = z13;
                if (!this.y) {
                    z10 = z13;
                    if (this.t == null) {
                        this.A = null;
                        try {
                            RandomAccessFile randomAccessFile4 = this.v;
                            z10 = z13;
                            if (randomAccessFile4 != null) {
                                try {
                                    randomAccessFile4.getChannel().close();
                                } catch (Exception e22) {
                                    a8.g(e22, i11);
                                }
                                this.v.close();
                                this.v = null;
                                z10 = z13;
                            }
                        } catch (Exception e23) {
                            a8.g(e23, true);
                            z10 = z13;
                        }
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
                        if (readInt <= (length3 - 4) / j10) {
                            for (int i17 = 0; i17 < readInt; i17++) {
                                long readLong4 = this.S0.readLong();
                                long readLong5 = this.S0.readLong();
                                this.M.add(new g7(readLong4, readLong5));
                                this.O.add(new g7(readLong4, readLong5));
                            }
                        }
                    }
                } catch (Exception e24) {
                    Typeface typeface = g0.a;
                    a8.g(e24, !((e24 instanceof FileNotFoundException) || (e24 instanceof EOFException)));
                }
            }
            if (this.X0 != null) {
                f8 f8Var4 = w7.G(this.R).d;
                File file6 = this.N0;
                e8 e8Var = this.X0;
                f8Var4.getClass();
                int i18 = 24;
                if (file6 != null && e8Var != null) {
                    f8Var4.h(new ng(f8Var4, file6, e8Var, i18));
                }
                f8 f8Var5 = w7.G(this.R).d;
                File file7 = this.J0;
                e8 e8Var2 = this.X0;
                f8Var5.getClass();
                if (file7 != null && e8Var2 != null) {
                    f8Var5.h(new ng(f8Var5, file7, e8Var2, i18));
                }
            }
            if (!this.J0.exists()) {
                ArrayList arrayList2 = this.M;
                if (arrayList2 != null && arrayList2.isEmpty()) {
                    this.M.add(new g7(0L, this.b0));
                    this.O.add(new g7(0L, this.b0));
                }
            } else if (z10) {
                this.J0.delete();
            } else {
                long length4 = this.J0.length();
                if (str2 == null || length4 % this.j0 == j3) {
                    long j22 = j3;
                    long length5 = this.J0.length();
                    int i19 = this.j0;
                    long j23 = i19;
                    long j24 = length5 / j23;
                    if ((length5 ^ j23) < j22 && j23 * j24 != length5) {
                        j24--;
                    }
                    long j25 = j24 * i19;
                    this.a0 = j25;
                    this.Q = j25;
                } else {
                    this.Q = j3;
                }
                ArrayList arrayList3 = this.M;
                if (arrayList3 != null && arrayList3.isEmpty()) {
                    this.M.add(new g7(this.a0, this.b0));
                    this.O.add(new g7(this.a0, this.b0));
                }
            }
            arrayList = this.M;
            if (arrayList != null) {
                this.a0 = this.b0;
                int size = arrayList.size();
                for (int i20 = 0; i20 < size; i20++) {
                    g7 g7Var = (g7) this.M.get(i20);
                    this.a0 -= g7Var.b - g7Var.a;
                }
                this.Q = this.a0;
            }
            if (r2.a) {
                if (this.y) {
                    a8.b("start preloading file to temp = " + this.J0);
                } else {
                    StringBuilder sb3 = new StringBuilder("start loading file to temp = ");
                    sb3.append(this.J0);
                    sb3.append(" final = ");
                    sb3.append(this.L0);
                    sb3.append(" priority");
                    jg.g.s(this.W0, sb3);
                }
            }
            if (str2 != null) {
                this.M0 = new File(this.U0, str2);
                try {
                    this.R0 = new RandomAccessFile(this.M0, "rws");
                    if (this.a0 != 0 && !z10) {
                        long length6 = this.M0.length();
                        if (length6 <= 0 || length6 % 64 != 0) {
                            this.a0 = 0L;
                            this.Q = 0L;
                        } else {
                            this.R0.read(this.i0, 0, 64);
                        }
                    }
                } catch (Exception e25) {
                    this.a0 = 0L;
                    this.Q = 0L;
                    if (g0.F1(e25)) {
                        LaunchActivity.D(1);
                        a8.g(e25, false);
                    } else if (g0.G1(e25)) {
                        iz.h(this.L0);
                        a8.g(e25, false);
                    } else {
                        a8.g(e25, true);
                    }
                }
            }
            if (!this.y && this.a0 != 0 && this.b0 > 0 && this.M != null) {
                this.N = new ArrayList(this.M);
            }
            u7Var = this.g0;
            if (u7Var != null) {
                long j26 = this.a0;
                long j27 = this.b0;
                if (j26 != j27 && j27 > 0) {
                    u7Var.a(this, j26, j27);
                }
            }
            try {
                RandomAccessFile randomAccessFile22222 = new RandomAccessFile(this.J0, "rws");
                this.Q0 = randomAccessFile22222;
                j11 = this.a0;
                if (j11 != 0) {
                    randomAccessFile22222.seek(j11);
                }
                z11 = true;
                i10 = 0;
            } catch (Exception e26) {
                i10 = 0;
                a8.g(e26, false);
                if (g0.F1(e26)) {
                    LaunchActivity.D(1);
                    j(-1, true);
                    return;
                }
                z11 = true;
                if (g0.G1(e26)) {
                    iz.h(this.L0);
                    a8.g(e26, false);
                    j(-1, true);
                    return;
                }
            }
            if (this.Q0 == null) {
                j(i10, z11);
                return;
            } else {
                this.S = z11;
                Utilities.d.c(new y4(5, this, zArr2));
                return;
            }
        }
        TLRPC.InputFileLocation inputFileLocation = this.V;
        long j28 = inputFileLocation.volume_id;
        j3 = 0;
        if (j28 == 0 || inputFileLocation.local_id == 0) {
            if (this.T == 0 || inputFileLocation.id == 0) {
                j(0, true);
                return;
            }
            if (this.n0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.T);
                sb4.append("_");
                r12 = a8.p0.r(sb4, this.V.id, ".temp.enc");
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.T);
                sb5.append("_");
                sb5.append(this.V.id);
                s5 = a8.p0.s(sb5, this.P0, ".enc");
                if (this.h0 != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.T);
                    sb6.append("_");
                    r13 = a8.p0.r(sb6, this.V.id, "_64.iv.enc");
                    str5 = s5;
                }
                str5 = s5;
                r11 = null;
                str4 = null;
                str6 = r12;
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
                r10 = a8.p0.r(sb7, this.V.id, ".temp");
                str = this.T + "_" + this.V.id + this.P0;
                if (this.h0 != null) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(this.T);
                    sb8.append("_");
                    str2 = a8.p0.r(sb8, this.V.id, "_64.iv");
                } else {
                    str2 = null;
                }
                if (this.M != null) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(this.T);
                    sb9.append("_");
                    str3 = a8.p0.r(sb9, this.V.id, "_64.pt");
                } else {
                    str3 = null;
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(this.T);
                sb10.append("_");
                r11 = a8.p0.r(sb10, this.V.id, "_64.preload");
                str4 = str3;
                str5 = str;
                str6 = r10;
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
            int i21 = this.T;
            if (i21 == Integer.MIN_VALUE || j28 == -2147483648L || i21 == 0) {
                j(0, true);
                return;
            }
            if (this.n0) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(this.V.volume_id);
                sb11.append("_");
                r12 = a8.p0.n(this.V.local_id, ".temp.enc", sb11);
                StringBuilder sb12 = new StringBuilder();
                sb12.append(this.V.volume_id);
                sb12.append("_");
                sb12.append(this.V.local_id);
                sb12.append(".");
                s5 = a8.p0.s(sb12, this.P0, ".enc");
                if (this.h0 != null) {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(this.V.volume_id);
                    sb13.append("_");
                    r13 = a8.p0.n(this.V.local_id, "_64.iv.enc", sb13);
                    str5 = s5;
                }
                str5 = s5;
                r11 = null;
                str4 = null;
                str6 = r12;
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
                r10 = a8.p0.n(this.V.local_id, ".temp", sb14);
                str = this.V.volume_id + "_" + this.V.local_id + "." + this.P0;
                if (this.h0 != null) {
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(this.V.volume_id);
                    sb15.append("_");
                    str2 = a8.p0.n(this.V.local_id, "_64.iv", sb15);
                } else {
                    str2 = null;
                }
                if (this.M != null) {
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append(this.V.volume_id);
                    sb16.append("_");
                    str3 = a8.p0.n(this.V.local_id, "_64.pt", sb16);
                } else {
                    str3 = null;
                }
                StringBuilder sb17 = new StringBuilder();
                sb17.append(this.V.volume_id);
                sb17.append("_");
                r11 = a8.p0.n(this.V.local_id, "_64.preload", sb17);
                str4 = str3;
                str5 = str;
                str6 = r10;
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
        r11 = null;
        str4 = null;
        str6 = r12;
        str2 = r13;
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
    public final void s(int i7) {
        int i10;
        int max;
        int i11;
        long j3;
        int i12;
        int i13;
        long j10;
        long j11;
        long j12;
        TLObject tLObject;
        int i14;
        int i15;
        HashMap hashMap;
        f7 f7Var;
        ArrayList arrayList;
        int i16;
        Pair m10;
        boolean w10;
        Pair m11;
        i7 i7Var = this;
        Utilities.d.a(i7Var.h);
        boolean z9 = r2.a;
        int i17 = 1;
        if (i7Var.Y == 5) {
            i7Var.Y = 1;
        }
        if (i7Var.Z || i7Var.z0 || i7Var.Y != 1 || i7Var.A0) {
            return;
        }
        long j13 = 0;
        if (i7Var.j || i7Var.e0 != 0 || i7Var.K || i7Var.I0.size() + i7Var.G0.size() < i7Var.k0) {
            if (i7Var.y) {
                if (i7Var.Q > 2097152) {
                    return;
                }
                if (i7Var.G != 0 && i7Var.G0.size() > 0) {
                    return;
                }
            }
            ?? r10 = 0;
            if (i7Var.j) {
                max = Math.max(0, i7Var.k0 - i7Var.G0.size());
            } else {
                if (i7Var.e0 != 0 || i7Var.K || ((i7Var.y && i7Var.G == 0) || i7Var.b0 <= 0)) {
                    i10 = 1;
                    if (!i7Var.B0) {
                        r8 n10 = r8.n(i7Var.R);
                        Object obj = i7Var.p0;
                        Object[] objArr = {i7Var.V, i7Var};
                        Pair p10 = r8.p(objArr, obj);
                        if (p10 != null) {
                            TLRPC.InputFileLocation inputFileLocation = (TLRPC.InputFileLocation) p10.first;
                            String str = (String) p10.second;
                            String o4 = r8.o(obj);
                            if (o4 != null) {
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
                                o8 b10 = n10.b(str);
                                if (b10 == null || (m11 = n10.m(inputFileLocation, o4, b10.a, objArr)) == null) {
                                    o8 b11 = n10.b(o4);
                                    if (b11 != null && (m10 = n10.m(inputFileLocation, null, b11.a, objArr)) != null) {
                                        w10 = r8.w((byte[]) m10.first, (TLRPC.InputFileLocation) m10.second, inputFileLocation, objArr);
                                    }
                                } else {
                                    w10 = r8.w((byte[]) m11.first, (TLRPC.InputFileLocation) m11.second, inputFileLocation, objArr);
                                }
                                if (w10) {
                                    a8.b(i7Var.r + " before download updated file ref from file ref cache!");
                                }
                            }
                        }
                        w10 = false;
                        if (w10) {
                        }
                    }
                    i11 = 0;
                    i7 i7Var2 = i7Var;
                    while (i11 < i10) {
                        if (!i7Var2.y) {
                            j3 = j13;
                            ArrayList arrayList2 = i7Var2.O;
                            if (arrayList2 != null) {
                                long j14 = i7Var2.e0;
                                if (j14 == j3) {
                                    j14 = i7Var2.d0;
                                }
                                int size = arrayList2.size();
                                int i18 = r10;
                                long j15 = Long.MAX_VALUE;
                                long j16 = Long.MAX_VALUE;
                                while (true) {
                                    if (i18 >= size) {
                                        i12 = i17;
                                        i13 = i10;
                                        j11 = Long.MAX_VALUE;
                                        j10 = j15;
                                        break;
                                    }
                                    j11 = Long.MAX_VALUE;
                                    g7 g7Var = (g7) i7Var2.O.get(i18);
                                    if (j14 != j3) {
                                        i13 = i10;
                                        long j17 = g7Var.a;
                                        i12 = i17;
                                        j12 = j15;
                                        if (j17 <= j14 && g7Var.b > j14) {
                                            j10 = j14;
                                            j16 = Long.MAX_VALUE;
                                            break;
                                        } else if (j14 < j17 && j17 < j12) {
                                            j15 = j17;
                                            j16 = Math.min(j16, g7Var.a);
                                            i18++;
                                            i10 = i13;
                                            i17 = i12;
                                        }
                                    } else {
                                        i12 = i17;
                                        j12 = j15;
                                        i13 = i10;
                                    }
                                    j15 = j12;
                                    j16 = Math.min(j16, g7Var.a);
                                    i18++;
                                    i10 = i13;
                                    i17 = i12;
                                }
                                if (j10 == j11) {
                                    if (j16 == j11) {
                                        boolean z10 = r2.a;
                                        return;
                                    }
                                    j10 = j16;
                                }
                            } else {
                                i12 = i17;
                                i13 = i10;
                                j10 = i7Var2.Q;
                            }
                        } else {
                            if (i7Var2.G != 0 && i7Var2.F <= j13) {
                                boolean z11 = r2.a;
                                return;
                            }
                            j10 = i7Var2.C;
                            if (j10 == -1) {
                                int i19 = (TLObject.FLAG_21 / i7Var2.j0) + 2;
                                long j18 = j13;
                                while (true) {
                                    if (i19 == 0) {
                                        j3 = j13;
                                        j10 = j18;
                                        break;
                                    }
                                    if (!i7Var2.u.containsKey(Long.valueOf(j18))) {
                                        j10 = j18;
                                        i16 = i17;
                                        j3 = j13;
                                        break;
                                    }
                                    long j19 = i7Var2.j0;
                                    j18 += j19;
                                    long j20 = i7Var2.b0;
                                    if (j18 > j20) {
                                        j10 = j18;
                                        j3 = j13;
                                        break;
                                    }
                                    long j21 = j13;
                                    if (i7Var2.G == 2 && j18 == r1 * 8) {
                                        j18 = ((j20 - 1048576) / j19) * j19;
                                    }
                                    i19--;
                                    j13 = j21;
                                }
                                i16 = r10;
                                if (i16 == 0 && i7Var2.G0.isEmpty()) {
                                    i7Var2.k(r10, r10, r10);
                                }
                            } else {
                                j3 = j13;
                            }
                            if (i7Var2.u == null) {
                                i7Var2.u = new HashMap();
                            }
                            i7Var2.u.put(Long.valueOf(j10), Integer.valueOf(i17));
                            boolean z12 = r2.a;
                            StringBuilder t6 = a8.p0.t(j10, "start next preload from ", " size ");
                            t6.append(i7Var2.b0);
                            t6.append(" for ");
                            t6.append(i7Var2.A);
                            a8.b(t6.toString());
                            i7Var2.F -= i7Var2.j0;
                            i12 = i17;
                            i13 = i10;
                        }
                        int i20 = i7Var2.J;
                        if (i20 > 0 && j10 >= i20) {
                            if (((!i7Var2.j || i7Var2.W0 >= 3) ? 0 : i12) != 0) {
                                boolean z13 = r2.a;
                                return;
                            }
                        }
                        long j22 = i7Var2.b0;
                        if (j22 > j3 && j10 > j3 && j10 >= j22) {
                            boolean z14 = r2.a;
                            return;
                        }
                        if (!i7Var2.y && (arrayList = i7Var2.O) != null) {
                            i7Var2.c(j10, i7Var2.j0 + j10, arrayList, false);
                            boolean z15 = r2.a;
                        }
                        long j23 = i7Var2.b0;
                        boolean z16 = (j23 <= j3 || i11 == i13 + (-1) || (j23 > j3 && ((long) i7Var2.j0) + j10 >= j23)) ? i12 : 0;
                        int i21 = i7 == -1 ? ((i7Var2.l0 & (i7Var2.g - 1)) << 16) | 2 : i7;
                        int i22 = i7Var2.V0 ? 32 : 0;
                        if (i7Var2.f) {
                            i22 = j23 < 20480 ? i22 | 393216 : 262144 | i22;
                        }
                        if (i7Var2.u0) {
                            TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                            tL_upload_getCdnFile.file_token = i7Var2.x0;
                            tL_upload_getCdnFile.offset = j10;
                            tL_upload_getCdnFile.limit = i7Var2.j0;
                            i22 |= 1;
                            tLObject = tL_upload_getCdnFile;
                        } else if (i7Var2.W != null) {
                            TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                            tL_upload_getWebFile.location = i7Var2.W;
                            tL_upload_getWebFile.offset = (int) j10;
                            tL_upload_getWebFile.limit = i7Var2.j0;
                            tLObject = tL_upload_getWebFile;
                        } else {
                            TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                            tL_upload_getFile.location = i7Var2.V;
                            tL_upload_getFile.offset = j10;
                            tL_upload_getFile.limit = i7Var2.j0;
                            tL_upload_getFile.cdn_supported = i12;
                            tLObject = tL_upload_getFile;
                        }
                        int i23 = i22;
                        TLObject tLObject2 = tLObject;
                        i7Var2.Q += i7Var2.j0;
                        h7 h7Var = new h7();
                        i7Var2.G0.add(h7Var);
                        h7Var.e = j10;
                        h7Var.c = i7Var2.j0;
                        h7Var.i = i7Var2.e;
                        h7Var.d = i21;
                        if (!i7Var2.y && i7Var2.B && i7Var2.v != null && (hashMap = i7Var2.t) != null && (f7Var = (f7) hashMap.get(Long.valueOf(j10))) != null) {
                            h7Var.f = new TLRPC.TL_upload_file();
                            try {
                                boolean z17 = r2.a;
                            } catch (Exception unused) {
                            }
                            if (f7Var.b > 2147483647L) {
                                throw new RuntimeException("cast long to integer");
                            }
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) f7Var.b);
                            i7Var2.v.seek(f7Var.a);
                            i7Var2.v.getChannel().read(nativeByteBuffer.buffer);
                            nativeByteBuffer.buffer.position(0);
                            h7Var.f.bytes = nativeByteBuffer;
                            Utilities.d.c(new a7(i7Var2, h7Var, 1));
                            j13 = j3;
                            i14 = 0;
                            i15 = 1;
                            i11++;
                            r10 = i14;
                            i10 = i13;
                            i17 = i15;
                            i7Var2 = i7Var2;
                        }
                        if (i7Var2.e0 != j3) {
                            boolean z18 = r2.a;
                            jg.g.u(i7Var2.e0, new StringBuilder("frame get offset = "));
                            j13 = j3;
                            i7Var2.e0 = j13;
                            i7Var2.f0 = h7Var;
                        } else {
                            j13 = j3;
                        }
                        TLRPC.InputFileLocation inputFileLocation2 = i7Var2.V;
                        if ((inputFileLocation2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) && ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation2).photo_id == j13) {
                            i7Var2.p(h7Var);
                            i14 = 0;
                            i15 = 1;
                            i11++;
                            r10 = i14;
                            i10 = i13;
                            i17 = i15;
                            i7Var2 = i7Var2;
                        } else {
                            h7Var.i = i7Var2.e;
                            if (r2.a) {
                                h7Var.b = System.currentTimeMillis();
                            }
                            int i24 = i23 | 2048;
                            int i25 = i7Var2.u0 ? i7Var2.y0 : i7Var2.T;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7Var2.R);
                            int i26 = i21;
                            Object obj2 = i7Var2;
                            i7Var2 = obj2;
                            int i27 = i25;
                            int sendRequestSync = connectionsManager.sendRequestSync(tLObject2, new jg.s(i25, i26, 2, obj2, h7Var, tLObject2), null, null, i24, i27, i26, z16);
                            h7Var.a = sendRequestSync;
                            if (r2.a) {
                                StringBuilder sb2 = new StringBuilder("debug_loading: ");
                                sb2.append(i7Var2.L0.getName());
                                sb2.append(" dc=");
                                sb2.append(i27);
                                sb2.append(" send reqId ");
                                sb2.append(h7Var.a);
                                sb2.append(" offset=");
                                sb2.append(h7Var.e);
                                sb2.append(" conType=");
                                sb2.append(i26);
                                sb2.append(" priority=");
                                jg.g.s(i7Var2.W0, sb2);
                            }
                            i14 = 0;
                            g0.h3(new z6(i7Var2, sendRequestSync, i14));
                            i15 = 1;
                            i7Var2.l0++;
                            i11++;
                            r10 = i14;
                            i10 = i13;
                            i17 = i15;
                            i7Var2 = i7Var2;
                        }
                    }
                }
                max = Math.max(0, (i7Var.k0 - i7Var.G0.size()) - (i7Var.f ? i7Var.I0.size() : 0));
            }
            i10 = max;
            if (!i7Var.B0) {
            }
            i11 = 0;
            i7 i7Var22 = i7Var;
            while (i11 < i10) {
            }
        }
    }

    public final void t() {
        boolean z9 = !qp.s1(this.R).G3 && this.b0 > 0 && this.h0 == null && !this.n0 && !this.y && this.J == 0;
        this.f = z9;
        if (z9) {
            boolean q10 = p10.i(this.R).q();
            this.g = q10 ? 8 : 2;
            this.k0 = ((q10 ? 16 : 2) * TLObject.FLAG_20) / this.j0;
        }
    }

    public final void u() {
        if ((this.J > 0 || qp.s1(this.R).F3) && !this.e) {
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

    public i7(ew ewVar) {
        this.g = 2;
        this.h = new y6(this, 0);
        this.n = 131072;
        this.o = 4;
        this.p = 4;
        this.q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f1 = new y6(this, 5);
        u();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.V = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = ewVar.b;
        tL_inputSecureFileLocation.id = tL_secureFile.id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.T = tL_secureFile.dc_id;
        this.b0 = tL_secureFile.size;
        this.o0 = true;
        this.b1 = 67108864;
        this.P0 = ".jpg";
    }

    public i7(int i7, m20 m20Var) {
        this.g = 2;
        this.h = new y6(this, 0);
        this.n = 131072;
        this.o = 4;
        this.p = 4;
        this.q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f1 = new y6(this, 5);
        u();
        this.R = i7;
        this.X = m20Var;
        this.W = m20Var.b;
        this.b0 = m20Var.d;
        int i10 = qp.s1(i7).N3;
        this.T = i10;
        this.U = i10;
        String H = w7.H(m20Var.e);
        if (m20Var.e.startsWith("image/")) {
            this.b1 = 16777216;
        } else if (m20Var.e.equals("audio/ogg")) {
            this.b1 = ConnectionsManager.FileTypeAudio;
        } else if (m20Var.e.startsWith("video/")) {
            this.b1 = 33554432;
        } else {
            this.b1 = 67108864;
        }
        this.o0 = true;
        this.P0 = gc.B(m20Var.a, H);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x013d A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:8:0x0050, B:11:0x0062, B:12:0x00e6, B:14:0x00f0, B:18:0x00fc, B:20:0x0106, B:22:0x0110, B:23:0x0118, B:25:0x0120, B:28:0x012a, B:29:0x0133, B:31:0x013d, B:32:0x0162, B:34:0x016a, B:39:0x0142, B:41:0x014c, B:43:0x0150, B:46:0x0159, B:47:0x015e, B:48:0x0131, B:50:0x008a, B:52:0x008e, B:54:0x00a5, B:55:0x00a9, B:57:0x00ba, B:61:0x00c4, B:59:0x00d3, B:62:0x00d6, B:64:0x00da, B:66:0x00de, B:68:0x00e2), top: B:7:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #0 {Exception -> 0x0087, blocks: (B:8:0x0050, B:11:0x0062, B:12:0x00e6, B:14:0x00f0, B:18:0x00fc, B:20:0x0106, B:22:0x0110, B:23:0x0118, B:25:0x0120, B:28:0x012a, B:29:0x0133, B:31:0x013d, B:32:0x0162, B:34:0x016a, B:39:0x0142, B:41:0x014c, B:43:0x0150, B:46:0x0159, B:47:0x015e, B:48:0x0131, B:50:0x008a, B:52:0x008e, B:54:0x00a5, B:55:0x00a9, B:57:0x00ba, B:61:0x00c4, B:59:0x00d3, B:62:0x00d6, B:64:0x00da, B:66:0x00de, B:68:0x00e2), top: B:7:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142 A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:8:0x0050, B:11:0x0062, B:12:0x00e6, B:14:0x00f0, B:18:0x00fc, B:20:0x0106, B:22:0x0110, B:23:0x0118, B:25:0x0120, B:28:0x012a, B:29:0x0133, B:31:0x013d, B:32:0x0162, B:34:0x016a, B:39:0x0142, B:41:0x014c, B:43:0x0150, B:46:0x0159, B:47:0x015e, B:48:0x0131, B:50:0x008a, B:52:0x008e, B:54:0x00a5, B:55:0x00a9, B:57:0x00ba, B:61:0x00c4, B:59:0x00d3, B:62:0x00d6, B:64:0x00da, B:66:0x00de, B:68:0x00e2), top: B:7:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i7(Object obj, TLRPC.Document document) {
        boolean z9;
        long j3;
        String B;
        int lastIndexOf;
        this.g = 2;
        this.h = new y6(this, 0);
        this.n = 131072;
        this.o = 4;
        this.p = 4;
        this.q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f1 = new y6(this, 5);
        this.k = ij.L4(document);
        if (document != null && !ij.O2(document)) {
            "application/x-tgwallpattern".equals(document.mime_type);
        }
        u();
        try {
            this.p0 = obj;
            this.j = obj instanceof TL_stories.TL_storyItem;
            this.X0 = w7.E(obj);
            if (document instanceof TLRPC.TL_documentEncrypted) {
                TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
                this.V = tL_inputEncryptedFileLocation;
                tL_inputEncryptedFileLocation.id = document.id;
                tL_inputEncryptedFileLocation.access_hash = document.access_hash;
                int i7 = document.dc_id;
                this.T = i7;
                this.U = i7;
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
                int i10 = document.dc_id;
                this.T = i10;
                this.U = i10;
                this.o0 = true;
                int size = document.attributes.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                        this.B = true;
                        this.J = document.attributes.get(i11).preload_prefix_size;
                        break;
                    }
                    i11++;
                }
                if (this.j && this.B && this.J <= 0) {
                    this.J = TLObject.FLAG_19;
                }
            }
            if (!"application/x-tgsticker".equals(document.mime_type) && !"application/x-tgwallpattern".equals(document.mime_type)) {
                z9 = false;
                this.a1 = z9;
                j3 = document.size;
                this.b0 = j3;
                if (this.h0 != null && j3 % 16 != 0) {
                    long j10 = 16 - (j3 % 16);
                    this.c0 = j10;
                    this.b0 = j3 + j10;
                }
                B = w7.B(document);
                this.P0 = B;
                if (B != null && (lastIndexOf = B.lastIndexOf(46)) != -1) {
                    this.P0 = B.substring(lastIndexOf);
                    if (!"audio/ogg".equals(document.mime_type)) {
                        this.b1 = ConnectionsManager.FileTypeAudio;
                    } else {
                        String str = document.mime_type;
                        if (!"video/mp4".equals(str) && (!iz.D0 || !"video/x-matroska".equals(str))) {
                            this.b1 = 67108864;
                        }
                        this.b1 = 33554432;
                    }
                    if (this.P0.length() > 1) {
                        this.P0 = w7.C(document.mime_type);
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
            z9 = true;
            this.a1 = z9;
            j3 = document.size;
            this.b0 = j3;
            if (this.h0 != null) {
                long j102 = 16 - (j3 % 16);
                this.c0 = j102;
                this.b0 = j3 + j102;
            }
            B = w7.B(document);
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
        } catch (Exception e10) {
            a8.g(e10, true);
            j(0, true);
        }
    }
}
