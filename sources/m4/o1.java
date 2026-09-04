package m4;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class o1 {
    public static final b2.a1 k;
    public static final o1 l;
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
    public final b2.a1 a;
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
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = a1Var;
        l = new o1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.a;
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

    public o1(b2.a1 a1Var, boolean z10, long j3, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        e2.d.b(z10 == (a1Var.h != -1));
        this.a = a1Var;
        this.b = z10;
        this.c = j3;
        this.d = j10;
        this.e = j11;
        this.f = i10;
        this.g = j12;
        this.h = j13;
        this.i = j14;
        this.j = j15;
    }

    public final o1 a(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new o1(this.a.b(z10, z11), z10 && this.b, this.c, z10 ? this.d : -9223372036854775807L, z10 ? this.e : 0L, z10 ? this.f : 0, z10 ? this.g : 0L, z10 ? this.h : -9223372036854775807L, z10 ? this.i : -9223372036854775807L, z10 ? this.j : 0L);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.a;
        if (i10 < 3 || !k.a(a1Var)) {
            bundle.putBundle(m, a1Var.c(i10));
        }
        boolean z10 = this.b;
        if (z10) {
            bundle.putBoolean(n, z10);
        }
        long j3 = this.c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(p, j10);
        }
        long j11 = this.e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(q, j11);
        }
        int i11 = this.f;
        if (i11 != 0) {
            bundle.putInt(r, i11);
        }
        long j12 = this.g;
        if (j12 != 0) {
            bundle.putLong(s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(t, j13);
        }
        long j14 = this.i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(u, j14);
        }
        long j15 = this.j;
        if (i10 >= 3 && j15 == 0) {
            return bundle;
        }
        bundle.putLong(v, j15);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.c == o1Var.c && this.a.equals(o1Var.a) && this.b == o1Var.b && this.d == o1Var.d && this.e == o1Var.e && this.f == o1Var.f && this.g == o1Var.g && this.h == o1Var.h && this.i == o1Var.i && this.j == o1Var.j) {
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
        b2.a1 a1Var = this.a;
        sb2.append(a1Var.b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.i);
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
        return a4.a.r(sb2, this.j, "}");
    }
}
