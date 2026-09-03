package f5;

import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import s8.i0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class w {
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

    public w() {
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
        this.o = xVar.B;
        this.p = xVar.C;
        this.q = xVar.D;
        this.r = xVar.E;
        this.s = xVar.F;
        this.t = xVar.G;
        this.u = xVar.H;
        this.v = xVar.I;
        this.w = xVar.J;
        this.x = xVar.K;
        this.z = new HashSet(xVar.M);
        this.y = new HashMap(xVar.L);
    }

    public w b(int i10, int i11) {
        this.i = i10;
        this.j = i11;
        this.k = true;
        return this;
    }
}
