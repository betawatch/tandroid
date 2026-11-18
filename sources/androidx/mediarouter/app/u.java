package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class u extends androidx.fragment.app.p {
    public boolean B0 = false;
    public g.u C0;
    public s4.r D0;

    public u() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.s
    public final void I() {
        super.I();
        g.u uVar = this.C0;
        if (uVar == null || this.B0) {
            return;
        }
        ((t) uVar).i(false);
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.B0) {
            n0 n0Var = new n0(n());
            this.C0 = n0Var;
            n0Var.i(this.D0);
        } else {
            this.C0 = new t(n());
        }
        return this.C0;
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.V = true;
        g.u uVar = this.C0;
        if (uVar != null) {
            if (this.B0) {
                ((n0) uVar).j();
            } else {
                ((t) uVar).s();
            }
        }
    }
}
