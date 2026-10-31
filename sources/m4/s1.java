package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s1 {
    public static final b2.e1 k;
    public static final s1 l;
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
    public final b2.e1 a;
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
        b2.e1 e1Var = new b2.e1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = e1Var;
        l = new s1(e1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.l0.a;
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

    public s1(b2.e1 e1Var, boolean z10, long j10, long j11, long j12, int i10, long j13, long j14, long j15, long j16) {
        t6.f(z10 == (e1Var.h != -1));
        this.a = e1Var;
        this.b = z10;
        this.c = j10;
        this.d = j11;
        this.e = j12;
        this.f = i10;
        this.g = j13;
        this.h = j14;
        this.i = j15;
        this.j = j16;
    }

    public final s1 a(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new s1(this.a.b(z10, z11), z10 && this.b, this.c, z10 ? this.d : -9223372036854775807L, z10 ? this.e : 0L, z10 ? this.f : 0, z10 ? this.g : 0L, z10 ? this.h : -9223372036854775807L, z10 ? this.i : -9223372036854775807L, z10 ? this.j : 0L);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.e1 e1Var = this.a;
        if (i10 < 3 || !k.a(e1Var)) {
            bundle.putBundle(m, e1Var.c(i10));
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
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(q, j12);
        }
        int i11 = this.f;
        if (i11 != 0) {
            bundle.putInt(r, i11);
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
        if (i10 >= 3 && j16 == 0) {
            return bundle;
        }
        bundle.putLong(v, j16);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.c == s1Var.c && this.a.equals(s1Var.a) && this.b == s1Var.b && this.d == s1Var.d && this.e == s1Var.e && this.f == s1Var.f && this.g == s1Var.g && this.h == s1Var.h && this.i == s1Var.i && this.j == s1Var.j) {
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
        b2.e1 e1Var = this.a;
        sb2.append(e1Var.b);
        sb2.append(", periodIndex=");
        sb2.append(e1Var.e);
        sb2.append(", positionMs=");
        sb2.append(e1Var.f);
        sb2.append(", contentPositionMs=");
        sb2.append(e1Var.g);
        sb2.append(", adGroupIndex=");
        sb2.append(e1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(e1Var.i);
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
        return a1.g.q(sb2, this.j, "}");
    }
}
