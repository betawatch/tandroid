package g2;

import android.net.Uri;
import b2.r0;
import b2.s0;
import c3.h0;
import java.math.RoundingMode;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class l implements k4.b {
    public int a;
    public long b;
    public int c;
    public long d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public l(c3.q qVar, h0 h0Var, e2.q qVar2, String str, int i10) {
        this.e = qVar;
        this.f = h0Var;
        this.g = qVar2;
        int i11 = qVar2.a;
        int i12 = qVar2.b;
        int i13 = (qVar2.d * i11) / 8;
        int i14 = qVar2.c;
        if (i14 != i13) {
            throw s0.a(null, "Expected block size: " + i13 + "; got: " + i14);
        }
        int i15 = i12 * i13;
        int i16 = i15 * 8;
        int max = Math.max(i13, i15 / 10);
        this.a = max;
        b2.r rVar = new b2.r();
        rVar.p = r0.n("audio/wav");
        rVar.q = r0.n(str);
        rVar.h = i16;
        rVar.i = i16;
        rVar.r = max;
        rVar.I = i11;
        rVar.J = i12;
        rVar.K = i10;
        this.h = new b2.s(rVar);
    }

    @Override // k4.b
    public void a(long j3) {
        this.b = j3;
        this.c = 0;
        this.d = 0L;
    }

    @Override // k4.b
    public boolean b(c3.p pVar, long j3) {
        int i10;
        int i11;
        long j10 = j3;
        while (j10 > 0 && (i10 = this.c) < (i11 = this.a)) {
            int a2 = ((h0) this.f).a(pVar, (int) Math.min(i11 - i10, j10), true);
            if (a2 == -1) {
                j10 = 0;
            } else {
                this.c += a2;
                j10 -= a2;
            }
        }
        e2.q qVar = (e2.q) this.g;
        int i12 = qVar.c;
        int i13 = this.c / i12;
        if (i13 > 0) {
            long j11 = this.b;
            long j12 = this.d;
            long j13 = qVar.b;
            String str = e2.d0.a;
            long Y = j11 + e2.d0.Y(j12, 1000000L, j13, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.c - i14;
            ((h0) this.f).c(Y, 1, i14, i15, null);
            this.d += i13;
            this.c = i15;
        }
        return j10 <= 0;
    }

    @Override // k4.b
    public void c(int i10, long j3) {
        ((c3.q) this.e).P1(new k4.f((e2.q) this.g, 1, i10, j3));
        ((h0) this.f).b((b2.s) this.h);
    }

    public m d() {
        e2.d.i((Uri) this.e, "The uri must be set.");
        return new m((Uri) this.e, this.a, (byte[]) this.f, (Map) this.g, this.b, this.d, (String) this.h, this.c);
    }
}
