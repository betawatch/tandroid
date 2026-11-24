// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h71 extends ja {
    public l61 c;
    public u61 d;

    public final boolean equals(Object obj) {
        u61 u61Var;
        u61 u61Var2;
        l61 l61Var;
        l61 l61Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && h71.class == obj.getClass()) {
            h71 h71Var = (h71) obj;
            int i = this.a;
            if (i == h71Var.a) {
                if (i == 1 && (l61Var = this.c) != null && (l61Var2 = h71Var.c) != null) {
                    return l61Var.a == l61Var2.a;
                }
                if (i == 2 && (u61Var = this.d) != null && (u61Var2 = h71Var.d) != null) {
                    return Objects.equals(u61Var.a, u61Var2.a);
                }
            }
        }
        return false;
    }
}
