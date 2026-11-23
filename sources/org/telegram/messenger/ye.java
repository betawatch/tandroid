package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class ye {
    public xe A;
    public CharSequence a;
    public boolean b;
    public String c;
    public long d;
    public TLRPC.Photo e;
    public gj f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public long m;
    public ArrayList n;
    public gf o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public f20 s;
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
        f20 f20Var = this.s;
        if (f20Var != null && (f20Var.t || f20Var.a > 0 || f20Var.b > 0)) {
            return true;
        }
        xe xeVar = this.A;
        return ((xeVar == null || xeVar.b()) && this.o == null && this.j == null && ((arrayList = this.p) == null || arrayList.isEmpty()) && this.g == null) ? false : true;
    }

    public final boolean c() {
        Boolean bool = this.z;
        return bool == null ? cz.h1 : bool.booleanValue();
    }

    public boolean d() {
        return (this instanceof ff) && ((ff) this).d();
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
