package h2;

import e2.i1;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e = new i1();
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public e0(l2.g0 g0Var, l2.a0 a0Var, g0 g0Var2, int i7, int i10, int i11, int i12) {
        this.a = g0Var;
        this.c = a0Var;
        this.d = g0Var2;
        this.f = g0Var2.a(g0Var.t, new n(this, 1));
        this.g = new a0(this, i7);
        this.h = new b0(this, i10);
        this.i = new c0(this, i11);
        this.j = new d0(this, i12);
        z zVar = new z(this, 0);
        this.b = zVar;
        g0Var.m.a(zVar);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public o5.h b() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((o5.m) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = p5.c.v(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = p5.c.v(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = p5.c.v(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new o5.h((String) this.a, (Integer) this.b, (o5.m) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f, (Integer) this.g, (String) this.h, (byte[]) this.i, (byte[]) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
