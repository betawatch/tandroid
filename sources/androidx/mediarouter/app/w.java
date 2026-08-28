package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class w extends androidx.fragment.app.p {
    public boolean w0 = false;
    public g.s x0;
    public c2.v y0;

    public w() {
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
        ((v) sVar).i(false);
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.w0) {
            p0 p0Var = new p0(n());
            this.x0 = p0Var;
            p0Var.i(this.y0);
        } else {
            this.x0 = new v(n());
        }
        return this.x0;
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
        g.s sVar = this.x0;
        if (sVar != null) {
            if (this.w0) {
                ((p0) sVar).j();
            } else {
                ((v) sVar).s();
            }
        }
    }
}
