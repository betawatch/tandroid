// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ik5 {
    public static final ik5 b;
    public final float a;

    static {
        ti4 ti4Var = new ti4();
        ti4Var.a = 0.5f;
        b = new ik5(ti4Var);
    }

    public ik5(ti4 ti4Var) {
        this.a = ti4Var.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ik5) {
            return ik5.class.equals(ik5.class) && Float.compare(this.a, ((ik5) obj).a) == 0 && cqe.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{ik5.class, Float.valueOf(this.a), null});
    }
}
