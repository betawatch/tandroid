package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
    public g20 s;
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
        g20 g20Var = this.s;
        if (g20Var != null && (g20Var.t || g20Var.a > 0 || g20Var.b > 0)) {
            return true;
        }
        xe xeVar = this.A;
        return ((xeVar == null || xeVar.b()) && this.o == null && this.j == null && ((arrayList = this.p) == null || arrayList.isEmpty()) && this.g == null) ? false : true;
    }

    public final boolean c() {
        Boolean bool = this.z;
        return bool == null ? gz.h1 : bool.booleanValue();
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
