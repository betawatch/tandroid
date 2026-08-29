package d5;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import q8.l0;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class w {
    public int e;
    public int f;
    public int g;
    public int h;
    public z l;
    public int m;
    public z n;
    public int o;
    public int p;
    public int q;
    public z r;
    public z s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public HashMap y;
    public HashSet z;
    public int a = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int b = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int c = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int d = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int j = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public boolean k = true;

    public w() {
        q8.x xVar = z.b;
        l0 l0Var = l0.e;
        this.l = l0Var;
        this.m = 0;
        this.n = l0Var;
        this.o = 0;
        this.p = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.q = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.r = l0Var;
        this.s = l0Var;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = new HashMap();
        this.z = new HashSet();
    }

    public final void a(x xVar) {
        this.a = xVar.a;
        this.b = xVar.b;
        this.c = xVar.c;
        this.d = xVar.d;
        this.e = xVar.e;
        this.f = xVar.f;
        this.g = xVar.h;
        this.h = xVar.n;
        this.i = xVar.r;
        this.j = xVar.s;
        this.k = xVar.v;
        this.l = xVar.w;
        this.m = xVar.x;
        this.n = xVar.y;
        this.o = xVar.A;
        this.p = xVar.B;
        this.q = xVar.C;
        this.r = xVar.D;
        this.s = xVar.E;
        this.t = xVar.F;
        this.u = xVar.G;
        this.v = xVar.H;
        this.w = xVar.I;
        this.x = xVar.J;
        this.z = new HashSet(xVar.L);
        this.y = new HashMap(xVar.K);
    }

    public w b(int i10, int i11) {
        this.i = i10;
        this.j = i11;
        this.k = true;
        return this;
    }
}
