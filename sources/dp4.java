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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dp4 implements j74 {
    public static final byte[] P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final fm4 Q;
    public long A;
    public long B;
    public cp4 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public l74 I;
    public wxb[] J;
    public wxb[] K;
    public boolean L;
    public boolean M;
    public long N;
    public long O;
    public final sab a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final xu7 i;
    public final uob j;
    public final ko o;
    public final qc8 p;
    public final lj9 q;
    public w59 r;
    public byte s;
    public int t;
    public long u;
    public int v;
    public xu7 w;
    public long x;
    public int y;
    public long z;
    public final lv6 k = new lv6((byte) 25);
    public final xu7 l = new xu7(16);
    public final xu7 e = new xu7(yad.a);
    public final xu7 f = new xu7(6);
    public final xu7 g = new xu7();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        em4 em4Var = new em4();
        em4Var.s = ud7.n("application/x-emsg");
        Q = new fm4(em4Var);
    }

    public dp4(sab sabVar, int i, uob uobVar, List list, qc8 qc8Var) {
        this.a = sabVar;
        this.b = i;
        this.j = uobVar;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = qc8Var;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new xu7(bArr);
        km5 km5Var = mm5.b;
        this.r = w59.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = l74.v;
        this.J = new wxb[0];
        this.K = new wxb[0];
        this.o = new ko(new kx3(this, (byte) 21));
        this.q = new lj9((byte) 21);
        this.N = -1L;
        this.O = -1L;
    }

    public static int g(int i) {
        int i2 = (i & 1) != 0 ? 64 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    public static qq3 i(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            mf7 mf7Var = (mf7) arrayList.get(i);
            if (mf7Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = mf7Var.e.a;
                ju8 b = tre.b(bArr);
                UUID uuid = b == null ? null : (UUID) b.c;
                if (uuid == null) {
                    lad.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new pq3(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new qq3(null, false, (pq3[]) arrayList2.toArray(new pq3[0]));
    }

    public static void k(xu7 xu7Var, int i, rxb rxbVar) {
        xu7Var.N(i + 8);
        int m = xu7Var.m();
        byte[] bArr = ry0.a;
        if ((m & 1) != 0) {
            throw av7.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m & 2) != 0;
        int E = xu7Var.E();
        if (E == 0) {
            Arrays.fill(rxbVar.l, 0, rxbVar.e, false);
            return;
        }
        int i2 = rxbVar.e;
        xu7 xu7Var2 = rxbVar.n;
        if (E != i2) {
            StringBuilder m2 = de9.m(E, "Senc sample count ", " is different from fragment sample count");
            m2.append(rxbVar.e);
            throw av7.a(m2.toString(), null);
        }
        Arrays.fill(rxbVar.l, 0, E, z);
        xu7Var2.K(xu7Var.a());
        rxbVar.k = true;
        rxbVar.o = true;
        xu7Var.k(0, xu7Var2.c, xu7Var2.a);
        xu7Var2.N(0);
        rxbVar.o = false;
    }

    public static Pair l(long j, xu7 xu7Var) {
        long G;
        long G2;
        xu7 xu7Var2 = xu7Var;
        xu7Var2.N(8);
        int e = ry0.e(xu7Var2.m());
        xu7Var2.O(4);
        long C = xu7Var2.C();
        if (e == 0) {
            G = xu7Var2.C();
            G2 = xu7Var2.C();
        } else {
            G = xu7Var2.G();
            G2 = xu7Var2.G();
        }
        long j2 = G2 + j;
        String str = g8c.a;
        long b0 = g8c.b0(G, 1000000L, C, RoundingMode.DOWN);
        xu7Var2.O(2);
        int H = xu7Var2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j3 = j2;
        long j4 = b0;
        int i = 0;
        while (i < H) {
            int m = xu7Var2.m();
            if ((Integer.MIN_VALUE & m) != 0) {
                throw av7.a("Unhandled indirect reference", null);
            }
            long C2 = xu7Var2.C();
            iArr[i] = m & ConnectionsManager.DEFAULT_DATACENTER_ID;
            jArr[i] = j3;
            jArr3[i] = j4;
            G += C2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long b02 = g8c.b0(G, 1000000L, C, RoundingMode.DOWN);
            jArr4[i] = b02 - jArr5[i];
            xu7Var2.O(4);
            j3 += iArr[i];
            i++;
            H = H;
            xu7Var2 = xu7Var;
            j4 = b02;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(b0), new ah2(iArr, jArr, jArr2, jArr3));
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
    
        ((ja3) r1).l(r49.D, false);
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
        ((ja3) r1).l(8, false);
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
        gi7.b(r49.D, r13);
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
        ((ja3) r1).c(r13, r14, r4 + r4, false);
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
    
        r3 = yad.c(r6);
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
    
        if (yad.d(r13, r4, r6) == false) goto L609;
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
    
        throw av7.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0210, code lost:
    
        r4 = yad.e(r6);
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
        ((ja3) r1).c(r3.a, 0, r49.F, false);
        r2.e(r49.F, r3);
        r4 = r49.F;
        r5 = yad.m(r3.c, r3.a);
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
    
        r1 = (ap4) r39.removeFirst();
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
    
        if (bzc.e(r6.t) == false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0359, code lost:
    
        r4 = bzc.h(r1, r49.D, r14.m);
        r14.m = r4;
        r4 = r4.a();
        r4.w = r3.x;
        yjb.v(r4, r2);
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
    
        throw av7.d("Atom size less than header length (unsupported).");
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
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
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
        k74 k74Var2 = k74Var;
        while (true) {
            byte b = this.s;
            ArrayDeque arrayDeque = this.m;
            ko koVar = this.o;
            lj9 lj9Var = this.q;
            int i4 = this.b;
            SparseArray sparseArray = this.d;
            xu7 xu7Var = this.i;
            boolean z2 = true;
            if (b != 0) {
                ArrayDeque arrayDeque2 = this.n;
                uob uobVar = this.j;
                if (b == 1) {
                    int i5 = (int) (this.u - this.v);
                    xu7 xu7Var2 = this.w;
                    if (xu7Var2 != null) {
                        ((ja3) k74Var).c(xu7Var2.a, 8, i5, false);
                        int i6 = this.t;
                        mf7 mf7Var = new mf7(i6, xu7Var2);
                        if (!arrayDeque.isEmpty()) {
                            ((lf7) arrayDeque.peek()).f.add(mf7Var);
                        } else if (i6 == 1936286840) {
                            ja3 ja3Var = (ja3) k74Var;
                            Pair l = l(ja3Var.d, xu7Var2);
                            lj9Var.u((ah2) l.second);
                            LinkedHashMap linkedHashMap = (LinkedHashMap) lj9Var.b;
                            this.B = ((Long) l.first).longValue();
                            if (this.M) {
                                i = 1;
                            } else {
                                i = 1;
                                this.I.g0(linkedHashMap.size() == 1 ? (fv9) l.second : lj9Var.F());
                                this.L = true;
                            }
                            if ((i4 & 256) != 0 && !this.M && linkedHashMap.size() > i) {
                                this.N = ja3Var.d;
                            }
                        } else if (i6 == 1701671783 && this.J.length != 0) {
                            xu7Var2.N(8);
                            int e = ry0.e(xu7Var2.m());
                            if (e == 0) {
                                v = xu7Var2.v();
                                v.getClass();
                                v2 = xu7Var2.v();
                                v2.getClass();
                                long C4 = xu7Var2.C();
                                long C5 = xu7Var2.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long b02 = g8c.b0(C5, 1000000L, C4, roundingMode);
                                long j10 = this.B;
                                long j11 = j10 != -9223372036854775807L ? j10 + b02 : -9223372036854775807L;
                                j5 = b02;
                                j6 = j11;
                                b0 = g8c.b0(xu7Var2.C(), 1000L, C4, roundingMode);
                                C = xu7Var2.C();
                            } else if (e != 1) {
                                b00.o(e, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long C6 = xu7Var2.C();
                                long G = xu7Var2.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j6 = g8c.b0(G, 1000000L, C6, roundingMode2);
                                long b03 = g8c.b0(xu7Var2.C(), 1000L, C6, roundingMode2);
                                long C7 = xu7Var2.C();
                                v = xu7Var2.v();
                                v.getClass();
                                v2 = xu7Var2.v();
                                v2.getClass();
                                b0 = b03;
                                C = C7;
                                j5 = -9223372036854775807L;
                            }
                            String str = v;
                            String str2 = v2;
                            byte[] bArr = new byte[xu7Var2.a()];
                            xu7Var2.k(0, xu7Var2.a(), bArr);
                            xu7 xu7Var3 = new xu7(this.k.r(new j44(str, str2, b0, C, bArr)));
                            int a = xu7Var3.a();
                            for (wxb wxbVar : this.J) {
                                xu7Var3.N(0);
                                wxbVar.e(a, xu7Var3);
                            }
                            if (j6 == -9223372036854775807L) {
                                arrayDeque2.addLast(new ap4(a, j5, true));
                                this.y += a;
                            } else if (arrayDeque2.isEmpty()) {
                                if (uobVar != null) {
                                    if (uobVar.f()) {
                                        j6 = uobVar.a(j6);
                                    } else {
                                        arrayDeque2.addLast(new ap4(a, j6, false));
                                        this.y += a;
                                    }
                                }
                                long j12 = j6;
                                for (wxb wxbVar2 : this.J) {
                                    wxbVar2.a(j12, 1, a, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new ap4(a, j6, false));
                                this.y += a;
                            }
                        }
                    } else {
                        ((ja3) k74Var).l(i5, false);
                    }
                    m(((ja3) k74Var).d);
                } else if (b != 2) {
                    int i7 = 2;
                    if (b == 5) {
                        xu7Var.K(16);
                        ja3 ja3Var2 = (ja3) k74Var;
                        if (ja3Var2.c(xu7Var.a, 0, 16, true)) {
                            xu7Var.N(0);
                            int m = xu7Var.m();
                            int m2 = xu7Var.m();
                            if (m == 16 && m2 == 1835430511) {
                                xu7Var.O(4);
                                long C8 = xu7Var.C();
                                long j13 = ja3Var2.c - C8;
                                if (C8 <= 0 || C8 > 2147483647L || j13 < 0 || j13 < this.O) {
                                    j(new oc0(this.A, this.O), m11Var);
                                } else {
                                    m11Var.a = j13;
                                    this.s = (byte) 6;
                                }
                            } else {
                                j(new oc0(this.A, this.O), m11Var);
                            }
                        } else {
                            j(new oc0(this.A, this.O), m11Var);
                        }
                        byte b2 = this.s;
                        if (b2 == 6 || b2 == 0) {
                            return 1;
                        }
                    } else if (b != 6) {
                        cp4 cp4Var = this.C;
                        if (cp4Var != null) {
                            c = 6;
                            z = true;
                            c2 = 5;
                            break;
                        }
                        int size = sparseArray.size();
                        c = 6;
                        c2 = 5;
                        int i8 = 0;
                        cp4 cp4Var2 = null;
                        long j14 = Long.MAX_VALUE;
                        while (i8 < size) {
                            cp4 cp4Var3 = (cp4) sparseArray.valueAt(i8);
                            boolean z3 = z2;
                            boolean z4 = cp4Var3.n;
                            rxb rxbVar = cp4Var3.b;
                            int i9 = size;
                            if (z4) {
                                i2 = i8;
                                if (cp4Var3.h == rxbVar.d) {
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
                                if (cp4Var3.f == cp4Var3.d.b) {
                                    i8 = i2 + 1;
                                    size = i9;
                                    z2 = z3;
                                }
                                j7 = z4 ? cp4Var3.d.c[cp4Var3.f] : rxbVar.f[cp4Var3.h];
                                if (j7 >= j14) {
                                    cp4Var2 = cp4Var3;
                                    j14 = j7;
                                }
                                i8 = i2 + 1;
                                size = i9;
                                z2 = z3;
                            }
                        }
                        z = z2;
                        if (cp4Var2 == null) {
                            int i10 = (int) (this.x - ((ja3) k74Var2).d);
                            if (i10 < 0) {
                                throw av7.a("Offset to end of mdat was negative.", null);
                            }
                            ((ja3) k74Var2).l(i10, false);
                            h();
                        } else {
                            int i11 = (int) ((!cp4Var2.n ? cp4Var2.d.c[cp4Var2.f] : cp4Var2.b.f[cp4Var2.h]) - ((ja3) k74Var2).d);
                            if (i11 < 0) {
                                lad.f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                i11 = 0;
                            }
                            ((ja3) k74Var2).l(i11, false);
                            this.C = cp4Var2;
                            cp4Var = cp4Var2;
                        }
                    } else {
                        ja3 ja3Var3 = (ja3) k74Var2;
                        long j15 = ((ja3) k74Var2).c - ja3Var3.d;
                        xu7Var.K(8);
                        if (ja3Var3.d(xu7Var.a, 0, 8, true)) {
                            xu7Var.N(0);
                            int m3 = xu7Var.m();
                            if (xu7Var.m() != 1835430497) {
                                j(new oc0(this.A, this.O), m11Var);
                            } else {
                                int i12 = (int) j15;
                                xu7 xu7Var4 = new xu7(i12);
                                ja3Var3.c(xu7Var4.a, 0, i12, false);
                                xu7Var4.N(m3 == 1 ? 16 : 8);
                                SparseArray sparseArray2 = new SparseArray();
                                SparseArray sparseArray3 = new SparseArray();
                                while (xu7Var4.a() >= 8) {
                                    int i13 = xu7Var4.b;
                                    long C9 = xu7Var4.C();
                                    int m4 = xu7Var4.m();
                                    if (C9 == 1) {
                                        if (xu7Var4.a() < 8) {
                                            break;
                                        }
                                        C9 = xu7Var4.u();
                                    } else if (C9 == 0) {
                                        C9 = xu7Var4.c - i13;
                                    }
                                    if (C9 < (C9 == 1 ? 16 : 8)) {
                                        break;
                                    }
                                    long j16 = i13;
                                    if (C9 > xu7Var4.c - j16) {
                                        break;
                                    }
                                    if (m4 != 1952871009) {
                                        j8 = C9;
                                        j9 = j16;
                                    } else if (C9 < r10 + 16) {
                                        xu7Var4.N((int) (j16 + C9));
                                    } else {
                                        int e2 = ry0.e(xu7Var4.m());
                                        int m5 = xu7Var4.m();
                                        cp4 cp4Var4 = (cp4) sparseArray.get(m5);
                                        if (cp4Var4 == null) {
                                            xu7Var4.N((int) (j16 + C9));
                                        } else {
                                            long j17 = cp4Var4.d.a.c;
                                            int m6 = xu7Var4.m();
                                            int i14 = (m6 >> 4) & 3;
                                            int i15 = (m6 >> 2) & 3;
                                            int i16 = m6 & 3;
                                            j8 = C9;
                                            long C10 = xu7Var4.C();
                                            int i17 = i14 + 1;
                                            int i18 = i15 + 1;
                                            j9 = j16;
                                            int i19 = i16 + 1;
                                            if (((e2 == 1 ? 16L : 8L) + i17 + i18 + i19) * C10 > xu7Var4.a()) {
                                                xu7Var4.N((int) (j9 + j8));
                                            } else {
                                                int i20 = (int) C10;
                                                long[] jArr = new long[i20];
                                                long[] jArr2 = new long[i20];
                                                for (int i21 = 0; i21 < i20; i21++) {
                                                    if (e2 == 1) {
                                                        C2 = xu7Var4.G();
                                                        C3 = xu7Var4.G();
                                                    } else {
                                                        C2 = xu7Var4.C();
                                                        C3 = xu7Var4.C();
                                                    }
                                                    long j18 = C3;
                                                    long j19 = C2;
                                                    xu7Var4.O(i17 + i18 + i19);
                                                    if (j17 != -9223372036854775807L) {
                                                        j19 = g8c.b0(j19, 1000000L, j17, RoundingMode.DOWN);
                                                    }
                                                    jArr[i21] = j19;
                                                    jArr2[i21] = j18;
                                                }
                                                sparseArray2.put(m5, jArr);
                                                sparseArray3.put(m5, jArr2);
                                            }
                                        }
                                    }
                                    xu7Var4.N((int) (j9 + j8));
                                }
                                if (sparseArray2.size() == 0) {
                                    j(new oc0(this.A, this.O), m11Var);
                                } else {
                                    int i22 = -1;
                                    int i23 = -1;
                                    int i24 = 0;
                                    while (i24 < sparseArray2.size()) {
                                        int keyAt = sparseArray2.keyAt(i24);
                                        cp4 cp4Var5 = (cp4) sparseArray.get(keyAt);
                                        if (cp4Var5 != null) {
                                            int i25 = cp4Var5.d.a.b;
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
                                            j(new bp4(sparseArray2, sparseArray3, this.A, this.O, i3), m11Var);
                                        } else {
                                            i22 = sparseArray2.keyAt(0);
                                        }
                                    }
                                    i3 = i22;
                                    j(new bp4(sparseArray2, sparseArray3, this.A, this.O, i3), m11Var);
                                }
                            }
                        } else {
                            j(new oc0(this.A, this.O), m11Var);
                        }
                        if (this.s == 0) {
                            return 1;
                        }
                    }
                } else {
                    int size2 = sparseArray.size();
                    cp4 cp4Var6 = null;
                    long j20 = Long.MAX_VALUE;
                    for (int i26 = 0; i26 < size2; i26++) {
                        rxb rxbVar2 = ((cp4) sparseArray.valueAt(i26)).b;
                        if (rxbVar2.o) {
                            long j21 = rxbVar2.c;
                            if (j21 < j20) {
                                cp4Var6 = (cp4) sparseArray.valueAt(i26);
                                j20 = j21;
                            }
                        }
                    }
                    if (cp4Var6 == null) {
                        this.s = (byte) 3;
                    } else {
                        int i27 = (int) (j20 - ((ja3) k74Var).d);
                        if (i27 < 0) {
                            throw av7.a("Offset to encryption data was negative.", null);
                        }
                        ja3 ja3Var4 = (ja3) k74Var;
                        ja3Var4.l(i27, false);
                        rxb rxbVar3 = cp4Var6.b;
                        xu7 xu7Var5 = rxbVar3.n;
                        ja3Var4.c(xu7Var5.a, 0, xu7Var5.c, false);
                        xu7Var5.N(0);
                        rxbVar3.o = false;
                    }
                }
            } else {
                int i28 = this.v;
                xu7 xu7Var6 = this.l;
                if (i28 == 0) {
                    if (!((ja3) k74Var).c(xu7Var6.a, 0, 8, true)) {
                        long j22 = this.N;
                        if (j22 == -1) {
                            koVar.d(0);
                            return -1;
                        }
                        m11Var.a = j22;
                        this.N = -1L;
                        this.I.g0(lj9Var.F());
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    xu7Var6.N(0);
                    this.u = xu7Var6.C();
                    this.t = xu7Var6.m();
                }
                long j23 = this.u;
                if (j23 == 1) {
                    ((ja3) k74Var).c(xu7Var6.a, 8, 8, false);
                    this.v += 8;
                    this.u = xu7Var6.G();
                } else if (j23 == 0) {
                    long j24 = ((ja3) k74Var).c;
                    if (j24 == -1 && !arrayDeque.isEmpty()) {
                        j24 = ((lf7) arrayDeque.peek()).e;
                    }
                    if (j24 != -1) {
                        j = -1;
                        this.u = (j24 - ((ja3) k74Var).d) + this.v;
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
                                xu7Var.K((int) j2);
                                System.arraycopy(xu7Var6.a, 0, xu7Var.a, 0, 8);
                                ((ja3) k74Var).c(xu7Var.a, 8, (int) (this.u - this.v), false);
                                lj9Var.u((ah2) l(((ja3) k74Var).f(), xu7Var).second);
                            } else {
                                ((ja3) k74Var).l((int) (j2 - j4), true);
                            }
                            h();
                        } else {
                            long j25 = ((ja3) k74Var).d - i29;
                            int i30 = this.t;
                            if ((i30 == 1836019558 || i30 == 1835295092) && !this.L) {
                                long j26 = ((ja3) k74Var).c;
                                if (j26 == j || this.O != j || (i4 & 512) == 0) {
                                    this.I.g0(new oc0(this.A, j25));
                                    this.L = true;
                                } else {
                                    this.O = j25;
                                    m11Var.a = j26 - 16;
                                    this.s = (byte) 5;
                                }
                            }
                            if (this.t == 1836019558) {
                                int size3 = sparseArray.size();
                                for (int i31 = 0; i31 < size3; i31++) {
                                    rxb rxbVar4 = ((cp4) sparseArray.valueAt(i31)).b;
                                    rxbVar4.getClass();
                                    rxbVar4.c = j25;
                                    rxbVar4.b = j25;
                                }
                            }
                            int i32 = this.t;
                            if (i32 == 1835295092) {
                                this.C = null;
                                this.x = j25 + this.u;
                                this.s = (byte) 2;
                            } else if (i32 == 1836019574 || i32 == 1953653099 || i32 == 1835297121 || i32 == 1835626086 || i32 == 1937007212 || i32 == 1836019558 || i32 == 1953653094 || i32 == 1836475768 || i32 == 1701082227 || i32 == 1835365473) {
                                ja3 ja3Var5 = (ja3) k74Var;
                                long j27 = ja3Var5.d;
                                long j28 = this.u;
                                long j29 = (j27 + j28) - 8;
                                if (j28 != this.v && i32 == 1835365473) {
                                    xu7Var.K(8);
                                    ja3Var5.d(xu7Var.a, 0, 8, false);
                                    ry0.a(xu7Var);
                                    ja3Var5.l(xu7Var.b, false);
                                    ja3Var5.f = 0;
                                }
                                arrayDeque.push(new lf7(this.t, j29));
                                if (this.u == this.v) {
                                    m(j29);
                                } else {
                                    h();
                                }
                            } else if (i32 == 1751411826 || i32 == 1835296868 || i32 == 1836476516 || i32 == 1936286840 || i32 == 1937011556 || i32 == 1937011827 || i32 == 1668576371 || i32 == 1937011555 || i32 == 1937011578 || i32 == 1937013298 || i32 == 1937007471 || i32 == 1668232756 || i32 == 1937011571 || i32 == 1952867444 || i32 == 1952868452 || i32 == 1953196132 || i32 == 1953654136 || i32 == 1953658222 || i32 == 1886614376 || i32 == 1935763834 || i32 == 1935763823 || i32 == 1936027235 || i32 == 1970628964 || i32 == 1935828848 || i32 == 1936158820 || i32 == 1701606260 || i32 == 1835362404 || i32 == 1701671783 || i32 == 1969517665 || i32 == 1801812339 || i32 == 1768715124) {
                                if (this.v != 8) {
                                    throw av7.d("Leaf atom defines extended atom size (unsupported).");
                                }
                                if (this.u > 2147483647L) {
                                    throw av7.d("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                xu7 xu7Var7 = new xu7((int) this.u);
                                System.arraycopy(xu7Var6.a, 0, xu7Var7.a, 0, 8);
                                this.w = xu7Var7;
                                this.s = (byte) 1;
                            } else {
                                if (this.u > 2147483647L) {
                                    throw av7.d("Skipping atom with length > 2147483647 (unsupported).");
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
            k74Var2 = k74Var;
        }
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        w59 w59Var;
        aka a = xcd.a(k74Var, true);
        if (a != null) {
            w59Var = mm5.u(a);
        } else {
            km5 km5Var = mm5.b;
            w59Var = w59.e;
        }
        this.r = w59Var;
        return a == null;
    }

    @Override // j74
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((cp4) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j2;
        this.m.clear();
        this.O = -1L;
        h();
    }

    @Override // j74
    public final List e() {
        return this.r;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            l74Var = new xf4(l74Var, this.a);
        }
        this.I = l74Var;
        h();
        wxb[] wxbVarArr = new wxb[2];
        this.J = wxbVarArr;
        int i3 = 0;
        qc8 qc8Var = this.p;
        if (qc8Var != null) {
            wxbVarArr[0] = qc8Var;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            wxbVarArr[i] = this.I.S(100, 5);
            i4 = 101;
            i++;
        }
        wxb[] wxbVarArr2 = (wxb[]) g8c.V(i, this.J);
        this.J = wxbVarArr2;
        for (wxb wxbVar : wxbVarArr2) {
            wxbVar.g(Q);
        }
        List list = this.c;
        this.K = new wxb[list.size()];
        while (i3 < this.K.length) {
            wxb S = this.I.S(i4, 3);
            S.g((fm4) list.get(i3));
            this.K[i3] = S;
            i3++;
            i4++;
        }
    }

    public final void h() {
        this.s = (byte) 0;
        this.v = 0;
    }

    public final void j(fv9 fv9Var, m11 m11Var) {
        this.I.g0(fv9Var);
        this.L = true;
        m11Var.a = this.O;
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
        ld7 ld7Var;
        int i;
        ld7 ld7Var2;
        ArrayList arrayList;
        int i2;
        wb3 wb3Var;
        int i3;
        ArrayList arrayList2;
        wb3 wb3Var2;
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
        wb3 wb3Var3;
        int i16;
        int i17;
        int i18;
        int i19;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((lf7) arrayDeque.peek()).e != j) {
                break;
            }
            lf7 lf7Var = (lf7) arrayDeque.pop();
            int i20 = lf7Var.b;
            ArrayList arrayList9 = lf7Var.g;
            ArrayList arrayList10 = lf7Var.f;
            int i21 = 12;
            SparseArray sparseArray = this.d;
            int i22 = this.b;
            if (i20 == 1836019574) {
                qq3 i23 = i(arrayList10);
                lf7 u = lf7Var.u(1836475768);
                u.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList11 = u.f;
                int size = arrayList11.size();
                long j2 = -9223372036854775807L;
                int i24 = 0;
                while (i24 < size) {
                    mf7 mf7Var = (mf7) arrayList11.get(i24);
                    int i25 = mf7Var.b;
                    xu7 xu7Var = mf7Var.e;
                    if (i25 == 1953654136) {
                        xu7Var.N(i21);
                        arrayList3 = arrayList11;
                        Pair create = Pair.create(Integer.valueOf(xu7Var.m()), new wb3(xu7Var.m() - 1, xu7Var.m(), xu7Var.m(), xu7Var.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (wb3) create.second);
                    } else {
                        arrayList3 = arrayList11;
                        if (i25 == 1835362404) {
                            xu7Var.N(8);
                            j2 = ry0.e(xu7Var.m()) == 0 ? xu7Var.C() : xu7Var.G();
                        }
                    }
                    i24++;
                    arrayList11 = arrayList3;
                    i21 = 12;
                }
                lf7 u2 = lf7Var.u(1835365473);
                ld7 f = u2 != null ? ry0.f(u2) : null;
                zr4 zr4Var = new zr4();
                mf7 v = lf7Var.v(1969517665);
                if (v != null) {
                    ld7 k = ry0.k(v, (i22 & 1024) != 0);
                    zr4Var.b(k);
                    ld7Var = k;
                } else {
                    ld7Var = null;
                }
                mf7 v2 = lf7Var.v(1836476516);
                v2.getClass();
                ld7 ld7Var3 = new ld7(ry0.g(v2.e));
                ArrayList j3 = ry0.j(lf7Var, zr4Var, j2, i23, (i22 & 16) != 0, false, new zo4(this, (byte) 0), false);
                int size2 = j3.size();
                if (sparseArray.size() == 0) {
                    String a = cpe.a(j3);
                    int i26 = 0;
                    while (i26 < size2) {
                        xxb xxbVar = (xxb) j3.get(i26);
                        oxb oxbVar = xxbVar.a;
                        boolean z4 = oxbVar.m;
                        int i27 = oxbVar.a;
                        fm4 fm4Var = oxbVar.g;
                        int i28 = size2;
                        String str = a;
                        long j4 = oxbVar.e;
                        int i29 = oxbVar.b;
                        if (z4) {
                            wxb S = this.I.S(i26, i29);
                            S.d(j4);
                            i = i26;
                            em4 a2 = fm4Var.a();
                            ld7Var2 = ld7Var3;
                            a2.r = ud7.n(str);
                            if (i29 == 1) {
                                int i30 = zr4Var.a;
                                i2 = i28;
                                arrayList = j3;
                                if (i30 != -1 && (i3 = zr4Var.b) != -1) {
                                    a2.Q = i30;
                                    a2.R = i3;
                                }
                            } else {
                                arrayList = j3;
                                i2 = i28;
                            }
                            bpe.f(i29, f, a2, fm4Var.m, ld7Var, ld7Var2);
                            if (sparseArray2.size() == 1) {
                                wb3Var = (wb3) sparseArray2.valueAt(0);
                            } else {
                                wb3Var = (wb3) sparseArray2.get(i27);
                                wb3Var.getClass();
                            }
                            sparseArray.put(i27, new cp4(S, xxbVar, wb3Var, new fm4(a2)));
                            this.A = Math.max(this.A, j4);
                        } else {
                            arrayList = j3;
                            i = i26;
                            ld7Var2 = ld7Var3;
                            i2 = i28;
                        }
                        i26 = i + 1;
                        a = str;
                        ld7Var3 = ld7Var2;
                        size2 = i2;
                        j3 = arrayList;
                    }
                    this.I.z();
                } else {
                    ArrayList arrayList12 = j3;
                    int i31 = 0;
                    int i32 = 0;
                    while (true) {
                        arrayList2 = arrayList12;
                        if (i31 >= size2) {
                            break;
                        }
                        if (((xxb) arrayList2.get(i31)).a.m) {
                            i32++;
                        }
                        i31++;
                        arrayList12 = arrayList2;
                    }
                    gre.p(sparseArray.size() == i32);
                    for (int i33 = 0; i33 < size2; i33++) {
                        xxb xxbVar2 = (xxb) arrayList2.get(i33);
                        oxb oxbVar2 = xxbVar2.a;
                        boolean z5 = oxbVar2.m;
                        int i34 = oxbVar2.a;
                        if (z5) {
                            cp4 cp4Var = (cp4) sparseArray.get(i34);
                            if (sparseArray2.size() == 1) {
                                wb3Var2 = (wb3) sparseArray2.valueAt(0);
                            } else {
                                wb3Var2 = (wb3) sparseArray2.get(i34);
                                wb3Var2.getClass();
                            }
                            cp4Var.d = xxbVar2;
                            cp4Var.e = wb3Var2;
                            if (cp4Var.l == null) {
                                cp4Var.a.g(cp4Var.m);
                            }
                            cp4Var.e();
                        }
                    }
                }
            } else if (i20 == 1836019558) {
                int size3 = arrayList9.size();
                int i35 = 0;
                while (i35 < size3) {
                    lf7 lf7Var2 = (lf7) arrayList9.get(i35);
                    if (lf7Var2.b == 1953653094) {
                        mf7 v3 = lf7Var2.v(1952868452);
                        ArrayList arrayList13 = lf7Var2.f;
                        v3.getClass();
                        xu7 xu7Var2 = v3.e;
                        xu7Var2.N(8);
                        int m = xu7Var2.m();
                        byte[] bArr2 = ry0.a;
                        cp4 cp4Var2 = (cp4) sparseArray.get(xu7Var2.m());
                        if (cp4Var2 == null) {
                            i4 = size3;
                            cp4Var2 = null;
                        } else {
                            rxb rxbVar = cp4Var2.b;
                            if ((m & 1) != 0) {
                                long G = xu7Var2.G();
                                rxbVar.b = G;
                                rxbVar.c = G;
                            }
                            wb3 wb3Var4 = cp4Var2.e;
                            int m2 = (m & 2) != 0 ? xu7Var2.m() - 1 : wb3Var4.a;
                            int m3 = (m & 8) != 0 ? xu7Var2.m() : wb3Var4.b;
                            if ((m & 16) != 0) {
                                i4 = size3;
                                i7 = xu7Var2.m();
                            } else {
                                i4 = size3;
                                i7 = wb3Var4.c;
                            }
                            rxbVar.a = new wb3(m2, m3, i7, (m & 32) != 0 ? xu7Var2.m() : wb3Var4.d);
                        }
                        if (cp4Var2 != null) {
                            rxb rxbVar2 = cp4Var2.b;
                            long j5 = rxbVar2.p;
                            boolean z6 = rxbVar2.q;
                            cp4Var2.e();
                            cp4Var2.n = true;
                            mf7 v4 = lf7Var2.v(1952867444);
                            if (v4 == null || (i22 & 2) != 0) {
                                rxbVar2.p = j5;
                                rxbVar2.q = z6;
                            } else {
                                xu7 xu7Var3 = v4.e;
                                xu7Var3.N(8);
                                rxbVar2.p = ry0.e(xu7Var3.m()) == 1 ? xu7Var3.G() : xu7Var3.C();
                                rxbVar2.q = true;
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
                                mf7 mf7Var2 = (mf7) arrayList13.get(i36);
                                ArrayList arrayList14 = arrayList9;
                                if (mf7Var2.b == 1953658222) {
                                    xu7 xu7Var4 = mf7Var2.e;
                                    xu7Var4.N(12);
                                    int E = xu7Var4.E();
                                    if (E > 0) {
                                        i38 += E;
                                        i37++;
                                    }
                                }
                                i36++;
                                arrayList9 = arrayList14;
                            }
                            arrayList4 = arrayList9;
                            cp4Var2.h = 0;
                            cp4Var2.g = 0;
                            cp4Var2.f = 0;
                            rxbVar2.d = i37;
                            rxbVar2.e = i38;
                            if (rxbVar2.g.length < i37) {
                                rxbVar2.f = new long[i37];
                                rxbVar2.g = new int[i37];
                            }
                            if (rxbVar2.h.length < i38) {
                                int i39 = (i38 * kk7.I1) / 100;
                                rxbVar2.h = new int[i39];
                                rxbVar2.i = new long[i39];
                                rxbVar2.j = new boolean[i39];
                                rxbVar2.l = new boolean[i39];
                            }
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            while (true) {
                                long j6 = 0;
                                if (i40 < size4) {
                                    mf7 mf7Var3 = (mf7) arrayList13.get(i40);
                                    if (mf7Var3.b == i8) {
                                        int i43 = i41 + 1;
                                        xu7 xu7Var5 = mf7Var3.e;
                                        xu7Var5.N(8);
                                        int m4 = xu7Var5.m();
                                        byte[] bArr3 = ry0.a;
                                        i10 = size4;
                                        oxb oxbVar3 = cp4Var2.d.a;
                                        i11 = i40;
                                        wb3 wb3Var5 = rxbVar2.a;
                                        String str2 = g8c.a;
                                        arrayList7 = arrayList10;
                                        rxbVar2.g[i41] = xu7Var5.E();
                                        long[] jArr = rxbVar2.f;
                                        i12 = i35;
                                        i13 = i22;
                                        long j7 = rxbVar2.b;
                                        jArr[i41] = j7;
                                        if ((m4 & 1) != 0) {
                                            jArr[i41] = j7 + xu7Var5.m();
                                        }
                                        boolean z7 = (m4 & 4) != 0;
                                        int i44 = wb3Var5.d;
                                        if (z7) {
                                            i44 = xu7Var5.m();
                                        }
                                        boolean z8 = (m4 & 256) != 0;
                                        boolean z9 = z7;
                                        boolean z10 = (m4 & 512) != 0;
                                        boolean z11 = (m4 & 1024) != 0;
                                        boolean z12 = (m4 & 2048) != 0;
                                        boolean z13 = z11;
                                        om5 om5Var = oxbVar3.i;
                                        int i45 = i41;
                                        om5 om5Var2 = oxbVar3.j;
                                        if (om5Var != null) {
                                            i14 = i44;
                                            z2 = z8;
                                            if (om5Var.b != 1 || om5Var2 == null) {
                                                arrayList8 = arrayList13;
                                            } else {
                                                if (om5Var.a(0) == 0) {
                                                    arrayList8 = arrayList13;
                                                } else {
                                                    long a3 = om5Var.a(0);
                                                    long j8 = oxbVar3.d;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    long b0 = g8c.b0(a3, 1000000L, j8, roundingMode);
                                                    arrayList8 = arrayList13;
                                                    i19 = b0 + g8c.b0(om5Var2.a(0), 1000000L, oxbVar3.c, roundingMode) >= oxbVar3.e ? 0 : 0;
                                                }
                                                j6 = om5Var2.a(i19);
                                            }
                                        } else {
                                            arrayList8 = arrayList13;
                                            i14 = i44;
                                            z2 = z8;
                                        }
                                        int[] iArr = rxbVar2.h;
                                        long[] jArr2 = rxbVar2.i;
                                        boolean[] zArr = rxbVar2.j;
                                        boolean z14 = oxbVar3.b == 2 && (i13 & 1) != 0;
                                        int i46 = rxbVar2.g[i45] + i42;
                                        long j9 = oxbVar3.c;
                                        long j10 = rxbVar2.p;
                                        while (i42 < i46) {
                                            int m5 = z2 ? xu7Var5.m() : wb3Var5.b;
                                            boolean[] zArr2 = zArr;
                                            if (m5 < 0) {
                                                throw av7.a("Unexpected negative value: " + m5, null);
                                            }
                                            if (z10) {
                                                z3 = z14;
                                                i15 = xu7Var5.m();
                                            } else {
                                                z3 = z14;
                                                i15 = wb3Var5.c;
                                            }
                                            if (i15 < 0) {
                                                throw av7.a("Unexpected negative value: " + i15, null);
                                            }
                                            int m6 = z13 ? xu7Var5.m() : (i42 == 0 && z9) ? i14 : wb3Var5.d;
                                            if (z12) {
                                                wb3Var3 = wb3Var5;
                                                i16 = xu7Var5.m();
                                                i18 = i42;
                                                i17 = i46;
                                            } else {
                                                wb3Var3 = wb3Var5;
                                                i16 = 0;
                                                i17 = i46;
                                                i18 = i42;
                                            }
                                            long b02 = g8c.b0((i16 + j10) - j6, 1000000L, j9, RoundingMode.DOWN);
                                            jArr2[i18] = b02;
                                            if (!rxbVar2.q) {
                                                jArr2[i18] = b02 + cp4Var2.d.i;
                                            }
                                            iArr[i18] = i15;
                                            zArr2[i18] = ((m6 >> 16) & 1) == 0 && (!z3 || i18 == 0);
                                            j10 += m5;
                                            i42 = i18 + 1;
                                            i46 = i17;
                                            zArr = zArr2;
                                            z14 = z3;
                                            wb3Var5 = wb3Var3;
                                        }
                                        rxbVar2.p = j10;
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
                                    oxb oxbVar4 = cp4Var2.d.a;
                                    wb3 wb3Var6 = rxbVar2.a;
                                    wb3Var6.getClass();
                                    int i47 = wb3Var6.a;
                                    qxb[] qxbVarArr = oxbVar4.n;
                                    qxb qxbVar = qxbVarArr == null ? null : qxbVarArr[i47];
                                    mf7 v5 = lf7Var2.v(1935763834);
                                    if (v5 != null) {
                                        qxbVar.getClass();
                                        xu7 xu7Var6 = v5.e;
                                        short s = qxbVar.d;
                                        xu7Var6.N(8);
                                        int m7 = xu7Var6.m();
                                        byte[] bArr4 = ry0.a;
                                        if ((m7 & 1) == 1) {
                                            xu7Var6.O(8);
                                        }
                                        int A = xu7Var6.A();
                                        int E2 = xu7Var6.E();
                                        if (E2 > rxbVar2.e) {
                                            StringBuilder m8 = de9.m(E2, "Saiz sample count ", " is greater than fragment sample count");
                                            m8.append(rxbVar2.e);
                                            throw av7.a(m8.toString(), null);
                                        }
                                        if (A == 0) {
                                            boolean[] zArr3 = rxbVar2.l;
                                            i9 = 0;
                                            for (int i48 = 0; i48 < E2; i48++) {
                                                int A2 = xu7Var6.A();
                                                i9 += A2;
                                                zArr3[i48] = A2 > s;
                                            }
                                            z = false;
                                        } else {
                                            i9 = A * E2;
                                            z = false;
                                            Arrays.fill(rxbVar2.l, 0, E2, A > s);
                                        }
                                        Arrays.fill(rxbVar2.l, E2, rxbVar2.e, z);
                                        if (i9 > 0) {
                                            rxbVar2.n.K(i9);
                                            rxbVar2.k = true;
                                            rxbVar2.o = true;
                                        }
                                    }
                                    mf7 v6 = lf7Var2.v(1935763823);
                                    if (v6 != null) {
                                        xu7 xu7Var7 = v6.e;
                                        xu7Var7.N(8);
                                        int m9 = xu7Var7.m();
                                        byte[] bArr5 = ry0.a;
                                        if ((m9 & 1) == 1) {
                                            xu7Var7.O(8);
                                        }
                                        int E3 = xu7Var7.E();
                                        if (E3 != 1) {
                                            throw av7.a("Unexpected saio entry count: " + E3, null);
                                        }
                                        rxbVar2.c += ry0.e(m9) == 0 ? xu7Var7.C() : xu7Var7.G();
                                    }
                                    mf7 v7 = lf7Var2.v(1936027235);
                                    if (v7 != null) {
                                        k(v7.e, 0, rxbVar2);
                                    }
                                    String str3 = qxbVar != null ? qxbVar.b : null;
                                    xu7 xu7Var8 = null;
                                    xu7 xu7Var9 = null;
                                    int i49 = 0;
                                    while (true) {
                                        arrayList6 = arrayList15;
                                        if (i49 >= arrayList15.size()) {
                                            break;
                                        }
                                        mf7 mf7Var4 = (mf7) arrayList6.get(i49);
                                        xu7 xu7Var10 = mf7Var4.e;
                                        int i50 = mf7Var4.b;
                                        if (i50 == 1935828848) {
                                            xu7Var10.N(12);
                                            if (xu7Var10.m() == 1936025959) {
                                                xu7Var8 = xu7Var10;
                                            }
                                        } else if (i50 == 1936158820) {
                                            xu7Var10.N(12);
                                            if (xu7Var10.m() == 1936025959) {
                                                xu7Var9 = xu7Var10;
                                            }
                                        }
                                        i49++;
                                        arrayList15 = arrayList6;
                                    }
                                    if (xu7Var8 != null && xu7Var9 != null) {
                                        xu7Var8.N(8);
                                        int e = ry0.e(xu7Var8.m());
                                        xu7Var8.O(4);
                                        if (e == 1) {
                                            xu7Var8.O(4);
                                        }
                                        if (xu7Var8.m() != 1) {
                                            throw av7.d("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        xu7Var9.N(8);
                                        int e2 = ry0.e(xu7Var9.m());
                                        xu7Var9.O(4);
                                        long C = e2 >= 1 ? xu7Var9.C() : 0L;
                                        if (e2 >= 2) {
                                            xu7Var9.O(4);
                                        }
                                        if (xu7Var9.C() != 1) {
                                            throw av7.d("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        if (e2 >= 1 && C == 0) {
                                            xu7Var9.O(4);
                                        }
                                        xu7Var9.O(1);
                                        int A3 = xu7Var9.A();
                                        int i51 = (A3 & kk7.O3) >> 4;
                                        int i52 = A3 & 15;
                                        boolean z15 = xu7Var9.A() == 1;
                                        if (z15) {
                                            int A4 = xu7Var9.A();
                                            byte[] bArr6 = new byte[16];
                                            xu7Var9.k(0, 16, bArr6);
                                            if (A4 == 0) {
                                                int A5 = xu7Var9.A();
                                                byte[] bArr7 = new byte[A5];
                                                xu7Var9.k(0, A5, bArr7);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            rxbVar2.k = true;
                                            rxbVar2.m = new qxb(z15, str3, A4, bArr6, i51, i52, bArr);
                                        }
                                    }
                                    int size5 = arrayList6.size();
                                    for (int i53 = 0; i53 < size5; i53++) {
                                        mf7 mf7Var5 = (mf7) arrayList6.get(i53);
                                        if (mf7Var5.b == 1970628964) {
                                            xu7 xu7Var11 = mf7Var5.e;
                                            xu7Var11.N(8);
                                            byte[] bArr8 = this.h;
                                            xu7Var11.k(0, 16, bArr8);
                                            if (Arrays.equals(bArr8, P)) {
                                                k(xu7Var11, 16, rxbVar2);
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
                qq3 i54 = i(arrayList10);
                if (i54 != null) {
                    int size6 = sparseArray.size();
                    for (int i55 = 0; i55 < size6; i55++) {
                        cp4 cp4Var3 = (cp4) sparseArray.valueAt(i55);
                        oxb oxbVar5 = cp4Var3.d.a;
                        wb3 wb3Var7 = cp4Var3.b.a;
                        String str4 = g8c.a;
                        int i56 = wb3Var7.a;
                        qxb[] qxbVarArr2 = oxbVar5.n;
                        qxb qxbVar2 = qxbVarArr2 == null ? null : qxbVarArr2[i56];
                        qq3 a4 = i54.a(qxbVar2 != null ? qxbVar2.b : null);
                        em4 a5 = cp4Var3.m.a();
                        a5.w = a4;
                        fm4 fm4Var2 = new fm4(a5);
                        if (cp4Var3.l != null) {
                            cp4Var3.l = fm4Var2;
                        } else {
                            cp4Var3.a.g(fm4Var2);
                        }
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i57 = 0; i57 < size7; i57++) {
                        cp4 cp4Var4 = (cp4) sparseArray.valueAt(i57);
                        long j11 = this.z;
                        int i58 = cp4Var4.f;
                        while (true) {
                            rxb rxbVar3 = cp4Var4.b;
                            if (i58 < rxbVar3.e && rxbVar3.i[i58] <= j11) {
                                if (rxbVar3.j[i58]) {
                                    cp4Var4.i = i58;
                                }
                                i58++;
                            }
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((lf7) arrayDeque.peek()).g.add(lf7Var);
            }
        }
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
