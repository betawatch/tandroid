package b5;

import java.util.HashMap;
import java.util.HashSet;
import o8.l0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class y {
    public int e;
    public int f;
    public int g;
    public int h;
    public o8.z l;
    public int m;
    public o8.z n;
    public int o;
    public int p;
    public int q;
    public o8.z r;
    public o8.z s;
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

    public y() {
        o8.x xVar = o8.z.b;
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

    public final void a(z zVar) {
        this.a = zVar.a;
        this.b = zVar.b;
        this.c = zVar.c;
        this.d = zVar.d;
        this.e = zVar.e;
        this.f = zVar.f;
        this.g = zVar.h;
        this.h = zVar.n;
        this.i = zVar.r;
        this.j = zVar.s;
        this.k = zVar.v;
        this.l = zVar.w;
        this.m = zVar.x;
        this.n = zVar.y;
        this.o = zVar.A;
        this.p = zVar.B;
        this.q = zVar.C;
        this.r = zVar.D;
        this.s = zVar.E;
        this.t = zVar.F;
        this.u = zVar.G;
        this.v = zVar.H;
        this.w = zVar.I;
        this.x = zVar.J;
        this.z = new HashSet(zVar.L);
        this.y = new HashMap(zVar.K);
    }

    public y b(int i9, int i10) {
        this.i = i9;
        this.j = i10;
        this.k = true;
        return this;
    }
}
