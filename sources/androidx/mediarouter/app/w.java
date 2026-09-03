package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class w extends androidx.fragment.app.p {
    public boolean x0 = false;
    public g.s y0;
    public c2.v z0;

    public w() {
        this.n0 = true;
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.s
    public final void I() {
        super.I();
        g.s sVar = this.y0;
        if (sVar == null || this.x0) {
            return;
        }
        ((v) sVar).i(false);
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.x0) {
            p0 p0Var = new p0(n());
            this.y0 = p0Var;
            p0Var.i(this.z0);
        } else {
            this.y0 = new v(n());
        }
        return this.y0;
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.R = true;
        g.s sVar = this.y0;
        if (sVar != null) {
            if (this.x0) {
                ((p0) sVar).j();
            } else {
                ((v) sVar).s();
            }
        }
    }
}
