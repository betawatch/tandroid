package g2;

import d2.k1;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e = new k1();
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public f0(k2.i0 i0Var, k2.c0 c0Var, h0 h0Var, int i3, int i10, int i11, int i12) {
        this.a = i0Var;
        this.c = c0Var;
        this.d = h0Var;
        this.f = h0Var.a(i0Var.t, new o(this, 1));
        this.g = new b0(this, i3);
        this.h = new c0(this, i10);
        this.i = new d0(this, i11);
        this.j = new e0(this, i12);
        a0 a0Var = new a0(this, 0);
        this.b = a0Var;
        i0Var.m.a(a0Var);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public n5.h b() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((n5.l) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = t4.c.q(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = t4.c.q(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = t4.c.q(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new n5.h((String) this.a, (Integer) this.b, (n5.l) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f, (Integer) this.g, (String) this.h, (byte[]) this.i, (byte[]) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
