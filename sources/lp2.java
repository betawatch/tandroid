// default package

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lp2 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public byte d;
    public boolean e;
    public aq2 f;
    public final HashSet g;

    public lp2(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(xw8.a(cls));
        for (Class cls2 : clsArr) {
            hre.a(cls2, "Null interface");
            this.b.add(xw8.a(cls2));
        }
    }

    public final void a(wd3 wd3Var) {
        if (this.b.contains(wd3Var.a)) {
            w26.j("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(wd3Var);
        }
    }

    public final mp2 b() {
        if (!(this.f != null)) {
            sc8.j("Missing required property: factory.");
            return null;
        }
        return new mp2(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e ? 1 : 0, this.f, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i) {
        if (this.d == 0) {
            this.d = i;
        } else {
            sc8.j("Instantiation type has already been set.");
        }
    }

    public lp2(xw8 xw8Var, xw8... xw8VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(xw8Var);
        for (xw8 xw8Var2 : xw8VarArr) {
            hre.a(xw8Var2, "Null interface");
        }
        Collections.addAll(this.b, xw8VarArr);
    }
}
