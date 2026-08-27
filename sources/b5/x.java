package b5;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import p8.l0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class x {
    public int e;
    public int f;
    public int g;
    public int h;
    public p8.z l;
    public int m;
    public p8.z n;
    public int o;
    public int p;
    public int q;
    public p8.z r;
    public p8.z s;
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

    public x() {
        p8.x xVar = p8.z.b;
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

    public final void a(y yVar) {
        this.a = yVar.a;
        this.b = yVar.b;
        this.c = yVar.c;
        this.d = yVar.d;
        this.e = yVar.e;
        this.f = yVar.f;
        this.g = yVar.h;
        this.h = yVar.n;
        this.i = yVar.r;
        this.j = yVar.s;
        this.k = yVar.v;
        this.l = yVar.w;
        this.m = yVar.x;
        this.n = yVar.y;
        this.o = yVar.A;
        this.p = yVar.B;
        this.q = yVar.C;
        this.r = yVar.D;
        this.s = yVar.E;
        this.t = yVar.F;
        this.u = yVar.G;
        this.v = yVar.H;
        this.w = yVar.I;
        this.x = yVar.J;
        this.z = new HashSet(yVar.L);
        this.y = new HashMap(yVar.K);
    }

    public x b(int i10, int i11) {
        this.i = i10;
        this.j = i11;
        this.k = true;
        return this;
    }
}
