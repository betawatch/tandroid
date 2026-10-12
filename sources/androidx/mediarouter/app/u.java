package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class u extends androidx.fragment.app.o {
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

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void I() {
        super.I();
        g.t tVar = this.B0;
        if (tVar == null || this.A0) {
            return;
        }
        ((t) tVar).i(false);
    }

    @Override // androidx.fragment.app.o
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

    @Override // androidx.fragment.app.r, android.content.ComponentCallbacks
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
