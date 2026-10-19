package b2;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class s1 {
    public boolean A;
    public e9.n0 B;
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
    public e9.n0 m;
    public e9.n0 n;
    public e9.n0 o;
    public int p;
    public e9.n0 q;
    public e9.n0 r;
    public int s;
    public int t;
    public int u;
    public e9.n0 v;
    public r1 w;
    public boolean x;
    public e9.n0 y;
    public int z;
    public int a = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int c = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int d = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int j = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public boolean k = true;
    public boolean l = true;

    public s1() {
        e9.l0 l0Var = e9.n0.b;
        e9.x1 x1Var = e9.x1.e;
        this.m = x1Var;
        this.n = x1Var;
        this.o = x1Var;
        this.p = 0;
        this.q = x1Var;
        this.r = x1Var;
        this.s = 0;
        this.t = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.u = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.v = x1Var;
        this.w = r1.d;
        this.x = false;
        this.y = x1Var;
        this.z = 0;
        this.A = true;
        this.B = x1Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static e9.x1 e(String[] strArr) {
        e9.k0 t10 = e9.n0.t();
        for (String str : strArr) {
            str.getClass();
            t10.c(e2.m0.T(str));
        }
        return t10.f();
    }

    public void a(q1 q1Var) {
        this.H.put(q1Var.a, q1Var);
    }

    public t1 b() {
        return new t1(this);
    }

    public s1 c() {
        this.H.clear();
        return this;
    }

    public final void d(t1 t1Var) {
        this.a = t1Var.a;
        this.b = t1Var.b;
        this.c = t1Var.c;
        this.d = t1Var.d;
        this.e = t1Var.e;
        this.f = t1Var.f;
        this.g = t1Var.g;
        this.h = t1Var.h;
        this.i = t1Var.i;
        this.j = t1Var.j;
        this.k = t1Var.k;
        this.l = t1Var.l;
        this.n = t1Var.n;
        this.m = t1Var.m;
        this.o = t1Var.o;
        this.p = t1Var.p;
        this.q = t1Var.q;
        this.s = t1Var.s;
        this.r = t1Var.r;
        this.t = t1Var.t;
        this.u = t1Var.u;
        this.v = t1Var.v;
        this.w = t1Var.w;
        this.x = t1Var.x;
        this.y = t1Var.y;
        this.z = t1Var.A;
        this.A = t1Var.B;
        this.B = t1Var.z;
        this.C = t1Var.C;
        this.D = t1Var.D;
        this.E = t1Var.E;
        this.F = t1Var.F;
        this.G = t1Var.G;
        this.I = new HashSet(t1Var.I);
        this.H = new HashMap(t1Var.H);
    }
}
