package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public class h extends androidx.fragment.app.p {
    public boolean A0 = false;
    public g.t B0;
    public p4.r C0;

    public h() {
        this.q0 = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.A0) {
            c0 c0Var = new c0(n());
            this.B0 = c0Var;
            P();
            c0Var.f(this.C0);
        } else {
            g gVar = new g(n());
            this.B0 = gVar;
            P();
            gVar.h(this.C0);
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
            g gVar = (g) tVar;
            gVar.getWindow().setLayout(v7.z.a(gVar.getContext()), -2);
        } else {
            c0 c0Var = (c0) tVar;
            Context context = c0Var.n;
            c0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : v7.z.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}
