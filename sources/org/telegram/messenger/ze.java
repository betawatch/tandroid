package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class ze {
    public ye A;
    public CharSequence a;
    public boolean b;
    public String c;
    public long d;
    public TLRPC.Photo e;
    public jj f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public long m;
    public ArrayList n;
    public ff o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public x20 s;
    public long t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public long y;
    public Boolean z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.b) {
            return false;
        }
        x20 x20Var = this.s;
        if (x20Var != null && (x20Var.t || x20Var.a > 0 || x20Var.b > 0)) {
            return true;
        }
        ye yeVar = this.A;
        return ((yeVar == null || yeVar.b()) && this.o == null && this.j == null && ((arrayList = this.p) == null || arrayList.isEmpty()) && this.g == null) ? false : true;
    }

    public final boolean c() {
        Boolean bool = this.z;
        return bool == null ? tz.h1 : bool.booleanValue();
    }

    public boolean d() {
        return (this instanceof ef) && ((ef) this).d();
    }

    public void e() {
        this.a = null;
        this.g = null;
        this.e = null;
        this.f = null;
        this.c = null;
        this.i = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.k = null;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 0;
        this.p = null;
        this.s = null;
        this.n = null;
        this.o = null;
        this.r = null;
        this.A = null;
        this.z = null;
    }
}
