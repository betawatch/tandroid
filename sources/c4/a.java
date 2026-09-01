package c4;

import c2.a1;
import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import r3.m;
import r3.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements b {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final m a;
    public final v b;
    public final a1 c;
    public final int d;
    public final byte[] e;
    public final w f;
    public final int g;
    public final n0 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public a(m mVar, v vVar, a1 a1Var) {
        this.a = mVar;
        this.b = vVar;
        this.c = a1Var;
        int i10 = a1Var.b;
        int max = Math.max(1, i10 / 10);
        this.g = max;
        w wVar = new w((byte[]) a1Var.e);
        wVar.n();
        int n10 = wVar.n();
        this.d = n10;
        int i11 = a1Var.a;
        int i12 = a1Var.c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (a1Var.d * i11)) + 1;
        if (n10 != i13) {
            throw r1.a("Expected frames per block: " + i13 + "; got: " + n10, null);
        }
        int f10 = d0.f(max, n10);
        this.e = new byte[f10 * i12];
        this.f = new w(n10 * 2 * i11 * f10);
        int i14 = ((i12 * i10) * 8) / n10;
        m0 m0Var = new m0();
        m0Var.o = "audio/raw";
        m0Var.f = i14;
        m0Var.g = i14;
        m0Var.p = max * 2 * i11;
        m0Var.B = i11;
        m0Var.C = i10;
        m0Var.D = 2;
        this.h = new n0(m0Var);
    }

    @Override // c4.b
    public final void a(long j10) {
        this.i = 0;
        this.j = j10;
        this.k = 0;
        this.l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:5:0x0024->B:11:0x0040], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003d -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // c4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(r3.l r25, long r26) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.b(r3.l, long):boolean");
    }

    @Override // c4.b
    public final void c(int i10, long j10) {
        this.a.m2(new f(this.c, this.d, i10, j10));
        this.b.b(this.h);
    }

    public final void d(int i10) {
        long j10 = this.j;
        long j11 = this.l;
        a1 a1Var = this.c;
        long N = j10 + d0.N(j11, 1000000L, a1Var.b);
        int i11 = i10 * 2 * a1Var.a;
        this.b.c(N, 1, i11, this.k - i11, null);
        this.l += i10;
        this.k -= i11;
    }
}
