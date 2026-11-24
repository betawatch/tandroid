// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class na0 {
    public final Integer a;
    public final Object b;
    public final fl8 c;
    public final hb0 d;

    public na0(Integer num, Object obj, fl8 fl8Var, hb0 hb0Var) {
        this.a = num;
        if (obj == null) {
            gxc.d("Null payload");
            throw null;
        }
        this.b = obj;
        this.c = fl8Var;
        this.d = hb0Var;
    }

    public static na0 a(Object obj) {
        return new na0(null, obj, fl8.a, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        Integer num = na0Var.a;
        Integer num2 = this.a;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.b.equals(na0Var.b) || !this.c.equals(na0Var.c)) {
            return false;
        }
        hb0 hb0Var = na0Var.d;
        hb0 hb0Var2 = this.d;
        return hb0Var2 == null ? hb0Var == null : hb0Var2.equals(hb0Var);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        hb0 hb0Var = this.d;
        return (hashCode ^ (hb0Var != null ? hb0Var.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=null}";
    }
}
