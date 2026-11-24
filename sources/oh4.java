// default package

import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class oh4 {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;

    public final void a(nv5 nv5Var, boolean z) {
        tp5 tp5Var = (tp5) this.d;
        if (((nv5) this.c) != nv5Var) {
            gl.r(tp5Var);
            this.c = nv5Var;
            if (z) {
                ((dyc) this.b).a(nv5Var);
            }
            if (nv5Var == nv5.b || nv5Var == nv5.c) {
                gl.e3(tp5Var, this.a);
            }
        }
    }
}
