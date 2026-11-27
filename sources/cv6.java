// default package

import android.app.Dialog;
import android.content.res.Configuration;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class cv6 extends tf3 {
    public boolean B0 = false;
    public ep C0;
    public dw6 D0;

    public cv6() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // tf3, gp4
    public final void I() {
        super.I();
        ep epVar = this.C0;
        if (epVar == null || this.B0) {
            return;
        }
        ((bv6) epVar).i(false);
    }

    @Override // tf3
    public final Dialog P() {
        if (this.B0) {
            wv6 wv6Var = new wv6(n());
            this.C0 = wv6Var;
            wv6Var.i(this.D0);
        } else {
            this.C0 = new bv6(n());
        }
        return this.C0;
    }

    @Override // gp4, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.V = true;
        ep epVar = this.C0;
        if (epVar != null) {
            if (this.B0) {
                ((wv6) epVar).j();
            } else {
                ((bv6) epVar).s();
            }
        }
    }
}
