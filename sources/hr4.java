// default package

import android.util.Pair;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hr4 implements e84 {
    public static final byte[] P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final ko4 Q;
    public long A;
    public long B;
    public gr4 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public g84 I;
    public x1c[] J;
    public x1c[] K;
    public boolean L;
    public boolean M;
    public long N;
    public long O;
    public final peb a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final ey7 i;
    public final usb j;
    public final lo o;
    public final fg8 p;
    public final wz4 q;
    public j99 r;
    public byte s;
    public int t;
    public long u;
    public int v;
    public ey7 w;
    public long x;
    public int y;
    public long z;
    public final qx6 k = new qx6((byte) 25);
    public final ey7 l = new ey7(16);
    public final ey7 e = new ey7(rfd.a);
    public final ey7 f = new ey7(6);
    public final ey7 g = new ey7();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        jo4 jo4Var = new jo4();
        jo4Var.s = dg7.n("application/x-emsg");
        Q = new ko4(jo4Var);
    }

    public hr4(peb pebVar, int i, usb usbVar, List list, fg8 fg8Var) {
        this.a = pebVar;
        this.b = i;
        this.j = usbVar;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = fg8Var;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new ey7(bArr);
        no5 no5Var = po5.b;
        this.r = j99.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = g84.v;
        this.J = new x1c[0];
        this.K = new x1c[0];
        this.o = new lo(new lu3(this, (byte) 24));
        this.q = new wz4((byte) 19);
        this.N = -1L;
        this.O = -1L;
    }

    public static int g(int i) {
        int i2 = (i & 1) != 0 ? 64 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    public static hr3 i(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            vh7 vh7Var = (vh7) arrayList.get(i);
            if (vh7Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = vh7Var.e.a;
                sx8 b = lwe.b(bArr);
                UUID uuid = b == null ? null : (UUID) b.c;
                if (uuid == null) {
                    efd.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new gr3(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new hr3(null, false, (gr3[]) arrayList2.toArray(new gr3[0]));
    }

    public static void k(ey7 ey7Var, int i, s1c s1cVar) {
        ey7Var.N(i + 8);
        int m = ey7Var.m();
        byte[] bArr = zy0.a;
        if ((m & 1) != 0) {
            throw hy7.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m & 2) != 0;
        int E = ey7Var.E();
        if (E == 0) {
            Arrays.fill(s1cVar.l, 0, s1cVar.e, false);
            return;
        }
        int i2 = s1cVar.e;
        ey7 ey7Var2 = s1cVar.n;
        if (E != i2) {
            StringBuilder m2 = uh9.m(E, "Senc sample count ", " is different from fragment sample count");
            m2.append(s1cVar.e);
            throw hy7.a(m2.toString(), null);
        }
        Arrays.fill(s1cVar.l, 0, E, z);
        ey7Var2.K(ey7Var.a());
        s1cVar.k = true;
        s1cVar.o = true;
        ey7Var.k(0, ey7Var2.c, ey7Var2.a);
        ey7Var2.N(0);
        s1cVar.o = false;
    }

    public static Pair l(long j, ey7 ey7Var) {
        long G;
        long G2;
        ey7 ey7Var2 = ey7Var;
        ey7Var2.N(8);
        int e = zy0.e(ey7Var2.m());
        ey7Var2.O(4);
        long C = ey7Var2.C();
        if (e == 0) {
            G = ey7Var2.C();
            G2 = ey7Var2.C();
        } else {
            G = ey7Var2.G();
            G2 = ey7Var2.G();
        }
        long j2 = G2 + j;
        String str = gcc.a;
        long b0 = gcc.b0(G, 1000000L, C, RoundingMode.DOWN);
        ey7Var2.O(2);
        int H = ey7Var2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j3 = j2;
        long j4 = b0;
        int i = 0;
        while (i < H) {
            int m = ey7Var2.m();
            if ((Integer.MIN_VALUE & m) != 0) {
                throw hy7.a("Unhandled indirect reference", null);
            }
            long C2 = ey7Var2.C();
            iArr[i] = m & ConnectionsManager.DEFAULT_DATACENTER_ID;
            jArr[i] = j3;
            jArr3[i] = j4;
            G += C2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long b02 = gcc.b0(G, 1000000L, C, RoundingMode.DOWN);
            jArr4[i] = b02 - jArr5[i];
            ey7Var2.O(4);
            j3 += iArr[i];
            i++;
            H = H;
            ey7Var2 = ey7Var;
            j4 = b02;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(b0), new sh2(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x00ed, code lost:
    
        r2 = r3.a;
        r4 = r3.b;
        r7 = "video/hevc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00f8, code lost:
    
        if (r49.s != 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00fc, code lost:
    
        if (r3.n != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00fe, code lost:
    
        r6 = r3.d.d[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x010d, code lost:
    
        r49.D = r6;
        r6 = r3.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x011b, code lost:
    
        if (j$.util.Objects.equals(r6.t, "video/avc") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x011f, code lost:
    
        if ((r9 & 64) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0131, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0132, code lost:
    
        r49.G = !r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x013a, code lost:
    
        if (r3.f >= r3.i) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x013c, code lost:
    
        ((cb3) r1).l(r49.D, false);
        r1 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0148, code lost:
    
        if (r1 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x014a, code lost:
    
        r2 = r4.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x014e, code lost:
    
        if (r1 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0150, code lost:
    
        r2.O(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0153, code lost:
    
        r1 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0157, code lost:
    
        if (r4.k == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x015d, code lost:
    
        if (r4.l[r1] == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x015f, code lost:
    
        r2.O(r2.H() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x016c, code lost:
    
        if (r3.c() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x016e, code lost:
    
        r49.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0171, code lost:
    
        r49.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0175, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x017f, code lost:
    
        if (r3.d.a.h != r37) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0181, code lost:
    
        r49.D -= 8;
        ((cb3) r1).l(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x018f, code lost:
    
        r6 = "audio/ac4".equals(r3.d.a.g.t);
        r9 = r49.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x019f, code lost:
    
        if (r6 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01a1, code lost:
    
        r49.E = r3.d(r9, 7);
        ok7.b(r49.D, r13);
        r2.e(7, r13);
        r9 = r49.E + 7;
        r49.E = r9;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01be, code lost:
    
        r49.D += r9;
        r49.s = 4;
        r49.F = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01b7, code lost:
    
        r6 = 0;
        r9 = r3.d(r9, 0);
        r49.E = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x012e, code lost:
    
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0128, code lost:
    
        if (j$.util.Objects.equals(r6.t, "video/hevc") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x012c, code lost:
    
        if ((r9 & 128) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0107, code lost:
    
        r6 = r4.h[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01c8, code lost:
    
        r6 = r3.d;
        r9 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x01ce, code lost:
    
        if (r3.n != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x01d0, code lost:
    
        r10 = r6.f[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01dd, code lost:
    
        if (r5 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01df, code lost:
    
        r10 = r5.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01e3, code lost:
    
        r4 = r9.k;
        r6 = r9.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01e7, code lost:
    
        if (r4 == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01e9, code lost:
    
        r9 = r49.f;
        r13 = r9.a;
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01fb, code lost:
    
        r39 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0201, code lost:
    
        if (r49.E >= r49.D) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0203, code lost:
    
        r4 = r49.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0205, code lost:
    
        if (r4 != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x020a, code lost:
    
        if (r49.K.length > 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x020e, code lost:
    
        if (r49.G != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0225, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0226, code lost:
    
        r40 = r5;
        r23 = r3;
        ((cb3) r1).c(r13, r14, r4 + r4, false);
        r9.N(0);
        r5 = r9.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x023a, code lost:
    
        if (r5 < 0) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x023c, code lost:
    
        r49.F = r5 - r4;
        r5 = r49.e;
        r5.N(0);
        r2.e(4, r5);
        r49.E += 4;
        r49.D += r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0255, code lost:
    
        if (r49.K.length <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0257, code lost:
    
        if (r4 <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0259, code lost:
    
        r3 = rfd.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x025d, code lost:
    
        if (r3 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0263, code lost:
    
        switch(r3.hashCode()) {
            case -1662541442: goto L124;
            case 1331836730: goto L121;
            case 1331856911: goto L118;
            default: goto L126;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x026d, code lost:
    
        if (r3.equals("video/vvc") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x026f, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0283, code lost:
    
        switch(r3) {
            case 0: goto L136;
            case 1: goto L133;
            case 2: goto L130;
            default: goto L139;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0291, code lost:
    
        if (((r13[r34] & 248) >> 3) != 23) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02ad, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x02b0, code lost:
    
        r49.H = r3;
        r2.e(r4, r9);
        r49.E += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x02ba, code lost:
    
        if (r4 <= 0) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x02be, code lost:
    
        if (r49.G != false) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02c4, code lost:
    
        if (rfd.d(r13, r4, r6) == false) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02c6, code lost:
    
        r49.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x02c9, code lost:
    
        r3 = r23;
        r12 = r39;
        r5 = r40;
        r35 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x029c, code lost:
    
        if ((r13[4] & 31) != r35) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02ab, code lost:
    
        if (((r13[4] & 126) >> 1) != 39) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0276, code lost:
    
        if (r3.equals("video/avc") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0278, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x027e, code lost:
    
        if (r3.equals(r7) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0282, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0280, code lost:
    
        r3 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x02af, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x02da, code lost:
    
        throw hy7.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0210, code lost:
    
        r4 = rfd.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0220, code lost:
    
        if ((r4 + r4) > (r49.D - r49.E)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0222, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x02db, code lost:
    
        r23 = r3;
        r40 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02e1, code lost:
    
        if (r49.H == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02e3, code lost:
    
        r3 = r49.g;
        r3.K(r4);
        r51 = r7;
        ((cb3) r1).c(r3.a, 0, r49.F, false);
        r2.e(r49.F, r3);
        r4 = r49.F;
        r5 = rfd.m(r3.c, r3.a);
        r3.N(0);
        r3.M(r5);
        r5 = r6.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x030d, code lost:
    
        if (r5 != (-1)) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0311, code lost:
    
        if (r15.a == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0313, code lost:
    
        r15.l(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x031e, code lost:
    
        r15.a(r10, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0329, code lost:
    
        if ((r23.a() & 4) == 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x032b, code lost:
    
        r15.d(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0337, code lost:
    
        r49.E += r4;
        r49.F -= r4;
        r7 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0319, code lost:
    
        if (r15.a == r5) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x031b, code lost:
    
        r15.l(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0330, code lost:
    
        r51 = r7;
        r4 = r2.f(r1, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0344, code lost:
    
        r40 = r5;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0383, code lost:
    
        r1 = r14.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0389, code lost:
    
        if (r49.G != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x038b, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x038e, code lost:
    
        r19 = r1;
        r1 = r14.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0394, code lost:
    
        if (r1 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0396, code lost:
    
        r22 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x039d, code lost:
    
        r17 = r10;
        r2.a(r17, r19, r49.D, 0, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x03ae, code lost:
    
        if (r39.isEmpty() != false) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03b0, code lost:
    
        r1 = (er4) r39.removeFirst();
        r49.y -= r1.c;
        r2 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03c1, code lost:
    
        if (r1.b == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x03c3, code lost:
    
        r2 = r2 + r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x03c5, code lost:
    
        r4 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x03c7, code lost:
    
        if (r40 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03c9, code lost:
    
        r2 = r4.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x03cd, code lost:
    
        r6 = r2;
        r2 = r49.J;
        r3 = r2.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x03d2, code lost:
    
        if (r12 >= r3) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03d4, code lost:
    
        r2[r12].a(r6, 1, r1.c, r49.y, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03e2, code lost:
    
        r40 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x03e9, code lost:
    
        if (r14.c() != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x03eb, code lost:
    
        r49.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x03ee, code lost:
    
        r49.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03f2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x039b, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0348, code lost:
    
        r14 = r3;
        r40 = r5;
        r39 = r12;
        r3 = r14.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x034f, code lost:
    
        if (r3 == null) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0357, code lost:
    
        if (s3d.e(r6.t) == false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0359, code lost:
    
        r4 = s3d.h(r1, r49.D, r14.m);
        r14.m = r4;
        r4 = r4.a();
        r4.w = r3.x;
        xnb.v(r4, r2);
        r14.l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0371, code lost:
    
        r3 = r49.E;
        r4 = r49.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0375, code lost:
    
        if (r3 >= r4) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0377, code lost:
    
        r49.E += r2.f(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x01d7, code lost:
    
        r10 = r4.i[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0924, code lost:
    
        throw hy7.d("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0b4b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0925  */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
        long j;
        long j2;
        long j3;
        long j4;
        String v;
        String v2;
        long j5;
        long j6;
        long b0;
        long C;
        int i;
        char c;
        boolean z;
        char c2;
        int i2;
        long j7;
        int i3;
        long j8;
        long j9;
        long C2;
        long C3;
        f84 f84Var2 = f84Var;
        while (true) {
            byte b = this.s;
            ArrayDeque arrayDeque = this.m;
            lo loVar = this.o;
            wz4 wz4Var = this.q;
            int i4 = this.b;
            SparseArray sparseArray = this.d;
            ey7 ey7Var = this.i;
            boolean z2 = true;
            if (b != 0) {
                ArrayDeque arrayDeque2 = this.n;
                usb usbVar = this.j;
                if (b == 1) {
                    int i5 = (int) (this.u - this.v);
                    ey7 ey7Var2 = this.w;
                    if (ey7Var2 != null) {
                        ((cb3) f84Var).c(ey7Var2.a, 8, i5, false);
                        int i6 = this.t;
                        vh7 vh7Var = new vh7(i6, ey7Var2);
                        if (!arrayDeque.isEmpty()) {
                            ((uh7) arrayDeque.peek()).f.add(vh7Var);
                        } else if (i6 == 1936286840) {
                            cb3 cb3Var = (cb3) f84Var;
                            Pair l = l(cb3Var.d, ey7Var2);
                            wz4Var.y((sh2) l.second);
                            LinkedHashMap linkedHashMap = (LinkedHashMap) wz4Var.a;
                            this.B = ((Long) l.first).longValue();
                            if (this.M) {
                                i = 1;
                            } else {
                                i = 1;
                                this.I.m0(linkedHashMap.size() == 1 ? (zy9) l.second : wz4Var.G());
                                this.L = true;
                            }
                            if ((i4 & 256) != 0 && !this.M && linkedHashMap.size() > i) {
                                this.N = cb3Var.d;
                            }
                        } else if (i6 == 1701671783 && this.J.length != 0) {
                            ey7Var2.N(8);
                            int e = zy0.e(ey7Var2.m());
                            if (e == 0) {
                                v = ey7Var2.v();
                                v.getClass();
                                v2 = ey7Var2.v();
                                v2.getClass();
                                long C4 = ey7Var2.C();
                                long C5 = ey7Var2.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long b02 = gcc.b0(C5, 1000000L, C4, roundingMode);
                                long j10 = this.B;
                                long j11 = j10 != -9223372036854775807L ? j10 + b02 : -9223372036854775807L;
                                j5 = b02;
                                j6 = j11;
                                b0 = gcc.b0(ey7Var2.C(), 1000L, C4, roundingMode);
                                C = ey7Var2.C();
                            } else if (e != 1) {
                                c00.p(e, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long C6 = ey7Var2.C();
                                long G = ey7Var2.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j6 = gcc.b0(G, 1000000L, C6, roundingMode2);
                                long b03 = gcc.b0(ey7Var2.C(), 1000L, C6, roundingMode2);
                                long C7 = ey7Var2.C();
                                v = ey7Var2.v();
                                v.getClass();
                                v2 = ey7Var2.v();
                                v2.getClass();
                                b0 = b03;
                                C = C7;
                                j5 = -9223372036854775807L;
                            }
                            String str = v;
                            String str2 = v2;
                            byte[] bArr = new byte[ey7Var2.a()];
                            ey7Var2.k(0, ey7Var2.a(), bArr);
                            ey7 ey7Var3 = new ey7(this.k.t(new f54(str, str2, b0, C, bArr)));
                            int a = ey7Var3.a();
                            for (x1c x1cVar : this.J) {
                                ey7Var3.N(0);
                                x1cVar.e(a, ey7Var3);
                            }
                            if (j6 == -9223372036854775807L) {
                                arrayDeque2.addLast(new er4(a, j5, true));
                                this.y += a;
                            } else if (arrayDeque2.isEmpty()) {
                                if (usbVar != null) {
                                    if (usbVar.f()) {
                                        j6 = usbVar.a(j6);
                                    } else {
                                        arrayDeque2.addLast(new er4(a, j6, false));
                                        this.y += a;
                                    }
                                }
                                long j12 = j6;
                                for (x1c x1cVar2 : this.J) {
                                    x1cVar2.a(j12, 1, a, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new er4(a, j6, false));
                                this.y += a;
                            }
                        }
                    } else {
                        ((cb3) f84Var).l(i5, false);
                    }
                    m(((cb3) f84Var).d);
                } else if (b != 2) {
                    int i7 = 2;
                    if (b == 5) {
                        ey7Var.K(16);
                        cb3 cb3Var2 = (cb3) f84Var;
                        if (cb3Var2.c(ey7Var.a, 0, 16, true)) {
                            ey7Var.N(0);
                            int m = ey7Var.m();
                            int m2 = ey7Var.m();
                            if (m == 16 && m2 == 1835430511) {
                                ey7Var.O(4);
                                long C8 = ey7Var.C();
                                long j13 = cb3Var2.c - C8;
                                if (C8 <= 0 || C8 > 2147483647L || j13 < 0 || j13 < this.O) {
                                    j(new qc0(this.A, this.O), v11Var);
                                } else {
                                    v11Var.a = j13;
                                    this.s = (byte) 6;
                                }
                            } else {
                                j(new qc0(this.A, this.O), v11Var);
                            }
                        } else {
                            j(new qc0(this.A, this.O), v11Var);
                        }
                        byte b2 = this.s;
                        if (b2 == 6 || b2 == 0) {
                            return 1;
                        }
                    } else if (b != 6) {
                        gr4 gr4Var = this.C;
                        if (gr4Var != null) {
                            c = 6;
                            z = true;
                            c2 = 5;
                            break;
                        }
                        int size = sparseArray.size();
                        c = 6;
                        c2 = 5;
                        int i8 = 0;
                        gr4 gr4Var2 = null;
                        long j14 = Long.MAX_VALUE;
                        while (i8 < size) {
                            gr4 gr4Var3 = (gr4) sparseArray.valueAt(i8);
                            boolean z3 = z2;
                            boolean z4 = gr4Var3.n;
                            s1c s1cVar = gr4Var3.b;
                            int i9 = size;
                            if (z4) {
                                i2 = i8;
                                if (gr4Var3.h == s1cVar.d) {
                                    i8 = i2 + 1;
                                    size = i9;
                                    z2 = z3;
                                }
                                if (z4) {
                                }
                                if (j7 >= j14) {
                                }
                                i8 = i2 + 1;
                                size = i9;
                                z2 = z3;
                            } else {
                                i2 = i8;
                                if (gr4Var3.f == gr4Var3.d.b) {
                                    i8 = i2 + 1;
                                    size = i9;
                                    z2 = z3;
                                }
                                j7 = z4 ? gr4Var3.d.c[gr4Var3.f] : s1cVar.f[gr4Var3.h];
                                if (j7 >= j14) {
                                    gr4Var2 = gr4Var3;
                                    j14 = j7;
                                }
                                i8 = i2 + 1;
                                size = i9;
                                z2 = z3;
                            }
                        }
                        z = z2;
                        if (gr4Var2 == null) {
                            int i10 = (int) (this.x - ((cb3) f84Var2).d);
                            if (i10 < 0) {
                                throw hy7.a("Offset to end of mdat was negative.", null);
                            }
                            ((cb3) f84Var2).l(i10, false);
                            h();
                        } else {
                            int i11 = (int) ((!gr4Var2.n ? gr4Var2.d.c[gr4Var2.f] : gr4Var2.b.f[gr4Var2.h]) - ((cb3) f84Var2).d);
                            if (i11 < 0) {
                                efd.f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                i11 = 0;
                            }
                            ((cb3) f84Var2).l(i11, false);
                            this.C = gr4Var2;
                            gr4Var = gr4Var2;
                        }
                    } else {
                        cb3 cb3Var3 = (cb3) f84Var2;
                        long j15 = ((cb3) f84Var2).c - cb3Var3.d;
                        ey7Var.K(8);
                        if (cb3Var3.d(ey7Var.a, 0, 8, true)) {
                            ey7Var.N(0);
                            int m3 = ey7Var.m();
                            if (ey7Var.m() != 1835430497) {
                                j(new qc0(this.A, this.O), v11Var);
                            } else {
                                int i12 = (int) j15;
                                ey7 ey7Var4 = new ey7(i12);
                                cb3Var3.c(ey7Var4.a, 0, i12, false);
                                ey7Var4.N(m3 == 1 ? 16 : 8);
                                SparseArray sparseArray2 = new SparseArray();
                                SparseArray sparseArray3 = new SparseArray();
                                while (ey7Var4.a() >= 8) {
                                    int i13 = ey7Var4.b;
                                    long C9 = ey7Var4.C();
                                    int m4 = ey7Var4.m();
                                    if (C9 == 1) {
                                        if (ey7Var4.a() < 8) {
                                            break;
                                        }
                                        C9 = ey7Var4.u();
                                    } else if (C9 == 0) {
                                        C9 = ey7Var4.c - i13;
                                    }
                                    if (C9 < (C9 == 1 ? 16 : 8)) {
                                        break;
                                    }
                                    long j16 = i13;
                                    if (C9 > ey7Var4.c - j16) {
                                        break;
                                    }
                                    if (m4 != 1952871009) {
                                        j8 = C9;
                                        j9 = j16;
                                    } else if (C9 < r10 + 16) {
                                        ey7Var4.N((int) (j16 + C9));
                                    } else {
                                        int e2 = zy0.e(ey7Var4.m());
                                        int m5 = ey7Var4.m();
                                        gr4 gr4Var4 = (gr4) sparseArray.get(m5);
                                        if (gr4Var4 == null) {
                                            ey7Var4.N((int) (j16 + C9));
                                        } else {
                                            long j17 = gr4Var4.d.a.c;
                                            int m6 = ey7Var4.m();
                                            int i14 = (m6 >> 4) & 3;
                                            int i15 = (m6 >> 2) & 3;
                                            int i16 = m6 & 3;
                                            j8 = C9;
                                            long C10 = ey7Var4.C();
                                            int i17 = i14 + 1;
                                            int i18 = i15 + 1;
                                            j9 = j16;
                                            int i19 = i16 + 1;
                                            if (((e2 == 1 ? 16L : 8L) + i17 + i18 + i19) * C10 > ey7Var4.a()) {
                                                ey7Var4.N((int) (j9 + j8));
                                            } else {
                                                int i20 = (int) C10;
                                                long[] jArr = new long[i20];
                                                long[] jArr2 = new long[i20];
                                                for (int i21 = 0; i21 < i20; i21++) {
                                                    if (e2 == 1) {
                                                        C2 = ey7Var4.G();
                                                        C3 = ey7Var4.G();
                                                    } else {
                                                        C2 = ey7Var4.C();
                                                        C3 = ey7Var4.C();
                                                    }
                                                    long j18 = C3;
                                                    long j19 = C2;
                                                    ey7Var4.O(i17 + i18 + i19);
                                                    if (j17 != -9223372036854775807L) {
                                                        j19 = gcc.b0(j19, 1000000L, j17, RoundingMode.DOWN);
                                                    }
                                                    jArr[i21] = j19;
                                                    jArr2[i21] = j18;
                                                }
                                                sparseArray2.put(m5, jArr);
                                                sparseArray3.put(m5, jArr2);
                                            }
                                        }
                                    }
                                    ey7Var4.N((int) (j9 + j8));
                                }
                                if (sparseArray2.size() == 0) {
                                    j(new qc0(this.A, this.O), v11Var);
                                } else {
                                    int i22 = -1;
                                    int i23 = -1;
                                    int i24 = 0;
                                    while (i24 < sparseArray2.size()) {
                                        int keyAt = sparseArray2.keyAt(i24);
                                        gr4 gr4Var5 = (gr4) sparseArray.get(keyAt);
                                        if (gr4Var5 != null) {
                                            int i25 = gr4Var5.d.a.b;
                                            if (i22 == -1 && i25 == i7) {
                                                i22 = keyAt;
                                            } else if (i23 == -1 && i25 == 1) {
                                                i23 = keyAt;
                                            }
                                        }
                                        i24++;
                                        i7 = 2;
                                    }
                                    if (i22 == -1) {
                                        if (i23 != -1) {
                                            i3 = i23;
                                            j(new fr4(sparseArray2, sparseArray3, this.A, this.O, i3), v11Var);
                                        } else {
                                            i22 = sparseArray2.keyAt(0);
                                        }
                                    }
                                    i3 = i22;
                                    j(new fr4(sparseArray2, sparseArray3, this.A, this.O, i3), v11Var);
                                }
                            }
                        } else {
                            j(new qc0(this.A, this.O), v11Var);
                        }
                        if (this.s == 0) {
                            return 1;
                        }
                    }
                } else {
                    int size2 = sparseArray.size();
                    gr4 gr4Var6 = null;
                    long j20 = Long.MAX_VALUE;
                    for (int i26 = 0; i26 < size2; i26++) {
                        s1c s1cVar2 = ((gr4) sparseArray.valueAt(i26)).b;
                        if (s1cVar2.o) {
                            long j21 = s1cVar2.c;
                            if (j21 < j20) {
                                gr4Var6 = (gr4) sparseArray.valueAt(i26);
                                j20 = j21;
                            }
                        }
                    }
                    if (gr4Var6 == null) {
                        this.s = (byte) 3;
                    } else {
                        int i27 = (int) (j20 - ((cb3) f84Var).d);
                        if (i27 < 0) {
                            throw hy7.a("Offset to encryption data was negative.", null);
                        }
                        cb3 cb3Var4 = (cb3) f84Var;
                        cb3Var4.l(i27, false);
                        s1c s1cVar3 = gr4Var6.b;
                        ey7 ey7Var5 = s1cVar3.n;
                        cb3Var4.c(ey7Var5.a, 0, ey7Var5.c, false);
                        ey7Var5.N(0);
                        s1cVar3.o = false;
                    }
                }
            } else {
                int i28 = this.v;
                ey7 ey7Var6 = this.l;
                if (i28 == 0) {
                    if (!((cb3) f84Var).c(ey7Var6.a, 0, 8, true)) {
                        long j22 = this.N;
                        if (j22 == -1) {
                            loVar.d(0);
                            return -1;
                        }
                        v11Var.a = j22;
                        this.N = -1L;
                        this.I.m0(wz4Var.G());
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    ey7Var6.N(0);
                    this.u = ey7Var6.C();
                    this.t = ey7Var6.m();
                }
                long j23 = this.u;
                if (j23 == 1) {
                    ((cb3) f84Var).c(ey7Var6.a, 8, 8, false);
                    this.v += 8;
                    this.u = ey7Var6.G();
                } else if (j23 == 0) {
                    long j24 = ((cb3) f84Var).c;
                    if (j24 == -1 && !arrayDeque.isEmpty()) {
                        j24 = ((uh7) arrayDeque.peek()).e;
                    }
                    if (j24 != -1) {
                        j = -1;
                        this.u = (j24 - ((cb3) f84Var).d) + this.v;
                        j2 = this.u;
                        int i29 = this.v;
                        j3 = i29;
                        if (j2 < j3) {
                            j4 = j3;
                        } else {
                            if (this.t != 1718773093 || i29 != 8) {
                                break;
                            }
                            this.u = j3;
                            j2 = j3;
                            j4 = j2;
                        }
                        if (this.N == j) {
                            if (this.t == 1936286840) {
                                ey7Var.K((int) j2);
                                System.arraycopy(ey7Var6.a, 0, ey7Var.a, 0, 8);
                                ((cb3) f84Var).c(ey7Var.a, 8, (int) (this.u - this.v), false);
                                wz4Var.y((sh2) l(((cb3) f84Var).e(), ey7Var).second);
                            } else {
                                ((cb3) f84Var).l((int) (j2 - j4), true);
                            }
                            h();
                        } else {
                            long j25 = ((cb3) f84Var).d - i29;
                            int i30 = this.t;
                            if ((i30 == 1836019558 || i30 == 1835295092) && !this.L) {
                                long j26 = ((cb3) f84Var).c;
                                if (j26 == j || this.O != j || (i4 & 512) == 0) {
                                    this.I.m0(new qc0(this.A, j25));
                                    this.L = true;
                                } else {
                                    this.O = j25;
                                    v11Var.a = j26 - 16;
                                    this.s = (byte) 5;
                                }
                            }
                            if (this.t == 1836019558) {
                                int size3 = sparseArray.size();
                                for (int i31 = 0; i31 < size3; i31++) {
                                    s1c s1cVar4 = ((gr4) sparseArray.valueAt(i31)).b;
                                    s1cVar4.getClass();
                                    s1cVar4.c = j25;
                                    s1cVar4.b = j25;
                                }
                            }
                            int i32 = this.t;
                            if (i32 == 1835295092) {
                                this.C = null;
                                this.x = j25 + this.u;
                                this.s = (byte) 2;
                            } else if (i32 == 1836019574 || i32 == 1953653099 || i32 == 1835297121 || i32 == 1835626086 || i32 == 1937007212 || i32 == 1836019558 || i32 == 1953653094 || i32 == 1836475768 || i32 == 1701082227 || i32 == 1835365473) {
                                cb3 cb3Var5 = (cb3) f84Var;
                                long j27 = cb3Var5.d;
                                long j28 = this.u;
                                long j29 = (j27 + j28) - 8;
                                if (j28 != this.v && i32 == 1835365473) {
                                    ey7Var.K(8);
                                    cb3Var5.d(ey7Var.a, 0, 8, false);
                                    zy0.a(ey7Var);
                                    cb3Var5.l(ey7Var.b, false);
                                    cb3Var5.f = 0;
                                }
                                arrayDeque.push(new uh7(this.t, j29));
                                if (this.u == this.v) {
                                    m(j29);
                                } else {
                                    h();
                                }
                            } else if (i32 == 1751411826 || i32 == 1835296868 || i32 == 1836476516 || i32 == 1936286840 || i32 == 1937011556 || i32 == 1937011827 || i32 == 1668576371 || i32 == 1937011555 || i32 == 1937011578 || i32 == 1937013298 || i32 == 1937007471 || i32 == 1668232756 || i32 == 1937011571 || i32 == 1952867444 || i32 == 1952868452 || i32 == 1953196132 || i32 == 1953654136 || i32 == 1953658222 || i32 == 1886614376 || i32 == 1935763834 || i32 == 1935763823 || i32 == 1936027235 || i32 == 1970628964 || i32 == 1935828848 || i32 == 1936158820 || i32 == 1701606260 || i32 == 1835362404 || i32 == 1701671783 || i32 == 1969517665 || i32 == 1801812339 || i32 == 1768715124) {
                                if (this.v != 8) {
                                    throw hy7.d("Leaf atom defines extended atom size (unsupported).");
                                }
                                if (this.u > 2147483647L) {
                                    throw hy7.d("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                ey7 ey7Var7 = new ey7((int) this.u);
                                System.arraycopy(ey7Var6.a, 0, ey7Var7.a, 0, 8);
                                this.w = ey7Var7;
                                this.s = (byte) 1;
                            } else {
                                if (this.u > 2147483647L) {
                                    throw hy7.d("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                this.w = null;
                                this.s = (byte) 1;
                            }
                        }
                        if (this.s == 5) {
                            return 1;
                        }
                    }
                }
                j = -1;
                j2 = this.u;
                int i292 = this.v;
                j3 = i292;
                if (j2 < j3) {
                }
                if (this.N == j) {
                }
                if (this.s == 5) {
                }
            }
            f84Var2 = f84Var;
        }
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        j99 j99Var;
        una a = qhd.a(f84Var, true);
        if (a != null) {
            j99Var = po5.u(a);
        } else {
            no5 no5Var = po5.b;
            j99Var = j99.e;
        }
        this.r = j99Var;
        return a == null;
    }

    @Override // e84
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((gr4) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j2;
        this.m.clear();
        this.O = -1L;
        h();
    }

    @Override // e84
    public final List e() {
        return this.r;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            g84Var = new vh4(g84Var, this.a);
        }
        this.I = g84Var;
        h();
        x1c[] x1cVarArr = new x1c[2];
        this.J = x1cVarArr;
        int i3 = 0;
        fg8 fg8Var = this.p;
        if (fg8Var != null) {
            x1cVarArr[0] = fg8Var;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            x1cVarArr[i] = this.I.e0(100, 5);
            i4 = 101;
            i++;
        }
        x1c[] x1cVarArr2 = (x1c[]) gcc.V(i, this.J);
        this.J = x1cVarArr2;
        for (x1c x1cVar : x1cVarArr2) {
            x1cVar.g(Q);
        }
        List list = this.c;
        this.K = new x1c[list.size()];
        while (i3 < this.K.length) {
            x1c e0 = this.I.e0(i4, 3);
            e0.g((ko4) list.get(i3));
            this.K[i3] = e0;
            i3++;
            i4++;
        }
    }

    public final void h() {
        this.s = (byte) 0;
        this.v = 0;
    }

    public final void j(zy9 zy9Var, v11 v11Var) {
        this.I.m0(zy9Var);
        this.L = true;
        v11Var.a = this.O;
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:440:0x0804, code lost:
    
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0807, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(long j) {
        uf7 uf7Var;
        int i;
        uf7 uf7Var2;
        ArrayList arrayList;
        int i2;
        pc3 pc3Var;
        int i3;
        ArrayList arrayList2;
        pc3 pc3Var2;
        ArrayList arrayList3;
        int i4;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList6;
        byte[] bArr;
        int i9;
        boolean z;
        int i10;
        int i11;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        int i15;
        pc3 pc3Var3;
        int i16;
        int i17;
        int i18;
        int i19;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((uh7) arrayDeque.peek()).e != j) {
                break;
            }
            uh7 uh7Var = (uh7) arrayDeque.pop();
            int i20 = uh7Var.b;
            ArrayList arrayList9 = uh7Var.g;
            ArrayList arrayList10 = uh7Var.f;
            int i21 = 12;
            SparseArray sparseArray = this.d;
            int i22 = this.b;
            if (i20 == 1836019574) {
                hr3 i23 = i(arrayList10);
                uh7 u = uh7Var.u(1836475768);
                u.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList11 = u.f;
                int size = arrayList11.size();
                long j2 = -9223372036854775807L;
                int i24 = 0;
                while (i24 < size) {
                    vh7 vh7Var = (vh7) arrayList11.get(i24);
                    int i25 = vh7Var.b;
                    ey7 ey7Var = vh7Var.e;
                    if (i25 == 1953654136) {
                        ey7Var.N(i21);
                        arrayList3 = arrayList11;
                        Pair create = Pair.create(Integer.valueOf(ey7Var.m()), new pc3(ey7Var.m() - 1, ey7Var.m(), ey7Var.m(), ey7Var.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (pc3) create.second);
                    } else {
                        arrayList3 = arrayList11;
                        if (i25 == 1835362404) {
                            ey7Var.N(8);
                            j2 = zy0.e(ey7Var.m()) == 0 ? ey7Var.C() : ey7Var.G();
                        }
                    }
                    i24++;
                    arrayList11 = arrayList3;
                    i21 = 12;
                }
                uh7 u2 = uh7Var.u(1835365473);
                uf7 f = u2 != null ? zy0.f(u2) : null;
                du4 du4Var = new du4();
                vh7 v = uh7Var.v(1969517665);
                if (v != null) {
                    uf7 k = zy0.k(v, (i22 & 1024) != 0);
                    du4Var.b(k);
                    uf7Var = k;
                } else {
                    uf7Var = null;
                }
                vh7 v2 = uh7Var.v(1836476516);
                v2.getClass();
                uf7 uf7Var3 = new uf7(zy0.g(v2.e));
                ArrayList j3 = zy0.j(uh7Var, du4Var, j2, i23, (i22 & 16) != 0, false, new dr4(this, (byte) 0), false);
                int size2 = j3.size();
                if (sparseArray.size() == 0) {
                    String a = ute.a(j3);
                    int i26 = 0;
                    while (i26 < size2) {
                        y1c y1cVar = (y1c) j3.get(i26);
                        p1c p1cVar = y1cVar.a;
                        boolean z4 = p1cVar.m;
                        int i27 = p1cVar.a;
                        ko4 ko4Var = p1cVar.g;
                        int i28 = size2;
                        String str = a;
                        long j4 = p1cVar.e;
                        int i29 = p1cVar.b;
                        if (z4) {
                            x1c e0 = this.I.e0(i26, i29);
                            e0.d(j4);
                            i = i26;
                            jo4 a2 = ko4Var.a();
                            uf7Var2 = uf7Var3;
                            a2.r = dg7.n(str);
                            if (i29 == 1) {
                                int i30 = du4Var.a;
                                i2 = i28;
                                arrayList = j3;
                                if (i30 != -1 && (i3 = du4Var.b) != -1) {
                                    a2.Q = i30;
                                    a2.R = i3;
                                }
                            } else {
                                arrayList = j3;
                                i2 = i28;
                            }
                            tte.f(i29, f, a2, ko4Var.m, uf7Var, uf7Var2);
                            if (sparseArray2.size() == 1) {
                                pc3Var = (pc3) sparseArray2.valueAt(0);
                            } else {
                                pc3Var = (pc3) sparseArray2.get(i27);
                                pc3Var.getClass();
                            }
                            sparseArray.put(i27, new gr4(e0, y1cVar, pc3Var, new ko4(a2)));
                            this.A = Math.max(this.A, j4);
                        } else {
                            arrayList = j3;
                            i = i26;
                            uf7Var2 = uf7Var3;
                            i2 = i28;
                        }
                        i26 = i + 1;
                        a = str;
                        uf7Var3 = uf7Var2;
                        size2 = i2;
                        j3 = arrayList;
                    }
                    this.I.D();
                } else {
                    ArrayList arrayList12 = j3;
                    int i31 = 0;
                    int i32 = 0;
                    while (true) {
                        arrayList2 = arrayList12;
                        if (i31 >= size2) {
                            break;
                        }
                        if (((y1c) arrayList2.get(i31)).a.m) {
                            i32++;
                        }
                        i31++;
                        arrayList12 = arrayList2;
                    }
                    yve.p(sparseArray.size() == i32);
                    for (int i33 = 0; i33 < size2; i33++) {
                        y1c y1cVar2 = (y1c) arrayList2.get(i33);
                        p1c p1cVar2 = y1cVar2.a;
                        boolean z5 = p1cVar2.m;
                        int i34 = p1cVar2.a;
                        if (z5) {
                            gr4 gr4Var = (gr4) sparseArray.get(i34);
                            if (sparseArray2.size() == 1) {
                                pc3Var2 = (pc3) sparseArray2.valueAt(0);
                            } else {
                                pc3Var2 = (pc3) sparseArray2.get(i34);
                                pc3Var2.getClass();
                            }
                            gr4Var.d = y1cVar2;
                            gr4Var.e = pc3Var2;
                            if (gr4Var.l == null) {
                                gr4Var.a.g(gr4Var.m);
                            }
                            gr4Var.e();
                        }
                    }
                }
            } else if (i20 == 1836019558) {
                int size3 = arrayList9.size();
                int i35 = 0;
                while (i35 < size3) {
                    uh7 uh7Var2 = (uh7) arrayList9.get(i35);
                    if (uh7Var2.b == 1953653094) {
                        vh7 v3 = uh7Var2.v(1952868452);
                        ArrayList arrayList13 = uh7Var2.f;
                        v3.getClass();
                        ey7 ey7Var2 = v3.e;
                        ey7Var2.N(8);
                        int m = ey7Var2.m();
                        byte[] bArr2 = zy0.a;
                        gr4 gr4Var2 = (gr4) sparseArray.get(ey7Var2.m());
                        if (gr4Var2 == null) {
                            i4 = size3;
                            gr4Var2 = null;
                        } else {
                            s1c s1cVar = gr4Var2.b;
                            if ((m & 1) != 0) {
                                long G = ey7Var2.G();
                                s1cVar.b = G;
                                s1cVar.c = G;
                            }
                            pc3 pc3Var4 = gr4Var2.e;
                            int m2 = (m & 2) != 0 ? ey7Var2.m() - 1 : pc3Var4.a;
                            int m3 = (m & 8) != 0 ? ey7Var2.m() : pc3Var4.b;
                            if ((m & 16) != 0) {
                                i4 = size3;
                                i7 = ey7Var2.m();
                            } else {
                                i4 = size3;
                                i7 = pc3Var4.c;
                            }
                            s1cVar.a = new pc3(m2, m3, i7, (m & 32) != 0 ? ey7Var2.m() : pc3Var4.d);
                        }
                        if (gr4Var2 != null) {
                            s1c s1cVar2 = gr4Var2.b;
                            long j5 = s1cVar2.p;
                            boolean z6 = s1cVar2.q;
                            gr4Var2.e();
                            gr4Var2.n = true;
                            vh7 v4 = uh7Var2.v(1952867444);
                            if (v4 == null || (i22 & 2) != 0) {
                                s1cVar2.p = j5;
                                s1cVar2.q = z6;
                            } else {
                                ey7 ey7Var3 = v4.e;
                                ey7Var3.N(8);
                                s1cVar2.p = zy0.e(ey7Var3.m()) == 1 ? ey7Var3.G() : ey7Var3.C();
                                s1cVar2.q = true;
                            }
                            int size4 = arrayList13.size();
                            int i36 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            while (true) {
                                i8 = 1953658222;
                                if (i36 >= size4) {
                                    break;
                                }
                                vh7 vh7Var2 = (vh7) arrayList13.get(i36);
                                ArrayList arrayList14 = arrayList9;
                                if (vh7Var2.b == 1953658222) {
                                    ey7 ey7Var4 = vh7Var2.e;
                                    ey7Var4.N(12);
                                    int E = ey7Var4.E();
                                    if (E > 0) {
                                        i38 += E;
                                        i37++;
                                    }
                                }
                                i36++;
                                arrayList9 = arrayList14;
                            }
                            arrayList4 = arrayList9;
                            gr4Var2.h = 0;
                            gr4Var2.g = 0;
                            gr4Var2.f = 0;
                            s1cVar2.d = i37;
                            s1cVar2.e = i38;
                            if (s1cVar2.g.length < i37) {
                                s1cVar2.f = new long[i37];
                                s1cVar2.g = new int[i37];
                            }
                            if (s1cVar2.h.length < i38) {
                                int i39 = (i38 * jn7.I1) / 100;
                                s1cVar2.h = new int[i39];
                                s1cVar2.i = new long[i39];
                                s1cVar2.j = new boolean[i39];
                                s1cVar2.l = new boolean[i39];
                            }
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            while (true) {
                                long j6 = 0;
                                if (i40 < size4) {
                                    vh7 vh7Var3 = (vh7) arrayList13.get(i40);
                                    if (vh7Var3.b == i8) {
                                        int i43 = i41 + 1;
                                        ey7 ey7Var5 = vh7Var3.e;
                                        ey7Var5.N(8);
                                        int m4 = ey7Var5.m();
                                        byte[] bArr3 = zy0.a;
                                        i10 = size4;
                                        p1c p1cVar3 = gr4Var2.d.a;
                                        i11 = i40;
                                        pc3 pc3Var5 = s1cVar2.a;
                                        String str2 = gcc.a;
                                        arrayList7 = arrayList10;
                                        s1cVar2.g[i41] = ey7Var5.E();
                                        long[] jArr = s1cVar2.f;
                                        i12 = i35;
                                        i13 = i22;
                                        long j7 = s1cVar2.b;
                                        jArr[i41] = j7;
                                        if ((m4 & 1) != 0) {
                                            jArr[i41] = j7 + ey7Var5.m();
                                        }
                                        boolean z7 = (m4 & 4) != 0;
                                        int i44 = pc3Var5.d;
                                        if (z7) {
                                            i44 = ey7Var5.m();
                                        }
                                        boolean z8 = (m4 & 256) != 0;
                                        boolean z9 = z7;
                                        boolean z10 = (m4 & 512) != 0;
                                        boolean z11 = (m4 & 1024) != 0;
                                        boolean z12 = (m4 & 2048) != 0;
                                        boolean z13 = z11;
                                        ro5 ro5Var = p1cVar3.i;
                                        int i45 = i41;
                                        ro5 ro5Var2 = p1cVar3.j;
                                        if (ro5Var != null) {
                                            i14 = i44;
                                            z2 = z8;
                                            if (ro5Var.b != 1 || ro5Var2 == null) {
                                                arrayList8 = arrayList13;
                                            } else {
                                                if (ro5Var.a(0) == 0) {
                                                    arrayList8 = arrayList13;
                                                } else {
                                                    long a3 = ro5Var.a(0);
                                                    long j8 = p1cVar3.d;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    long b0 = gcc.b0(a3, 1000000L, j8, roundingMode);
                                                    arrayList8 = arrayList13;
                                                    i19 = b0 + gcc.b0(ro5Var2.a(0), 1000000L, p1cVar3.c, roundingMode) >= p1cVar3.e ? 0 : 0;
                                                }
                                                j6 = ro5Var2.a(i19);
                                            }
                                        } else {
                                            arrayList8 = arrayList13;
                                            i14 = i44;
                                            z2 = z8;
                                        }
                                        int[] iArr = s1cVar2.h;
                                        long[] jArr2 = s1cVar2.i;
                                        boolean[] zArr = s1cVar2.j;
                                        boolean z14 = p1cVar3.b == 2 && (i13 & 1) != 0;
                                        int i46 = s1cVar2.g[i45] + i42;
                                        long j9 = p1cVar3.c;
                                        long j10 = s1cVar2.p;
                                        while (i42 < i46) {
                                            int m5 = z2 ? ey7Var5.m() : pc3Var5.b;
                                            boolean[] zArr2 = zArr;
                                            if (m5 < 0) {
                                                throw hy7.a("Unexpected negative value: " + m5, null);
                                            }
                                            if (z10) {
                                                z3 = z14;
                                                i15 = ey7Var5.m();
                                            } else {
                                                z3 = z14;
                                                i15 = pc3Var5.c;
                                            }
                                            if (i15 < 0) {
                                                throw hy7.a("Unexpected negative value: " + i15, null);
                                            }
                                            int m6 = z13 ? ey7Var5.m() : (i42 == 0 && z9) ? i14 : pc3Var5.d;
                                            if (z12) {
                                                pc3Var3 = pc3Var5;
                                                i16 = ey7Var5.m();
                                                i18 = i42;
                                                i17 = i46;
                                            } else {
                                                pc3Var3 = pc3Var5;
                                                i16 = 0;
                                                i17 = i46;
                                                i18 = i42;
                                            }
                                            long b02 = gcc.b0((i16 + j10) - j6, 1000000L, j9, RoundingMode.DOWN);
                                            jArr2[i18] = b02;
                                            if (!s1cVar2.q) {
                                                jArr2[i18] = b02 + gr4Var2.d.i;
                                            }
                                            iArr[i18] = i15;
                                            zArr2[i18] = ((m6 >> 16) & 1) == 0 && (!z3 || i18 == 0);
                                            j10 += m5;
                                            i42 = i18 + 1;
                                            i46 = i17;
                                            zArr = zArr2;
                                            z14 = z3;
                                            pc3Var5 = pc3Var3;
                                        }
                                        s1cVar2.p = j10;
                                        i41 = i43;
                                        i42 = i46;
                                    } else {
                                        i10 = size4;
                                        i11 = i40;
                                        arrayList7 = arrayList10;
                                        arrayList8 = arrayList13;
                                        i12 = i35;
                                        i13 = i22;
                                    }
                                    i40 = i11 + 1;
                                    size4 = i10;
                                    arrayList10 = arrayList7;
                                    i22 = i13;
                                    i35 = i12;
                                    arrayList13 = arrayList8;
                                    i8 = 1953658222;
                                } else {
                                    arrayList5 = arrayList10;
                                    ArrayList arrayList15 = arrayList13;
                                    i5 = i35;
                                    i6 = i22;
                                    p1c p1cVar4 = gr4Var2.d.a;
                                    pc3 pc3Var6 = s1cVar2.a;
                                    pc3Var6.getClass();
                                    int i47 = pc3Var6.a;
                                    r1c[] r1cVarArr = p1cVar4.n;
                                    r1c r1cVar = r1cVarArr == null ? null : r1cVarArr[i47];
                                    vh7 v5 = uh7Var2.v(1935763834);
                                    if (v5 != null) {
                                        r1cVar.getClass();
                                        ey7 ey7Var6 = v5.e;
                                        short s = r1cVar.d;
                                        ey7Var6.N(8);
                                        int m7 = ey7Var6.m();
                                        byte[] bArr4 = zy0.a;
                                        if ((m7 & 1) == 1) {
                                            ey7Var6.O(8);
                                        }
                                        int A = ey7Var6.A();
                                        int E2 = ey7Var6.E();
                                        if (E2 > s1cVar2.e) {
                                            StringBuilder m8 = uh9.m(E2, "Saiz sample count ", " is greater than fragment sample count");
                                            m8.append(s1cVar2.e);
                                            throw hy7.a(m8.toString(), null);
                                        }
                                        if (A == 0) {
                                            boolean[] zArr3 = s1cVar2.l;
                                            i9 = 0;
                                            for (int i48 = 0; i48 < E2; i48++) {
                                                int A2 = ey7Var6.A();
                                                i9 += A2;
                                                zArr3[i48] = A2 > s;
                                            }
                                            z = false;
                                        } else {
                                            i9 = A * E2;
                                            z = false;
                                            Arrays.fill(s1cVar2.l, 0, E2, A > s);
                                        }
                                        Arrays.fill(s1cVar2.l, E2, s1cVar2.e, z);
                                        if (i9 > 0) {
                                            s1cVar2.n.K(i9);
                                            s1cVar2.k = true;
                                            s1cVar2.o = true;
                                        }
                                    }
                                    vh7 v6 = uh7Var2.v(1935763823);
                                    if (v6 != null) {
                                        ey7 ey7Var7 = v6.e;
                                        ey7Var7.N(8);
                                        int m9 = ey7Var7.m();
                                        byte[] bArr5 = zy0.a;
                                        if ((m9 & 1) == 1) {
                                            ey7Var7.O(8);
                                        }
                                        int E3 = ey7Var7.E();
                                        if (E3 != 1) {
                                            throw hy7.a("Unexpected saio entry count: " + E3, null);
                                        }
                                        s1cVar2.c += zy0.e(m9) == 0 ? ey7Var7.C() : ey7Var7.G();
                                    }
                                    vh7 v7 = uh7Var2.v(1936027235);
                                    if (v7 != null) {
                                        k(v7.e, 0, s1cVar2);
                                    }
                                    String str3 = r1cVar != null ? r1cVar.b : null;
                                    ey7 ey7Var8 = null;
                                    ey7 ey7Var9 = null;
                                    int i49 = 0;
                                    while (true) {
                                        arrayList6 = arrayList15;
                                        if (i49 >= arrayList15.size()) {
                                            break;
                                        }
                                        vh7 vh7Var4 = (vh7) arrayList6.get(i49);
                                        ey7 ey7Var10 = vh7Var4.e;
                                        int i50 = vh7Var4.b;
                                        if (i50 == 1935828848) {
                                            ey7Var10.N(12);
                                            if (ey7Var10.m() == 1936025959) {
                                                ey7Var8 = ey7Var10;
                                            }
                                        } else if (i50 == 1936158820) {
                                            ey7Var10.N(12);
                                            if (ey7Var10.m() == 1936025959) {
                                                ey7Var9 = ey7Var10;
                                            }
                                        }
                                        i49++;
                                        arrayList15 = arrayList6;
                                    }
                                    if (ey7Var8 != null && ey7Var9 != null) {
                                        ey7Var8.N(8);
                                        int e = zy0.e(ey7Var8.m());
                                        ey7Var8.O(4);
                                        if (e == 1) {
                                            ey7Var8.O(4);
                                        }
                                        if (ey7Var8.m() != 1) {
                                            throw hy7.d("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        ey7Var9.N(8);
                                        int e2 = zy0.e(ey7Var9.m());
                                        ey7Var9.O(4);
                                        long C = e2 >= 1 ? ey7Var9.C() : 0L;
                                        if (e2 >= 2) {
                                            ey7Var9.O(4);
                                        }
                                        if (ey7Var9.C() != 1) {
                                            throw hy7.d("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        if (e2 >= 1 && C == 0) {
                                            ey7Var9.O(4);
                                        }
                                        ey7Var9.O(1);
                                        int A3 = ey7Var9.A();
                                        int i51 = (A3 & jn7.O3) >> 4;
                                        int i52 = A3 & 15;
                                        boolean z15 = ey7Var9.A() == 1;
                                        if (z15) {
                                            int A4 = ey7Var9.A();
                                            byte[] bArr6 = new byte[16];
                                            ey7Var9.k(0, 16, bArr6);
                                            if (A4 == 0) {
                                                int A5 = ey7Var9.A();
                                                byte[] bArr7 = new byte[A5];
                                                ey7Var9.k(0, A5, bArr7);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            s1cVar2.k = true;
                                            s1cVar2.m = new r1c(z15, str3, A4, bArr6, i51, i52, bArr);
                                        }
                                    }
                                    int size5 = arrayList6.size();
                                    for (int i53 = 0; i53 < size5; i53++) {
                                        vh7 vh7Var5 = (vh7) arrayList6.get(i53);
                                        if (vh7Var5.b == 1970628964) {
                                            ey7 ey7Var11 = vh7Var5.e;
                                            ey7Var11.N(8);
                                            byte[] bArr8 = this.h;
                                            ey7Var11.k(0, 16, bArr8);
                                            if (Arrays.equals(bArr8, P)) {
                                                k(ey7Var11, 16, s1cVar2);
                                            }
                                        }
                                    }
                                }
                            }
                            i35 = i5 + 1;
                            size3 = i4;
                            arrayList9 = arrayList4;
                            arrayList10 = arrayList5;
                            i22 = i6;
                        }
                    } else {
                        i4 = size3;
                    }
                    arrayList4 = arrayList9;
                    arrayList5 = arrayList10;
                    i5 = i35;
                    i6 = i22;
                    i35 = i5 + 1;
                    size3 = i4;
                    arrayList9 = arrayList4;
                    arrayList10 = arrayList5;
                    i22 = i6;
                }
                hr3 i54 = i(arrayList10);
                if (i54 != null) {
                    int size6 = sparseArray.size();
                    for (int i55 = 0; i55 < size6; i55++) {
                        gr4 gr4Var3 = (gr4) sparseArray.valueAt(i55);
                        p1c p1cVar5 = gr4Var3.d.a;
                        pc3 pc3Var7 = gr4Var3.b.a;
                        String str4 = gcc.a;
                        int i56 = pc3Var7.a;
                        r1c[] r1cVarArr2 = p1cVar5.n;
                        r1c r1cVar2 = r1cVarArr2 == null ? null : r1cVarArr2[i56];
                        hr3 a4 = i54.a(r1cVar2 != null ? r1cVar2.b : null);
                        jo4 a5 = gr4Var3.m.a();
                        a5.w = a4;
                        ko4 ko4Var2 = new ko4(a5);
                        if (gr4Var3.l != null) {
                            gr4Var3.l = ko4Var2;
                        } else {
                            gr4Var3.a.g(ko4Var2);
                        }
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i57 = 0; i57 < size7; i57++) {
                        gr4 gr4Var4 = (gr4) sparseArray.valueAt(i57);
                        long j11 = this.z;
                        int i58 = gr4Var4.f;
                        while (true) {
                            s1c s1cVar3 = gr4Var4.b;
                            if (i58 < s1cVar3.e && s1cVar3.i[i58] <= j11) {
                                if (s1cVar3.j[i58]) {
                                    gr4Var4.i = i58;
                                }
                                i58++;
                            }
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((uh7) arrayDeque.peek()).g.add(uh7Var);
            }
        }
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
