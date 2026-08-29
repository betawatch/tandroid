package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class t extends androidx.fragment.app.p {
    public boolean w0 = false;
    public g.s x0;
    public c2.w y0;

    public t() {
        this.m0 = true;
        Dialog dialog = this.r0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.s
    public final void I() {
        super.I();
        g.s sVar = this.x0;
        if (sVar == null || this.w0) {
            return;
        }
        ((s) sVar).i(false);
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.w0) {
            m0 m0Var = new m0(n());
            this.x0 = m0Var;
            m0Var.i(this.y0);
        } else {
            this.x0 = new s(n());
        }
        return this.x0;
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
        g.s sVar = this.x0;
        if (sVar != null) {
            if (this.w0) {
                ((m0) sVar).j();
            } else {
                ((s) sVar).s();
            }
        }
    }
}
