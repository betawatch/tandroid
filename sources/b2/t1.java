package b2;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class t1 {
    public boolean A;
    public f9.i0 B;
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
    public f9.i0 m;
    public f9.i0 n;
    public f9.i0 o;
    public int p;
    public f9.i0 q;
    public f9.i0 r;
    public int s;
    public int t;
    public int u;
    public f9.i0 v;
    public s1 w;
    public boolean x;
    public f9.i0 y;
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
        f9.g0 g0Var = f9.i0.b;
        f9.s1 s1Var = f9.s1.e;
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
        this.w = s1.d;
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

    public static f9.s1 e(String[] strArr) {
        f9.f0 t10 = f9.i0.t();
        for (String str : strArr) {
            str.getClass();
            t10.c(e2.n0.T(str));
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
