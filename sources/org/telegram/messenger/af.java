package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class af {
    public ze A;
    public CharSequence a;
    public boolean b;
    public String c;
    public long d;
    public TLRPC.Photo e;
    public kj f;
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
    public y20 s;
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
        y20 y20Var = this.s;
        if (y20Var != null && (y20Var.t || y20Var.a > 0 || y20Var.b > 0)) {
            return true;
        }
        ze zeVar = this.A;
        return ((zeVar == null || zeVar.b()) && this.o == null && this.j == null && ((arrayList = this.p) == null || arrayList.isEmpty()) && this.g == null) ? false : true;
    }

    public final boolean c() {
        Boolean bool = this.z;
        return bool == null ? uz.h1 : bool.booleanValue();
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
