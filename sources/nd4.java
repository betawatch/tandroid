// default package

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class nd4 {
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
    public byte m;
    public byte[] n;
    public ub4 o;
    public int r;
    public long s;
    public long t;
    public int u;
    public long v;
    public long w;
    public int x;
    public byte[] y;
    public byte[] z;
    public byte f = 4;
    public final int[] g = new int[8];
    public int h = 65536;
    public final SparseIntArray p = new SparseIntArray();
    public final ArrayList q = new ArrayList();
    public final SparseArray Q = new SparseArray();
    public final boolean[] R = {false, false};

    public nd4(int i, int i2, long j, String str, boolean z) {
        this.a = i;
        this.l = str;
        this.B = z;
        this.G = j;
        this.M = i2;
        this.P = (j == 0 || z) ? false : true;
    }

    public final void a() {
        if (!this.P) {
            long j = this.t;
            long j2 = this.h;
            this.u = (int) (((j + j2) - 1) / j2);
            return;
        }
        boolean z = this.D;
        long j3 = this.t;
        int i = this.h;
        if (z) {
            long j4 = i;
            this.u = ((int) ((((j3 - j4) + j4) - 1) / j4)) + 1;
        } else {
            long j5 = i;
            this.u = ((int) ((((j3 - 1024) + j5) - 1) / j5)) + 1;
        }
    }

    public final void b() {
        SharedPreferences sharedPreferences = this.L;
        if (sharedPreferences == null) {
            sharedPreferences = a.b.getSharedPreferences("uploadinfo", 0);
            this.L = sharedPreferences;
        }
        sharedPreferences.edit().remove(this.F + "_time").remove(this.F + "_size").remove(this.F + "_uploaded").remove(this.F + "_id").remove(this.F + "_iv").remove(this.F + "_key").remove(this.F + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.I;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.I = null;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        String str = this.l;
        if (str == null) {
            Set set = u60.a;
        } else {
            u60.a.remove(str);
        }
    }

    public final void c() {
        if (this.m != 0) {
            return;
        }
        this.m = (byte) 1;
        String str = this.l;
        if (str == null) {
            Set set = u60.a;
        } else {
            u60.a.add(str);
        }
        Utilities.d.c(new jd4(this, (byte) 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0239, code lost:
    
        if (r0 < (r11 - 5400.0f)) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0229 A[Catch: Exception -> 0x0492, TryCatch #3 {Exception -> 0x0492, blocks: (B:95:0x0019, B:99:0x004b, B:101:0x0054, B:102:0x005d, B:106:0x0068, B:107:0x006a, B:109:0x0087, B:111:0x0091, B:112:0x00a0, B:116:0x00b3, B:119:0x00cb, B:121:0x00cf, B:123:0x00d2, B:124:0x00d4, B:127:0x00dc, B:130:0x00f7, B:132:0x00fb, B:133:0x0105, B:135:0x0109, B:137:0x0113, B:140:0x0130, B:142:0x0165, B:144:0x0169, B:146:0x016f, B:148:0x0175, B:150:0x01c4, B:153:0x01fc, B:156:0x020e, B:158:0x0211, B:160:0x0214, B:164:0x0223, B:166:0x0229, B:173:0x0242, B:176:0x024f, B:178:0x025c, B:180:0x0266, B:182:0x026a, B:183:0x0270, B:185:0x027b, B:187:0x0284, B:191:0x028e, B:193:0x0294, B:195:0x02ab, B:197:0x0282, B:204:0x02fc, B:205:0x0319, B:207:0x0325, B:209:0x0329, B:211:0x032f, B:213:0x0368, B:215:0x0374, B:217:0x037a, B:218:0x038d, B:219:0x0386, B:13:0x03a5, B:19:0x03b7, B:21:0x03c2, B:22:0x03cd, B:26:0x03dc, B:28:0x03e0, B:32:0x03f1, B:34:0x03f5, B:36:0x03fb, B:43:0x0417, B:45:0x041d, B:49:0x044d, B:51:0x0460, B:52:0x0467, B:55:0x047f, B:57:0x0483, B:83:0x0463, B:88:0x0406, B:92:0x03c7, B:229:0x0365, B:230:0x02b3, B:232:0x02bc, B:234:0x02d8, B:236:0x02e0, B:238:0x02e3, B:240:0x02e8, B:242:0x0230, B:249:0x00a9, B:254:0x0057, B:255:0x0393, B:256:0x039a, B:259:0x0045, B:97:0x0027, B:221:0x0334, B:224:0x0350), top: B:94:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0374 A[Catch: Exception -> 0x0492, TryCatch #3 {Exception -> 0x0492, blocks: (B:95:0x0019, B:99:0x004b, B:101:0x0054, B:102:0x005d, B:106:0x0068, B:107:0x006a, B:109:0x0087, B:111:0x0091, B:112:0x00a0, B:116:0x00b3, B:119:0x00cb, B:121:0x00cf, B:123:0x00d2, B:124:0x00d4, B:127:0x00dc, B:130:0x00f7, B:132:0x00fb, B:133:0x0105, B:135:0x0109, B:137:0x0113, B:140:0x0130, B:142:0x0165, B:144:0x0169, B:146:0x016f, B:148:0x0175, B:150:0x01c4, B:153:0x01fc, B:156:0x020e, B:158:0x0211, B:160:0x0214, B:164:0x0223, B:166:0x0229, B:173:0x0242, B:176:0x024f, B:178:0x025c, B:180:0x0266, B:182:0x026a, B:183:0x0270, B:185:0x027b, B:187:0x0284, B:191:0x028e, B:193:0x0294, B:195:0x02ab, B:197:0x0282, B:204:0x02fc, B:205:0x0319, B:207:0x0325, B:209:0x0329, B:211:0x032f, B:213:0x0368, B:215:0x0374, B:217:0x037a, B:218:0x038d, B:219:0x0386, B:13:0x03a5, B:19:0x03b7, B:21:0x03c2, B:22:0x03cd, B:26:0x03dc, B:28:0x03e0, B:32:0x03f1, B:34:0x03f5, B:36:0x03fb, B:43:0x0417, B:45:0x041d, B:49:0x044d, B:51:0x0460, B:52:0x0467, B:55:0x047f, B:57:0x0483, B:83:0x0463, B:88:0x0406, B:92:0x03c7, B:229:0x0365, B:230:0x02b3, B:232:0x02bc, B:234:0x02d8, B:236:0x02e0, B:238:0x02e3, B:240:0x02e8, B:242:0x0230, B:249:0x00a9, B:254:0x0057, B:255:0x0393, B:256:0x039a, B:259:0x0045, B:97:0x0027, B:221:0x0334, B:224:0x0350), top: B:94:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0334 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0230 A[Catch: Exception -> 0x0492, TryCatch #3 {Exception -> 0x0492, blocks: (B:95:0x0019, B:99:0x004b, B:101:0x0054, B:102:0x005d, B:106:0x0068, B:107:0x006a, B:109:0x0087, B:111:0x0091, B:112:0x00a0, B:116:0x00b3, B:119:0x00cb, B:121:0x00cf, B:123:0x00d2, B:124:0x00d4, B:127:0x00dc, B:130:0x00f7, B:132:0x00fb, B:133:0x0105, B:135:0x0109, B:137:0x0113, B:140:0x0130, B:142:0x0165, B:144:0x0169, B:146:0x016f, B:148:0x0175, B:150:0x01c4, B:153:0x01fc, B:156:0x020e, B:158:0x0211, B:160:0x0214, B:164:0x0223, B:166:0x0229, B:173:0x0242, B:176:0x024f, B:178:0x025c, B:180:0x0266, B:182:0x026a, B:183:0x0270, B:185:0x027b, B:187:0x0284, B:191:0x028e, B:193:0x0294, B:195:0x02ab, B:197:0x0282, B:204:0x02fc, B:205:0x0319, B:207:0x0325, B:209:0x0329, B:211:0x032f, B:213:0x0368, B:215:0x0374, B:217:0x037a, B:218:0x038d, B:219:0x0386, B:13:0x03a5, B:19:0x03b7, B:21:0x03c2, B:22:0x03cd, B:26:0x03dc, B:28:0x03e0, B:32:0x03f1, B:34:0x03f5, B:36:0x03fb, B:43:0x0417, B:45:0x041d, B:49:0x044d, B:51:0x0460, B:52:0x0467, B:55:0x047f, B:57:0x0483, B:83:0x0463, B:88:0x0406, B:92:0x03c7, B:229:0x0365, B:230:0x02b3, B:232:0x02bc, B:234:0x02d8, B:236:0x02e0, B:238:0x02e3, B:240:0x02e8, B:242:0x0230, B:249:0x00a9, B:254:0x0057, B:255:0x0393, B:256:0x039a, B:259:0x0045, B:97:0x0027, B:221:0x0334, B:224:0x0350), top: B:94:0x0019, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z;
        RandomAccessFile randomAccessFile;
        String str;
        int i;
        boolean z2;
        File file;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        byte[] bArr;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int read;
        final byte[] bArr2;
        final int i4;
        TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart;
        byte b;
        int i5;
        int i6;
        int i7 = 1;
        if (this.m == 1) {
            try {
                this.J = true;
                randomAccessFile = this.I;
                str = this.l;
                i = this.a;
                z2 = this.B;
            } catch (Exception e) {
                e = e;
                z = true;
            }
            if (randomAccessFile == null) {
                try {
                    file = new File(str);
                    this.I = new RandomAccessFile(file, "r");
                    try {
                        z3 = hl.G1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(this.I.getFD(), null)).intValue());
                    } catch (Throwable th) {
                        cc4.g(th, true);
                        z3 = false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                }
                if (z3) {
                    throw new Exception("trying to upload internal file");
                }
                i2 = i;
                long j = this.G;
                if (j != 0) {
                    this.t = j;
                } else {
                    j = file.length();
                    this.t = j;
                }
                if (!this.E && j > 10485760) {
                    this.D = true;
                }
                long f = uc7.s1(i2).l4.v3.f();
                if (yac.h(k5.a(i2).a).p()) {
                    i3 = 1024;
                    if (this.t > 2097152000) {
                        f = uc7.s1(i2).l4.w3.f();
                    }
                } else {
                    i3 = 1024;
                }
                z4 = z2;
                long j2 = f << 10;
                int max = (int) Math.max(this.i ? 32L : this.D ? 512L : 128L, ((this.t + j2) - 1) / j2);
                this.h = max;
                if (i3 % max != 0) {
                    max = 64;
                    while (this.h > max) {
                        max <<= 1;
                    }
                    this.h = max;
                }
                this.e = Math.max(1, (this.i ? 32 : TLObject.FLAG_13) / max);
                this.f = yac.h(k5.a(i2).a).p() ? (byte) 8 : (byte) 4;
                if (z4) {
                    this.j = new ArrayList(this.e);
                    for (int i8 = 0; i8 < this.e; i8++) {
                        this.j.add(new byte[32]);
                    }
                }
                this.h <<= 10;
                a();
                this.n = new byte[this.h];
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(z4 ? "enc" : "");
                this.F = Utilities.a(sb.toString());
                long j3 = this.L.getLong(this.F + "_size", 0L);
                this.H = (int) (System.currentTimeMillis() / 1000);
                if (!this.P && !this.c && this.G == 0 && j3 == this.t) {
                    this.s = this.L.getLong(this.F + "_id", 0L);
                    int i9 = this.L.getInt(this.F + "_time", 0);
                    long j4 = this.L.getLong(this.F + "_uploaded", 0L);
                    if (z4) {
                        String string = this.L.getString(this.F + "_iv", null);
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
                        z6 = true;
                        if (!z6 && i9 != 0) {
                            z7 = this.D;
                            int i10 = this.H;
                            if (!z7) {
                                if (i9 < i10 - 86400) {
                                    i9 = 0;
                                }
                                if (i9 == 0) {
                                    z8 = z6;
                                } else if (j4 > 0) {
                                    this.v = j4;
                                    this.r = (int) (j4 / this.h);
                                    if (!z7) {
                                        int i11 = 0;
                                        while (true) {
                                            z8 = z6;
                                            if (i11 >= this.v / this.h) {
                                                break;
                                            }
                                            int read2 = this.I.read(this.n);
                                            int i12 = (!z4 || read2 % 16 == 0) ? 0 : 16 - (read2 % 16);
                                            int i13 = read2 + i12;
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i13);
                                            if (read2 != this.h || this.u == this.r + 1) {
                                                this.b = true;
                                            }
                                            nativeByteBuffer.writeBytes(this.n, 0, read2);
                                            if (z4) {
                                                for (int i14 = 0; i14 < i12; i14++) {
                                                    nativeByteBuffer.writeByte(0);
                                                }
                                                Utilities.c(nativeByteBuffer.buffer, this.y, this.A, true, true, 0, i13);
                                            }
                                            nativeByteBuffer.reuse();
                                            i11++;
                                            z6 = z8;
                                        }
                                    } else {
                                        z8 = z6;
                                        this.I.seek(j4);
                                        if (z4) {
                                            bArr = null;
                                            String string3 = this.L.getString(this.F + "_ivc", null);
                                            if (string3 != null) {
                                                byte[] v2 = Utilities.v(string3);
                                                this.A = v2;
                                                if (v2 == null || v2.length != 32) {
                                                    this.v = 0L;
                                                    this.r = 0;
                                                }
                                                z5 = z8;
                                                if (z5) {
                                                    if (z4) {
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
                                                if (z4) {
                                                    try {
                                                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                                        byte[] bArr6 = new byte[64];
                                                        System.arraycopy(this.y, 0, bArr6, 0, 32);
                                                        System.arraycopy(this.z, 0, bArr6, 32, 32);
                                                        byte[] digest = messageDigest.digest(bArr6);
                                                        for (int i15 = 0; i15 < 4; i15++) {
                                                            this.C |= ((digest[i15] ^ digest[i15 + 4]) & jn7.d4) << (i15 << 3);
                                                        }
                                                    } catch (Exception e3) {
                                                        cc4.g(e3, true);
                                                    }
                                                }
                                                this.w = this.v;
                                                this.N = this.r;
                                                if (this.P) {
                                                    boolean z9 = this.D;
                                                    RandomAccessFile randomAccessFile2 = this.I;
                                                    if (z9) {
                                                        randomAccessFile2.seek(this.h);
                                                        this.v = this.h;
                                                    } else {
                                                        randomAccessFile2.seek(1024L);
                                                        this.v = 1024L;
                                                    }
                                                    this.r = 1;
                                                }
                                            } else {
                                                this.v = 0L;
                                                this.r = 0;
                                            }
                                            z5 = true;
                                            if (z5) {
                                            }
                                            if (z4) {
                                            }
                                            this.w = this.v;
                                            this.N = this.r;
                                            if (this.P) {
                                            }
                                        }
                                    }
                                }
                                bArr = null;
                                z5 = z8;
                                if (z5) {
                                }
                                if (z4) {
                                }
                                this.w = this.v;
                                this.N = this.r;
                                if (this.P) {
                                }
                            }
                            e = e;
                            z = true;
                            cc4.g(e, z);
                            this.m = (byte) 4;
                            this.o.a();
                            b();
                            return;
                        }
                    }
                    z6 = false;
                    if (!z6) {
                        z7 = this.D;
                        int i102 = this.H;
                        if (!z7) {
                        }
                        e = e;
                        z = true;
                        cc4.g(e, z);
                        this.m = (byte) 4;
                        this.o.a();
                        b();
                        return;
                    }
                }
                bArr = null;
                z5 = true;
                if (z5) {
                }
                if (z4) {
                }
                this.w = this.v;
                this.N = this.r;
                if (this.P) {
                }
            } else {
                i2 = i;
                bArr = null;
                z4 = z2;
            }
            if (this.G == 0 || this.v + this.h <= this.O) {
                boolean z10 = this.c;
                RandomAccessFile randomAccessFile3 = this.I;
                if (z10) {
                    randomAccessFile3.seek(0L);
                    boolean z11 = this.D;
                    RandomAccessFile randomAccessFile4 = this.I;
                    byte[] bArr7 = this.n;
                    read = z11 ? randomAccessFile4.read(bArr7) : randomAccessFile4.read(bArr7, 0, 1024);
                    this.r = 0;
                } else {
                    read = randomAccessFile3.read(this.n);
                }
                if (read == -1) {
                    return;
                }
                int i16 = (!z4 || read % 16 == 0) ? 0 : 16 - (read % 16);
                int i17 = read + i16;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i17);
                if (this.c || read != this.h || (this.G == 0 && this.u == this.r + 1)) {
                    if (this.P) {
                        this.c = true;
                        this.P = false;
                    } else {
                        this.b = true;
                    }
                }
                nativeByteBuffer2.writeBytes(this.n, 0, read);
                if (z4) {
                    for (int i18 = 0; i18 < i16; i18++) {
                        nativeByteBuffer2.writeByte(0);
                    }
                    Utilities.c(nativeByteBuffer2.buffer, this.y, this.A, true, true, 0, i17);
                    byte[] bArr8 = (byte[]) this.j.get(0);
                    System.arraycopy(this.A, 0, bArr8, 0, 32);
                    this.j.remove(0);
                    bArr2 = bArr8;
                } else {
                    bArr2 = bArr;
                }
                if (this.D) {
                    TLRPC.TL_upload_saveBigFilePart tL_upload_saveBigFilePart = new TLRPC.TL_upload_saveBigFilePart();
                    i4 = this.r;
                    tL_upload_saveBigFilePart.file_part = i4;
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
                    i4 = this.r;
                    tL_upload_saveFilePart2.file_part = i4;
                    tL_upload_saveFilePart2.file_id = this.s;
                    tL_upload_saveFilePart2.bytes = nativeByteBuffer2;
                    tL_upload_saveFilePart = tL_upload_saveFilePart2;
                }
                TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart3 = tL_upload_saveFilePart;
                if (this.b && this.c) {
                    this.c = false;
                    this.r = this.u - 1;
                    this.I.seek(this.t);
                }
                this.v += read;
                this.r++;
                this.K++;
                final int i19 = this.k;
                this.k = i19 + 1;
                final long j5 = i4 + read;
                final int objectSize = tL_upload_saveFilePart3.getObjectSize() + 4;
                final int i20 = this.d;
                boolean z12 = this.i;
                int[] iArr = this.g;
                if (z12) {
                    i5 = 1;
                    b = 0;
                    i6 = 4;
                } else {
                    int i21 = i19 % this.f;
                    int i22 = 1;
                    b = 0;
                    while (true) {
                        byte b2 = this.f;
                        if (i22 >= b2) {
                            break;
                        }
                        int i23 = (i19 + i22) % b2;
                        int i24 = i7;
                        if (iArr[i23] < iArr[i21]) {
                            i21 = i23;
                        }
                        i22++;
                        i7 = i24;
                    }
                    i5 = i7;
                    i6 = (i21 << 16) | 4;
                }
                final int i25 = i6 >> 16;
                iArr[i25] = iArr[i25] + 1;
                System.currentTimeMillis();
                final int[] iArr2 = new int[i5];
                final int i26 = read;
                iArr2[b] = ConnectionsManager.getInstance(i2).sendRequest(tL_upload_saveFilePart3, new RequestDelegate() { // from class: kd4
                    /* JADX WARN: Removed duplicated region for block: B:107:0x02d5  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
                    @Override // org.telegram.tgnet.RequestDelegate
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        int[] iArr3;
                        byte b3;
                        byte b4;
                        int i27;
                        byte[] bArr9;
                        nd4 nd4Var;
                        byte b5;
                        byte b6;
                        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
                        TLRPC.InputFile tL_inputFile;
                        nd4 nd4Var2 = nd4.this;
                        int i28 = i20;
                        int i29 = i25;
                        int[] iArr4 = iArr2;
                        int i30 = objectSize;
                        byte[] bArr10 = bArr2;
                        int i31 = i19;
                        int i32 = i26;
                        int i33 = i4;
                        long j6 = j5;
                        int i34 = nd4Var2.M;
                        SparseArray sparseArray = nd4Var2.Q;
                        String str2 = nd4Var2.l;
                        int i35 = nd4Var2.a;
                        if (i28 != nd4Var2.d) {
                            return;
                        }
                        int[] iArr5 = nd4Var2.g;
                        iArr5[i29] = iArr5[i29] - 1;
                        if (f11.a) {
                            cc4.b("debug_uploading:  response reqId " + iArr4[0] + " time" + str2);
                        }
                        int f2 = tLObject != null ? tLObject.networkType : a.f();
                        if (i34 == 50331648) {
                            iArr3 = iArr4;
                            a2b.c(i35).h(f2, 3, i30);
                            b3 = 3;
                        } else {
                            iArr3 = iArr4;
                            b3 = 3;
                            if (i34 != 33554432) {
                                if (i34 == 16777216) {
                                    a2b.c(i35).h(f2, 4, i30);
                                    b4 = 4;
                                } else {
                                    b4 = 4;
                                    if (i34 == 67108864) {
                                        if (str2 == null || !(str2.toLowerCase().endsWith("mp3") || str2.toLowerCase().endsWith("m4a"))) {
                                            a2b.c(i35).h(f2, 5, i30);
                                        } else {
                                            a2b.c(i35).h(f2, 7, i30);
                                        }
                                    }
                                }
                                if (bArr10 != null) {
                                    nd4Var2.j.add(bArr10);
                                }
                                nd4Var2.p.delete(i31);
                                hl.c3(new ld4(nd4Var2, iArr3, (byte) 1));
                                if (tLObject instanceof TLRPC.TL_boolTrue) {
                                    nd4Var2.m = b4;
                                    nd4Var2.o.a();
                                    nd4Var2.b();
                                    return;
                                }
                                if (nd4Var2.m == 1) {
                                    nd4Var2.w += i32;
                                    long j7 = nd4Var2.G;
                                    long max2 = j7 != 0 ? Math.max(nd4Var2.O, j7) : nd4Var2.t;
                                    ub4 ub4Var = nd4Var2.o;
                                    long j8 = nd4Var2.w;
                                    sm5 sm5Var = ub4Var.d.F;
                                    if (sm5Var != null) {
                                        bArr9 = bArr10;
                                        nd4Var = nd4Var2;
                                        b5 = b3;
                                        i27 = i35;
                                        sm5Var.a(nd4Var, ub4Var.b, j8, max2, ub4Var.a);
                                    } else {
                                        i27 = i35;
                                        bArr9 = bArr10;
                                        nd4Var = nd4Var2;
                                        b5 = b3;
                                    }
                                    int i36 = nd4Var.K - 1;
                                    nd4Var.K = i36;
                                    if (!nd4Var.b || i36 != 0 || nd4Var.m != 1) {
                                        nd4 nd4Var3 = nd4Var;
                                        if (i36 < nd4Var3.e) {
                                            if (nd4Var3.G == 0 && !nd4Var3.P && !nd4Var3.c) {
                                                if (nd4Var3.x >= 4) {
                                                    nd4Var3.x = 0;
                                                }
                                                int i37 = nd4Var3.N;
                                                if (i33 == i37) {
                                                    nd4Var3.N = i37 + 1;
                                                    long j9 = j6;
                                                    byte[] bArr11 = bArr9;
                                                    while (true) {
                                                        md4 md4Var = (md4) sparseArray.get(nd4Var3.N);
                                                        if (md4Var == null) {
                                                            break;
                                                        }
                                                        j9 = md4Var.a;
                                                        bArr11 = md4Var.b;
                                                        sparseArray.remove(nd4Var3.N);
                                                        nd4Var3.N++;
                                                    }
                                                    if (!nd4Var3.D ? nd4Var3.x == 0 : j9 % 1048576 == 0) {
                                                        SharedPreferences.Editor edit = nd4Var3.L.edit();
                                                        edit.putLong(c00.k(new StringBuilder(), nd4Var3.F, "_uploaded"), j9);
                                                        if (nd4Var3.B) {
                                                            edit.putString(c00.k(new StringBuilder(), nd4Var3.F, "_ivc"), Utilities.f(bArr11));
                                                        }
                                                        edit.commit();
                                                    }
                                                } else {
                                                    md4 md4Var2 = new md4();
                                                    md4Var2.a = j6;
                                                    if (bArr9 != null) {
                                                        byte[] bArr12 = new byte[32];
                                                        md4Var2.b = bArr12;
                                                        System.arraycopy(bArr9, 0, bArr12, 0, 32);
                                                    }
                                                    sparseArray.put(i33, md4Var2);
                                                }
                                                nd4Var3.x++;
                                            }
                                            nd4Var3.e();
                                            return;
                                        }
                                        return;
                                    }
                                    nd4Var.m = b5;
                                    byte[] bArr13 = nd4Var.y;
                                    boolean z13 = nd4Var.D;
                                    if (bArr13 == null) {
                                        if (z13) {
                                            tL_inputFile = new TLRPC.TL_inputFileBig();
                                        } else {
                                            tL_inputFile = new TLRPC.TL_inputFile();
                                            tL_inputFile.md5_checksum = "";
                                        }
                                        TLRPC.InputFile inputFile = tL_inputFile;
                                        inputFile.parts = nd4Var.r;
                                        inputFile.id = nd4Var.s;
                                        inputFile.name = str2.substring(str2.lastIndexOf("/") + 1);
                                        nd4 nd4Var4 = nd4Var;
                                        ub4 ub4Var2 = nd4Var4.o;
                                        ub4Var2.getClass();
                                        b6 = b5;
                                        xb4.K.c(new b97(ub4Var2, ub4Var2.a, ub4Var2.b, ub4Var2.c, inputFile, (TLRPC.InputEncryptedFile) null, (byte[]) null, (byte[]) null, nd4Var4));
                                        nd4Var4.b();
                                    } else {
                                        nd4 nd4Var5 = nd4Var;
                                        b6 = b5;
                                        if (z13) {
                                            tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileBigUploaded();
                                        } else {
                                            tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileUploaded();
                                            tL_inputEncryptedFileUploaded.md5_checksum = "";
                                        }
                                        TLRPC.InputEncryptedFile inputEncryptedFile = tL_inputEncryptedFileUploaded;
                                        inputEncryptedFile.parts = nd4Var5.r;
                                        inputEncryptedFile.id = nd4Var5.s;
                                        inputEncryptedFile.key_fingerprint = nd4Var5.C;
                                        ub4 ub4Var3 = nd4Var5.o;
                                        byte[] bArr14 = nd4Var5.y;
                                        byte[] bArr15 = nd4Var5.z;
                                        ub4Var3.getClass();
                                        xb4.K.c(new b97(ub4Var3, ub4Var3.a, ub4Var3.b, ub4Var3.c, (TLRPC.InputFile) null, inputEncryptedFile, bArr14, bArr15, nd4Var5));
                                        nd4Var5.b();
                                    }
                                    if (i34 == 50331648) {
                                        a2b.c(i27).i(a.f(), b6, 1);
                                        return;
                                    }
                                    if (i34 == 33554432) {
                                        a2b.c(i27).i(a.f(), 2, 1);
                                        return;
                                    }
                                    if (i34 == 16777216) {
                                        a2b.c(i27).i(a.f(), 4, 1);
                                        return;
                                    }
                                    if (i34 == 67108864) {
                                        if (str2 == null || !(str2.toLowerCase().endsWith("mp3") || str2.toLowerCase().endsWith("m4a"))) {
                                            a2b.c(i27).i(a.f(), 5, 1);
                                            return;
                                        } else {
                                            a2b.c(i27).i(a.f(), 7, 1);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            a2b.c(i35).h(f2, 2, i30);
                        }
                        b4 = 4;
                        if (bArr10 != null) {
                        }
                        nd4Var2.p.delete(i31);
                        hl.c3(new ld4(nd4Var2, iArr3, (byte) 1));
                        if (tLObject instanceof TLRPC.TL_boolTrue) {
                        }
                    }
                }, null, new lu3(this, (byte) 18), this.E ? (byte) 4 : b, ConnectionsManager.DEFAULT_DATACENTER_ID, i6, true);
                if (f11.a) {
                    StringBuilder sb2 = new StringBuilder("debug_uploading:  send reqId ");
                    sb2.append(iArr2[b]);
                    sb2.append(" ");
                    sb2.append(str);
                    sb2.append(" file_part=");
                    sb2.append(i4);
                    sb2.append(" isBig=");
                    sb2.append(this.D);
                    sb2.append(" file_id=");
                    ik8.q(this.s, sb2);
                }
                this.p.put(i19, iArr2[b]);
                hl.c3(new ld4(this, iArr2, b));
            }
        }
    }

    public final void e() {
        int i;
        while (this.m == 1 && (i = this.K) < this.e) {
            d();
            if (this.K == i) {
                return;
            }
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = this.L.edit();
        edit.putInt(c00.k(new StringBuilder(), this.F, "_time"), this.H);
        edit.putLong(c00.k(new StringBuilder(), this.F, "_size"), this.t);
        edit.putLong(c00.k(new StringBuilder(), this.F, "_id"), this.s);
        edit.remove(this.F + "_uploaded");
        if (this.B) {
            edit.putString(c00.k(new StringBuilder(), this.F, "_iv"), Utilities.f(this.z));
            edit.putString(c00.k(new StringBuilder(), this.F, "_ivc"), Utilities.f(this.A));
            edit.putString(c00.k(new StringBuilder(), this.F, "_key"), Utilities.f(this.y));
        }
        edit.commit();
    }
}
