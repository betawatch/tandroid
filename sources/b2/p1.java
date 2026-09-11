package b2;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class p1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int e;
    public int f;
    public int g;
    public int h;
    public e9.i0 m;
    public e9.i0 n;
    public int o;
    public e9.i0 p;
    public int q;
    public int r;
    public int s;
    public e9.i0 t;
    public o1 u;
    public e9.i0 v;
    public int w;
    public boolean x;
    public int y;
    public boolean z;
    public int a = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int c = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int d = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int j = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public boolean k = true;
    public boolean l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.b;
        e9.a1 a1Var = e9.a1.e;
        this.m = a1Var;
        this.n = a1Var;
        this.o = 0;
        this.p = a1Var;
        this.q = 0;
        this.r = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.s = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.t = a1Var;
        this.u = o1.d;
        this.v = a1Var;
        this.w = 0;
        this.x = true;
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = new HashMap();
        this.E = new HashSet();
    }

    public static e9.a1 e(String[] strArr) {
        e9.f0 u10 = e9.i0.u();
        for (String str : strArr) {
            str.getClass();
            u10.b(e2.d0.R(str));
        }
        return u10.i();
    }

    public void a(m1 m1Var) {
        this.D.put(m1Var.a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
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
        this.m = q1Var.m;
        this.n = q1Var.n;
        this.o = q1Var.o;
        this.p = q1Var.p;
        this.q = q1Var.q;
        this.r = q1Var.r;
        this.s = q1Var.s;
        this.t = q1Var.t;
        this.u = q1Var.u;
        this.v = q1Var.v;
        this.w = q1Var.w;
        this.x = q1Var.x;
        this.y = q1Var.y;
        this.z = q1Var.z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
