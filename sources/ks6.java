// default package

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ks6 extends ze3 {
    public boolean B0 = false;
    public dp C0;
    public yt6 D0;

    public ks6() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // ze3
    public final Dialog P() {
        if (this.B0) {
            gt6 gt6Var = new gt6(n());
            this.C0 = gt6Var;
            Q();
            gt6Var.f(this.D0);
        } else {
            js6 js6Var = new js6(n());
            this.C0 = js6Var;
            Q();
            js6Var.h(this.D0);
        }
        return this.C0;
    }

    public final void Q() {
        yt6 yt6Var = this.D0;
        if (yt6Var == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                yt6Var = yt6.b(bundle.getBundle("selector"));
                this.D0 = yt6Var;
            }
            if (yt6Var == null) {
                this.D0 = yt6.c;
            }
        }
    }

    @Override // bn4, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.V = true;
        dp dpVar = this.C0;
        if (dpVar == null) {
            return;
        }
        if (!this.B0) {
            js6 js6Var = (js6) dpVar;
            js6Var.getWindow().setLayout(roe.a(js6Var.getContext()), -2);
        } else {
            gt6 gt6Var = (gt6) dpVar;
            Context context = gt6Var.n;
            gt6Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : roe.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}
