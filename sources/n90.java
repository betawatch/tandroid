// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n90 {
    public final Integer a;
    public final Object b;
    public final cj8 c;
    public final ha0 d;

    public n90(Integer num, Object obj, cj8 cj8Var, ha0 ha0Var) {
        this.a = num;
        if (obj == null) {
            fvc.f("Null payload");
            throw null;
        }
        this.b = obj;
        this.c = cj8Var;
        this.d = ha0Var;
    }

    public static n90 a(Object obj) {
        return new n90(null, obj, cj8.a, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n90)) {
            return false;
        }
        n90 n90Var = (n90) obj;
        Integer num = n90Var.a;
        Integer num2 = this.a;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.b.equals(n90Var.b) || !this.c.equals(n90Var.c)) {
            return false;
        }
        ha0 ha0Var = n90Var.d;
        ha0 ha0Var2 = this.d;
        return ha0Var2 == null ? ha0Var == null : ha0Var2.equals(ha0Var);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        ha0 ha0Var = this.d;
        return (hashCode ^ (ha0Var != null ? ha0Var.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=null}";
    }
}
