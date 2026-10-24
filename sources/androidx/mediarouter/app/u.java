package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
