package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class i extends androidx.fragment.app.p {
    public boolean A0 = false;
    public g.t B0;
    public p4.r C0;

    public i() {
        this.q0 = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.A0) {
            d0 d0Var = new d0(n());
            this.B0 = d0Var;
            P();
            d0Var.f(this.C0);
        } else {
            h hVar = new h(n());
            this.B0 = hVar;
            P();
            hVar.h(this.C0);
        }
        return this.B0;
    }

    public final void P() {
        if (this.C0 == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                this.C0 = p4.r.b(bundle.getBundle("selector"));
            }
            if (this.C0 == null) {
                this.C0 = p4.r.c;
            }
        }
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.U = true;
        g.t tVar = this.B0;
        if (tVar == null) {
            return;
        }
        if (!this.A0) {
            h hVar = (h) tVar;
            hVar.getWindow().setLayout(v7.z.a(hVar.getContext()), -2);
        } else {
            d0 d0Var = (d0) tVar;
            Context context = d0Var.n;
            d0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : v7.z.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}
