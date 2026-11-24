// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k09 extends ja {
    public final h19 c;

    public k09(int i, h19 h19Var) {
        super(i, false);
        this.c = h19Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k09.class == obj.getClass()) {
            k09 k09Var = (k09) obj;
            int i = this.a;
            int i2 = k09Var.a;
            if (i == i2 && (i == 0 || i == 3)) {
                h19 h19Var = this.c;
                return h19Var != null && h19Var.equals(k09Var.c);
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
