package b2;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class t1 {
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
    public s1 w;
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

    public t1() {
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
        this.w = s1.d;
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

    public void a(r1 r1Var) {
        this.H.put(r1Var.a, r1Var);
    }

    public u1 b() {
        return new u1(this);
    }

    public t1 c() {
        this.H.clear();
        return this;
    }

    public final void d(u1 u1Var) {
        this.a = u1Var.a;
        this.b = u1Var.b;
        this.c = u1Var.c;
        this.d = u1Var.d;
        this.e = u1Var.e;
        this.f = u1Var.f;
        this.g = u1Var.g;
        this.h = u1Var.h;
        this.i = u1Var.i;
        this.j = u1Var.j;
        this.k = u1Var.k;
        this.l = u1Var.l;
        this.n = u1Var.n;
        this.m = u1Var.m;
        this.o = u1Var.o;
        this.p = u1Var.p;
        this.q = u1Var.q;
        this.s = u1Var.s;
        this.r = u1Var.r;
        this.t = u1Var.t;
        this.u = u1Var.u;
        this.v = u1Var.v;
        this.w = u1Var.w;
        this.x = u1Var.x;
        this.y = u1Var.y;
        this.z = u1Var.A;
        this.A = u1Var.B;
        this.B = u1Var.z;
        this.C = u1Var.C;
        this.D = u1Var.D;
        this.E = u1Var.E;
        this.F = u1Var.F;
        this.G = u1Var.G;
        this.I = new HashSet(u1Var.I);
        this.H = new HashMap(u1Var.H);
    }
}
