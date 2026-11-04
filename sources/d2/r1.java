package d2;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class r1 {
    public boolean A;
    public g9.i0 B;
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
    public g9.i0 m;
    public g9.i0 n;
    public g9.i0 o;
    public int p;
    public g9.i0 q;
    public g9.i0 r;
    public int s;
    public int t;
    public int u;
    public g9.i0 v;
    public q1 w;
    public boolean x;
    public g9.i0 y;
    public int z;
    public int a = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int c = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int d = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int j = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public boolean k = true;
    public boolean l = true;

    public r1() {
        g9.g0 g0Var = g9.i0.b;
        g9.s1 s1Var = g9.s1.e;
        this.m = s1Var;
        this.n = s1Var;
        this.o = s1Var;
        this.p = 0;
        this.q = s1Var;
        this.r = s1Var;
        this.s = 0;
        this.t = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.u = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.v = s1Var;
        this.w = q1.d;
        this.x = false;
        this.y = s1Var;
        this.z = 0;
        this.A = true;
        this.B = s1Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static g9.s1 e(String[] strArr) {
        g9.f0 p10 = g9.i0.p();
        for (String str : strArr) {
            str.getClass();
            p10.c(g2.n0.T(str));
        }
        return p10.f();
    }

    public void a(p1 p1Var) {
        this.H.put(p1Var.a, p1Var);
    }

    public s1 b() {
        return new s1(this);
    }

    public r1 c() {
        this.H.clear();
        return this;
    }

    public final void d(s1 s1Var) {
        this.a = s1Var.a;
        this.b = s1Var.b;
        this.c = s1Var.c;
        this.d = s1Var.d;
        this.e = s1Var.e;
        this.f = s1Var.f;
        this.g = s1Var.g;
        this.h = s1Var.h;
        this.i = s1Var.i;
        this.j = s1Var.j;
        this.k = s1Var.k;
        this.l = s1Var.l;
        this.n = s1Var.n;
        this.m = s1Var.m;
        this.o = s1Var.o;
        this.p = s1Var.p;
        this.q = s1Var.q;
        this.s = s1Var.s;
        this.r = s1Var.r;
        this.t = s1Var.t;
        this.u = s1Var.u;
        this.v = s1Var.v;
        this.w = s1Var.w;
        this.x = s1Var.x;
        this.y = s1Var.y;
        this.z = s1Var.A;
        this.A = s1Var.B;
        this.B = s1Var.z;
        this.C = s1Var.C;
        this.D = s1Var.D;
        this.E = s1Var.E;
        this.F = s1Var.F;
        this.G = s1Var.G;
        this.I = new HashSet(s1Var.I);
        this.H = new HashMap(s1Var.H);
    }
}
