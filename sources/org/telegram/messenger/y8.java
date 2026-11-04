package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y8 {
    public byte[] A;
    public final boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public String F;
    public long G;
    public int H;
    public RandomAccessFile I;
    public boolean J;
    public int K;
    public SharedPreferences L;
    public final int M;
    public int N;
    public long O;
    public boolean P;
    public long S;
    public volatile boolean T;
    public final int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public boolean i;
    public ArrayList j;
    public int k;
    public final String l;
    public int m;
    public byte[] n;
    public t7 o;
    public int r;
    public long s;
    public long t;
    public int u;
    public long v;
    public long w;
    public int x;
    public byte[] y;
    public byte[] z;
    public int f = 4;
    public final int[] g = new int[8];
    public int h = 65536;
    public final SparseIntArray p = new SparseIntArray();
    public final ArrayList q = new ArrayList();
    public final SparseArray Q = new SparseArray();
    public final boolean[] R = {false, false};

    public y8(int i3, int i10, long j10, String str, boolean z10) {
        this.a = i3;
        this.l = str;
        this.B = z10;
        this.G = j10;
        this.M = i10;
        this.P = (j10 == 0 || z10) ? false : true;
    }

    public final void a() {
        if (!this.P) {
            long j10 = this.t;
            long j11 = this.h;
            this.u = (int) (((j10 + j11) - 1) / j11);
        } else if (this.D) {
            long j12 = this.t;
            long j13 = this.h;
            this.u = ((int) ((((j12 - j13) + j13) - 1) / j13)) + 1;
        } else {
            long j14 = this.t - 1024;
            long j15 = this.h;
            this.u = ((int) (((j14 + j15) - 1) / j15)) + 1;
        }
    }

    public final void b() {
        if (this.L == null) {
            this.L = t0.b.getSharedPreferences("uploadinfo", 0);
        }
        this.L.edit().remove(this.F + "_time").remove(this.F + "_size").remove(this.F + "_uploaded").remove(this.F + "_id").remove(this.F + "_iv").remove(this.F + "_key").remove(this.F + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.I;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.I = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        String str = this.l;
        if (str == null) {
            Set set = z0.a;
        } else {
            z0.a.remove(str);
        }
    }

    public final void c() {
        if (this.m != 0) {
            return;
        }
        this.m = 1;
        String str = this.l;
        if (str == null) {
            Set set = z0.a;
        } else {
            z0.a.add(str);
        }
        Utilities.d.c(new u8(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x038d A[Catch: Exception -> 0x0058, TryCatch #3 {Exception -> 0x0058, blocks: (B:96:0x001c, B:100:0x004e, B:102:0x0055, B:103:0x0061, B:105:0x0065, B:107:0x006e, B:108:0x0070, B:110:0x0087, B:112:0x0090, B:113:0x0097, B:117:0x00aa, B:120:0x00c3, B:122:0x00c7, B:124:0x00ca, B:125:0x00cc, B:128:0x00d4, B:131:0x00f1, B:133:0x00f5, B:134:0x00ff, B:136:0x0103, B:138:0x010d, B:141:0x012a, B:143:0x0161, B:145:0x0165, B:147:0x016d, B:149:0x0173, B:151:0x01c7, B:154:0x0200, B:157:0x0212, B:159:0x0215, B:161:0x0218, B:165:0x0229, B:167:0x022d, B:173:0x0250, B:176:0x025d, B:178:0x026a, B:180:0x0274, B:182:0x0278, B:183:0x027e, B:185:0x0289, B:187:0x0292, B:191:0x029d, B:193:0x02a4, B:195:0x02bb, B:197:0x0290, B:203:0x0313, B:204:0x0331, B:206:0x033d, B:208:0x0341, B:210:0x0349, B:212:0x0381, B:214:0x038d, B:216:0x0391, B:217:0x03a6, B:218:0x039f, B:11:0x03be, B:18:0x03cf, B:20:0x03da, B:21:0x03ef, B:27:0x0402, B:29:0x0406, B:33:0x0417, B:35:0x041b, B:37:0x0423, B:44:0x0441, B:46:0x0448, B:50:0x047a, B:52:0x048f, B:53:0x0496, B:57:0x04b0, B:59:0x04b4, B:85:0x0492, B:90:0x042e, B:93:0x03e4, B:228:0x037e, B:229:0x02c7, B:231:0x02d0, B:233:0x02ec, B:235:0x02f4, B:237:0x02f7, B:239:0x02ff, B:242:0x023a, B:251:0x00a0, B:255:0x005b, B:256:0x03a9, B:257:0x03b0, B:260:0x0048, B:220:0x034e, B:223:0x0369, B:98:0x002a), top: B:95:0x001c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x034e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z10;
        boolean z11;
        int i3;
        byte[] bArr;
        boolean z12;
        long j10;
        boolean z13;
        int read;
        final byte[] bArr2;
        int i10;
        TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart;
        int i11;
        int i12;
        int i13;
        boolean z14 = true;
        int i14 = 1;
        if (this.m != 1) {
            return;
        }
        try {
            this.J = true;
            RandomAccessFile randomAccessFile = this.I;
            String str = this.l;
            int i15 = this.a;
            boolean z15 = this.B;
            if (randomAccessFile == null) {
                try {
                    File file = new File(str);
                    this.I = new RandomAccessFile(file, "r");
                    try {
                        z10 = g0.I1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(this.I.getFD(), null)).intValue());
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        z10 = false;
                    }
                    if (z10) {
                        throw new Exception("trying to upload internal file");
                    }
                    long j11 = this.G;
                    if (j11 != 0) {
                        this.t = j11;
                    } else {
                        this.t = file.length();
                    }
                    if (!this.E && this.t > 10485760) {
                        this.D = true;
                    }
                    long j12 = hp.s1(i15).q6;
                    if (h10.i(c.a(i15).a).q() && this.t > 2097152000) {
                        j12 = hp.s1(i15).r6;
                    }
                    z11 = z15;
                    long j13 = j12 * 1024;
                    int max = (int) Math.max(this.i ? 32L : this.D ? 512L : 128L, ((this.t + j13) - 1) / j13);
                    this.h = max;
                    if (1024 % max != 0) {
                        int i16 = 64;
                        while (this.h > i16) {
                            i16 *= 2;
                        }
                        this.h = i16;
                    }
                    this.e = Math.max(1, (this.i ? 32 : TLObject.FLAG_13) / this.h);
                    this.f = h10.i(c.a(i15).a).q() ? 8 : 4;
                    if (z11) {
                        this.j = new ArrayList(this.e);
                        for (int i17 = 0; i17 < this.e; i17++) {
                            this.j.add(new byte[32]);
                        }
                    }
                    this.h *= 1024;
                    a();
                    this.n = new byte[this.h];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(z11 ? "enc" : "");
                    this.F = Utilities.a(sb2.toString());
                    long j14 = this.L.getLong(this.F + "_size", 0L);
                    this.H = (int) (System.currentTimeMillis() / 1000);
                    if (!this.P && !this.c && this.G == 0 && j14 == this.t) {
                        this.s = this.L.getLong(this.F + "_id", 0L);
                        int i18 = this.L.getInt(this.F + "_time", 0);
                        long j15 = this.L.getLong(this.F + "_uploaded", 0L);
                        if (z11) {
                            String string = this.L.getString(this.F + "_iv", null);
                            j10 = j15;
                            String string2 = this.L.getString(this.F + "_key", null);
                            if (string != null && string2 != null) {
                                this.y = Utilities.v(string2);
                                byte[] v = Utilities.v(string);
                                this.z = v;
                                byte[] bArr3 = this.y;
                                if (bArr3 != null && v != null && bArr3.length == 32 && v.length == 32) {
                                    byte[] bArr4 = new byte[32];
                                    this.A = bArr4;
                                    System.arraycopy(v, 0, bArr4, 0, 32);
                                }
                            }
                            z12 = true;
                            if (!z12 && i18 != 0) {
                                z13 = this.D;
                                if (!z13) {
                                }
                                if (!z13 && i18 < this.H - 5400.0f) {
                                    i18 = 0;
                                }
                                if (i18 == 0) {
                                    i3 = i15;
                                } else if (j10 > 0) {
                                    this.v = j10;
                                    this.r = (int) (j10 / this.h);
                                    if (!z13) {
                                        int i19 = 0;
                                        while (true) {
                                            i3 = i15;
                                            if (i19 >= this.v / this.h) {
                                                break;
                                            }
                                            int read2 = this.I.read(this.n);
                                            int i20 = (!z11 || read2 % 16 == 0) ? 0 : 16 - (read2 % 16);
                                            int i21 = read2 + i20;
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i21);
                                            if (read2 != this.h || this.u == this.r + 1) {
                                                this.b = true;
                                            }
                                            int i22 = 0;
                                            nativeByteBuffer.writeBytes(this.n, 0, read2);
                                            if (z11) {
                                                int i23 = 0;
                                                while (i23 < i20) {
                                                    nativeByteBuffer.writeByte(i22);
                                                    i23++;
                                                    i22 = 0;
                                                }
                                                Utilities.c(nativeByteBuffer.buffer, this.y, this.A, true, true, 0, i21);
                                            }
                                            nativeByteBuffer.reuse();
                                            i19++;
                                            i15 = i3;
                                        }
                                    } else {
                                        i3 = i15;
                                        this.I.seek(j10);
                                        if (z11) {
                                            bArr = null;
                                            String string3 = this.L.getString(this.F + "_ivc", null);
                                            if (string3 != null) {
                                                byte[] v10 = Utilities.v(string3);
                                                this.A = v10;
                                                if (v10 == null || v10.length != 32) {
                                                    this.v = 0L;
                                                    this.r = 0;
                                                }
                                                if (z12) {
                                                    if (z11) {
                                                        byte[] bArr5 = new byte[32];
                                                        this.z = bArr5;
                                                        this.y = new byte[32];
                                                        this.A = new byte[32];
                                                        SecureRandom secureRandom = Utilities.b;
                                                        secureRandom.nextBytes(bArr5);
                                                        secureRandom.nextBytes(this.y);
                                                        System.arraycopy(this.z, 0, this.A, 0, 32);
                                                    }
                                                    this.s = Utilities.b.nextLong();
                                                    if (!this.c && !this.P && this.G == 0) {
                                                        f();
                                                    }
                                                }
                                                if (z11) {
                                                    try {
                                                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                                        byte[] bArr6 = new byte[64];
                                                        System.arraycopy(this.y, 0, bArr6, 0, 32);
                                                        System.arraycopy(this.z, 0, bArr6, 32, 32);
                                                        byte[] digest = messageDigest.digest(bArr6);
                                                        for (int i24 = 0; i24 < 4; i24++) {
                                                            this.C |= ((digest[i24] ^ digest[i24 + 4]) & hs.e4) << (i24 * 8);
                                                        }
                                                    } catch (Exception e10) {
                                                        a8.g(e10, true);
                                                    }
                                                }
                                                this.w = this.v;
                                                this.N = this.r;
                                                if (this.P) {
                                                    if (this.D) {
                                                        this.I.seek(this.h);
                                                        this.v = this.h;
                                                    } else {
                                                        this.I.seek(1024L);
                                                        this.v = 1024L;
                                                    }
                                                    this.r = 1;
                                                }
                                            } else {
                                                this.v = 0L;
                                                this.r = 0;
                                            }
                                            z12 = true;
                                            if (z12) {
                                            }
                                            if (z11) {
                                            }
                                            this.w = this.v;
                                            this.N = this.r;
                                            if (this.P) {
                                            }
                                        }
                                    }
                                }
                                bArr = null;
                                if (z12) {
                                }
                                if (z11) {
                                }
                                this.w = this.v;
                                this.N = this.r;
                                if (this.P) {
                                }
                            }
                        } else {
                            j10 = j15;
                        }
                        z12 = false;
                        if (!z12) {
                            z13 = this.D;
                            if (!z13 || i18 >= this.H - 86400) {
                                if (!z13) {
                                }
                                if (i18 == 0) {
                                }
                                bArr = null;
                                if (z12) {
                                }
                                if (z11) {
                                }
                                this.w = this.v;
                                this.N = this.r;
                                if (this.P) {
                                }
                            }
                            i18 = 0;
                            if (i18 == 0) {
                            }
                            bArr = null;
                            if (z12) {
                            }
                            if (z11) {
                            }
                            this.w = this.v;
                            this.N = this.r;
                            if (this.P) {
                            }
                        }
                    }
                    i3 = i15;
                    bArr = null;
                    z12 = true;
                    if (z12) {
                    }
                    if (z11) {
                    }
                    this.w = this.v;
                    this.N = this.r;
                    if (this.P) {
                    }
                } catch (Exception e11) {
                    e = e11;
                    a8.g(e, z14);
                    this.m = 4;
                    this.o.a();
                    b();
                    return;
                }
            } else {
                i3 = i15;
                bArr = null;
                z11 = z15;
            }
            if (this.G == 0 || this.v + this.h <= this.O) {
                if (this.c) {
                    this.I.seek(0L);
                    if (this.D) {
                        read = this.I.read(this.n);
                        i13 = 0;
                    } else {
                        i13 = 0;
                        read = this.I.read(this.n, 0, 1024);
                    }
                    this.r = i13;
                } else {
                    read = this.I.read(this.n);
                }
                final int i25 = read;
                if (i25 == -1) {
                    return;
                }
                int i26 = (!z11 || i25 % 16 == 0) ? 0 : 16 - (i25 % 16);
                int i27 = i25 + i26;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i27);
                if (this.c || i25 != this.h || (this.G == 0 && this.u == this.r + 1)) {
                    if (this.P) {
                        this.c = true;
                        this.P = false;
                    } else {
                        this.b = true;
                    }
                }
                int i28 = 0;
                nativeByteBuffer2.writeBytes(this.n, 0, i25);
                if (z11) {
                    int i29 = 0;
                    while (i29 < i26) {
                        nativeByteBuffer2.writeByte(i28);
                        i29++;
                        i28 = 0;
                    }
                    Utilities.c(nativeByteBuffer2.buffer, this.y, this.A, true, true, 0, i27);
                    byte[] bArr7 = (byte[]) this.j.get(0);
                    System.arraycopy(this.A, 0, bArr7, 0, 32);
                    this.j.remove(0);
                    bArr2 = bArr7;
                } else {
                    bArr2 = bArr;
                }
                if (this.D) {
                    TLRPC.TL_upload_saveBigFilePart tL_upload_saveBigFilePart = new TLRPC.TL_upload_saveBigFilePart();
                    i10 = this.r;
                    tL_upload_saveBigFilePart.file_part = i10;
                    tL_upload_saveBigFilePart.file_id = this.s;
                    if (this.G != 0) {
                        tL_upload_saveBigFilePart.file_total_parts = -1;
                    } else {
                        tL_upload_saveBigFilePart.file_total_parts = this.u;
                    }
                    tL_upload_saveBigFilePart.bytes = nativeByteBuffer2;
                    tL_upload_saveFilePart = tL_upload_saveBigFilePart;
                } else {
                    TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart2 = new TLRPC.TL_upload_saveFilePart();
                    i10 = this.r;
                    tL_upload_saveFilePart2.file_part = i10;
                    tL_upload_saveFilePart2.file_id = this.s;
                    tL_upload_saveFilePart2.bytes = nativeByteBuffer2;
                    tL_upload_saveFilePart = tL_upload_saveFilePart2;
                }
                TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart3 = tL_upload_saveFilePart;
                final int i30 = i10;
                if (this.b && this.c) {
                    this.c = false;
                    this.r = this.u - 1;
                    this.I.seek(this.t);
                }
                this.v += i25;
                this.r++;
                this.K++;
                final int i31 = this.k;
                this.k = i31 + 1;
                final long j16 = i30 + i25;
                final int objectSize = tL_upload_saveFilePart3.getObjectSize() + 4;
                final int i32 = this.d;
                boolean z16 = this.i;
                int[] iArr = this.g;
                if (z16) {
                    i11 = 1;
                    i12 = 4;
                } else {
                    int i33 = i31 % this.f;
                    int i34 = 1;
                    while (true) {
                        int i35 = this.f;
                        if (i34 >= i35) {
                            break;
                        }
                        int i36 = (i31 + i34) % i35;
                        int i37 = i14;
                        if (iArr[i36] < iArr[i33]) {
                            i33 = i36;
                        }
                        i34++;
                        i14 = i37;
                    }
                    i11 = i14;
                    i12 = (i33 << 16) | 4;
                }
                final int i38 = i12 >> 16;
                iArr[i38] = iArr[i38] + 1;
                System.currentTimeMillis();
                final int[] iArr2 = new int[i11];
                iArr2[0] = ConnectionsManager.getInstance(i3).sendRequest(tL_upload_saveFilePart3, new RequestDelegate() { // from class: org.telegram.messenger.v8
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        int i39;
                        int i40;
                        SparseArray sparseArray;
                        int i41;
                        String str2;
                        y8 y8Var;
                        long j17;
                        int i42;
                        String str3;
                        String str4;
                        int i43;
                        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
                        TLRPC.InputFile tL_inputFile;
                        y8 y8Var2 = y8.this;
                        int i44 = i32;
                        int i45 = i38;
                        int[] iArr3 = iArr2;
                        int i46 = objectSize;
                        byte[] bArr8 = bArr2;
                        int i47 = i31;
                        int i48 = i25;
                        int i49 = i30;
                        long j18 = j16;
                        int i50 = y8Var2.M;
                        SparseArray sparseArray2 = y8Var2.Q;
                        String str5 = y8Var2.l;
                        int i51 = y8Var2.a;
                        if (i44 != y8Var2.d) {
                            return;
                        }
                        int[] iArr4 = y8Var2.g;
                        iArr4[i45] = iArr4[i45] - 1;
                        if (r2.a) {
                            i39 = 0;
                            a8.b("debug_uploading:  response reqId " + iArr3[0] + " time" + str5);
                        } else {
                            i39 = 0;
                        }
                        int f10 = tLObject != null ? tLObject.networkType : t0.f();
                        if (i50 == 50331648) {
                            bz.e(i51).j(f10, 3, i46);
                            i40 = i50;
                            i41 = 5;
                            sparseArray = sparseArray2;
                        } else {
                            i40 = i50;
                            if (i40 == 33554432) {
                                sparseArray = sparseArray2;
                                bz.e(i51).j(f10, 2, i46);
                            } else {
                                sparseArray = sparseArray2;
                                if (i40 == 16777216) {
                                    bz.e(i51).j(f10, 4, i46);
                                } else if (i40 == 67108864) {
                                    if (str5 == null || !(str5.toLowerCase().endsWith("mp3") || str5.toLowerCase().endsWith("m4a"))) {
                                        long j19 = i46;
                                        i41 = 5;
                                        bz.e(i51).j(f10, 5, j19);
                                    } else {
                                        bz.e(i51).j(f10, 7, i46);
                                    }
                                }
                            }
                            i41 = 5;
                        }
                        if (bArr8 != null) {
                            y8Var2.j.add(bArr8);
                        }
                        y8Var2.p.delete(i47);
                        g0.h3(new w8(y8Var2, iArr3, 1));
                        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                            y8Var2.m = 4;
                            y8Var2.o.a();
                            y8Var2.b();
                            return;
                        }
                        if (y8Var2.m != 1) {
                            return;
                        }
                        y8Var2.w += i48;
                        long j20 = y8Var2.G;
                        long max2 = j20 != 0 ? Math.max(y8Var2.O, j20) : y8Var2.t;
                        t7 t7Var = y8Var2.o;
                        int i52 = i41;
                        long j21 = y8Var2.w;
                        jb jbVar = t7Var.d.F;
                        if (jbVar != null) {
                            y8Var = y8Var2;
                            str3 = "m4a";
                            str2 = str5;
                            j17 = 0;
                            i42 = i39;
                            jbVar.a(y8Var, t7Var.b, j21, max2, t7Var.a);
                        } else {
                            str2 = str5;
                            y8Var = y8Var2;
                            j17 = 0;
                            i42 = i39;
                            str3 = "m4a";
                        }
                        int i53 = y8Var.K - 1;
                        y8Var.K = i53;
                        if (!y8Var.b || i53 != 0 || y8Var.m != 1) {
                            y8 y8Var3 = y8Var;
                            if (i53 < y8Var3.e) {
                                if (y8Var3.G == j17 && !y8Var3.P && !y8Var3.c) {
                                    if (y8Var3.x >= 4) {
                                        y8Var3.x = i42;
                                    }
                                    int i54 = y8Var3.N;
                                    if (i49 == i54) {
                                        y8Var3.N = i54 + 1;
                                        long j22 = j18;
                                        while (true) {
                                            SparseArray sparseArray3 = sparseArray;
                                            x8 x8Var = (x8) sparseArray3.get(y8Var3.N);
                                            if (x8Var == null) {
                                                break;
                                            }
                                            j22 = x8Var.a;
                                            bArr8 = x8Var.b;
                                            sparseArray3.remove(y8Var3.N);
                                            y8Var3.N++;
                                            sparseArray = sparseArray3;
                                        }
                                        boolean z17 = y8Var3.D;
                                        if ((z17 && j22 % 1048576 == j17) || (!z17 && y8Var3.x == 0)) {
                                            SharedPreferences.Editor edit = y8Var3.L.edit();
                                            edit.putLong(a1.g.s(new StringBuilder(), y8Var3.F, "_uploaded"), j22);
                                            if (y8Var3.B) {
                                                edit.putString(a1.g.s(new StringBuilder(), y8Var3.F, "_ivc"), Utilities.f(bArr8));
                                            }
                                            edit.commit();
                                        }
                                    } else {
                                        SparseArray sparseArray4 = sparseArray;
                                        x8 x8Var2 = new x8();
                                        x8Var2.a = j18;
                                        if (bArr8 != null) {
                                            byte[] bArr9 = new byte[32];
                                            x8Var2.b = bArr9;
                                            System.arraycopy(bArr8, i42, bArr9, i42, 32);
                                        }
                                        sparseArray4.put(i49, x8Var2);
                                    }
                                    y8Var3.x++;
                                }
                                y8Var3.e();
                                return;
                            }
                            return;
                        }
                        y8Var.m = 3;
                        if (y8Var.y == null) {
                            if (y8Var.D) {
                                tL_inputFile = new TLRPC.TL_inputFileBig();
                            } else {
                                tL_inputFile = new TLRPC.TL_inputFile();
                                tL_inputFile.md5_checksum = "";
                            }
                            TLRPC.InputFile inputFile = tL_inputFile;
                            inputFile.parts = y8Var.r;
                            inputFile.id = y8Var.s;
                            inputFile.name = str2.substring(str2.lastIndexOf("/") + 1);
                            String str6 = str3;
                            y8 y8Var4 = y8Var;
                            t7 t7Var2 = y8Var4.o;
                            t7Var2.getClass();
                            str4 = str6;
                            i43 = i52;
                            w7.K.c(new ml(t7Var2, t7Var2.a, t7Var2.b, t7Var2.c, inputFile, (TLRPC.InputEncryptedFile) null, (byte[]) null, (byte[]) null, y8Var4));
                            y8Var4.b();
                        } else {
                            str4 = str3;
                            i43 = i52;
                            y8 y8Var5 = y8Var;
                            if (y8Var5.D) {
                                tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileBigUploaded();
                            } else {
                                tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileUploaded();
                                tL_inputEncryptedFileUploaded.md5_checksum = "";
                            }
                            TLRPC.InputEncryptedFile inputEncryptedFile = tL_inputEncryptedFileUploaded;
                            inputEncryptedFile.parts = y8Var5.r;
                            inputEncryptedFile.id = y8Var5.s;
                            inputEncryptedFile.key_fingerprint = y8Var5.C;
                            t7 t7Var3 = y8Var5.o;
                            byte[] bArr10 = y8Var5.y;
                            byte[] bArr11 = y8Var5.z;
                            t7Var3.getClass();
                            w7.K.c(new ml(t7Var3, t7Var3.a, t7Var3.b, t7Var3.c, (TLRPC.InputFile) null, inputEncryptedFile, bArr10, bArr11, y8Var5));
                            y8Var5.b();
                        }
                        if (i40 == 50331648) {
                            bz.e(i51).k(t0.f(), 3, 1);
                            return;
                        }
                        if (i40 == 33554432) {
                            bz.e(i51).k(t0.f(), 2, 1);
                            return;
                        }
                        if (i40 == 16777216) {
                            bz.e(i51).k(t0.f(), 4, 1);
                            return;
                        }
                        if (i40 == 67108864) {
                            if (str2 == null || !(str2.toLowerCase().endsWith("mp3") || str2.toLowerCase().endsWith(str4))) {
                                bz.e(i51).k(t0.f(), i43, 1);
                            } else {
                                bz.e(i51).k(t0.f(), 7, 1);
                            }
                        }
                    }
                }, null, new p1(this, 3), this.E ? 4 : 0, ConnectionsManager.DEFAULT_DATACENTER_ID, i12, true);
                if (r2.a) {
                    StringBuilder sb3 = new StringBuilder("debug_uploading:  send reqId ");
                    sb3.append(iArr2[0]);
                    sb3.append(" ");
                    sb3.append(str);
                    sb3.append(" file_part=");
                    sb3.append(i30);
                    sb3.append(" isBig=");
                    sb3.append(this.D);
                    sb3.append(" file_id=");
                    k2.p1.r(this.s, sb3);
                }
                this.p.put(i31, iArr2[0]);
                g0.h3(new w8(this, iArr2, 0));
            }
        } catch (Exception e12) {
            e = e12;
            z14 = true;
        }
    }

    public final void e() {
        int i3;
        while (this.m == 1 && (i3 = this.K) < this.e) {
            d();
            if (this.K == i3) {
                return;
            }
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = this.L.edit();
        edit.putInt(a1.g.s(new StringBuilder(), this.F, "_time"), this.H);
        edit.putLong(a1.g.s(new StringBuilder(), this.F, "_size"), this.t);
        edit.putLong(a1.g.s(new StringBuilder(), this.F, "_id"), this.s);
        edit.remove(this.F + "_uploaded");
        if (this.B) {
            edit.putString(a1.g.s(new StringBuilder(), this.F, "_iv"), Utilities.f(this.z));
            edit.putString(a1.g.s(new StringBuilder(), this.F, "_ivc"), Utilities.f(this.A));
            edit.putString(a1.g.s(new StringBuilder(), this.F, "_key"), Utilities.f(this.y));
        }
        edit.commit();
    }
}
