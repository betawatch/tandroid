package f5;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import s8.i0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class v {
    public int e;
    public int f;
    public int g;
    public int h;
    public s8.v l;
    public int m;
    public s8.v n;
    public int o;
    public int p;
    public int q;
    public s8.v r;
    public s8.v s;
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

    public v() {
        s8.t tVar = s8.v.b;
        i0 i0Var = i0.e;
        this.l = i0Var;
        this.m = 0;
        this.n = i0Var;
        this.o = 0;
        this.p = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.q = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.r = i0Var;
        this.s = i0Var;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = new HashMap();
        this.z = new HashSet();
    }

    public final void a(w wVar) {
        this.a = wVar.a;
        this.b = wVar.b;
        this.c = wVar.c;
        this.d = wVar.d;
        this.e = wVar.e;
        this.f = wVar.f;
        this.g = wVar.h;
        this.h = wVar.n;
        this.i = wVar.r;
        this.j = wVar.s;
        this.k = wVar.v;
        this.l = wVar.w;
        this.m = wVar.x;
        this.n = wVar.y;
        this.o = wVar.B;
        this.p = wVar.C;
        this.q = wVar.D;
        this.r = wVar.E;
        this.s = wVar.F;
        this.t = wVar.G;
        this.u = wVar.H;
        this.v = wVar.I;
        this.w = wVar.J;
        this.x = wVar.K;
        this.z = new HashSet(wVar.M);
        this.y = new HashMap(wVar.L);
    }

    public v b(int i10, int i11) {
        this.i = i10;
        this.j = i11;
        this.k = true;
        return this;
    }
}
