package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class u extends androidx.fragment.app.p {
    public boolean B0 = false;
    public g.u C0;
    public r4.r D0;

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
            o0 o0Var = new o0(n());
            this.C0 = o0Var;
            o0Var.i(this.D0);
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
                ((o0) uVar).j();
            } else {
                ((t) uVar).s();
            }
        }
    }
}
