// default package

import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class em2 implements sw2, Serializable {
    public final sw2 a;
    public final qw2 b;

    public em2(qw2 qw2Var, sw2 sw2Var) {
        sw2Var.getClass();
        this.a = sw2Var;
        this.b = qw2Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof em2) {
            em2 em2Var = (em2) obj;
            int i = 2;
            em2 em2Var2 = em2Var;
            int i2 = 2;
            while (true) {
                sw2 sw2Var = em2Var2.a;
                em2Var2 = sw2Var instanceof em2 ? (em2) sw2Var : null;
                if (em2Var2 == null) {
                    break;
                }
                i2++;
            }
            em2 em2Var3 = this;
            while (true) {
                sw2 sw2Var2 = em2Var3.a;
                em2Var3 = sw2Var2 instanceof em2 ? (em2) sw2Var2 : null;
                if (em2Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    qw2 qw2Var = this.b;
                    if (!rp5.a(em2Var.get(qw2Var.getKey()), qw2Var)) {
                        z = false;
                        break;
                    }
                    sw2 sw2Var3 = this.a;
                    if (!(sw2Var3 instanceof em2)) {
                        sw2Var3.getClass();
                        qw2 qw2Var2 = (qw2) sw2Var3;
                        z = rp5.a(em2Var.get(qw2Var2.getKey()), qw2Var2);
                        break;
                    }
                    this = (em2) sw2Var3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // sw2
    public final Object fold(Object obj, eq4 eq4Var) {
        return eq4Var.invoke(this.a.fold(obj, eq4Var), this.b);
    }

    @Override // sw2
    public final qw2 get(rw2 rw2Var) {
        rw2Var.getClass();
        while (true) {
            qw2 qw2Var = this.b.get(rw2Var);
            if (qw2Var != null) {
                return qw2Var;
            }
            sw2 sw2Var = this.a;
            if (!(sw2Var instanceof em2)) {
                return sw2Var.get(rw2Var);
            }
            this = (em2) sw2Var;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // sw2
    public final sw2 minusKey(rw2 rw2Var) {
        rw2Var.getClass();
        qw2 qw2Var = this.b;
        qw2 qw2Var2 = qw2Var.get(rw2Var);
        sw2 sw2Var = this.a;
        if (qw2Var2 != null) {
            return sw2Var;
        }
        sw2 minusKey = sw2Var.minusKey(rw2Var);
        return minusKey == sw2Var ? this : minusKey == z14.a ? qw2Var : new em2(qw2Var, minusKey);
    }

    @Override // sw2
    public final sw2 plus(sw2 sw2Var) {
        sw2Var.getClass();
        return sw2Var == z14.a ? this : (sw2) sw2Var.fold(this, new dm2((byte) 1));
    }

    public final String toString() {
        return "[" + ((String) fold("", new dm2((byte) 0))) + ']';
    }
}
