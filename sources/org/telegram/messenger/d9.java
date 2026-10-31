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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d9 {
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
    public y7 o;
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

    public d9(int i10, int i11, long j10, String str, boolean z10) {
        this.a = i10;
        this.l = str;
        this.B = z10;
        this.G = j10;
        this.M = i11;
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
            this.L = w0.b.getSharedPreferences("uploadinfo", 0);
        }
        this.L.edit().remove(this.F + "_time").remove(this.F + "_size").remove(this.F + "_uploaded").remove(this.F + "_id").remove(this.F + "_iv").remove(this.F + "_key").remove(this.F + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.I;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.I = null;
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        String str = this.l;
        if (str == null) {
            Set set = c1.a;
        } else {
            c1.a.remove(str);
        }
    }

    public final void c() {
        if (this.m != 0) {
            return;
        }
        this.m = 1;
        String str = this.l;
        if (str == null) {
            Set set = c1.a;
        } else {
            c1.a.add(str);
        }
        Utilities.d.c(new z8(this, 0));
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
        int i10;
        byte[] bArr;
        boolean z12;
        long j10;
        boolean z13;
        int read;
        final byte[] bArr2;
        int i11;
        TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart;
        int i12;
        int i13;
        int i14;
        boolean z14 = true;
        int i15 = 1;
        if (this.m != 1) {
            return;
        }
        try {
            this.J = true;
            RandomAccessFile randomAccessFile = this.I;
            String str = this.l;
            int i16 = this.a;
            boolean z15 = this.B;
            if (randomAccessFile == null) {
                try {
                    File file = new File(str);
                    this.I = new RandomAccessFile(file, "r");
                    try {
                        z10 = i0.I1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(this.I.getFD(), null)).intValue());
                    } catch (Throwable th2) {
                        f8.g(th2, true);
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
                    long j12 = vp.r1(i16).r6;
                    if (d20.i(c.a(i16).a).q() && this.t > 2097152000) {
                        j12 = vp.r1(i16).s6;
                    }
                    z11 = z15;
                    long j13 = j12 * 1024;
                    int max = (int) Math.max(this.i ? 32L : this.D ? 512L : 128L, ((this.t + j13) - 1) / j13);
                    this.h = max;
                    if (1024 % max != 0) {
                        int i17 = 64;
                        while (this.h > i17) {
                            i17 *= 2;
                        }
                        this.h = i17;
                    }
                    this.e = Math.max(1, (this.i ? 32 : TLObject.FLAG_13) / this.h);
                    this.f = d20.i(c.a(i16).a).q() ? 8 : 4;
                    if (z11) {
                        this.j = new ArrayList(this.e);
                        for (int i18 = 0; i18 < this.e; i18++) {
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
                        int i19 = this.L.getInt(this.F + "_time", 0);
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
                            if (!z12 && i19 != 0) {
                                z13 = this.D;
                                if (!z13) {
                                }
                                if (!z13 && i19 < this.H - 5400.0f) {
                                    i19 = 0;
                                }
                                if (i19 == 0) {
                                    i10 = i16;
                                } else if (j10 > 0) {
                                    this.v = j10;
                                    this.r = (int) (j10 / this.h);
                                    if (!z13) {
                                        int i20 = 0;
                                        while (true) {
                                            i10 = i16;
                                            if (i20 >= this.v / this.h) {
                                                break;
                                            }
                                            int read2 = this.I.read(this.n);
                                            int i21 = (!z11 || read2 % 16 == 0) ? 0 : 16 - (read2 % 16);
                                            int i22 = read2 + i21;
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i22);
                                            if (read2 != this.h || this.u == this.r + 1) {
                                                this.b = true;
                                            }
                                            int i23 = 0;
                                            nativeByteBuffer.writeBytes(this.n, 0, read2);
                                            if (z11) {
                                                int i24 = 0;
                                                while (i24 < i21) {
                                                    nativeByteBuffer.writeByte(i23);
                                                    i24++;
                                                    i23 = 0;
                                                }
                                                Utilities.c(nativeByteBuffer.buffer, this.y, this.A, true, true, 0, i22);
                                            }
                                            nativeByteBuffer.reuse();
                                            i20++;
                                            i16 = i10;
                                        }
                                    } else {
                                        i10 = i16;
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
                                                        for (int i25 = 0; i25 < 4; i25++) {
                                                            this.C |= ((digest[i25] ^ digest[i25 + 4]) & zs.e4) << (i25 * 8);
                                                        }
                                                    } catch (Exception e) {
                                                        f8.g(e, true);
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
                            if (!z13 || i19 >= this.H - 86400) {
                                if (!z13) {
                                }
                                if (i19 == 0) {
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
                            i19 = 0;
                            if (i19 == 0) {
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
                    i10 = i16;
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
                } catch (Exception e7) {
                    e = e7;
                    f8.g(e, z14);
                    this.m = 4;
                    this.o.a();
                    b();
                    return;
                }
            } else {
                i10 = i16;
                bArr = null;
                z11 = z15;
            }
            if (this.G == 0 || this.v + this.h <= this.O) {
                if (this.c) {
                    this.I.seek(0L);
                    if (this.D) {
                        read = this.I.read(this.n);
                        i14 = 0;
                    } else {
                        i14 = 0;
                        read = this.I.read(this.n, 0, 1024);
                    }
                    this.r = i14;
                } else {
                    read = this.I.read(this.n);
                }
                final int i26 = read;
                if (i26 == -1) {
                    return;
                }
                int i27 = (!z11 || i26 % 16 == 0) ? 0 : 16 - (i26 % 16);
                int i28 = i26 + i27;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i28);
                if (this.c || i26 != this.h || (this.G == 0 && this.u == this.r + 1)) {
                    if (this.P) {
                        this.c = true;
                        this.P = false;
                    } else {
                        this.b = true;
                    }
                }
                int i29 = 0;
                nativeByteBuffer2.writeBytes(this.n, 0, i26);
                if (z11) {
                    int i30 = 0;
                    while (i30 < i27) {
                        nativeByteBuffer2.writeByte(i29);
                        i30++;
                        i29 = 0;
                    }
                    Utilities.c(nativeByteBuffer2.buffer, this.y, this.A, true, true, 0, i28);
                    byte[] bArr7 = (byte[]) this.j.get(0);
                    System.arraycopy(this.A, 0, bArr7, 0, 32);
                    this.j.remove(0);
                    bArr2 = bArr7;
                } else {
                    bArr2 = bArr;
                }
                if (this.D) {
                    TLRPC.TL_upload_saveBigFilePart tL_upload_saveBigFilePart = new TLRPC.TL_upload_saveBigFilePart();
                    i11 = this.r;
                    tL_upload_saveBigFilePart.file_part = i11;
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
                    i11 = this.r;
                    tL_upload_saveFilePart2.file_part = i11;
                    tL_upload_saveFilePart2.file_id = this.s;
                    tL_upload_saveFilePart2.bytes = nativeByteBuffer2;
                    tL_upload_saveFilePart = tL_upload_saveFilePart2;
                }
                TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart3 = tL_upload_saveFilePart;
                final int i31 = i11;
                if (this.b && this.c) {
                    this.c = false;
                    this.r = this.u - 1;
                    this.I.seek(this.t);
                }
                this.v += i26;
                this.r++;
                this.K++;
                final int i32 = this.k;
                this.k = i32 + 1;
                final long j16 = i31 + i26;
                final int objectSize = tL_upload_saveFilePart3.getObjectSize() + 4;
                final int i33 = this.d;
                boolean z16 = this.i;
                int[] iArr = this.g;
                if (z16) {
                    i12 = 1;
                    i13 = 4;
                } else {
                    int i34 = i32 % this.f;
                    int i35 = 1;
                    while (true) {
                        int i36 = this.f;
                        if (i35 >= i36) {
                            break;
                        }
                        int i37 = (i32 + i35) % i36;
                        int i38 = i15;
                        if (iArr[i37] < iArr[i34]) {
                            i34 = i37;
                        }
                        i35++;
                        i15 = i38;
                    }
                    i12 = i15;
                    i13 = (i34 << 16) | 4;
                }
                final int i39 = i13 >> 16;
                iArr[i39] = iArr[i39] + 1;
                System.currentTimeMillis();
                final int[] iArr2 = new int[i12];
                iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_upload_saveFilePart3, new RequestDelegate() { // from class: org.telegram.messenger.a9
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        int i40;
                        int i41;
                        SparseArray sparseArray;
                        int i42;
                        String str2;
                        d9 d9Var;
                        long j17;
                        int i43;
                        String str3;
                        String str4;
                        int i44;
                        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
                        TLRPC.InputFile tL_inputFile;
                        d9 d9Var2 = d9.this;
                        int i45 = i33;
                        int i46 = i39;
                        int[] iArr3 = iArr2;
                        int i47 = objectSize;
                        byte[] bArr8 = bArr2;
                        int i48 = i32;
                        int i49 = i26;
                        int i50 = i31;
                        long j18 = j16;
                        int i51 = d9Var2.M;
                        SparseArray sparseArray2 = d9Var2.Q;
                        String str5 = d9Var2.l;
                        int i52 = d9Var2.a;
                        if (i45 != d9Var2.d) {
                            return;
                        }
                        int[] iArr4 = d9Var2.g;
                        iArr4[i46] = iArr4[i46] - 1;
                        if (v2.a) {
                            i40 = 0;
                            f8.b("debug_uploading:  response reqId " + iArr3[0] + " time" + str5);
                        } else {
                            i40 = 0;
                        }
                        int f7 = tLObject != null ? tLObject.networkType : w0.f();
                        if (i51 == 50331648) {
                            uz.e(i52).j(f7, 3, i47);
                            i41 = i51;
                            i42 = 5;
                            sparseArray = sparseArray2;
                        } else {
                            i41 = i51;
                            if (i41 == 33554432) {
                                sparseArray = sparseArray2;
                                uz.e(i52).j(f7, 2, i47);
                            } else {
                                sparseArray = sparseArray2;
                                if (i41 == 16777216) {
                                    uz.e(i52).j(f7, 4, i47);
                                } else if (i41 == 67108864) {
                                    if (str5 == null || !(str5.toLowerCase().endsWith("mp3") || str5.toLowerCase().endsWith("m4a"))) {
                                        long j19 = i47;
                                        i42 = 5;
                                        uz.e(i52).j(f7, 5, j19);
                                    } else {
                                        uz.e(i52).j(f7, 7, i47);
                                    }
                                }
                            }
                            i42 = 5;
                        }
                        if (bArr8 != null) {
                            d9Var2.j.add(bArr8);
                        }
                        d9Var2.p.delete(i48);
                        i0.g3(new b9(d9Var2, iArr3, 1));
                        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                            d9Var2.m = 4;
                            d9Var2.o.a();
                            d9Var2.b();
                            return;
                        }
                        if (d9Var2.m != 1) {
                            return;
                        }
                        d9Var2.w += i49;
                        long j20 = d9Var2.G;
                        long max2 = j20 != 0 ? Math.max(d9Var2.O, j20) : d9Var2.t;
                        y7 y7Var = d9Var2.o;
                        int i53 = i42;
                        long j21 = d9Var2.w;
                        rb rbVar = y7Var.d.E;
                        if (rbVar != null) {
                            d9Var = d9Var2;
                            str3 = "m4a";
                            str2 = str5;
                            j17 = 0;
                            i43 = i40;
                            rbVar.a(d9Var, y7Var.b, j21, max2, y7Var.a);
                        } else {
                            str2 = str5;
                            d9Var = d9Var2;
                            j17 = 0;
                            i43 = i40;
                            str3 = "m4a";
                        }
                        int i54 = d9Var.K - 1;
                        d9Var.K = i54;
                        if (!d9Var.b || i54 != 0 || d9Var.m != 1) {
                            d9 d9Var3 = d9Var;
                            if (i54 < d9Var3.e) {
                                if (d9Var3.G == j17 && !d9Var3.P && !d9Var3.c) {
                                    if (d9Var3.x >= 4) {
                                        d9Var3.x = i43;
                                    }
                                    int i55 = d9Var3.N;
                                    if (i50 == i55) {
                                        d9Var3.N = i55 + 1;
                                        long j22 = j18;
                                        while (true) {
                                            SparseArray sparseArray3 = sparseArray;
                                            c9 c9Var = (c9) sparseArray3.get(d9Var3.N);
                                            if (c9Var == null) {
                                                break;
                                            }
                                            j22 = c9Var.a;
                                            bArr8 = c9Var.b;
                                            sparseArray3.remove(d9Var3.N);
                                            d9Var3.N++;
                                            sparseArray = sparseArray3;
                                        }
                                        boolean z17 = d9Var3.D;
                                        if ((z17 && j22 % 1048576 == j17) || (!z17 && d9Var3.x == 0)) {
                                            SharedPreferences.Editor edit = d9Var3.L.edit();
                                            edit.putLong(a1.g.r(new StringBuilder(), d9Var3.F, "_uploaded"), j22);
                                            if (d9Var3.B) {
                                                edit.putString(a1.g.r(new StringBuilder(), d9Var3.F, "_ivc"), Utilities.f(bArr8));
                                            }
                                            edit.commit();
                                        }
                                    } else {
                                        SparseArray sparseArray4 = sparseArray;
                                        c9 c9Var2 = new c9();
                                        c9Var2.a = j18;
                                        if (bArr8 != null) {
                                            byte[] bArr9 = new byte[32];
                                            c9Var2.b = bArr9;
                                            System.arraycopy(bArr8, i43, bArr9, i43, 32);
                                        }
                                        sparseArray4.put(i50, c9Var2);
                                    }
                                    d9Var3.x++;
                                }
                                d9Var3.e();
                                return;
                            }
                            return;
                        }
                        d9Var.m = 3;
                        if (d9Var.y == null) {
                            if (d9Var.D) {
                                tL_inputFile = new TLRPC.TL_inputFileBig();
                            } else {
                                tL_inputFile = new TLRPC.TL_inputFile();
                                tL_inputFile.md5_checksum = "";
                            }
                            TLRPC.InputFile inputFile = tL_inputFile;
                            inputFile.parts = d9Var.r;
                            inputFile.id = d9Var.s;
                            inputFile.name = str2.substring(str2.lastIndexOf("/") + 1);
                            String str6 = str3;
                            d9 d9Var4 = d9Var;
                            y7 y7Var2 = d9Var4.o;
                            y7Var2.getClass();
                            str4 = str6;
                            i44 = i53;
                            b8.J.c(new am(y7Var2, y7Var2.a, y7Var2.b, y7Var2.c, inputFile, (TLRPC.InputEncryptedFile) null, (byte[]) null, (byte[]) null, d9Var4));
                            d9Var4.b();
                        } else {
                            str4 = str3;
                            i44 = i53;
                            d9 d9Var5 = d9Var;
                            if (d9Var5.D) {
                                tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileBigUploaded();
                            } else {
                                tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileUploaded();
                                tL_inputEncryptedFileUploaded.md5_checksum = "";
                            }
                            TLRPC.InputEncryptedFile inputEncryptedFile = tL_inputEncryptedFileUploaded;
                            inputEncryptedFile.parts = d9Var5.r;
                            inputEncryptedFile.id = d9Var5.s;
                            inputEncryptedFile.key_fingerprint = d9Var5.C;
                            y7 y7Var3 = d9Var5.o;
                            byte[] bArr10 = d9Var5.y;
                            byte[] bArr11 = d9Var5.z;
                            y7Var3.getClass();
                            b8.J.c(new am(y7Var3, y7Var3.a, y7Var3.b, y7Var3.c, (TLRPC.InputFile) null, inputEncryptedFile, bArr10, bArr11, d9Var5));
                            d9Var5.b();
                        }
                        if (i41 == 50331648) {
                            uz.e(i52).k(w0.f(), 3, 1);
                            return;
                        }
                        if (i41 == 33554432) {
                            uz.e(i52).k(w0.f(), 2, 1);
                            return;
                        }
                        if (i41 == 16777216) {
                            uz.e(i52).k(w0.f(), 4, 1);
                            return;
                        }
                        if (i41 == 67108864) {
                            if (str2 == null || !(str2.toLowerCase().endsWith("mp3") || str2.toLowerCase().endsWith(str4))) {
                                uz.e(i52).k(w0.f(), i44, 1);
                            } else {
                                uz.e(i52).k(w0.f(), 7, 1);
                            }
                        }
                    }
                }, null, new s1(this, 3), this.E ? 4 : 0, ConnectionsManager.DEFAULT_DATACENTER_ID, i13, true);
                if (v2.a) {
                    StringBuilder sb3 = new StringBuilder("debug_uploading:  send reqId ");
                    sb3.append(iArr2[0]);
                    sb3.append(" ");
                    sb3.append(str);
                    sb3.append(" file_part=");
                    sb3.append(i31);
                    sb3.append(" isBig=");
                    sb3.append(this.D);
                    sb3.append(" file_id=");
                    i0.a.q(this.s, sb3);
                }
                this.p.put(i32, iArr2[0]);
                i0.g3(new b9(this, iArr2, 0));
            }
        } catch (Exception e10) {
            e = e10;
            z14 = true;
        }
    }

    public final void e() {
        int i10;
        while (this.m == 1 && (i10 = this.K) < this.e) {
            d();
            if (this.K == i10) {
                return;
            }
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = this.L.edit();
        edit.putInt(a1.g.r(new StringBuilder(), this.F, "_time"), this.H);
        edit.putLong(a1.g.r(new StringBuilder(), this.F, "_size"), this.t);
        edit.putLong(a1.g.r(new StringBuilder(), this.F, "_id"), this.s);
        edit.remove(this.F + "_uploaded");
        if (this.B) {
            edit.putString(a1.g.r(new StringBuilder(), this.F, "_iv"), Utilities.f(this.z));
            edit.putString(a1.g.r(new StringBuilder(), this.F, "_ivc"), Utilities.f(this.A));
            edit.putString(a1.g.r(new StringBuilder(), this.F, "_key"), Utilities.f(this.y));
        }
        edit.commit();
    }
}
