package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class j extends androidx.fragment.app.p {
    public boolean x0 = false;
    public g.s y0;
    public c2.w z0;

    public j() {
        this.n0 = true;
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.x0) {
            e0 e0Var = new e0(n());
            this.y0 = e0Var;
            P();
            e0Var.f(this.z0);
        } else {
            i iVar = new i(n());
            this.y0 = iVar;
            P();
            iVar.h(this.z0);
        }
        return this.y0;
    }

    public final void P() {
        if (this.z0 == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                this.z0 = c2.w.b(bundle.getBundle("selector"));
            }
            if (this.z0 == null) {
                this.z0 = c2.w.c;
            }
        }
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.R = true;
        g.s sVar = this.y0;
        if (sVar == null) {
            return;
        }
        if (!this.x0) {
            i iVar = (i) sVar;
            iVar.getWindow().setLayout(j7.y.a(iVar.getContext()), -2);
        } else {
            e0 e0Var = (e0) sVar;
            Context context = e0Var.n;
            e0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : j7.y.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}
