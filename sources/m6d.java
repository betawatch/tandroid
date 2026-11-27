// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class m6d {
    public final ho a;
    public final a94 b;

    public /* synthetic */ m6d(ho hoVar, a94 a94Var) {
        this.a = hoVar;
        this.b = a94Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m6d)) {
            return false;
        }
        m6d m6dVar = (m6d) obj;
        return vue.a(this.a, m6dVar.a) && vue.a(this.b, m6dVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        um4 um4Var = new um4(this);
        um4Var.a(this.a, "key");
        um4Var.a(this.b, "feature");
        return um4Var.toString();
    }
}
