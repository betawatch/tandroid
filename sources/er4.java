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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class er4 implements s84 {
    public static final byte[] P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final go4 Q;
    public long A;
    public long B;
    public dr4 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public u84 I;
    public yzb[] J;
    public yzb[] K;
    public boolean L;
    public boolean M;
    public long N;
    public long O;
    public final tcb a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final yw7 i;
    public final vqb j;
    public final kp o;
    public final te8 p;
    public final sz4 q;
    public y79 r;
    public byte s;
    public int t;
    public long u;
    public int v;
    public yw7 w;
    public long x;
    public int y;
    public long z;
    public final hi2 k = new hi2((byte) 27);
    public final yw7 l = new yw7(16);
    public final yw7 e = new yw7(add.a);
    public final yw7 f = new yw7(6);
    public final yw7 g = new yw7();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        fo4 fo4Var = new fo4();
        fo4Var.s = wf7.n("application/x-emsg");
        Q = new go4(fo4Var);
    }

    public er4(tcb tcbVar, int i, vqb vqbVar, List list, te8 te8Var) {
        this.a = tcbVar;
        this.b = i;
        this.j = vqbVar;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = te8Var;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new yw7(bArr);
        ko5 ko5Var = mo5.b;
        this.r = y79.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = u84.v;
        this.J = new yzb[0];
        this.K = new yzb[0];
        this.o = new kp(new yu3(this, (byte) 24));
        this.q = new sz4((byte) 19);
        this.N = -1L;
        this.O = -1L;
    }

    public static int g(int i) {
        int i2 = (i & 1) != 0 ? 64 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    public static as3 i(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            ph7 ph7Var = (ph7) arrayList.get(i);
            if (ph7Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = ph7Var.e.a;
                kw8 b = wte.b(bArr);
                UUID uuid = b == null ? null : (UUID) b.c;
                if (uuid == null) {
                    ncd.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new zr3(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new as3(null, false, (zr3[]) arrayList2.toArray(new zr3[0]));
    }

    public static void k(yw7 yw7Var, int i, tzb tzbVar) {
        yw7Var.N(i + 8);
        int m = yw7Var.m();
        byte[] bArr = yz0.a;
        if ((m & 1) != 0) {
            throw bx7.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m & 2) != 0;
        int E = yw7Var.E();
        if (E == 0) {
            Arrays.fill(tzbVar.l, 0, tzbVar.e, false);
            return;
        }
        int i2 = tzbVar.e;
        yw7 yw7Var2 = tzbVar.n;
        if (E != i2) {
            StringBuilder l = hg9.l(E, "Senc sample count ", " is different from fragment sample count");
            l.append(tzbVar.e);
            throw bx7.a(l.toString(), null);
        }
        Arrays.fill(tzbVar.l, 0, E, z);
        yw7Var2.K(yw7Var.a());
        tzbVar.k = true;
        tzbVar.o = true;
        yw7Var.k(0, yw7Var2.c, yw7Var2.a);
        yw7Var2.N(0);
        tzbVar.o = false;
    }

    public static Pair l(long j, yw7 yw7Var) {
        long G;
        long G2;
        yw7 yw7Var2 = yw7Var;
        yw7Var2.N(8);
        int e = yz0.e(yw7Var2.m());
        yw7Var2.O(4);
        long C = yw7Var2.C();
        if (e == 0) {
            G = yw7Var2.C();
            G2 = yw7Var2.C();
        } else {
            G = yw7Var2.G();
            G2 = yw7Var2.G();
        }
        long j2 = G2 + j;
        String str = hac.a;
        long b0 = hac.b0(G, 1000000L, C, RoundingMode.DOWN);
        yw7Var2.O(2);
        int H = yw7Var2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j3 = j2;
        long j4 = b0;
        int i = 0;
        while (i < H) {
            int m = yw7Var2.m();
            if ((Integer.MIN_VALUE & m) != 0) {
                throw bx7.a("Unhandled indirect reference", null);
            }
            long C2 = yw7Var2.C();
            iArr[i] = m & ConnectionsManager.DEFAULT_DATACENTER_ID;
            jArr[i] = j3;
            jArr3[i] = j4;
            G += C2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long b02 = hac.b0(G, 1000000L, C, RoundingMode.DOWN);
            jArr4[i] = b02 - jArr5[i];
            yw7Var2.O(4);
            j3 += iArr[i];
            i++;
            H = H;
            yw7Var2 = yw7Var;
            j4 = b02;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(b0), new oi2(iArr, jArr, jArr2, jArr3));
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
    
        ((vb3) r1).m(r49.D, false);
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
        ((vb3) r1).m(8, false);
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
        ik7.b(r49.D, r13);
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
        ((vb3) r1).c(r13, r14, r4 + r4, false);
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
    
        r3 = add.c(r6);
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
    
        if (add.d(r13, r4, r6) == false) goto L609;
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
    
        throw bx7.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0210, code lost:
    
        r4 = add.e(r6);
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
        ((vb3) r1).c(r3.a, 0, r49.F, false);
        r2.e(r49.F, r3);
        r4 = r49.F;
        r5 = add.m(r3.c, r3.a);
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
    
        r1 = (br4) r39.removeFirst();
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
    
        if (c1d.e(r6.t) == false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0359, code lost:
    
        r4 = c1d.h(r1, r49.D, r14.m);
        r14.m = r4;
        r4 = r4.a();
        r4.w = r3.x;
        mlb.w(r4, r2);
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
    
        throw bx7.d("Atom size less than header length (unsupported).");
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
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
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
        t84 t84Var2 = t84Var;
        while (true) {
            byte b = this.s;
            ArrayDeque arrayDeque = this.m;
            kp kpVar = this.o;
            sz4 sz4Var = this.q;
            int i4 = this.b;
            SparseArray sparseArray = this.d;
            yw7 yw7Var = this.i;
            boolean z2 = true;
            if (b != 0) {
                ArrayDeque arrayDeque2 = this.n;
                vqb vqbVar = this.j;
                if (b == 1) {
                    int i5 = (int) (this.u - this.v);
                    yw7 yw7Var2 = this.w;
                    if (yw7Var2 != null) {
                        ((vb3) t84Var).c(yw7Var2.a, 8, i5, false);
                        int i6 = this.t;
                        ph7 ph7Var = new ph7(i6, yw7Var2);
                        if (!arrayDeque.isEmpty()) {
                            ((oh7) arrayDeque.peek()).f.add(ph7Var);
                        } else if (i6 == 1936286840) {
                            vb3 vb3Var = (vb3) t84Var;
                            Pair l = l(vb3Var.d, yw7Var2);
                            sz4Var.y((oi2) l.second);
                            LinkedHashMap linkedHashMap = (LinkedHashMap) sz4Var.a;
                            this.B = ((Long) l.first).longValue();
                            if (this.M) {
                                i = 1;
                            } else {
                                i = 1;
                                this.I.f0(linkedHashMap.size() == 1 ? (ix9) l.second : sz4Var.H());
                                this.L = true;
                            }
                            if ((i4 & 256) != 0 && !this.M && linkedHashMap.size() > i) {
                                this.N = vb3Var.d;
                            }
                        } else if (i6 == 1701671783 && this.J.length != 0) {
                            yw7Var2.N(8);
                            int e = yz0.e(yw7Var2.m());
                            if (e == 0) {
                                v = yw7Var2.v();
                                v.getClass();
                                v2 = yw7Var2.v();
                                v2.getClass();
                                long C4 = yw7Var2.C();
                                long C5 = yw7Var2.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long b02 = hac.b0(C5, 1000000L, C4, roundingMode);
                                long j10 = this.B;
                                long j11 = j10 != -9223372036854775807L ? j10 + b02 : -9223372036854775807L;
                                j5 = b02;
                                j6 = j11;
                                b0 = hac.b0(yw7Var2.C(), 1000L, C4, roundingMode);
                                C = yw7Var2.C();
                            } else if (e != 1) {
                                b10.o(e, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long C6 = yw7Var2.C();
                                long G = yw7Var2.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j6 = hac.b0(G, 1000000L, C6, roundingMode2);
                                long b03 = hac.b0(yw7Var2.C(), 1000L, C6, roundingMode2);
                                long C7 = yw7Var2.C();
                                v = yw7Var2.v();
                                v.getClass();
                                v2 = yw7Var2.v();
                                v2.getClass();
                                b0 = b03;
                                C = C7;
                                j5 = -9223372036854775807L;
                            }
                            String str = v;
                            String str2 = v2;
                            byte[] bArr = new byte[yw7Var2.a()];
                            yw7Var2.k(0, yw7Var2.a(), bArr);
                            yw7 yw7Var3 = new yw7(this.k.u(new u54(str, str2, b0, C, bArr)));
                            int a = yw7Var3.a();
                            for (yzb yzbVar : this.J) {
                                yw7Var3.N(0);
                                yzbVar.e(a, yw7Var3);
                            }
                            if (j6 == -9223372036854775807L) {
                                arrayDeque2.addLast(new br4(a, j5, true));
                                this.y += a;
                            } else if (arrayDeque2.isEmpty()) {
                                if (vqbVar != null) {
                                    if (vqbVar.f()) {
                                        j6 = vqbVar.a(j6);
                                    } else {
                                        arrayDeque2.addLast(new br4(a, j6, false));
                                        this.y += a;
                                    }
                                }
                                long j12 = j6;
                                for (yzb yzbVar2 : this.J) {
                                    yzbVar2.a(j12, 1, a, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new br4(a, j6, false));
                                this.y += a;
                            }
                        }
                    } else {
                        ((vb3) t84Var).m(i5, false);
                    }
                    m(((vb3) t84Var).d);
                } else if (b != 2) {
                    int i7 = 2;
                    if (b == 5) {
                        yw7Var.K(16);
                        vb3 vb3Var2 = (vb3) t84Var;
                        if (vb3Var2.c(yw7Var.a, 0, 16, true)) {
                            yw7Var.N(0);
                            int m = yw7Var.m();
                            int m2 = yw7Var.m();
                            if (m == 16 && m2 == 1835430511) {
                                yw7Var.O(4);
                                long C8 = yw7Var.C();
                                long j13 = vb3Var2.c - C8;
                                if (C8 <= 0 || C8 > 2147483647L || j13 < 0 || j13 < this.O) {
                                    j(new od0(this.A, this.O), u21Var);
                                } else {
                                    u21Var.a = j13;
                                    this.s = (byte) 6;
                                }
                            } else {
                                j(new od0(this.A, this.O), u21Var);
                            }
                        } else {
                            j(new od0(this.A, this.O), u21Var);
                        }
                        byte b2 = this.s;
                        if (b2 == 6 || b2 == 0) {
                            return 1;
                        }
                    } else if (b != 6) {
                        dr4 dr4Var = this.C;
                        if (dr4Var != null) {
                            c = 6;
                            z = true;
                            c2 = 5;
                            break;
                        }
                        int size = sparseArray.size();
                        c = 6;
                        c2 = 5;
                        int i8 = 0;
                        dr4 dr4Var2 = null;
                        long j14 = Long.MAX_VALUE;
                        while (i8 < size) {
                            dr4 dr4Var3 = (dr4) sparseArray.valueAt(i8);
                            boolean z3 = z2;
                            boolean z4 = dr4Var3.n;
                            tzb tzbVar = dr4Var3.b;
                            int i9 = size;
                            if (z4) {
                                i2 = i8;
                                if (dr4Var3.h == tzbVar.d) {
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
                                if (dr4Var3.f == dr4Var3.d.b) {
                                    i8 = i2 + 1;
                                    size = i9;
                                    z2 = z3;
                                }
                                j7 = z4 ? dr4Var3.d.c[dr4Var3.f] : tzbVar.f[dr4Var3.h];
                                if (j7 >= j14) {
                                    dr4Var2 = dr4Var3;
                                    j14 = j7;
                                }
                                i8 = i2 + 1;
                                size = i9;
                                z2 = z3;
                            }
                        }
                        z = z2;
                        if (dr4Var2 == null) {
                            int i10 = (int) (this.x - ((vb3) t84Var2).d);
                            if (i10 < 0) {
                                throw bx7.a("Offset to end of mdat was negative.", null);
                            }
                            ((vb3) t84Var2).m(i10, false);
                            h();
                        } else {
                            int i11 = (int) ((!dr4Var2.n ? dr4Var2.d.c[dr4Var2.f] : dr4Var2.b.f[dr4Var2.h]) - ((vb3) t84Var2).d);
                            if (i11 < 0) {
                                ncd.f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                i11 = 0;
                            }
                            ((vb3) t84Var2).m(i11, false);
                            this.C = dr4Var2;
                            dr4Var = dr4Var2;
                        }
                    } else {
                        vb3 vb3Var3 = (vb3) t84Var2;
                        long j15 = ((vb3) t84Var2).c - vb3Var3.d;
                        yw7Var.K(8);
                        if (vb3Var3.d(yw7Var.a, 0, 8, true)) {
                            yw7Var.N(0);
                            int m3 = yw7Var.m();
                            if (yw7Var.m() != 1835430497) {
                                j(new od0(this.A, this.O), u21Var);
                            } else {
                                int i12 = (int) j15;
                                yw7 yw7Var4 = new yw7(i12);
                                vb3Var3.c(yw7Var4.a, 0, i12, false);
                                yw7Var4.N(m3 == 1 ? 16 : 8);
                                SparseArray sparseArray2 = new SparseArray();
                                SparseArray sparseArray3 = new SparseArray();
                                while (yw7Var4.a() >= 8) {
                                    int i13 = yw7Var4.b;
                                    long C9 = yw7Var4.C();
                                    int m4 = yw7Var4.m();
                                    if (C9 == 1) {
                                        if (yw7Var4.a() < 8) {
                                            break;
                                        }
                                        C9 = yw7Var4.u();
                                    } else if (C9 == 0) {
                                        C9 = yw7Var4.c - i13;
                                    }
                                    if (C9 < (C9 == 1 ? 16 : 8)) {
                                        break;
                                    }
                                    long j16 = i13;
                                    if (C9 > yw7Var4.c - j16) {
                                        break;
                                    }
                                    if (m4 != 1952871009) {
                                        j8 = C9;
                                        j9 = j16;
                                    } else if (C9 < r10 + 16) {
                                        yw7Var4.N((int) (j16 + C9));
                                    } else {
                                        int e2 = yz0.e(yw7Var4.m());
                                        int m5 = yw7Var4.m();
                                        dr4 dr4Var4 = (dr4) sparseArray.get(m5);
                                        if (dr4Var4 == null) {
                                            yw7Var4.N((int) (j16 + C9));
                                        } else {
                                            long j17 = dr4Var4.d.a.c;
                                            int m6 = yw7Var4.m();
                                            int i14 = (m6 >> 4) & 3;
                                            int i15 = (m6 >> 2) & 3;
                                            int i16 = m6 & 3;
                                            j8 = C9;
                                            long C10 = yw7Var4.C();
                                            int i17 = i14 + 1;
                                            int i18 = i15 + 1;
                                            j9 = j16;
                                            int i19 = i16 + 1;
                                            if (((e2 == 1 ? 16L : 8L) + i17 + i18 + i19) * C10 > yw7Var4.a()) {
                                                yw7Var4.N((int) (j9 + j8));
                                            } else {
                                                int i20 = (int) C10;
                                                long[] jArr = new long[i20];
                                                long[] jArr2 = new long[i20];
                                                for (int i21 = 0; i21 < i20; i21++) {
                                                    if (e2 == 1) {
                                                        C2 = yw7Var4.G();
                                                        C3 = yw7Var4.G();
                                                    } else {
                                                        C2 = yw7Var4.C();
                                                        C3 = yw7Var4.C();
                                                    }
                                                    long j18 = C3;
                                                    long j19 = C2;
                                                    yw7Var4.O(i17 + i18 + i19);
                                                    if (j17 != -9223372036854775807L) {
                                                        j19 = hac.b0(j19, 1000000L, j17, RoundingMode.DOWN);
                                                    }
                                                    jArr[i21] = j19;
                                                    jArr2[i21] = j18;
                                                }
                                                sparseArray2.put(m5, jArr);
                                                sparseArray3.put(m5, jArr2);
                                            }
                                        }
                                    }
                                    yw7Var4.N((int) (j9 + j8));
                                }
                                if (sparseArray2.size() == 0) {
                                    j(new od0(this.A, this.O), u21Var);
                                } else {
                                    int i22 = -1;
                                    int i23 = -1;
                                    int i24 = 0;
                                    while (i24 < sparseArray2.size()) {
                                        int keyAt = sparseArray2.keyAt(i24);
                                        dr4 dr4Var5 = (dr4) sparseArray.get(keyAt);
                                        if (dr4Var5 != null) {
                                            int i25 = dr4Var5.d.a.b;
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
                                            j(new cr4(sparseArray2, sparseArray3, this.A, this.O, i3), u21Var);
                                        } else {
                                            i22 = sparseArray2.keyAt(0);
                                        }
                                    }
                                    i3 = i22;
                                    j(new cr4(sparseArray2, sparseArray3, this.A, this.O, i3), u21Var);
                                }
                            }
                        } else {
                            j(new od0(this.A, this.O), u21Var);
                        }
                        if (this.s == 0) {
                            return 1;
                        }
                    }
                } else {
                    int size2 = sparseArray.size();
                    dr4 dr4Var6 = null;
                    long j20 = Long.MAX_VALUE;
                    for (int i26 = 0; i26 < size2; i26++) {
                        tzb tzbVar2 = ((dr4) sparseArray.valueAt(i26)).b;
                        if (tzbVar2.o) {
                            long j21 = tzbVar2.c;
                            if (j21 < j20) {
                                dr4Var6 = (dr4) sparseArray.valueAt(i26);
                                j20 = j21;
                            }
                        }
                    }
                    if (dr4Var6 == null) {
                        this.s = (byte) 3;
                    } else {
                        int i27 = (int) (j20 - ((vb3) t84Var).d);
                        if (i27 < 0) {
                            throw bx7.a("Offset to encryption data was negative.", null);
                        }
                        vb3 vb3Var4 = (vb3) t84Var;
                        vb3Var4.m(i27, false);
                        tzb tzbVar3 = dr4Var6.b;
                        yw7 yw7Var5 = tzbVar3.n;
                        vb3Var4.c(yw7Var5.a, 0, yw7Var5.c, false);
                        yw7Var5.N(0);
                        tzbVar3.o = false;
                    }
                }
            } else {
                int i28 = this.v;
                yw7 yw7Var6 = this.l;
                if (i28 == 0) {
                    if (!((vb3) t84Var).c(yw7Var6.a, 0, 8, true)) {
                        long j22 = this.N;
                        if (j22 == -1) {
                            kpVar.d(0);
                            return -1;
                        }
                        u21Var.a = j22;
                        this.N = -1L;
                        this.I.f0(sz4Var.H());
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    yw7Var6.N(0);
                    this.u = yw7Var6.C();
                    this.t = yw7Var6.m();
                }
                long j23 = this.u;
                if (j23 == 1) {
                    ((vb3) t84Var).c(yw7Var6.a, 8, 8, false);
                    this.v += 8;
                    this.u = yw7Var6.G();
                } else if (j23 == 0) {
                    long j24 = ((vb3) t84Var).c;
                    if (j24 == -1 && !arrayDeque.isEmpty()) {
                        j24 = ((oh7) arrayDeque.peek()).e;
                    }
                    if (j24 != -1) {
                        j = -1;
                        this.u = (j24 - ((vb3) t84Var).d) + this.v;
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
                                yw7Var.K((int) j2);
                                System.arraycopy(yw7Var6.a, 0, yw7Var.a, 0, 8);
                                ((vb3) t84Var).c(yw7Var.a, 8, (int) (this.u - this.v), false);
                                sz4Var.y((oi2) l(((vb3) t84Var).f(), yw7Var).second);
                            } else {
                                ((vb3) t84Var).m((int) (j2 - j4), true);
                            }
                            h();
                        } else {
                            long j25 = ((vb3) t84Var).d - i29;
                            int i30 = this.t;
                            if ((i30 == 1836019558 || i30 == 1835295092) && !this.L) {
                                long j26 = ((vb3) t84Var).c;
                                if (j26 == j || this.O != j || (i4 & 512) == 0) {
                                    this.I.f0(new od0(this.A, j25));
                                    this.L = true;
                                } else {
                                    this.O = j25;
                                    u21Var.a = j26 - 16;
                                    this.s = (byte) 5;
                                }
                            }
                            if (this.t == 1836019558) {
                                int size3 = sparseArray.size();
                                for (int i31 = 0; i31 < size3; i31++) {
                                    tzb tzbVar4 = ((dr4) sparseArray.valueAt(i31)).b;
                                    tzbVar4.getClass();
                                    tzbVar4.c = j25;
                                    tzbVar4.b = j25;
                                }
                            }
                            int i32 = this.t;
                            if (i32 == 1835295092) {
                                this.C = null;
                                this.x = j25 + this.u;
                                this.s = (byte) 2;
                            } else if (i32 == 1836019574 || i32 == 1953653099 || i32 == 1835297121 || i32 == 1835626086 || i32 == 1937007212 || i32 == 1836019558 || i32 == 1953653094 || i32 == 1836475768 || i32 == 1701082227 || i32 == 1835365473) {
                                vb3 vb3Var5 = (vb3) t84Var;
                                long j27 = vb3Var5.d;
                                long j28 = this.u;
                                long j29 = (j27 + j28) - 8;
                                if (j28 != this.v && i32 == 1835365473) {
                                    yw7Var.K(8);
                                    vb3Var5.d(yw7Var.a, 0, 8, false);
                                    yz0.a(yw7Var);
                                    vb3Var5.m(yw7Var.b, false);
                                    vb3Var5.f = 0;
                                }
                                arrayDeque.push(new oh7(this.t, j29));
                                if (this.u == this.v) {
                                    m(j29);
                                } else {
                                    h();
                                }
                            } else if (i32 == 1751411826 || i32 == 1835296868 || i32 == 1836476516 || i32 == 1936286840 || i32 == 1937011556 || i32 == 1937011827 || i32 == 1668576371 || i32 == 1937011555 || i32 == 1937011578 || i32 == 1937013298 || i32 == 1937007471 || i32 == 1668232756 || i32 == 1937011571 || i32 == 1952867444 || i32 == 1952868452 || i32 == 1953196132 || i32 == 1953654136 || i32 == 1953658222 || i32 == 1886614376 || i32 == 1935763834 || i32 == 1935763823 || i32 == 1936027235 || i32 == 1970628964 || i32 == 1935828848 || i32 == 1936158820 || i32 == 1701606260 || i32 == 1835362404 || i32 == 1701671783 || i32 == 1969517665 || i32 == 1801812339 || i32 == 1768715124) {
                                if (this.v != 8) {
                                    throw bx7.d("Leaf atom defines extended atom size (unsupported).");
                                }
                                if (this.u > 2147483647L) {
                                    throw bx7.d("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                yw7 yw7Var7 = new yw7((int) this.u);
                                System.arraycopy(yw7Var6.a, 0, yw7Var7.a, 0, 8);
                                this.w = yw7Var7;
                                this.s = (byte) 1;
                            } else {
                                if (this.u > 2147483647L) {
                                    throw bx7.d("Skipping atom with length > 2147483647 (unsupported).");
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
            t84Var2 = t84Var;
        }
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        y79 y79Var;
        bma a = zed.a(t84Var, true);
        if (a != null) {
            y79Var = mo5.u(a);
        } else {
            ko5 ko5Var = mo5.b;
            y79Var = y79.e;
        }
        this.r = y79Var;
        return a == null;
    }

    @Override // s84
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((dr4) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j2;
        this.m.clear();
        this.O = -1L;
        h();
    }

    @Override // s84
    public final List e() {
        return this.r;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            u84Var = new yh4(u84Var, this.a);
        }
        this.I = u84Var;
        h();
        yzb[] yzbVarArr = new yzb[2];
        this.J = yzbVarArr;
        int i3 = 0;
        te8 te8Var = this.p;
        if (te8Var != null) {
            yzbVarArr[0] = te8Var;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            yzbVarArr[i] = this.I.c0(100, 5);
            i4 = 101;
            i++;
        }
        yzb[] yzbVarArr2 = (yzb[]) hac.V(i, this.J);
        this.J = yzbVarArr2;
        for (yzb yzbVar : yzbVarArr2) {
            yzbVar.g(Q);
        }
        List list = this.c;
        this.K = new yzb[list.size()];
        while (i3 < this.K.length) {
            yzb c0 = this.I.c0(i4, 3);
            c0.g((go4) list.get(i3));
            this.K[i3] = c0;
            i3++;
            i4++;
        }
    }

    public final void h() {
        this.s = (byte) 0;
        this.v = 0;
    }

    public final void j(ix9 ix9Var, u21 u21Var) {
        this.I.f0(ix9Var);
        this.L = true;
        u21Var.a = this.O;
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
        nf7 nf7Var;
        int i;
        nf7 nf7Var2;
        ArrayList arrayList;
        int i2;
        id3 id3Var;
        int i3;
        ArrayList arrayList2;
        id3 id3Var2;
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
        id3 id3Var3;
        int i16;
        int i17;
        int i18;
        int i19;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((oh7) arrayDeque.peek()).e != j) {
                break;
            }
            oh7 oh7Var = (oh7) arrayDeque.pop();
            int i20 = oh7Var.b;
            ArrayList arrayList9 = oh7Var.g;
            ArrayList arrayList10 = oh7Var.f;
            int i21 = 12;
            SparseArray sparseArray = this.d;
            int i22 = this.b;
            if (i20 == 1836019574) {
                as3 i23 = i(arrayList10);
                oh7 u = oh7Var.u(1836475768);
                u.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList11 = u.f;
                int size = arrayList11.size();
                long j2 = -9223372036854775807L;
                int i24 = 0;
                while (i24 < size) {
                    ph7 ph7Var = (ph7) arrayList11.get(i24);
                    int i25 = ph7Var.b;
                    yw7 yw7Var = ph7Var.e;
                    if (i25 == 1953654136) {
                        yw7Var.N(i21);
                        arrayList3 = arrayList11;
                        Pair create = Pair.create(Integer.valueOf(yw7Var.m()), new id3(yw7Var.m() - 1, yw7Var.m(), yw7Var.m(), yw7Var.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (id3) create.second);
                    } else {
                        arrayList3 = arrayList11;
                        if (i25 == 1835362404) {
                            yw7Var.N(8);
                            j2 = yz0.e(yw7Var.m()) == 0 ? yw7Var.C() : yw7Var.G();
                        }
                    }
                    i24++;
                    arrayList11 = arrayList3;
                    i21 = 12;
                }
                oh7 u2 = oh7Var.u(1835365473);
                nf7 f = u2 != null ? yz0.f(u2) : null;
                au4 au4Var = new au4();
                ph7 v = oh7Var.v(1969517665);
                if (v != null) {
                    nf7 k = yz0.k(v, (i22 & 1024) != 0);
                    au4Var.b(k);
                    nf7Var = k;
                } else {
                    nf7Var = null;
                }
                ph7 v2 = oh7Var.v(1836476516);
                v2.getClass();
                nf7 nf7Var3 = new nf7(yz0.g(v2.e));
                ArrayList j3 = yz0.j(oh7Var, au4Var, j2, i23, (i22 & 16) != 0, false, new ar4(this, (byte) 0), false);
                int size2 = j3.size();
                if (sparseArray.size() == 0) {
                    String a = fre.a(j3);
                    int i26 = 0;
                    while (i26 < size2) {
                        zzb zzbVar = (zzb) j3.get(i26);
                        qzb qzbVar = zzbVar.a;
                        boolean z4 = qzbVar.m;
                        int i27 = qzbVar.a;
                        go4 go4Var = qzbVar.g;
                        int i28 = size2;
                        String str = a;
                        long j4 = qzbVar.e;
                        int i29 = qzbVar.b;
                        if (z4) {
                            yzb c0 = this.I.c0(i26, i29);
                            c0.d(j4);
                            i = i26;
                            fo4 a2 = go4Var.a();
                            nf7Var2 = nf7Var3;
                            a2.r = wf7.n(str);
                            if (i29 == 1) {
                                int i30 = au4Var.a;
                                i2 = i28;
                                arrayList = j3;
                                if (i30 != -1 && (i3 = au4Var.b) != -1) {
                                    a2.Q = i30;
                                    a2.R = i3;
                                }
                            } else {
                                arrayList = j3;
                                i2 = i28;
                            }
                            ere.f(i29, f, a2, go4Var.m, nf7Var, nf7Var2);
                            if (sparseArray2.size() == 1) {
                                id3Var = (id3) sparseArray2.valueAt(0);
                            } else {
                                id3Var = (id3) sparseArray2.get(i27);
                                id3Var.getClass();
                            }
                            sparseArray.put(i27, new dr4(c0, zzbVar, id3Var, new go4(a2)));
                            this.A = Math.max(this.A, j4);
                        } else {
                            arrayList = j3;
                            i = i26;
                            nf7Var2 = nf7Var3;
                            i2 = i28;
                        }
                        i26 = i + 1;
                        a = str;
                        nf7Var3 = nf7Var2;
                        size2 = i2;
                        j3 = arrayList;
                    }
                    this.I.B();
                } else {
                    ArrayList arrayList12 = j3;
                    int i31 = 0;
                    int i32 = 0;
                    while (true) {
                        arrayList2 = arrayList12;
                        if (i31 >= size2) {
                            break;
                        }
                        if (((zzb) arrayList2.get(i31)).a.m) {
                            i32++;
                        }
                        i31++;
                        arrayList12 = arrayList2;
                    }
                    jte.p(sparseArray.size() == i32);
                    for (int i33 = 0; i33 < size2; i33++) {
                        zzb zzbVar2 = (zzb) arrayList2.get(i33);
                        qzb qzbVar2 = zzbVar2.a;
                        boolean z5 = qzbVar2.m;
                        int i34 = qzbVar2.a;
                        if (z5) {
                            dr4 dr4Var = (dr4) sparseArray.get(i34);
                            if (sparseArray2.size() == 1) {
                                id3Var2 = (id3) sparseArray2.valueAt(0);
                            } else {
                                id3Var2 = (id3) sparseArray2.get(i34);
                                id3Var2.getClass();
                            }
                            dr4Var.d = zzbVar2;
                            dr4Var.e = id3Var2;
                            if (dr4Var.l == null) {
                                dr4Var.a.g(dr4Var.m);
                            }
                            dr4Var.e();
                        }
                    }
                }
            } else if (i20 == 1836019558) {
                int size3 = arrayList9.size();
                int i35 = 0;
                while (i35 < size3) {
                    oh7 oh7Var2 = (oh7) arrayList9.get(i35);
                    if (oh7Var2.b == 1953653094) {
                        ph7 v3 = oh7Var2.v(1952868452);
                        ArrayList arrayList13 = oh7Var2.f;
                        v3.getClass();
                        yw7 yw7Var2 = v3.e;
                        yw7Var2.N(8);
                        int m = yw7Var2.m();
                        byte[] bArr2 = yz0.a;
                        dr4 dr4Var2 = (dr4) sparseArray.get(yw7Var2.m());
                        if (dr4Var2 == null) {
                            i4 = size3;
                            dr4Var2 = null;
                        } else {
                            tzb tzbVar = dr4Var2.b;
                            if ((m & 1) != 0) {
                                long G = yw7Var2.G();
                                tzbVar.b = G;
                                tzbVar.c = G;
                            }
                            id3 id3Var4 = dr4Var2.e;
                            int m2 = (m & 2) != 0 ? yw7Var2.m() - 1 : id3Var4.a;
                            int m3 = (m & 8) != 0 ? yw7Var2.m() : id3Var4.b;
                            if ((m & 16) != 0) {
                                i4 = size3;
                                i7 = yw7Var2.m();
                            } else {
                                i4 = size3;
                                i7 = id3Var4.c;
                            }
                            tzbVar.a = new id3(m2, m3, i7, (m & 32) != 0 ? yw7Var2.m() : id3Var4.d);
                        }
                        if (dr4Var2 != null) {
                            tzb tzbVar2 = dr4Var2.b;
                            long j5 = tzbVar2.p;
                            boolean z6 = tzbVar2.q;
                            dr4Var2.e();
                            dr4Var2.n = true;
                            ph7 v4 = oh7Var2.v(1952867444);
                            if (v4 == null || (i22 & 2) != 0) {
                                tzbVar2.p = j5;
                                tzbVar2.q = z6;
                            } else {
                                yw7 yw7Var3 = v4.e;
                                yw7Var3.N(8);
                                tzbVar2.p = yz0.e(yw7Var3.m()) == 1 ? yw7Var3.G() : yw7Var3.C();
                                tzbVar2.q = true;
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
                                ph7 ph7Var2 = (ph7) arrayList13.get(i36);
                                ArrayList arrayList14 = arrayList9;
                                if (ph7Var2.b == 1953658222) {
                                    yw7 yw7Var4 = ph7Var2.e;
                                    yw7Var4.N(12);
                                    int E = yw7Var4.E();
                                    if (E > 0) {
                                        i38 += E;
                                        i37++;
                                    }
                                }
                                i36++;
                                arrayList9 = arrayList14;
                            }
                            arrayList4 = arrayList9;
                            dr4Var2.h = 0;
                            dr4Var2.g = 0;
                            dr4Var2.f = 0;
                            tzbVar2.d = i37;
                            tzbVar2.e = i38;
                            if (tzbVar2.g.length < i37) {
                                tzbVar2.f = new long[i37];
                                tzbVar2.g = new int[i37];
                            }
                            if (tzbVar2.h.length < i38) {
                                int i39 = (i38 * nm7.I1) / 100;
                                tzbVar2.h = new int[i39];
                                tzbVar2.i = new long[i39];
                                tzbVar2.j = new boolean[i39];
                                tzbVar2.l = new boolean[i39];
                            }
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            while (true) {
                                long j6 = 0;
                                if (i40 < size4) {
                                    ph7 ph7Var3 = (ph7) arrayList13.get(i40);
                                    if (ph7Var3.b == i8) {
                                        int i43 = i41 + 1;
                                        yw7 yw7Var5 = ph7Var3.e;
                                        yw7Var5.N(8);
                                        int m4 = yw7Var5.m();
                                        byte[] bArr3 = yz0.a;
                                        i10 = size4;
                                        qzb qzbVar3 = dr4Var2.d.a;
                                        i11 = i40;
                                        id3 id3Var5 = tzbVar2.a;
                                        String str2 = hac.a;
                                        arrayList7 = arrayList10;
                                        tzbVar2.g[i41] = yw7Var5.E();
                                        long[] jArr = tzbVar2.f;
                                        i12 = i35;
                                        i13 = i22;
                                        long j7 = tzbVar2.b;
                                        jArr[i41] = j7;
                                        if ((m4 & 1) != 0) {
                                            jArr[i41] = j7 + yw7Var5.m();
                                        }
                                        boolean z7 = (m4 & 4) != 0;
                                        int i44 = id3Var5.d;
                                        if (z7) {
                                            i44 = yw7Var5.m();
                                        }
                                        boolean z8 = (m4 & 256) != 0;
                                        boolean z9 = z7;
                                        boolean z10 = (m4 & 512) != 0;
                                        boolean z11 = (m4 & 1024) != 0;
                                        boolean z12 = (m4 & 2048) != 0;
                                        boolean z13 = z11;
                                        oo5 oo5Var = qzbVar3.i;
                                        int i45 = i41;
                                        oo5 oo5Var2 = qzbVar3.j;
                                        if (oo5Var != null) {
                                            i14 = i44;
                                            z2 = z8;
                                            if (oo5Var.b != 1 || oo5Var2 == null) {
                                                arrayList8 = arrayList13;
                                            } else {
                                                if (oo5Var.a(0) == 0) {
                                                    arrayList8 = arrayList13;
                                                } else {
                                                    long a3 = oo5Var.a(0);
                                                    long j8 = qzbVar3.d;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    long b0 = hac.b0(a3, 1000000L, j8, roundingMode);
                                                    arrayList8 = arrayList13;
                                                    i19 = b0 + hac.b0(oo5Var2.a(0), 1000000L, qzbVar3.c, roundingMode) >= qzbVar3.e ? 0 : 0;
                                                }
                                                j6 = oo5Var2.a(i19);
                                            }
                                        } else {
                                            arrayList8 = arrayList13;
                                            i14 = i44;
                                            z2 = z8;
                                        }
                                        int[] iArr = tzbVar2.h;
                                        long[] jArr2 = tzbVar2.i;
                                        boolean[] zArr = tzbVar2.j;
                                        boolean z14 = qzbVar3.b == 2 && (i13 & 1) != 0;
                                        int i46 = tzbVar2.g[i45] + i42;
                                        long j9 = qzbVar3.c;
                                        long j10 = tzbVar2.p;
                                        while (i42 < i46) {
                                            int m5 = z2 ? yw7Var5.m() : id3Var5.b;
                                            boolean[] zArr2 = zArr;
                                            if (m5 < 0) {
                                                throw bx7.a("Unexpected negative value: " + m5, null);
                                            }
                                            if (z10) {
                                                z3 = z14;
                                                i15 = yw7Var5.m();
                                            } else {
                                                z3 = z14;
                                                i15 = id3Var5.c;
                                            }
                                            if (i15 < 0) {
                                                throw bx7.a("Unexpected negative value: " + i15, null);
                                            }
                                            int m6 = z13 ? yw7Var5.m() : (i42 == 0 && z9) ? i14 : id3Var5.d;
                                            if (z12) {
                                                id3Var3 = id3Var5;
                                                i16 = yw7Var5.m();
                                                i18 = i42;
                                                i17 = i46;
                                            } else {
                                                id3Var3 = id3Var5;
                                                i16 = 0;
                                                i17 = i46;
                                                i18 = i42;
                                            }
                                            long b02 = hac.b0((i16 + j10) - j6, 1000000L, j9, RoundingMode.DOWN);
                                            jArr2[i18] = b02;
                                            if (!tzbVar2.q) {
                                                jArr2[i18] = b02 + dr4Var2.d.i;
                                            }
                                            iArr[i18] = i15;
                                            zArr2[i18] = ((m6 >> 16) & 1) == 0 && (!z3 || i18 == 0);
                                            j10 += m5;
                                            i42 = i18 + 1;
                                            i46 = i17;
                                            zArr = zArr2;
                                            z14 = z3;
                                            id3Var5 = id3Var3;
                                        }
                                        tzbVar2.p = j10;
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
                                    qzb qzbVar4 = dr4Var2.d.a;
                                    id3 id3Var6 = tzbVar2.a;
                                    id3Var6.getClass();
                                    int i47 = id3Var6.a;
                                    szb[] szbVarArr = qzbVar4.n;
                                    szb szbVar = szbVarArr == null ? null : szbVarArr[i47];
                                    ph7 v5 = oh7Var2.v(1935763834);
                                    if (v5 != null) {
                                        szbVar.getClass();
                                        yw7 yw7Var6 = v5.e;
                                        short s = szbVar.d;
                                        yw7Var6.N(8);
                                        int m7 = yw7Var6.m();
                                        byte[] bArr4 = yz0.a;
                                        if ((m7 & 1) == 1) {
                                            yw7Var6.O(8);
                                        }
                                        int A = yw7Var6.A();
                                        int E2 = yw7Var6.E();
                                        if (E2 > tzbVar2.e) {
                                            StringBuilder l = hg9.l(E2, "Saiz sample count ", " is greater than fragment sample count");
                                            l.append(tzbVar2.e);
                                            throw bx7.a(l.toString(), null);
                                        }
                                        if (A == 0) {
                                            boolean[] zArr3 = tzbVar2.l;
                                            i9 = 0;
                                            for (int i48 = 0; i48 < E2; i48++) {
                                                int A2 = yw7Var6.A();
                                                i9 += A2;
                                                zArr3[i48] = A2 > s;
                                            }
                                            z = false;
                                        } else {
                                            i9 = A * E2;
                                            z = false;
                                            Arrays.fill(tzbVar2.l, 0, E2, A > s);
                                        }
                                        Arrays.fill(tzbVar2.l, E2, tzbVar2.e, z);
                                        if (i9 > 0) {
                                            tzbVar2.n.K(i9);
                                            tzbVar2.k = true;
                                            tzbVar2.o = true;
                                        }
                                    }
                                    ph7 v6 = oh7Var2.v(1935763823);
                                    if (v6 != null) {
                                        yw7 yw7Var7 = v6.e;
                                        yw7Var7.N(8);
                                        int m8 = yw7Var7.m();
                                        byte[] bArr5 = yz0.a;
                                        if ((m8 & 1) == 1) {
                                            yw7Var7.O(8);
                                        }
                                        int E3 = yw7Var7.E();
                                        if (E3 != 1) {
                                            throw bx7.a("Unexpected saio entry count: " + E3, null);
                                        }
                                        tzbVar2.c += yz0.e(m8) == 0 ? yw7Var7.C() : yw7Var7.G();
                                    }
                                    ph7 v7 = oh7Var2.v(1936027235);
                                    if (v7 != null) {
                                        k(v7.e, 0, tzbVar2);
                                    }
                                    String str3 = szbVar != null ? szbVar.b : null;
                                    yw7 yw7Var8 = null;
                                    yw7 yw7Var9 = null;
                                    int i49 = 0;
                                    while (true) {
                                        arrayList6 = arrayList15;
                                        if (i49 >= arrayList15.size()) {
                                            break;
                                        }
                                        ph7 ph7Var4 = (ph7) arrayList6.get(i49);
                                        yw7 yw7Var10 = ph7Var4.e;
                                        int i50 = ph7Var4.b;
                                        if (i50 == 1935828848) {
                                            yw7Var10.N(12);
                                            if (yw7Var10.m() == 1936025959) {
                                                yw7Var8 = yw7Var10;
                                            }
                                        } else if (i50 == 1936158820) {
                                            yw7Var10.N(12);
                                            if (yw7Var10.m() == 1936025959) {
                                                yw7Var9 = yw7Var10;
                                            }
                                        }
                                        i49++;
                                        arrayList15 = arrayList6;
                                    }
                                    if (yw7Var8 != null && yw7Var9 != null) {
                                        yw7Var8.N(8);
                                        int e = yz0.e(yw7Var8.m());
                                        yw7Var8.O(4);
                                        if (e == 1) {
                                            yw7Var8.O(4);
                                        }
                                        if (yw7Var8.m() != 1) {
                                            throw bx7.d("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        yw7Var9.N(8);
                                        int e2 = yz0.e(yw7Var9.m());
                                        yw7Var9.O(4);
                                        long C = e2 >= 1 ? yw7Var9.C() : 0L;
                                        if (e2 >= 2) {
                                            yw7Var9.O(4);
                                        }
                                        if (yw7Var9.C() != 1) {
                                            throw bx7.d("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        if (e2 >= 1 && C == 0) {
                                            yw7Var9.O(4);
                                        }
                                        yw7Var9.O(1);
                                        int A3 = yw7Var9.A();
                                        int i51 = (A3 & nm7.O3) >> 4;
                                        int i52 = A3 & 15;
                                        boolean z15 = yw7Var9.A() == 1;
                                        if (z15) {
                                            int A4 = yw7Var9.A();
                                            byte[] bArr6 = new byte[16];
                                            yw7Var9.k(0, 16, bArr6);
                                            if (A4 == 0) {
                                                int A5 = yw7Var9.A();
                                                byte[] bArr7 = new byte[A5];
                                                yw7Var9.k(0, A5, bArr7);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            tzbVar2.k = true;
                                            tzbVar2.m = new szb(z15, str3, A4, bArr6, i51, i52, bArr);
                                        }
                                    }
                                    int size5 = arrayList6.size();
                                    for (int i53 = 0; i53 < size5; i53++) {
                                        ph7 ph7Var5 = (ph7) arrayList6.get(i53);
                                        if (ph7Var5.b == 1970628964) {
                                            yw7 yw7Var11 = ph7Var5.e;
                                            yw7Var11.N(8);
                                            byte[] bArr8 = this.h;
                                            yw7Var11.k(0, 16, bArr8);
                                            if (Arrays.equals(bArr8, P)) {
                                                k(yw7Var11, 16, tzbVar2);
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
                as3 i54 = i(arrayList10);
                if (i54 != null) {
                    int size6 = sparseArray.size();
                    for (int i55 = 0; i55 < size6; i55++) {
                        dr4 dr4Var3 = (dr4) sparseArray.valueAt(i55);
                        qzb qzbVar5 = dr4Var3.d.a;
                        id3 id3Var7 = dr4Var3.b.a;
                        String str4 = hac.a;
                        int i56 = id3Var7.a;
                        szb[] szbVarArr2 = qzbVar5.n;
                        szb szbVar2 = szbVarArr2 == null ? null : szbVarArr2[i56];
                        as3 a4 = i54.a(szbVar2 != null ? szbVar2.b : null);
                        fo4 a5 = dr4Var3.m.a();
                        a5.w = a4;
                        go4 go4Var2 = new go4(a5);
                        if (dr4Var3.l != null) {
                            dr4Var3.l = go4Var2;
                        } else {
                            dr4Var3.a.g(go4Var2);
                        }
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i57 = 0; i57 < size7; i57++) {
                        dr4 dr4Var4 = (dr4) sparseArray.valueAt(i57);
                        long j11 = this.z;
                        int i58 = dr4Var4.f;
                        while (true) {
                            tzb tzbVar3 = dr4Var4.b;
                            if (i58 < tzbVar3.e && tzbVar3.i[i58] <= j11) {
                                if (tzbVar3.j[i58]) {
                                    dr4Var4.i = i58;
                                }
                                i58++;
                            }
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((oh7) arrayDeque.peek()).g.add(oh7Var);
            }
        }
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
