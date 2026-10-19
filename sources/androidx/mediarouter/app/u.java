package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class u extends androidx.fragment.app.p {
    public boolean A0 = false;
    public g.t B0;
    public p4.r C0;

    public u() {
        this.q0 = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.s
    public final void I() {
        super.I();
        g.t tVar = this.B0;
        if (tVar == null || this.A0) {
            return;
        }
        ((t) tVar).i(false);
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.A0) {
            n0 n0Var = new n0(n());
            this.B0 = n0Var;
            n0Var.i(this.C0);
        } else {
            this.B0 = new t(n());
        }
        return this.B0;
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.U = true;
        g.t tVar = this.B0;
        if (tVar != null) {
            if (this.A0) {
                ((n0) tVar).j();
            } else {
                ((t) tVar).s();
            }
        }
    }
}
