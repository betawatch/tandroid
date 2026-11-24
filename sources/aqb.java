// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class aqb {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object p = new Object();
    public static final bt6 q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object a = p;
    public bt6 b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public ws6 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        ps6 ps6Var = new ps6();
        ps6Var.a = "androidx.media3.common.Timeline";
        ps6Var.b = Uri.EMPTY;
        q = ps6Var.a();
        r = "1";
        s = "2";
        t = "3";
        u = "4";
        v = "5";
        w = "6";
        x = "7";
        y = "8";
        z = "9";
        A = "a";
        B = "b";
        C = "c";
        D = "d";
        E = "e";
    }

    public final boolean a() {
        return this.i != null;
    }

    public final void b(Object obj, bt6 bt6Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, ws6 ws6Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        if (bt6Var == null) {
            bt6Var = q;
        }
        this.b = bt6Var;
        this.c = obj2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z2;
        this.h = z3;
        this.i = ws6Var;
        this.k = j4;
        this.l = j5;
        this.m = i;
        this.n = i2;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !aqb.class.equals(obj.getClass())) {
            return false;
        }
        aqb aqbVar = (aqb) obj;
        return Objects.equals(this.a, aqbVar.a) && Objects.equals(this.b, aqbVar.b) && Objects.equals(this.c, aqbVar.c) && Objects.equals(this.i, aqbVar.i) && this.d == aqbVar.d && this.e == aqbVar.e && this.f == aqbVar.f && this.g == aqbVar.g && this.h == aqbVar.h && this.j == aqbVar.j && this.k == aqbVar.k && this.l == aqbVar.l && this.m == aqbVar.m && this.n == aqbVar.n && this.o == aqbVar.o;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.a.hashCode() + nm7.t3) * 31)) * 31;
        Object obj = this.c;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        ws6 ws6Var = this.i;
        int hashCode3 = (hashCode2 + (ws6Var != null ? ws6Var.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
