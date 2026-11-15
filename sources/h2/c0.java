package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class c0 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ e0 g;

    public c0(e0 e0Var, int i7) {
        this.g = e0Var;
        this.a = i7;
    }

    public final void a() {
        long duration;
        e0 e0Var = this.g;
        i1 i1Var = (i1) e0Var.e;
        i0 i0Var = (i0) e0Var.f;
        l2.f0 f0Var = (l2.f0) e0Var.a;
        l1 y02 = f0Var.y0();
        Object l10 = y02.p() ? null : y02.l(f0Var.B());
        int n02 = f0Var.n0();
        int O = f0Var.O();
        long l11 = f0Var.l();
        if (l10 == null || n02 != -1) {
            duration = n02 != -1 ? f0Var.getDuration() : -9223372036854775807L;
        } else {
            y02.g(l10, i1Var);
            l11 -= l0.h0(i1Var.e);
            duration = l0.h0(i1Var.d);
        }
        boolean h = f0Var.h();
        if (!h || duration == -9223372036854775807L || l11 < duration) {
            i0Var.e(3);
            if (h && duration != -9223372036854775807L) {
                i0Var.a.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - l11) / f0Var.j().a));
            }
            this.e = false;
            return;
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.e;
        int i7 = this.a;
        if (z10 && Objects.equals(l10, this.b) && n02 == this.c && O == this.d) {
            if (elapsedRealtime - this.f >= i7) {
                ((l2.z) e0Var.c).a.A1(new l2.l(2, new f0(3, i7), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = elapsedRealtime;
        this.b = l10;
        this.c = n02;
        this.d = O;
        i0Var.e(3);
        i0Var.a.sendEmptyMessageDelayed(3, i7);
    }
}
