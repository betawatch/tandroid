// default package

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class eq2 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public byte d;
    public boolean e;
    public tq2 f;
    public final HashSet g;

    public eq2(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(h09.a(cls));
        for (Class cls2 : clsArr) {
            bwe.a(cls2, "Null interface");
            this.b.add(h09.a(cls2));
        }
    }

    public final void a(qe3 qe3Var) {
        if (this.b.contains(qe3Var.a)) {
            lq5.j("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(qe3Var);
        }
    }

    public final fq2 b() {
        if (!(this.f != null)) {
            grb.i("Missing required property: factory.");
            return null;
        }
        return new fq2(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e ? 1 : 0, this.f, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i) {
        if (this.d == 0) {
            this.d = i;
        } else {
            grb.i("Instantiation type has already been set.");
        }
    }

    public eq2(h09 h09Var, h09... h09VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(h09Var);
        for (h09 h09Var2 : h09VarArr) {
            bwe.a(h09Var2, "Null interface");
        }
        Collections.addAll(this.b, h09VarArr);
    }
}
