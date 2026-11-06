package n4;

import e2.s0;
import e2.t;
import e2.t0;
import e2.u;
import f3.j0;
import f3.q;
import h2.m0;
import h2.x;
import i2.s;
import java.math.RoundingMode;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a implements b {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, qs.s1, qs.D1, qs.O1, qs.Z1, qs.n2, qs.D2, qs.U2, qs.m3, qs.G3, qs.c4, qs.C4, qs.e5, qs.I5, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final q a;
    public final j0 b;
    public final s c;
    public final int d;
    public final byte[] e;
    public final x f;
    public final int g;
    public final u h;
    public int i;
    public long j;
    public int k;
    public long l;

    public a(q qVar, j0 j0Var, s sVar) {
        this.a = qVar;
        this.b = j0Var;
        this.c = sVar;
        int i7 = sVar.b;
        int max = Math.max(1, i7 / 10);
        this.g = max;
        x xVar = new x(sVar.e);
        xVar.t();
        int t6 = xVar.t();
        this.d = t6;
        int i10 = sVar.a;
        int i11 = sVar.c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (sVar.d * i10)) + 1;
        if (t6 != i12) {
            throw t0.a(null, "Expected frames per block: " + i12 + "; got: " + t6);
        }
        int g10 = m0.g(max, t6);
        this.e = new byte[g10 * i11];
        this.f = new x(t6 * 2 * i10 * g10);
        int i13 = ((i11 * i7) * 8) / t6;
        t tVar = new t();
        tVar.r = s0.n("audio/raw");
        tVar.h = i13;
        tVar.i = i13;
        tVar.s = max * 2 * i10;
        tVar.J = i10;
        tVar.K = i7;
        tVar.L = 2;
        this.h = new u(tVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // n4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(f3.p r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a.a(f3.p, long):boolean");
    }

    @Override // n4.b
    public final void b(long j3) {
        this.i = 0;
        this.j = j3;
        this.k = 0;
        this.l = 0L;
    }

    @Override // n4.b
    public final void c(int i7, long j3) {
        e eVar = new e(this.c, this.d, i7, j3);
        this.a.f(eVar);
        u uVar = this.h;
        j0 j0Var = this.b;
        j0Var.g(uVar);
        j0Var.d(eVar.e);
    }

    public final void d(int i7) {
        long j3 = this.j;
        long j10 = this.l;
        s sVar = this.c;
        long j11 = sVar.b;
        String str = m0.a;
        long a02 = j3 + m0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
        int i10 = i7 * 2 * sVar.a;
        this.b.c(a02, 1, i10, this.k - i10, null);
        this.l += i7;
        this.k -= i10;
    }
}
