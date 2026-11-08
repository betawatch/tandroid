package androidx.mediarouter.app;

import a8.a7;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class h extends androidx.fragment.app.o {
    public boolean A0 = false;
    public g.u B0;
    public s4.r C0;

    public h() {
        this.q0 = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.o
    public final Dialog O() {
        if (this.A0) {
            b0 b0Var = new b0(n());
            this.B0 = b0Var;
            P();
            b0Var.f(this.C0);
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
                this.C0 = s4.r.b(bundle.getBundle("selector"));
            }
            if (this.C0 == null) {
                this.C0 = s4.r.c;
            }
        }
    }

    @Override // androidx.fragment.app.r, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.U = true;
        g.u uVar = this.B0;
        if (uVar == null) {
            return;
        }
        if (!this.A0) {
            g gVar = (g) uVar;
            gVar.getWindow().setLayout(a7.a(gVar.getContext()), -2);
        } else {
            b0 b0Var = (b0) uVar;
            Context context = b0Var.n;
            b0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : a7.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}
