package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class v extends androidx.fragment.app.o {
    public boolean A0 = false;
    public g.u B0;
    public p4.r C0;

    public v() {
        this.q0 = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void I() {
        super.I();
        g.u uVar = this.B0;
        if (uVar == null || this.A0) {
            return;
        }
        ((u) uVar).i(false);
    }

    @Override // androidx.fragment.app.o
    public final Dialog O() {
        if (this.A0) {
            o0 o0Var = new o0(n());
            this.B0 = o0Var;
            o0Var.i(this.C0);
        } else {
            this.B0 = new u(n());
        }
        return this.B0;
    }

    @Override // androidx.fragment.app.r, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.U = true;
        g.u uVar = this.B0;
        if (uVar != null) {
            if (this.A0) {
                ((o0) uVar).j();
            } else {
                ((u) uVar).s();
            }
        }
    }
}
