package m4;

import d2.u;
import d2.u0;
import d2.v;
import d2.v0;
import e3.i0;
import e3.q;
import g2.n0;
import g2.y;
import h2.s;
import java.math.RoundingMode;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements b {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, hs.s1, hs.D1, hs.O1, hs.Z1, hs.n2, hs.D2, hs.U2, hs.m3, hs.G3, hs.c4, hs.C4, hs.e5, hs.I5, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final q a;
    public final i0 b;
    public final s c;
    public final int d;
    public final byte[] e;
    public final y f;
    public final int g;
    public final v h;
    public int i;
    public long j;
    public int k;
    public long l;

    public a(q qVar, i0 i0Var, s sVar) {
        this.a = qVar;
        this.b = i0Var;
        this.c = sVar;
        int i3 = sVar.b;
        int max = Math.max(1, i3 / 10);
        this.g = max;
        y yVar = new y(sVar.e);
        yVar.t();
        int t10 = yVar.t();
        this.d = t10;
        int i10 = sVar.a;
        int i11 = sVar.c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (sVar.d * i10)) + 1;
        if (t10 != i12) {
            throw v0.a(null, "Expected frames per block: " + i12 + "; got: " + t10);
        }
        int g7 = n0.g(max, t10);
        this.e = new byte[g7 * i11];
        this.f = new y(t10 * 2 * i10 * g7);
        int i13 = ((i11 * i3) * 8) / t10;
        u uVar = new u();
        uVar.r = u0.n("audio/raw");
        uVar.h = i13;
        uVar.i = i13;
        uVar.s = max * 2 * i10;
        uVar.J = i10;
        uVar.K = i3;
        uVar.L = 2;
        this.h = new v(uVar);
    }

    @Override // m4.b
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
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // m4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(e3.p r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.a.b(e3.p, long):boolean");
    }

    @Override // m4.b
    public final void c(int i3, long j10) {
        e eVar = new e(this.c, this.d, i3, j10);
        this.a.f(eVar);
        v vVar = this.h;
        i0 i0Var = this.b;
        i0Var.g(vVar);
        i0Var.b(eVar.e);
    }

    public final void d(int i3) {
        long j10 = this.j;
        long j11 = this.l;
        s sVar = this.c;
        long j12 = sVar.b;
        String str = n0.a;
        long a02 = j10 + n0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
        int i10 = i3 * 2 * sVar.a;
        this.b.d(a02, 1, i10, this.k - i10, null);
        this.l += i3;
        this.k -= i10;
    }
}
