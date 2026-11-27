// default package

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        hashSet.add(i09.a(cls));
        for (Class cls2 : clsArr) {
            bwe.a(cls2, "Null interface");
            this.b.add(i09.a(cls2));
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

    public eq2(i09 i09Var, i09... i09VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(i09Var);
        for (i09 i09Var2 : i09VarArr) {
            bwe.a(i09Var2, "Null interface");
        }
        Collections.addAll(this.b, i09VarArr);
    }
}
