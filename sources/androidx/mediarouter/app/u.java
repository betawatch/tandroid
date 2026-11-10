package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class u extends androidx.fragment.app.o {
    public boolean A0 = false;
    public g.u B0;
    public s4.r C0;

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
        g.u uVar = this.B0;
        if (uVar == null || this.A0) {
            return;
        }
        ((t) uVar).i(false);
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
        g.u uVar = this.B0;
        if (uVar != null) {
            if (this.A0) {
                ((n0) uVar).j();
            } else {
                ((t) uVar).s();
            }
        }
    }
}
