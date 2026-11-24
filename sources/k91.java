// default package

import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class k91 {
    public Serializable a;
    public m91 b;
    public ea9 c;
    public boolean d;

    public final void a() {
        this.d = true;
        m91 m91Var = this.b;
        if (m91Var == null || !m91Var.b.k(null)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        ea9 ea9Var;
        m91 m91Var = this.b;
        if (m91Var != null) {
            l91 l91Var = m91Var.b;
            if (!l91Var.isDone()) {
                l91Var.l(new i2("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
            }
        }
        if (this.d || (ea9Var = this.c) == null) {
            return;
        }
        ea9Var.k(null);
    }
}
