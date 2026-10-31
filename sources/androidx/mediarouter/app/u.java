package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class u extends androidx.fragment.app.p {
    public boolean A0 = false;
    public g.t B0;
    public p4.s C0;

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
            o0 o0Var = new o0(n());
            this.B0 = o0Var;
            o0Var.i(this.C0);
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
                ((o0) tVar).j();
            } else {
                ((t) tVar).s();
            }
        }
    }
}
