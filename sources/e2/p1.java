package e2;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class p1 {
    public boolean A;
    public h9.i0 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int e;
    public int f;
    public int g;
    public int h;
    public h9.i0 m;
    public h9.i0 n;
    public h9.i0 o;
    public int p;
    public h9.i0 q;
    public h9.i0 r;
    public int s;
    public int t;
    public int u;
    public h9.i0 v;
    public o1 w;
    public boolean x;
    public h9.i0 y;
    public int z;
    public int a = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int c = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int d = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int j = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public boolean k = true;
    public boolean l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.b;
        h9.t1 t1Var = h9.t1.e;
        this.m = t1Var;
        this.n = t1Var;
        this.o = t1Var;
        this.p = 0;
        this.q = t1Var;
        this.r = t1Var;
        this.s = 0;
        this.t = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.u = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.v = t1Var;
        this.w = o1.d;
        this.x = false;
        this.y = t1Var;
        this.z = 0;
        this.A = true;
        this.B = t1Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static h9.t1 e(String[] strArr) {
        h9.f0 p10 = h9.i0.p();
        for (String str : strArr) {
            str.getClass();
            p10.c(h2.m0.T(str));
        }
        return p10.f();
    }

    public void a(n1 n1Var) {
        this.H.put(n1Var.a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.a = q1Var.a;
        this.b = q1Var.b;
        this.c = q1Var.c;
        this.d = q1Var.d;
        this.e = q1Var.e;
        this.f = q1Var.f;
        this.g = q1Var.g;
        this.h = q1Var.h;
        this.i = q1Var.i;
        this.j = q1Var.j;
        this.k = q1Var.k;
        this.l = q1Var.l;
        this.n = q1Var.n;
        this.m = q1Var.m;
        this.o = q1Var.o;
        this.p = q1Var.p;
        this.q = q1Var.q;
        this.s = q1Var.s;
        this.r = q1Var.r;
        this.t = q1Var.t;
        this.u = q1Var.u;
        this.v = q1Var.v;
        this.w = q1Var.w;
        this.x = q1Var.x;
        this.y = q1Var.y;
        this.z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
