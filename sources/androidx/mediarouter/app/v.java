package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class v extends androidx.fragment.app.p {
    public boolean w0 = false;
    public g.t x0;
    public c2.u y0;

    public v() {
        this.m0 = true;
        Dialog dialog = this.r0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.s
    public final void I() {
        super.I();
        g.t tVar = this.x0;
        if (tVar == null || this.w0) {
            return;
        }
        ((u) tVar).i(false);
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.w0) {
            p0 p0Var = new p0(n());
            this.x0 = p0Var;
            p0Var.i(this.y0);
        } else {
            this.x0 = new u(n());
        }
        return this.x0;
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
        g.t tVar = this.x0;
        if (tVar != null) {
            if (this.w0) {
                ((p0) tVar).j();
            } else {
                ((u) tVar).s();
            }
        }
    }
}
