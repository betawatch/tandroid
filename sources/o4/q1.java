package o4;

import android.os.Bundle;
import b8.zb;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q1 {
    public static final d2.d1 k;
    public static final q1 l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final d2.d1 a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        d2.d1 d1Var = new d2.d1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = d1Var;
        l = new q1(d1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = g2.n0.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public q1(d2.d1 d1Var, boolean z10, long j10, long j11, long j12, int i3, long j13, long j14, long j15, long j16) {
        zb.f(z10 == (d1Var.h != -1));
        this.a = d1Var;
        this.b = z10;
        this.c = j10;
        this.d = j11;
        this.e = j12;
        this.f = i3;
        this.g = j13;
        this.h = j14;
        this.i = j15;
        this.j = j16;
    }

    public final q1 a(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new q1(this.a.b(z10, z11), z10 && this.b, this.c, z10 ? this.d : -9223372036854775807L, z10 ? this.e : 0L, z10 ? this.f : 0, z10 ? this.g : 0L, z10 ? this.h : -9223372036854775807L, z10 ? this.i : -9223372036854775807L, z10 ? this.j : 0L);
    }

    public final Bundle b(int i3) {
        Bundle bundle = new Bundle();
        d2.d1 d1Var = this.a;
        if (i3 < 3 || !k.a(d1Var)) {
            bundle.putBundle(m, d1Var.c(i3));
        }
        boolean z10 = this.b;
        if (z10) {
            bundle.putBoolean(n, z10);
        }
        long j10 = this.c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(p, j11);
        }
        long j12 = this.e;
        if (i3 < 3 || j12 != 0) {
            bundle.putLong(q, j12);
        }
        int i10 = this.f;
        if (i10 != 0) {
            bundle.putInt(r, i10);
        }
        long j13 = this.g;
        if (j13 != 0) {
            bundle.putLong(s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(t, j14);
        }
        long j15 = this.i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(u, j15);
        }
        long j16 = this.j;
        if (i3 >= 3 && j16 == 0) {
            return bundle;
        }
        bundle.putLong(v, j16);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.c == q1Var.c && this.a.equals(q1Var.a) && this.b == q1Var.b && this.d == q1Var.d && this.e == q1Var.e && this.f == q1Var.f && this.g == q1Var.g && this.h == q1Var.h && this.i == q1Var.i && this.j == q1Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        d2.d1 d1Var = this.a;
        sb2.append(d1Var.b);
        sb2.append(", periodIndex=");
        sb2.append(d1Var.e);
        sb2.append(", positionMs=");
        sb2.append(d1Var.f);
        sb2.append(", contentPositionMs=");
        sb2.append(d1Var.g);
        sb2.append(", adGroupIndex=");
        sb2.append(d1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(d1Var.i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.r(sb2, this.j, "}");
    }
}
